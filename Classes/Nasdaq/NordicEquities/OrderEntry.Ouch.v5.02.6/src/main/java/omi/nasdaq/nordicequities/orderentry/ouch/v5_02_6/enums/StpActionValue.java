package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_6.enums;

import java.util.Optional;

/**
 * Action taken when self trade prevention triggers
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum StpActionValue {

    /**
     * Cancel Passive Order
     */
    CANCEL_PASSIVE_ORDER('1', "Cancel Passive Order"),

    /**
     * Cancel Aggressive Order
     */
    CANCEL_AGGRESSIVE_ORDER('2', "Cancel Aggressive Order"),

    /**
     * Cancel Both Orders
     */
    CANCEL_BOTH_ORDERS('3', "Cancel Both Orders"),

    /**
     * Create A Transfer Transaction
     */
    CREATE_A_TRANSFER_TRANSACTION('4', "Create A Transfer Transaction");

    private final char wire;

    private final String description;

    StpActionValue(char wire, String description) {
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
    public static Optional<StpActionValue> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(CANCEL_PASSIVE_ORDER);
            case '2' -> Optional.of(CANCEL_AGGRESSIVE_ORDER);
            case '3' -> Optional.of(CANCEL_BOTH_ORDERS);
            case '4' -> Optional.of(CREATE_A_TRANSFER_TRANSACTION);
            default -> Optional.empty();
        };
    }
}
