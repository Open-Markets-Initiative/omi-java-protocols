package omi.asianext.asianextderivatives.realtime.amd.v1_3.enums;

import java.util.Optional;

/**
 * Settlement type of the instrument
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SettlementType {

    /**
     * Cash
     */
    CASH((short) 1, "Cash"),

    /**
     * Physical
     */
    PHYSICAL((short) 2, "Physical");

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
            case 2 -> Optional.of(PHYSICAL);
            default -> Optional.empty();
        };
    }
}
