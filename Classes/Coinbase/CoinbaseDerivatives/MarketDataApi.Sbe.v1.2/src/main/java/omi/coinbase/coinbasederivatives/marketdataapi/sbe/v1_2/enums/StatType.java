package omi.coinbase.coinbasederivatives.marketdataapi.sbe.v1_2.enums;

import java.util.Optional;

/**
 * statType
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum StatType {

    /**
     * DAY_OPENING_PRICE
     */
    DAY_OPENING_PRICE('4', "DAY_OPENING_PRICE"),

    /**
     * CLOSING_PRICE
     */
    CLOSING_PRICE('5', "CLOSING_PRICE"),

    /**
     * SETTLEMENT_PRICE
     */
    SETTLEMENT_PRICE('6', "SETTLEMENT_PRICE"),

    /**
     * TRADING_SESSION_HIGH_PRICE
     */
    TRADING_SESSION_HIGH_PRICE('7', "TRADING_SESSION_HIGH_PRICE"),

    /**
     * TRADING_SESSION_LOW_PRICE
     */
    TRADING_SESSION_LOW_PRICE('8', "TRADING_SESSION_LOW_PRICE"),

    /**
     * REFERENCE_PRICE
     */
    REFERENCE_PRICE('F', "REFERENCE_PRICE"),

    /**
     * INDICATIVE_OPENING_PRICE
     */
    INDICATIVE_OPENING_PRICE('I', "INDICATIVE_OPENING_PRICE");

    private final char wire;

    private final String description;

    StatType(char wire, String description) {
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
    public static Optional<StatType> fromWire(char wire) {
        return switch (wire) {
            case '4' -> Optional.of(DAY_OPENING_PRICE);
            case '5' -> Optional.of(CLOSING_PRICE);
            case '6' -> Optional.of(SETTLEMENT_PRICE);
            case '7' -> Optional.of(TRADING_SESSION_HIGH_PRICE);
            case '8' -> Optional.of(TRADING_SESSION_LOW_PRICE);
            case 'F' -> Optional.of(REFERENCE_PRICE);
            case 'I' -> Optional.of(INDICATIVE_OPENING_PRICE);
            default -> Optional.empty();
        };
    }
}
