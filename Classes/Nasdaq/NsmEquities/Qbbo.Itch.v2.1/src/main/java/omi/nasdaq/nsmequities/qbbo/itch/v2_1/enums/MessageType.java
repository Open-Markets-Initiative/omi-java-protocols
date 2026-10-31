package omi.nasdaq.nsmequities.qbbo.itch.v2_1.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * The System Event message is used to signal key market or data feed control events.
     */
    SYSTEM_EVENT_MESSAGE('S', "The System Event message is used to signal key market or data feed control events."),

    /**
     * At the start of each trading day, Nasdaq disseminates stock directory messages for all active symbols in its market center system.
     */
    STOCK_DIRECTORY_MESSAGE('R', "At the start of each trading day, Nasdaq disseminates stock directory messages for all active symbols in its market center system."),

    /**
     * Nasdaq uses this administrative message to indicate the current trading status of a security to the trading community.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "Nasdaq uses this administrative message to indicate the current trading status of a security to the trading community."),

    /**
     * Nasdaq introduced the Reg SHO Short Sale Price Test Restricted Indicator message format.
     */
    REG_SHO_RESTRICTION_MESSAGE('Y', "Nasdaq introduced the Reg SHO Short Sale Price Test Restricted Indicator message format."),

    /**
     * Informs data recipients what the daily MWCB breach points are set to for the current trading day.
     */
    MWCB_DECLINE_LEVEL_MESSAGE('V', "Informs data recipients what the daily MWCB breach points are set to for the current trading day."),

    /**
     * Informs data recipients when a MWCB has breached one of the established levels
     */
    MWCB_BREACH_MESSAGE('W', "Informs data recipients when a MWCB has breached one of the established levels"),

    /**
     * The Exchange uses this message to indicate the current Operational Status of a security to the trading community.
     */
    OPERATIONAL_HALT_MESSAGE('h', "The Exchange uses this message to indicate the current Operational Status of a security to the trading community."),

    /**
     * BBO products will broadcast a real-time update every time that the exchange's best bid and offer quote is updated during the trading day.
     */
    BBO_QUOTATION_MESSAGE('Q', "BBO products will broadcast a real-time update every time that the exchange's best bid and offer quote is updated during the trading day."),

    /**
     * Indicates a retail interest indication of the Bid, Ask or both the Bid and Ask for Nasdaq-listed securities.
     */
    PRICE_IMPROVEMENT_MESSAGE('N', "Indicates a retail interest indication of the Bid, Ask or both the Bid and Ask for Nasdaq-listed securities."),

    /**
     * Indicates the anticipated IPO quotation release time of a security.
     */
    IPO_QUOTING_PERIOD_UPDATE_MESSAGE('K', "Indicates the anticipated IPO quotation release time of a security.");

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
            case 'Y' -> Optional.of(REG_SHO_RESTRICTION_MESSAGE);
            case 'V' -> Optional.of(MWCB_DECLINE_LEVEL_MESSAGE);
            case 'W' -> Optional.of(MWCB_BREACH_MESSAGE);
            case 'h' -> Optional.of(OPERATIONAL_HALT_MESSAGE);
            case 'Q' -> Optional.of(BBO_QUOTATION_MESSAGE);
            case 'N' -> Optional.of(PRICE_IMPROVEMENT_MESSAGE);
            case 'K' -> Optional.of(IPO_QUOTING_PERIOD_UPDATE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
