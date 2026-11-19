package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.enums;

import java.util.Optional;

/**
 * notificationReason
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum NotificationReason {

    /**
     * Threshold exceeded
     */
    THRESHOLD_EXCEEDED((byte) 0, "Threshold exceeded"),

    /**
     * Market Maker Arbitrage or Intrinsic Value Check Failure
     */
    CHECK_FAILURE((byte) 1, "Market Maker Arbitrage or Intrinsic Value Check Failure");

    private final byte wire;

    private final String description;

    NotificationReason(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<NotificationReason> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(THRESHOLD_EXCEEDED);
            case 1 -> Optional.of(CHECK_FAILURE);
            default -> Optional.empty();
        };
    }
}
