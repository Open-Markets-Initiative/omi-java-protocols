package omi.eurex.t7.eti.fbe.v6_1.enums;

import java.util.Optional;

/**
 * Defines the MatchType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MatchType {

    /**
     * Confirmed Trade Report (reporting from recognized markets)
     */
    CONFIRMED_TRADE_REPORT((short) 3, "Confirmed Trade Report (reporting from recognized markets)"),

    /**
     * Auto-match incoming order
     */
    AUTOMATCHINCOMING((short) 4, "Auto-match incoming order"),

    /**
     * Cross Auction
     */
    CROSS_AUCTION((short) 5, "Cross Auction"),

    /**
     * Call Auction
     */
    CALL_AUCTION((short) 7, "Call Auction"),

    /**
     * Auto match resting order
     */
    AUTOMATCHRESTING((short) 11, "Auto match resting order"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    MatchType(short wire, String description) {
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
    public static Optional<MatchType> fromWire(short wire) {
        return switch (wire) {
            case 3 -> Optional.of(CONFIRMED_TRADE_REPORT);
            case 4 -> Optional.of(AUTOMATCHINCOMING);
            case 5 -> Optional.of(CROSS_AUCTION);
            case 7 -> Optional.of(CALL_AUCTION);
            case 11 -> Optional.of(AUTOMATCHRESTING);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
