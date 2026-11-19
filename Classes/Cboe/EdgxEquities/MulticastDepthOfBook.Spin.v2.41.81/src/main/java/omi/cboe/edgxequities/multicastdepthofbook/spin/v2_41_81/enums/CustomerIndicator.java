package omi.cboe.edgxequities.multicastdepthofbook.spin.v2_41_81.enums;

import java.util.Optional;

/**
 * Space filled on all equities markets. R = Retail Priority order (EDGX Equities only).
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CustomerIndicator {

    /**
     * Retail Priority Order Edgx Equities Only
     */
    RETAIL_PRIORITY_ORDER_EDGX_EQUITIES_ONLY('R', "Retail Priority Order Edgx Equities Only");

    private final char wire;

    private final String description;

    CustomerIndicator(char wire, String description) {
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
    public static Optional<CustomerIndicator> fromWire(char wire) {
        return wire == 'R' ? Optional.of(RETAIL_PRIORITY_ORDER_EDGX_EQUITIES_ONLY) : Optional.empty();
    }
}
