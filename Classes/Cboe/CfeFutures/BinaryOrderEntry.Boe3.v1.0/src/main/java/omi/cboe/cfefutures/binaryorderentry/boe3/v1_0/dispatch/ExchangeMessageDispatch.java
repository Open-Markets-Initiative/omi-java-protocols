package omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.dispatch;

import java.util.Optional;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.CancelRejectedMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.MassCancelAcknowledgementMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.MassCancelRejectedMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.ModifyRejectedMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.OrderAcknowledgementMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.OrderCancelledMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.OrderExecutionMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.OrderModifiedMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.OrderRejectedMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.PurgeAcknowledgementMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.PurgeRejectedMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.QuoteCancelledMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.QuoteExecutionMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.QuoteRestatedMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.QuoteUpdateAcknowledgementMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.QuoteUpdateRejectedMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.ResetRiskAcknowledgementMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.TasQuoteRestatementMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.TasRestatementMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.TradeCancelOrCorrectMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.VarianceQuoteRestatementMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.application.VarianceRestatementMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.session.LoginResponseMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.session.LogoutResponseMessage;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.session.ReplayComplete;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.messages.session.ServerHeartbeat;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_0.types.Message;

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
            message = new OrderAcknowledgementMessage();
        } else if (exchangeMessageType == 1502L) {
            message = new OrderRejectedMessage();
        } else if (exchangeMessageType == 1503L) {
            message = new OrderModifiedMessage();
        } else if (exchangeMessageType == 1504L) {
            message = new ModifyRejectedMessage();
        } else if (exchangeMessageType == 1505L) {
            message = new OrderExecutionMessage();
        } else if (exchangeMessageType == 1506L) {
            message = new OrderCancelledMessage();
        } else if (exchangeMessageType == 1507L) {
            message = new CancelRejectedMessage();
        } else if (exchangeMessageType == 1508L) {
            message = new MassCancelAcknowledgementMessage();
        } else if (exchangeMessageType == 1509L) {
            message = new MassCancelRejectedMessage();
        } else if (exchangeMessageType == 1510L) {
            message = new PurgeAcknowledgementMessage();
        } else if (exchangeMessageType == 1511L) {
            message = new PurgeRejectedMessage();
        } else if (exchangeMessageType == 1512L) {
            message = new TradeCancelOrCorrectMessage();
        } else if (exchangeMessageType == 1513L) {
            message = new TasRestatementMessage();
        } else if (exchangeMessageType == 1514L) {
            message = new VarianceRestatementMessage();
        } else if (exchangeMessageType == 1515L) {
            message = new QuoteUpdateAcknowledgementMessage();
        } else if (exchangeMessageType == 1516L) {
            message = new QuoteUpdateRejectedMessage();
        } else if (exchangeMessageType == 1517L) {
            message = new QuoteRestatedMessage();
        } else if (exchangeMessageType == 1518L) {
            message = new QuoteExecutionMessage();
        } else if (exchangeMessageType == 1519L) {
            message = new QuoteCancelledMessage();
        } else if (exchangeMessageType == 1520L) {
            message = new TasQuoteRestatementMessage();
        } else if (exchangeMessageType == 1521L) {
            message = new VarianceQuoteRestatementMessage();
        } else if (exchangeMessageType == 1522L) {
            message = new ResetRiskAcknowledgementMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
