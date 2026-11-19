package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * MMT Ordinary Trade Indicator
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MmtOrdinaryTradeIndicator {

    /**
     * P = Plain-Vanilla Trade
     */
    PLAIN_VANILLA_TRADE((short) 1, "P = Plain-Vanilla Trade"),

    /**
     * T = Non-Price Forming Trade (formerly defined as a Technical Trade)
     */
    NON_PRICE_FORMING_TRADE((short) 2, "T = Non-Price Forming Trade (formerly defined as a Technical Trade)"),

    /**
     * J = Trade not contributing to the price discovery process (formerly defined as a Technical Trade)
     */
    TRADE_NOT_CONTRIBUTING_TO_PRICE_DISCOVERY((short) 3, "J = Trade not contributing to the price discovery process (formerly defined as a Technical Trade)"),

    /**
     * N = Price is currently not available but pending
     */
    PRICE_PENDING((short) 4, "N = Price is currently not available but pending");

    private final short wire;

    private final String description;

    MmtOrdinaryTradeIndicator(short wire, String description) {
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
    public static Optional<MmtOrdinaryTradeIndicator> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(PLAIN_VANILLA_TRADE);
            case 2 -> Optional.of(NON_PRICE_FORMING_TRADE);
            case 3 -> Optional.of(TRADE_NOT_CONTRIBUTING_TO_PRICE_DISCOVERY);
            case 4 -> Optional.of(PRICE_PENDING);
            default -> Optional.empty();
        };
    }
}
