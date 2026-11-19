package omi.nyse.texasequities.bqt.xdp.v2_4_a.enums;

import java.util.Optional;

/**
 * Data completeness indicator.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Complete {

    /**
     * Normal Data Is Complete
     */
    NORMAL_DATA_IS_COMPLETE((short) 0, "Normal Data Is Complete"),

    /**
     * An Unrecoverable Gap Was Experienced In The Input Stream So Data May Not Be Complete
     */
    AN_UNRECOVERABLE_GAP_WAS_EXPERIENCED_IN_THE_INPUT_STREAM_SO_DATA_MAY_NOT_BE_COMPLETE((short) 1, "An Unrecoverable Gap Was Experienced In The Input Stream So Data May Not Be Complete");

    private final short wire;

    private final String description;

    Complete(short wire, String description) {
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
    public static Optional<Complete> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NORMAL_DATA_IS_COMPLETE);
            case 1 -> Optional.of(AN_UNRECOVERABLE_GAP_WAS_EXPERIENCED_IN_THE_INPUT_STREAM_SO_DATA_MAY_NOT_BE_COMPLETE);
            default -> Optional.empty();
        };
    }
}
