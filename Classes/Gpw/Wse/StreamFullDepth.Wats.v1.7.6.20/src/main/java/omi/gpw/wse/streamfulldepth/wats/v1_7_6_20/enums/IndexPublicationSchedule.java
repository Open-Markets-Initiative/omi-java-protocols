package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Mode of index dissemination
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum IndexPublicationSchedule {

    /**
     * Index is quoted in determined time intervals
     */
    CONTINUOUS((short) 1, "Index is quoted in determined time intervals"),

    /**
     * Index is quoted on determined hours
     */
    FIXING((short) 2, "Index is quoted on determined hours"),

    /**
     * Index is quoted on closing
     */
    CLOSING((short) 3, "Index is quoted on closing");

    private final short wire;

    private final String description;

    IndexPublicationSchedule(short wire, String description) {
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
    public static Optional<IndexPublicationSchedule> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CONTINUOUS);
            case 2 -> Optional.of(FIXING);
            case 3 -> Optional.of(CLOSING);
            default -> Optional.empty();
        };
    }
}
