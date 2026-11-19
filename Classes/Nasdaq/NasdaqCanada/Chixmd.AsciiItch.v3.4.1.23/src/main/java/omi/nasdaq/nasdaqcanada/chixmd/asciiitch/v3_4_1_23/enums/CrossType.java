package omi.nasdaq.nasdaqcanada.chixmd.asciiitch.v3_4_1_23.enums;

import java.util.Optional;

/**
 * I = Internal; B = Basis; C = Contingent; V = VWAP; X = Intentional Cross; D = Derivative Related; N = Net Asset Value
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * Internal
     */
    INTERNAL('I', "Internal"),

    /**
     * Basis
     */
    BASIS('B', "Basis"),

    /**
     * Contingent
     */
    CONTINGENT('C', "Contingent"),

    /**
     * VWAP
     */
    VWAP('V', "VWAP"),

    /**
     * Intentional Cross
     */
    INTENTIONAL_CROSS('X', "Intentional Cross"),

    /**
     * Derivative Related
     */
    DERIVATIVE_RELATED('D', "Derivative Related"),

    /**
     * Net Asset Value
     */
    NET_ASSET_VALUE('N', "Net Asset Value");

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
            case 'I' -> Optional.of(INTERNAL);
            case 'B' -> Optional.of(BASIS);
            case 'C' -> Optional.of(CONTINGENT);
            case 'V' -> Optional.of(VWAP);
            case 'X' -> Optional.of(INTENTIONAL_CROSS);
            case 'D' -> Optional.of(DERIVATIVE_RELATED);
            case 'N' -> Optional.of(NET_ASSET_VALUE);
            default -> Optional.empty();
        };
    }
}
