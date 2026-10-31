package omi.nasdaq.nsmequities.totalview.itch.v5_0_2023.enums;

import java.util.Optional;

/**
 * The Nasdaq cross session for which the message is being generated
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * Nasdaq Opening Cross
     */
    OPENING('O', "Nasdaq Opening Cross"),

    /**
     * Nasdaq Closing Cross
     */
    CLOSING('C', "Nasdaq Closing Cross"),

    /**
     * Cross for IPO and halted / paused securities
     */
    HALTED_OR_PAUSED('H', "Cross for IPO and halted / paused securities"),

    /**
     * Extended Trading Close
     */
    EXTENDED_CLOSE('A', "Extended Trading Close");

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
            case 'O' -> Optional.of(OPENING);
            case 'C' -> Optional.of(CLOSING);
            case 'H' -> Optional.of(HALTED_OR_PAUSED);
            case 'A' -> Optional.of(EXTENDED_CLOSE);
            default -> Optional.empty();
        };
    }
}
