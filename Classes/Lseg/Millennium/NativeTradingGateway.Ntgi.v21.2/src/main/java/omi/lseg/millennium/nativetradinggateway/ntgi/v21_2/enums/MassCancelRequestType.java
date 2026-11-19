package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Type of Mass Cancellation.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MassCancelRequestType {

    /**
     * All Firm Orders Of An Instrument
     */
    ALL_FIRM_ORDERS_OF_AN_INSTRUMENT((short) 3, "All Firm Orders Of An Instrument");

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
        return wire == 3 ? Optional.of(ALL_FIRM_ORDERS_OF_AN_INSTRUMENT) : Optional.empty();
    }
}
