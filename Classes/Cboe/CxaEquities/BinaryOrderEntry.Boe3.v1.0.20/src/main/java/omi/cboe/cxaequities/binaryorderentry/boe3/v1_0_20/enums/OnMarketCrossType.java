package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.enums;

import java.util.Optional;

/**
 * Type of on-market crossing
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OnMarketCrossType {

    /**
     * Trade Was The Result Of A Broker Preferenced Crossing
     */
    TRADE_WAS_THE_RESULT_OF_A_BROKER_PREFERENCED_CROSSING('B', "Trade Was The Result Of A Broker Preferenced Crossing"),

    /**
     * NULL (0x00), other
     */
    OTHER('0', "NULL (0x00), other");

    private final char wire;

    private final String description;

    OnMarketCrossType(char wire, String description) {
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
    public static Optional<OnMarketCrossType> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(TRADE_WAS_THE_RESULT_OF_A_BROKER_PREFERENCED_CROSSING);
            case '0' -> Optional.of(OTHER);
            default -> Optional.empty();
        };
    }
}
