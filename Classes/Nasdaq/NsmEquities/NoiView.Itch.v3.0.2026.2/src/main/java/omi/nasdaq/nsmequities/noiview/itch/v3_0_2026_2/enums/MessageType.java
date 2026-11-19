package omi.nasdaq.nsmequities.noiview.itch.v3_0_2026_2.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Signals a market or data feed handler event
     */
    SYSTEM_EVENT('S', "Signals a market or data feed handler event"),

    /**
     * Disseminates stock directory info for all active symbols at start of trading day
     */
    STOCK_DIRECTORY_MESSAGE('R', "Disseminates stock directory info for all active symbols at start of trading day"),

    /**
     * Indicates the current trading status of a security
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "Indicates the current trading status of a security"),

    /**
     * Indicates Rule 201 Reg SHO restriction status for a security
     */
    REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE('Y', "Indicates Rule 201 Reg SHO restriction status for a security"),

    /**
     * Net Order Imbalance Indicator for Opening, Closing, and Extended Trading crosses
     */
    NET_ORDER_IMBALANCE_INDICATOR_MESSAGE('I', "Net Order Imbalance Indicator for Opening, Closing, and Extended Trading crosses"),

    /**
     * Indicates Nasdaq has completed its cross process for a specific security
     */
    CROSS_TRADE_MESSAGE('Q', "Indicates Nasdaq has completed its cross process for a specific security"),

    /**
     * Indicates the anticipated IPO quotation release time of a security
     */
    IPO_QUOTING_PERIOD_UPDATE_MESSAGE('K', "Indicates the anticipated IPO quotation release time of a security"),

    /**
     * Disseminated for DLCR securities once volatility test has passed
     */
    DIRECT_LISTING_WITH_CAPITAL_RAISE_PRICE_DISCOVERY_MESSAGE('O', "Disseminated for DLCR securities once volatility test has passed");

    private final char wire;

    private final String description;

    MessageType(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<MessageType> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(SYSTEM_EVENT);
            case 'R' -> Optional.of(STOCK_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(STOCK_TRADING_ACTION_MESSAGE);
            case 'Y' -> Optional.of(REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE);
            case 'I' -> Optional.of(NET_ORDER_IMBALANCE_INDICATOR_MESSAGE);
            case 'Q' -> Optional.of(CROSS_TRADE_MESSAGE);
            case 'K' -> Optional.of(IPO_QUOTING_PERIOD_UPDATE_MESSAGE);
            case 'O' -> Optional.of(DIRECT_LISTING_WITH_CAPITAL_RAISE_PRICE_DISCOVERY_MESSAGE);
            default -> Optional.empty();
        };
    }
}
