package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * timeInForce
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TimeInForceTimeInForceEnumNull {

    /**
     * Day
     */
    DAY((short) 0, "Day"),

    /**
     * GTC
     */
    GTC((short) 1, "GTC"),

    /**
     * FAK
     */
    FAK((short) 3, "FAK"),

    /**
     * FOK
     */
    FOK((short) 4, "FOK"),

    /**
     * GTD
     */
    GTD((short) 6, "GTD");

    private final short wire;

    private final String description;

    TimeInForceTimeInForceEnumNull(short wire, String description) {
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
    public static Optional<TimeInForceTimeInForceEnumNull> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DAY);
            case 1 -> Optional.of(GTC);
            case 3 -> Optional.of(FAK);
            case 4 -> Optional.of(FOK);
            case 6 -> Optional.of(GTD);
            default -> Optional.empty();
        };
    }
}
