package omi.miax.miaxoptions.complextopofmarket.mach.v1_3.dispatch;

import java.util.Optional;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.messages.application.ComplexDoubleSidedTopOfMarketCompactMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.messages.application.ComplexDoubleSidedTopOfMarketWideMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.messages.application.ComplexStrategyDefinitionMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.messages.application.ComplexTopOfMarketBidCompactMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.messages.application.ComplexTopOfMarketBidWideMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.messages.application.ComplexTopOfMarketOfferCompactMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.messages.application.ComplexTopOfMarketOfferWideMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.messages.application.SimpleSeriesUpdateMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.messages.application.StrategyLastSaleMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.messages.application.SystemStateMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.messages.application.SystemTimeMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.messages.application.UnderlyingTradingStatusNotificationMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_3.types.Message;

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
        } else if (messageType == 'C') {
            message = new ComplexStrategyDefinitionMessage();
        } else if (messageType == 'S') {
            message = new SystemStateMessage();
        } else if (messageType == 'b') {
            message = new ComplexTopOfMarketBidCompactMessage();
        } else if (messageType == 'o') {
            message = new ComplexTopOfMarketOfferCompactMessage();
        } else if (messageType == 'e') {
            message = new ComplexTopOfMarketBidWideMessage();
        } else if (messageType == 'f') {
            message = new ComplexTopOfMarketOfferWideMessage();
        } else if (messageType == 'm') {
            message = new ComplexDoubleSidedTopOfMarketCompactMessage();
        } else if (messageType == 'w') {
            message = new ComplexDoubleSidedTopOfMarketWideMessage();
        } else if (messageType == 't') {
            message = new StrategyLastSaleMessage();
        } else if (messageType == 'H') {
            message = new UnderlyingTradingStatusNotificationMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
