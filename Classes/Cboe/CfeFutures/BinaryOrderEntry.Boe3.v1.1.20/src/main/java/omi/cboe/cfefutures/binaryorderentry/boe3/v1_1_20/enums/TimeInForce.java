package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.enums;

import java.util.Optional;

/**
 * Time In Force
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TimeInForce {

    /**
     * Expires at the end of the business day
     */
    DAY('0', "Expires at the end of the business day"),

    /**
     * Order remains until cancelled or contract expires
     */
    GTC('1', "Order remains until cancelled or contract expires"),

    /**
     * Portion not filled immediately is cancelled
     */
    IOC('3', "Portion not filled immediately is cancelled"),

    /**
     * An IOC where the entire size must be filled, else the order will be cancelled back
     */
    FOK('4', "An IOC where the entire size must be filled, else the order will be cancelled back"),

    /**
     * Expires at the date-time specified in the ExpireTime field
     */
    GTD('6', "Expires at the date-time specified in the ExpireTime field");

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
