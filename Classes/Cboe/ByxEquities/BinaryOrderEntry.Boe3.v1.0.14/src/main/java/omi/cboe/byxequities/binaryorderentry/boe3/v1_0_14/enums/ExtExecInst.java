package omi.cboe.byxequities.binaryorderentry.boe3.v1_0_14.enums;

import java.util.Optional;

/**
 * Extended execution instruction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExtExecInst {

    /**
     * None
     */
    NONE('N', "None"),

    /**
     * Retail Order Eligible For Retail Rebate
     */
    RETAIL_ORDER_ELIGIBLE_FOR_RETAIL_REBATE('R', "Retail Order Eligible For Retail Rebate"),

    /**
     * BYX and EDGX
     */
    RETAIL_ORDER_PRICE_IMPROVEMENT_ONLY('P', "BYX and EDGX"),

    /**
     * BYX and EDGX
     */
    RETAIL_PRICE_IMPROVING_ORDER('T', "BYX and EDGX"),

    /**
     * EDGX
     */
    RETAIL_PRIORITY_ORDER_ELIGIBLE_FOR_RETAIL_PRIORITY_AND_RETAIL_REBATE_RATE('X', "EDGX");

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
            case 'P' -> Optional.of(RETAIL_ORDER_PRICE_IMPROVEMENT_ONLY);
            case 'T' -> Optional.of(RETAIL_PRICE_IMPROVING_ORDER);
            case 'X' -> Optional.of(RETAIL_PRIORITY_ORDER_ELIGIBLE_FOR_RETAIL_PRIORITY_AND_RETAIL_REBATE_RATE);
            default -> Optional.empty();
        };
    }
}
