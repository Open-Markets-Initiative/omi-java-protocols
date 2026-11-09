package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the MdBookType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MdBookType {

    /**
     * Top of book
     */
    TOP_OF_BOOK((short) 1, "Top of book"),

    /**
     * Price depth (aggregated)
     */
    PRICE_DEPTH((short) 2, "Price depth (aggregated)"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    MdBookType(short wire, String description) {
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
    public static Optional<MdBookType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(TOP_OF_BOOK);
            case 2 -> Optional.of(PRICE_DEPTH);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
