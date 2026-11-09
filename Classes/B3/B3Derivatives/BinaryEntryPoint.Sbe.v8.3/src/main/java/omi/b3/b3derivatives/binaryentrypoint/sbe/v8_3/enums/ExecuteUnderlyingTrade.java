package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.enums;

import java.util.Optional;

/**
 * executeUnderlyingTrade
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecuteUnderlyingTrade {

    /**
     * NO_UNDERLYING_TRADE
     */
    NO_UNDERLYING_TRADE('0', "NO_UNDERLYING_TRADE"),

    /**
     * UNDERLYING_OPPOSING_TRADE
     */
    UNDERLYING_OPPOSING_TRADE('1', "UNDERLYING_OPPOSING_TRADE"),

    /**
     * executeUnderlyingTrade
     */
    NO_VALUE('0', "executeUnderlyingTrade");

    private final char wire;

    private final String description;

    ExecuteUnderlyingTrade(char wire, String description) {
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
    public static Optional<ExecuteUnderlyingTrade> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NO_UNDERLYING_TRADE);
            case '1' -> Optional.of(UNDERLYING_OPPOSING_TRADE);
            default -> Optional.empty();
        };
    }
}
