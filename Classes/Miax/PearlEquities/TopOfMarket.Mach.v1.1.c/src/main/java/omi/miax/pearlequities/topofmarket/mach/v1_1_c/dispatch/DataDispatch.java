package omi.miax.pearlequities.topofmarket.mach.v1_1_c.dispatch;

import java.util.Optional;
import omi.miax.pearlequities.topofmarket.mach.v1_1_c.messages.application.CompactTopOfMarketBestBidAndOfferMessage;
import omi.miax.pearlequities.topofmarket.mach.v1_1_c.messages.application.LastSaleMessage;
import omi.miax.pearlequities.topofmarket.mach.v1_1_c.messages.application.SecurityTradingStatusNotificationMessage;
import omi.miax.pearlequities.topofmarket.mach.v1_1_c.messages.application.SymbolUpdateMessage;
import omi.miax.pearlequities.topofmarket.mach.v1_1_c.messages.application.SystemStateMessage;
import omi.miax.pearlequities.topofmarket.mach.v1_1_c.messages.application.SystemTimeMessage;
import omi.miax.pearlequities.topofmarket.mach.v1_1_c.messages.application.TradeCancelMessage;
import omi.miax.pearlequities.topofmarket.mach.v1_1_c.messages.application.WideTopOfMarketBestBidAndOfferMessage;
import omi.miax.pearlequities.topofmarket.mach.v1_1_c.types.Message;

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
    public static Optional<Message> decode(long messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 49L) {
            message = new SystemTimeMessage();
        } else if (messageType == 1L) {
            message = new SymbolUpdateMessage();
        } else if (messageType == 83L) {
            message = new SystemStateMessage();
        } else if (messageType == 4L) {
            message = new SecurityTradingStatusNotificationMessage();
        } else if (messageType == 2L) {
            message = new CompactTopOfMarketBestBidAndOfferMessage();
        } else if (messageType == 3L) {
            message = new WideTopOfMarketBestBidAndOfferMessage();
        } else if (messageType == 10L) {
            message = new LastSaleMessage();
        } else if (messageType == 11L) {
            message = new TradeCancelMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
