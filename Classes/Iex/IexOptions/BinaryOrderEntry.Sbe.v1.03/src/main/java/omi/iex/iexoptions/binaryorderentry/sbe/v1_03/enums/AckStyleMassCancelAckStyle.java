package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.enums;

import java.util.Optional;

/**
 * ackStyle
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AckStyleMassCancelAckStyle {

    /**
     * Send a single Mass Cancel Acknowledgement once all cancels have been processed.
     */
    SINGLE_ACK((short) 0, "Send a single Mass Cancel Acknowledgement once all cancels have been processed."),

    /**
     * Send both Order Cancel Acknowledgements messages for each canceled order and a single Mass Cancel Acknowledgement once all cancels have been processed.
     */
    PER_ORDER_ACK_AND_SINGLE_ACK((short) 1, "Send both Order Cancel Acknowledgements messages for each canceled order and a single Mass Cancel Acknowledgement once all cancels have been processed.");

    private final short wire;

    private final String description;

    AckStyleMassCancelAckStyle(short wire, String description) {
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
    public static Optional<AckStyleMassCancelAckStyle> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(SINGLE_ACK);
            case 1 -> Optional.of(PER_ORDER_ACK_AND_SINGLE_ACK);
            default -> Optional.empty();
        };
    }
}
