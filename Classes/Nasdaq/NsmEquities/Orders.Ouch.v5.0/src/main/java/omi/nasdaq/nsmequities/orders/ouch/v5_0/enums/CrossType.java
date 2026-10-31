package omi.nasdaq.nsmequities.orders.ouch.v5_0.enums;

import java.util.Optional;

/**
 * CrossType
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * continuous market
     */
    CONTINUOUS_MARKET('N', "continuous market"),

    /**
     * opening cross (Nasdaq only)
     */
    OPENING_CROSS('O', "opening cross (Nasdaq only)"),

    /**
     * closing cross (Nasdaq only)
     */
    CLOSING_CROSS('C', "closing cross (Nasdaq only)"),

    /**
     * halt/IPO (Nasdaq only)
     */
    HALT_IPO('H', "halt/IPO (Nasdaq only)"),

    /**
     * supplemental (Nasdaq only)
     */
    SUPPLEMENTAL('S', "supplemental (Nasdaq only)"),

    /**
     * retail (BX only)
     */
    RETAIL('R', "retail (BX only)"),

    /**
     * extended life (Nasdaq only)
     */
    EXTENDED_LIFE('E', "extended life (Nasdaq only)"),

    /**
     * after hours close (Nasdaq only)
     */
    AFTER_HOURS_CLOSE('A', "after hours close (Nasdaq only)");

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
            case 'N' -> Optional.of(CONTINUOUS_MARKET);
            case 'O' -> Optional.of(OPENING_CROSS);
            case 'C' -> Optional.of(CLOSING_CROSS);
            case 'H' -> Optional.of(HALT_IPO);
            case 'S' -> Optional.of(SUPPLEMENTAL);
            case 'R' -> Optional.of(RETAIL);
            case 'E' -> Optional.of(EXTENDED_LIFE);
            case 'A' -> Optional.of(AFTER_HOURS_CLOSE);
            default -> Optional.empty();
        };
    }
}
