package omi.koscom.mdcsrealtime.koscom.exture.v1_20;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.DomesticEtfEstimatedInavMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.DomesticEtfInavMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.ElwInvestmentIndicatorSensitivityMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.EtfRiskAppraisementMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.EtfTrackingErrorMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.EtnDisparateRatioMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.EtnIivMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.EtpOperatorInformationMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.EtpPdfMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.EtpTransferAgentBatchMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.GlobalEtfInavMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.GlobalEtfTrackingErrorMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.KBondMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.KOtcIssueClosingMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.KOtcMarketActionMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.KOtcMarketOperationMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.KOtcOrderFilledMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.KOtcQuoteMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.KabiBondIndexMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.KebiBondIndexMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.KisBondIndexMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.KisIndexMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.LoanTransactionAvailableQuantityMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.MkfBondIndexMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.MkfIndexJpyMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.MkfIndexMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.NicepniBondIndexMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.OtcBondTradedInfoMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.OtcBondTradesPerInstitutionMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.OtcBondTypesPerInvestorMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.SyntheticEtfConstituentsMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.messages.application.WisefnIndexMessage;
import omi.koscom.mdcsrealtime.koscom.exture.v1_20.types.Message;

// Decodes deterministic bytes into every message at a non-zero offset and requires each to
// encode back to them, to compare equal to a second decode, and to clear. Needs no capture.
public final class RoundTrip {

    private static int failures;

    private RoundTrip() {
    }

    public static void main(String[] args) {
        check(DomesticEtfEstimatedInavMessage::new);
        check(DomesticEtfInavMessage::new);
        check(ElwInvestmentIndicatorSensitivityMessage::new);
        check(EtfRiskAppraisementMessage::new);
        check(EtfTrackingErrorMessage::new);
        check(EtnDisparateRatioMessage::new);
        check(EtnIivMessage::new);
        check(EtpOperatorInformationMessage::new);
        check(EtpPdfMessage::new);
        check(EtpTransferAgentBatchMessage::new);
        check(GlobalEtfInavMessage::new);
        check(GlobalEtfTrackingErrorMessage::new);
        check(KBondMessage::new);
        check(KOtcIssueClosingMessage::new);
        check(KOtcMarketActionMessage::new);
        check(KOtcMarketOperationMessage::new);
        check(KOtcOrderFilledMessage::new);
        check(KOtcQuoteMessage::new);
        check(KabiBondIndexMessage::new);
        check(KebiBondIndexMessage::new);
        check(KisBondIndexMessage::new);
        check(KisIndexMessage::new);
        check(LoanTransactionAvailableQuantityMessage::new);
        check(MkfBondIndexMessage::new);
        check(MkfIndexJpyMessage::new);
        check(MkfIndexMessage::new);
        check(NicepniBondIndexMessage::new);
        check(OtcBondTradedInfoMessage::new);
        check(OtcBondTradesPerInstitutionMessage::new);
        check(OtcBondTypesPerInvestorMessage::new);
        check(SyntheticEtfConstituentsMessage::new);
        check(WisefnIndexMessage::new);

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
