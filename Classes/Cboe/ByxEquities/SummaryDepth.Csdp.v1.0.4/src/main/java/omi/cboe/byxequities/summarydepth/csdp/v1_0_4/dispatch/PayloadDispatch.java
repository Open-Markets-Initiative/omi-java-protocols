package omi.cboe.byxequities.summarydepth.csdp.v1_0_4.dispatch;

import java.util.Optional;
import omi.cboe.byxequities.summarydepth.csdp.v1_0_4.messages.application.AdapMessage;
import omi.cboe.byxequities.summarydepth.csdp.v1_0_4.messages.application.CboeMarketStatusMessage;
import omi.cboe.byxequities.summarydepth.csdp.v1_0_4.messages.application.ClearQuoteMessage;
import omi.cboe.byxequities.summarydepth.csdp.v1_0_4.messages.application.RpiMessage;
import omi.cboe.byxequities.summarydepth.csdp.v1_0_4.messages.application.TradeBreakMessage;
import omi.cboe.byxequities.summarydepth.csdp.v1_0_4.messages.application.TradeMessage;
import omi.cboe.byxequities.summarydepth.csdp.v1_0_4.messages.application.TradingStatusMessage;
import omi.cboe.byxequities.summarydepth.csdp.v1_0_4.types.Message;

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
        if (messageType == 162L) {
            message = new ClearQuoteMessage();
        } else if (messageType == 166L) {
            message = new CboeMarketStatusMessage();
        } else if (messageType == 167L) {
            message = new AdapMessage();
        } else if (messageType == 168L) {
            message = new RpiMessage();
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
