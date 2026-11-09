package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Indicates how long the order as specified in the side stays in effect. SideTimeInForce allows a two-sided cross order to specify order behavior separately for each side. Defaults to Day if absent.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SideTimeInForce {

    /**
     * Day
     */
    DAY((short) 0, "Day"),

    /**
     * FAK
     */
    FAK((short) 3, "FAK");

    private final short wire;

    private final String description;

    SideTimeInForce(short wire, String description) {
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
    public static Optional<SideTimeInForce> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DAY);
            case 3 -> Optional.of(FAK);
            default -> Optional.empty();
        };
    }
}
