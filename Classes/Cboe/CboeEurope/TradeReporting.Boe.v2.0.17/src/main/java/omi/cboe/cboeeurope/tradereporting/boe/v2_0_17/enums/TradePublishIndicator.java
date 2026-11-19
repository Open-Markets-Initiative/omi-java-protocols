package omi.cboe.cboeeurope.tradereporting.boe.v2_0_17.enums;

import java.util.Optional;

/**
 * Defines the TradePublishIndicator values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradePublishIndicator {

    /**
     * Do not publish
     */
    DO_NOT_PUBLISH((short) 0, "Do not publish"),

    /**
     * Publish trade
     */
    PUBLISH_TRADE((short) 1, "Publish trade"),

    /**
     * Deferred publication
     */
    DEFERRED_PUBLICATION((short) 2, "Deferred publication");

    private final short wire;

    private final String description;

    TradePublishIndicator(short wire, String description) {
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
    public static Optional<TradePublishIndicator> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DO_NOT_PUBLISH);
            case 1 -> Optional.of(PUBLISH_TRADE);
            case 2 -> Optional.of(DEFERRED_PUBLICATION);
            default -> Optional.empty();
        };
    }
}
