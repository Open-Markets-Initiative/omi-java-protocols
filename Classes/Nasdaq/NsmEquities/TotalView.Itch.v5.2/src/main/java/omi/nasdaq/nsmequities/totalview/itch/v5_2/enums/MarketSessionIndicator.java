package omi.nasdaq.nsmequities.totalview.itch.v5_2.enums;

import java.util.Optional;

/**
 * Indicates the session/market the data originates from
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MarketSessionIndicator {

    /**
     * Nasdaq Global Trading Hours (9:00 PM to 4:00 AM)
     */
    GLOBAL_TRADING_HOURS((short) 1, "Nasdaq Global Trading Hours (9:00 PM to 4:00 AM)"),

    /**
     * Nasdaq Primary Session (4:00 AM to 8:00 PM)
     */
    PRIMARY_SESSION((short) 2, "Nasdaq Primary Session (4:00 AM to 8:00 PM)");

    private final short wire;

    private final String description;

    MarketSessionIndicator(short wire, String description) {
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
    public static Optional<MarketSessionIndicator> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(GLOBAL_TRADING_HOURS);
            case 2 -> Optional.of(PRIMARY_SESSION);
            default -> Optional.empty();
        };
    }
}
