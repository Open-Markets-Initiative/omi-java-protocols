package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the QuoteSubType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteSubType {

    /**
     * Working Delta
     */
    WORKING_DELTA((short) 1, "Working Delta"),

    /**
     * Basis Trade
     */
    BASIS_TRADE((short) 2, "Basis Trade"),

    /**
     * Regular LDS Negotiation
     */
    REGULAR((short) 3, "Regular LDS Negotiation"),

    /**
     * Negotiate the underlying outside the exchange
     */
    NEGOTIATE_UNDERLYING_OUTSIDE_EXCHANGE((short) 4, "Negotiate the underlying outside the exchange"),

    /**
     * Option Volatility Strategy with fixed Underlying price and delta
     */
    VOLA_STRATEGY_FIX((short) 5, "Option Volatility Strategy with fixed Underlying price and delta"),

    /**
     * Option Volatility Strategy - Underlying price is negotiated on exchange
     */
    VOLA_STRATEGY_NEGOTIATE_UNDERLYING((short) 6, "Option Volatility Strategy - Underlying price is negotiated on exchange"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    QuoteSubType(short wire, String description) {
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
    public static Optional<QuoteSubType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(WORKING_DELTA);
            case 2 -> Optional.of(BASIS_TRADE);
            case 3 -> Optional.of(REGULAR);
            case 4 -> Optional.of(NEGOTIATE_UNDERLYING_OUTSIDE_EXCHANGE);
            case 5 -> Optional.of(VOLA_STRATEGY_FIX);
            case 6 -> Optional.of(VOLA_STRATEGY_NEGOTIATE_UNDERLYING);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
