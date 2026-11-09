package omi.cme.globex.mdp3.sbe.v1_12.enums;

import java.util.Optional;

/**
 * Source of the Clean Price
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MdStreamId {

    /**
     * Source of the Clean Price
     */
    NO_VALUE((short) 255, "Source of the Clean Price"),

    /**
     * Globex Market Surveillance team
     */
    MARKET_PLACE_ASSISTANT((short) 0, "Globex Market Surveillance team"),

    /**
     * Globex Trading Activity
     */
    GLOBEX((short) 1, "Globex Trading Activity"),

    /**
     * Refinitiv
     */
    REFINITIV((short) 2, "Refinitiv"),

    /**
     * Icap Market Data Feed
     */
    ICAP((short) 3, "Icap Market Data Feed");

    private final short wire;

    private final String description;

    MdStreamId(short wire, String description) {
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
    public static Optional<MdStreamId> fromWire(short wire) {
        return switch (wire) {
            case 255 -> Optional.of(NO_VALUE);
            case 0 -> Optional.of(MARKET_PLACE_ASSISTANT);
            case 1 -> Optional.of(GLOBEX);
            case 2 -> Optional.of(REFINITIV);
            case 3 -> Optional.of(ICAP);
            default -> Optional.empty();
        };
    }
}
