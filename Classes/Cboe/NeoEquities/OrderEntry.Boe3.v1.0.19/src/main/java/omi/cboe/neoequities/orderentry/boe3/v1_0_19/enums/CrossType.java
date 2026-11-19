package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * Identifies the type of cross being printed
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * Basis
     */
    BASIS('B', "Basis"),

    /**
     * Contingent
     */
    CONTINGENT('C', "Contingent"),

    /**
     * Derivative
     */
    DERIVATIVE('D', "Derivative"),

    /**
     * Internal
     */
    INTERNAL('I', "Internal"),

    /**
     * Net Asset Value Nav
     */
    NET_ASSET_VALUE_NAV('N', "Net Asset Value Nav"),

    /**
     * Regular
     */
    REGULAR('R', "Regular"),

    /**
     * Vwap
     */
    VWAP('V', "Vwap");

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
            case 'B' -> Optional.of(BASIS);
            case 'C' -> Optional.of(CONTINGENT);
            case 'D' -> Optional.of(DERIVATIVE);
            case 'I' -> Optional.of(INTERNAL);
            case 'N' -> Optional.of(NET_ASSET_VALUE_NAV);
            case 'R' -> Optional.of(REGULAR);
            case 'V' -> Optional.of(VWAP);
            default -> Optional.empty();
        };
    }
}
