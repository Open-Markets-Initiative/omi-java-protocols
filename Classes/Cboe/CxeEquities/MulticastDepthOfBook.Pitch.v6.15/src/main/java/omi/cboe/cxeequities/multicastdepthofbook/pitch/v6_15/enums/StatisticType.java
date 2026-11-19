package omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_15.enums;

import java.util.Optional;

/**
 * C = Closing Price H = High Price L = Low Price O = Opening Price P = Previous Closing Price
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum StatisticType {

    /**
     * Closing Price
     */
    CLOSING_PRICE('C', "Closing Price"),

    /**
     * High Price
     */
    HIGH_PRICE('H', "High Price"),

    /**
     * Low Price
     */
    LOW_PRICE('L', "Low Price"),

    /**
     * Opening Price
     */
    OPENING_PRICE('O', "Opening Price"),

    /**
     * Previous Closing Price
     */
    PREVIOUS_CLOSING_PRICE('P', "Previous Closing Price");

    private final char wire;

    private final String description;

    StatisticType(char wire, String description) {
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
    public static Optional<StatisticType> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CLOSING_PRICE);
            case 'H' -> Optional.of(HIGH_PRICE);
            case 'L' -> Optional.of(LOW_PRICE);
            case 'O' -> Optional.of(OPENING_PRICE);
            case 'P' -> Optional.of(PREVIOUS_CLOSING_PRICE);
            default -> Optional.empty();
        };
    }
}
