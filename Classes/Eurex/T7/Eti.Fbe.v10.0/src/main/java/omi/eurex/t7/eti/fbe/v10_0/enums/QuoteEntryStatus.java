package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the QuoteEntryStatus values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteEntryStatus {

    /**
     * Accepted with warning
     */
    ACCEPTED((short) 0, "Accepted with warning"),

    /**
     * Rejected
     */
    REJECTED((short) 5, "Rejected"),

    /**
     * Removed from Market
     */
    REMOVEDAND_REJECTED((short) 6, "Removed from Market"),

    /**
     * Pending
     */
    PENDING((short) 10, "Pending"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    QuoteEntryStatus(short wire, String description) {
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
    public static Optional<QuoteEntryStatus> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(ACCEPTED);
            case 5 -> Optional.of(REJECTED);
            case 6 -> Optional.of(REMOVEDAND_REJECTED);
            case 10 -> Optional.of(PENDING);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
