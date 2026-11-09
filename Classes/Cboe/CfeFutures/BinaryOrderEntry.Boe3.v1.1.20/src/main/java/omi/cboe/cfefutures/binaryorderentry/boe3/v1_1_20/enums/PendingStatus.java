package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.enums;

import java.util.Optional;

/**
 * Field is provided as a convenience to determine whether an Order Execution message is a preliminary notification representing a pending trade
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PendingStatus {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE('N', "Not Applicable"),

    /**
     * Pending
     */
    PENDING('P', "Pending");

    private final char wire;

    private final String description;

    PendingStatus(char wire, String description) {
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
    public static Optional<PendingStatus> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NOT_APPLICABLE);
            case 'P' -> Optional.of(PENDING);
            default -> Optional.empty();
        };
    }
}
