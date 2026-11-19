package omi.jpx.fseequities.standard.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the reference execution for Sequential Trade Quote.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum StqReferencePointFlag {

    /**
     * When the reference execution of Sequential Trade Quote is set by this trade.
     */
    REFERENCE_EXECUTION_SET_BY_THIS_TRADE('1', "When the reference execution of Sequential Trade Quote is set by this trade."),

    /**
     * Other Than The Above
     */
    OTHER_THAN_THE_ABOVE(' ', "Other Than The Above");

    private final char wire;

    private final String description;

    StqReferencePointFlag(char wire, String description) {
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
    public static Optional<StqReferencePointFlag> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(REFERENCE_EXECUTION_SET_BY_THIS_TRADE);
            case ' ' -> Optional.of(OTHER_THAN_THE_ABOVE);
            default -> Optional.empty();
        };
    }
}
