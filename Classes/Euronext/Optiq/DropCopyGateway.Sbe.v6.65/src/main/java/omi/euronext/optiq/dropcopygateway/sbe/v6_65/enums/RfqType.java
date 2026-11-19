package omi.euronext.optiq.dropcopygateway.sbe.v6_65.enums;

import java.util.Optional;

/**
 * rFQType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RfqType {

    /**
     * Manual_RFQ
     */
    MANUAL_RFQ((short) 1, "Manual_RFQ"),

    /**
     * Auto_RFQ
     */
    AUTO_RFQ((short) 2, "Auto_RFQ"),

    /**
     * rFQType
     */
    NO_VALUE((short) 255, "rFQType");

    private final short wire;

    private final String description;

    RfqType(short wire, String description) {
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
    public static Optional<RfqType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(MANUAL_RFQ);
            case 2 -> Optional.of(AUTO_RFQ);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
