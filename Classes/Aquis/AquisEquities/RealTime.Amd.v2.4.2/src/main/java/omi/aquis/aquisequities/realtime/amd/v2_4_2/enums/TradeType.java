package omi.aquis.aquisequities.realtime.amd.v2_4_2.enums;

import java.util.Optional;

/**
 * Code identifying type of trade (see below)
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradeType {

    /**
     * A trade against visible order quantity in the continuous trading order book
     */
    VISIBLE((short) 1, "A trade against visible order quantity in the continuous trading order book"),

    /**
     * A trade against hidden or reserve quantity in the continuous trading order book
     */
    HIDDEN_OR_RESERVE((short) 2, "A trade against hidden or reserve quantity in the continuous trading order book"),

    /**
     * Market at Close (MaC) trade
     */
    MARKET_AT_CLOSE_TRADE((short) 3, "Market at Close (MaC) trade"),

    /**
     * LIS Cross trade
     */
    LIS_CROSS_TRADE((short) 4, "LIS Cross trade"),

    /**
     * Benchmark Cross trade
     */
    BENCHMARK_CROSS_TRADE((short) 5, "Benchmark Cross trade"),

    /**
     * Auction on Demand (AoD) trade
     */
    AUCTION_ON_DEMAND_TRADE((short) 6, "Auction on Demand (AoD) trade");

    private final short wire;

    private final String description;

    TradeType(short wire, String description) {
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
    public static Optional<TradeType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(VISIBLE);
            case 2 -> Optional.of(HIDDEN_OR_RESERVE);
            case 3 -> Optional.of(MARKET_AT_CLOSE_TRADE);
            case 4 -> Optional.of(LIS_CROSS_TRADE);
            case 5 -> Optional.of(BENCHMARK_CROSS_TRADE);
            case 6 -> Optional.of(AUCTION_ON_DEMAND_TRADE);
            default -> Optional.empty();
        };
    }
}
