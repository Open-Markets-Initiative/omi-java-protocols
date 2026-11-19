package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * Populated with a reason code if the order is repriced
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RepriceReason {

    /**
     * Repriced to prevent trade
     */
    REPRICED_TO_PREVENT_TRADE((short) 1, "Repriced to prevent trade"),

    /**
     * Repriced to prevent lock
     */
    REPRICED_TO_PREVENT_LOCK((short) 2, "Repriced to prevent lock"),

    /**
     * Repriced to prevent cross
     */
    REPRICED_TO_PREVENT_CROSS((short) 3, "Repriced to prevent cross"),

    /**
     * Repriced for Marketplace Thresholds
     */
    REPRICED_FOR_MARKETPLACE_THRESHOLDS((short) 4, "Repriced for Marketplace Thresholds");

    private final short wire;

    private final String description;

    RepriceReason(short wire, String description) {
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
    public static Optional<RepriceReason> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(REPRICED_TO_PREVENT_TRADE);
            case 2 -> Optional.of(REPRICED_TO_PREVENT_LOCK);
            case 3 -> Optional.of(REPRICED_TO_PREVENT_CROSS);
            case 4 -> Optional.of(REPRICED_FOR_MARKETPLACE_THRESHOLDS);
            default -> Optional.empty();
        };
    }
}
