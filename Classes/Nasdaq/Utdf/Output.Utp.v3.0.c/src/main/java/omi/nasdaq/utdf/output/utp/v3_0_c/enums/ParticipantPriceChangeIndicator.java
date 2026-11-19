package omi.nasdaq.utdf.output.utp.v3_0_c.enums;

import java.util.Optional;

/**
 * Participant Price Change Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ParticipantPriceChangeIndicator {

    /**
     * No Prices Changed
     */
    NO_PRICES_CHANGED('0', "No Prices Changed"),

    /**
     * Participant Last Price Changed
     */
    PARTICIPANT_LAST_PRICE_CHANGED('1', "Participant Last Price Changed"),

    /**
     * Participant Low Price Changed
     */
    PARTICIPANT_LOW_PRICE_CHANGED('2', "Participant Low Price Changed"),

    /**
     * Participant Last And Low Prices Changed
     */
    PARTICIPANT_LAST_AND_LOW_PRICES_CHANGED('3', "Participant Last And Low Prices Changed"),

    /**
     * Participant High Price Changed
     */
    PARTICIPANT_HIGH_PRICE_CHANGED('4', "Participant High Price Changed"),

    /**
     * Participant Last And High Prices Changed
     */
    PARTICIPANT_LAST_AND_HIGH_PRICES_CHANGED('5', "Participant Last And High Prices Changed"),

    /**
     * Participant High And Low Prices Changed
     */
    PARTICIPANT_HIGH_AND_LOW_PRICES_CHANGED('6', "Participant High And Low Prices Changed"),

    /**
     * All Participant Prices Changed
     */
    ALL_PARTICIPANT_PRICES_CHANGED('7', "All Participant Prices Changed");

    private final char wire;

    private final String description;

    ParticipantPriceChangeIndicator(char wire, String description) {
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
    public static Optional<ParticipantPriceChangeIndicator> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NO_PRICES_CHANGED);
            case '1' -> Optional.of(PARTICIPANT_LAST_PRICE_CHANGED);
            case '2' -> Optional.of(PARTICIPANT_LOW_PRICE_CHANGED);
            case '3' -> Optional.of(PARTICIPANT_LAST_AND_LOW_PRICES_CHANGED);
            case '4' -> Optional.of(PARTICIPANT_HIGH_PRICE_CHANGED);
            case '5' -> Optional.of(PARTICIPANT_LAST_AND_HIGH_PRICES_CHANGED);
            case '6' -> Optional.of(PARTICIPANT_HIGH_AND_LOW_PRICES_CHANGED);
            case '7' -> Optional.of(ALL_PARTICIPANT_PRICES_CHANGED);
            default -> Optional.empty();
        };
    }
}
