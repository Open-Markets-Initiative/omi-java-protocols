package omi.nairobi.nairobiequities.replay.mitch.v1_22.enums;

import java.util.Optional;

/**
 * Type of statistic.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum StatisticType {

    /**
     * Closing Price
     */
    CLOSING_PRICE('C', "Closing Price"),

    /**
     * Opening Price
     */
    OPENING_PRICE('O', "Opening Price"),

    /**
     * Previous Close
     */
    PREVIOUS_CLOSE('P', "Previous Close");

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
            case 'O' -> Optional.of(OPENING_PRICE);
            case 'P' -> Optional.of(PREVIOUS_CLOSE);
            default -> Optional.empty();
        };
    }
}
