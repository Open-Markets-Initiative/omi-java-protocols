package omi.euronext.optiq.dropcopygateway.sbe.v5_56.enums;

import java.util.Optional;

/**
 * quoteSpreadMultiplier
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteSpreadMultiplier {

    /**
     * Quote_Spread_Multiplier_1
     */
    QUOTE_SPREAD_MULTIPLIER_1((short) 1, "Quote_Spread_Multiplier_1"),

    /**
     * Quote_Spread_Multiplier_2
     */
    QUOTE_SPREAD_MULTIPLIER_2((short) 2, "Quote_Spread_Multiplier_2"),

    /**
     * Quote_Spread_Multiplier_3
     */
    QUOTE_SPREAD_MULTIPLIER_3((short) 3, "Quote_Spread_Multiplier_3"),

    /**
     * quoteSpreadMultiplier
     */
    NO_VALUE((short) 255, "quoteSpreadMultiplier");

    private final short wire;

    private final String description;

    QuoteSpreadMultiplier(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<QuoteSpreadMultiplier> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(QUOTE_SPREAD_MULTIPLIER_1);
            case 2 -> Optional.of(QUOTE_SPREAD_MULTIPLIER_2);
            case 3 -> Optional.of(QUOTE_SPREAD_MULTIPLIER_3);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
