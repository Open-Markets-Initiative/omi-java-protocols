package omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.AddOrderLongMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.AddOrderShortMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.AddQuoteLongMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.AddQuoteShortMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.AuctionNotificationMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.BaseReferenceMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.BlockDeleteMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.BrokenTradeOrderExecutedMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.NonAuctionOptionsTradeMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.OptionDirectoryMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.OptionsCrossTradeMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.OrderReplaceLongMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.OrderReplaceShortMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.QuoteDeleteMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.QuoteReplaceLongMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.QuoteReplaceShortMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.SecondsMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.SecurityOpenMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.SingleSideCancelMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.SingleSideDeleteMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.SingleSideExecutedMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.SingleSideExecutedWithPriceMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.SingleSideReplaceLongMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.SingleSideReplaceShortMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.SingleSideUpdateMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.SystemEventMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.messages.application.TradingActionMessage;
import omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(AddOrderLongMessage::new);
        check(AddOrderShortMessage::new);
        check(AddQuoteLongMessage::new);
        check(AddQuoteShortMessage::new);
        check(AuctionNotificationMessage::new);
        check(BaseReferenceMessage::new);
        check(BlockDeleteMessage::new);
        check(BrokenTradeOrderExecutedMessage::new);
        check(NonAuctionOptionsTradeMessage::new);
        check(OptionDirectoryMessage::new);
        check(OptionsCrossTradeMessage::new);
        check(OrderReplaceLongMessage::new);
        check(OrderReplaceShortMessage::new);
        check(QuoteDeleteMessage::new);
        check(QuoteReplaceLongMessage::new);
        check(QuoteReplaceShortMessage::new);
        check(SecondsMessage::new);
        check(SecurityOpenMessage::new);
        check(SingleSideCancelMessage::new);
        check(SingleSideDeleteMessage::new);
        check(SingleSideExecutedMessage::new);
        check(SingleSideExecutedWithPriceMessage::new);
        check(SingleSideReplaceLongMessage::new);
        check(SingleSideReplaceShortMessage::new);
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
