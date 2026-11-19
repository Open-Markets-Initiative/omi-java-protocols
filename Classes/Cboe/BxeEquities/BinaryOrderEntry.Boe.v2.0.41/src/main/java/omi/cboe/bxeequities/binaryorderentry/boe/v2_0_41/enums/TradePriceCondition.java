package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_41.enums;

import java.util.Optional;

/**
 * Defines the TradePriceCondition values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradePriceCondition {

    /**
     * Cum Dividend (deprecated)
     */
    CUM_DIVIDEND((short) 0, "Cum Dividend (deprecated)"),

    /**
     * Ex Dividend (deprecated) 13 = Special Dividend (SDIV)
     */
    EX_DIVIDEND((short) 2, "Ex Dividend (deprecated) 13 = Special Dividend (SDIV)");

    private final short wire;

    private final String description;

    TradePriceCondition(short wire, String description) {
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
    public static Optional<TradePriceCondition> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(CUM_DIVIDEND);
            case 2 -> Optional.of(EX_DIVIDEND);
            default -> Optional.empty();
        };
    }
}
