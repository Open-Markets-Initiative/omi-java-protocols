package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.enums;

import java.util.Optional;

/**
 * timeInForce
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TimeInForce {

    /**
     * DAY
     */
    DAY('0', "DAY"),

    /**
     * GOOD_TILL_CANCEL
     */
    GOOD_TILL_CANCEL('1', "GOOD_TILL_CANCEL"),

    /**
     * IMMEDIATE_OR_CANCEL
     */
    IMMEDIATE_OR_CANCEL('3', "IMMEDIATE_OR_CANCEL"),

    /**
     * FILL_OR_KILL
     */
    FILL_OR_KILL('4', "FILL_OR_KILL"),

    /**
     * GOOD_TILL_DATE
     */
    GOOD_TILL_DATE('6', "GOOD_TILL_DATE"),

    /**
     * AT_THE_CLOSE
     */
    AT_THE_CLOSE('7', "AT_THE_CLOSE"),

    /**
     * GOOD_FOR_AUCTION
     */
    GOOD_FOR_AUCTION('A', "GOOD_FOR_AUCTION");

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
            case '1' -> Optional.of(GOOD_TILL_CANCEL);
            case '3' -> Optional.of(IMMEDIATE_OR_CANCEL);
            case '4' -> Optional.of(FILL_OR_KILL);
            case '6' -> Optional.of(GOOD_TILL_DATE);
            case '7' -> Optional.of(AT_THE_CLOSE);
            case 'A' -> Optional.of(GOOD_FOR_AUCTION);
            default -> Optional.empty();
        };
    }
}
