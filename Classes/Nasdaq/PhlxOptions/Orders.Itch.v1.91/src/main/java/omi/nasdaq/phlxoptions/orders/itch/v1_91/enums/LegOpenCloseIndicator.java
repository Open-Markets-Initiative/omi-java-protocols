package omi.nasdaq.phlxoptions.orders.itch.v1_91.enums;

import java.util.Optional;

/**
 * Indicates whether this Order opens or closes a position for leg:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LegOpenCloseIndicator {

    /**
     * Opens position
     */
    OPENS_POSITION('O', "Opens position"),

    /**
     * Closes position
     */
    CLOSES_POSITION('C', "Closes position"),

    /**
     * Stock Leg
     */
    STOCK_LEG(' ', "Stock Leg");

    private final char wire;

    private final String description;

    LegOpenCloseIndicator(char wire, String description) {
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
    public static Optional<LegOpenCloseIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OPENS_POSITION);
            case 'C' -> Optional.of(CLOSES_POSITION);
            case ' ' -> Optional.of(STOCK_LEG);
            default -> Optional.empty();
        };
    }
}
