package omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_4.enums;

import java.util.Optional;

/**
 * Identifier of the schema publishing the message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum SchemaId {

    /**
     * Sbe Schema Id for fairx.gateway.sbe.codec.session
     */
    SESSION(1100, "Sbe Schema Id for fairx.gateway.sbe.codec.session"),

    /**
     * Sbe Schema Id for fairx.gateway.sbe.codec.order
     */
    ORDER(1101, "Sbe Schema Id for fairx.gateway.sbe.codec.order");

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
        return switch (wire) {
            case 1100 -> Optional.of(SESSION);
            case 1101 -> Optional.of(ORDER);
            default -> Optional.empty();
        };
    }
}
