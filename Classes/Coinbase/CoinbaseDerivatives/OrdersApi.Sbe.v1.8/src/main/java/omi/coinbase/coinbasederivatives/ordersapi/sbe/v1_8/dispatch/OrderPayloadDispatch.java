package omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.dispatch;

import java.util.Optional;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.CancelOrderMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.CancelOrderRejectMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.EventResendCompleteMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.EventResendRejectMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.EventResendRequestMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.InstrumentInfoMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.InstrumentInfoRequestMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.LastExecIdMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.LastExecIdRequestMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.MassCancelOrderAckMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.MassCancelOrderMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.MassCancelOrderRejectMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.NewIocOrderMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.NewOrderMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.ObsoleteStreamOrderMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.OrderCanceledMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.OrderEnteredMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.OrderFilledMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.OrderRejectMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.OrderReplacedMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.PingMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.PongMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.ReplaceOrderMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.ResetOptionsFillProtectionAckMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.ResetOptionsFillProtectionMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.ResetOptionsFillProtectionRejectMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.SetAccountMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.SetAckMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.SetTraderMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.SpreadOrderFilledMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.UnlockTradingAckMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.UnlockTradingMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.messages.application.UnlockTradingRejectMessage;
import omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.types.Message;

/**
 * Selects the message a Order Payload branch holds by its Template Id.
 */
public final class OrderPayloadDispatch {

    private OrderPayloadDispatch() {
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
        if (templateId == 102L) {
            message = new PingMessage();
        } else if (templateId == 202L) {
            message = new PongMessage();
        } else if (templateId == 103L) {
            message = new InstrumentInfoRequestMessage();
        } else if (templateId == 203L) {
            message = new InstrumentInfoMessage();
        } else if (templateId == 105L) {
            message = new SetAccountMessage();
        } else if (templateId == 106L) {
            message = new SetTraderMessage();
        } else if (templateId == 205L) {
            message = new SetAckMessage();
        } else if (templateId == 110L) {
            message = new NewOrderMessage();
        } else if (templateId == 111L) {
            message = new NewIocOrderMessage();
        } else if (templateId == 210L) {
            message = new OrderEnteredMessage();
        } else if (templateId == 120L) {
            message = new ReplaceOrderMessage();
        } else if (templateId == 121L) {
            message = new ObsoleteStreamOrderMessage();
        } else if (templateId == 221L) {
            message = new OrderRejectMessage();
        } else if (templateId == 220L) {
            message = new OrderReplacedMessage();
        } else if (templateId == 130L) {
            message = new CancelOrderMessage();
        } else if (templateId == 230L) {
            message = new OrderCanceledMessage();
        } else if (templateId == 233L) {
            message = new CancelOrderRejectMessage();
        } else if (templateId == 131L) {
            message = new MassCancelOrderMessage();
        } else if (templateId == 231L) {
            message = new MassCancelOrderAckMessage();
        } else if (templateId == 232L) {
            message = new MassCancelOrderRejectMessage();
        } else if (templateId == 132L) {
            message = new UnlockTradingMessage();
        } else if (templateId == 234L) {
            message = new UnlockTradingAckMessage();
        } else if (templateId == 235L) {
            message = new UnlockTradingRejectMessage();
        } else if (templateId == 240L) {
            message = new OrderFilledMessage();
        } else if (templateId == 241L) {
            message = new SpreadOrderFilledMessage();
        } else if (templateId == 150L) {
            message = new LastExecIdRequestMessage();
        } else if (templateId == 250L) {
            message = new LastExecIdMessage();
        } else if (templateId == 152L) {
            message = new EventResendRequestMessage();
        } else if (templateId == 252L) {
            message = new EventResendCompleteMessage();
        } else if (templateId == 253L) {
            message = new EventResendRejectMessage();
        } else if (templateId == 160L) {
            message = new ResetOptionsFillProtectionMessage();
        } else if (templateId == 260L) {
            message = new ResetOptionsFillProtectionAckMessage();
        } else if (templateId == 261L) {
            message = new ResetOptionsFillProtectionRejectMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
