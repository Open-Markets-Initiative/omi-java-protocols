package omi.siac.cqs.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * Indicates an original message or a retransmitted block
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum RetransmissionIndicator {

    /**
     * Original message
     */
    ORIGINAL('O', "Original message"),

    /**
     * Retransmitted message
     */
    RETRANSMITTED('V', "Retransmitted message");

    private final char wire;

    private final String description;

    RetransmissionIndicator(char wire, String description) {
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
    public static Optional<RetransmissionIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(ORIGINAL);
            case 'V' -> Optional.of(RETRANSMITTED);
            default -> Optional.empty();
        };
    }
}
