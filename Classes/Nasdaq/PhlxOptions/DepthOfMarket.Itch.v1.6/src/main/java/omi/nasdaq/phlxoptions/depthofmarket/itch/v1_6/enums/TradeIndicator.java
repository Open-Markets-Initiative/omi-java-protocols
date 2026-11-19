package omi.nasdaq.phlxoptions.depthofmarket.itch.v1_6.enums;

import java.util.Optional;

/**
 * Defines the TradeIndicator values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeIndicator {

    /**
     * Non displayable simple order cross.
     */
    NON_DISPLAYABLE('O', "Non displayable simple order cross."),

    /**
     * Complex order cross.
     */
    COMPLEX('C', "Complex order cross."),

    /**
     * PIXL auction cross.
     */
    PIXL('P', "PIXL auction cross.");

    private final char wire;

    private final String description;

    TradeIndicator(char wire, String description) {
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
    public static Optional<TradeIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(NON_DISPLAYABLE);
            case 'C' -> Optional.of(COMPLEX);
            case 'P' -> Optional.of(PIXL);
            default -> Optional.empty();
        };
    }
}
