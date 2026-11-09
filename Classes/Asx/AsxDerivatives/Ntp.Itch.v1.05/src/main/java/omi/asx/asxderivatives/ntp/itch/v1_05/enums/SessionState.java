package omi.asx.asxderivatives.ntp.itch.v1_05.enums;

import java.util.Optional;

/**
 * Indicates the current session state for the contract as per
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SessionState {

    /**
     * Pre Open
     */
    PRE_OPEN('P', "Pre Open"),

    /**
     * Opened
     */
    OPENED('O', "Opened"),

    /**
     * Regulatory Halt
     */
    REGULATORY_HALT('R', "Regulatory Halt"),

    /**
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Closed
     */
    CLOSED('C', "Closed"),

    /**
     * Maintenance
     */
    MAINTENANCE('M', "Maintenance");

    private final char wire;

    private final String description;

    SessionState(char wire, String description) {
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
    public static Optional<SessionState> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(PRE_OPEN);
            case 'O' -> Optional.of(OPENED);
            case 'R' -> Optional.of(REGULATORY_HALT);
            case 'H' -> Optional.of(HALTED);
            case 'C' -> Optional.of(CLOSED);
            case 'M' -> Optional.of(MAINTENANCE);
            default -> Optional.empty();
        };
    }
}
