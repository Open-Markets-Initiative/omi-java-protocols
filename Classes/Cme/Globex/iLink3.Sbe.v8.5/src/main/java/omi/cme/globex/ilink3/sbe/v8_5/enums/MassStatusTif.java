package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Specifies the scope of the OrderMassStatusRequest within the context of MassStatusRequestType (585) if present. Absence of this field is interpreted as Day &amp; GTC &amp; GTD. FAK is excluded since scope is limited to working orders only
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MassStatusTif {

    /**
     * Specifies the scope of the OrderMassStatusRequest within the context of MassStatusRequestType (585) if present. Absence of this field is interpreted as Day &amp; GTC &amp; GTD. FAK is excluded since scope is limited to working orders only
     */
    NO_VALUE((short) 255, "Specifies the scope of the OrderMassStatusRequest within the context of MassStatusRequestType (585) if present. Absence of this field is interpreted as Day & GTC & GTD. FAK is excluded since scope is limited to working orders only"),

    /**
     * Day
     */
    DAY((short) 0, "Day"),

    /**
     * GTC
     */
    GTC((short) 1, "GTC"),

    /**
     * GTD
     */
    GTD((short) 6, "GTD");

    private final short wire;

    private final String description;

    MassStatusTif(short wire, String description) {
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
    public static Optional<MassStatusTif> fromWire(short wire) {
        return switch (wire) {
            case 255 -> Optional.of(NO_VALUE);
            case 0 -> Optional.of(DAY);
            case 1 -> Optional.of(GTC);
            case 6 -> Optional.of(GTD);
            default -> Optional.empty();
        };
    }
}
