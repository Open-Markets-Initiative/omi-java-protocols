package omi.nasdaq.nsmequities.totalview.itch.v5_0_2017.enums;

import java.util.Optional;

/**
 * Indicates if the market participant firm qualifies as a Primary Market Maker in accordance with NASDAQ marketplace rules
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PrimaryMarketMaker {

    /**
     * primary market maker
     */
    PRIMARY('Y', "primary market maker"),

    /**
     * non-primary market maker
     */
    NON_PRIMARY('N', "non-primary market maker");

    private final char wire;

    private final String description;

    PrimaryMarketMaker(char wire, String description) {
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
    public static Optional<PrimaryMarketMaker> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(PRIMARY);
            case 'N' -> Optional.of(NON_PRIMARY);
            default -> Optional.empty();
        };
    }
}
