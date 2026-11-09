package omi.coinbase.deribit.ordersapi.sbe.v0_1.dispatch;

import java.util.Optional;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.AmendOrderRejectMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.AmendOrderRequestMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.AmendOrderResponseMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.CancelOrderRejectMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.CancelOrderRequestMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.CancelOrderResponseMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.GapFillMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.HeartbeatMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.LoggedOutMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.LogonConfMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.LogonMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.LogoutMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassCancelRejectMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassCancelRequestMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassCancelResponseMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassQuoteCancelRequestMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassQuoteMmpTriggeredMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassQuoteMmpUnfrozenMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassQuoteOrdersPlacedMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassQuoteRejectMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassQuoteRequestMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.MassQuoteResponseMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.NewOrderRejectMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.NewOrderRequestMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.NewOrderResponseMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.OrderFilledMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.OrderPlacedMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.OrdersCanceledMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.OrdersMmpTriggeredMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.OrdersMmpUnfrozenMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.RejectMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.ResendRequestMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.messages.application.TestRequestMessage;
import omi.coinbase.deribit.ordersapi.sbe.v0_1.types.Message;

/**
 * Selects the message a Payload branch holds by its Template Id.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Template Id selects.
     *
     * @param templateId the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long templateId, byte[] data, int offset, int end) {
        Message message;
        if (templateId == 1L) {
            message = new LogonMessage();
        } else if (templateId == 2L) {
            message = new LogonConfMessage();
        } else if (templateId == 4L) {
            message = new LogoutMessage();
        } else if (templateId == 5L) {
            message = new LoggedOutMessage();
        } else if (templateId == 10L) {
            message = new HeartbeatMessage();
        } else if (templateId == 11L) {
            message = new TestRequestMessage();
        } else if (templateId == 20L) {
            message = new ResendRequestMessage();
        } else if (templateId == 21L) {
            message = new GapFillMessage();
        } else if (templateId == 30L) {
            message = new RejectMessage();
        } else if (templateId == 100L) {
            message = new NewOrderRequestMessage();
        } else if (templateId == 110L) {
            message = new AmendOrderRequestMessage();
        } else if (templateId == 120L) {
            message = new CancelOrderRequestMessage();
        } else if (templateId == 130L) {
            message = new MassQuoteRequestMessage();
        } else if (templateId == 140L) {
            message = new MassCancelRequestMessage();
        } else if (templateId == 145L) {
            message = new MassQuoteCancelRequestMessage();
        } else if (templateId == 200L) {
            message = new NewOrderResponseMessage();
        } else if (templateId == 202L) {
            message = new NewOrderRejectMessage();
        } else if (templateId == 210L) {
            message = new AmendOrderResponseMessage();
        } else if (templateId == 212L) {
            message = new AmendOrderRejectMessage();
        } else if (templateId == 220L) {
            message = new CancelOrderResponseMessage();
        } else if (templateId == 222L) {
            message = new CancelOrderRejectMessage();
        } else if (templateId == 230L) {
            message = new MassQuoteResponseMessage();
        } else if (templateId == 232L) {
            message = new MassQuoteRejectMessage();
        } else if (templateId == 240L) {
            message = new MassCancelResponseMessage();
        } else if (templateId == 242L) {
            message = new MassCancelRejectMessage();
        } else if (templateId == 300L) {
            message = new OrderFilledMessage();
        } else if (templateId == 310L) {
            message = new OrdersCanceledMessage();
        } else if (templateId == 312L) {
            message = new OrderPlacedMessage();
        } else if (templateId == 314L) {
            message = new MassQuoteOrdersPlacedMessage();
        } else if (templateId == 320L) {
            message = new MassQuoteMmpTriggeredMessage();
        } else if (templateId == 322L) {
            message = new OrdersMmpTriggeredMessage();
        } else if (templateId == 324L) {
            message = new MassQuoteMmpUnfrozenMessage();
        } else if (templateId == 326L) {
            message = new OrdersMmpUnfrozenMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
