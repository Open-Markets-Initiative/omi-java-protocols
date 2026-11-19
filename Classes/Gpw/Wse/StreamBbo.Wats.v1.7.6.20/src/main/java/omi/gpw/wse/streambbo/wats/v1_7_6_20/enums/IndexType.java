package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Index product classification
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum IndexType {

    /**
     * WSE index from the main or alternative markets
     */
    W((short) 1, "WSE index from the main or alternative markets"),

    /**
     * External index
     */
    Z((short) 2, "External index"),

    /**
     * Another WSE information product
     */
    V((short) 3, "Another WSE information product"),

    /**
     * WSE strategy dividend point index
     */
    M((short) 4, "WSE strategy dividend point index"),

    /**
     * WSE strategy index of short type
     */
    S((short) 5, "WSE strategy index of short type"),

    /**
     * WSE strategy index of leverage type
     */
    L((short) 6, "WSE strategy index of leverage type");

    private final short wire;

    private final String description;

    IndexType(short wire, String description) {
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
    public static Optional<IndexType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(W);
            case 2 -> Optional.of(Z);
            case 3 -> Optional.of(V);
            case 4 -> Optional.of(M);
            case 5 -> Optional.of(S);
            case 6 -> Optional.of(L);
            default -> Optional.empty();
        };
    }
}
