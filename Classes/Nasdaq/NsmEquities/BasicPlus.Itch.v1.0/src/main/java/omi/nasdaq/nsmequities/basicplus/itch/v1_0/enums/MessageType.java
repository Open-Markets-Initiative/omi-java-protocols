package omi.nasdaq.nsmequities.basicplus.itch.v1_0.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * System Event Messages is used to signal key market or data feed control events.
     */
    SYSTEM_EVENT_MESSAGE('S', "System Event Messages is used to signal key market or data feed control events."),

    /**
     * Consolidated BBO will broadcast a real-time update every time the Consolidated BBO across Nasdaq owned and operated exchanges is updated throughout the trading day.
     */
    CONSOLIDATED_QUOTATION_MESSAGE('Q', "Consolidated BBO will broadcast a real-time update every time the Consolidated BBO across Nasdaq owned and operated exchanges is updated throughout the trading day."),

    /**
     * Indicates a retail interest indication of the Bid, Ask or both the Bid and Ask for Nasdaq-listed securities. Populated for the Nasdaq Texas market only.
     */
    RETAIL_PRICE_IMPROVEMENT_MESSAGE('N', "Indicates a retail interest indication of the Bid, Ask or both the Bid and Ask for Nasdaq-listed securities. Populated for the Nasdaq Texas market only."),

    /**
     * Nasdaq uses this administrative message to indicate the current trading status of a security to the trading community. The message originates from the Nasdaq market center system.
     */
    TRADING_ACTION_MESSAGE('H', "Nasdaq uses this administrative message to indicate the current trading status of a security to the trading community. The message originates from the Nasdaq market center system."),

    /**
     * Reg SHO Short Sale Price Test Restricted Indicator. Sends updates for the Nasdaq market only.
     */
    REG_SHO_RESTRICTION_MESSAGE('Y', "Reg SHO Short Sale Price Test Restricted Indicator. Sends updates for the Nasdaq market only."),

    /**
     * At the start of each trading day, Nasdaq disseminates stock directory messages for all active Nasdaq and non Nasdaq listed security symbols. The Stock Directory can be sent again during the trading day if any value changes.
     */
    STOCK_DIRECTORY_MESSAGE('R', "At the start of each trading day, Nasdaq disseminates stock directory messages for all active Nasdaq and non Nasdaq listed security symbols. The Stock Directory can be sent again during the trading day if any value changes."),

    /**
     * Informs data recipients what the daily MWCB breach points are set to for the current trading day.
     */
    MWCB_DECLINE_LEVEL_MESSAGE('V', "Informs data recipients what the daily MWCB breach points are set to for the current trading day."),

    /**
     * Informs data recipients when a MWCB has breached one of the established levels.
     */
    MWCB_STATUS_MESSAGE('W', "Informs data recipients when a MWCB has breached one of the established levels."),

    /**
     * Indicates the anticipated IPO quotation release time of a security. Populated for the Nasdaq market only.
     */
    IPO_QUOTING_PERIOD_UPDATE('K', "Indicates the anticipated IPO quotation release time of a security. Populated for the Nasdaq market only."),

    /**
     * The Exchange uses this message to indicate the current Operational Status of a security to the trading community, for the three market centers operated by Nasdaq.
     */
    OPERATIONAL_HALT_MESSAGE('h', "The Exchange uses this message to indicate the current Operational Status of a security to the trading community, for the three market centers operated by Nasdaq.");

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
            case 'Q' -> Optional.of(CONSOLIDATED_QUOTATION_MESSAGE);
            case 'N' -> Optional.of(RETAIL_PRICE_IMPROVEMENT_MESSAGE);
            case 'H' -> Optional.of(TRADING_ACTION_MESSAGE);
            case 'Y' -> Optional.of(REG_SHO_RESTRICTION_MESSAGE);
            case 'R' -> Optional.of(STOCK_DIRECTORY_MESSAGE);
            case 'V' -> Optional.of(MWCB_DECLINE_LEVEL_MESSAGE);
            case 'W' -> Optional.of(MWCB_STATUS_MESSAGE);
            case 'K' -> Optional.of(IPO_QUOTING_PERIOD_UPDATE);
            case 'h' -> Optional.of(OPERATIONAL_HALT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
