package omi.otcmarkets.linkats.multicast.link.v4_3.enums;

import java.util.Optional;

/**
 * Asset class indicator.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AssetClass {

    /**
     * Equity security
     */
    EQUITY((short) 1, "Equity security"),

    /**
     * Fixed income security
     */
    FIXED_INCOME((short) 2, "Fixed income security");

    private final short wire;

    private final String description;

    AssetClass(short wire, String description) {
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
    public static Optional<AssetClass> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(EQUITY);
            case 2 -> Optional.of(FIXED_INCOME);
            default -> Optional.empty();
        };
    }
}
