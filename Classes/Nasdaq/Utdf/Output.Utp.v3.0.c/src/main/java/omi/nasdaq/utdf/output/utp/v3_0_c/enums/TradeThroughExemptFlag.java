package omi.nasdaq.utdf.output.utp.v3_0_c.enums;

import java.util.Optional;

/**
 * Trade Through Exempt Flag
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeThroughExemptFlag {

    /**
     * Rule 611 Trade Through Exempt
     */
    RULE_611_TRADE_THROUGH_EXEMPT('X', "Rule 611 Trade Through Exempt"),

    /**
     * Not Rule 611 Trade Through Exempt
     */
    NOT_RULE_611_TRADE_THROUGH_EXEMPT(' ', "Not Rule 611 Trade Through Exempt");

    private final char wire;

    private final String description;

    TradeThroughExemptFlag(char wire, String description) {
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
    public static Optional<TradeThroughExemptFlag> fromWire(char wire) {
        return switch (wire) {
            case 'X' -> Optional.of(RULE_611_TRADE_THROUGH_EXEMPT);
            case ' ' -> Optional.of(NOT_RULE_611_TRADE_THROUGH_EXEMPT);
            default -> Optional.empty();
        };
    }
}
