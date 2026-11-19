package omi.nasdaq.ntxoptions.cti.itch.v1_3.enums;

import java.util.Optional;

/**
 * X = new trade, Y = trade correction, Z = trade cancel (if trade cancel messages are to be sent using this message)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TransactionType {

    /**
     * New trade
     */
    NEW_TRADE('X', "New trade"),

    /**
     * Trade correction
     */
    TRADE_CORRECTION('Y', "Trade correction"),

    /**
     * Trade cancel (if trade cancel messages are to be sent using this message)
     */
    TRADE_CANCEL('Z', "Trade cancel (if trade cancel messages are to be sent using this message)");

    private final char wire;

    private final String description;

    TransactionType(char wire, String description) {
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
    public static Optional<TransactionType> fromWire(char wire) {
        return switch (wire) {
            case 'X' -> Optional.of(NEW_TRADE);
            case 'Y' -> Optional.of(TRADE_CORRECTION);
            case 'Z' -> Optional.of(TRADE_CANCEL);
            default -> Optional.empty();
        };
    }
}
