package omi.ice.icefutures.mdf.impact.v1_1_51.enums;

import java.util.Optional;

/**
 * Endex Only Values
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EndexStatus {

    /**
     * Current
     */
    CURRENT('C', "Current"),

    /**
     * Default
     */
    DEFAULT('D', "Default"),

    /**
     * Final
     */
    FINAL('F', "Final"),

    /**
     * Non Endex Spot Market
     */
    NON_ENDEX_SPOT_MARKET(' ', "Non Endex Spot Market");

    private final char wire;

    private final String description;

    EndexStatus(char wire, String description) {
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
    public static Optional<EndexStatus> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CURRENT);
            case 'D' -> Optional.of(DEFAULT);
            case 'F' -> Optional.of(FINAL);
            case ' ' -> Optional.of(NON_ENDEX_SPOT_MARKET);
            default -> Optional.empty();
        };
    }
}
