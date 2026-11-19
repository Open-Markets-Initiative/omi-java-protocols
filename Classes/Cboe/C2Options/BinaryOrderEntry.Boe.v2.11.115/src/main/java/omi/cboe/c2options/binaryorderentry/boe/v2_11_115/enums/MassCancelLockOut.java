package omi.cboe.c2options.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Reported back with the following possible values. Y = Lockout N = No Lockout This field corresponds to Lockout (7697) in Cboe FIX.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MassCancelLockOut {

    /**
     * Lockout
     */
    LOCKOUT('Y', "Lockout"),

    /**
     * No Lockout This field corresponds to Lockout (7697) in Cboe FIX.
     */
    NO_LOCKOUT('N', "No Lockout This field corresponds to Lockout (7697) in Cboe FIX.");

    private final char wire;

    private final String description;

    MassCancelLockOut(char wire, String description) {
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
    public static Optional<MassCancelLockOut> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(LOCKOUT);
            case 'N' -> Optional.of(NO_LOCKOUT);
            default -> Optional.empty();
        };
    }
}
