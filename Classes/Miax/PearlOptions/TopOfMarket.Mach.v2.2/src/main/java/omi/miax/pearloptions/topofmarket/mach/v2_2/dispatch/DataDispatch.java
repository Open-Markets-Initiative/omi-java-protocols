package omi.miax.pearloptions.topofmarket.mach.v2_2.dispatch;

import java.util.Optional;
import omi.miax.pearloptions.topofmarket.mach.v2_2.messages.application.LastSaleMessage;
import omi.miax.pearloptions.topofmarket.mach.v2_2.messages.application.SimpleDoubleSidedTopOfMarketCompactMessage;
import omi.miax.pearloptions.topofmarket.mach.v2_2.messages.application.SimpleDoubleSidedTopOfMarketWideMessage;
import omi.miax.pearloptions.topofmarket.mach.v2_2.messages.application.SimpleSeriesUpdateMessage;
import omi.miax.pearloptions.topofmarket.mach.v2_2.messages.application.SimpleTopOfMarketBidCompactMessage;
import omi.miax.pearloptions.topofmarket.mach.v2_2.messages.application.SimpleTopOfMarketBidWideMessage;
import omi.miax.pearloptions.topofmarket.mach.v2_2.messages.application.SimpleTopOfMarketOfferCompactMessage;
import omi.miax.pearloptions.topofmarket.mach.v2_2.messages.application.SimpleTopOfMarketOfferWideMessage;
import omi.miax.pearloptions.topofmarket.mach.v2_2.messages.application.SystemStateMessage;
import omi.miax.pearloptions.topofmarket.mach.v2_2.messages.application.SystemTimeMessage;
import omi.miax.pearloptions.topofmarket.mach.v2_2.messages.application.TradeCancelMessage;
import omi.miax.pearloptions.topofmarket.mach.v2_2.messages.application.UnderlyingTradingStatusNotificationMessage;
import omi.miax.pearloptions.topofmarket.mach.v2_2.types.Message;

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
            message = new SimpleSeriesUpdateMessage();
        } else if (messageType == 'S') {
            message = new SystemStateMessage();
        } else if (messageType == 'B') {
            message = new SimpleTopOfMarketBidCompactMessage();
        } else if (messageType == 'O') {
            message = new SimpleTopOfMarketOfferCompactMessage();
        } else if (messageType == 'W') {
            message = new SimpleTopOfMarketBidWideMessage();
        } else if (messageType == 'A') {
            message = new SimpleTopOfMarketOfferWideMessage();
        } else if (messageType == 'd') {
            message = new SimpleDoubleSidedTopOfMarketCompactMessage();
        } else if (messageType == 'D') {
            message = new SimpleDoubleSidedTopOfMarketWideMessage();
        } else if (messageType == 'T') {
            message = new LastSaleMessage();
        } else if (messageType == 'X') {
            message = new TradeCancelMessage();
        } else if (messageType == 'H') {
            message = new UnderlyingTradingStatusNotificationMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
