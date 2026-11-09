package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the TradeRequestResult values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradeRequestResult {

    /**
     * Deal cancellation pending
     */
    CANCELPENDING((short) 100, "Deal cancellation pending"),

    /**
     * Deal cancellation declined
     */
    CANCELDECLINED((short) 101, "Deal cancellation declined"),

    /**
     * Deal cancellation approved
     */
    CANCELAPPROVED((short) 102, "Deal cancellation approved"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    TradeRequestResult(short wire, String description) {
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
    public static Optional<TradeRequestResult> fromWire(short wire) {
        return switch (wire) {
            case 100 -> Optional.of(CANCELPENDING);
            case 101 -> Optional.of(CANCELDECLINED);
            case 102 -> Optional.of(CANCELAPPROVED);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
