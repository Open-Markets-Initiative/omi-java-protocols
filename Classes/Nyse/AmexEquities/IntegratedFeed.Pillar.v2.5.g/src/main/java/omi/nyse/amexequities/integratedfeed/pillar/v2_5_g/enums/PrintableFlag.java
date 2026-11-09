package omi.nyse.amexequities.integratedfeed.pillar.v2_5_g.enums;

import java.util.Optional;

/**
 * 0 = Not Printed to the SIP. 1 = Printed to the SIP.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PrintableFlag {

    /**
     * Not Printed To The Sip
     */
    NOT_PRINTED_TO_THE_SIP((short) 0, "Not Printed To The Sip"),

    /**
     * Printed To The Sip
     */
    PRINTED_TO_THE_SIP((short) 1, "Printed To The Sip");

    private final short wire;

    private final String description;

    PrintableFlag(short wire, String description) {
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
    public static Optional<PrintableFlag> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_PRINTED_TO_THE_SIP);
            case 1 -> Optional.of(PRINTED_TO_THE_SIP);
            default -> Optional.empty();
        };
    }
}
