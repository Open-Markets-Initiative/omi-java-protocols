package omi.cme.globex.mdp3.sbe.v1_8.enums;

import java.util.Optional;

/**
 * Defines the SchemaId values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum SchemaId {

    /**
     * Sbe Schema Id for mktdata
     */
    MKTDATA(1, "Sbe Schema Id for mktdata"),

    /**
     * Sbe Schema Id for mdpsessionmgmt
     */
    MDPSESSIONMGMT(2, "Sbe Schema Id for mdpsessionmgmt");

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
            case 1 -> Optional.of(MKTDATA);
            case 2 -> Optional.of(MDPSESSIONMGMT);
            default -> Optional.empty();
        };
    }
}
