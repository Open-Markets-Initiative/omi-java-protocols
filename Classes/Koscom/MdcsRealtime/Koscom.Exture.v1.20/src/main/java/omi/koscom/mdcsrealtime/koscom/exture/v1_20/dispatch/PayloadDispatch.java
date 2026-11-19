package omi.koscom.mdcsrealtime.koscom.exture.v1_20.dispatch;

import java.util.Optional;
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

/**
 * Selects the message a Payload branch holds by its Tr Code.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Tr Code selects.
     *
     * @param trCode the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(String trCode, byte[] data, int offset, int end) {
        Message message;
        if ("A6013".equals(trCode)) {
            message = new KOtcIssueClosingMessage();
        } else if ("A7013".equals(trCode)) {
            message = new KOtcMarketOperationMessage();
        } else if ("G5013".equals(trCode)) {
            message = new KOtcMarketActionMessage();
        } else if ("A2013".equals(trCode)) {
            message = new KOtcQuoteMessage();
        } else if ("A3013".equals(trCode)) {
            message = new KOtcOrderFilledMessage();
        } else if ("J6077".equals(trCode)) {
            message = new OtcBondTradedInfoMessage();
        } else if ("J7077".equals(trCode)) {
            message = new OtcBondTradesPerInstitutionMessage();
        } else if ("C1077".equals(trCode)) {
            message = new OtcBondTypesPerInvestorMessage();
        } else if ("L9077".equals(trCode)) {
            message = new KBondMessage();
        } else if ("E2000".equals(trCode)) {
            message = new MkfIndexMessage();
        } else if ("O9000".equals(trCode)) {
            message = new MkfIndexJpyMessage();
        } else if ("P3000".equals(trCode)) {
            message = new WisefnIndexMessage();
        } else if ("BP000".equals(trCode)) {
            message = new KisIndexMessage();
        } else if ("K0000".equals(trCode)) {
            message = new MkfBondIndexMessage();
        } else if ("L6000".equals(trCode)) {
            message = new KisBondIndexMessage();
        } else if ("K6000".equals(trCode)) {
            message = new KebiBondIndexMessage();
        } else if ("Q6000".equals(trCode)) {
            message = new KabiBondIndexMessage();
        } else if ("CE000".equals(trCode)) {
            message = new NicepniBondIndexMessage();
        } else if ("BV03S".equals(trCode)) {
            message = new DomesticEtfInavMessage();
        } else if ("BW03S".equals(trCode)) {
            message = new DomesticEtfEstimatedInavMessage();
        } else if ("L503S".equals(trCode)) {
            message = new GlobalEtfInavMessage();
        } else if ("P603S".equals(trCode)) {
            message = new EtfTrackingErrorMessage();
        } else if ("P703S".equals(trCode)) {
            message = new GlobalEtfTrackingErrorMessage();
        } else if ("F803S".equals(trCode)) {
            message = new EtpPdfMessage();
        } else if ("M803S".equals(trCode)) {
            message = new EtpOperatorInformationMessage();
        } else if ("M805S".equals(trCode)) {
            message = new EtpOperatorInformationMessage();
        } else if ("M801Q".equals(trCode)) {
            message = new EtpOperatorInformationMessage();
        } else if ("N803S".equals(trCode)) {
            message = new EtpTransferAgentBatchMessage();
        } else if ("N805S".equals(trCode)) {
            message = new EtpTransferAgentBatchMessage();
        } else if ("N801Q".equals(trCode)) {
            message = new EtpTransferAgentBatchMessage();
        } else if ("Q403S".equals(trCode)) {
            message = new EtfRiskAppraisementMessage();
        } else if ("Q503S".equals(trCode)) {
            message = new SyntheticEtfConstituentsMessage();
        } else if ("C702S".equals(trCode)) {
            message = new ElwInvestmentIndicatorSensitivityMessage();
        } else if ("S304S".equals(trCode)) {
            message = new EtnIivMessage();
        } else if ("X404S".equals(trCode)) {
            message = new EtnDisparateRatioMessage();
        } else if ("CC000".equals(trCode)) {
            message = new LoanTransactionAvailableQuantityMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
