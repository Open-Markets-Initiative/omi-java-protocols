package omi.nasdaq.psxequities.totalview.itch.v5_0.dispatch;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import omi.nasdaq.psxequities.totalview.itch.v5_0.types.Message;
import org.junit.jupiter.api.Test;

// Each case walks every datagram of one capture, requires the walk to reach the datagram's
// end, every message to re-encode to its own bytes, and the named message to appear.
// Captures are read from OMI_PACKETS_DIR; without it the cases are skipped.
class PacketDecoderTest {

    @Test
    void addOrderNoMpidAttributionMessage() throws IOException {
        check("AddOrderNoMpidAttributionMessage", "Nasdaq/PsxEquities.TotalView.Itch.v5.0/AddOrderNoMpidAttributionMessage.pcap");
    }

    @Test
    void addOrderWithMpidAttributionMessage() throws IOException {
        check("AddOrderWithMpidAttributionMessage", "Nasdaq/PsxEquities.TotalView.Itch.v5.0/AddOrderWithMpidAttributionMessage.pcap");
    }

    @Test
    void orderCancelMessage() throws IOException {
        check("OrderCancelMessage", "Nasdaq/PsxEquities.TotalView.Itch.v5.0/OrderCancelMessage.pcap");
    }

    @Test
    void orderDeleteMessage() throws IOException {
        check("OrderDeleteMessage", "Nasdaq/PsxEquities.TotalView.Itch.v5.0/OrderDeleteMessage.pcap");
    }

    @Test
    void orderExecutedMessage() throws IOException {
        check("OrderExecutedMessage", "Nasdaq/PsxEquities.TotalView.Itch.v5.0/OrderExecutedMessage.pcap");
    }

    @Test
    void orderExecutedWithPriceMessage() throws IOException {
        check("OrderExecutedWithPriceMessage", "Nasdaq/PsxEquities.TotalView.Itch.v5.0/OrderExecutedWithPriceMessage.pcap");
    }

    @Test
    void orderReplaceMessage() throws IOException {
        check("OrderReplaceMessage", "Nasdaq/PsxEquities.TotalView.Itch.v5.0/OrderReplaceMessage.pcap");
    }

    @Test
    void regShoShortSalePriceTestRestrictedIndicatorMessage() throws IOException {
        check("RegShoShortSalePriceTestRestrictedIndicatorMessage", "Nasdaq/PsxEquities.TotalView.Itch.v5.0/RegShoShortSalePriceTestRestrictedIndicatorMessage.pcap");
    }

    @Test
    void stockTradingActionMessage() throws IOException {
        check("StockTradingActionMessage", "Nasdaq/PsxEquities.TotalView.Itch.v5.0/StockTradingActionMessage.pcap");
    }

    @Test
    void systemEventMessage() throws IOException {
        check("SystemEventMessage", "Nasdaq/PsxEquities.TotalView.Itch.v5.0/SystemEventMessage.pcap");
    }

    @Test
    void tradeMessageNonCross() throws IOException {
        check("TradeMessageNonCross", "Nasdaq/PsxEquities.TotalView.Itch.v5.0/TradeMessageNonCross.pcap");
    }

    private static void check(String expected, String capture) throws IOException {
        String packets = System.getenv("OMI_PACKETS_DIR");
        assumeTrue(packets != null && !packets.isEmpty(), "OMI_PACKETS_DIR is not set");

        List<byte[]> datagrams = Pcap.udpPayloads(Path.of(packets, capture));
        assertFalse(datagrams.isEmpty(), capture + " holds no UDP datagrams");

        int found = 0;
        for (int index = 0; index < datagrams.size(); index++) {
            byte[] datagram = datagrams.get(index);
            PacketDecoder.Decoded decoded = PacketDecoder.decode(datagram, 0, datagram.length);
            assertTrue(decoded.complete(), "datagram " + index + " was not walked to its end");

            for (Message message : decoded.messages()) {
                String name = message.getClass().getSimpleName();
                assertArrayEquals(message.raw().orElseThrow(), message.toBytes(), name + " in datagram " + index + " does not re-encode to its own bytes");
                if (name.equals(expected)) {
                    found++;
                }
            }
        }

        assertTrue(found > 0, expected + " does not appear in " + capture);
    }
}
