package omi.iex.iexoptions.session.sbe.v1_01.enums;

import java.util.Optional;

/**
 * Identifier of the schema publishing the message (10000 market data, 20000 session, 20001 order entry business)
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum SchemaId {

    /**
     * Sbe Schema Id for iex.options.boe.session
     */
    SESSION(20000, "Sbe Schema Id for iex.options.boe.session");

    private final int wire;

    private final String description;

    SchemaId(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<SchemaId> fromWire(int wire) {
        return wire == 20000 ? Optional.of(SESSION) : Optional.empty();
    }
}
