package omi.cboe.c2options.binaryorderentry.boe.v2_10.enums;

import java.util.Optional;

/**
 * Indication of a type of trade through. Corresponds to TradeThroughAlertType (21098) in Cboe FIX.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeThroughAlertType {

    /**
     * No Trade Through
     */
    NO_TRADE_THROUGH('0', "No Trade Through"),

    /**
     * Nbbo
     */
    NBBO('1', "Nbbo"),

    /**
     * Bbo
     */
    BBO('2', "Bbo"),

    /**
     * Sbbo
     */
    SBBO('3', "Sbbo"),

    /**
     * Book Trade Through
     */
    BOOK_TRADE_THROUGH('4', "Book Trade Through"),

    /**
     * Due Diligence Trade Through
     */
    DUE_DILIGENCE_TRADE_THROUGH('5', "Due Diligence Trade Through");

    private final char wire;

    private final String description;

    TradeThroughAlertType(char wire, String description) {
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
    public static Optional<TradeThroughAlertType> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NO_TRADE_THROUGH);
            case '1' -> Optional.of(NBBO);
            case '2' -> Optional.of(BBO);
            case '3' -> Optional.of(SBBO);
            case '4' -> Optional.of(BOOK_TRADE_THROUGH);
            case '5' -> Optional.of(DUE_DILIGENCE_TRADE_THROUGH);
            default -> Optional.empty();
        };
    }
}
