package omi.nasdaq.nfxfutures.marketdata.geniumamd.v2_30_7.enums;

import java.util.Optional;

/**
 * Values: 1 = Block Trade 2 = Exchange for Physical 11 = Exchange for Risk 14 = Exchange for Options
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TradeType {

    /**
     * Block Trade
     */
    BLOCK_TRADE(1, "Block Trade"),

    /**
     * Exchange For Physical
     */
    EXCHANGE_FOR_PHYSICAL(2, "Exchange For Physical"),

    /**
     * Exchange For Risk
     */
    EXCHANGE_FOR_RISK(11, "Exchange For Risk"),

    /**
     * Exchange For Options
     */
    EXCHANGE_FOR_OPTIONS(14, "Exchange For Options");

    private final int wire;

    private final String description;

    TradeType(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<TradeType> fromWire(int wire) {
        return switch (wire) {
            case 1 -> Optional.of(BLOCK_TRADE);
            case 2 -> Optional.of(EXCHANGE_FOR_PHYSICAL);
            case 11 -> Optional.of(EXCHANGE_FOR_RISK);
            case 14 -> Optional.of(EXCHANGE_FOR_OPTIONS);
            default -> Optional.empty();
        };
    }
}
