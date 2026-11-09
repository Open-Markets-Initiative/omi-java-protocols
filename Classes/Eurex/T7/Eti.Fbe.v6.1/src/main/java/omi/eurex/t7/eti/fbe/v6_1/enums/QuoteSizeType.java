package omi.eurex.t7.eti.fbe.v6_1.enums;

import java.util.Optional;

/**
 * Defines the QuoteSizeType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteSizeType {

    /**
     * Total Size (Quote Modification)
     */
    TOTAL_SIZE((short) 1, "Total Size (Quote Modification)"),

    /**
     * Open Size(Quote Entry)
     */
    OPEN_SIZE((short) 2, "Open Size(Quote Entry)"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    QuoteSizeType(short wire, String description) {
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
    public static Optional<QuoteSizeType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(TOTAL_SIZE);
            case 2 -> Optional.of(OPEN_SIZE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
