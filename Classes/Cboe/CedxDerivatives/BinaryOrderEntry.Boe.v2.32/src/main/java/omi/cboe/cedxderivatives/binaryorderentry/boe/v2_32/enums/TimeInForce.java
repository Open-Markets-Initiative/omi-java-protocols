package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.enums;

import java.util.Optional;

/**
 * Defines the TimeInForce values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TimeInForce {

    /**
     * Day
     */
    DAY('0', "Day"),

    /**
     * GTC (allowed, but treated as Day)
     */
    GTC('1', "GTC (allowed, but treated as Day)"),

    /**
     * At The Open
     */
    AT_THE_OPEN('2', "At The Open"),

    /**
     * IOC (Portion not filled immediately is cancelled. Market orders are implicitly IOC.)
     */
    IOC('3', "IOC (Portion not filled immediately is cancelled. Market orders are implicitly IOC.)"),

    /**
     * FOK (Supported in New Order only; Not supported in New Complex Order.
     */
    FOK('4', "FOK (Supported in New Order only; Not supported in New Complex Order."),

    /**
     * GTD (expires at earlier of specified ExpireTime or end of day)
     */
    GTD('6', "GTD (expires at earlier of specified ExpireTime or end of day)");

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
            case '2' -> Optional.of(AT_THE_OPEN);
            case '3' -> Optional.of(IOC);
            case '4' -> Optional.of(FOK);
            case '6' -> Optional.of(GTD);
            default -> Optional.empty();
        };
    }
}
