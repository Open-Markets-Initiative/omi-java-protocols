package omi.miax.miaxoptions.complextopofmarket.mach.v1_1.dispatch;

import java.util.Optional;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.messages.application.CompactComplexDoubleSidedTopOfMarketMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.messages.application.CompactComplexTopOfMarketBidMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.messages.application.CompactComplexTopOfMarketOfferMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.messages.application.ComplexStrategyDefinitionMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.messages.application.SeriesUpdate;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.messages.application.StrategyTradeMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.messages.application.SystemStateMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.messages.application.SystemTimeMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.messages.application.UnderlyingTradingStatusMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.messages.application.WideComplexDoubleSidedTopOfMarketMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.messages.application.WideComplexTopOfMarketBidMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.messages.application.WideComplexTopOfMarketOfferMessage;
import omi.miax.miaxoptions.complextopofmarket.mach.v1_1.types.Message;

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
        } else if (messageType == 'C') {
            message = new ComplexStrategyDefinitionMessage();
        } else if (messageType == 'S') {
            message = new SystemStateMessage();
        } else if (messageType == 'b') {
            message = new CompactComplexTopOfMarketBidMessage();
        } else if (messageType == 'o') {
            message = new CompactComplexTopOfMarketOfferMessage();
        } else if (messageType == 'e') {
            message = new WideComplexTopOfMarketBidMessage();
        } else if (messageType == 'f') {
            message = new WideComplexTopOfMarketOfferMessage();
        } else if (messageType == 'm') {
            message = new CompactComplexDoubleSidedTopOfMarketMessage();
        } else if (messageType == 'w') {
            message = new WideComplexDoubleSidedTopOfMarketMessage();
        } else if (messageType == 't') {
            message = new StrategyTradeMessage();
        } else if (messageType == 'H') {
            message = new UnderlyingTradingStatusMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
