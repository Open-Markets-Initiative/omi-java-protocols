package omi.coinbase.deribit.ordersapi.sbe.v1_5.enums;

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
    CANCEL_PENDING((byte) 4, "CANCEL_PENDING"),

    /**
     * IN_LIQUIDATION
     */
    IN_LIQUIDATION((byte) 5, "IN_LIQUIDATION"),

    /**
     * INVALID_INSTRUMENT
     */
    INVALID_INSTRUMENT((byte) 6, "INVALID_INSTRUMENT"),

    /**
     * TIME_IN_FORCE
     */
    TIME_IN_FORCE((byte) 7, "TIME_IN_FORCE"),

    /**
     * SPEED_BUMP_CONVERTED_TO_IOC
     */
    SPEED_BUMP_CONVERTED_TO_IOC((byte) 8, "SPEED_BUMP_CONVERTED_TO_IOC");

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
            case 5 -> Optional.of(IN_LIQUIDATION);
            case 6 -> Optional.of(INVALID_INSTRUMENT);
            case 7 -> Optional.of(TIME_IN_FORCE);
            case 8 -> Optional.of(SPEED_BUMP_CONVERTED_TO_IOC);
            default -> Optional.empty();
        };
    }
}
