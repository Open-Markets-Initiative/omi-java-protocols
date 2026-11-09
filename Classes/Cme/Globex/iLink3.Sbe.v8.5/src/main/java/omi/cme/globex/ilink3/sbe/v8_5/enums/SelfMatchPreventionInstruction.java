package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Used to act upon the outcome when a self-match is detected and an order is prevented from trading against another order with the same SelfMatchPreventionID (Tag 2362). 1=Cancel newest signifies that incoming order is cancelled. 2=Cancel Oldest signifies that the resting order is cancelled. Absence of this field (with Tag 2362) is interpreted as cancel oldest
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SelfMatchPreventionInstruction {

    /**
     * Cancel Newest
     */
    CANCEL_NEWEST('N', "Cancel Newest"),

    /**
     * Cancel Oldest
     */
    CANCEL_OLDEST('O', "Cancel Oldest");

    private final char wire;

    private final String description;

    SelfMatchPreventionInstruction(char wire, String description) {
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
    public static Optional<SelfMatchPreventionInstruction> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(CANCEL_NEWEST);
            case 'O' -> Optional.of(CANCEL_OLDEST);
            default -> Optional.empty();
        };
    }
}
