package omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.enums;

import java.util.Optional;

/**
 * Trade designation. Valid only for on-exchange executions, space otherwise.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeDesignation {

    /**
     * Cxac Limit
     */
    CXAC_LIMIT('C', "Cxac Limit"),

    /**
     * Cxap Mid Point
     */
    CXAP_MID_POINT('P', "Cxap Mid Point"),

    /**
     * Cxan Near Point
     */
    CXAN_NEAR_POINT('N', "Cxan Near Point"),

    /**
     * Cxaf Far Point
     */
    CXAF_FAR_POINT('F', "Cxaf Far Point"),

    /**
     * Cxam Moc
     */
    CXAM_MOC('M', "Cxam Moc"),

    /**
     * Not Applicable Off Exchange
     */
    NOT_APPLICABLE_OFF_EXCHANGE(' ', "Not Applicable Off Exchange");

    private final char wire;

    private final String description;

    TradeDesignation(char wire, String description) {
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
    public static Optional<TradeDesignation> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CXAC_LIMIT);
            case 'P' -> Optional.of(CXAP_MID_POINT);
            case 'N' -> Optional.of(CXAN_NEAR_POINT);
            case 'F' -> Optional.of(CXAF_FAR_POINT);
            case 'M' -> Optional.of(CXAM_MOC);
            case ' ' -> Optional.of(NOT_APPLICABLE_OFF_EXCHANGE);
            default -> Optional.empty();
        };
    }
}
