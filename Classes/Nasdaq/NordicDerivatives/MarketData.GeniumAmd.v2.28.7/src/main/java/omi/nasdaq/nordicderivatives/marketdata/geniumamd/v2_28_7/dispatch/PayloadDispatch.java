package omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.dispatch;

import java.util.Optional;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.messages.application.BrokenTradeMessage;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.messages.application.CombinationOrderBookLegDirectory;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.messages.application.MarketByLevelMessage;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.messages.application.MarketDirectory;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.messages.application.OpenInterestMesssage;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.messages.application.OrderBookDirectory;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.messages.application.PriceMessage;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.messages.application.QuoteRequestMessage;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.messages.application.ReportedTrade;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.messages.application.SecondsMessage;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.messages.application.SystemEventMessage;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.messages.application.TickSizeTableEntry;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.messages.application.UnderlyingPriceMessage;
import omi.nasdaq.nordicderivatives.marketdata.geniumamd.v2_28_7.types.Message;

/**
 * Selects the message a Payload branch holds by its Message Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Message Type selects.
     *
     * @param messageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 'T') {
            message = new SecondsMessage();
        } else if (messageType == 'R') {
            message = new OrderBookDirectory();
        } else if (messageType == 'V') {
            message = new MarketDirectory();
        } else if (messageType == 'M') {
            message = new CombinationOrderBookLegDirectory();
        } else if (messageType == 'L') {
            message = new TickSizeTableEntry();
        } else if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'r') {
            message = new ReportedTrade();
        } else if (messageType == 'B') {
            message = new BrokenTradeMessage();
        } else if (messageType == 'q') {
            message = new QuoteRequestMessage();
        } else if (messageType == 'o') {
            message = new OpenInterestMesssage();
        } else if (messageType == 'p') {
            message = new PriceMessage();
        } else if (messageType == 'W') {
            message = new MarketByLevelMessage();
        } else if (messageType == 'U') {
            message = new UnderlyingPriceMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
