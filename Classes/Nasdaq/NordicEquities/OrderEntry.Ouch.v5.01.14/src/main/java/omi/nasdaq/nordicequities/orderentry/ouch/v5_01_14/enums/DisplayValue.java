package omi.nasdaq.nordicequities.orderentry.ouch.v5_01_14.enums;

import java.util.Optional;

/**
 * How the order is displayed
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DisplayValue {

    /**
     * Display
     */
    DISPLAY('Y', "Display"),

    /**
     * Non Display
     */
    NON_DISPLAY('N', "Non Display"),

    /**
     * Auction On Demand
     */
    AUCTION_ON_DEMAND('A', "Auction On Demand"),

    /**
     * Nordic Mid
     */
    NORDIC_MID('M', "Nordic Mid");

    private final char wire;

    private final String description;

    DisplayValue(char wire, String description) {
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
    public static Optional<DisplayValue> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(DISPLAY);
            case 'N' -> Optional.of(NON_DISPLAY);
            case 'A' -> Optional.of(AUCTION_ON_DEMAND);
            case 'M' -> Optional.of(NORDIC_MID);
            default -> Optional.empty();
        };
    }
}
