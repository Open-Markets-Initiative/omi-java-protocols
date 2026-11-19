package omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.dispatch;

import java.util.Optional;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.messages.application.AodUpdateMessage;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.messages.application.HeartbeatMessage;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.messages.application.OrderAddMessage;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.messages.application.OrderCancelMessage;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.messages.application.OrderModifyMessage;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.messages.application.QuoteAddReplaceMessage;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.messages.application.QuoteCancelMessage;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.messages.application.SecurityDefinitionMessage;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.messages.application.SecurityStatisticsMessage;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.messages.application.SecurityStatusMessage;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.messages.application.TickTableDataMessage;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.messages.application.TradeBustMessage;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.messages.application.TradeMessage;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.messages.application.TradeReportCancelMessage;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.messages.application.TradeReportMessage;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.messages.application.TradeReportModifyMessage;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.messages.application.TraderDefinitionMessage;
import omi.aquis.aquisstockexchange.realtime.amd.v1_2_3.types.Message;

/**
 * Selects the message a Payload branch holds by its Msg Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Msg Type selects.
     *
     * @param msgType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long msgType, byte[] data, int offset, int end) {
        Message message;
        if (msgType == 1L) {
            message = new HeartbeatMessage();
        } else if (msgType == 2L) {
            message = new OrderAddMessage();
        } else if (msgType == 3L) {
            message = new OrderCancelMessage();
        } else if (msgType == 4L) {
            message = new OrderModifyMessage();
        } else if (msgType == 20L) {
            message = new QuoteAddReplaceMessage();
        } else if (msgType == 21L) {
            message = new QuoteCancelMessage();
        } else if (msgType == 5L) {
            message = new TradeMessage();
        } else if (msgType == 25L) {
            message = new TradeReportMessage();
        } else if (msgType == 26L) {
            message = new TradeReportModifyMessage();
        } else if (msgType == 27L) {
            message = new TradeReportCancelMessage();
        } else if (msgType == 6L) {
            message = new TradeBustMessage();
        } else if (msgType == 22L) {
            message = new SecurityStatisticsMessage();
        } else if (msgType == 23L) {
            message = new TraderDefinitionMessage();
        } else if (msgType == 7L) {
            message = new TickTableDataMessage();
        } else if (msgType == 8L) {
            message = new SecurityDefinitionMessage();
        } else if (msgType == 9L) {
            message = new SecurityStatusMessage();
        } else if (msgType == 17L) {
            message = new AodUpdateMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
