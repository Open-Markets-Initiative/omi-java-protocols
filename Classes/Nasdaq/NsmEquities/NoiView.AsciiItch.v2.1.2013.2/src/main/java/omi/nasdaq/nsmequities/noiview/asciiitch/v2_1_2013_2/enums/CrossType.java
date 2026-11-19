package omi.nasdaq.nsmequities.noiview.asciiitch.v2_1_2013_2.enums;

import java.util.Optional;

/**
 * Denotes the type of NASDAQ cross for which the NOII message is being generated.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * Open Cross
     */
    OPEN_CROSS('O', "Open Cross"),

    /**
     * Close Cross
     */
    CLOSE_CROSS('C', "Close Cross"),

    /**
     * Intraday Opening Cross For Ipo And Halted Paused Securities
     */
    INTRADAY_OPENING_CROSS_FOR_IPO_AND_HALTED_PAUSED_SECURITIES('H', "Intraday Opening Cross For Ipo And Halted Paused Securities");

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
            case 'O' -> Optional.of(OPEN_CROSS);
            case 'C' -> Optional.of(CLOSE_CROSS);
            case 'H' -> Optional.of(INTRADAY_OPENING_CROSS_FOR_IPO_AND_HALTED_PAUSED_SECURITIES);
            default -> Optional.empty();
        };
    }
}
