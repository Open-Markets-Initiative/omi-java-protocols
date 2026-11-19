package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Level of the index
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum IndexLevelCode {

    /**
     * Closing index value from previous session (reference index)
     */
    PREVIOUS_CLOSING_VALUE((short) 1, "Closing index value from previous session (reference index)"),

    /**
     * Theoretical opening index before opening the session
     */
    THEORETICAL_VALUE_BEFORE_OPENING((short) 2, "Theoretical opening index before opening the session"),

    /**
     * Theoretical value of the index before its opening
     */
    VALUE_BEFORE_OPENING((short) 3, "Theoretical value of the index before its opening"),

    /**
     * Index opening value
     */
    OPENING_VALUE((short) 4, "Index opening value"),

    /**
     * Current index value
     */
    CURRENT_VALUE((short) 5, "Current index value"),

    /**
     * Preliminary closing value
     */
    PRE_CLOSING_VALUE((short) 6, "Preliminary closing value"),

    /**
     * Closing index value
     */
    CLOSING_VALUE((short) 7, "Closing index value"),

    /**
     * Index value without opening
     */
    VALUE_WITHOUT_OPENING((short) 8, "Index value without opening");

    private final short wire;

    private final String description;

    IndexLevelCode(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<IndexLevelCode> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(PREVIOUS_CLOSING_VALUE);
            case 2 -> Optional.of(THEORETICAL_VALUE_BEFORE_OPENING);
            case 3 -> Optional.of(VALUE_BEFORE_OPENING);
            case 4 -> Optional.of(OPENING_VALUE);
            case 5 -> Optional.of(CURRENT_VALUE);
            case 6 -> Optional.of(PRE_CLOSING_VALUE);
            case 7 -> Optional.of(CLOSING_VALUE);
            case 8 -> Optional.of(VALUE_WITHOUT_OPENING);
            default -> Optional.empty();
        };
    }
}
