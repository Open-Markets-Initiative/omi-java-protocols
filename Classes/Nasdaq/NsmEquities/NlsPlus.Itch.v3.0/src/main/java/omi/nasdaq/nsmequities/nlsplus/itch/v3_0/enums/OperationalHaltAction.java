package omi.nasdaq.nsmequities.nlsplus.itch.v3_0.enums;

import java.util.Optional;

/**
 * Denotes whether the issue is operationally halted on the identified market or has resumed trading
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OperationalHaltAction {

    /**
     * Operationally halted on the identified market
     */
    HALTED('H', "Operationally halted on the identified market"),

    /**
     * Operational halt has been lifted and trading resumed
     */
    TRADING('T', "Operational halt has been lifted and trading resumed");

    private final char wire;

    private final String description;

    OperationalHaltAction(char wire, String description) {
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
    public static Optional<OperationalHaltAction> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(HALTED);
            case 'T' -> Optional.of(TRADING);
            default -> Optional.empty();
        };
    }
}
