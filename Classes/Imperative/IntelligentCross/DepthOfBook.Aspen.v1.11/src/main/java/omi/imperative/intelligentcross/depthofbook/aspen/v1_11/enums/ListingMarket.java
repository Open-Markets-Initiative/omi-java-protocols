package omi.imperative.intelligentcross.depthofbook.aspen.v1_11.enums;

import java.util.Optional;

/**
 * Code identifying the primary listing market
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ListingMarket {

    /**
     * Nyse
     */
    NYSE('N', "Nyse"),

    /**
     * Nasdaq
     */
    NASDAQ('Q', "Nasdaq"),

    /**
     * Arca
     */
    ARCA('P', "Arca"),

    /**
     * Bats
     */
    BATS('Z', "Bats"),

    /**
     * Amex
     */
    AMEX('A', "Amex"),

    /**
     * Iex
     */
    IEX('V', "Iex");

    private final char wire;

    private final String description;

    ListingMarket(char wire, String description) {
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
    public static Optional<ListingMarket> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NYSE);
            case 'Q' -> Optional.of(NASDAQ);
            case 'P' -> Optional.of(ARCA);
            case 'Z' -> Optional.of(BATS);
            case 'A' -> Optional.of(AMEX);
            case 'V' -> Optional.of(IEX);
            default -> Optional.empty();
        };
    }
}
