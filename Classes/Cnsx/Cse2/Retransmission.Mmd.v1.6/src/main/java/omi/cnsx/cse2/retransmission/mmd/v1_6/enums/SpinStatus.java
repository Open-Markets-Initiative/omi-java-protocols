package omi.cnsx.cse2.retransmission.mmd.v1_6.enums;

import java.util.Optional;

/**
 * Status.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SpinStatus {

    /**
     * The exchange acknowledges the spin request and retransmits the book over the same Tcp socket
     */
    SPIN_ACKNOWLEDGED('S', "The exchange acknowledges the spin request and retransmits the book over the same Tcp socket"),

    /**
     * Sent once the book has been retransmitted, marking the end of the spin
     */
    END_OF_SPIN('E', "Sent once the book has been retransmitted, marking the end of the spin");

    private final char wire;

    private final String description;

    SpinStatus(char wire, String description) {
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
    public static Optional<SpinStatus> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(SPIN_ACKNOWLEDGED);
            case 'E' -> Optional.of(END_OF_SPIN);
            default -> Optional.empty();
        };
    }
}
