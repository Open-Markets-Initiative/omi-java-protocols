package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.enums;

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
     * Retail Order, eligible for Retail rebate. BYX and EDGX:
     */
    RETAIL_ORDER_ELIGIBLE_FOR_RETAIL_REBATE('R', "Retail Order, eligible for Retail rebate. BYX and EDGX:"),

    /**
     * Retail Order (Price Improvement Only)
     */
    RETAIL_ORDER('P', "Retail Order (Price Improvement Only)"),

    /**
     * Retail Price Improving Order EDGX:
     */
    RETAIL_PRICE_IMPROVING_ORDER('T', "Retail Price Improving Order EDGX:"),

    /**
     * Retail Priority Order; eligible for Retail Priority and Retail rebate rate.
     */
    RETAIL_PRIORITY_ORDER('X', "Retail Priority Order; eligible for Retail Priority and Retail rebate rate.");

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
            case 'R' -> Optional.of(RETAIL_ORDER_ELIGIBLE_FOR_RETAIL_REBATE);
            case 'P' -> Optional.of(RETAIL_ORDER);
            case 'T' -> Optional.of(RETAIL_PRICE_IMPROVING_ORDER);
            case 'X' -> Optional.of(RETAIL_PRIORITY_ORDER);
            default -> Optional.empty();
        };
    }
}
