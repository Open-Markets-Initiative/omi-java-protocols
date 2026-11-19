package omi.hkex.hkexsecurities.fulltick.omd.v1_44.enums;

import java.util.Optional;

/**
 * Indicates whether Volatility Control Mechanism (VCM) is applicable to the security.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum VcmFlag {

    /**
     * Vcm Applicable
     */
    VCM_APPLICABLE('Y', "Vcm Applicable"),

    /**
     * Vcm Not Applicable
     */
    VCM_NOT_APPLICABLE('N', "Vcm Not Applicable");

    private final char wire;

    private final String description;

    VcmFlag(char wire, String description) {
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
    public static Optional<VcmFlag> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(VCM_APPLICABLE);
            case 'N' -> Optional.of(VCM_NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
