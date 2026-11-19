package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.enums;

import java.util.Optional;

/**
 * Trading capacity of the order
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Capacity {

    /**
     * Client
     */
    CLIENT('1', "Client"),

    /**
     * Own Account
     */
    OWN_ACCOUNT('2', "Own Account"),

    /**
     * Market Maker
     */
    MARKET_MAKER('3', "Market Maker"),

    /**
     * Issuer Holding
     */
    ISSUER_HOLDING('4', "Issuer Holding"),

    /**
     * Issue Price Stabilizing
     */
    ISSUE_PRICE_STABILIZING('6', "Issue Price Stabilizing"),

    /**
     * Riskless Principal
     */
    RISKLESS_PRINCIPAL('7', "Riskless Principal"),

    /**
     * Issuer Holding Deal
     */
    ISSUER_HOLDING_DEAL('8', "Issuer Holding Deal"),

    /**
     * Issue Price Stabilizing Deal
     */
    ISSUE_PRICE_STABILIZING_DEAL('9', "Issue Price Stabilizing Deal");

    private final char wire;

    private final String description;

    Capacity(char wire, String description) {
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
    public static Optional<Capacity> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(CLIENT);
            case '2' -> Optional.of(OWN_ACCOUNT);
            case '3' -> Optional.of(MARKET_MAKER);
            case '4' -> Optional.of(ISSUER_HOLDING);
            case '6' -> Optional.of(ISSUE_PRICE_STABILIZING);
            case '7' -> Optional.of(RISKLESS_PRINCIPAL);
            case '8' -> Optional.of(ISSUER_HOLDING_DEAL);
            case '9' -> Optional.of(ISSUE_PRICE_STABILIZING_DEAL);
            default -> Optional.empty();
        };
    }
}
