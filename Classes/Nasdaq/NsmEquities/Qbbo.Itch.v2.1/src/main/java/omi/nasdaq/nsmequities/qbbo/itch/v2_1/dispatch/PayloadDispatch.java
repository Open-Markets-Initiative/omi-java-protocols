package omi.nasdaq.nsmequities.qbbo.itch.v2_1.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.messages.application.BboQuotationMessage;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.messages.application.IpoQuotingPeriodUpdateMessage;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.messages.application.MwcbBreachMessage;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.messages.application.MwcbDeclineLevelMessage;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.messages.application.OperationalHaltMessage;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.messages.application.PriceImprovementMessage;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.messages.application.RegShoRestrictionMessage;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.messages.application.StockDirectoryMessage;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.messages.application.StockTradingActionMessage;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.messages.application.SystemEventMessage;
import omi.nasdaq.nsmequities.qbbo.itch.v2_1.types.Message;

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
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char messageType, byte[] data, int offset) {
        Message message;
        if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'R') {
            message = new StockDirectoryMessage();
        } else if (messageType == 'H') {
            message = new StockTradingActionMessage();
        } else if (messageType == 'Y') {
            message = new RegShoRestrictionMessage();
        } else if (messageType == 'V') {
            message = new MwcbDeclineLevelMessage();
        } else if (messageType == 'W') {
            message = new MwcbBreachMessage();
        } else if (messageType == 'h') {
            message = new OperationalHaltMessage();
        } else if (messageType == 'Q') {
            message = new BboQuotationMessage();
        } else if (messageType == 'N') {
            message = new PriceImprovementMessage();
        } else if (messageType == 'K') {
            message = new IpoQuotingPeriodUpdateMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset);
        return Optional.of(message);
    }
}
