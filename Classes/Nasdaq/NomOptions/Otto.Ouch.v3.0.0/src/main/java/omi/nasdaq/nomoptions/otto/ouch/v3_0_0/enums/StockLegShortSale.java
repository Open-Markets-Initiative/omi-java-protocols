package omi.nasdaq.nomoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * N=Not Applicable, H=Sell Short, E=Sell Short Exempt. If this is a multi-leg order for a stock combo where stock leg is on the Sell side StockLegShortSale may be set to H or E. In all other cases value N should be used.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum StockLegShortSale {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE('N', "Not Applicable"),

    /**
     * Sell Short (Sold Short on executions)
     */
    SELL_SHORT('H', "Sell Short (Sold Short on executions)"),

    /**
     * Sell Short Exempt (Sold Short Exempt on executions)
     */
    SELL_SHORT_EXEMPT('E', "Sell Short Exempt (Sold Short Exempt on executions)");

    private final char wire;

    private final String description;

    StockLegShortSale(char wire, String description) {
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
    public static Optional<StockLegShortSale> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NOT_APPLICABLE);
            case 'H' -> Optional.of(SELL_SHORT);
            case 'E' -> Optional.of(SELL_SHORT_EXEMPT);
            default -> Optional.empty();
        };
    }
}
