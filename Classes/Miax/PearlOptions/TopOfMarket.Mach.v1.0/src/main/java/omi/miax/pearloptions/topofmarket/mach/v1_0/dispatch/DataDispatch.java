package omi.miax.pearloptions.topofmarket.mach.v1_0.dispatch;

import java.util.Optional;
import omi.miax.pearloptions.topofmarket.mach.v1_0.messages.application.CompactDoubleSidedTopOfMarketMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_0.messages.application.CompactTopOfMarketBestOfferMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_0.messages.application.CompactTopOfMarketBidMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_0.messages.application.LastSaleMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_0.messages.application.SeriesUpdateMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_0.messages.application.SystemStateMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_0.messages.application.SystemTimeMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_0.messages.application.TradeCancelMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_0.messages.application.UnderlyingTradingStatusNotification;
import omi.miax.pearloptions.topofmarket.mach.v1_0.messages.application.WideDoubleSidedTopOfMarketMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_0.messages.application.WideTopOfMarketBestBidMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_0.messages.application.WideTopOfMarketBestOfferMessage;
import omi.miax.pearloptions.topofmarket.mach.v1_0.types.Message;

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
            message = new SeriesUpdateMessage();
        } else if (messageType == 'S') {
            message = new SystemStateMessage();
        } else if (messageType == 'B') {
            message = new CompactTopOfMarketBidMessage();
        } else if (messageType == 'O') {
            message = new CompactTopOfMarketBestOfferMessage();
        } else if (messageType == 'W') {
            message = new WideTopOfMarketBestBidMessage();
        } else if (messageType == 'A') {
            message = new WideTopOfMarketBestOfferMessage();
        } else if (messageType == 'd') {
            message = new CompactDoubleSidedTopOfMarketMessage();
        } else if (messageType == 'D') {
            message = new WideDoubleSidedTopOfMarketMessage();
        } else if (messageType == 'T') {
            message = new LastSaleMessage();
        } else if (messageType == 'X') {
            message = new TradeCancelMessage();
        } else if (messageType == 'H') {
            message = new UnderlyingTradingStatusNotification();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
