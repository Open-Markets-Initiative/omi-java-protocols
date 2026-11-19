package omi.nasdaq.psxequities.bbo.itch.v2_1_2018.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Used to signal key market or data feed control events
     */
    SYSTEM_EVENT_MESSAGE('S', "Used to signal key market or data feed control events"),

    /**
     * Market data vendors should process this message to populate the Financial Status Indicator (required display field) and the Market Category (recommended display field) for Nasdaq-listed issues.
     */
    STOCK_DIRECTORY_MESSAGE('R', "Market data vendors should process this message to populate the Financial Status Indicator (required display field) and the Market Category (recommended display field) for Nasdaq-listed issues."),

    /**
     * Nasdaq uses this administrative message to indicate the current trading status of a security to the trading community.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "Nasdaq uses this administrative message to indicate the current trading status of a security to the trading community."),

    /**
     * Nasdaq processes orders based on the most Reg SHO Restriction status value.
     */
    REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE('Y', "Nasdaq processes orders based on the most Reg SHO Restriction status value."),

    /**
     * Informs data recipients what the daily MWCB breach points are set to for the current trading day.
     */
    MWCB_DECLINE_LEVEL_MESSAGE('V', "Informs data recipients what the daily MWCB breach points are set to for the current trading day."),

    /**
     * Informs data recipients when a MWCB has breached one of the established levels
     */
    MWCB_STATUS_MESSAGE('W', "Informs data recipients when a MWCB has breached one of the established levels"),

    /**
     * Nasdaq uses this administrative message to indicate the current trading status of the three market centers operated by Nasdaq.
     */
    OPERATIONAL_HALT_MESSAGE('h', "Nasdaq uses this administrative message to indicate the current trading status of the three market centers operated by Nasdaq."),

    /**
     * PSX BBO will broadcast a real-time update every time that the exchange’s best bid and offer quote is updated during the trading day.
     */
    QUOTATION_MESSAGE('Q', "PSX BBO will broadcast a real-time update every time that the exchange\u2019s best bid and offer quote is updated during the trading day."),

    /**
     * This version of the Quotation message format will be used for Exchange Traded Managed Funds (NextShares). For this asset class, Nasdaq will support both Proxy Price and Net Asset Value (NAV) premium/discount amount for the best bid and offer.
     */
    NEXT_SHARES_QUOTATION_MESSAGE('A', "This version of the Quotation message format will be used for Exchange Traded Managed Funds (NextShares). For this asset class, Nasdaq will support both Proxy Price and Net Asset Value (NAV) premium/discount amount for the best bid and offer.");

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
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'R' -> Optional.of(STOCK_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(STOCK_TRADING_ACTION_MESSAGE);
            case 'Y' -> Optional.of(REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE);
            case 'V' -> Optional.of(MWCB_DECLINE_LEVEL_MESSAGE);
            case 'W' -> Optional.of(MWCB_STATUS_MESSAGE);
            case 'h' -> Optional.of(OPERATIONAL_HALT_MESSAGE);
            case 'Q' -> Optional.of(QUOTATION_MESSAGE);
            case 'A' -> Optional.of(NEXT_SHARES_QUOTATION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
