package omi.tmx.mx.solamulticast.hsvf.v1_12_2.enums;

import java.util.Optional;

/**
 * Defines the LegRatioSign values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LegRatioSign {

    /**
     * Buy Of The Underlying
     */
    BUY_OF_THE_UNDERLYING('+', "Buy Of The Underlying"),

    /**
     * Sell Of The Underlying
     */
    SELL_OF_THE_UNDERLYING('-', "Sell Of The Underlying");

    private final char wire;

    private final String description;

    LegRatioSign(char wire, String description) {
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
    public static Optional<LegRatioSign> fromWire(char wire) {
        return switch (wire) {
            case '+' -> Optional.of(BUY_OF_THE_UNDERLYING);
            case '-' -> Optional.of(SELL_OF_THE_UNDERLYING);
            default -> Optional.empty();
        };
    }
}
