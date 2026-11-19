package omi.hkex.hkexsecurities.fulltickretrans.omd.v1_46.enums;

import java.util.Optional;

/**
 * Indicator for short-sell authorization.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ShortSellFlag {

    /**
     * Short Sell Allowed
     */
    SHORT_SELL_ALLOWED('Y', "Short Sell Allowed"),

    /**
     * Short Sell Not Allowed
     */
    SHORT_SELL_NOT_ALLOWED('N', "Short Sell Not Allowed");

    private final char wire;

    private final String description;

    ShortSellFlag(char wire, String description) {
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
    public static Optional<ShortSellFlag> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(SHORT_SELL_ALLOWED);
            case 'N' -> Optional.of(SHORT_SELL_NOT_ALLOWED);
            default -> Optional.empty();
        };
    }
}
