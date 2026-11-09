package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * Identifies the type of Prior Day message
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriorDayMessageType {

    /**
     * Prior Day Trade Correction
     */
    PRIOR_DAY_TRADE_CORRECTION('C', "Prior Day Trade Correction"),

    /**
     * Fractional Prior Day Trade Correction
     */
    FRACTIONAL_PRIOR_DAY_TRADE_CORRECTION('O', "Fractional Prior Day Trade Correction"),

    /**
     * Prior Day Trade
     */
    PRIOR_DAY_TRADE('T', "Prior Day Trade"),

    /**
     * Fractional Prior Day Trade
     */
    FRACTIONAL_PRIOR_DAY_TRADE('R', "Fractional Prior Day Trade"),

    /**
     * Prior Day Trade Cancel Error
     */
    PRIOR_DAY_TRADE_CANCEL_ERROR('X', "Prior Day Trade Cancel Error"),

    /**
     * Fractional Prior Day Trade Cancel Error
     */
    FRACTIONAL_PRIOR_DAY_TRADE_CANCEL_ERROR('E', "Fractional Prior Day Trade Cancel Error");

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
            case 'C' -> Optional.of(PRIOR_DAY_TRADE_CORRECTION);
            case 'O' -> Optional.of(FRACTIONAL_PRIOR_DAY_TRADE_CORRECTION);
            case 'T' -> Optional.of(PRIOR_DAY_TRADE);
            case 'R' -> Optional.of(FRACTIONAL_PRIOR_DAY_TRADE);
            case 'X' -> Optional.of(PRIOR_DAY_TRADE_CANCEL_ERROR);
            case 'E' -> Optional.of(FRACTIONAL_PRIOR_DAY_TRADE_CANCEL_ERROR);
            default -> Optional.empty();
        };
    }
}
