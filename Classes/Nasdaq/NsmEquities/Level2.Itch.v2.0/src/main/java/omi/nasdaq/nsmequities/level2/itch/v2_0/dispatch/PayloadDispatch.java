package omi.nasdaq.nsmequities.level2.itch.v2_0.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.level2.itch.v2_0.messages.application.IpoQuotingPeriodUpdateMessage;
import omi.nasdaq.nsmequities.level2.itch.v2_0.messages.application.MarketParticipantBidAskUpdateMessage;
import omi.nasdaq.nsmequities.level2.itch.v2_0.messages.application.MarketParticipantPositionMessage;
import omi.nasdaq.nsmequities.level2.itch.v2_0.messages.application.MarketWideCircuitBreakerDeclineLevelMessage;
import omi.nasdaq.nsmequities.level2.itch.v2_0.messages.application.MarketWideCircuitBreakerStatusMessage;
import omi.nasdaq.nsmequities.level2.itch.v2_0.messages.application.OperationalHaltMessage;
import omi.nasdaq.nsmequities.level2.itch.v2_0.messages.application.RegShoShortSalePriceTestRestrictedIndicatorMessage;
import omi.nasdaq.nsmequities.level2.itch.v2_0.messages.application.RetailPriceInterestIndicatorMessage;
import omi.nasdaq.nsmequities.level2.itch.v2_0.messages.application.StockDirectoryMessage;
import omi.nasdaq.nsmequities.level2.itch.v2_0.messages.application.StockTradingActionMessage;
import omi.nasdaq.nsmequities.level2.itch.v2_0.messages.application.SystemEventMessage;
import omi.nasdaq.nsmequities.level2.itch.v2_0.types.Message;

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
        if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'R') {
            message = new StockDirectoryMessage();
        } else if (messageType == 'H') {
            message = new StockTradingActionMessage();
        } else if (messageType == 'Y') {
            message = new RegShoShortSalePriceTestRestrictedIndicatorMessage();
        } else if (messageType == 'P') {
            message = new MarketParticipantPositionMessage();
        } else if (messageType == 'h') {
            message = new OperationalHaltMessage();
        } else if (messageType == 'U') {
            message = new MarketParticipantBidAskUpdateMessage();
        } else if (messageType == 'N') {
            message = new RetailPriceInterestIndicatorMessage();
        } else if (messageType == 'V') {
            message = new MarketWideCircuitBreakerDeclineLevelMessage();
        } else if (messageType == 'W') {
            message = new MarketWideCircuitBreakerStatusMessage();
        } else if (messageType == 'K') {
            message = new IpoQuotingPeriodUpdateMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
