package omi.jpx.osederivatives.geniuminet.ouch.v5_0.enums;

import java.util.Optional;

/**
 * Position update indicator
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OpenClose {

    /**
     * No change to the current position.
     */
    NO_CHANGE((short) 0, "No change to the current position."),

    /**
     * Open position.
     */
    OPEN((short) 1, "Open position."),

    /**
     * Close or net the position.
     */
    CLOSE_NET((short) 2, "Close or net the position."),

    /**
     * Mandatory close of the position.
     */
    MANDATORY_CLOSE((short) 3, "Mandatory close of the position."),

    /**
     * Default behavior for the account.
     */
    DEFAULT((short) 4, "Default behavior for the account.");

    private final short wire;

    private final String description;

    OpenClose(short wire, String description) {
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
    public static Optional<OpenClose> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NO_CHANGE);
            case 1 -> Optional.of(OPEN);
            case 2 -> Optional.of(CLOSE_NET);
            case 3 -> Optional.of(MANDATORY_CLOSE);
            case 4 -> Optional.of(DEFAULT);
            default -> Optional.empty();
        };
    }
}
