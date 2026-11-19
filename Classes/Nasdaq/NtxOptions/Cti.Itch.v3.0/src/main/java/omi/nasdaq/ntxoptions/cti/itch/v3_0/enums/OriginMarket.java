package omi.nasdaq.ntxoptions.cti.itch.v3_0.enums;

import java.util.Optional;

/**
 * Originating market of the order for market makers (FIX tag 207 Security Exchange); space when the capacity of this side of the trade is not O
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OriginMarket {

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
     * MIAX Emerald
     */
    MIAX_EMERALD('D', "MIAX Emerald"),

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
     * PHLX
     */
    PHLX('X', "PHLX"),

    /**
     * NTX Options
     */
    NTX_OPTIONS('T', "NTX Options"),

    /**
     * MIAX
     */
    MIAX('M', "MIAX"),

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
     * IEX
     */
    IEX('V', "IEX"),

    /**
     * MX2
     */
    MX_2('G', "MX2"),

    /**
     * Not Applicable (the capacity of this side of trade is not O)
     */
    NOT_APPLICABLE(' ', "Not Applicable (the capacity of this side of trade is not O)");

    private final char wire;

    private final String description;

    OriginMarket(char wire, String description) {
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
    public static Optional<OriginMarket> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AMEX);
            case 'B' -> Optional.of(BOX);
            case 'C' -> Optional.of(CBOE);
            case 'D' -> Optional.of(MIAX_EMERALD);
            case 'I' -> Optional.of(ISE);
            case 'N' -> Optional.of(NYSE);
            case 'Q' -> Optional.of(NASDAQ);
            case 'W' -> Optional.of(C2);
            case 'X' -> Optional.of(PHLX);
            case 'T' -> Optional.of(NTX_OPTIONS);
            case 'M' -> Optional.of(MIAX);
            case 'H' -> Optional.of(GEMX);
            case 'E' -> Optional.of(BATS_EDGX);
            case 'J' -> Optional.of(MRX);
            case 'U' -> Optional.of(MEMX);
            case 'S' -> Optional.of(MIAX_SAPPHIRE);
            case 'V' -> Optional.of(IEX);
            case 'G' -> Optional.of(MX_2);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
