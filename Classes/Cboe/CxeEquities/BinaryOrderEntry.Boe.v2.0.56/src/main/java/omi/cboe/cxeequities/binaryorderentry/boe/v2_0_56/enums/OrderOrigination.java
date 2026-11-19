package omi.cboe.cxeequities.binaryorderentry.boe.v2_0_56.enums;

import java.util.Optional;

/**
 * Defines the OrderOrigination values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrderOrigination {

    /**
     * (DEA). Indicates DEA activity (as deemed by MiFID II) is involved in this order.
     */
    DEA_INDICATES_DEA_ACTIVITY_AS_DEEMED_BY_MI_FID_II('5', "(DEA). Indicates DEA activity (as deemed by MiFID II) is involved in this order."),

    /**
     * Non-DEA. (default) Other values are unsupported and will be rejected.
     */
    NON_DEA('0', "Non-DEA. (default) Other values are unsupported and will be rejected.");

    private final char wire;

    private final String description;

    OrderOrigination(char wire, String description) {
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
    public static Optional<OrderOrigination> fromWire(char wire) {
        return switch (wire) {
            case '5' -> Optional.of(DEA_INDICATES_DEA_ACTIVITY_AS_DEEMED_BY_MI_FID_II);
            case '0' -> Optional.of(NON_DEA);
            default -> Optional.empty();
        };
    }
}
