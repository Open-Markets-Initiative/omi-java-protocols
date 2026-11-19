package omi.jse.itac.enhancednativetrading.ntgi.v4_04.enums;

import java.util.Optional;

/**
 * Scope of the mass cancel request
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MassCancelRequestType {

    /**
     * All Firm Orders For Instrument
     */
    ALL_FIRM_ORDERS_FOR_INSTRUMENT((short) 3, "All Firm Orders For Instrument"),

    /**
     * All Firm Orders For Segment
     */
    ALL_FIRM_ORDERS_FOR_SEGMENT((short) 4, "All Firm Orders For Segment"),

    /**
     * All Orders For Client Interface User Id
     */
    ALL_ORDERS_FOR_CLIENT_INTERFACE_USER_ID((short) 7, "All Orders For Client Interface User Id"),

    /**
     * All Orders For Firm
     */
    ALL_ORDERS_FOR_FIRM((short) 8, "All Orders For Firm"),

    /**
     * Client Interface User Id Orders For Instrument
     */
    CLIENT_INTERFACE_USER_ID_ORDERS_FOR_INSTRUMENT((short) 9, "Client Interface User Id Orders For Instrument"),

    /**
     * Client Interest For Underlying
     */
    CLIENT_INTEREST_FOR_UNDERLYING((short) 14, "Client Interest For Underlying"),

    /**
     * Client Interface User Id Orders For Segment
     */
    CLIENT_INTERFACE_USER_ID_ORDERS_FOR_SEGMENT((short) 15, "Client Interface User Id Orders For Segment"),

    /**
     * Firm Interest For Underlying
     */
    FIRM_INTEREST_FOR_UNDERLYING((short) 22, "Firm Interest For Underlying");

    private final short wire;

    private final String description;

    MassCancelRequestType(short wire, String description) {
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
    public static Optional<MassCancelRequestType> fromWire(short wire) {
        return switch (wire) {
            case 3 -> Optional.of(ALL_FIRM_ORDERS_FOR_INSTRUMENT);
            case 4 -> Optional.of(ALL_FIRM_ORDERS_FOR_SEGMENT);
            case 7 -> Optional.of(ALL_ORDERS_FOR_CLIENT_INTERFACE_USER_ID);
            case 8 -> Optional.of(ALL_ORDERS_FOR_FIRM);
            case 9 -> Optional.of(CLIENT_INTERFACE_USER_ID_ORDERS_FOR_INSTRUMENT);
            case 14 -> Optional.of(CLIENT_INTEREST_FOR_UNDERLYING);
            case 15 -> Optional.of(CLIENT_INTERFACE_USER_ID_ORDERS_FOR_SEGMENT);
            case 22 -> Optional.of(FIRM_INTEREST_FOR_UNDERLYING);
            default -> Optional.empty();
        };
    }
}
