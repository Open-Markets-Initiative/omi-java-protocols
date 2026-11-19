package omi.cboe.cfefutures.binaryorderentry.boe.v1_3_12.enums;

import java.util.Optional;

/**
 * Defines the TimeInForce values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TimeInForce {

    /**
     * Day (Expires at the end of the business day.)
     */
    DAY('0', "Day (Expires at the end of the business day.)"),

    /**
     * GTC (Good ‘till Cancel. Order remains until cancelled or contract expires).
     */
    GTC('1', "GTC (Good \u2018till Cancel. Order remains until cancelled or contract expires)."),

    /**
     * IOC (Portion not filled immediately is cancelled. Market orders are implicitly IOC.)
     */
    IOC('3', "IOC (Portion not filled immediately is cancelled. Market orders are implicitly IOC.)"),

    /**
     * FOK (An IOC where the entire size must be filled, else the order will be cancelled back)
     */
    FOK('4', "FOK (An IOC where the entire size must be filled, else the order will be cancelled back)"),

    /**
     * GTD (Good ‘till Date-Time Expires at the date-time specified in the ExpireTime field).
     */
    GTD('6', "GTD (Good \u2018till Date-Time Expires at the date-time specified in the ExpireTime field).");

    private final char wire;

    private final String description;

    TimeInForce(char wire, String description) {
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
    public static Optional<TimeInForce> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(DAY);
            case '1' -> Optional.of(GTC);
            case '3' -> Optional.of(IOC);
            case '4' -> Optional.of(FOK);
            case '6' -> Optional.of(GTD);
            default -> Optional.empty();
        };
    }
}
