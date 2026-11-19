package omi.eurex.t7.eobi.fbe.v15_0.enums;

import java.util.Optional;

/**
 * Defines the TradingStyle values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingStyle {

    /**
     * Regular
     */
    REGULAR((short) 1, "Regular"),

    /**
     * Trftac
     */
    TRFTAC((short) 2, "Trftac"),

    /**
     * Trftam
     */
    TRFTAM((short) 3, "Trftam"),

    /**
     * Moc
     */
    MOC((short) 4, "Moc"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    TradingStyle(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<TradingStyle> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(REGULAR);
            case 2 -> Optional.of(TRFTAC);
            case 3 -> Optional.of(TRFTAM);
            case 4 -> Optional.of(MOC);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
