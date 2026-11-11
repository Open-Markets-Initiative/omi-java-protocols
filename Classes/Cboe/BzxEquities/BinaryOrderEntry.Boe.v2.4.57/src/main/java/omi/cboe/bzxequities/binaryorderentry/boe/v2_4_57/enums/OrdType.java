package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.enums;

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
     * Stop Limit
     */
    STOP_LIMIT('4', "Stop Limit"),

    /**
     * Pegged Pegged requires ExecInst be set to ‘L’, ‘M’, ‘m’, ‘P’, ‘Q’, or ‘R’. Market implies a TimeInForce of Day. Market day orders post in LULD straddle state or if a short sale during a Regulation SHO short sale circuit breaker. Pegged orders may not be routable except for midpoint pegs BYX where RoutStrategy = RMPT, RMPL, or DIRC.
     */
    PEGGED('P', "Pegged Pegged requires ExecInst be set to \u2018L\u2019, \u2018M\u2019, \u2018m\u2019, \u2018P\u2019, \u2018Q\u2019, or \u2018R\u2019. Market implies a TimeInForce of Day. Market day orders post in LULD straddle state or if a short sale during a Regulation SHO short sale circuit breaker. Pegged orders may not be routable except for midpoint pegs BYX where RoutStrategy = RMPT, RMPL, or DIRC.");

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
            case 'P' -> Optional.of(PEGGED);
            default -> Optional.empty();
        };
    }
}
