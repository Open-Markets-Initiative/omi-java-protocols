package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Identifier of the trading member/participant who made the execution decision.
 *
 * <p>Backed by long. Values correspond to the wire integer encoding.</p>
 */
public enum ExecutingTrader {

    /**
     * Client
     */
    CLIENT(0x3L, "Client");

    private final long wire;

    private final String description;

    ExecutingTrader(long wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public long wire() {
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
    public static Optional<ExecutingTrader> fromWire(long wire) {
        if (wire == 3L) {
            return Optional.of(CLIENT);
        }
        return Optional.empty();
    }
}
