package omi.euronext.optiq.orderentrygateway.sbe.v1_3.enums;

import java.util.Optional;

/**
 * rFQUpdateType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RfqUpdateType {

    /**
     * New
     */
    NEW((short) 1, "New"),

    /**
     * Cancelled_by_the_RFQ_issuer
     */
    CANCELLEDBYTHE_RF_QISSUER((short) 2, "Cancelled_by_the_RFQ_issuer"),

    /**
     * Expired
     */
    EXPIRED((short) 3, "Expired"),

    /**
     * Partially_or_Fully_Matched
     */
    PARTIALLYOR_FULLY_MATCHED((short) 4, "Partially_or_Fully_Matched");

    private final short wire;

    private final String description;

    RfqUpdateType(short wire, String description) {
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
    public static Optional<RfqUpdateType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NEW);
            case 2 -> Optional.of(CANCELLEDBYTHE_RF_QISSUER);
            case 3 -> Optional.of(EXPIRED);
            case 4 -> Optional.of(PARTIALLYOR_FULLY_MATCHED);
            default -> Optional.empty();
        };
    }
}
