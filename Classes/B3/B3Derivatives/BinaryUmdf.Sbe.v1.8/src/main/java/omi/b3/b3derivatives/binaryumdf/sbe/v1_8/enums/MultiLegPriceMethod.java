package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * multiLegPriceMethod
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MultiLegPriceMethod {

    /**
     * Net Price.
     */
    NET_PRICE((short) 0, "Net Price."),

    /**
     * Reversed Net Price.
     */
    REVERSED_NET_PRICE((short) 1, "Reversed Net Price."),

    /**
     * Yield Difference.
     */
    YIELD_DIFFERENCE((short) 2, "Yield Difference."),

    /**
     * Individual.
     */
    INDIVIDUAL((short) 3, "Individual."),

    /**
     * Contract Weighted Average Price.
     */
    CONTRACT_WEIGHTED_AVERAGE_PRICE((short) 4, "Contract Weighted Average Price."),

    /**
     * Multiplied Price.
     */
    MULTIPLIED_PRICE((short) 5, "Multiplied Price."),

    /**
     * multiLegPriceMethod
     */
    NO_VALUE((short) 255, "multiLegPriceMethod");

    private final short wire;

    private final String description;

    MultiLegPriceMethod(short wire, String description) {
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
    public static Optional<MultiLegPriceMethod> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NET_PRICE);
            case 1 -> Optional.of(REVERSED_NET_PRICE);
            case 2 -> Optional.of(YIELD_DIFFERENCE);
            case 3 -> Optional.of(INDIVIDUAL);
            case 4 -> Optional.of(CONTRACT_WEIGHTED_AVERAGE_PRICE);
            case 5 -> Optional.of(MULTIPLIED_PRICE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
