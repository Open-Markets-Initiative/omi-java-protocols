package omi.tmx.mx.solamulticast.hsvf.v1_14_1.dispatch;

import java.util.Optional;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.BeginningOfFutureOptionsSummaryMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.BeginningOfFuturesSummaryMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.BeginningOfOptionsSummaryMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.BeginningOfStrategySummaryMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.BulletinsMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.CircuitAssuranceMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.EndOfSalesMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.EndOfTransmissionMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.FutureDeliverablesMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.FutureOptionsInstrumentKeysMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.FutureOptionsMarketDepthMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.FutureOptionsQuoteMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.FutureOptionsRequestForQuoteMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.FutureOptionsSummaryMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.FutureOptionsTradeCancellationMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.FutureOptionsTradeMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.FutureRequestForQuoteMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.FutureTradeCancellationMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.FuturesInstrumentKeysMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.FuturesMarketDepthMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.FuturesQuoteMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.FuturesSummaryMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.FuturesTradeCorrectionMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.FuturesTradeMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.GroupStatusMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.GroupStatusStrategiesMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.InstrumentScheduleNoticeFutureMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.InstrumentScheduleNoticeFuturesOptionMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.InstrumentScheduleNoticeOptionMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.InstrumentScheduleNoticeStrategyMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.OptionAuctionBeginningMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.OptionAuctionEndingMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.OptionInitialAndImprovementOrderMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.OptionInstrumentKeysMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.OptionMarketDepthMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.OptionQuoteMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.OptionRequestForQuoteMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.OptionSummaryMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.OptionTradeCancellationMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.OptionTradeMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.StartOfDayMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.StrategyAuctionBeginningMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.StrategyAuctionEndingMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.StrategyInitialAndImprovementOrderMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.StrategyInstrumentKeysMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.StrategyMarketDepthMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.StrategyQuoteMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.StrategyRequestForQuoteMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.StrategySummaryMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.StrategyTradeCancellationMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.StrategyTradeMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.TickTableMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.messages.application.UnderlyingInstrumentKeysMessage;
import omi.tmx.mx.solamulticast.hsvf.v1_14_1.types.Message;

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
        } else if ("D ".equals(messageType)) {
            message = new OptionRequestForQuoteMessage();
        } else if ("DB".equals(messageType)) {
            message = new FutureOptionsRequestForQuoteMessage();
        } else if ("DF".equals(messageType)) {
            message = new FutureRequestForQuoteMessage();
        } else if ("DS".equals(messageType)) {
            message = new StrategyRequestForQuoteMessage();
        } else if ("E ".equals(messageType)) {
            message = new InstrumentScheduleNoticeOptionMessage();
        } else if ("EB".equals(messageType)) {
            message = new InstrumentScheduleNoticeFuturesOptionMessage();
        } else if ("EF".equals(messageType)) {
            message = new InstrumentScheduleNoticeFutureMessage();
        } else if ("ES".equals(messageType)) {
            message = new InstrumentScheduleNoticeStrategyMessage();
        } else if ("F ".equals(messageType)) {
            message = new OptionQuoteMessage();
        } else if ("FB".equals(messageType)) {
            message = new FutureOptionsQuoteMessage();
        } else if ("FF".equals(messageType)) {
            message = new FuturesQuoteMessage();
        } else if ("FS".equals(messageType)) {
            message = new StrategyQuoteMessage();
        } else if ("H ".equals(messageType)) {
            message = new OptionMarketDepthMessage();
        } else if ("HB".equals(messageType)) {
            message = new FutureOptionsMarketDepthMessage();
        } else if ("HF".equals(messageType)) {
            message = new FuturesMarketDepthMessage();
        } else if ("HS".equals(messageType)) {
            message = new StrategyMarketDepthMessage();
        } else if ("I ".equals(messageType)) {
            message = new OptionTradeCancellationMessage();
        } else if ("IB".equals(messageType)) {
            message = new FutureOptionsTradeCancellationMessage();
        } else if ("IF".equals(messageType)) {
            message = new FutureTradeCancellationMessage();
        } else if ("IS".equals(messageType)) {
            message = new StrategyTradeCancellationMessage();
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
        } else if ("M ".equals(messageType)) {
            message = new OptionAuctionBeginningMessage();
        } else if ("MS".equals(messageType)) {
            message = new StrategyAuctionBeginningMessage();
        } else if ("N ".equals(messageType)) {
            message = new OptionSummaryMessage();
        } else if ("NB".equals(messageType)) {
            message = new FutureOptionsSummaryMessage();
        } else if ("NF".equals(messageType)) {
            message = new FuturesSummaryMessage();
        } else if ("NS".equals(messageType)) {
            message = new StrategySummaryMessage();
        } else if ("O ".equals(messageType)) {
            message = new OptionInitialAndImprovementOrderMessage();
        } else if ("OS".equals(messageType)) {
            message = new StrategyInitialAndImprovementOrderMessage();
        } else if ("Q ".equals(messageType)) {
            message = new BeginningOfOptionsSummaryMessage();
        } else if ("QB".equals(messageType)) {
            message = new BeginningOfFutureOptionsSummaryMessage();
        } else if ("QF".equals(messageType)) {
            message = new BeginningOfFuturesSummaryMessage();
        } else if ("QS".equals(messageType)) {
            message = new BeginningOfStrategySummaryMessage();
        } else if ("T ".equals(messageType)) {
            message = new OptionAuctionEndingMessage();
        } else if ("TS".equals(messageType)) {
            message = new StrategyAuctionEndingMessage();
        } else if ("XF".equals(messageType)) {
            message = new FuturesTradeCorrectionMessage();
        } else if ("GR".equals(messageType)) {
            message = new GroupStatusMessage();
        } else if ("GS".equals(messageType)) {
            message = new GroupStatusStrategiesMessage();
        } else if ("KF".equals(messageType)) {
            message = new FutureDeliverablesMessage();
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
        } else if ("SD".equals(messageType)) {
            message = new StartOfDayMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
