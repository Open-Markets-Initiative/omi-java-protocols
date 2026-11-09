package omi.coinbase.deribit.ordersapi.sbe.v0_1.enums;

import java.util.Optional;

/**
 * reason
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum ReasonRejectReason {

    /**
     * INVALID_SCHEMA_ID
     */
    INVALID_SCHEMA_ID((byte) 1, "INVALID_SCHEMA_ID"),

    /**
     * INVALID_TEMPLATE_ID
     */
    INVALID_TEMPLATE_ID((byte) 2, "INVALID_TEMPLATE_ID"),

    /**
     * INVALID_BLOCK_LENGTH
     */
    INVALID_BLOCK_LENGTH((byte) 3, "INVALID_BLOCK_LENGTH"),

    /**
     * INVALID_FIELD_VALUE
     */
    INVALID_FIELD_VALUE((byte) 4, "INVALID_FIELD_VALUE");

    private final byte wire;

    private final String description;

    ReasonRejectReason(byte wire, String description) {
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
    public static Optional<ReasonRejectReason> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(INVALID_SCHEMA_ID);
            case 2 -> Optional.of(INVALID_TEMPLATE_ID);
            case 3 -> Optional.of(INVALID_BLOCK_LENGTH);
            case 4 -> Optional.of(INVALID_FIELD_VALUE);
            default -> Optional.empty();
        };
    }
}
