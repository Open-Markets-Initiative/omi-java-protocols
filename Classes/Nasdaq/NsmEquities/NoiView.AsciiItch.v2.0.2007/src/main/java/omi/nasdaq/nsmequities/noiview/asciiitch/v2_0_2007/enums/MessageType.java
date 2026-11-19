package omi.nasdaq.nsmequities.noiview.asciiitch.v2_0_2007.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * The system event message type is used to signal a market or data feed handler event.
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message type is used to signal a market or data feed handler event."),

    /**
     * At the start of each trading day, NASDAQ disseminates stock directory messages for all active and cross eligible symbols.
     */
    STOCK_DIRECTORY_MESSAGE('R', "At the start of each trading day, NASDAQ disseminates stock directory messages for all active and cross eligible symbols."),

    /**
     * NASDAQ uses this administrative message to indicate the current trading status of a security to the trading community.
     */
    STOCK_TRADING_ACTION_MESSAGE('H', "NASDAQ uses this administrative message to indicate the current trading status of a security to the trading community."),

    /**
     * NASDAQ disseminates NOII data at 5-second intervals in the minutes leading up to the NASDAQ Opening and Closing Crosses as well as the IPO/Halt Crosses.
     */
    NOII_MESSAGE('I', "NASDAQ disseminates NOII data at 5-second intervals in the minutes leading up to the NASDAQ Opening and Closing Crosses as well as the IPO/Halt Crosses.");

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
            case 'I' -> Optional.of(NOII_MESSAGE);
            default -> Optional.empty();
        };
    }
}
