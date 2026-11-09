package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.dispatch;

import java.util.Optional;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.CancelRejected;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.MassCancelAcknowledgement;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.MassCancelRejected;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.ModifyRejected;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.NewComplexInstrumentAcceptedOption;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.NewComplexInstrumentRejectedOption;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.OrderAcknowledgement;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.OrderAcknowledgementOption;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.OrderCancelled;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.OrderExecution;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.OrderExecutionOption;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.OrderModified;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.OrderRejected;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.PurgeAcknowledgement;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.PurgeRejected;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.QuoteCancelled;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.QuoteExecution;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.QuoteRestated;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.QuoteUpdateAcknowledgement;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.QuoteUpdateRejected;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.ResetRiskAcknowledgement;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.TasQuoteRestatement;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.TasRestatement;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.TradeCancelCorrect;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application.TradeCancelCorrectOption;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.session.LoginResponseMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.session.LogoutResponseMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.session.ReplayComplete;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.session.ServerHeartbeat;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Message;

/**
 * Selects the message a Exchange Message branch holds by its Exchange Message Type.
 */
public final class ExchangeMessageDispatch {

    private ExchangeMessageDispatch() {
    }

    /**
     * Decodes the message a Exchange Message Type selects.
     *
     * @param exchangeMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long exchangeMessageType, byte[] data, int offset, int end) {
        Message message;
        if (exchangeMessageType == 501L) {
            message = new LoginResponseMessage();
        } else if (exchangeMessageType == 502L) {
            message = new ReplayComplete();
        } else if (exchangeMessageType == 503L) {
            message = new LogoutResponseMessage();
        } else if (exchangeMessageType == 504L) {
            message = new ServerHeartbeat();
        } else if (exchangeMessageType == 1501L) {
            message = new OrderAcknowledgement();
        } else if (exchangeMessageType == 1523L) {
            message = new OrderAcknowledgementOption();
        } else if (exchangeMessageType == 1502L) {
            message = new OrderRejected();
        } else if (exchangeMessageType == 1503L) {
            message = new OrderModified();
        } else if (exchangeMessageType == 1504L) {
            message = new ModifyRejected();
        } else if (exchangeMessageType == 1505L) {
            message = new OrderExecution();
        } else if (exchangeMessageType == 1524L) {
            message = new OrderExecutionOption();
        } else if (exchangeMessageType == 1506L) {
            message = new OrderCancelled();
        } else if (exchangeMessageType == 1507L) {
            message = new CancelRejected();
        } else if (exchangeMessageType == 1508L) {
            message = new MassCancelAcknowledgement();
        } else if (exchangeMessageType == 1509L) {
            message = new MassCancelRejected();
        } else if (exchangeMessageType == 1510L) {
            message = new PurgeAcknowledgement();
        } else if (exchangeMessageType == 1511L) {
            message = new PurgeRejected();
        } else if (exchangeMessageType == 1512L) {
            message = new TradeCancelCorrect();
        } else if (exchangeMessageType == 1525L) {
            message = new TradeCancelCorrectOption();
        } else if (exchangeMessageType == 1513L) {
            message = new TasRestatement();
        } else if (exchangeMessageType == 1515L) {
            message = new QuoteUpdateAcknowledgement();
        } else if (exchangeMessageType == 1516L) {
            message = new QuoteUpdateRejected();
        } else if (exchangeMessageType == 1517L) {
            message = new QuoteRestated();
        } else if (exchangeMessageType == 1518L) {
            message = new QuoteExecution();
        } else if (exchangeMessageType == 1519L) {
            message = new QuoteCancelled();
        } else if (exchangeMessageType == 1520L) {
            message = new TasQuoteRestatement();
        } else if (exchangeMessageType == 1522L) {
            message = new ResetRiskAcknowledgement();
        } else if (exchangeMessageType == 1526L) {
            message = new NewComplexInstrumentAcceptedOption();
        } else if (exchangeMessageType == 1527L) {
            message = new NewComplexInstrumentRejectedOption();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
