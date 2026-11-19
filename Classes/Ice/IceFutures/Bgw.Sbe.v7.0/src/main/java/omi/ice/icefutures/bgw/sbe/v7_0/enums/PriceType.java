package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * priceType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PriceType {

    /**
     * PerContract
     */
    PER_CONTRACT((short) 2, "PerContract"),

    /**
     * FixedCabinetTradePrice
     */
    FIXED_CABINET_TRADE_PRICE((short) 10, "FixedCabinetTradePrice"),

    /**
     * FixedRate
     */
    FIXED_RATE((short) 100, "FixedRate"),

    /**
     * NPV
     */
    NPV((short) 101, "NPV"),

    /**
     * RateDifferential
     */
    RATE_DIFFERENTIAL((short) 102, "RateDifferential"),

    /**
     * NPVDifferential
     */
    NPV_DIFFERENTIAL((short) 103, "NPVDifferential");

    private final short wire;

    private final String description;

    PriceType(short wire, String description) {
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
    public static Optional<PriceType> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(PER_CONTRACT);
            case 10 -> Optional.of(FIXED_CABINET_TRADE_PRICE);
            case 100 -> Optional.of(FIXED_RATE);
            case 101 -> Optional.of(NPV);
            case 102 -> Optional.of(RATE_DIFFERENTIAL);
            case 103 -> Optional.of(NPV_DIFFERENTIAL);
            default -> Optional.empty();
        };
    }
}
