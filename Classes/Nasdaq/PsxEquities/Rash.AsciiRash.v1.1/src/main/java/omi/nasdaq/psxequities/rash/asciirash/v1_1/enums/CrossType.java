package omi.nasdaq.psxequities.rash.asciirash.v1_1.enums;

import java.util.Optional;

/**
 * Cross type.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * Opening cross
     */
    OPENING_CROSS('O', "Opening cross"),

    /**
     * Closing cross
     */
    CLOSING_CROSS('C', "Closing cross"),

    /**
     * Intraday cross
     */
    INTRADAY_CROSS('I', "Intraday cross"),

    /**
     * Order is immediately live (don't wait for a cross)
     */
    IMMEDIATELY_LIVE('N', "Order is immediately live (don't wait for a cross)");

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
            case 'I' -> Optional.of(INTRADAY_CROSS);
            case 'N' -> Optional.of(IMMEDIATELY_LIVE);
            default -> Optional.empty();
        };
    }
}
