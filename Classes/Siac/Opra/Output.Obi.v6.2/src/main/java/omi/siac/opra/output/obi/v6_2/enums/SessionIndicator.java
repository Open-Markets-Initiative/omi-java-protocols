package omi.siac.opra.output.obi.v6_2.enums;

import java.util.Optional;

/**
 * 0x00 for regular trading session
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SessionIndicator {

    /**
     * Regular Trading Session
     */
    REGULAR((short) 0, "Regular Trading Session"),

    /**
     * ASCII 'X' for Pre-Market extended hours trading session (only used during Pre-Market Extended Session)
     */
    PRE_MARKET((short) 88, "ASCII 'X' for Pre-Market extended hours trading session (only used during Pre-Market Extended Session)");

    private final short wire;

    private final String description;

    SessionIndicator(short wire, String description) {
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
    public static Optional<SessionIndicator> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(REGULAR);
            case 88 -> Optional.of(PRE_MARKET);
            default -> Optional.empty();
        };
    }
}
