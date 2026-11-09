package omi.miax.onyxfutures.topofmarket.mach.v1_0_b.enums;

import java.util.Optional;

/**
 * protocol packet type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PacketType {

    /**
     * Mach Heartbeat Message
     */
    HEARTBEAT((short) 0, "Mach Heartbeat Message"),

    /**
     * Mach Start Of Session Message
     */
    START_OF_SESSION((short) 1, "Mach Start Of Session Message"),

    /**
     * Mach end of session Message
     */
    END_OF_SESSION((short) 2, "Mach end of session Message"),

    /**
     * Mach Application Message
     */
    APPLICATION_MESSAGE((short) 3, "Mach Application Message");

    private final short wire;

    private final String description;

    PacketType(short wire, String description) {
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
    public static Optional<PacketType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(HEARTBEAT);
            case 1 -> Optional.of(START_OF_SESSION);
            case 2 -> Optional.of(END_OF_SESSION);
            case 3 -> Optional.of(APPLICATION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
