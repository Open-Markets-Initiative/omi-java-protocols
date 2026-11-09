package omi.cboe.bzxequities.binaryorderentry.boe.v2_3.enums;

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
     * At The Open
     */
    AT_THE_OPEN('2', "At The Open"),

    /**
     * Ioc
     */
    IOC('3', "Ioc"),

    /**
     * Fok
     */
    FOK('4', "Fok"),

    /**
     * Gtx
     */
    GTX('5', "Gtx"),

    /**
     * Gtd
     */
    GTD('6', "Gtd"),

    /**
     * At The Close
     */
    AT_THE_CLOSE('7', "At The Close"),

    /**
     * Pre
     */
    PRE('E', "Pre"),

    /**
     * Rho
     */
    RHO('R', "Rho"),

    /**
     * Ptd
     */
    PTD('T', "Ptd"),

    /**
     * Ptx
     */
    PTX('X', "Ptx");

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
            case '5' -> Optional.of(GTX);
            case '6' -> Optional.of(GTD);
            case '7' -> Optional.of(AT_THE_CLOSE);
            case 'E' -> Optional.of(PRE);
            case 'R' -> Optional.of(RHO);
            case 'T' -> Optional.of(PTD);
            case 'X' -> Optional.of(PTX);
            default -> Optional.empty();
        };
    }
}
