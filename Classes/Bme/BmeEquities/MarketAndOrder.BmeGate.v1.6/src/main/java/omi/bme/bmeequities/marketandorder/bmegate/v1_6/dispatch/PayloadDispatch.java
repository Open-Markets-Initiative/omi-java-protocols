package omi.bme.bmeequities.marketandorder.bmegate.v1_6.dispatch;

import java.util.Optional;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.BusinessMessageRejectMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.ExecutionPrivateInformation1LegBuyMarketOrderMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.ExecutionPrivateInformation1LegSellMarketOrderMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.ExecutionPrivateInformation2LegsMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.HeartbeatMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.LogonMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.LogonResponseMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.LogoutMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.LogoutResponseMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.MassOrderquoteCancellationCompletionMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.MassOrderquoteCancellationMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.MassOrderquoteCancellationRejectMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.NetworkStatusMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.NewQuoteMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.NewsMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.OrderAndQuoteClientDataMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.OrderAndQuoteClientDataParametersAckNackMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.OrderBookClearMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.OrderCancelRejectMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.OrderCancellationMarketMemberMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.OrderCancellationRequestMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.OrderMarketPreTransparencyInformationMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.QuoteCancellationMarketMemberMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.QuoteCancellationRequestMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.QuoteMarketPreTransparencyInformationMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.QuoteModificationRequestMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.QuoteStatusMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.RejectMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.SecurityListCancellationReportMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.SecurityListMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.SecurityListUpdateReportMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.SecurityStatusMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.SimpleNewOrderMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.SimpleNewOrderWithClientDataMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.SimpleOrderModificationMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.SimpleOrderModificationWithClientDataMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.SimpleOrderStatusMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.StatisticsMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.TopOfBookMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.TradeMarketPostTransparencyInformationFullDepthMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.TradeMarketPostTransparencyInformationTopOfBookMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.TradeTradeAmendmentOrCancellation1LegBuyPrivateInformationMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.TradeTradeAmendmentOrCancellation1LegSellPrivateInformationMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.TradeTradeAmendmentOrCancellation2LegsPrivateInformationMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.TradeTradeAmendmentOrCancellationMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.messages.application.TradingSessionStatusMessage;
import omi.bme.bmeequities.marketandorder.bmegate.v1_6.types.Message;

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
        if (messageType == 8L) {
            message = new LogonResponseMessage();
        } else if (messageType == 11L) {
            message = new LogoutResponseMessage();
        } else if (messageType == 48L) {
            message = new HeartbeatMessage();
        } else if (messageType == 10L) {
            message = new NetworkStatusMessage();
        } else if (messageType == 65L) {
            message = new LogonMessage();
        } else if (messageType == 53L) {
            message = new LogoutMessage();
        } else if (messageType == 13L) {
            message = new RejectMessage();
        } else if (messageType == 104L) {
            message = new TradingSessionStatusMessage();
        } else if (messageType == 66L) {
            message = new NewsMessage();
        } else if (messageType == 120L) {
            message = new SecurityListCancellationReportMessage();
        } else if (messageType == 132L) {
            message = new StatisticsMessage();
        } else if (messageType == 121L) {
            message = new SecurityListMessage();
        } else if (messageType == 128L) {
            message = new SecurityListUpdateReportMessage();
        } else if (messageType == 102L) {
            message = new SecurityStatusMessage();
        } else if (messageType == 129L) {
            message = new OrderBookClearMessage();
        } else if (messageType == 3L) {
            message = new OrderMarketPreTransparencyInformationMessage();
        } else if (messageType == 7L) {
            message = new QuoteMarketPreTransparencyInformationMessage();
        } else if (messageType == 1L) {
            message = new OrderCancellationMarketMemberMessage();
        } else if (messageType == 5L) {
            message = new QuoteCancellationMarketMemberMessage();
        } else if (messageType == 16L) {
            message = new TradeMarketPostTransparencyInformationTopOfBookMessage();
        } else if (messageType == 24L) {
            message = new TradeTradeAmendmentOrCancellationMessage();
        } else if (messageType == 17L) {
            message = new TradeMarketPostTransparencyInformationFullDepthMessage();
        } else if (messageType == 130L) {
            message = new TopOfBookMessage();
        } else if (messageType == 111L) {
            message = new OrderAndQuoteClientDataMessage();
        } else if (messageType == 68L) {
            message = new SimpleNewOrderMessage();
        } else if (messageType == 69L) {
            message = new SimpleNewOrderWithClientDataMessage();
        } else if (messageType == 71L) {
            message = new SimpleOrderModificationMessage();
        } else if (messageType == 72L) {
            message = new SimpleOrderModificationWithClientDataMessage();
        } else if (messageType == 70L) {
            message = new OrderCancellationRequestMessage();
        } else if (messageType == 83L) {
            message = new NewQuoteMessage();
        } else if (messageType == 97L) {
            message = new QuoteModificationRequestMessage();
        } else if (messageType == 90L) {
            message = new QuoteCancellationRequestMessage();
        } else if (messageType == 113L) {
            message = new MassOrderquoteCancellationMessage();
        } else if (messageType == 135L) {
            message = new OrderAndQuoteClientDataParametersAckNackMessage();
        } else if (messageType == 2L) {
            message = new SimpleOrderStatusMessage();
        } else if (messageType == 6L) {
            message = new QuoteStatusMessage();
        } else if (messageType == 57L) {
            message = new OrderCancelRejectMessage();
        } else if (messageType == 114L) {
            message = new MassOrderquoteCancellationCompletionMessage();
        } else if (messageType == 115L) {
            message = new MassOrderquoteCancellationRejectMessage();
        } else if (messageType == 106L) {
            message = new BusinessMessageRejectMessage();
        } else if (messageType == 23L) {
            message = new ExecutionPrivateInformation2LegsMessage();
        } else if (messageType == 26L) {
            message = new TradeTradeAmendmentOrCancellation1LegBuyPrivateInformationMessage();
        } else if (messageType == 28L) {
            message = new TradeTradeAmendmentOrCancellation1LegSellPrivateInformationMessage();
        } else if (messageType == 30L) {
            message = new TradeTradeAmendmentOrCancellation2LegsPrivateInformationMessage();
        } else if (messageType == 19L) {
            message = new ExecutionPrivateInformation1LegBuyMarketOrderMessage();
        } else if (messageType == 21L) {
            message = new ExecutionPrivateInformation1LegSellMarketOrderMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
