package omi.cboe.bzxequities.binaryorderentry.boe.v2_3.enums;

import java.util.Optional;

/**
 * Defines the ExtExecInst values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExtExecInst {

    /**
     * None
     */
    NONE('N', "None"),

    /**
     * Order Eligible For Retail Rebate
     */
    ORDER_ELIGIBLE_FOR_RETAIL_REBATE('R', "Order Eligible For Retail Rebate");

    private final char wire;

    private final String description;

    ExtExecInst(char wire, String description) {
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
    public static Optional<ExtExecInst> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NONE);
            case 'R' -> Optional.of(ORDER_ELIGIBLE_FOR_RETAIL_REBATE);
            default -> Optional.empty();
        };
    }
}
