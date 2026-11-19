package omi.miax.pearloptions.topofmarket.mach.v2_2.enums;

import java.util.Optional;

/**
 * Indicates if this symbol is tradable on MIAX in the current session
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ActiveOnMiax {

    /**
     * Active Tradable On Miax
     */
    ACTIVE('A', "Active Tradable On Miax"),

    /**
     * Inactive Not Tradable On Miax
     */
    INACTIVE('I', "Inactive Not Tradable On Miax");

    private final char wire;

    private final String description;

    ActiveOnMiax(char wire, String description) {
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
    public static Optional<ActiveOnMiax> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ACTIVE);
            case 'I' -> Optional.of(INACTIVE);
            default -> Optional.empty();
        };
    }
}
