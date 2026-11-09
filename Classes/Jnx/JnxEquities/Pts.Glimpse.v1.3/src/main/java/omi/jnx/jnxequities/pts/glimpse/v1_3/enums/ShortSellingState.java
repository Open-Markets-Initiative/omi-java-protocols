package omi.jnx.jnxequities.pts.glimpse.v1_3.enums;

import java.util.Optional;

/**
 * Current short selling price restriction state; values: 0 = No price restriction, 1 = Price restriction in effect.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ShortSellingState {

    /**
     * No price restriction
     */
    NO_PRICE_RESTRICTION('0', "No price restriction"),

    /**
     * Price restriction in effect
     */
    PRICE_RESTRICTION_IN_EFFECT('1', "Price restriction in effect");

    private final char wire;

    private final String description;

    ShortSellingState(char wire, String description) {
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
    public static Optional<ShortSellingState> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NO_PRICE_RESTRICTION);
            case '1' -> Optional.of(PRICE_RESTRICTION_IN_EFFECT);
            default -> Optional.empty();
        };
    }
}
