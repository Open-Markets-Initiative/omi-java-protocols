package omi.cboe.c1options.openingauction.csm.v1_0.enums;

import java.util.Optional;

/**
 * Defines the EopType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum EopType {

    /**
     * Undefined – not used.
     */
    UNDEFINED((short) 0, "Undefined \u2013 not used."),

    /**
     * Opening Price
     */
    OPENING_PRICE((short) 1, "Opening Price"),

    /**
     * Need More Sellers
     */
    NEED_MORE_SELLERS((short) 2, "Need More Sellers"),

    /**
     * Need More Buyers
     */
    NEED_MORE_BUYERS((short) 3, "Need More Buyers"),

    /**
     * No Opening Trades
     */
    NO_OPENING_TRADES((short) 4, "No Opening Trades"),

    /**
     * Multiple Opening Prices
     */
    MULTIPLE_OPENING_PRICES((short) 5, "Multiple Opening Prices"),

    /**
     * Need Quote To Open
     */
    NEED_QUOTE_TO_OPEN((short) 6, "Need Quote To Open"),

    /**
     * Price Not In Quote Range
     */
    PRICE_NOT_IN_QUOTE_RANGE((short) 7, "Price Not In Quote Range"),

    /**
     * Need DPM Quote To Open
     */
    NEED_DPM_QUOTE_TO_OPEN((short) 8, "Need DPM Quote To Open"),

    /**
     * DPM Quote Invalid
     */
    DPM_QUOTE_INVALID((short) 9, "DPM Quote Invalid"),

    /**
     * Price Not In BOTR Range
     */
    PRICE_NOT_IN_BOTR_RANGE((short) 10, "Price Not In BOTR Range");

    private final short wire;

    private final String description;

    EopType(short wire, String description) {
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
    public static Optional<EopType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(UNDEFINED);
            case 1 -> Optional.of(OPENING_PRICE);
            case 2 -> Optional.of(NEED_MORE_SELLERS);
            case 3 -> Optional.of(NEED_MORE_BUYERS);
            case 4 -> Optional.of(NO_OPENING_TRADES);
            case 5 -> Optional.of(MULTIPLE_OPENING_PRICES);
            case 6 -> Optional.of(NEED_QUOTE_TO_OPEN);
            case 7 -> Optional.of(PRICE_NOT_IN_QUOTE_RANGE);
            case 8 -> Optional.of(NEED_DPM_QUOTE_TO_OPEN);
            case 9 -> Optional.of(DPM_QUOTE_INVALID);
            case 10 -> Optional.of(PRICE_NOT_IN_BOTR_RANGE);
            default -> Optional.empty();
        };
    }
}
