package omi.cboe.c1options.binaryorderentry.boe3.v1_0_10.enums;

import java.util.Optional;

/**
 * Indication of a type of trade through
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
     * local best bid or offer
     */
    BBO('2', "local best bid or offer"),

    /**
     * Market quote of complex derived by legs
     */
    SBBO('3', "Market quote of complex derived by legs"),

    /**
     * trade through customer size
     */
    BOOK_TRADE_THROUGH('4', "trade through customer size"),

    /**
     * Due Dilligence Trade Through
     */
    DUE_DILLIGENCE_TRADE_THROUGH('5', "Due Dilligence Trade Through");

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
