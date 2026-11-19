package omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Settlement System
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SettlementSystem {

    /**
     * Iberclear Cade
     */
    IBERCLEAR_CADE('A', "Iberclear Cade"),

    /**
     * Dlt Bme
     */
    DLT_BME('D', "Dlt Bme"),

    /**
     * Other
     */
    OTHER('O', "Other");

    private final char wire;

    private final String description;

    SettlementSystem(char wire, String description) {
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
    public static Optional<SettlementSystem> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(IBERCLEAR_CADE);
            case 'D' -> Optional.of(DLT_BME);
            case 'O' -> Optional.of(OTHER);
            default -> Optional.empty();
        };
    }
}
