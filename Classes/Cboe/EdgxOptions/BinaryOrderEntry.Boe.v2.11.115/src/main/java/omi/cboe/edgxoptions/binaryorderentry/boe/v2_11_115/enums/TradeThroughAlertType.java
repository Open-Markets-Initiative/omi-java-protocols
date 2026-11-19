package omi.cboe.edgxoptions.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Defines the TradeThroughAlertType values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeThroughAlertType {

    /**
     * No trade through
     */
    NO_TRADE_THROUGH('0', "No trade through"),

    /**
     * NBBO
     */
    NBBO('1', "NBBO"),

    /**
     * BBO (local best bid or offer)
     */
    BBO('2', "BBO (local best bid or offer)"),

    /**
     * SBBO (market quote of complex derived by legs)
     */
    SBBO('3', "SBBO (market quote of complex derived by legs)"),

    /**
     * Book trade through (trade through customer size)
     */
    BOOK_TRADE_THROUGH('4', "Book trade through (trade through customer size)"),

    /**
     * Due Dilligence trade through
     */
    DUE_DILLIGENCE_TRADE_THROUGH('5', "Due Dilligence trade through");

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
            case '5' -> Optional.of(DUE_DILLIGENCE_TRADE_THROUGH);
            default -> Optional.empty();
        };
    }
}
