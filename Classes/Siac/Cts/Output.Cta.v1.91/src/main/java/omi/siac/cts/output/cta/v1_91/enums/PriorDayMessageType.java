package omi.siac.cts.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * Prior Day message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriorDayMessageType {

    /**
     * Prior Day Trade Correction Message
     */
    PRIOR_DAY_TRADE_CORRECTION_MESSAGE('C', "Prior Day Trade Correction Message"),

    /**
     * Prior Day Trade Message
     */
    PRIOR_DAY_TRADE_MESSAGE('T', "Prior Day Trade Message"),

    /**
     * Prior Day Trade Cancel Error Message
     */
    PRIOR_DAY_TRADE_CANCEL_ERROR_MESSAGE('X', "Prior Day Trade Cancel Error Message");

    private final char wire;

    private final String description;

    PriorDayMessageType(char wire, String description) {
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
    public static Optional<PriorDayMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(PRIOR_DAY_TRADE_CORRECTION_MESSAGE);
            case 'T' -> Optional.of(PRIOR_DAY_TRADE_MESSAGE);
            case 'X' -> Optional.of(PRIOR_DAY_TRADE_CANCEL_ERROR_MESSAGE);
            default -> Optional.empty();
        };
    }
}
