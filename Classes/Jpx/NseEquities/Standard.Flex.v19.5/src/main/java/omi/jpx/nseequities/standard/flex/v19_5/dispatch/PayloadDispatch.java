package omi.jpx.nseequities.standard.flex.v19_5.dispatch;

import java.util.Optional;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.ControlMessage;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.MarketOrderMessage;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.OpenHighLowAndCurrentPriceMessage;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.OverUnderMessage;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.ParityMessage;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.Quote10Message;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.Quote1Message;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.Quote2Message;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.Quote3Message;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.Quote4Message;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.Quote5Message;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.Quote6Message;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.Quote7Message;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.Quote8Message;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.Quote9Message;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.StatusInformationMessage;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.TradingVolumeMessage;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.TurnoverMessage;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.UpdateNoMessage;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.VwapMessage;
import omi.jpx.nseequities.standard.flex.v19_5.messages.application.YieldMessage;
import omi.jpx.nseequities.standard.flex.v19_5.types.Message;

/**
 * Selects the message a Payload branch holds by its Tag ID.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Tag ID selects.
     *
     * @param tagId the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(String tagId, byte[] data, int offset, int end) {
        Message message;
        if ("NO".equals(tagId)) {
            message = new UpdateNoMessage();
        } else if ("ST".equals(tagId)) {
            message = new StatusInformationMessage();
        } else if ("4P".equals(tagId)) {
            message = new OpenHighLowAndCurrentPriceMessage();
        } else if ("Q1".equals(tagId)) {
            message = new Quote1Message();
        } else if ("Q2".equals(tagId)) {
            message = new Quote2Message();
        } else if ("Q3".equals(tagId)) {
            message = new Quote3Message();
        } else if ("Q4".equals(tagId)) {
            message = new Quote4Message();
        } else if ("Q5".equals(tagId)) {
            message = new Quote5Message();
        } else if ("Q6".equals(tagId)) {
            message = new Quote6Message();
        } else if ("Q7".equals(tagId)) {
            message = new Quote7Message();
        } else if ("Q8".equals(tagId)) {
            message = new Quote8Message();
        } else if ("Q9".equals(tagId)) {
            message = new Quote9Message();
        } else if ("QA".equals(tagId)) {
            message = new Quote10Message();
        } else if ("QM".equals(tagId)) {
            message = new MarketOrderMessage();
        } else if ("QO".equals(tagId)) {
            message = new OverUnderMessage();
        } else if ("VL".equals(tagId)) {
            message = new TradingVolumeMessage();
        } else if ("VA".equals(tagId)) {
            message = new TurnoverMessage();
        } else if ("VW".equals(tagId)) {
            message = new VwapMessage();
        } else if ("PA".equals(tagId)) {
            message = new ParityMessage();
        } else if ("YI".equals(tagId)) {
            message = new YieldMessage();
        } else if ("LC".equals(tagId)) {
            message = new ControlMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
