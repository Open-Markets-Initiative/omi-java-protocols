package omi.tradelogiq.lynxats.tcplevel2.itch.v2_01.enums;

import java.util.Optional;

/**
 * The kind of cross being reported
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * Derivatives Cross
     */
    DERIVATIVES_CROSS('D', "Derivatives Cross"),

    /**
     * Internal Cross
     */
    INTERNAL_CROSS('I', "Internal Cross"),

    /**
     * Intentional Cross
     */
    INTENTIONAL_CROSS('M', "Intentional Cross"),

    /**
     * Net Asset Value (NAV) Cross
     */
    NET_ASSET_VALUE_CROSS('N', "Net Asset Value (NAV) Cross");

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
            case 'D' -> Optional.of(DERIVATIVES_CROSS);
            case 'I' -> Optional.of(INTERNAL_CROSS);
            case 'M' -> Optional.of(INTENTIONAL_CROSS);
            case 'N' -> Optional.of(NET_ASSET_VALUE_CROSS);
            default -> Optional.empty();
        };
    }
}
