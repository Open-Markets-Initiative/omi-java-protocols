package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Specifies the scope of the action
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MassActionScope {

    /**
     * Instrument
     */
    INSTRUMENT((short) 1, "Instrument"),

    /**
     * All
     */
    ALL((short) 7, "All"),

    /**
     * Market Segment ID
     */
    MARKET_SEGMENT_ID((short) 9, "Market Segment ID"),

    /**
     * Instrument Group
     */
    INSTRUMENT_GROUP((short) 10, "Instrument Group"),

    /**
     * Quote Set ID
     */
    QUOTE_SET_ID((short) 100, "Quote Set ID");

    private final short wire;

    private final String description;

    MassActionScope(short wire, String description) {
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
    public static Optional<MassActionScope> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(INSTRUMENT);
            case 7 -> Optional.of(ALL);
            case 9 -> Optional.of(MARKET_SEGMENT_ID);
            case 10 -> Optional.of(INSTRUMENT_GROUP);
            case 100 -> Optional.of(QUOTE_SET_ID);
            default -> Optional.empty();
        };
    }
}
