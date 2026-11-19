package omi.jpx.tseequities.indexstatistics.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the state of the current price.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum StateSign {

    /**
     * Ask Special Quote
     */
    ASK_SPECIAL_QUOTE('1', "Ask Special Quote"),

    /**
     * Bid Special Quote
     */
    BID_SPECIAL_QUOTE('2', "Bid Special Quote"),

    /**
     * Ask Continuous Execution Quote
     */
    ASK_CONTINUOUS_EXECUTION_QUOTE('3', "Ask Continuous Execution Quote"),

    /**
     * Bid Continuous Execution Quote
     */
    BID_CONTINUOUS_EXECUTION_QUOTE('4', "Bid Continuous Execution Quote"),

    /**
     * Other Than The Above
     */
    OTHER_THAN_THE_ABOVE(' ', "Other Than The Above");

    private final char wire;

    private final String description;

    StateSign(char wire, String description) {
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
    public static Optional<StateSign> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(ASK_SPECIAL_QUOTE);
            case '2' -> Optional.of(BID_SPECIAL_QUOTE);
            case '3' -> Optional.of(ASK_CONTINUOUS_EXECUTION_QUOTE);
            case '4' -> Optional.of(BID_CONTINUOUS_EXECUTION_QUOTE);
            case ' ' -> Optional.of(OTHER_THAN_THE_ABOVE);
            default -> Optional.empty();
        };
    }
}
