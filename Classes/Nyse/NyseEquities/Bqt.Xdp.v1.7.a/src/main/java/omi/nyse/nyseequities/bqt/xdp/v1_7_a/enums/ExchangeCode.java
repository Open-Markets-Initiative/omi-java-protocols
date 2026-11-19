package omi.nyse.nyseequities.bqt.xdp.v1_7_a.enums;

import java.util.Optional;

/**
 * For listed equity markets, the market where this symbol is listed
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExchangeCode {

    /**
     * NYSE American
     */
    NYSE_AMERICAN('A', "NYSE American"),

    /**
     * Global OTC primary symbols
     */
    GLOBAL_OTC('B', "Global OTC primary symbols"),

    /**
     * NYSE
     */
    NYSE('N', "NYSE"),

    /**
     * NYSE Arca
     */
    NYSE_ARCA('P', "NYSE Arca"),

    /**
     * NASDAQ
     */
    NASDAQ('Q', "NASDAQ"),

    /**
     * OTCBB symbols for Global OTC
     */
    OTCBB('U', "OTCBB symbols for Global OTC"),

    /**
     * Other OTC symbols for Global OTC
     */
    OTHER_OTC('V', "Other OTC symbols for Global OTC"),

    /**
     * BATS
     */
    BATS('Z', "BATS");

    private final char wire;

    private final String description;

    ExchangeCode(char wire, String description) {
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
    public static Optional<ExchangeCode> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NYSE_AMERICAN);
            case 'B' -> Optional.of(GLOBAL_OTC);
            case 'N' -> Optional.of(NYSE);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'Q' -> Optional.of(NASDAQ);
            case 'U' -> Optional.of(OTCBB);
            case 'V' -> Optional.of(OTHER_OTC);
            case 'Z' -> Optional.of(BATS);
            default -> Optional.empty();
        };
    }
}
