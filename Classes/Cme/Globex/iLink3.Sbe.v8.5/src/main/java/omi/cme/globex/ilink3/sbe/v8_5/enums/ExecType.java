package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Describes the specific ExecutionRpt as trade cancellation or correction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecType {

    /**
     * Trade Correction
     */
    TRADE_CORRECTION('G', "Trade Correction"),

    /**
     * Trade Cancel
     */
    TRADE_CANCEL('H', "Trade Cancel");

    private final char wire;

    private final String description;

    ExecType(char wire, String description) {
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
    public static Optional<ExecType> fromWire(char wire) {
        return switch (wire) {
            case 'G' -> Optional.of(TRADE_CORRECTION);
            case 'H' -> Optional.of(TRADE_CANCEL);
            default -> Optional.empty();
        };
    }
}
