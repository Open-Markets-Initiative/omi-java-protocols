package omi.hkex.hkexsecurities.fulltickretrans.omd.v1_46.enums;

import java.util.Optional;

/**
 * Indicates whether or not the security is a CCASS security.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CcassFlag {

    /**
     * Ccass Security
     */
    CCASS_SECURITY('Y', "Ccass Security"),

    /**
     * Non Ccass Security
     */
    NON_CCASS_SECURITY('N', "Non Ccass Security");

    private final char wire;

    private final String description;

    CcassFlag(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<CcassFlag> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(CCASS_SECURITY);
            case 'N' -> Optional.of(NON_CCASS_SECURITY);
            default -> Optional.empty();
        };
    }
}
