package omi.cnsx.cse2.multicast.mmd.v1_6.enums;

import java.util.Optional;

/**
 * Stock Group.
 *
 * <p>Backed by long. Values correspond to the wire integer encoding.</p>
 */
public enum StockGroup {

    /**
     * Stock Group.
     */
    CSE_LISTED_SECURITIES(0x1L, "Stock Group."),

    /**
     * Stock Group.
     */
    OTHER_CANADIAN_LISTED_SECURITIES(0x2L, "Stock Group.");

    private final long wire;

    private final String description;

    StockGroup(long wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public long wire() {
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
    public static Optional<StockGroup> fromWire(long wire) {
        if (wire == 1L) {
            return Optional.of(CSE_LISTED_SECURITIES);
        }
        if (wire == 2L) {
            return Optional.of(OTHER_CANADIAN_LISTED_SECURITIES);
        }
        return Optional.empty();
    }
}
