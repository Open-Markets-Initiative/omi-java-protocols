package omi.cme.globex.derived.sbe.v12_0.enums;

import java.util.Optional;

/**
 * Previous day elements, Global or Regional, will contain the value 4 - entry from previous business date
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OpenCloseSettlFlag {

    /**
     * Current day entry
     */
    CURRENT_DAY((short) 0, "Current day entry"),

    /**
     * Element entry from previous business day
     */
    PREVIOUS_DAY((short) 4, "Element entry from previous business day");

    private final short wire;

    private final String description;

    OpenCloseSettlFlag(short wire, String description) {
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
    public static Optional<OpenCloseSettlFlag> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(CURRENT_DAY);
            case 4 -> Optional.of(PREVIOUS_DAY);
            default -> Optional.empty();
        };
    }
}
