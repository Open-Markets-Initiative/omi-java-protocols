package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.enums;

import java.util.Optional;

/**
 * SideOfUnpairedQty enum
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SideOfUnpairedQty {

    /**
     * Paired
     */
    PAIRED((short) 0, "Paired"),

    /**
     * Buy side not paired
     */
    BUY_NOT_PAIRED((short) 1, "Buy side not paired"),

    /**
     * Sell side not paired
     */
    SELL_NOT_PAIRED((short) 2, "Sell side not paired");

    private final short wire;

    private final String description;

    SideOfUnpairedQty(short wire, String description) {
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
    public static Optional<SideOfUnpairedQty> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(PAIRED);
            case 1 -> Optional.of(BUY_NOT_PAIRED);
            case 2 -> Optional.of(SELL_NOT_PAIRED);
            default -> Optional.empty();
        };
    }
}
