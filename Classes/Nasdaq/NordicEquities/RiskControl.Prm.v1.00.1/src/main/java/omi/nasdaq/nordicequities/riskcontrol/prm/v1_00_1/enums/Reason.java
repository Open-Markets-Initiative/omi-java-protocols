package omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.enums;

import java.util.Optional;

/**
 * The reason the PRM change request was rejected
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Reason {

    /**
     * Invalid Currency
     */
    INVALID_CURRENCY('C', "Invalid Currency"),

    /**
     * Invalid Prm Account
     */
    INVALID_PRM_ACCOUNT('A', "Invalid Prm Account"),

    /**
     * No Setting Present
     */
    NO_SETTING_PRESENT('N', "No Setting Present"),

    /**
     * Unauthorized
     */
    UNAUTHORIZED('U', "Unauthorized");

    private final char wire;

    private final String description;

    Reason(char wire, String description) {
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
    public static Optional<Reason> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(INVALID_CURRENCY);
            case 'A' -> Optional.of(INVALID_PRM_ACCOUNT);
            case 'N' -> Optional.of(NO_SETTING_PRESENT);
            case 'U' -> Optional.of(UNAUTHORIZED);
            default -> Optional.empty();
        };
    }
}
