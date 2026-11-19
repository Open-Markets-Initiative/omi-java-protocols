package omi.jpx.tseequities.marketbyorder.flex.v1_1.enums;

import java.util.Optional;

/**
 * Indicates the pricing method in place when the execution occurred
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AdoptedPricingMethod {

    /**
     * Itayose Method
     */
    ITAYOSE_METHOD((short) 1, "Itayose Method"),

    /**
     * Quote Displayed
     */
    QUOTE_DISPLAYED((short) 2, "Quote Displayed");

    private final short wire;

    private final String description;

    AdoptedPricingMethod(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<AdoptedPricingMethod> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ITAYOSE_METHOD);
            case 2 -> Optional.of(QUOTE_DISPLAYED);
            default -> Optional.empty();
        };
    }
}
