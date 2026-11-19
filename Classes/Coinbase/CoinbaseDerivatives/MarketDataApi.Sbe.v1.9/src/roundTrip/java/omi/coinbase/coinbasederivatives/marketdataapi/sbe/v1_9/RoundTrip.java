package omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.EndOfCycleMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.EndOfSnapshotMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.FundingRateMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.ImpliedOrderUpdateMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.MarketStatMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.OpenInterestMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.OptionInstrumentDefinitionMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.OrderDeleteMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.OrderPutMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.OrderSnapshotMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.OutrightInstrumentDefinitionMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.RetransmitRejectMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.RetransmitRequestMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.SpreadInstrumentDefinitionMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.SpreadTradeAmendMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.StartOfOptionInstrumentSnapshotMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.StartOfOutrightInstrumentSnapshotMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.StartOfSpreadInstrumentSnapshotMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.TradeAmendMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.TradeBustMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.TradeMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.TradeSessionVolumeMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.TradeSummaryMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.messages.application.TradingStatusUpdateMessage;
import omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_9.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(EndOfCycleMessage::new);
        check(EndOfSnapshotMessage::new);
        check(FundingRateMessage::new);
        check(ImpliedOrderUpdateMessage::new);
        check(MarketStatMessage::new);
        check(OpenInterestMessage::new);
        check(OptionInstrumentDefinitionMessage::new);
        check(OrderDeleteMessage::new);
        check(OrderPutMessage::new);
        check(OrderSnapshotMessage::new);
        check(OutrightInstrumentDefinitionMessage::new);
        check(RetransmitRejectMessage::new);
        check(RetransmitRequestMessage::new);
        check(SpreadInstrumentDefinitionMessage::new);
        check(SpreadTradeAmendMessage::new);
        check(StartOfOptionInstrumentSnapshotMessage::new);
        check(StartOfOutrightInstrumentSnapshotMessage::new);
        check(StartOfSpreadInstrumentSnapshotMessage::new);
        check(TradeAmendMessage::new);
        check(TradeBustMessage::new);
        check(TradeMessage::new);
        check(TradeSessionVolumeMessage::new);
        check(TradeSummaryMessage::new);
        check(TradingStatusUpdateMessage::new);

        if (failures > 0) {
            System.out.println(failures + " FAILED");
            System.exit(1);
        }
        System.out.println("PASS");
    }

    private static void check(Supplier<Message> create) {
        Message message = create.get();
        String name = message.getClass().getSimpleName();
        int length = message.byteLength();
        Random random = new Random(name.hashCode());
        int offset = 1 + random.nextInt(7);
        byte[] wire = new byte[offset + length + 3];
        random.nextBytes(wire);
        byte[] bytes = Arrays.copyOfRange(wire, offset, offset + length);

        expect(name + " decodes", message.parseFrom(wire, offset) && message.isDecoded());
        expect(name + " keeps its bytes", message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));
        expect(name + " encodes to its bytes", Arrays.equals(message.toBytes(), bytes));
        Arrays.fill(wire, (byte) 0x5A);
        expect(name + " keeps its bytes when the buffer is reused", Arrays.equals(message.toBytes(), bytes) && message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));

        Message again = create.get();
        again.parseFrom(bytes, 0);
        expect(name + " equals a second decode", message.equals(again) && message.hashCode() == again.hashCode());

        message.clear();
        expect(name + " clears", !message.isDecoded() && message.raw().isEmpty());
        expect(name + " refuses a short buffer", length == 0 || !message.parseFrom(bytes, 1));
    }

    private static void expect(String check, boolean passed) {
        if (!passed) {
            failures++;
            System.out.println("FAIL " + check);
        }
    }
}
