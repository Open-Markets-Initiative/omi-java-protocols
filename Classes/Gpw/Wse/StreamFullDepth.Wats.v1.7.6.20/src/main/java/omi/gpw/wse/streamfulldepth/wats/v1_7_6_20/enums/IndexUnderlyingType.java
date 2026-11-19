package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Underlying type of index
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum IndexUnderlyingType {

    /**
     * Not applicable
     */
    NOT_APPLICABLE((short) 1, "Not applicable"),

    /**
     * Index
     */
    INDEX((short) 2, "Index"),

    /**
     * Reference Rate
     */
    REFERENCE_RATE((short) 3, "Reference Rate");

    private final short wire;

    private final String description;

    IndexUnderlyingType(short wire, String description) {
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
    public static Optional<IndexUnderlyingType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NOT_APPLICABLE);
            case 2 -> Optional.of(INDEX);
            case 3 -> Optional.of(REFERENCE_RATE);
            default -> Optional.empty();
        };
    }
}
