package omi.nairobi.nairobiequities.snapshot.mitch.v1_22.enums;

import java.util.Optional;

/**
 * Type of settlement. Only valid when Order Book is Block Trade (4).
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SettlementType {

    /**
     * Cash T Plus 0
     */
    CASH_T_PLUS_0('1', "Cash T Plus 0"),

    /**
     * Early Settle T Plus 1
     */
    EARLY_SETTLE_T_PLUS_1('2', "Early Settle T Plus 1"),

    /**
     * T Plus 2
     */
    T_PLUS_2('3', "T Plus 2"),

    /**
     * Regular T Plus 3
     */
    REGULAR_T_PLUS_3('4', "Regular T Plus 3");

    private final char wire;

    private final String description;

    SettlementType(char wire, String description) {
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
    public static Optional<SettlementType> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(CASH_T_PLUS_0);
            case '2' -> Optional.of(EARLY_SETTLE_T_PLUS_1);
            case '3' -> Optional.of(T_PLUS_2);
            case '4' -> Optional.of(REGULAR_T_PLUS_3);
            default -> Optional.empty();
        };
    }
}
