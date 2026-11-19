package omi.tradelogiq.omegaats.snapshotrecovery.itch.v1_09.enums;

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
     * TSX Venture
     */
    TSX_VENTURE('v', "TSX Venture"),

    /**
     * CSE
     */
    CSE('c', "CSE"),

    /**
     * Nasdaq Canada
     */
    NASDAQ_CANADA('q', "Nasdaq Canada"),

    /**
     * Omega ATS
     */
    OMEGA_ATS('o', "Omega ATS"),

    /**
     * CBOE Canada
     */
    CBOE_CANADA('z', "CBOE Canada");

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
            case 'v' -> Optional.of(TSX_VENTURE);
            case 'c' -> Optional.of(CSE);
            case 'q' -> Optional.of(NASDAQ_CANADA);
            case 'o' -> Optional.of(OMEGA_ATS);
            case 'z' -> Optional.of(CBOE_CANADA);
            default -> Optional.empty();
        };
    }
}
