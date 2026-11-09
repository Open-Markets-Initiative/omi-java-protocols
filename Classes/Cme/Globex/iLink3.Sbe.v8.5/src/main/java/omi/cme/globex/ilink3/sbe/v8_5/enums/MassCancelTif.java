package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * If provided then only orders with this qualifier will be cancelled. If absent then all Day &amp; GT orders will be cancelled
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MassCancelTif {

    /**
     * If provided then only orders with this qualifier will be cancelled. If absent then all Day &amp; GT orders will be cancelled
     */
    NO_VALUE((short) 255, "If provided then only orders with this qualifier will be cancelled. If absent then all Day & GT orders will be cancelled"),

    /**
     * Day
     */
    DAY((short) 0, "Day"),

    /**
     * Good Till Cancel
     */
    GOOD_TILL_CANCEL((short) 1, "Good Till Cancel"),

    /**
     * Good Till Date
     */
    GOOD_TILL_DATE((short) 6, "Good Till Date");

    private final short wire;

    private final String description;

    MassCancelTif(short wire, String description) {
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
    public static Optional<MassCancelTif> fromWire(short wire) {
        return switch (wire) {
            case 255 -> Optional.of(NO_VALUE);
            case 0 -> Optional.of(DAY);
            case 1 -> Optional.of(GOOD_TILL_CANCEL);
            case 6 -> Optional.of(GOOD_TILL_DATE);
            default -> Optional.empty();
        };
    }
}
