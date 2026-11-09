package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.enums;

import java.util.Optional;

/**
 * side
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SideOptional {

    /**
     * BUY
     */
    BUY('1', "BUY"),

    /**
     * SELL
     */
    SELL('2', "SELL"),

    /**
     * side
     */
    NO_VALUE('0', "side");

    private final char wire;

    private final String description;

    SideOptional(char wire, String description) {
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
    public static Optional<SideOptional> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(BUY);
            case '2' -> Optional.of(SELL);
            case '0' -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
