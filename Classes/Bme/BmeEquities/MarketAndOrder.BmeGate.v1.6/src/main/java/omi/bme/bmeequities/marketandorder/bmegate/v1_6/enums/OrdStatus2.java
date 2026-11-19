package omi.bme.bmeequities.marketandorder.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Order Status
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrdStatus2 {

    /**
     * Pending No Volume Filled
     */
    PENDING_NO_VOLUME_FILLED('0', "Pending No Volume Filled"),

    /**
     * Rejected
     */
    REJECTED('8', "Rejected"),

    /**
     * Parcially Filled
     */
    PARCIALLY_FILLED('1', "Parcially Filled"),

    /**
     * Totally Filled
     */
    TOTALLY_FILLED('2', "Totally Filled"),

    /**
     * Cancelled Not Filled
     */
    CANCELLED_NOT_FILLED('4', "Cancelled Not Filled"),

    /**
     * Cancelled Partially Filled
     */
    CANCELLED_PARTIALLY_FILLED('P', "Cancelled Partially Filled"),

    /**
     * Non Working Order Pending Validation
     */
    NON_WORKING_ORDER_PENDING_VALIDATION('A', "Non Working Order Pending Validation"),

    /**
     * Non Working Order Pending Activation
     */
    NON_WORKING_ORDER_PENDING_ACTIVATION('S', "Non Working Order Pending Activation");

    private final char wire;

    private final String description;

    OrdStatus2(char wire, String description) {
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
    public static Optional<OrdStatus2> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(PENDING_NO_VOLUME_FILLED);
            case '8' -> Optional.of(REJECTED);
            case '1' -> Optional.of(PARCIALLY_FILLED);
            case '2' -> Optional.of(TOTALLY_FILLED);
            case '4' -> Optional.of(CANCELLED_NOT_FILLED);
            case 'P' -> Optional.of(CANCELLED_PARTIALLY_FILLED);
            case 'A' -> Optional.of(NON_WORKING_ORDER_PENDING_VALIDATION);
            case 'S' -> Optional.of(NON_WORKING_ORDER_PENDING_ACTIVATION);
            default -> Optional.empty();
        };
    }
}
