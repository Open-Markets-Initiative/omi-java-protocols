package omi.siac.cqs.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * Identifies the settlement condition for a security
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SettlementCondition {

    /**
     * Regular Way Settlement
     */
    REGULAR_WAY_SETTLEMENT(' ', "Regular Way Settlement"),

    /**
     * Cash Only Settlement
     */
    CASH_ONLY_SETTLEMENT('A', "Cash Only Settlement"),

    /**
     * Next Day Only Settlement
     */
    NEXT_DAY_ONLY_SETTLEMENT('B', "Next Day Only Settlement");

    private final char wire;

    private final String description;

    SettlementCondition(char wire, String description) {
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
    public static Optional<SettlementCondition> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(REGULAR_WAY_SETTLEMENT);
            case 'A' -> Optional.of(CASH_ONLY_SETTLEMENT);
            case 'B' -> Optional.of(NEXT_DAY_ONLY_SETTLEMENT);
            default -> Optional.empty();
        };
    }
}
