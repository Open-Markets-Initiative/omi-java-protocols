package omi.cboe.cboeeurope.tradereporting.boe.v2_0_24.enums;

import java.util.Optional;

/**
 * Defines the MatchType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MatchType {

    /**
     * Trade Reporting (Off-Exchange)
     */
    TRADE_REPORTING_1((short) 1, "Trade Reporting (Off-Exchange)"),

    /**
     * Trade Reporting (On-Exchange)
     */
    TRADE_REPORTING_3((short) 3, "Trade Reporting (On-Exchange)"),

    /**
     * Trade Reporting (Systematic Internalizer)
     */
    TRADE_REPORTING_9((short) 9, "Trade Reporting (Systematic Internalizer)");

    private final short wire;

    private final String description;

    MatchType(short wire, String description) {
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
    public static Optional<MatchType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(TRADE_REPORTING_1);
            case 3 -> Optional.of(TRADE_REPORTING_3);
            case 9 -> Optional.of(TRADE_REPORTING_9);
            default -> Optional.empty();
        };
    }
}
