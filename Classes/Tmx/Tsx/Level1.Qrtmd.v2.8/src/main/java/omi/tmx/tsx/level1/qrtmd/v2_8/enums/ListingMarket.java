package omi.tmx.tsx.level1.qrtmd.v2_8.enums;

import java.util.Optional;

/**
 * The market on which a security is listed.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ListingMarket {

    /**
     * Tsx
     */
    TSX('T', "Tsx"),

    /**
     * Tsxv
     */
    TSXV('V', "Tsxv"),

    /**
     * Navex
     */
    NAVEX('N', "Navex"),

    /**
     * Nasdaq
     */
    NASDAQ('Q', "Nasdaq"),

    /**
     * Nyse
     */
    NYSE('S', "Nyse"),

    /**
     * Nyse Mkt
     */
    NYSE_MKT('M', "Nyse Mkt"),

    /**
     * Unlisted securities, posted for trading only
     */
    NO_MARKET('X', "Unlisted securities, posted for trading only");

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
            case 'T' -> Optional.of(TSX);
            case 'V' -> Optional.of(TSXV);
            case 'N' -> Optional.of(NAVEX);
            case 'Q' -> Optional.of(NASDAQ);
            case 'S' -> Optional.of(NYSE);
            case 'M' -> Optional.of(NYSE_MKT);
            case 'X' -> Optional.of(NO_MARKET);
            default -> Optional.empty();
        };
    }
}
