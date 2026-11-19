package omi.euronext.optiq.dropcopygateway.sbe.v5_35.enums;

import java.util.Optional;

/**
 * Template ID used to encode the message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * DCMarketStatusChangeMessage
     */
    DC_MARKET_STATUS_CHANGE_MESSAGE(16001, "DCMarketStatusChangeMessage"),

    /**
     * DCPriceUpdateMessage
     */
    DC_PRICE_UPDATE_MESSAGE(16003, "DCPriceUpdateMessage"),

    /**
     * DCLongOrderMessage
     */
    DC_LONG_ORDER_MESSAGE(16006, "DCLongOrderMessage"),

    /**
     * DCShortOrderRejectMessage
     */
    DC_SHORT_ORDER_REJECT_MESSAGE(16010, "DCShortOrderRejectMessage"),

    /**
     * DCShortTradeCancellationMessage
     */
    DC_SHORT_TRADE_CANCELLATION_MESSAGE(16016, "DCShortTradeCancellationMessage"),

    /**
     * DCStaticCollarsMessage
     */
    DC_STATIC_COLLARS_MESSAGE(16018, "DCStaticCollarsMessage"),

    /**
     * DCTradeBustNotificationMessage
     */
    DC_TRADE_BUST_NOTIFICATION_MESSAGE(16021, "DCTradeBustNotificationMessage"),

    /**
     * DCQuoteMessage
     */
    DC_QUOTE_MESSAGE(16050, "DCQuoteMessage"),

    /**
     * DCAFQRFEMessage
     */
    DCAFQRFE_MESSAGE(16051, "DCAFQRFEMessage"),

    /**
     * DCDeclarationNewMessage
     */
    DC_DECLARATION_NEW_MESSAGE(16052, "DCDeclarationNewMessage"),

    /**
     * DCShortDeclarationRejectMessage
     */
    DC_SHORT_DECLARATION_REJECT_MESSAGE(16053, "DCShortDeclarationRejectMessage"),

    /**
     * DCShortDeclarationCancelMessage
     */
    DC_SHORT_DECLARATION_CANCEL_MESSAGE(16054, "DCShortDeclarationCancelMessage"),

    /**
     * DCShortTradeDeclarationMessage
     */
    DC_SHORT_TRADE_DECLARATION_MESSAGE(16055, "DCShortTradeDeclarationMessage"),

    /**
     * DCShortTradeDeclarationCancellationMessage
     */
    DC_SHORT_TRADE_DECLARATION_CANCELLATION_MESSAGE(16056, "DCShortTradeDeclarationCancellationMessage"),

    /**
     * DCTradeBustDeclarationMessage
     */
    DC_TRADE_BUST_DECLARATION_MESSAGE(16057, "DCTradeBustDeclarationMessage"),

    /**
     * DCTradeMessage
     */
    DC_TRADE_MESSAGE(16058, "DCTradeMessage"),

    /**
     * DCShortDeclarationFillMessage
     */
    DC_SHORT_DECLARATION_FILL_MESSAGE(16059, "DCShortDeclarationFillMessage"),

    /**
     * DCQuoteRequestMessage
     */
    DC_QUOTE_REQUEST_MESSAGE(16060, "DCQuoteRequestMessage"),

    /**
     * DCClearBookMessage
     */
    DC_CLEAR_BOOK_MESSAGE(16061, "DCClearBookMessage");

    private final int wire;

    private final String description;

    TemplateId(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
        return wire;
    }

    /**
     * Returns the description the protocol specification gives this value.
     *
     * @return the description
     */
    public String description() {
        return description;
    }

    /**
     * Returns the value with the given wire encoding.
     *
     * @param wire the encoding read from the wire
     * @return the matching value, or empty when the protocol declares no value for it
     */
    public static Optional<TemplateId> fromWire(int wire) {
        return switch (wire) {
            case 16001 -> Optional.of(DC_MARKET_STATUS_CHANGE_MESSAGE);
            case 16003 -> Optional.of(DC_PRICE_UPDATE_MESSAGE);
            case 16006 -> Optional.of(DC_LONG_ORDER_MESSAGE);
            case 16010 -> Optional.of(DC_SHORT_ORDER_REJECT_MESSAGE);
            case 16016 -> Optional.of(DC_SHORT_TRADE_CANCELLATION_MESSAGE);
            case 16018 -> Optional.of(DC_STATIC_COLLARS_MESSAGE);
            case 16021 -> Optional.of(DC_TRADE_BUST_NOTIFICATION_MESSAGE);
            case 16050 -> Optional.of(DC_QUOTE_MESSAGE);
            case 16051 -> Optional.of(DCAFQRFE_MESSAGE);
            case 16052 -> Optional.of(DC_DECLARATION_NEW_MESSAGE);
            case 16053 -> Optional.of(DC_SHORT_DECLARATION_REJECT_MESSAGE);
            case 16054 -> Optional.of(DC_SHORT_DECLARATION_CANCEL_MESSAGE);
            case 16055 -> Optional.of(DC_SHORT_TRADE_DECLARATION_MESSAGE);
            case 16056 -> Optional.of(DC_SHORT_TRADE_DECLARATION_CANCELLATION_MESSAGE);
            case 16057 -> Optional.of(DC_TRADE_BUST_DECLARATION_MESSAGE);
            case 16058 -> Optional.of(DC_TRADE_MESSAGE);
            case 16059 -> Optional.of(DC_SHORT_DECLARATION_FILL_MESSAGE);
            case 16060 -> Optional.of(DC_QUOTE_REQUEST_MESSAGE);
            case 16061 -> Optional.of(DC_CLEAR_BOOK_MESSAGE);
            default -> Optional.empty();
        };
    }
}
