package omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.AddOrderMessageLongForm;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.AddOrderMessageShortForm;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.AddQuoteMessageLongForm;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.AddQuoteMessageShortForm;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.BaseReferenceMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.BlockDeleteMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.BrokenTradeOrOrderExecutionMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.NetOrderImbalanceIndicatorMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.NonAuctionOptionsTradeMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.OptionDirectoryMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.OptionOpenMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.OptionsCrossTradeMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.OrderCancelMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.QuoteDeleteMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.QuoteReplaceMessageLongForm;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.QuoteReplaceMessageShortForm;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.SecondsMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.SingleSideDeleteMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.SingleSideExecutedMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.SingleSideOrderExecutedWithPriceMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.SingleSideReplaceMessageLongForm;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.SingleSideReplaceMessageShortForm;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.SingleSideUpdateMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.SystemEventMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.messages.application.TradingActionMessage;
import omi.nasdaq.ntxoptions.depthofmarket.itch.v1_3.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(AddOrderMessageLongForm::new);
        check(AddOrderMessageShortForm::new);
        check(AddQuoteMessageLongForm::new);
        check(AddQuoteMessageShortForm::new);
        check(BaseReferenceMessage::new);
        check(BlockDeleteMessage::new);
        check(BrokenTradeOrOrderExecutionMessage::new);
        check(NetOrderImbalanceIndicatorMessage::new);
        check(NonAuctionOptionsTradeMessage::new);
        check(OptionDirectoryMessage::new);
        check(OptionOpenMessage::new);
        check(OptionsCrossTradeMessage::new);
        check(OrderCancelMessage::new);
        check(QuoteDeleteMessage::new);
        check(QuoteReplaceMessageLongForm::new);
        check(QuoteReplaceMessageShortForm::new);
        check(SecondsMessage::new);
        check(SingleSideDeleteMessage::new);
        check(SingleSideExecutedMessage::new);
        check(SingleSideOrderExecutedWithPriceMessage::new);
        check(SingleSideReplaceMessageLongForm::new);
        check(SingleSideReplaceMessageShortForm::new);
        check(SingleSideUpdateMessage::new);
        check(SystemEventMessage::new);
        check(TradingActionMessage::new);

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
