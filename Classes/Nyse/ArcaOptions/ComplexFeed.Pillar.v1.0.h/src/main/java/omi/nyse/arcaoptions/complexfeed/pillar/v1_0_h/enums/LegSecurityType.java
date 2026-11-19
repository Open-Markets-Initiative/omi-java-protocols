package omi.nyse.arcaoptions.complexfeed.pillar.v1_0_h.enums;

import java.util.Optional;

/**
 * Leg Security Type. This field will repeat for each leg.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LegSecurityType {

    /**
     * Options Series Leg
     */
    OPTIONS_SERIES_LEG('O', "Options Series Leg"),

    /**
     * Equity Stock Leg
     */
    EQUITY_STOCK_LEG('E', "Equity Stock Leg"),

    /**
     * Options Flex Leg
     */
    OPTIONS_FLEX_LEG('F', "Options Flex Leg");

    private final char wire;

    private final String description;

    LegSecurityType(char wire, String description) {
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
    public static Optional<LegSecurityType> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(OPTIONS_SERIES_LEG);
            case 'E' -> Optional.of(EQUITY_STOCK_LEG);
            case 'F' -> Optional.of(OPTIONS_FLEX_LEG);
            default -> Optional.empty();
        };
    }
}
