package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Product identification type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ProductIdentificationType {

    /**
     * Not applicable
     */
    NOT_APPLICABLE((short) 1, "Not applicable"),

    /**
     * Financial instrument's ISIN
     */
    ISIN((short) 2, "Financial instrument's ISIN");

    private final short wire;

    private final String description;

    ProductIdentificationType(short wire, String description) {
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
    public static Optional<ProductIdentificationType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NOT_APPLICABLE);
            case 2 -> Optional.of(ISIN);
            default -> Optional.empty();
        };
    }
}
