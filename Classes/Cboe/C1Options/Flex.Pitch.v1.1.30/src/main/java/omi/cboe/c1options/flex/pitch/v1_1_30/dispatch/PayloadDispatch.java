package omi.cboe.c1options.flex.pitch.v1_1_30.dispatch;

import java.util.Optional;
import omi.cboe.c1options.flex.pitch.v1_1_30.messages.application.AuctionCancelMessage;
import omi.cboe.c1options.flex.pitch.v1_1_30.messages.application.AuctionNotificationMessage;
import omi.cboe.c1options.flex.pitch.v1_1_30.messages.application.AuctionTradeMessage;
import omi.cboe.c1options.flex.pitch.v1_1_30.messages.application.ComplexFlexInstrumentDefinitionMessage;
import omi.cboe.c1options.flex.pitch.v1_1_30.messages.application.DacAuctionNotificationMessage;
import omi.cboe.c1options.flex.pitch.v1_1_30.messages.application.DacTradeMessage;
import omi.cboe.c1options.flex.pitch.v1_1_30.messages.application.EndOfSessionMessage;
import omi.cboe.c1options.flex.pitch.v1_1_30.messages.application.FlexInstrumentDefinitionMessage;
import omi.cboe.c1options.flex.pitch.v1_1_30.messages.application.SymbolMappingMessage;
import omi.cboe.c1options.flex.pitch.v1_1_30.messages.application.TimeMessage;
import omi.cboe.c1options.flex.pitch.v1_1_30.messages.application.TimeReferenceMessage;
import omi.cboe.c1options.flex.pitch.v1_1_30.messages.application.TradeBreakMessage;
import omi.cboe.c1options.flex.pitch.v1_1_30.messages.application.TradeLongMessage;
import omi.cboe.c1options.flex.pitch.v1_1_30.messages.application.TradeShortMessage;
import omi.cboe.c1options.flex.pitch.v1_1_30.messages.application.TradingStatusMessage;
import omi.cboe.c1options.flex.pitch.v1_1_30.types.Message;

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
        if (messageType == 177L) {
            message = new TimeReferenceMessage();
        } else if (messageType == 32L) {
            message = new TimeMessage();
        } else if (messageType == 156L) {
            message = new FlexInstrumentDefinitionMessage();
        } else if (messageType == 155L) {
            message = new ComplexFlexInstrumentDefinitionMessage();
        } else if (messageType == 173L) {
            message = new AuctionNotificationMessage();
        } else if (messageType == 221L) {
            message = new DacAuctionNotificationMessage();
        } else if (messageType == 174L) {
            message = new AuctionCancelMessage();
        } else if (messageType == 175L) {
            message = new AuctionTradeMessage();
        } else if (messageType == 42L) {
            message = new TradeLongMessage();
        } else if (messageType == 43L) {
            message = new TradeShortMessage();
        } else if (messageType == 54L) {
            message = new DacTradeMessage();
        } else if (messageType == 44L) {
            message = new TradeBreakMessage();
        } else if (messageType == 46L) {
            message = new SymbolMappingMessage();
        } else if (messageType == 49L) {
            message = new TradingStatusMessage();
        } else if (messageType == 45L) {
            message = new EndOfSessionMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
