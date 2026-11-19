package omi.nasdaq.nomoptions.itto.itch.v4_0_2025.enums;

import java.util.Optional;

/**
 * The NASDAQ auction session for which the message is being generated.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * NASDAQ Opening/Reopening
     */
    NASDAQ_OPENING_REOPENING('O', "NASDAQ Opening/Reopening"),

    /**
     * Price Improvement
     */
    PRICE_IMPROVEMENT('P', "Price Improvement");

    private final char wire;

    private final String description;

    CrossType(char wire, String description) {
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
    public static Optional<CrossType> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(NASDAQ_OPENING_REOPENING);
            case 'P' -> Optional.of(PRICE_IMPROVEMENT);
            default -> Optional.empty();
        };
    }
}
