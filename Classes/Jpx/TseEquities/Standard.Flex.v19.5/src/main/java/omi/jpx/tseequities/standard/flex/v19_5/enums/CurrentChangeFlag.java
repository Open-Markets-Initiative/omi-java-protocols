package omi.jpx.tseequities.standard.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates whether this has changed or not.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CurrentChangeFlag {

    /**
     * Execution Price is higher than last one.
     */
    CHANGED_GOING_UP('1', "Execution Price is higher than last one."),

    /**
     * Execution Price is lower than last one.
     */
    CHANGED_GOING_DOWN('2', "Execution Price is lower than last one."),

    /**
     * Execution Price is same as last one.
     */
    CHANGED_SAME('3', "Execution Price is same as last one."),

    /**
     * Execution with no last price or ZARABA Close.
     */
    CHANGED_OTHER_THAN_ABOVE('4', "Execution with no last price or ZARABA Close."),

    /**
     * Space is set when this tag is sent as Backup Information or All-Day Information.
     */
    OTHER_THAN_THE_ABOVE(' ', "Space is set when this tag is sent as Backup Information or All-Day Information.");

    private final char wire;

    private final String description;

    CurrentChangeFlag(char wire, String description) {
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
    public static Optional<CurrentChangeFlag> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(CHANGED_GOING_UP);
            case '2' -> Optional.of(CHANGED_GOING_DOWN);
            case '3' -> Optional.of(CHANGED_SAME);
            case '4' -> Optional.of(CHANGED_OTHER_THAN_ABOVE);
            case ' ' -> Optional.of(OTHER_THAN_THE_ABOVE);
            default -> Optional.empty();
        };
    }
}
