package omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.enums;

import java.util.Optional;

/**
 * Settlement related conditions. Valid values:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Transaction {

    /**
     * Transaction is a late report of the opening trade, but is in the correct sequence
     */
    OPENING_TRADE_IN_SEQUENCE('H', "Transaction is a late report of the opening trade, but is in the correct sequence"),

    /**
     * Transaction is a late report of the opening trade and is out of sequence
     */
    OPENING_TRADE_OUT_OF_SEQUENCE('F', "Transaction is a late report of the opening trade and is out of sequence"),

    /**
     * Transaction is being reported late, but is in the correct sequence
     */
    IN_SEQUENCE('D', "Transaction is being reported late, but is in the correct sequence"),

    /**
     * Transaction is being reported late and is out of sequence
     */
    OUT_OF_SEQUENCE('B', "Transaction is being reported late and is out of sequence");

    private final char wire;

    private final String description;

    Transaction(char wire, String description) {
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
    public static Optional<Transaction> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(OPENING_TRADE_IN_SEQUENCE);
            case 'F' -> Optional.of(OPENING_TRADE_OUT_OF_SEQUENCE);
            case 'D' -> Optional.of(IN_SEQUENCE);
            case 'B' -> Optional.of(OUT_OF_SEQUENCE);
            default -> Optional.empty();
        };
    }
}
