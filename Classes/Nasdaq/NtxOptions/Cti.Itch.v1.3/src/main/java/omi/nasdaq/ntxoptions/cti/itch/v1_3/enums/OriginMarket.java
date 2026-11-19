package omi.nasdaq.ntxoptions.cti.itch.v1_3.enums;

import java.util.Optional;

/**
 * Originating market of the order for market makers (FIX tag 207 Security Exchange); space when the capacity of this side of the trade is not O or A
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
     * ISE GEMINI
     */
    ISE_GEMINI('H', "ISE GEMINI"),

    /**
     * BATS EDGX
     */
    BATS_EDGX('E', "BATS EDGX"),

    /**
     * ISE MERCURY
     */
    ISE_MERCURY('J', "ISE MERCURY"),

    /**
     * MIAX PEARL
     */
    MIAX_PEARL('P', "MIAX PEARL"),

    /**
     * Not Applicable (the capacity of this side of trade is not O or A)
     */
    NOT_APPLICABLE(' ', "Not Applicable (the capacity of this side of trade is not O or A)");

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
            case 'I' -> Optional.of(ISE);
            case 'N' -> Optional.of(NYSE);
            case 'Q' -> Optional.of(NASDAQ);
            case 'W' -> Optional.of(C2);
            case 'Z' -> Optional.of(BATS);
            case 'X' -> Optional.of(PHLX);
            case 'T' -> Optional.of(BX_OPTIONS);
            case 'M' -> Optional.of(MIAX);
            case 'H' -> Optional.of(ISE_GEMINI);
            case 'E' -> Optional.of(BATS_EDGX);
            case 'J' -> Optional.of(ISE_MERCURY);
            case 'P' -> Optional.of(MIAX_PEARL);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
