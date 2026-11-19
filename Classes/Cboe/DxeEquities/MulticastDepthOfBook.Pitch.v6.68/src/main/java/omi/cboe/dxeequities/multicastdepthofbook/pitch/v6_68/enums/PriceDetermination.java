package omi.cboe.dxeequities.multicastdepthofbook.pitch.v6_68.enums;

import java.util.Optional;

/**
 * Price Determination
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceDetermination {

    /**
     * Normal
     */
    NORMAL('0', "Normal"),

    /**
     * Manual
     */
    MANUAL('1', "Manual");

    private final char wire;

    private final String description;

    PriceDetermination(char wire, String description) {
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
    public static Optional<PriceDetermination> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NORMAL);
            case '1' -> Optional.of(MANUAL);
            default -> Optional.empty();
        };
    }
}
