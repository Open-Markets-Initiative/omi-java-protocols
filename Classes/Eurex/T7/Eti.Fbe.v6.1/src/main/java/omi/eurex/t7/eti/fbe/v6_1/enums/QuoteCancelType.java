package omi.eurex.t7.eti.fbe.v6_1.enums;

import java.util.Optional;

/**
 * Defines the QuoteCancelType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteCancelType {

    /**
     * Cancel All Quotes
     */
    CANCEL_ALL_QUOTES((short) 4, "Cancel All Quotes"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    QuoteCancelType(short wire, String description) {
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
    public static Optional<QuoteCancelType> fromWire(short wire) {
        return switch (wire) {
            case 4 -> Optional.of(CANCEL_ALL_QUOTES);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
