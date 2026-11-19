package omi.cboe.neoequities.multicastmarketbyprice.pitch.v1_0_13.enums;

import java.util.Optional;

/**
 * Current trading sub-status code.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingSubStatus {

    /**
     * None
     */
    NONE(' ', "None"),

    /**
     * Closing Offset
     */
    CLOSING_OFFSET('C', "Closing Offset"),

    /**
     * Delayed
     */
    DELAYED('D', "Delayed"),

    /**
     * Imbalance
     */
    IMBALANCE('I', "Imbalance"),

    /**
     * Halt Lift Schedule For Opening
     */
    HALT_LIFT_SCHEDULE_FOR_OPENING('O', "Halt Lift Schedule For Opening"),

    /**
     * Halt Lift Schedule For Re Opening
     */
    HALT_LIFT_SCHEDULE_FOR_RE_OPENING('R', "Halt Lift Schedule For Re Opening");

    private final char wire;

    private final String description;

    TradingSubStatus(char wire, String description) {
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
    public static Optional<TradingSubStatus> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NONE);
            case 'C' -> Optional.of(CLOSING_OFFSET);
            case 'D' -> Optional.of(DELAYED);
            case 'I' -> Optional.of(IMBALANCE);
            case 'O' -> Optional.of(HALT_LIFT_SCHEDULE_FOR_OPENING);
            case 'R' -> Optional.of(HALT_LIFT_SCHEDULE_FOR_RE_OPENING);
            default -> Optional.empty();
        };
    }
}
