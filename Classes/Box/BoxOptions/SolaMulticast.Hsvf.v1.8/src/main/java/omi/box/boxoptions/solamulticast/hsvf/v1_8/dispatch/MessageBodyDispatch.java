package omi.box.boxoptions.solamulticast.hsvf.v1_8.dispatch;

import java.util.Optional;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.BeginningOfComplexOrderSummaryMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.BeginningOfOptionsSummaryMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.BulletinsMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.CircuitAssuranceMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.ComplexOrderImprovementProcessBeginningMessageMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.ComplexOrderInitialAndImprovementOrderMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.ComplexOrderInstrumentKeysMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.ComplexOrderInstrumentTradeMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.ComplexOrderMarketDepthMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.ComplexOrderMarketSheetInitialAndImprovementOrderMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.ComplexOrderQuoteMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.ComplexOrderSummaryMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.ComplexOrderTradeCancellationMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.EndOfSalesMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.EndOfTransmissionMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.GroupOpeningTimeMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.GroupStatusMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.InitialAndImprovementOrderMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.MarketSheetInitialAndImprovementOrderMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.OptionImprovementProcessBeginningMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.OptionInstrumentKeysMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.OptionMarketDepthMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.OptionQuoteMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.OptionRequestForQuoteMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.OptionSummaryMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.OptionTradeCancellationMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.OptionTradeMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.StrategiesGroupStatusMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.messages.application.SystemTimestampMessage;
import omi.box.boxoptions.solamulticast.hsvf.v1_8.types.Message;

/**
 * Selects the message a Message Body branch holds by its Message Type.
 */
public final class MessageBodyDispatch {

    private MessageBodyDispatch() {
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
    public static Optional<Message> decode(String messageType, byte[] data, int offset, int end) {
        Message message;
        if ("U ".equals(messageType)) {
            message = new EndOfTransmissionMessage();
        } else if ("V ".equals(messageType)) {
            message = new CircuitAssuranceMessage();
        } else if ("Z ".equals(messageType)) {
            message = new SystemTimestampMessage();
        } else if ("C ".equals(messageType)) {
            message = new OptionTradeMessage();
        } else if ("CS".equals(messageType)) {
            message = new ComplexOrderInstrumentTradeMessage();
        } else if ("D ".equals(messageType)) {
            message = new OptionRequestForQuoteMessage();
        } else if ("F ".equals(messageType)) {
            message = new OptionQuoteMessage();
        } else if ("FS".equals(messageType)) {
            message = new ComplexOrderQuoteMessage();
        } else if ("GC".equals(messageType)) {
            message = new GroupOpeningTimeMessage();
        } else if ("GR".equals(messageType)) {
            message = new GroupStatusMessage();
        } else if ("GS".equals(messageType)) {
            message = new StrategiesGroupStatusMessage();
        } else if ("H ".equals(messageType)) {
            message = new OptionMarketDepthMessage();
        } else if ("HS".equals(messageType)) {
            message = new ComplexOrderMarketDepthMessage();
        } else if ("I ".equals(messageType)) {
            message = new OptionTradeCancellationMessage();
        } else if ("IS".equals(messageType)) {
            message = new ComplexOrderTradeCancellationMessage();
        } else if ("J ".equals(messageType)) {
            message = new OptionInstrumentKeysMessage();
        } else if ("JS".equals(messageType)) {
            message = new ComplexOrderInstrumentKeysMessage();
        } else if ("L ".equals(messageType)) {
            message = new BulletinsMessage();
        } else if ("N ".equals(messageType)) {
            message = new OptionSummaryMessage();
        } else if ("NS".equals(messageType)) {
            message = new ComplexOrderSummaryMessage();
        } else if ("Q ".equals(messageType)) {
            message = new BeginningOfOptionsSummaryMessage();
        } else if ("QS".equals(messageType)) {
            message = new BeginningOfComplexOrderSummaryMessage();
        } else if ("S ".equals(messageType)) {
            message = new EndOfSalesMessage();
        } else if ("M ".equals(messageType)) {
            message = new OptionImprovementProcessBeginningMessage();
        } else if ("MS".equals(messageType)) {
            message = new ComplexOrderImprovementProcessBeginningMessageMessage();
        } else if ("O ".equals(messageType)) {
            message = new MarketSheetInitialAndImprovementOrderMessage();
        } else if ("OS".equals(messageType)) {
            message = new ComplexOrderMarketSheetInitialAndImprovementOrderMessage();
        } else if ("T ".equals(messageType)) {
            message = new InitialAndImprovementOrderMessage();
        } else if ("TS".equals(messageType)) {
            message = new ComplexOrderInitialAndImprovementOrderMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
