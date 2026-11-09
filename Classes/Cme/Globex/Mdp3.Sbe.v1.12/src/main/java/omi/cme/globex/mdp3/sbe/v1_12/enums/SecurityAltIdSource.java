package omi.cme.globex.mdp3.sbe.v1_12.enums;

import java.util.Optional;

/**
 * Identifies class or source of the SecurityAltID (455) value
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityAltIdSource {

    /**
     * Identifies class or source of the SecurityAltID (455) value
     */
    NO_VALUE((short) 255, "Identifies class or source of the SecurityAltID (455) value"),

    /**
     * CUSIP (9 char)
     */
    CUSIP((short) 1, "CUSIP (9 char)"),

    /**
     * ISIN (12 char)
     */
    ISIN((short) 4, "ISIN (12 char)");

    private final short wire;

    private final String description;

    SecurityAltIdSource(short wire, String description) {
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
    public static Optional<SecurityAltIdSource> fromWire(short wire) {
        return switch (wire) {
            case 255 -> Optional.of(NO_VALUE);
            case 1 -> Optional.of(CUSIP);
            case 4 -> Optional.of(ISIN);
            default -> Optional.empty();
        };
    }
}
