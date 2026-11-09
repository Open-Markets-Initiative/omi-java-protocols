package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.enums;

import java.util.Optional;

/**
 * massActionScope
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MassActionScope {

    /**
     * ALL_ORDERS_FOR_A_TRADING_SESSION
     */
    ALL_ORDERS_FOR_A_TRADING_SESSION((short) 6, "ALL_ORDERS_FOR_A_TRADING_SESSION"),

    /**
     * massActionScope
     */
    NO_VALUE((short) 0, "massActionScope");

    private final short wire;

    private final String description;

    MassActionScope(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<MassActionScope> fromWire(short wire) {
        return switch (wire) {
            case 6 -> Optional.of(ALL_ORDERS_FOR_A_TRADING_SESSION);
            case 0 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
