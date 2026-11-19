package omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_01.enums;

import java.util.Optional;

/**
 * MMT Level 3.1
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TransactionCategory {

    /**
     * Dark Trade
     */
    DARK_TRADE('D', "Dark Trade"),

    /**
     * Trade That Has Received Price Improvement
     */
    TRADE_THAT_HAS_RECEIVED_PRICE_IMPROVEMENT('R', "Trade That Has Received Price Improvement"),

    /**
     * Packaged Trade
     */
    PACKAGED_TRADE('Z', "Packaged Trade"),

    /**
     * Exchange For Physicals Trade
     */
    EXCHANGE_FOR_PHYSICALS_TRADE('Y', "Exchange For Physicals Trade"),

    /**
     * None Of The Above Apply
     */
    NONE_OF_THE_ABOVE_APPLY('-', "None Of The Above Apply");

    private final char wire;

    private final String description;

    TransactionCategory(char wire, String description) {
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
    public static Optional<TransactionCategory> fromWire(char wire) {
        return switch (wire) {
            case 'D' -> Optional.of(DARK_TRADE);
            case 'R' -> Optional.of(TRADE_THAT_HAS_RECEIVED_PRICE_IMPROVEMENT);
            case 'Z' -> Optional.of(PACKAGED_TRADE);
            case 'Y' -> Optional.of(EXCHANGE_FOR_PHYSICALS_TRADE);
            case '-' -> Optional.of(NONE_OF_THE_ABOVE_APPLY);
            default -> Optional.empty();
        };
    }
}
