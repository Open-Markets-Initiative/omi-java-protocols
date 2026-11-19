package omi.euronext.optiq.dropcopygateway.sbe.v5_38.enums;

import java.util.Optional;

/**
 * wholesaleTradeType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum WholesaleTradeType {

    /**
     * Large_in_Scale_Trade_Formerly_Block_Trade
     */
    LARGEIN_SCALE_TRADE_FORMERLY_BLOCK_TRADE((short) 0, "Large_in_Scale_Trade_Formerly_Block_Trade"),

    /**
     * Against_Actual
     */
    AGAINST_ACTUAL((short) 1, "Against_Actual"),

    /**
     * Exchange_For_Swaps
     */
    EXCHANGE_FOR_SWAPS((short) 2, "Exchange_For_Swaps"),

    /**
     * wholesaleTradeType
     */
    NO_VALUE((short) 255, "wholesaleTradeType");

    private final short wire;

    private final String description;

    WholesaleTradeType(short wire, String description) {
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
    public static Optional<WholesaleTradeType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(LARGEIN_SCALE_TRADE_FORMERLY_BLOCK_TRADE);
            case 1 -> Optional.of(AGAINST_ACTUAL);
            case 2 -> Optional.of(EXCHANGE_FOR_SWAPS);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
