package omi.nyse.nyseequities.openbook.ultra.v2_1_b.enums;

import java.util.Optional;

/**
 * The current quote condition for the symbol.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteCondition {

    /**
     * No Special Quote Condition
     */
    NO_SPECIAL_QUOTE_CONDITION(' ', "No Special Quote Condition"),

    /**
     * Slow Quote
     */
    SLOW_QUOTE('W', "Slow Quote");

    private final char wire;

    private final String description;

    QuoteCondition(char wire, String description) {
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
    public static Optional<QuoteCondition> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NO_SPECIAL_QUOTE_CONDITION);
            case 'W' -> Optional.of(SLOW_QUOTE);
            default -> Optional.empty();
        };
    }
}
