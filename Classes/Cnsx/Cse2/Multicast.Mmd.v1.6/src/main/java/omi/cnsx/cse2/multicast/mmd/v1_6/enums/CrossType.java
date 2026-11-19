package omi.cnsx.cse2.multicast.mmd.v1_6.enums;

import java.util.Optional;

/**
 * Type of cross the trade resulted from.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CrossType {

    /**
     * Regular
     */
    REGULAR('R', "Regular"),

    /**
     * Internal
     */
    INTERNAL('I', "Internal"),

    /**
     * Contingent
     */
    CONTINGENT('C', "Contingent"),

    /**
     * Basis
     */
    BASIS('B', "Basis"),

    /**
     * Vwap
     */
    VWAP('V', "Vwap"),

    /**
     * Derivative Related
     */
    DERIVATIVE_RELATED('D', "Derivative Related"),

    /**
     * Otherwise Empty String Not Specified
     */
    OTHERWISE_EMPTY_STRING_NOT_SPECIFIED(' ', "Otherwise Empty String Not Specified"),

    /**
     * Ccp Closing Price
     */
    CCP_CLOSING_PRICE('S', "Ccp Closing Price"),

    /**
     * Net Asset Value Nav
     */
    NET_ASSET_VALUE_NAV('N', "Net Asset Value Nav");

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
            case 'R' -> Optional.of(REGULAR);
            case 'I' -> Optional.of(INTERNAL);
            case 'C' -> Optional.of(CONTINGENT);
            case 'B' -> Optional.of(BASIS);
            case 'V' -> Optional.of(VWAP);
            case 'D' -> Optional.of(DERIVATIVE_RELATED);
            case ' ' -> Optional.of(OTHERWISE_EMPTY_STRING_NOT_SPECIFIED);
            case 'S' -> Optional.of(CCP_CLOSING_PRICE);
            case 'N' -> Optional.of(NET_ASSET_VALUE_NAV);
            default -> Optional.empty();
        };
    }
}
