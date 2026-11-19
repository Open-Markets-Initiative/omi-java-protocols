package omi.bme.bmeequities.orderentry.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Persistence type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Persistence {

    /**
     * Cancel On Disconnection
     */
    CANCEL_ON_DISCONNECTION('C', "Cancel On Disconnection"),

    /**
     * Persist On Disconnection
     */
    PERSIST_ON_DISCONNECTION('P', "Persist On Disconnection");

    private final char wire;

    private final String description;

    Persistence(char wire, String description) {
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
    public static Optional<Persistence> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CANCEL_ON_DISCONNECTION);
            case 'P' -> Optional.of(PERSIST_ON_DISCONNECTION);
            default -> Optional.empty();
        };
    }
}
