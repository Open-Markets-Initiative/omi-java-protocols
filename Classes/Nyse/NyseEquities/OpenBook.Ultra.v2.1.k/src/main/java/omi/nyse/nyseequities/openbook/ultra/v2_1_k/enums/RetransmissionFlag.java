package omi.nyse.nyseequities.openbook.ultra.v2_1_k.enums;

import java.util.Optional;

/**
 * Indicates whether this packet contains original, retransmitted, or refresh message
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RetransmissionFlag {

    /**
     * Original packet
     */
    ORIGINAL_PACKET((short) 1, "Original packet"),

    /**
     * Retransmitted packet
     */
    RETRANSMITTED_PACKET((short) 2, "Retransmitted packet"),

    /**
     * Refresh packet with more to come
     */
    REFRESH_PACKET((short) 5, "Refresh packet with more to come"),

    /**
     * Last Refresh packet in a sequence
     */
    LAST_REFRESH_PACKET((short) 6, "Last Refresh packet in a sequence");

    private final short wire;

    private final String description;

    RetransmissionFlag(short wire, String description) {
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
    public static Optional<RetransmissionFlag> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ORIGINAL_PACKET);
            case 2 -> Optional.of(RETRANSMITTED_PACKET);
            case 5 -> Optional.of(REFRESH_PACKET);
            case 6 -> Optional.of(LAST_REFRESH_PACKET);
            default -> Optional.empty();
        };
    }
}
