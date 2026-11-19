package omi.jpx.fseequities.marketbyorder.flex.v1_3.enums;

import java.util.Optional;

/**
 * Indicates method of pricing or status of quote display after the tag is delivered
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PricingMethod {

    /**
     * Itayose Method
     */
    ITAYOSE_METHOD((short) 1, "Itayose Method"),

    /**
     * Zaraba Method
     */
    ZARABA_METHOD((short) 2, "Zaraba Method"),

    /**
     * Sell Special Quote Displayed
     */
    SELL_SPECIAL_QUOTE_DISPLAYED((short) 3, "Sell Special Quote Displayed"),

    /**
     * Buy Special Quote Displayed
     */
    BUY_SPECIAL_QUOTE_DISPLAYED((short) 4, "Buy Special Quote Displayed"),

    /**
     * Sell Sequential Trade Quote Displayed
     */
    SELL_SEQUENTIAL_TRADE_QUOTE_DISPLAYED((short) 5, "Sell Sequential Trade Quote Displayed"),

    /**
     * Buy Sequential Trade Quote Displayed
     */
    BUY_SEQUENTIAL_TRADE_QUOTE_DISPLAYED((short) 6, "Buy Sequential Trade Quote Displayed"),

    /**
     * Other Than The Above
     */
    OTHER_THAN_THE_ABOVE((short) 0, "Other Than The Above");

    private final short wire;

    private final String description;

    PricingMethod(short wire, String description) {
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
    public static Optional<PricingMethod> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ITAYOSE_METHOD);
            case 2 -> Optional.of(ZARABA_METHOD);
            case 3 -> Optional.of(SELL_SPECIAL_QUOTE_DISPLAYED);
            case 4 -> Optional.of(BUY_SPECIAL_QUOTE_DISPLAYED);
            case 5 -> Optional.of(SELL_SEQUENTIAL_TRADE_QUOTE_DISPLAYED);
            case 6 -> Optional.of(BUY_SEQUENTIAL_TRADE_QUOTE_DISPLAYED);
            case 0 -> Optional.of(OTHER_THAN_THE_ABOVE);
            default -> Optional.empty();
        };
    }
}
