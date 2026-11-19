package omi.nasdaq.iseoptions.cti.itch.v3_0.enums;

import java.util.Optional;

/**
 * B = Leg is on buy side, S = Leg is on sell side
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LegSide {

    /**
     * Leg is on buy side
     */
    BUY('B', "Leg is on buy side"),

    /**
     * Leg is on sell side
     */
    SELL('S', "Leg is on sell side");

    private final char wire;

    private final String description;

    LegSide(char wire, String description) {
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
    public static Optional<LegSide> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BUY);
            case 'S' -> Optional.of(SELL);
            default -> Optional.empty();
        };
    }
}
