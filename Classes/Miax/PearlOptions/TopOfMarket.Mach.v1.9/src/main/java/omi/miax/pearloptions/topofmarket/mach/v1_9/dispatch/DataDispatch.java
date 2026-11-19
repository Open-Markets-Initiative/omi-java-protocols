package omi.miax.pearloptions.topofmarket.mach.v1_9.dispatch;

import java.util.Optional;
import omi.miax.pearloptions.topofmarket.mach.v1_9.messages.application.DoubleSidedTopOfMarketCompactMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_9.messages.application.SeriesUpdate;
import omi.miax.pearloptions.topofmarket.mach.v1_9.messages.application.SystemStateMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_9.messages.application.SystemTimeMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_9.messages.application.TopOfMarketBidCompactMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_9.messages.application.TopOfMarketOfferCompactMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_9.messages.application.TradeCancelMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_9.messages.application.TradeMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_9.messages.application.UnderlyingTradingStatusMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_9.messages.application.WideDoubleSidedTopOfMarketMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_9.messages.application.WideTopOfMarketBidMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_9.messages.application.WideTopOfMarketOfferMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_9.types.Message;

/**
 * Selects the message a Data branch holds by its Message Type.
 */
public final class DataDispatch {

    private DataDispatch() {
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
        if (messageType == '1') {
            message = new SystemTimeMessage();
        } else if (messageType == 'P') {
            message = new SeriesUpdate();
        } else if (messageType == 'S') {
            message = new SystemStateMessage();
        } else if (messageType == 'B') {
            message = new TopOfMarketBidCompactMessage();
        } else if (messageType == 'O') {
            message = new TopOfMarketOfferCompactMessage();
        } else if (messageType == 'W') {
            message = new WideTopOfMarketBidMessage();
        } else if (messageType == 'A') {
            message = new WideTopOfMarketOfferMessage();
        } else if (messageType == 'd') {
            message = new DoubleSidedTopOfMarketCompactMessage();
        } else if (messageType == 'D') {
            message = new WideDoubleSidedTopOfMarketMessage();
        } else if (messageType == 'T') {
            message = new TradeMessage();
        } else if (messageType == 'X') {
            message = new TradeCancelMessage();
        } else if (messageType == 'H') {
            message = new UnderlyingTradingStatusMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
