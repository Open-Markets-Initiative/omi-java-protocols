package omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.dispatch;

import java.util.Optional;
import omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.messages.application.BestQuoteUpdateMessage;
import omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.messages.application.CboeMarketStatusMessage;
import omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.messages.application.LongSymbolSummaryMessage;
import omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.messages.application.ShortSymbolSummaryMessage;
import omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.messages.application.TradeBreakMessage;
import omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.messages.application.TradeMessage;
import omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.messages.application.TradingStatusMessage;
import omi.cboe.titaniumconsolidated.oneoptions.pitch.v1_1_19.types.Message;

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
    public static Optional<Message> decode(long messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 164L) {
            message = new ShortSymbolSummaryMessage();
        } else if (messageType == 163L) {
            message = new LongSymbolSummaryMessage();
        } else if (messageType == 165L) {
            message = new BestQuoteUpdateMessage();
        } else if (messageType == 166L) {
            message = new CboeMarketStatusMessage();
        } else if (messageType == 169L) {
            message = new TradeMessage();
        } else if (messageType == 170L) {
            message = new TradeBreakMessage();
        } else if (messageType == 171L) {
            message = new TradingStatusMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
