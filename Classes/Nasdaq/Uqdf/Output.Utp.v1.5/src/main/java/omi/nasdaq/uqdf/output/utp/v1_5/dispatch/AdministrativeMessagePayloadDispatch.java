package omi.nasdaq.uqdf.output.utp.v1_5.dispatch;

import java.util.Optional;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.AuctionCollarMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.CrossSroTradingActionMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.GeneralAdministrativeMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.IssueSymbolDirectoryMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.LimitUpLimitDownPriceBandMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.MarketCenterTradingActionMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.MarketWideCircuitBreakerDeclineLevelMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.MarketWideCircuitBreakerStatusMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.RegulationShoShortSalePriceTestRestrictedIndicatorMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.messages.application.SessionCloseRecapMessage;
import omi.nasdaq.uqdf.output.utp.v1_5.types.Message;

/**
 * Selects the message a Administrative Message Payload branch holds by its Administrative Message Type.
 */
public final class AdministrativeMessagePayloadDispatch {

    private AdministrativeMessagePayloadDispatch() {
    }

    /**
     * Decodes the message a Administrative Message Type selects.
     *
     * @param administrativeMessageType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(char administrativeMessageType, byte[] data, int offset, int end) {
        Message message;
        if (administrativeMessageType == 'A') {
            message = new GeneralAdministrativeMessage();
        } else if (administrativeMessageType == 'H') {
            message = new CrossSroTradingActionMessage();
        } else if (administrativeMessageType == 'K') {
            message = new MarketCenterTradingActionMessage();
        } else if (administrativeMessageType == 'B') {
            message = new IssueSymbolDirectoryMessage();
        } else if (administrativeMessageType == 'V') {
            message = new RegulationShoShortSalePriceTestRestrictedIndicatorMessage();
        } else if (administrativeMessageType == 'P') {
            message = new LimitUpLimitDownPriceBandMessage();
        } else if (administrativeMessageType == 'C') {
            message = new MarketWideCircuitBreakerDeclineLevelMessage();
        } else if (administrativeMessageType == 'D') {
            message = new MarketWideCircuitBreakerStatusMessage();
        } else if (administrativeMessageType == 'E') {
            message = new AuctionCollarMessage();
        } else if (administrativeMessageType == 'R') {
            message = new SessionCloseRecapMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
