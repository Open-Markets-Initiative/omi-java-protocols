package omi.nasdaq.ntxoptions.cti.itch.v2_1.enums;

import java.util.Optional;

/**
 * S = Send (original transmission), P = Possible duplicate (unsolicited retransmission)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SendType {

    /**
     * Send (original transmission)
     */
    SEND('S', "Send (original transmission)"),

    /**
     * Possible duplicate (unsolicited retransmission)
     */
    POSSIBLE_DUPLICATE('P', "Possible duplicate (unsolicited retransmission)");

    private final char wire;

    private final String description;

    SendType(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<SendType> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(SEND);
            case 'P' -> Optional.of(POSSIBLE_DUPLICATE);
            default -> Optional.empty();
        };
    }
}
