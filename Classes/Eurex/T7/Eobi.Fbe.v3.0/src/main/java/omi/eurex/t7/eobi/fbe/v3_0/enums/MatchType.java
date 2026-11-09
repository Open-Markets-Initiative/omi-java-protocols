package omi.eurex.t7.eobi.fbe.v3_0.enums;

import java.util.Optional;

/**
 * Defines the MatchType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MatchType {

    /**
     * Manual Trade Entry
     */
    CONFIRMED_TRADE_REPORT((short) 3, "Manual Trade Entry"),

    /**
     * Trade from Uncrossing
     */
    CROSS_AUCTION((short) 5, "Trade from Uncrossing"),

    /**
     * Trade from Auction
     */
    CALL_AUCTION((short) 7, "Trade from Auction"),

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
            case 5 -> Optional.of(CROSS_AUCTION);
            case 7 -> Optional.of(CALL_AUCTION);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
