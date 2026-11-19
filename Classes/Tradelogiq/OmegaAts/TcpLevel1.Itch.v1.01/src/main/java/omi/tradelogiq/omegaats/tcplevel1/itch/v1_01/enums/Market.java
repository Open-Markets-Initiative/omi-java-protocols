package omi.tradelogiq.omegaats.tcplevel1.itch.v1_01.enums;

import java.util.Optional;

/**
 * Indicates the listing market of security
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Market {

    /**
     * TSX
     */
    TSX('t', "TSX"),

    /**
     * Venture
     */
    VENTURE('v', "Venture"),

    /**
     * CNSX
     */
    CNSX('c', "CNSX"),

    /**
     * Nasdaq Canada
     */
    NASDAQ_CANADA('q', "Nasdaq Canada"),

    /**
     * Omega
     */
    OMEGA('o', "Omega"),

    /**
     * Aequitas
     */
    AEQUITAS('z', "Aequitas");

    private final char wire;

    private final String description;

    Market(char wire, String description) {
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
    public static Optional<Market> fromWire(char wire) {
        return switch (wire) {
            case 't' -> Optional.of(TSX);
            case 'v' -> Optional.of(VENTURE);
            case 'c' -> Optional.of(CNSX);
            case 'q' -> Optional.of(NASDAQ_CANADA);
            case 'o' -> Optional.of(OMEGA);
            case 'z' -> Optional.of(AEQUITAS);
            default -> Optional.empty();
        };
    }
}
