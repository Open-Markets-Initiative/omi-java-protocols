package omi.bse.bseindia.eti.fbe.v1_6_14.enums;

import java.util.Optional;

/**
 * Defines the RrmState values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RrmState {

    /**
     * No RRM
     */
    NO_RRM((short) 0, "No RRM"),

    /**
     * In RRM
     */
    IN_RRM((short) 1, "In RRM"),

    /**
     * Out Of RRM
     */
    OUT_OF_RRM((short) 2, "Out Of RRM"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    RrmState(short wire, String description) {
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
    public static Optional<RrmState> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NO_RRM);
            case 1 -> Optional.of(IN_RRM);
            case 2 -> Optional.of(OUT_OF_RRM);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
