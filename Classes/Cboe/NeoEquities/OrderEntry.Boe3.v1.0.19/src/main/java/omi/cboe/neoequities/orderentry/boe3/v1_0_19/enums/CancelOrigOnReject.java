package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * Define the treatment of the original order if a Modify Order request is rejected
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CancelOrigOnReject {

    /**
     * Leave Original Order Alone
     */
    LEAVE_ORIGINAL_ORDER_ALONE('N', "Leave Original Order Alone"),

    /**
     * Cancel Original Order If Replacement Fails
     */
    CANCEL_ORIGINAL_ORDER_IF_REPLACEMENT_FAILS('Y', "Cancel Original Order If Replacement Fails"),

    /**
     * NULL (0x00), Apply Port Default
     */
    APPLY_PORT_DEFAULT('0', "NULL (0x00), Apply Port Default");

    private final char wire;

    private final String description;

    CancelOrigOnReject(char wire, String description) {
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
    public static Optional<CancelOrigOnReject> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(LEAVE_ORIGINAL_ORDER_ALONE);
            case 'Y' -> Optional.of(CANCEL_ORIGINAL_ORDER_IF_REPLACEMENT_FAILS);
            case '0' -> Optional.of(APPLY_PORT_DEFAULT);
            default -> Optional.empty();
        };
    }
}
