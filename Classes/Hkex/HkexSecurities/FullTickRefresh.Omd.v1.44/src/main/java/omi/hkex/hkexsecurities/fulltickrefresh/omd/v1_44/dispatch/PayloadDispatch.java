package omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_44.dispatch;

import java.util.Optional;
import omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_44.messages.application.AddOrderMessage;
import omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_44.messages.application.CurrencyRateMessage;
import omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_44.messages.application.IndicativeEquilibriumPriceMessage;
import omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_44.messages.application.LiquidityProviderMessage;
import omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_44.messages.application.MarketDefinitionMessage;
import omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_44.messages.application.OrderImbalanceMessage;
import omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_44.messages.application.ReferencePriceMessage;
import omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_44.messages.application.RefreshCompleteMessage;
import omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_44.messages.application.SecurityDefinitionMessage;
import omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_44.messages.application.SecurityStatusMessage;
import omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_44.messages.application.TradingSessionStatusMessage;
import omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_44.messages.application.VcmTriggerMessage;
import omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_44.types.Message;

/**
 * Selects the message a Payload branch holds by its Msg Type.
 */
public final class PayloadDispatch {

    private PayloadDispatch() {
    }

    /**
     * Decodes the message a Msg Type selects.
     *
     * @param msgType the value read ahead of the message
     * @param data the bytes holding the message
     * @param offset where the message starts
     * @param end the index just past the last byte the message may read
     * @return the selected message, decoded where its bytes allow, or empty when the value selects no message this library decodes
     */
    public static Optional<Message> decode(long msgType, byte[] data, int offset, int end) {
        Message message;
        if (msgType == 30L) {
            message = new AddOrderMessage();
        } else if (msgType == 41L) {
            message = new IndicativeEquilibriumPriceMessage();
        } else if (msgType == 56L) {
            message = new OrderImbalanceMessage();
        } else if (msgType == 10L) {
            message = new MarketDefinitionMessage();
        } else if (msgType == 11L) {
            message = new SecurityDefinitionMessage();
        } else if (msgType == 13L) {
            message = new LiquidityProviderMessage();
        } else if (msgType == 14L) {
            message = new CurrencyRateMessage();
        } else if (msgType == 43L) {
            message = new ReferencePriceMessage();
        } else if (msgType == 203L) {
            message = new RefreshCompleteMessage();
        } else if (msgType == 20L) {
            message = new TradingSessionStatusMessage();
        } else if (msgType == 21L) {
            message = new SecurityStatusMessage();
        } else if (msgType == 23L) {
            message = new VcmTriggerMessage();
        } else {
            return Optional.empty();
        }

        message.parseFrom(data, offset, end);
        return Optional.of(message);
    }
}
