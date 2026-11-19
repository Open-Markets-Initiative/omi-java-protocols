package omi.lseg.tradeecho.mifid2posttradereplay.gtp.v27_2_2.enums;

import java.util.Optional;

/**
 * Duplicative indicator short code.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DuplicativeIndicator {

    /**
     * Duplicative Trade Report
     */
    DUPLICATIVE_TRADE_REPORT('1', "Duplicative Trade Report"),

    /**
     * Intra Group Trade
     */
    INTRA_GROUP_TRADE('2', "Intra Group Trade"),

    /**
     * Duplicative Trade Report And Intra Group Trade
     */
    DUPLICATIVE_TRADE_REPORT_AND_INTRA_GROUP_TRADE('3', "Duplicative Trade Report And Intra Group Trade"),

    /**
     * Cross Border Duplicative Trade Report
     */
    CROSS_BORDER_DUPLICATIVE_TRADE_REPORT('4', "Cross Border Duplicative Trade Report"),

    /**
     * Duplicative Trade Report And Cross Border Duplicative Trade Report
     */
    DUPLICATIVE_TRADE_REPORT_AND_CROSS_BORDER_DUPLICATIVE_TRADE_REPORT('5', "Duplicative Trade Report And Cross Border Duplicative Trade Report"),

    /**
     * Duplicative Trade Report And Intra Group Trade And Cross Border Duplicative Trade Report
     */
    DUPLICATIVE_TRADE_REPORT_AND_INTRA_GROUP_TRADE_AND_CROSS_BORDER_DUPLICATIVE_TRADE_REPORT('6', "Duplicative Trade Report And Intra Group Trade And Cross Border Duplicative Trade Report"),

    /**
     * Intra Group Trade And Cross Border Duplicative Trade Report
     */
    INTRA_GROUP_TRADE_AND_CROSS_BORDER_DUPLICATIVE_TRADE_REPORT('7', "Intra Group Trade And Cross Border Duplicative Trade Report"),

    /**
     * Unique Trade Report
     */
    UNIQUE_TRADE_REPORT('-', "Unique Trade Report");

    private final char wire;

    private final String description;

    DuplicativeIndicator(char wire, String description) {
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
    public static Optional<DuplicativeIndicator> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(DUPLICATIVE_TRADE_REPORT);
            case '2' -> Optional.of(INTRA_GROUP_TRADE);
            case '3' -> Optional.of(DUPLICATIVE_TRADE_REPORT_AND_INTRA_GROUP_TRADE);
            case '4' -> Optional.of(CROSS_BORDER_DUPLICATIVE_TRADE_REPORT);
            case '5' -> Optional.of(DUPLICATIVE_TRADE_REPORT_AND_CROSS_BORDER_DUPLICATIVE_TRADE_REPORT);
            case '6' -> Optional.of(DUPLICATIVE_TRADE_REPORT_AND_INTRA_GROUP_TRADE_AND_CROSS_BORDER_DUPLICATIVE_TRADE_REPORT);
            case '7' -> Optional.of(INTRA_GROUP_TRADE_AND_CROSS_BORDER_DUPLICATIVE_TRADE_REPORT);
            case '-' -> Optional.of(UNIQUE_TRADE_REPORT);
            default -> Optional.empty();
        };
    }
}
