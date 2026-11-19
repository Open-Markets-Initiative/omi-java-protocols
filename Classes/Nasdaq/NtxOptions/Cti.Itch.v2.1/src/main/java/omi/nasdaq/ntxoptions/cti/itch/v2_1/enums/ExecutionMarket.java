package omi.nasdaq.ntxoptions.cti.itch.v2_1.enums;

import java.util.Optional;

/**
 * Away execution market id for options, space for trades that are not away. The document types this field Integer; its option market values are characters.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecutionMarket {

    /**
     * AMEX
     */
    AMEX('A', "AMEX"),

    /**
     * BOX
     */
    BOX('B', "BOX"),

    /**
     * CBOE
     */
    CBOE('C', "CBOE"),

    /**
     * ISE
     */
    ISE('I', "ISE"),

    /**
     * NYSE
     */
    NYSE('N', "NYSE"),

    /**
     * NASDAQ
     */
    NASDAQ('Q', "NASDAQ"),

    /**
     * C2
     */
    C2('W', "C2"),

    /**
     * BATS
     */
    BATS('Z', "BATS"),

    /**
     * PHLX
     */
    PHLX('X', "PHLX"),

    /**
     * BX Options
     */
    BX_OPTIONS('T', "BX Options"),

    /**
     * MIAX
     */
    MIAX('M', "MIAX"),

    /**
     * MIAX Pearl
     */
    MIAX_PEARL('P', "MIAX Pearl"),

    /**
     * GEMX
     */
    GEMX('H', "GEMX"),

    /**
     * BATS EDGX
     */
    BATS_EDGX('E', "BATS EDGX"),

    /**
     * MRX
     */
    MRX('J', "MRX"),

    /**
     * MEMX
     */
    MEMX('U', "MEMX"),

    /**
     * MIAX Sapphire
     */
    MIAX_SAPPHIRE('S', "MIAX Sapphire"),

    /**
     * Not away trade
     */
    NOT_AWAY_TRADE(' ', "Not away trade");

    private final char wire;

    private final String description;

    ExecutionMarket(char wire, String description) {
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
    public static Optional<ExecutionMarket> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AMEX);
            case 'B' -> Optional.of(BOX);
            case 'C' -> Optional.of(CBOE);
            case 'I' -> Optional.of(ISE);
            case 'N' -> Optional.of(NYSE);
            case 'Q' -> Optional.of(NASDAQ);
            case 'W' -> Optional.of(C2);
            case 'Z' -> Optional.of(BATS);
            case 'X' -> Optional.of(PHLX);
            case 'T' -> Optional.of(BX_OPTIONS);
            case 'M' -> Optional.of(MIAX);
            case 'P' -> Optional.of(MIAX_PEARL);
            case 'H' -> Optional.of(GEMX);
            case 'E' -> Optional.of(BATS_EDGX);
            case 'J' -> Optional.of(MRX);
            case 'U' -> Optional.of(MEMX);
            case 'S' -> Optional.of(MIAX_SAPPHIRE);
            case ' ' -> Optional.of(NOT_AWAY_TRADE);
            default -> Optional.empty();
        };
    }
}
