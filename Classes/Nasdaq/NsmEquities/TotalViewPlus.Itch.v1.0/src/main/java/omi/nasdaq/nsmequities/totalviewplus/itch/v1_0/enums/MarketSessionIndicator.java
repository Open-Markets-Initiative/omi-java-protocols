package omi.nasdaq.nsmequities.totalviewplus.itch.v1_0.enums;

import java.util.Optional;

/**
 * Indicates the session/market the data originates from
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MarketSessionIndicator {

    /**
     * Nasdaq Extended Session (9:00 PM to 4:00 AM ET)
     */
    NASDAQ_EXTENDED_SESSION((short) 1, "Nasdaq Extended Session (9:00 PM to 4:00 AM ET)"),

    /**
     * Nasdaq Core Session (4:00 AM to 8:00 PM ET)
     */
    NASDAQ_CORE_SESSION((short) 2, "Nasdaq Core Session (4:00 AM to 8:00 PM ET)"),

    /**
     * Nasdaq Texas (7:00 AM to 7:00 PM ET)
     */
    NASDAQ_TEXAS((short) 3, "Nasdaq Texas (7:00 AM to 7:00 PM ET)"),

    /**
     * Nasdaq PSX (8:00 AM to 5:00 PM ET)
     */
    PSX((short) 4, "Nasdaq PSX (8:00 AM to 5:00 PM ET)"),

    /**
     * Reserved for future use
     */
    RESERVED((short) 5, "Reserved for future use");

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
            case 1 -> Optional.of(NASDAQ_EXTENDED_SESSION);
            case 2 -> Optional.of(NASDAQ_CORE_SESSION);
            case 3 -> Optional.of(NASDAQ_TEXAS);
            case 4 -> Optional.of(PSX);
            case 5 -> Optional.of(RESERVED);
            default -> Optional.empty();
        };
    }
}
