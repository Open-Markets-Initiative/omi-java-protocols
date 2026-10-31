package omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.dispatch;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import omi.nasdaq.iseoptions.topcomboquotefeed.itch.v1_0.types.Message;
import org.junit.jupiter.api.Test;

// Each case walks every datagram of one capture, requires the walk to reach the datagram's
// end, every message to re-encode to its own bytes, and the named message to appear.
// Captures are read from OMI_PACKETS_DIR; without it the cases are skipped.
class PacketDecoderTest {

    @Test
    void complexStrategyTickerMessage() throws IOException {
        check("ComplexStrategyTickerMessage", "Nasdaq/IseOptions.TopComboQuoteFeed.Itch.v1.0/ComplexStrategyTickerMessage.pcap");
    }

    @Test
    void strategyBestAskUpdate() throws IOException {
        check("StrategyBestAskUpdate", "Nasdaq/IseOptions.TopComboQuoteFeed.Itch.v1.0/StrategyBestAskUpdate.pcap");
    }

    @Test
    void strategyBestBidAndAskUpdate() throws IOException {
        check("StrategyBestBidAndAskUpdate", "Nasdaq/IseOptions.TopComboQuoteFeed.Itch.v1.0/StrategyBestBidAndAskUpdate.pcap");
    }

    @Test
    void strategyBestBidUpdate() throws IOException {
        check("StrategyBestBidUpdate", "Nasdaq/IseOptions.TopComboQuoteFeed.Itch.v1.0/StrategyBestBidUpdate.pcap");
    }

    @Test
    void strategyOpenClosedMessage() throws IOException {
        check("StrategyOpenClosedMessage", "Nasdaq/IseOptions.TopComboQuoteFeed.Itch.v1.0/StrategyOpenClosedMessage.pcap");
    }

    @Test
    void strategyTradingActionMessage() throws IOException {
        check("StrategyTradingActionMessage", "Nasdaq/IseOptions.TopComboQuoteFeed.Itch.v1.0/StrategyTradingActionMessage.pcap");
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
