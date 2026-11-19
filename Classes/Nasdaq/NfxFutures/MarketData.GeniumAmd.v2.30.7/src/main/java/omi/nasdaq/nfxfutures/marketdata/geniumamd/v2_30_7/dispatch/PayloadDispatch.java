package omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.dispatch;

import java.util.Optional;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.messages.application.BrokenTradeMessage;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.messages.application.CombinationOrderBookLeg;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.messages.application.OpenInterestMessage;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.messages.application.OrderBookDirectory;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.messages.application.OrderBookStateMessage;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.messages.application.PriceMessage;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.messages.application.ReportedTrade;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.messages.application.SecondsMessage;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.messages.application.SystemEventMessage;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.messages.application.TickSizeTableEntry;
import omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.types.Message;

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
        } else if (messageType == 'M') {
            message = new CombinationOrderBookLeg();
        } else if (messageType == 'L') {
            message = new TickSizeTableEntry();
        } else if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'O') {
            message = new OrderBookStateMessage();
        } else if (messageType == 'r') {
            message = new ReportedTrade();
        } else if (messageType == 'B') {
            message = new BrokenTradeMessage();
        } else if (messageType == 'o') {
            message = new OpenInterestMessage();
        } else if (messageType == 'p') {
            message = new PriceMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
