package omi.cboe.c1options.marketdatafeed.csm.v1_4_2.dispatch;

import java.util.Optional;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.messages.application.CurrentMarketRefreshMessage;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.messages.application.CurrentMarketUpdateMessage;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.messages.application.ExpectedOpeningPriceAndSizeMessage;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.messages.application.HeartbeatMessage;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.messages.application.IndexValueMessage;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.messages.application.MarketDataControlMessage;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.messages.application.MarketDataRefreshMessage;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.messages.application.RecapUpdateMessage;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.messages.application.SecurityDefinitionMessage;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.messages.application.SettlementValueMessage;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.messages.application.SummaryMessage;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.messages.application.TickerMessage;
import omi.cboe.c1options.marketdatafeed.csm.v1_4_2.types.Message;

/**
 * Selects the message a Payload branch holds by its Template Id.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Template Id selects.
     *
     * @param templateId the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long templateId, byte[] data, int offset, int end) {
        Message message;
        if (templateId == 13L) {
            message = new SecurityDefinitionMessage();
        } else if (templateId == 11L) {
            message = new CurrentMarketRefreshMessage();
        } else if (templateId == 20L) {
            message = new MarketDataRefreshMessage();
        } else if (templateId == 12L) {
            message = new CurrentMarketUpdateMessage();
        } else if (templateId == 21L) {
            message = new RecapUpdateMessage();
        } else if (templateId == 14L) {
            message = new TickerMessage();
        } else if (templateId == 15L) {
            message = new ExpectedOpeningPriceAndSizeMessage();
        } else if (templateId == 22L) {
            message = new IndexValueMessage();
        } else if (templateId == 23L) {
            message = new SettlementValueMessage();
        } else if (templateId == 24L) {
            message = new SummaryMessage();
        } else if (templateId == 25L) {
            message = new MarketDataControlMessage();
        } else if (templateId == 16L) {
            message = new HeartbeatMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
