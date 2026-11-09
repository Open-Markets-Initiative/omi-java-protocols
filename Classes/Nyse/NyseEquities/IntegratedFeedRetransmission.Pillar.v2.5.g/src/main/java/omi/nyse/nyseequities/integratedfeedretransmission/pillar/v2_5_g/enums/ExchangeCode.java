package omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_g.enums;

import java.util.Optional;

/**
 * For listed equity markets, the market where this symbol is listed.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExchangeCode {

    /**
     * Nyse American
     */
    NYSE_AMERICAN('A', "Nyse American"),

    /**
     * Ltse
     */
    LTSE('L', "Ltse"),

    /**
     * Nyse Texas
     */
    NYSE_TEXAS('M', "Nyse Texas"),

    /**
     * Nyse
     */
    NYSE('N', "Nyse"),

    /**
     * Nyse Arca
     */
    NYSE_ARCA('P', "Nyse Arca"),

    /**
     * Nasdaq
     */
    NASDAQ('Q', "Nasdaq"),

    /**
     * Iex
     */
    IEX('V', "Iex"),

    /**
     * Cboe
     */
    CBOE('Z', "Cboe");

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
            case 'L' -> Optional.of(LTSE);
            case 'M' -> Optional.of(NYSE_TEXAS);
            case 'N' -> Optional.of(NYSE);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'Q' -> Optional.of(NASDAQ);
            case 'V' -> Optional.of(IEX);
            case 'Z' -> Optional.of(CBOE);
            default -> Optional.empty();
        };
    }
}
