package omi.finra.finraorf.tdds.dfi.v2_1.enums;

import java.util.Optional;

/**
 * This field will be populated if the transaction being reported is an As/Of trade, Reversal, Cancel or Correction from a prior business day
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AsOfIndicator {

    /**
     * As-Of
     */
    AS_OF('A', "As-Of"),

    /**
     * Reversal
     */
    REVERSAL('R', "Reversal"),

    /**
     * Current Day transaction
     */
    CURRENT_DAY_TRANSACTION(' ', "Current Day transaction");

    private final char wire;

    private final String description;

    AsOfIndicator(char wire, String description) {
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
    public static Optional<AsOfIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AS_OF);
            case 'R' -> Optional.of(REVERSAL);
            case ' ' -> Optional.of(CURRENT_DAY_TRANSACTION);
            default -> Optional.empty();
        };
    }
}
