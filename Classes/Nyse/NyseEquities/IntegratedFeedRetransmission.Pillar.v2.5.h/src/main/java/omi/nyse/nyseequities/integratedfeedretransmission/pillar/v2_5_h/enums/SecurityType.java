package omi.nyse.nyseequities.integratedfeedretransmission.pillar.v2_5_h.enums;

import java.util.Optional;

/**
 * Type of Security used by Pillar-powered markets.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecurityType {

    /**
     * American Depositary Receipts
     */
    AMERICAN_DEPOSITARY_RECEIPTS('A', "American Depositary Receipts"),

    /**
     * Common Stock
     */
    COMMON_STOCK('C', "Common Stock"),

    /**
     * Debentures
     */
    DEBENTURES('D', "Debentures"),

    /**
     * Exchange Traded Funds
     */
    EXCHANGE_TRADED_FUNDS('E', "Exchange Traded Funds"),

    /**
     * Foreign
     */
    FOREIGN('F', "Foreign"),

    /**
     * American Depositary Shares
     */
    AMERICAN_DEPOSITARY_SHARES('H', "American Depositary Shares"),

    /**
     * Units
     */
    UNITS('I', "Units"),

    /**
     * Index Linked Notes
     */
    INDEX_LINKED_NOTES('L', "Index Linked Notes"),

    /**
     * Other Blank
     */
    OTHER_BLANK('M', "Other Blank"),

    /**
     * Ordinary Shares
     */
    ORDINARY_SHARES('O', "Ordinary Shares"),

    /**
     * Preferred Stock
     */
    PREFERRED_STOCK('P', "Preferred Stock"),

    /**
     * Rights
     */
    RIGHTS('R', "Rights"),

    /**
     * Shares Of Beneficial Interest
     */
    SHARES_OF_BENEFICIAL_INTEREST('S', "Shares Of Beneficial Interest"),

    /**
     * Test
     */
    TEST('T', "Test"),

    /**
     * Closed End Fund
     */
    CLOSED_END_FUND('U', "Closed End Fund"),

    /**
     * Warrants
     */
    WARRANTS('W', "Warrants");

    private final char wire;

    private final String description;

    SecurityType(char wire, String description) {
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
    public static Optional<SecurityType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AMERICAN_DEPOSITARY_RECEIPTS);
            case 'C' -> Optional.of(COMMON_STOCK);
            case 'D' -> Optional.of(DEBENTURES);
            case 'E' -> Optional.of(EXCHANGE_TRADED_FUNDS);
            case 'F' -> Optional.of(FOREIGN);
            case 'H' -> Optional.of(AMERICAN_DEPOSITARY_SHARES);
            case 'I' -> Optional.of(UNITS);
            case 'L' -> Optional.of(INDEX_LINKED_NOTES);
            case 'M' -> Optional.of(OTHER_BLANK);
            case 'O' -> Optional.of(ORDINARY_SHARES);
            case 'P' -> Optional.of(PREFERRED_STOCK);
            case 'R' -> Optional.of(RIGHTS);
            case 'S' -> Optional.of(SHARES_OF_BENEFICIAL_INTEREST);
            case 'T' -> Optional.of(TEST);
            case 'U' -> Optional.of(CLOSED_END_FUND);
            case 'W' -> Optional.of(WARRANTS);
            default -> Optional.empty();
        };
    }
}
