package omi.euronext.optiq.dropcopygateway.sbe.v5_56.enums;

import java.util.Optional;

/**
 * priceLimitStyle
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PriceLimitStyle {

    /**
     * OpeningCallPrice
     */
    OPENING_CALL_PRICE((short) 0, "OpeningCallPrice"),

    /**
     * FairValue
     */
    FAIR_VALUE((short) 1, "FairValue"),

    /**
     * FutureMarketPrice
     */
    FUTURE_MARKET_PRICE((short) 2, "FutureMarketPrice"),

    /**
     * OptionMarketPrice
     */
    OPTION_MARKET_PRICE((short) 3, "OptionMarketPrice"),

    /**
     * priceLimitStyle
     */
    NO_VALUE((short) 255, "priceLimitStyle");

    private final short wire;

    private final String description;

    PriceLimitStyle(short wire, String description) {
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
    public static Optional<PriceLimitStyle> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(OPENING_CALL_PRICE);
            case 1 -> Optional.of(FAIR_VALUE);
            case 2 -> Optional.of(FUTURE_MARKET_PRICE);
            case 3 -> Optional.of(OPTION_MARKET_PRICE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
