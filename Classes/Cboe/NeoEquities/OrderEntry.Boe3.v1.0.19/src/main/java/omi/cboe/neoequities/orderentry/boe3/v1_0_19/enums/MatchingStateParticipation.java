package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * Indicates which order flow type a Passive Dark order elects to interact with
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MatchingStateParticipation {

    /**
     * Active Orders Only
     */
    ACTIVE_ORDERS_ONLY('1', "Active Orders Only"),

    /**
     * Passive Orders Only
     */
    PASSIVE_ORDERS_ONLY('2', "Passive Orders Only"),

    /**
     * Both Active And Passive Orders
     */
    BOTH_ACTIVE_AND_PASSIVE_ORDERS('3', "Both Active And Passive Orders");

    private final char wire;

    private final String description;

    MatchingStateParticipation(char wire, String description) {
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
    public static Optional<MatchingStateParticipation> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(ACTIVE_ORDERS_ONLY);
            case '2' -> Optional.of(PASSIVE_ORDERS_ONLY);
            case '3' -> Optional.of(BOTH_ACTIVE_AND_PASSIVE_ORDERS);
            default -> Optional.empty();
        };
    }
}
