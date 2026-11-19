package omi.cboe.edgxoptions.binaryorderentry.boe.v2_10.enums;

import java.util.Optional;

/**
 * Defines the EquityLegShortSell values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EquityLegShortSell {

    /**
     * Sell Short
     */
    SELL_SHORT('5', "Sell Short"),

    /**
     * Sell Short Exempt
     */
    SELL_SHORT_EXEMPT('6', "Sell Short Exempt"),

    /**
     * Disabled
     */
    DISABLED('0', "Disabled"),

    /**
     * Enabled
     */
    ENABLED('1', "Enabled");

    private final char wire;

    private final String description;

    EquityLegShortSell(char wire, String description) {
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
    public static Optional<EquityLegShortSell> fromWire(char wire) {
        return switch (wire) {
            case '5' -> Optional.of(SELL_SHORT);
            case '6' -> Optional.of(SELL_SHORT_EXEMPT);
            case '0' -> Optional.of(DISABLED);
            case '1' -> Optional.of(ENABLED);
            default -> Optional.empty();
        };
    }
}
