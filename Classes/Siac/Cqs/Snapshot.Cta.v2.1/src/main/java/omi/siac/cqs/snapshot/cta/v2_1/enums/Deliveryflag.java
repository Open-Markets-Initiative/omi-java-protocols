package omi.siac.cqs.snapshot.cta.v2_1.enums;

import java.util.Optional;

/**
 * Used to identify all messages associated with a specific Snapshot request
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Deliveryflag {

    /**
     * First Block of Snapshot sequence
     */
    FIRST_BLOCK((short) 1, "First Block of Snapshot sequence"),

    /**
     * Intermediate Block of Snapshot sequence
     */
    INTERMEDIATE_BLOCK((short) 2, "Intermediate Block of Snapshot sequence"),

    /**
     * Last Block of Snapshot sequence
     */
    LAST_BLOCK((short) 3, "Last Block of Snapshot sequence"),

    /**
     * Only one Block in Snapshot sequence
     */
    ONLY_ONE_BLOCK((short) 4, "Only one Block in Snapshot sequence");

    private final short wire;

    private final String description;

    Deliveryflag(short wire, String description) {
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
    public static Optional<Deliveryflag> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(FIRST_BLOCK);
            case 2 -> Optional.of(INTERMEDIATE_BLOCK);
            case 3 -> Optional.of(LAST_BLOCK);
            case 4 -> Optional.of(ONLY_ONE_BLOCK);
            default -> Optional.empty();
        };
    }
}
