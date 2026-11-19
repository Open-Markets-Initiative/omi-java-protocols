package omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v27_2_2.enums;

import java.util.Optional;

/**
 * Price formation indicator short code.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceFormationIndicator {

    /**
     * Plain Vanilla Trade
     */
    PLAIN_VANILLA_TRADE('P', "Plain Vanilla Trade"),

    /**
     * Non Price Forming Trade
     */
    NON_PRICE_FORMING_TRADE('T', "Non Price Forming Trade"),

    /**
     * Trade Not Contributing To Price Discovery
     */
    TRADE_NOT_CONTRIBUTING_TO_PRICE_DISCOVERY('J', "Trade Not Contributing To Price Discovery"),

    /**
     * Pending Price
     */
    PENDING_PRICE('N', "Pending Price"),

    /**
     * Price Is Not Applicable
     */
    PRICE_IS_NOT_APPLICABLE('Z', "Price Is Not Applicable");

    private final char wire;

    private final String description;

    PriceFormationIndicator(char wire, String description) {
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
    public static Optional<PriceFormationIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(PLAIN_VANILLA_TRADE);
            case 'T' -> Optional.of(NON_PRICE_FORMING_TRADE);
            case 'J' -> Optional.of(TRADE_NOT_CONTRIBUTING_TO_PRICE_DISCOVERY);
            case 'N' -> Optional.of(PENDING_PRICE);
            case 'Z' -> Optional.of(PRICE_IS_NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
