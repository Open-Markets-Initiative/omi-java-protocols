package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.enums;

import java.util.Optional;

/**
 * Defines the LocateReqd values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LocateReqd {

    /**
     * Client affirms ability to borrow (default)
     */
    CLIENT_AFFIRMS_ABILITY_TO_BORROW('N', "Client affirms ability to borrow (default)"),

    /**
     * Client does not affirm ability to borrow (results in reject)
     */
    CLIENT_DOES_NOT_AFFIRM_ABILITY_TO_BORROW('Y', "Client does not affirm ability to borrow (results in reject)");

    private final char wire;

    private final String description;

    LocateReqd(char wire, String description) {
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
    public static Optional<LocateReqd> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(CLIENT_AFFIRMS_ABILITY_TO_BORROW);
            case 'Y' -> Optional.of(CLIENT_DOES_NOT_AFFIRM_ABILITY_TO_BORROW);
            default -> Optional.empty();
        };
    }
}
