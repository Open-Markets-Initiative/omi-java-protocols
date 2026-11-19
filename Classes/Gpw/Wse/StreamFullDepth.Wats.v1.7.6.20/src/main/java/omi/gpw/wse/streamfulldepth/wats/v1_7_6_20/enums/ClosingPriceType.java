package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Closing Price Type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ClosingPriceType {

    /**
     * Initial price of the instrument
     */
    INITIAL_PRICE((short) 1, "Initial price of the instrument"),

    /**
     * Last traded price
     */
    LTP((short) 2, "Last traded price"),

    /**
     * Last adjusted closing price
     */
    LAST_ACP((short) 3, "Last adjusted closing price"),

    /**
     * Fair value
     */
    FAIR_VALUE((short) 4, "Fair value"),

    /**
     * Daily Settlement Price
     */
    DAILY_SETTLEMENT_PRICE((short) 5, "Daily Settlement Price"),

    /**
     * Final Settlement Price
     */
    FINAL_SETTLEMENT_PRICE((short) 6, "Final Settlement Price");

    private final short wire;

    private final String description;

    ClosingPriceType(short wire, String description) {
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
    public static Optional<ClosingPriceType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(INITIAL_PRICE);
            case 2 -> Optional.of(LTP);
            case 3 -> Optional.of(LAST_ACP);
            case 4 -> Optional.of(FAIR_VALUE);
            case 5 -> Optional.of(DAILY_SETTLEMENT_PRICE);
            case 6 -> Optional.of(FINAL_SETTLEMENT_PRICE);
            default -> Optional.empty();
        };
    }
}
