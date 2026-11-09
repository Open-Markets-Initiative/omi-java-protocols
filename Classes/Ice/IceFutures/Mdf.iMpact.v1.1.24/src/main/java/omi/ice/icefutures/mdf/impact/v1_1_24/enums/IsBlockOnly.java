package omi.ice.icefutures.mdf.impact.v1_1_24.enums;

import java.util.Optional;

/**
 * Indicates if Market is only tradable via ICE Block Trade. This also means the screen trading is not allowed for the market. ‘Y’ or ‘N’
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum IsBlockOnly {

    /**
     * Only Tradable Via Ice Block Trade
     */
    YES('Y', "Only Tradable Via Ice Block Trade"),

    /**
     * Not Only Tradable Via Ice Block Trade
     */
    NO('N', "Not Only Tradable Via Ice Block Trade");

    private final char wire;

    private final String description;

    IsBlockOnly(char wire, String description) {
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
    public static Optional<IsBlockOnly> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(YES);
            case 'N' -> Optional.of(NO);
            default -> Optional.empty();
        };
    }
}
