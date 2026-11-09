package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.dispatch;

import java.util.Optional;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.AuctionImbalance19Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.ChannelReset11Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.ClosingPrice17Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.DeleteOrderMbO51Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.DeprecatedSecurityDefinitionMessage;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.EmptyBookMessage;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.ExecutionStatistics56Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.ExecutionSummary55Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.ForwardTrade54Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.HighPrice24Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.LastTradePrice27Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.LowPrice25Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.MassDeleteOrdersMbO52Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.News5Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.OpenInterest29Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.OpeningPrice15Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.OrderMbO50Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.PriceBand20Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.PriceBand22Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.QuantityBand21Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.SecurityDefinitionMessage;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.SecurityGroupPhase10Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.SecurityStatus3Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.SequenceMessage;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.SequenceResetMessage;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.SettlementPrice28Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.SnapshotFullRefreshHeader30Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.SnapshotFullRefreshOrdersMbO71Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.TheoreticalOpeningPrice16Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.Trade53Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.messages.application.TradeBust57Message;
import omi.b3.b3derivatives.binaryumdf.sbe.v1_8.types.Message;

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
            message = new SequenceResetMessage();
        } else if (templateId == 2L) {
            message = new SequenceMessage();
        } else if (templateId == 9L) {
            message = new EmptyBookMessage();
        } else if (templateId == 11L) {
            message = new ChannelReset11Message();
        } else if (templateId == 3L) {
            message = new SecurityStatus3Message();
        } else if (templateId == 10L) {
            message = new SecurityGroupPhase10Message();
        } else if (templateId == 4L) {
            message = new DeprecatedSecurityDefinitionMessage();
        } else if (templateId == 12L) {
            message = new SecurityDefinitionMessage();
        } else if (templateId == 5L) {
            message = new News5Message();
        } else if (templateId == 15L) {
            message = new OpeningPrice15Message();
        } else if (templateId == 16L) {
            message = new TheoreticalOpeningPrice16Message();
        } else if (templateId == 17L) {
            message = new ClosingPrice17Message();
        } else if (templateId == 19L) {
            message = new AuctionImbalance19Message();
        } else if (templateId == 20L) {
            message = new PriceBand20Message();
        } else if (templateId == 21L) {
            message = new QuantityBand21Message();
        } else if (templateId == 22L) {
            message = new PriceBand22Message();
        } else if (templateId == 24L) {
            message = new HighPrice24Message();
        } else if (templateId == 25L) {
            message = new LowPrice25Message();
        } else if (templateId == 27L) {
            message = new LastTradePrice27Message();
        } else if (templateId == 28L) {
            message = new SettlementPrice28Message();
        } else if (templateId == 29L) {
            message = new OpenInterest29Message();
        } else if (templateId == 30L) {
            message = new SnapshotFullRefreshHeader30Message();
        } else if (templateId == 50L) {
            message = new OrderMbO50Message();
        } else if (templateId == 51L) {
            message = new DeleteOrderMbO51Message();
        } else if (templateId == 52L) {
            message = new MassDeleteOrdersMbO52Message();
        } else if (templateId == 53L) {
            message = new Trade53Message();
        } else if (templateId == 54L) {
            message = new ForwardTrade54Message();
        } else if (templateId == 55L) {
            message = new ExecutionSummary55Message();
        } else if (templateId == 56L) {
            message = new ExecutionStatistics56Message();
        } else if (templateId == 57L) {
            message = new TradeBust57Message();
        } else if (templateId == 71L) {
            message = new SnapshotFullRefreshOrdersMbO71Message();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
