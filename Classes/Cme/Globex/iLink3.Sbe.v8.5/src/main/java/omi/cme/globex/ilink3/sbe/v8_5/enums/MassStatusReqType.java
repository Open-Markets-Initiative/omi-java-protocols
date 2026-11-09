package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Specifies the scope of the OrderMassStatusRequest within the context of working orders only. Status will be returned for all orders matching the criteria specified here for Session and Firm
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MassStatusReqType {

    /**
     * Instrument
     */
    INSTRUMENT((short) 1, "Instrument"),

    /**
     * Instrument Group
     */
    INSTRUMENT_GROUP((short) 3, "Instrument Group"),

    /**
     * Market Segment
     */
    MARKET_SEGMENT((short) 100, "Market Segment");

    private final short wire;

    private final String description;

    MassStatusReqType(short wire, String description) {
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
    public static Optional<MassStatusReqType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(INSTRUMENT);
            case 3 -> Optional.of(INSTRUMENT_GROUP);
            case 100 -> Optional.of(MARKET_SEGMENT);
            default -> Optional.empty();
        };
    }
}
