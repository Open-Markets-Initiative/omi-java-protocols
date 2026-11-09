package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.enums;

import java.util.Optional;

/**
 * Instrument type filter
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MtpModifier {

    /**
     * Cancel Newest
     */
    CANCEL_NEWEST('N', "Cancel Newest"),

    /**
     * Cancel Oldest
     */
    CANCEL_OLDEST('O', "Cancel Oldest"),

    /**
     * Cancel Both
     */
    CANCEL_BOTH('B', "Cancel Both");

    private final char wire;

    private final String description;

    MtpModifier(char wire, String description) {
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
    public static Optional<MtpModifier> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(CANCEL_NEWEST);
            case 'O' -> Optional.of(CANCEL_OLDEST);
            case 'B' -> Optional.of(CANCEL_BOTH);
            default -> Optional.empty();
        };
    }
}
