package omi.nasdaq.uqdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * Special Condition
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SpecialCondition {

    /**
     * One Sided National BBO at Market Close
     */
    ONE_SIDED_NATIONAL_BBO_AT_MARKET_CLOSE('O', "One Sided National BBO at Market Close"),

    /**
     * Trading Halt In Effect at Market Close
     */
    TRADING_HALT_IN_EFFECT_AT_MARKET_CLOSE('H', "Trading Halt In Effect at Market Close"),

    /**
     * No Eligible Market Participant Quotes in Issue at Market Close
     */
    NO_ELIGIBLE_MARKET_PARTICIPANT_QUOTES_IN_ISSUE_AT_MARKET_CLOSE('M', "No Eligible Market Participant Quotes in Issue at Market Close"),

    /**
     * No Special Condition exists
     */
    NO_SPECIAL_CONDITION_EXISTS(' ', "No Special Condition exists");

    private final char wire;

    private final String description;

    SpecialCondition(char wire, String description) {
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
    public static Optional<SpecialCondition> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(ONE_SIDED_NATIONAL_BBO_AT_MARKET_CLOSE);
            case 'H' -> Optional.of(TRADING_HALT_IN_EFFECT_AT_MARKET_CLOSE);
            case 'M' -> Optional.of(NO_ELIGIBLE_MARKET_PARTICIPANT_QUOTES_IN_ISSUE_AT_MARKET_CLOSE);
            case ' ' -> Optional.of(NO_SPECIAL_CONDITION_EXISTS);
            default -> Optional.empty();
        };
    }
}
