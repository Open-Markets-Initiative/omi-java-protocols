package omi.bme.bmeequities.orderentry.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Self Match Prevention Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SelfMatchPreventionType {

    /**
     * Na Or Default Behaviour Aggressive Order Is Rejected
     */
    NA_OR_DEFAULT_BEHAVIOUR_AGGRESSIVE_ORDER_IS_REJECTED(' ', "Na Or Default Behaviour Aggressive Order Is Rejected"),

    /**
     * Reject Aggressive Order
     */
    REJECT_AGGRESSIVE_ORDER('1', "Reject Aggressive Order"),

    /**
     * Cancel Pasive Order
     */
    CANCEL_PASIVE_ORDER('2', "Cancel Pasive Order"),

    /**
     * Cancel Both Passive And Aggressive Order
     */
    CANCEL_BOTH_PASSIVE_AND_AGGRESSIVE_ORDER('3', "Cancel Both Passive And Aggressive Order"),

    /**
     * no order gets cancelled, both aggressive and passive orders remain (only valid for SpainAtMid Direct orders)
     */
    NO_ORDER_CANCELLED('4', "no order gets cancelled, both aggressive and passive orders remain (only valid for SpainAtMid Direct orders)");

    private final char wire;

    private final String description;

    SelfMatchPreventionType(char wire, String description) {
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
    public static Optional<SelfMatchPreventionType> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NA_OR_DEFAULT_BEHAVIOUR_AGGRESSIVE_ORDER_IS_REJECTED);
            case '1' -> Optional.of(REJECT_AGGRESSIVE_ORDER);
            case '2' -> Optional.of(CANCEL_PASIVE_ORDER);
            case '3' -> Optional.of(CANCEL_BOTH_PASSIVE_AND_AGGRESSIVE_ORDER);
            case '4' -> Optional.of(NO_ORDER_CANCELLED);
            default -> Optional.empty();
        };
    }
}
