package omi.nse.nsecd.orderentry.nnf.v6_3.dispatch;

import java.util.Optional;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.BatchOrderCancelMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.BcastAssetMstrChgMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.BoardLotOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.BoxSignOffMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.BoxSignOnRequestOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.BranchOrdValLimitUpdaMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.CancelNegOrderMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.ColUserStatusChangeOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.DealerLimitUpdateOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.ErrorResponseOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.FreezeToControlMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.GiveupAppConfirmTmMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.GiveupRejConfirmTmMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.GrResponseMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.NegOrderToBlMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OnStopNotificationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OpenOrderReportMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OrderCancelConfirmationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OrderCancelOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OrderCancelRejectMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OrderConfirmationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OrderErrorMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OrderModConfirmationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OrderModOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OrderModRejectMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.PartialSystemInformationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.ResetUserPasswordOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SecureBoxRegistrationReMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SignOffTraderOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SignOnRequestOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpBoardLotOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpOrderCancelOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpOrderConfirmationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpOrderCxlConfirmationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpOrderCxlRejOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpOrderModConOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpOrderModOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpOrderModRejOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpdOrdLimitUpdateOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpreadOrderLogReportMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpreadTradeReportMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SystemInformationOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.ThrlBoardLotOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.ThrlOrderConfirmationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.ThrlOrderCxlConfirmatiMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.ThrlOrderErrorMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TradeCancelConfirmMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TradeCancelOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TradeCancelRejectMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TradeConfirmationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TradeErrorMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TradeModifyConfirmMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TradeModifyRejectMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TwolBoardLotOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TwolOrderConfirmationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TwolOrderCxlConfirmatiMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TwolOrderErrorMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.UpdateLocaldbHeaderMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.UpdateLocaldbTrailerMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.UserAddrUnlockApproveOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.UserAddrUnlockConfirmOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.UserAddrUnlockRejectOMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.UserOrderLimitUpdateOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.session.HeaderRecordMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.session.MessageRecordMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.session.TrailerRecordMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Message;

/**
 * Selects the message a Server Message Payload branch holds by its Transaction Code.
 */
public final class ServerMessagePayloadDispatch {

    private ServerMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Transaction Code selects.
     *
     * @param transactionCode the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long transactionCode, byte[] data, int offset, int end) {
        Message message;
        if (transactionCode == 1601L) {
            message = new SystemInformationOutMessage();
        } else if (transactionCode == 7321L) {
            message = new PartialSystemInformationMessage();
        } else if (transactionCode == 1821L) {
            message = new OpenOrderReportMessage();
        } else if (transactionCode == 1992L) {
            message = new SpreadOrderLogReportMessage();
        } else if (transactionCode == 1993L) {
            message = new SpreadTradeReportMessage();
        } else if (transactionCode == 2001L) {
            message = new BoardLotOutMessage();
        } else if (transactionCode == 2008L) {
            message = new NegOrderToBlMessage();
        } else if (transactionCode == 2041L) {
            message = new OrderModOutMessage();
        } else if (transactionCode == 2042L) {
            message = new OrderModRejectMessage();
        } else if (transactionCode == 2071L) {
            message = new OrderCancelOutMessage();
        } else if (transactionCode == 2072L) {
            message = new OrderCancelRejectMessage();
        } else if (transactionCode == 2073L) {
            message = new OrderConfirmationMessage();
        } else if (transactionCode == 2074L) {
            message = new OrderModConfirmationMessage();
        } else if (transactionCode == 2075L) {
            message = new OrderCancelConfirmationMessage();
        } else if (transactionCode == 2076L) {
            message = new CancelNegOrderMessage();
        } else if (transactionCode == 2170L) {
            message = new FreezeToControlMessage();
        } else if (transactionCode == 2231L) {
            message = new OrderErrorMessage();
        } else if (transactionCode == 9002L) {
            message = new BatchOrderCancelMessage();
        } else if (transactionCode == 2101L) {
            message = new SpBoardLotOutMessage();
        } else if (transactionCode == 2103L) {
            message = new TwolBoardLotOutMessage();
        } else if (transactionCode == 2105L) {
            message = new ThrlBoardLotOutMessage();
        } else if (transactionCode == 2107L) {
            message = new SpOrderCancelOutMessage();
        } else if (transactionCode == 2119L) {
            message = new SpOrderModOutMessage();
        } else if (transactionCode == 2124L) {
            message = new SpOrderConfirmationMessage();
        } else if (transactionCode == 2125L) {
            message = new TwolOrderConfirmationMessage();
        } else if (transactionCode == 2126L) {
            message = new ThrlOrderConfirmationMessage();
        } else if (transactionCode == 2127L) {
            message = new SpOrderCxlRejOutMessage();
        } else if (transactionCode == 2130L) {
            message = new SpOrderCxlConfirmationMessage();
        } else if (transactionCode == 2131L) {
            message = new TwolOrderCxlConfirmatiMessage();
        } else if (transactionCode == 2132L) {
            message = new ThrlOrderCxlConfirmatiMessage();
        } else if (transactionCode == 2133L) {
            message = new SpOrderModRejOutMessage();
        } else if (transactionCode == 2136L) {
            message = new SpOrderModConOutMessage();
        } else if (transactionCode == 2155L) {
            message = new TwolOrderErrorMessage();
        } else if (transactionCode == 2156L) {
            message = new ThrlOrderErrorMessage();
        } else if (transactionCode == 2212L) {
            message = new OnStopNotificationMessage();
        } else if (transactionCode == 2222L) {
            message = new TradeConfirmationMessage();
        } else if (transactionCode == 2282L) {
            message = new TradeCancelConfirmMessage();
        } else if (transactionCode == 2286L) {
            message = new TradeCancelRejectMessage();
        } else if (transactionCode == 2288L) {
            message = new TradeModifyRejectMessage();
        } else if (transactionCode == 2223L) {
            message = new TradeErrorMessage();
        } else if (transactionCode == 5441L) {
            message = new TradeCancelOutMessage();
        } else if (transactionCode == 2287L) {
            message = new TradeModifyConfirmMessage();
        } else if (transactionCode == 2301L) {
            message = new SignOnRequestOutMessage();
        } else if (transactionCode == 5585L) {
            message = new SignOffTraderOutMessage();
        } else if (transactionCode == 2302L) {
            message = new ErrorResponseOutMessage();
        } else if (transactionCode == 2401L) {
            message = new GrResponseMessage();
        } else if (transactionCode == 4506L) {
            message = new GiveupAppConfirmTmMessage();
        } else if (transactionCode == 4507L) {
            message = new GiveupRejConfirmTmMessage();
        } else if (transactionCode == 5428L) {
            message = new UserAddrUnlockConfirmOutMessage();
        } else if (transactionCode == 5483L) {
            message = new UserAddrUnlockApproveOutMessage();
        } else if (transactionCode == 5484L) {
            message = new UserAddrUnlockRejectOMessage();
        } else if (transactionCode == 5717L) {
            message = new BranchOrdValLimitUpdaMessage();
        } else if (transactionCode == 5731L) {
            message = new UserOrderLimitUpdateOutMessage();
        } else if (transactionCode == 5733L) {
            message = new DealerLimitUpdateOutMessage();
        } else if (transactionCode == 5741L) {
            message = new ResetUserPasswordOutMessage();
        } else if (transactionCode == 5745L) {
            message = new ColUserStatusChangeOutMessage();
        } else if (transactionCode == 5772L) {
            message = new SpdOrdLimitUpdateOutMessage();
        } else if (transactionCode == 7011L) {
            message = new HeaderRecordMessage();
        } else if (transactionCode == 7021L) {
            message = new MessageRecordMessage();
        } else if (transactionCode == 7031L) {
            message = new TrailerRecordMessage();
        } else if (transactionCode == 7307L) {
            message = new UpdateLocaldbHeaderMessage();
        } else if (transactionCode == 7308L) {
            message = new UpdateLocaldbTrailerMessage();
        } else if (transactionCode == 7325L) {
            message = new BcastAssetMstrChgMessage();
        } else if (transactionCode == 23001L) {
            message = new BoxSignOnRequestOutMessage();
        } else if (transactionCode == 20322L) {
            message = new BoxSignOffMessage();
        } else if (transactionCode == 23008L) {
            message = new SecureBoxRegistrationReMessage();
        } else if (transactionCode == 23009L) {
            message = new SecureBoxRegistrationReMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
