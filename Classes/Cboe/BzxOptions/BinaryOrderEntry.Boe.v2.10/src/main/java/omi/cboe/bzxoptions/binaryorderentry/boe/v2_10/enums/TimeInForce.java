package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.enums;

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
     * Gtc
     */
    GTC('1', "Gtc"),

    /**
     * Ato
     */
    ATO('2', "Ato"),

    /**
     * Ioc
     */
    IOC('3', "Ioc"),

    /**
     * Fok
     */
    FOK('4', "Fok"),

    /**
     * Gtd
     */
    GTD('6', "Gtd"),

    /**
     * Atc
     */
    ATC('7', "Atc");

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
            case '2' -> Optional.of(ATO);
            case '3' -> Optional.of(IOC);
            case '4' -> Optional.of(FOK);
            case '6' -> Optional.of(GTD);
            case '7' -> Optional.of(ATC);
            default -> Optional.empty();
        };
    }
}
