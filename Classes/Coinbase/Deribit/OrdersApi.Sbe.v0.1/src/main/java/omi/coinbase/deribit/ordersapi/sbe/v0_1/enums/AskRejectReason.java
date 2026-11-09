package omi.coinbase.deribit.ordersapi.sbe.v0_1.enums;

import java.util.Optional;

/**
 * askRejectReason
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum AskRejectReason {

    /**
     * SYSTEM_ERROR
     */
    SYSTEM_ERROR((byte) 0, "SYSTEM_ERROR"),

    /**
     * INVALID_INSTRUMENT
     */
    INVALID_INSTRUMENT((byte) 1, "INVALID_INSTRUMENT"),

    /**
     * INVALID_FIELD
     */
    INVALID_FIELD((byte) 2, "INVALID_FIELD"),

    /**
     * INSUFFICIENT_MARGIN
     */
    INSUFFICIENT_MARGIN((byte) 3, "INSUFFICIENT_MARGIN"),

    /**
     * DUPLICATE_CLIENT_ORDER_ID
     */
    DUPLICATE_CLIENT_ORDER_ID((byte) 4, "DUPLICATE_CLIENT_ORDER_ID"),

    /**
     * INVALID_QUANTITY
     */
    INVALID_QUANTITY((byte) 5, "INVALID_QUANTITY"),

    /**
     * INVALID_PRICE
     */
    INVALID_PRICE((byte) 6, "INVALID_PRICE"),

    /**
     * NOT_ALLOWED_BY_MARKET_STATE
     */
    NOT_ALLOWED_BY_MARKET_STATE((byte) 7, "NOT_ALLOWED_BY_MARKET_STATE"),

    /**
     * POST_ONLY
     */
    POST_ONLY((byte) 8, "POST_ONLY"),

    /**
     * exceeded max open orders for instrument/side
     */
    TOO_MANY_OPEN_ORDERS((byte) 9, "exceeded max open orders for instrument/side"),

    /**
     * PERMISSION_ERROR
     */
    PERMISSION_ERROR((byte) 10, "PERMISSION_ERROR"),

    /**
     * PORTFOLIO_NOT_FOUND
     */
    PORTFOLIO_NOT_FOUND((byte) 11, "PORTFOLIO_NOT_FOUND"),

    /**
     * for replaces and eng responses
     */
    ORDER_NOT_FOUND((byte) 12, "for replaces and eng responses"),

    /**
     * MMP_NOT_CONFIGURED
     */
    MMP_NOT_CONFIGURED((byte) 13, "MMP_NOT_CONFIGURED"),

    /**
     * MMP_MAX_QUOTE_QTY_EXCEEDED
     */
    MMP_MAX_QUOTE_QTY_EXCEEDED((byte) 14, "MMP_MAX_QUOTE_QTY_EXCEEDED"),

    /**
     * MMP_GROUP_FROZEN
     */
    MMP_GROUP_FROZEN((byte) 15, "MMP_GROUP_FROZEN"),

    /**
     * INVALID_MARGIN_MODE
     */
    INVALID_MARGIN_MODE((byte) 16, "INVALID_MARGIN_MODE"),

    /**
     * Portfolio is in liquidation
     */
    IN_LIQUIDATION((byte) 17, "Portfolio is in liquidation"),

    /**
     * RISK_CHECK_TIMED_OUT
     */
    RISK_CHECK_TIMED_OUT((byte) 18, "RISK_CHECK_TIMED_OUT"),

    /**
     * TOO_MANY_PENDING_REPLACES
     */
    TOO_MANY_PENDING_REPLACES((byte) 19, "TOO_MANY_PENDING_REPLACES"),

    /**
     * ICEBERG_NOT_ALLOWED
     */
    ICEBERG_NOT_ALLOWED((byte) 20, "ICEBERG_NOT_ALLOWED"),

    /**
     * Block trade error
     */
    INVALID_ALLOCATIONS((byte) 21, "Block trade error"),

    /**
     * price exceeds upper price band limit
     */
    PRICE_TOO_HIGH((byte) 22, "price exceeds upper price band limit"),

    /**
     * price exceeds lower price band limit
     */
    PRICE_TOO_LOW((byte) 23, "price exceeds lower price band limit"),

    /**
     * no price band or mark price available
     */
    PRICE_BAND_UNAVAILABLE((byte) 24, "no price band or mark price available"),

    /**
     * gateway rate limit exceeded
     */
    RATE_LIMIT((byte) 25, "gateway rate limit exceeded");

    private final byte wire;

    private final String description;

    AskRejectReason(byte wire, String description) {
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
    public static Optional<AskRejectReason> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(SYSTEM_ERROR);
            case 1 -> Optional.of(INVALID_INSTRUMENT);
            case 2 -> Optional.of(INVALID_FIELD);
            case 3 -> Optional.of(INSUFFICIENT_MARGIN);
            case 4 -> Optional.of(DUPLICATE_CLIENT_ORDER_ID);
            case 5 -> Optional.of(INVALID_QUANTITY);
            case 6 -> Optional.of(INVALID_PRICE);
            case 7 -> Optional.of(NOT_ALLOWED_BY_MARKET_STATE);
            case 8 -> Optional.of(POST_ONLY);
            case 9 -> Optional.of(TOO_MANY_OPEN_ORDERS);
            case 10 -> Optional.of(PERMISSION_ERROR);
            case 11 -> Optional.of(PORTFOLIO_NOT_FOUND);
            case 12 -> Optional.of(ORDER_NOT_FOUND);
            case 13 -> Optional.of(MMP_NOT_CONFIGURED);
            case 14 -> Optional.of(MMP_MAX_QUOTE_QTY_EXCEEDED);
            case 15 -> Optional.of(MMP_GROUP_FROZEN);
            case 16 -> Optional.of(INVALID_MARGIN_MODE);
            case 17 -> Optional.of(IN_LIQUIDATION);
            case 18 -> Optional.of(RISK_CHECK_TIMED_OUT);
            case 19 -> Optional.of(TOO_MANY_PENDING_REPLACES);
            case 20 -> Optional.of(ICEBERG_NOT_ALLOWED);
            case 21 -> Optional.of(INVALID_ALLOCATIONS);
            case 22 -> Optional.of(PRICE_TOO_HIGH);
            case 23 -> Optional.of(PRICE_TOO_LOW);
            case 24 -> Optional.of(PRICE_BAND_UNAVAILABLE);
            case 25 -> Optional.of(RATE_LIMIT);
            default -> Optional.empty();
        };
    }
}
