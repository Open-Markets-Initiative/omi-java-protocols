package omi.iex.iexequities.deepplus.iextp.v1_05.dispatch;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import omi.iex.iexequities.deepplus.iextp.v1_05.types.Message;
import org.junit.jupiter.api.Test;

// Each case walks every datagram of one capture, requires the walk to reach the datagram's
// end, every message to re-encode to its own bytes, and the named message to appear.
// Captures are read from OMI_PACKETS_DIR; without it the cases are skipped.
class PacketDecoderTest {

    @Test
    void addOrderMessage() throws IOException {
        check("AddOrderMessage", "Iex/IexEquities.DeepPlus.IexTp.v1.05/AddOrderMessage.pcap");
    }

    @Test
    void operationalHaltStatusMessage() throws IOException {
        check("OperationalHaltStatusMessage", "Iex/IexEquities.DeepPlus.IexTp.v1.05/OperationalHaltStatusMessage.pcap");
    }

    @Test
    void orderDeleteMessage() throws IOException {
        check("OrderDeleteMessage", "Iex/IexEquities.DeepPlus.IexTp.v1.05/OrderDeleteMessage.pcap");
    }

    @Test
    void orderExecutedMessage() throws IOException {
        check("OrderExecutedMessage", "Iex/IexEquities.DeepPlus.IexTp.v1.05/OrderExecutedMessage.pcap");
    }

    @Test
    void orderModifyMessage() throws IOException {
        check("OrderModifyMessage", "Iex/IexEquities.DeepPlus.IexTp.v1.05/OrderModifyMessage.pcap");
    }

    @Test
    void retailLiquidityIndicatorMessage() throws IOException {
        check("RetailLiquidityIndicatorMessage", "Iex/IexEquities.DeepPlus.IexTp.v1.05/RetailLiquidityIndicatorMessage.pcap");
    }

    @Test
    void securityEventMessage() throws IOException {
        check("SecurityEventMessage", "Iex/IexEquities.DeepPlus.IexTp.v1.05/SecurityEventMessage.pcap");
    }

    @Test
    void shortSalePriceTestStatusMessage() throws IOException {
        check("ShortSalePriceTestStatusMessage", "Iex/IexEquities.DeepPlus.IexTp.v1.05/ShortSalePriceTestStatusMessage.pcap");
    }

    @Test
    void systemEventMessage() throws IOException {
        check("SystemEventMessage", "Iex/IexEquities.DeepPlus.IexTp.v1.05/SystemEventMessage.pcap");
    }

    @Test
    void tradeMessage() throws IOException {
        check("TradeMessage", "Iex/IexEquities.DeepPlus.IexTp.v1.05/TradeMessage.pcap");
    }

    @Test
    void tradingStatusMessage() throws IOException {
        check("TradingStatusMessage", "Iex/IexEquities.DeepPlus.IexTp.v1.05/TradingStatusMessage.pcap");
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
