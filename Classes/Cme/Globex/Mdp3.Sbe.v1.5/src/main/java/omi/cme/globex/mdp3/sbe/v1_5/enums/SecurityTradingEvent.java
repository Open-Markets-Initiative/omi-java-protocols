package omi.cme.globex.mdp3.sbe.v1_5.enums;

import java.util.Optional;

/**
 * Identifies an additional event or a rule related to the status
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityTradingEvent {

    /**
     * No Event
     */
    NO_EVENT((short) 0, "No Event"),

    /**
     * No Cancel
     */
    NO_CANCEL((short) 1, "No Cancel"),

    /**
     * Reset Statistics
     */
    RESET_STATISTICS((short) 4, "Reset Statistics"),

    /**
     * Implied Matching ON
     */
    IMPLIED_MATCHING_ON((short) 5, "Implied Matching ON"),

    /**
     * Implied Matching OFF
     */
    IMPLIED_MATCHING_OFF((short) 6, "Implied Matching OFF");

    private final short wire;

    private final String description;

    SecurityTradingEvent(short wire, String description) {
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
    public static Optional<SecurityTradingEvent> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NO_EVENT);
            case 1 -> Optional.of(NO_CANCEL);
            case 4 -> Optional.of(RESET_STATISTICS);
            case 5 -> Optional.of(IMPLIED_MATCHING_ON);
            case 6 -> Optional.of(IMPLIED_MATCHING_OFF);
            default -> Optional.empty();
        };
    }
}
