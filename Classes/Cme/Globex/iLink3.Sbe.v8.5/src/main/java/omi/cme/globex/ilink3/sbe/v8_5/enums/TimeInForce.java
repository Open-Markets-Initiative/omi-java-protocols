package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Specifies how long the order remains in effect
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TimeInForce {

    /**
     * Day
     */
    DAY((short) 0, "Day"),

    /**
     * Good Till Cancel
     */
    GOOD_TILL_CANCEL((short) 1, "Good Till Cancel"),

    /**
     * Fill And Kill
     */
    FILL_AND_KILL((short) 3, "Fill And Kill"),

    /**
     * Fill Or Kill
     */
    FILL_OR_KILL((short) 4, "Fill Or Kill"),

    /**
     * Good Till Date
     */
    GOOD_TILL_DATE((short) 6, "Good Till Date");

    private final short wire;

    private final String description;

    TimeInForce(short wire, String description) {
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
    public static Optional<TimeInForce> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DAY);
            case 1 -> Optional.of(GOOD_TILL_CANCEL);
            case 3 -> Optional.of(FILL_AND_KILL);
            case 4 -> Optional.of(FILL_OR_KILL);
            case 6 -> Optional.of(GOOD_TILL_DATE);
            default -> Optional.empty();
        };
    }
}
