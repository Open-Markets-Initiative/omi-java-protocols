package omi.cboe.c1options.marketdatafeed.csm.v1_4_2.enums;

import java.util.Optional;

/**
 * Side of book for this entry.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MdEntryType {

    /**
     * Bid
     */
    BID('0', "Bid"),

    /**
     * Ask
     */
    ASK('1', "Ask"),

    /**
     * Trade (LastSale)
     */
    TRADE('2', "Trade (LastSale)"),

    /**
     * Index Value (Used only in Index Value messages)
     */
    INDEX_VALUE('3', "Index Value (Used only in Index Value messages)"),

    /**
     * Opening Price
     */
    OPENING_PRICE('4', "Opening Price"),

    /**
     * Settlement value (Used only in Settlement messages)
     */
    SETTLEMENT_VALUE('6', "Settlement value (Used only in Settlement messages)"),

    /**
     * High (Trading Session High Price)
     */
    HIGH('7', "High (Trading Session High Price)"),

    /**
     * Low (Trading Session Low Price)
     */
    LOW('8', "Low (Trading Session Low Price)");

    private final char wire;

    private final String description;

    MdEntryType(char wire, String description) {
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
    public static Optional<MdEntryType> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(BID);
            case '1' -> Optional.of(ASK);
            case '2' -> Optional.of(TRADE);
            case '3' -> Optional.of(INDEX_VALUE);
            case '4' -> Optional.of(OPENING_PRICE);
            case '6' -> Optional.of(SETTLEMENT_VALUE);
            case '7' -> Optional.of(HIGH);
            case '8' -> Optional.of(LOW);
            default -> Optional.empty();
        };
    }
}
