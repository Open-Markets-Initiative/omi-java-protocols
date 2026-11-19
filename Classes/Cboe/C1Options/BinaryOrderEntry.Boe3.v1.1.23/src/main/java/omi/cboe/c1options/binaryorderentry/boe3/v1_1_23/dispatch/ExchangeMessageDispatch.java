package omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.dispatch;

import java.util.Optional;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.AddFloorTradeRejectedMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.CancelRejectedMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.CarriedRestatementMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.ComplexQuoteExecutionMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.CrossOrderAcknowledgmentMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.CrossOrderCancelledMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.CrossOrderRejectedMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.DeleteFloorTradeAcknowledgementMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.DeleteFloorTradeRejectedMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.DoneForDayMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.FloorOrderRepresentedMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.FloorTradeConfirmationRejectedMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.FloorTradeNotificationMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.MassCancelAcknowledgmentMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.MassCancelRejectedMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.ModifyRejectedMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.NewComplexInstrumentAcceptedMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.NewComplexInstrumentRejectedMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.OrderAcknowledgementMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.OrderCancelledMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.OrderExecutionMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.OrderModifiedMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.OrderRejectedMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.OrderRestatedMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.PurgeAcknowledgementMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.PurgeNotificationMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.PurgeRejectedMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.QuoteCancelledMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.QuoteExecutionMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.QuoteRestatedMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.QuoteUpdateAcknowledgementMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.QuoteUpdateRejectedMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.ResetRiskAcknowledgementMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application.TradeCancelCorrectMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.session.LoginResponseMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.session.LogoutResponseMessage;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.session.ReplayComplete;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.session.ServerHeartbeat;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.Message;

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
        } else if (exchangeMessageType == 2501L) {
            message = new OrderAcknowledgementMessage();
        } else if (exchangeMessageType == 2502L) {
            message = new CrossOrderAcknowledgmentMessage();
        } else if (exchangeMessageType == 2517L) {
            message = new QuoteUpdateAcknowledgementMessage();
        } else if (exchangeMessageType == 2503L) {
            message = new OrderRejectedMessage();
        } else if (exchangeMessageType == 2504L) {
            message = new CrossOrderRejectedMessage();
        } else if (exchangeMessageType == 2518L) {
            message = new QuoteUpdateRejectedMessage();
        } else if (exchangeMessageType == 2507L) {
            message = new OrderModifiedMessage();
        } else if (exchangeMessageType == 2509L) {
            message = new OrderRestatedMessage();
        } else if (exchangeMessageType == 2521L) {
            message = new QuoteRestatedMessage();
        } else if (exchangeMessageType == 2508L) {
            message = new ModifyRejectedMessage();
        } else if (exchangeMessageType == 2512L) {
            message = new OrderCancelledMessage();
        } else if (exchangeMessageType == 2519L) {
            message = new QuoteCancelledMessage();
        } else if (exchangeMessageType == 2513L) {
            message = new CrossOrderCancelledMessage();
        } else if (exchangeMessageType == 2514L) {
            message = new CancelRejectedMessage();
        } else if (exchangeMessageType == 2515L) {
            message = new OrderExecutionMessage();
        } else if (exchangeMessageType == 2520L) {
            message = new QuoteExecutionMessage();
        } else if (exchangeMessageType == 2529L) {
            message = new ComplexQuoteExecutionMessage();
        } else if (exchangeMessageType == 2516L) {
            message = new TradeCancelCorrectMessage();
        } else if (exchangeMessageType == 2526L) {
            message = new PurgeRejectedMessage();
        } else if (exchangeMessageType == 2522L) {
            message = new ResetRiskAcknowledgementMessage();
        } else if (exchangeMessageType == 2523L) {
            message = new MassCancelAcknowledgmentMessage();
        } else if (exchangeMessageType == 2524L) {
            message = new MassCancelRejectedMessage();
        } else if (exchangeMessageType == 2525L) {
            message = new PurgeAcknowledgementMessage();
        } else if (exchangeMessageType == 2527L) {
            message = new PurgeNotificationMessage();
        } else if (exchangeMessageType == 2505L) {
            message = new NewComplexInstrumentAcceptedMessage();
        } else if (exchangeMessageType == 2506L) {
            message = new NewComplexInstrumentRejectedMessage();
        } else if (exchangeMessageType == 2510L) {
            message = new CarriedRestatementMessage();
        } else if (exchangeMessageType == 2511L) {
            message = new DoneForDayMessage();
        } else if (exchangeMessageType == 2530L) {
            message = new FloorTradeNotificationMessage();
        } else if (exchangeMessageType == 2532L) {
            message = new FloorTradeConfirmationRejectedMessage();
        } else if (exchangeMessageType == 2531L) {
            message = new AddFloorTradeRejectedMessage();
        } else if (exchangeMessageType == 2533L) {
            message = new DeleteFloorTradeRejectedMessage();
        } else if (exchangeMessageType == 2535L) {
            message = new FloorOrderRepresentedMessage();
        } else if (exchangeMessageType == 2534L) {
            message = new DeleteFloorTradeAcknowledgementMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
