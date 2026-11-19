package omi.nse.nsecd.orderentry.nnf.v6_3;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.BatchOrderCancelMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.BcastAssetMstrChgMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.BoardLotInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.BoardLotOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.BoxSignOffMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.BoxSignOnRequestInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.BoxSignOnRequestOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.BranchOrdValLimitUpdaMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.BranchOrdValLimitUpdateInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.CancelNegOrderMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.ColUserStatusChangeInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.ColUserStatusChangeOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.DealerLimitUpdateOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.DownloadRequestMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.ErrorResponseOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.FreezeToControlMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.GiveupAppConfirmTmMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.GiveupRejConfirmTmMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.GrRequestMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.GrResponseMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.NegOrderToBlMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.NormalOrdLimitUpdateInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OnStopNotificationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OpenOrderReportMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OrderCancelConfirmationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OrderCancelInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OrderCancelOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OrderCancelRejectMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OrderConfirmationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OrderErrorMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OrderModConfirmationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OrderModInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OrderModOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.OrderModRejectMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.PartialSystemInformationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.PriceModInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.ResetUserPasswordInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.ResetUserPasswordOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SecureBoxRegistrationReMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SignOffTraderInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SignOffTraderOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SignOnRequestInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SignOnRequestOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpBoardLotInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpBoardLotOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpOrderCancelInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpOrderCancelOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpOrderConfirmationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpOrderCxlConfirmationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpOrderCxlRejOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpOrderModConOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpOrderModInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpOrderModOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpOrderModRejOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpdOrdLimitUpdateOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpreadOrdLimitUpdateInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpreadOrderLogReportMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SpreadTradeReportMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SystemInformationInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.SystemInformationOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.ThrlBoardLotInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.ThrlBoardLotOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.ThrlOrderConfirmationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.ThrlOrderCxlConfirmatiMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.ThrlOrderErrorMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TradeCancelConfirmMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TradeCancelInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TradeCancelOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TradeCancelRejectMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TradeConfirmationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TradeErrorMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TradeModInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TradeModifyConfirmMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TradeModifyRejectMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TwolBoardLotInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TwolBoardLotOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TwolOrderConfirmationMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TwolOrderCxlConfirmatiMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.TwolOrderErrorMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.UpdateLocaldbHeaderMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.UpdateLocaldbInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.UpdateLocaldbTrailerMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.UserAddrUnlockApproveOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.UserAddrUnlockConfirmOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.UserAddrUnlockInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.UserAddrUnlockRejectOMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.UserOrdValLimitUpdateInMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.application.UserOrderLimitUpdateOutMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.session.HeaderRecordMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.session.MessageRecordMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.messages.session.TrailerRecordMessage;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(BatchOrderCancelMessage::new);
        check(BcastAssetMstrChgMessage::new);
        check(BoardLotInMessage::new);
        check(BoardLotOutMessage::new);
        check(BoxSignOffMessage::new);
        check(BoxSignOnRequestInMessage::new);
        check(BoxSignOnRequestOutMessage::new);
        check(BranchOrdValLimitUpdaMessage::new);
        check(BranchOrdValLimitUpdateInMessage::new);
        check(CancelNegOrderMessage::new);
        check(ColUserStatusChangeInMessage::new);
        check(ColUserStatusChangeOutMessage::new);
        check(DealerLimitUpdateOutMessage::new);
        check(DownloadRequestMessage::new);
        check(ErrorResponseOutMessage::new);
        check(FreezeToControlMessage::new);
        check(GiveupAppConfirmTmMessage::new);
        check(GiveupRejConfirmTmMessage::new);
        check(GrRequestMessage::new);
        check(GrResponseMessage::new);
        check(NegOrderToBlMessage::new);
        check(NormalOrdLimitUpdateInMessage::new);
        check(OnStopNotificationMessage::new);
        check(OpenOrderReportMessage::new);
        check(OrderCancelConfirmationMessage::new);
        check(OrderCancelInMessage::new);
        check(OrderCancelOutMessage::new);
        check(OrderCancelRejectMessage::new);
        check(OrderConfirmationMessage::new);
        check(OrderErrorMessage::new);
        check(OrderModConfirmationMessage::new);
        check(OrderModInMessage::new);
        check(OrderModOutMessage::new);
        check(OrderModRejectMessage::new);
        check(PartialSystemInformationMessage::new);
        check(PriceModInMessage::new);
        check(ResetUserPasswordInMessage::new);
        check(ResetUserPasswordOutMessage::new);
        check(SecureBoxRegistrationReMessage::new);
        check(SignOffTraderInMessage::new);
        check(SignOffTraderOutMessage::new);
        check(SignOnRequestInMessage::new);
        check(SignOnRequestOutMessage::new);
        check(SpBoardLotInMessage::new);
        check(SpBoardLotOutMessage::new);
        check(SpOrderCancelInMessage::new);
        check(SpOrderCancelOutMessage::new);
        check(SpOrderConfirmationMessage::new);
        check(SpOrderCxlConfirmationMessage::new);
        check(SpOrderCxlRejOutMessage::new);
        check(SpOrderModConOutMessage::new);
        check(SpOrderModInMessage::new);
        check(SpOrderModOutMessage::new);
        check(SpOrderModRejOutMessage::new);
        check(SpdOrdLimitUpdateOutMessage::new);
        check(SpreadOrdLimitUpdateInMessage::new);
        check(SpreadOrderLogReportMessage::new);
        check(SpreadTradeReportMessage::new);
        check(SystemInformationInMessage::new);
        check(SystemInformationOutMessage::new);
        check(ThrlBoardLotInMessage::new);
        check(ThrlBoardLotOutMessage::new);
        check(ThrlOrderConfirmationMessage::new);
        check(ThrlOrderCxlConfirmatiMessage::new);
        check(ThrlOrderErrorMessage::new);
        check(TradeCancelConfirmMessage::new);
        check(TradeCancelInMessage::new);
        check(TradeCancelOutMessage::new);
        check(TradeCancelRejectMessage::new);
        check(TradeConfirmationMessage::new);
        check(TradeErrorMessage::new);
        check(TradeModInMessage::new);
        check(TradeModifyConfirmMessage::new);
        check(TradeModifyRejectMessage::new);
        check(TwolBoardLotInMessage::new);
        check(TwolBoardLotOutMessage::new);
        check(TwolOrderConfirmationMessage::new);
        check(TwolOrderCxlConfirmatiMessage::new);
        check(TwolOrderErrorMessage::new);
        check(UpdateLocaldbHeaderMessage::new);
        check(UpdateLocaldbInMessage::new);
        check(UpdateLocaldbTrailerMessage::new);
        check(UserAddrUnlockApproveOutMessage::new);
        check(UserAddrUnlockConfirmOutMessage::new);
        check(UserAddrUnlockInMessage::new);
        check(UserAddrUnlockRejectOMessage::new);
        check(UserOrdValLimitUpdateInMessage::new);
        check(UserOrderLimitUpdateOutMessage::new);
        check(HeaderRecordMessage::new);
        check(MessageRecordMessage::new);
        check(TrailerRecordMessage::new);

        if (failures > 0) {
            System.out.println(failures + " FAILED");
            System.exit(1);
        }
        System.out.println("PASS");
    }

    private static void check(Supplier<Message> create) {
        Message message = create.get();
        String name = message.getClass().getSimpleName();
        int length = message.byteLength();
        Random random = new Random(name.hashCode());
        int offset = 1 + random.nextInt(7);
        byte[] wire = new byte[offset + length + 3];
        random.nextBytes(wire);
        byte[] bytes = Arrays.copyOfRange(wire, offset, offset + length);

        expect(name + " decodes", message.parseFrom(wire, offset) && message.isDecoded());
        expect(name + " keeps its bytes", message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));
        expect(name + " encodes to its bytes", Arrays.equals(message.toBytes(), bytes));
        Arrays.fill(wire, (byte) 0x5A);
        expect(name + " keeps its bytes when the buffer is reused", Arrays.equals(message.toBytes(), bytes) && message.raw().map(raw -> Arrays.equals(raw, bytes)).orElse(false));

        Message again = create.get();
        again.parseFrom(bytes, 0);
        expect(name + " equals a second decode", message.equals(again) && message.hashCode() == again.hashCode());

        message.clear();
        expect(name + " clears", !message.isDecoded() && message.raw().isEmpty());
        expect(name + " refuses a short buffer", length == 0 || !message.parseFrom(bytes, 1));
    }

    private static void expect(String check, boolean passed) {
        if (!passed) {
            failures++;
            System.out.println("FAIL " + check);
        }
    }
}
