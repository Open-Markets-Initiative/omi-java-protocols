package omi.txse.txseequities.seed.rake.v1_0.enums;

import java.util.Optional;

/**
 * Enum ReplaceRejectedSelfMatchInstruction.
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum ReplaceRejectedSelfMatchInstruction {

    /**
     * Self-match prevention is disabled.
     */
    NO_SELF_MATCH_PREVENTION((byte) 0, "Self-match prevention is disabled."),

    /**
     * Cancels the incoming order.
     */
    CANCEL_NEWEST((byte) 1, "Cancels the incoming order."),

    /**
     * Cancels the resting order.
     */
    CANCEL_OLDEST((byte) 2, "Cancels the resting order."),

    /**
     * Cancels both orders entirely regardless of size.
     */
    CANCEL_BOTH((byte) 3, "Cancels both orders entirely regardless of size."),

    /**
     * If orders are equal size: cancels both.
     */
    CANCEL_SMALLEST((byte) 4, "If orders are equal size: cancels both."),

    /**
     * If orders are equal size: cancels both.
     */
    DECREMENT_AND_CANCEL((byte) 5, "If orders are equal size: cancels both.");

    private final byte wire;

    private final String description;

    ReplaceRejectedSelfMatchInstruction(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<ReplaceRejectedSelfMatchInstruction> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(NO_SELF_MATCH_PREVENTION);
            case 1 -> Optional.of(CANCEL_NEWEST);
            case 2 -> Optional.of(CANCEL_OLDEST);
            case 3 -> Optional.of(CANCEL_BOTH);
            case 4 -> Optional.of(CANCEL_SMALLEST);
            case 5 -> Optional.of(DECREMENT_AND_CANCEL);
            default -> Optional.empty();
        };
    }
}
