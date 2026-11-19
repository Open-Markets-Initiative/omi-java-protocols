package omi.nasdaq.psxequities.bbo.asciiitch.v1_1_2013_2.enums;

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
     * At the start of each trading day, NASDAQ PSX disseminates stock directory messages for all active symbols in its market center system.
     */
    STOCK_DIRECTORY_MESSAGE('R', "At the start of each trading day, NASDAQ PSX disseminates stock directory messages for all active symbols in its market center system."),

    /**
     * NASDAQ OMX uses this administrative message to indicate the current trading status of a security to the trading community.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "NASDAQ OMX uses this administrative message to indicate the current trading status of a security to the trading community."),

    /**
     * Denotes the Reg SHO Short Sale Price Test Restriction (Rule 201) status for an issue: a full pre-opening spin for NASDAQ-listed issues and intraday status changes.
     */
    REG_SHO_SHORT_SALE_PRICE_TEST_RESTRICTED_INDICATOR_MESSAGE('Y', "Denotes the Reg SHO Short Sale Price Test Restriction (Rule 201) status for an issue: a full pre-opening spin for NASDAQ-listed issues and intraday status changes."),

    /**
     * PSX BBO will broadcast a real-time update every time that the exchange's best bid and offer quote is updated during the trading day.
     */
    QUOTATION_MESSAGE('Q', "PSX BBO will broadcast a real-time update every time that the exchange's best bid and offer quote is updated during the trading day.");

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
            case 'Q' -> Optional.of(QUOTATION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
