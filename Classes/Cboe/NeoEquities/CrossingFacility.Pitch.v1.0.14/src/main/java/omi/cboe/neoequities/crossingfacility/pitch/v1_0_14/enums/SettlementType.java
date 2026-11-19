package omi.cboe.neoequities.crossingfacility.pitch.v1_0_14.enums;

import java.util.Optional;

/**
 * Settlement terms of the order.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SettlementType {

    /**
     * No Special Settlement Terms Specified
     */
    NO_SPECIAL_SETTLEMENT_TERMS_SPECIFIED((short) 0, "No Special Settlement Terms Specified"),

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
            case 0 -> Optional.of(NO_SPECIAL_SETTLEMENT_TERMS_SPECIFIED);
            case 1 -> Optional.of(CASH);
            case 6 -> Optional.of(FUTURE);
            case 11 -> Optional.of(NON_NET);
            default -> Optional.empty();
        };
    }
}
