package omi.lseg.turquoise.level1incremental.gtp.v26_3.enums;

import java.util.Optional;

/**
 * The type of the BTF Order:
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CrossType {

    /**
     * Internal Btf
     */
    INTERNAL_BTF((short) 6, "Internal Btf"),

    /**
     * Committed Btf
     */
    COMMITTED_BTF((short) 8, "Committed Btf");

    private final short wire;

    private final String description;

    CrossType(short wire, String description) {
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
    public static Optional<CrossType> fromWire(short wire) {
        return switch (wire) {
            case 6 -> Optional.of(INTERNAL_BTF);
            case 8 -> Optional.of(COMMITTED_BTF);
            default -> Optional.empty();
        };
    }
}
