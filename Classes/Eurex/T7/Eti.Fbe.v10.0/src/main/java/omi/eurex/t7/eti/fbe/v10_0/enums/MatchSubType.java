package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the MatchSubType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MatchSubType {

    /**
     * Opening auction
     */
    OPENING_AUCTION((short) 1, "Opening auction"),

    /**
     * Closing auction
     */
    CLOSING_AUCTION((short) 2, "Closing auction"),

    /**
     * Intraday auction
     */
    INTRADAY_AUCTION((short) 3, "Intraday auction"),

    /**
     * Circuit Breaker auction
     */
    CIRCUIT_BREAKER_AUCTION((short) 4, "Circuit Breaker auction"),

    /**
     * CLIP matching outside BBO
     */
    OUTSIDE_BBO((short) 6, "CLIP matching outside BBO"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    MatchSubType(short wire, String description) {
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
    public static Optional<MatchSubType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(OPENING_AUCTION);
            case 2 -> Optional.of(CLOSING_AUCTION);
            case 3 -> Optional.of(INTRADAY_AUCTION);
            case 4 -> Optional.of(CIRCUIT_BREAKER_AUCTION);
            case 6 -> Optional.of(OUTSIDE_BBO);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
