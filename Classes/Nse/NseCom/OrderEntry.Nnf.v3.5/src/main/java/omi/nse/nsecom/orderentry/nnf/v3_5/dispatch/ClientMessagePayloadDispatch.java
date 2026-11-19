package omi.nse.nsecom.orderentry.nnf.v3_5.dispatch;

import java.util.Optional;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.BoardLotInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.BoxSignOnRequestInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.BranchOrdValLimitUpdateInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.ColUserStatusChangeInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.DownloadRequestMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.GrRequestMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.NormalOrdLimitUpdateInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.OrderCancelInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.OrderModInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.PriceModInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.ResetUserPasswordInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.SecureBoxRegistrationRequestInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.SignOffTraderInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.SignOnRequestInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.SpBoardLotInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.SpOrderCancelInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.SpOrderModInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.SpreadOrdLimitUpdateInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.SystemInformationInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.ThrlBoardLotInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.TradeCancelInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.TradeModInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.TwolBoardLotInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.UpdateLocaldbInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.UserAddrUnlockInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.messages.application.UserOrdValLimitUpdateInMessage;
import omi.nse.nsecom.orderentry.nnf.v3_5.types.Message;

/**
 * Selects the message a Client Message Payload branch holds by its Transaction Code.
 */
public final class ClientMessagePayloadDispatch {

    private ClientMessagePayloadDispatch() {
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
        if (transactionCode == 1600L) {
            message = new SystemInformationInMessage();
        } else if (transactionCode == 2000L) {
            message = new BoardLotInMessage();
        } else if (transactionCode == 2040L) {
            message = new OrderModInMessage();
        } else if (transactionCode == 2070L) {
            message = new OrderCancelInMessage();
        } else if (transactionCode == 2013L) {
            message = new PriceModInMessage();
        } else if (transactionCode == 2100L) {
            message = new SpBoardLotInMessage();
        } else if (transactionCode == 2102L) {
            message = new TwolBoardLotInMessage();
        } else if (transactionCode == 2104L) {
            message = new ThrlBoardLotInMessage();
        } else if (transactionCode == 2106L) {
            message = new SpOrderCancelInMessage();
        } else if (transactionCode == 2118L) {
            message = new SpOrderModInMessage();
        } else if (transactionCode == 5440L) {
            message = new TradeCancelInMessage();
        } else if (transactionCode == 5445L) {
            message = new TradeModInMessage();
        } else if (transactionCode == 2300L) {
            message = new SignOnRequestInMessage();
        } else if (transactionCode == 5584L) {
            message = new SignOffTraderInMessage();
        } else if (transactionCode == 2400L) {
            message = new GrRequestMessage();
        } else if (transactionCode == 5427L) {
            message = new UserAddrUnlockInMessage();
        } else if (transactionCode == 5716L) {
            message = new BranchOrdValLimitUpdateInMessage();
        } else if (transactionCode == 5730L) {
            message = new UserOrdValLimitUpdateInMessage();
        } else if (transactionCode == 5732L) {
            message = new NormalOrdLimitUpdateInMessage();
        } else if (transactionCode == 5771L) {
            message = new SpreadOrdLimitUpdateInMessage();
        } else if (transactionCode == 5740L) {
            message = new ResetUserPasswordInMessage();
        } else if (transactionCode == 5744L) {
            message = new ColUserStatusChangeInMessage();
        } else if (transactionCode == 7000L) {
            message = new DownloadRequestMessage();
        } else if (transactionCode == 7300L) {
            message = new UpdateLocaldbInMessage();
        } else if (transactionCode == 23000L) {
            message = new BoxSignOnRequestInMessage();
        } else if (transactionCode == 23008L) {
            message = new SecureBoxRegistrationRequestInMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
