package omi.iex.iexequities.deep.iextp.v1_08.dispatch;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import omi.iex.iexequities.deep.iextp.v1_08.types.Message;
import org.junit.jupiter.api.Test;

// Each case walks every datagram of one capture, requires the walk to reach the datagram's
// end, every message to re-encode to its own bytes, and the named message to appear.
// Captures are read from OMI_PACKETS_DIR; without it the cases are skipped.
class PacketDecoderTest {

    @Test
    void auctionInformationMessage() throws IOException {
        check("AuctionInformationMessage", "Iex/IexEquities.Deep.IexTp.v1.08/AuctionInformationMessage.pcap");
    }

    @Test
    void operationalHaltStatusMessage() throws IOException {
        check("OperationalHaltStatusMessage", "Iex/IexEquities.Deep.IexTp.v1.08/OperationalHaltStatusMessage.pcap");
    }

    @Test
    void priceLevelBuyUpdateMessage() throws IOException {
        check("PriceLevelBuyUpdateMessage", "Iex/IexEquities.Deep.IexTp.v1.08/PriceLevelBuyUpdateMessage.pcap");
    }

    @Test
    void priceLevelSellUpdateMessage() throws IOException {
        check("PriceLevelSellUpdateMessage", "Iex/IexEquities.Deep.IexTp.v1.08/PriceLevelSellUpdateMessage.pcap");
    }

    @Test
    void retailLiquidityIndicatorMessage() throws IOException {
        check("RetailLiquidityIndicatorMessage", "Iex/IexEquities.Deep.IexTp.v1.08/RetailLiquidityIndicatorMessage.pcap");
    }

    @Test
    void securityEventMessage() throws IOException {
        check("SecurityEventMessage", "Iex/IexEquities.Deep.IexTp.v1.08/SecurityEventMessage.pcap");
    }

    @Test
    void shortSalePriceTestStatusMessage() throws IOException {
        check("ShortSalePriceTestStatusMessage", "Iex/IexEquities.Deep.IexTp.v1.08/ShortSalePriceTestStatusMessage.pcap");
    }

    @Test
    void systemEventMessage() throws IOException {
        check("SystemEventMessage", "Iex/IexEquities.Deep.IexTp.v1.08/SystemEventMessage.pcap");
    }

    @Test
    void tradeReportMessage() throws IOException {
        check("TradeReportMessage", "Iex/IexEquities.Deep.IexTp.v1.08/TradeReportMessage.pcap");
    }

    @Test
    void tradingStatusMessage() throws IOException {
        check("TradingStatusMessage", "Iex/IexEquities.Deep.IexTp.v1.08/TradingStatusMessage.pcap");
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
