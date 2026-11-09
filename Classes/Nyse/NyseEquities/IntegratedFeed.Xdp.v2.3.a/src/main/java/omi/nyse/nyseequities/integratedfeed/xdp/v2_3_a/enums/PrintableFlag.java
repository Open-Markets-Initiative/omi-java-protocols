package omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.enums;

import java.util.Optional;

/**
 * Printable flag values
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PrintableFlag {

    /**
     * Not Printed to the SIP
     */
    NOT_PRINTED((short) 0, "Not Printed to the SIP"),

    /**
     * Printed to the SIP
     */
    PRINTED((short) 1, "Printed to the SIP");

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
            case 0 -> Optional.of(NOT_PRINTED);
            case 1 -> Optional.of(PRINTED);
            default -> Optional.empty();
        };
    }
}
