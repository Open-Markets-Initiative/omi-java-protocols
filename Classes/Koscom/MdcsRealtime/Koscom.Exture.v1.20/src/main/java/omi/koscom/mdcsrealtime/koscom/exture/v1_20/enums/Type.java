package omi.koscom.mdcsrealtime.koscom.exture.v1_20.enums;

import java.util.Optional;

/**
 * 1:trading halt 2: lift after trading halt.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Type {

    /**
     * Trading Halt
     */
    TRADING_HALT('1', "Trading Halt"),

    /**
     * Lift After Trading Halt
     */
    LIFT_AFTER_TRADING_HALT('2', "Lift After Trading Halt");

    private final char wire;

    private final String description;

    Type(char wire, String description) {
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
    public static Optional<Type> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(TRADING_HALT);
            case '2' -> Optional.of(LIFT_AFTER_TRADING_HALT);
            default -> Optional.empty();
        };
    }
}
