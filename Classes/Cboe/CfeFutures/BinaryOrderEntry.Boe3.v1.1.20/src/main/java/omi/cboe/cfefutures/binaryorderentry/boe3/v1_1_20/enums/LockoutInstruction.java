package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.enums;

import java.util.Optional;

/**
 * Lockout Instruction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LockoutInstruction {

    /**
     * No Lockout
     */
    NO_LOCKOUT('N', "No Lockout"),

    /**
     * Lockout Until Corresponding Reset Risk Received
     */
    LOCKOUT_UNTIL_CORRESPONDING_RESET_RISK_RECEIVED('L', "Lockout Until Corresponding Reset Risk Received");

    private final char wire;

    private final String description;

    LockoutInstruction(char wire, String description) {
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
    public static Optional<LockoutInstruction> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NO_LOCKOUT);
            case 'L' -> Optional.of(LOCKOUT_UNTIL_CORRESPONDING_RESET_RISK_RECEIVED);
            default -> Optional.empty();
        };
    }
}
