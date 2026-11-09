package omi.iex.iexequities.tops.iextp.v1_64.dispatch;

import java.util.Optional;
import omi.iex.iexequities.tops.iextp.v1_64.messages.application.AuctionInformationMessage;
import omi.iex.iexequities.tops.iextp.v1_64.messages.application.OfficialPriceMessage;
import omi.iex.iexequities.tops.iextp.v1_64.messages.application.OperationalHaltStatusMessage;
import omi.iex.iexequities.tops.iextp.v1_64.messages.application.QuoteUpdateMessage;
import omi.iex.iexequities.tops.iextp.v1_64.messages.application.SecurityDirectoryMessage;
import omi.iex.iexequities.tops.iextp.v1_64.messages.application.SecurityEventMessage;
import omi.iex.iexequities.tops.iextp.v1_64.messages.application.ShortSalePriceTestStatusMessage;
import omi.iex.iexequities.tops.iextp.v1_64.messages.application.SystemEventMessage;
import omi.iex.iexequities.tops.iextp.v1_64.messages.application.TradeBreakMessage;
import omi.iex.iexequities.tops.iextp.v1_64.messages.application.TradeReportMessage;
import omi.iex.iexequities.tops.iextp.v1_64.messages.application.TradingStatusMessage;
import omi.iex.iexequities.tops.iextp.v1_64.types.Message;

/**
 * Selects the message a Message Data branch holds by its Message Type.
 */
public final class MessageDataDispatch {

    private MessageDataDispatch() {
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
    public static Optional<Message> decode(char messageType, byte[] data, int offset, int end) {
        Message message;
        if (messageType == 'S') {
            message = new SystemEventMessage();
        } else if (messageType == 'D') {
            message = new SecurityDirectoryMessage();
        } else if (messageType == 'H') {
            message = new TradingStatusMessage();
        } else if (messageType == 'O') {
            message = new OperationalHaltStatusMessage();
        } else if (messageType == 'P') {
            message = new ShortSalePriceTestStatusMessage();
        } else if (messageType == 'E') {
            message = new SecurityEventMessage();
        } else if (messageType == 'Q') {
            message = new QuoteUpdateMessage();
        } else if (messageType == 'T') {
            message = new TradeReportMessage();
        } else if (messageType == 'X') {
            message = new OfficialPriceMessage();
        } else if (messageType == 'B') {
            message = new TradeBreakMessage();
        } else if (messageType == 'A') {
            message = new AuctionInformationMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
