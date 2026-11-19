package omi.lseg.lse.level1recovery.gtp.v26_2.enums;

import java.util.Optional;

/**
 * Defines the level of the request.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RequestLevel {

    /**
     * Instrument
     */
    INSTRUMENT((short) 0, "Instrument"),

    /**
     * Group Segment
     */
    GROUP_SEGMENT((short) 1, "Group Segment"),

    /**
     * Multicast Channel
     */
    MULTICAST_CHANNEL((short) 2, "Multicast Channel");

    private final short wire;

    private final String description;

    RequestLevel(short wire, String description) {
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
    public static Optional<RequestLevel> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(INSTRUMENT);
            case 1 -> Optional.of(GROUP_SEGMENT);
            case 2 -> Optional.of(MULTICAST_CHANNEL);
            default -> Optional.empty();
        };
    }
}
