package omi.nasdaq.nsmequities.noiview.itch.v3_0_2017.enums;

import java.util.Optional;

/**
 * Denotes the type of Nasdaq cross for which the NOII message is being generated
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * NASDAQ Opening Cross.
     */
    OPENING_CROSS('O', "NASDAQ Opening Cross."),

    /**
     * NASDAQ Closing Cross.
     */
    CLOSING_CROSS('C', "NASDAQ Closing Cross."),

    /**
     * Intra-day Opening Cross for IPO and Halted/Paused securities
     */
    CROSS_HALTED_OR_PAUSED('H', "Intra-day Opening Cross for IPO and Halted/Paused securities");

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
            case 'O' -> Optional.of(OPENING_CROSS);
            case 'C' -> Optional.of(CLOSING_CROSS);
            case 'H' -> Optional.of(CROSS_HALTED_OR_PAUSED);
            default -> Optional.empty();
        };
    }
}
