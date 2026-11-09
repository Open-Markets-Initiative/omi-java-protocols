package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.enums;

import java.util.Optional;

/**
 * settlType
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SettlType {

    /**
     * BUYERS_DISCRETION
     */
    BUYERS_DISCRETION('0', "BUYERS_DISCRETION"),

    /**
     * SELLERS_DISCRETION
     */
    SELLERS_DISCRETION('8', "SELLERS_DISCRETION"),

    /**
     * MUTUAL
     */
    MUTUAL('X', "MUTUAL");

    private final char wire;

    private final String description;

    SettlType(char wire, String description) {
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
    public static Optional<SettlType> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(BUYERS_DISCRETION);
            case '8' -> Optional.of(SELLERS_DISCRETION);
            case 'X' -> Optional.of(MUTUAL);
            default -> Optional.empty();
        };
    }
}
