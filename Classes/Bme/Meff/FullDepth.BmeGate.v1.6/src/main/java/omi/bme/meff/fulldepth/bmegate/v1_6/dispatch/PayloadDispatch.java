package omi.bme.meff.fulldepth.bmegate.v1_6.dispatch;

import java.util.Optional;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.FamilyStatusMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.HeartbeatMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.IndicationOfInterestMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.LogonResponseMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.LogoutResponseMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.NetworkStatusMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.NewsMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.OrderBookClearMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.OrderCancellationMarketMemberMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.OrderMarketPreTransparencyInformationMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.QuoteCancellationMarketMemberMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.QuoteMarketPreTransparencyInformationMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.RfqMarketPreTransparencyInformationMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.SecurityListCancellationReportMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.SecurityListMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.SecurityListUpdateReportMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.SecurityStatusMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.StatisticsMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.TopOfBookMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.TradeMarketPostTransparencyInformationFullDepthMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.TradeMarketPostTransparencyInformationTopOfBookMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.TradeTradeAmendmentOrCancellationMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.messages.application.TradingSessionStatusMessage;
import omi.bme.meff.fulldepth.bmegate.v1_6.types.Message;

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
        } else if (messageType == 137L) {
            message = new FamilyStatusMessage();
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
        } else if (messageType == 54L) {
            message = new IndicationOfInterestMessage();
        } else if (messageType == 133L) {
            message = new RfqMarketPreTransparencyInformationMessage();
        } else if (messageType == 130L) {
            message = new TopOfBookMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
