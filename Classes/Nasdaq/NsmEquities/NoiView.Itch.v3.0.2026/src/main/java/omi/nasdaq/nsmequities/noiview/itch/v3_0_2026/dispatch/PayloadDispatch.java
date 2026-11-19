package omi.nasdaq.nsmequities.noiview.itch.v3_0_2026.dispatch;

import java.util.Optional;
import omi.nasdaq.nsmequities.noiview.itch.v3_0_2026.messages.application.CrossTradeMessage;
import omi.nasdaq.nsmequities.noiview.itch.v3_0_2026.messages.application.DirectListingWithCapitalRaisePriceDiscoveryMessage;
import omi.nasdaq.nsmequities.noiview.itch.v3_0_2026.messages.application.IpoQuotingPeriodUpdateMessage;
import omi.nasdaq.nsmequities.noiview.itch.v3_0_2026.messages.application.NetOrderImbalanceIndicatorMessage;
import omi.nasdaq.nsmequities.noiview.itch.v3_0_2026.messages.application.RegShoShortSalePriceTestRestrictedIndicatorMessage;
import omi.nasdaq.nsmequities.noiview.itch.v3_0_2026.messages.application.StockDirectoryMessage;
import omi.nasdaq.nsmequities.noiview.itch.v3_0_2026.messages.application.StockTradingActionMessage;
import omi.nasdaq.nsmequities.noiview.itch.v3_0_2026.messages.application.SystemEvent;
import omi.nasdaq.nsmequities.noiview.itch.v3_0_2026.types.Message;

/**
 * Selects the message a Payload branch holds by its Message Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
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
            message = new SystemEvent();
        } else if (messageType == 'R') {
            message = new StockDirectoryMessage();
        } else if (messageType == 'H') {
            message = new StockTradingActionMessage();
        } else if (messageType == 'Y') {
            message = new RegShoShortSalePriceTestRestrictedIndicatorMessage();
        } else if (messageType == 'I') {
            message = new NetOrderImbalanceIndicatorMessage();
        } else if (messageType == 'Q') {
            message = new CrossTradeMessage();
        } else if (messageType == 'K') {
            message = new IpoQuotingPeriodUpdateMessage();
        } else if (messageType == 'O') {
            message = new DirectListingWithCapitalRaisePriceDiscoveryMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
