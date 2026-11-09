package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * trdSubType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TrdSubType {

    /**
     * Multi Asset Trade (Termo Vista).
     */
    MULTI_ASSET_TRADE((short) 101, "Multi Asset Trade (Termo Vista)."),

    /**
     * Leg Trade (UDS/EDS).
     */
    LEG_TRADE((short) 102, "Leg Trade (UDS/EDS)."),

    /**
     * Midpoint Trade (MP).
     */
    MIDPOINT_TRADE((short) 103, "Midpoint Trade (MP)."),

    /**
     * Block Book Trade (PT).
     */
    BLOCK_BOOK_TRADE((short) 104, "Block Book Trade (PT)."),

    /**
     * Equities: RFQ Trade, Futures: Fixed Income Trade (RF).
     */
    RF_TRADE((short) 105, "Equities: RFQ Trade, Futures: Fixed Income Trade (RF)."),

    /**
     * RLP Trade (RL).
     */
    RLP_TRADE((short) 106, "RLP Trade (RL)."),

    /**
     * Trade at Close Trade (TC).
     */
    TAC_TRADE((short) 107, "Trade at Close Trade (TC)."),

    /**
     * Trade at Average Trade (TA).
     */
    TAA_TRADE((short) 108, "Trade at Average Trade (TA)."),

    /**
     * Sweep Trade (SW).
     */
    SWEEP_TRADE((short) 109, "Sweep Trade (SW)."),

    /**
     * trdSubType
     */
    NO_VALUE((short) 0, "trdSubType");

    private final short wire;

    private final String description;

    TrdSubType(short wire, String description) {
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
    public static Optional<TrdSubType> fromWire(short wire) {
        return switch (wire) {
            case 101 -> Optional.of(MULTI_ASSET_TRADE);
            case 102 -> Optional.of(LEG_TRADE);
            case 103 -> Optional.of(MIDPOINT_TRADE);
            case 104 -> Optional.of(BLOCK_BOOK_TRADE);
            case 105 -> Optional.of(RF_TRADE);
            case 106 -> Optional.of(RLP_TRADE);
            case 107 -> Optional.of(TAC_TRADE);
            case 108 -> Optional.of(TAA_TRADE);
            case 109 -> Optional.of(SWEEP_TRADE);
            case 0 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
