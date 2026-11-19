package omi.tmx.mx.solamulticast.hsvf.v1_11.dispatch;

import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.BeginningOfFutureOptionsSummaryMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.BeginningOfFuturesSummaryMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.BeginningOfOptionsSummaryMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.BeginningOfStrategySummaryMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.BulletinsMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.CircuitAssuranceMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.EndOfSalesMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.EndOfTransmissionMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.FutureOptionsInstrumentKeysMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.FutureOptionsMarketDepthMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.FutureOptionsQuoteMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.FutureOptionsRfqMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.FutureOptionsSummaryMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.FutureOptionsTradeCancellationMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.FutureOptionsTradeCorrectionMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.FutureOptionsTradeMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.FuturesInstrumentKeysMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.FuturesMarketDepthMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.FuturesQuoteMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.FuturesRfqMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.FuturesSummaryMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.FuturesTradeCancellationMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.FuturesTradeCorrectionMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.FuturesTradeMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.GroupStatusMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.GroupStatusStrategiesMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.InstrumentScheduleNoticeFutureMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.InstrumentScheduleNoticeFuturesOptionMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.InstrumentScheduleNoticeOptionMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.InstrumentScheduleNoticeStrategyMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.InstrumentScheduleNoticeSwapFutureMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.OptionInstrumentKeysMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.OptionMarketDepthMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.OptionQuoteMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.OptionRfqMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.OptionSummaryMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.OptionTradeCancellationMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.OptionTradeCorrectionMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.OptionTradeMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.StrategyInstrumentKeysMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.StrategyMarketDepthMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.StrategyQuoteMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.StrategyRfqMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.StrategySummaryMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.StrategyTradeCancellationMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.StrategyTradeCorrectionMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.StrategyTradeMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.SwapFutureBeginningOfSummaryMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.SwapFutureInstrumentKeysMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.SwapFutureMarketDepthMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.SwapFutureQuoteMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.SwapFutureRfqMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.SwapFutureSummaryMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.SwapFutureTradeCancellationMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.SwapFutureTradeCorrectionMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.SwapFutureTradeMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.TickTableMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.TimebeatMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.messages.application.UnderlyingInstrumentKeysMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_11.types.Message;

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
        if ("C ".equals(messageType)) {
            message = new OptionTradeMessage();
        } else if ("CB".equals(messageType)) {
            message = new FutureOptionsTradeMessage();
        } else if ("CF".equals(messageType)) {
            message = new FuturesTradeMessage();
        } else if ("CS".equals(messageType)) {
            message = new StrategyTradeMessage();
        } else if ("CW".equals(messageType)) {
            message = new SwapFutureTradeMessage();
        } else if ("D ".equals(messageType)) {
            message = new OptionRfqMessage();
        } else if ("DB".equals(messageType)) {
            message = new FutureOptionsRfqMessage();
        } else if ("DF".equals(messageType)) {
            message = new FuturesRfqMessage();
        } else if ("DS".equals(messageType)) {
            message = new StrategyRfqMessage();
        } else if ("DW".equals(messageType)) {
            message = new SwapFutureRfqMessage();
        } else if ("E ".equals(messageType)) {
            message = new InstrumentScheduleNoticeOptionMessage();
        } else if ("EB".equals(messageType)) {
            message = new InstrumentScheduleNoticeFuturesOptionMessage();
        } else if ("EF".equals(messageType)) {
            message = new InstrumentScheduleNoticeFutureMessage();
        } else if ("ES".equals(messageType)) {
            message = new InstrumentScheduleNoticeStrategyMessage();
        } else if ("EW".equals(messageType)) {
            message = new InstrumentScheduleNoticeSwapFutureMessage();
        } else if ("F ".equals(messageType)) {
            message = new OptionQuoteMessage();
        } else if ("FB".equals(messageType)) {
            message = new FutureOptionsQuoteMessage();
        } else if ("FF".equals(messageType)) {
            message = new FuturesQuoteMessage();
        } else if ("FS".equals(messageType)) {
            message = new StrategyQuoteMessage();
        } else if ("FW".equals(messageType)) {
            message = new SwapFutureQuoteMessage();
        } else if ("H ".equals(messageType)) {
            message = new OptionMarketDepthMessage();
        } else if ("HB".equals(messageType)) {
            message = new FutureOptionsMarketDepthMessage();
        } else if ("HF".equals(messageType)) {
            message = new FuturesMarketDepthMessage();
        } else if ("HS".equals(messageType)) {
            message = new StrategyMarketDepthMessage();
        } else if ("HW".equals(messageType)) {
            message = new SwapFutureMarketDepthMessage();
        } else if ("I ".equals(messageType)) {
            message = new OptionTradeCancellationMessage();
        } else if ("IB".equals(messageType)) {
            message = new FutureOptionsTradeCancellationMessage();
        } else if ("IF".equals(messageType)) {
            message = new FuturesTradeCancellationMessage();
        } else if ("IS".equals(messageType)) {
            message = new StrategyTradeCancellationMessage();
        } else if ("IW".equals(messageType)) {
            message = new SwapFutureTradeCancellationMessage();
        } else if ("J ".equals(messageType)) {
            message = new OptionInstrumentKeysMessage();
        } else if ("JB".equals(messageType)) {
            message = new FutureOptionsInstrumentKeysMessage();
        } else if ("JE".equals(messageType)) {
            message = new UnderlyingInstrumentKeysMessage();
        } else if ("JF".equals(messageType)) {
            message = new FuturesInstrumentKeysMessage();
        } else if ("JS".equals(messageType)) {
            message = new StrategyInstrumentKeysMessage();
        } else if ("JW".equals(messageType)) {
            message = new SwapFutureInstrumentKeysMessage();
        } else if ("N ".equals(messageType)) {
            message = new OptionSummaryMessage();
        } else if ("NB".equals(messageType)) {
            message = new FutureOptionsSummaryMessage();
        } else if ("NF".equals(messageType)) {
            message = new FuturesSummaryMessage();
        } else if ("NS".equals(messageType)) {
            message = new StrategySummaryMessage();
        } else if ("NW".equals(messageType)) {
            message = new SwapFutureSummaryMessage();
        } else if ("Q ".equals(messageType)) {
            message = new BeginningOfOptionsSummaryMessage();
        } else if ("QB".equals(messageType)) {
            message = new BeginningOfFutureOptionsSummaryMessage();
        } else if ("QF".equals(messageType)) {
            message = new BeginningOfFuturesSummaryMessage();
        } else if ("QS".equals(messageType)) {
            message = new BeginningOfStrategySummaryMessage();
        } else if ("QW".equals(messageType)) {
            message = new SwapFutureBeginningOfSummaryMessage();
        } else if ("X ".equals(messageType)) {
            message = new OptionTradeCorrectionMessage();
        } else if ("XB".equals(messageType)) {
            message = new FutureOptionsTradeCorrectionMessage();
        } else if ("XF".equals(messageType)) {
            message = new FuturesTradeCorrectionMessage();
        } else if ("XS".equals(messageType)) {
            message = new StrategyTradeCorrectionMessage();
        } else if ("XW".equals(messageType)) {
            message = new SwapFutureTradeCorrectionMessage();
        } else if ("GR".equals(messageType)) {
            message = new GroupStatusMessage();
        } else if ("GS".equals(messageType)) {
            message = new GroupStatusStrategiesMessage();
        } else if ("L ".equals(messageType)) {
            message = new BulletinsMessage();
        } else if ("S ".equals(messageType)) {
            message = new EndOfSalesMessage();
        } else if ("TT".equals(messageType)) {
            message = new TickTableMessage();
        } else if ("U ".equals(messageType)) {
            message = new EndOfTransmissionMessage();
        } else if ("V ".equals(messageType)) {
            message = new CircuitAssuranceMessage();
        } else if ("Z ".equals(messageType)) {
            message = new TimebeatMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
