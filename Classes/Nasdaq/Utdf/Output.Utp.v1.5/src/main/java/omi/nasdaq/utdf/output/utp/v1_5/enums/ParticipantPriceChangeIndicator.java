package omi.nasdaq.utdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * Participant Price Change Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ParticipantPriceChangeIndicator {

    /**
     * No prices changed
     */
    NO_PRICES_CHANGED('0', "No prices changed"),

    /**
     * Participant Last price changed
     */
    PARTICIPANT_LAST_PRICE_CHANGED('1', "Participant Last price changed"),

    /**
     * Participant Low price changed
     */
    PARTICIPANT_LOW_PRICE_CHANGED('2', "Participant Low price changed"),

    /**
     * Participant Last and Low prices changed
     */
    PARTICIPANT_LAST_AND_LOW_PRICES_CHANGED('3', "Participant Last and Low prices changed"),

    /**
     * Participant High price changed
     */
    PARTICIPANT_HIGH_PRICE_CHANGED('4', "Participant High price changed"),

    /**
     * Participant Last and High prices changed
     */
    PARTICIPANT_LAST_AND_HIGH_PRICES_CHANGED('5', "Participant Last and High prices changed"),

    /**
     * Participant High and Low prices changed
     */
    PARTICIPANT_HIGH_AND_LOW_PRICES_CHANGED('6', "Participant High and Low prices changed"),

    /**
     * All Participant prices changed
     */
    ALL_PARTICIPANT_PRICES_CHANGED('7', "All Participant prices changed");

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
