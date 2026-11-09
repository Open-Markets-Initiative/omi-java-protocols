package omi.coinbase.deribit.ordersapi.sbe.v0_1.enums;

import java.util.Optional;

/**
 * reason
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum ReasonCancelOrderRejectReason {

    /**
     * ERROR
     */
    ERROR((byte) 0, "ERROR"),

    /**
     * UNKNOWN_ORDER
     */
    UNKNOWN_ORDER((byte) 1, "UNKNOWN_ORDER"),

    /**
     * CLIENT_PERMISSION_ERROR
     */
    CLIENT_PERMISSION_ERROR((byte) 2, "CLIENT_PERMISSION_ERROR"),

    /**
     * NOT_ALLOWED_BY_MARKET_STATE
     */
    NOT_ALLOWED_BY_MARKET_STATE((byte) 3, "NOT_ALLOWED_BY_MARKET_STATE"),

    /**
     * CANCEL_PENDING
     */
    CANCEL_PENDING((byte) 4, "CANCEL_PENDING");

    private final byte wire;

    private final String description;

    ReasonCancelOrderRejectReason(byte wire, String description) {
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
    public static Optional<ReasonCancelOrderRejectReason> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(ERROR);
            case 1 -> Optional.of(UNKNOWN_ORDER);
            case 2 -> Optional.of(CLIENT_PERMISSION_ERROR);
            case 3 -> Optional.of(NOT_ALLOWED_BY_MARKET_STATE);
            case 4 -> Optional.of(CANCEL_PENDING);
            default -> Optional.empty();
        };
    }
}
