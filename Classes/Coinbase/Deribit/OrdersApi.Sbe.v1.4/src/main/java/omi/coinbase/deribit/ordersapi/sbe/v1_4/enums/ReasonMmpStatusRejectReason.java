package omi.coinbase.deribit.ordersapi.sbe.v1_4.enums;

import java.util.Optional;

/**
 * reason
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum ReasonMmpStatusRejectReason {

    /**
     * SYSTEM_ERROR
     */
    SYSTEM_ERROR((byte) 0, "SYSTEM_ERROR"),

    /**
     * INVALID_MMP_GROUP
     */
    INVALID_MMP_GROUP((byte) 1, "INVALID_MMP_GROUP");

    private final byte wire;

    private final String description;

    ReasonMmpStatusRejectReason(byte wire, String description) {
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
    public static Optional<ReasonMmpStatusRejectReason> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(SYSTEM_ERROR);
            case 1 -> Optional.of(INVALID_MMP_GROUP);
            default -> Optional.empty();
        };
    }
}
