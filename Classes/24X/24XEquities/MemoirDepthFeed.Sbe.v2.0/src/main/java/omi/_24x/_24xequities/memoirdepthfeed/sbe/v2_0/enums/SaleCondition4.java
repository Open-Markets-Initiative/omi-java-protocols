package omi._24x._24xequities.memoirdepthfeed.sbe.v2_0.enums;

import java.util.Optional;

/**
 * SaleCondition4
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SaleCondition4 {

    /**
     * NotApplicable
     */
    NOT_APPLICABLE(' ', "NotApplicable"),

    /**
     * PriceVariationTrade
     */
    PRICE_VARIATION_TRADE('H', "PriceVariationTrade"),

    /**
     * OddLotTrade
     */
    ODD_LOT_TRADE('I', "OddLotTrade"),

    /**
     * AuctionTrade
     */
    AUCTION_TRADE('X', "AuctionTrade");

    private final char wire;

    private final String description;

    SaleCondition4(char wire, String description) {
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
    public static Optional<SaleCondition4> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case 'H' -> Optional.of(PRICE_VARIATION_TRADE);
            case 'I' -> Optional.of(ODD_LOT_TRADE);
            case 'X' -> Optional.of(AUCTION_TRADE);
            default -> Optional.empty();
        };
    }
}
