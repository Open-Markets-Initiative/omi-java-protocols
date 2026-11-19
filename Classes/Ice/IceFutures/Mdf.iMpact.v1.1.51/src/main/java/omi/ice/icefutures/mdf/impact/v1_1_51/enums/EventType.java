package omi.ice.icefutures.mdf.impact.v1_1_51.enums;

import java.util.Optional;

/**
 * Event Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventType {

    /**
     * Implication Disabled For The Market
     */
    IMPLICATION_DISABLED_FOR_THE_MARKET('A', "Implication Disabled For The Market");

    private final char wire;

    private final String description;

    EventType(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<EventType> fromWire(char wire) {
        return wire == 'A' ? Optional.of(IMPLICATION_DISABLED_FOR_THE_MARKET) : Optional.empty();
    }
}
