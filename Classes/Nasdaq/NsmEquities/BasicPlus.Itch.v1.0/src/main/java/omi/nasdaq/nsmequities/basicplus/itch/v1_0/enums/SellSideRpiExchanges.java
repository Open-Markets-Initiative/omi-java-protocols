package omi.nasdaq.nsmequities.basicplus.itch.v1_0.enums;

import java.util.Optional;

/**
 * The Exchange(s) of sell-side RPI the information is relative to (Appendix E).
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SellSideRpiExchanges {

    /**
     * Nasdaq Exchange
     */
    NASDAQ((short) 1, "Nasdaq Exchange"),

    /**
     * Nasdaq Texas Exchange
     */
    NASDAQ_TEXAS((short) 2, "Nasdaq Texas Exchange"),

    /**
     * Nasdaq &amp; Nasdaq Texas Exchanges
     */
    NASDAQ_AND_NASDAQ_TEXAS((short) 3, "Nasdaq & Nasdaq Texas Exchanges"),

    /**
     * Nasdaq PSX Exchange
     */
    NASDAQ_PSX((short) 4, "Nasdaq PSX Exchange"),

    /**
     * Nasdaq &amp; Nasdaq PSX Exchanges
     */
    NASDAQ_AND_NASDAQ_PSX((short) 5, "Nasdaq & Nasdaq PSX Exchanges"),

    /**
     * Nasdaq Texas &amp; Nasdaq PSX Exchanges
     */
    NASDAQ_TEXAS_AND_NASDAQ_PSX((short) 6, "Nasdaq Texas & Nasdaq PSX Exchanges"),

    /**
     * Nasdaq, Nasdaq Texas, &amp; Nasdaq PSX Exchanges
     */
    NASDAQ_NASDAQ_TEXAS_AND_NASDAQ_PSX((short) 7, "Nasdaq, Nasdaq Texas, & Nasdaq PSX Exchanges");

    private final short wire;

    private final String description;

    SellSideRpiExchanges(short wire, String description) {
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
    public static Optional<SellSideRpiExchanges> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NASDAQ);
            case 2 -> Optional.of(NASDAQ_TEXAS);
            case 3 -> Optional.of(NASDAQ_AND_NASDAQ_TEXAS);
            case 4 -> Optional.of(NASDAQ_PSX);
            case 5 -> Optional.of(NASDAQ_AND_NASDAQ_PSX);
            case 6 -> Optional.of(NASDAQ_TEXAS_AND_NASDAQ_PSX);
            case 7 -> Optional.of(NASDAQ_NASDAQ_TEXAS_AND_NASDAQ_PSX);
            default -> Optional.empty();
        };
    }
}
