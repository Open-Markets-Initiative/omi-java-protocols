package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * Indicates the settlement period
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SettlementType {

    /**
     * Cash
     */
    CASH((short) 1, "Cash"),

    /**
     * Future
     */
    FUTURE((short) 6, "Future"),

    /**
     * Non Net
     */
    NON_NET((short) 11, "Non Net");

    private final short wire;

    private final String description;

    SettlementType(short wire, String description) {
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
    public static Optional<SettlementType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CASH);
            case 6 -> Optional.of(FUTURE);
            case 11 -> Optional.of(NON_NET);
            default -> Optional.empty();
        };
    }
}
