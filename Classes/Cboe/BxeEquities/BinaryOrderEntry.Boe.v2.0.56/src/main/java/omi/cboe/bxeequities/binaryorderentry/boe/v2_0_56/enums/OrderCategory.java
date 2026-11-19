package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_56.enums;

import java.util.Optional;

/**
 * Defines the OrderCategory values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderCategory {

    /**
     * Not a Negotiated Trade
     */
    NOT_A_NEGOTIATED_TRADE((short) 0, "Not a Negotiated Trade"),

    /**
     * Privately Negotiated Trade On return fields, this field indicates whether Cboe deems the trade as utilising the Negotiated Transaction waiver under Mi- FID.
     */
    PRIVATELY_NEGOTIATED_TRADE((short) 3, "Privately Negotiated Trade On return fields, this field indicates whether Cboe deems the trade as utilising the Negotiated Transaction waiver under Mi- FID.");

    private final short wire;

    private final String description;

    OrderCategory(short wire, String description) {
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
    public static Optional<OrderCategory> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_A_NEGOTIATED_TRADE);
            case 3 -> Optional.of(PRIVATELY_NEGOTIATED_TRADE);
            default -> Optional.empty();
        };
    }
}
