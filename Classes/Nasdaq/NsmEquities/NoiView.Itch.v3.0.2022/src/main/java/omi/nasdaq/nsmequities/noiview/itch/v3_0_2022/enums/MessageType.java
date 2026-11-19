package omi.nasdaq.nsmequities.noiview.itch.v3_0_2022.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Reflects the number of seconds past midnight that the Timestamp message was generated.
     */
    SYSTEM_EVENT_MESSAGE('S', "Reflects the number of seconds past midnight that the Timestamp message was generated."),

    /**
     * At the start of each trading day, Nasdaq disseminates stock directory messages for all active symbols in the Nasdaq execution system.
     */
    STOCK_DIRECTORY_MESSAGE('R', "At the start of each trading day, Nasdaq disseminates stock directory messages for all active symbols in the Nasdaq execution system."),

    /**
     * NASDAQ uses this administrative message to indicate the current trading status of a security to the trading community.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "NASDAQ uses this administrative message to indicate the current trading status of a security to the trading community."),

    /**
     * NASDAQ processes orders based on the most Reg SHO Restriction status value.
     */
    REG_SHO_RESTRICTION_MESSAGE('Y', "NASDAQ processes orders based on the most Reg SHO Restriction status value."),

    /**
     * Nasdaq disseminates NOII data at 5-second intervals in the minutes leading up to the Nasdaq Opening and Closing Crosses as well as the IPO/Halt Crosses
     */
    NOII_MESSAGE('I', "Nasdaq disseminates NOII data at 5-second intervals in the minutes leading up to the Nasdaq Opening and Closing Crosses as well as the IPO/Halt Crosses"),

    /**
     * Cross Trade message indicates that Nasdaq has completed its cross process for a specific security. Nasdaq sends out a Cross Trade message for all active issues in the system following the Opening, Closing and EMC cross events. Firms may use the Cross Trade message to determine when the cross for each security has been completed.
     */
    CROSS_TRADE_MESSAGE('Q', "Cross Trade message indicates that Nasdaq has completed its cross process for a specific security. Nasdaq sends out a Cross Trade message for all active issues in the system following the Opening, Closing and EMC cross events. Firms may use the Cross Trade message to determine when the cross for each security has been completed."),

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
            case 'I' -> Optional.of(NOII_MESSAGE);
            case 'Q' -> Optional.of(CROSS_TRADE_MESSAGE);
            case 'K' -> Optional.of(IPO_QUOTING_PERIOD_UPDATE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
