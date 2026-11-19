package omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * Sessions where the order is executable: R=Regular Session, A=All/Any session, E=Extended close (9:30 to 4:15). Extended trading hours edition (Options_ETH_OTTO.pdf); the regular edition (Options_OTTO.pdf) marks this byte as part of a 9 byte reserved field.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SessionEligibility {

    /**
     * Regular Session
     */
    REGULAR_SESSION('R', "Regular Session"),

    /**
     * All/Any session
     */
    ALL_SESSIONS('A', "All/Any session"),

    /**
     * Extended close (9:30 to 4:15)
     */
    EXTENDED_CLOSE('E', "Extended close (9:30 to 4:15)");

    private final char wire;

    private final String description;

    SessionEligibility(char wire, String description) {
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
    public static Optional<SessionEligibility> fromWire(char wire) {
        return switch (wire) {
            case 'R' -> Optional.of(REGULAR_SESSION);
            case 'A' -> Optional.of(ALL_SESSIONS);
            case 'E' -> Optional.of(EXTENDED_CLOSE);
            default -> Optional.empty();
        };
    }
}
