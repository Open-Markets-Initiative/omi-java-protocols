package omi.cboe.c1options.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Defines the OrdType values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OrdType {

    /**
     * Market
     */
    MARKET('1', "Market"),

    /**
     * Limit (default)
     */
    LIMIT('2', "Limit (default)"),

    /**
     * Stop
     */
    STOP('3', "Stop"),

    /**
     * Stop Limit Stop/Stop Limit orders must be set to TimeInForce = 0 (DAY), 1 (GTC), or 6 (GTD). Note market and stop/stop limit orders are not supported during GTH or Curb sessions.
     */
    STOP_LIMIT('4', "Stop Limit Stop/Stop Limit orders must be set to TimeInForce = 0 (DAY), 1 (GTC), or 6 (GTD). Note market and stop/stop limit orders are not supported during GTH or Curb sessions.");

    private final char wire;

    private final String description;

    OrdType(char wire, String description) {
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
    public static Optional<OrdType> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(MARKET);
            case '2' -> Optional.of(LIMIT);
            case '3' -> Optional.of(STOP);
            case '4' -> Optional.of(STOP_LIMIT);
            default -> Optional.empty();
        };
    }
}
