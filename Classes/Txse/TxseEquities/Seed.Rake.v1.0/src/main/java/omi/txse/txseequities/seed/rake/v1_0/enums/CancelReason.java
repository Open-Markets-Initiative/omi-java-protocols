package omi.txse.txseequities.seed.rake.v1_0.enums;

import java.util.Optional;

/**
 * Enum CancelReason.
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum CancelReason {

    /**
     * Cancel due to request by client.
     */
    REQUESTED_BY_USER((byte) 1, "Cancel due to request by client."),

    /**
     * Cancel due to time in force expiration.
     */
    RELATED_TO_TIME_IN_FORCE((byte) 2, "Cancel due to time in force expiration."),

    /**
     * Cancel due to inability to meet minimum quantity.
     */
    RELATED_TO_MIN_QTY((byte) 3, "Cancel due to inability to meet minimum quantity."),

    /**
     * Canceled as order would violate Regulation NMS Rule 610(d) by creating a locked or crossed market, and price sliding was either not selected or not applicable.
     */
    REG_NMS_VIOLATION_NO_SLIDE((byte) 4, "Canceled as order would violate Regulation NMS Rule 610(d) by creating a locked or crossed market, and price sliding was either not selected or not applicable."),

    /**
     * Reserve orders will be canceled when deemed marketable at another exchange either at new order entry or replenishment.
     */
    MARKETABLE_RESERVE((byte) 5, "Reserve orders will be canceled when deemed marketable at another exchange either at new order entry or replenishment."),

    /**
     * Cancel due to self-match prevention instructions.
     */
    SELF_MATCH_PREVENTION((byte) 6, "Cancel due to self-match prevention instructions."),

    /**
     * Replenishment canceled related to the Reserve order being canceled or replaced.
     */
    REPLENISHMENT_CANCELED_DUE_TO_RESERVE((byte) 7, "Replenishment canceled related to the Reserve order being canceled or replaced."),

    /**
     * Cancel due to order type e.g.
     */
    RELATED_TO_ORDER_TYPE((byte) 8, "Cancel due to order type e.g."),

    /**
     * Cancel due to client instruction on crossed markets.
     */
    CANCELED_DUE_TO_CROSSED_MARKETS((byte) 9, "Cancel due to client instruction on crossed markets."),

    /**
     * Cancel due to a mass cancel request.
     */
    CANCELED_DUE_TO_MASS_CANCEL_REQUEST((byte) 10, "Cancel due to a mass cancel request."),

    /**
     * Canceled as order would lock or cross the Exchange book, and price sliding was either not selected or not applicable.
     */
    EXCHANGE_LOCKED_OR_CROSSED_NO_SLIDE((byte) 11, "Canceled as order would lock or cross the Exchange book, and price sliding was either not selected or not applicable."),

    /**
     * Canceled as order would violate Regulation SHO Rule 201 by display at or below the National Best Bid during a short sale price test restriction, and price sliding was either not selected or not applicable.
     */
    REG_SHO_VIOLATION_NO_SLIDE((byte) 12, "Canceled as order would violate Regulation SHO Rule 201 by display at or below the National Best Bid during a short sale price test restriction, and price sliding was either not selected or not applicable."),

    /**
     * Canceled as order would violate LULD (Limit Up-Limit Down) price bands per SEC Rule 608, and price sliding was either not selected or not applicable.
     */
    LULD_BREACHED_NO_SLIDE((byte) 13, "Canceled as order would violate LULD (Limit Up-Limit Down) price bands per SEC Rule 608, and price sliding was either not selected or not applicable."),

    /**
     * Canceled as the order's limit price is now outside LULD (Limit Up-Limit Down) price bands after bands narrowed.
     */
    CANCELED_AS_PRICE_BREACHED_LULD((byte) 14, "Canceled as the order's limit price is now outside LULD (Limit Up-Limit Down) price bands after bands narrowed."),

    /**
     * Cancel due to client disconnect from a port with cancel-on-disconnect instructions.
     */
    CANCELED_ON_DISCONNECT((byte) 15, "Cancel due to client disconnect from a port with cancel-on-disconnect instructions."),

    /**
     * Auction order is canceled because the auction it was eligible for has concluded.
     */
    AUCTION_ORDER_POST_CROSS((byte) 16, "Auction order is canceled because the auction it was eligible for has concluded."),

    /**
     * Pegged order canceled because its calculated reference price moved beyond the order's limit price (the limit price collared the peg).
     */
    PEG_REFERENCE_PRICE_BREACHES_LIMIT_PRICE((byte) 17, "Pegged order canceled because its calculated reference price moved beyond the order's limit price (the limit price collared the peg)."),

    /**
     * Canceled as the order is of odd lot size and could not be executed against the contra-side liquidity on the TXSE Book.
     */
    ODD_LOT_NOT_EXECUTABLE((byte) 18, "Canceled as the order is of odd lot size and could not be executed against the contra-side liquidity on the TXSE Book.");

    private final byte wire;

    private final String description;

    CancelReason(byte wire, String description) {
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
    public static Optional<CancelReason> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(REQUESTED_BY_USER);
            case 2 -> Optional.of(RELATED_TO_TIME_IN_FORCE);
            case 3 -> Optional.of(RELATED_TO_MIN_QTY);
            case 4 -> Optional.of(REG_NMS_VIOLATION_NO_SLIDE);
            case 5 -> Optional.of(MARKETABLE_RESERVE);
            case 6 -> Optional.of(SELF_MATCH_PREVENTION);
            case 7 -> Optional.of(REPLENISHMENT_CANCELED_DUE_TO_RESERVE);
            case 8 -> Optional.of(RELATED_TO_ORDER_TYPE);
            case 9 -> Optional.of(CANCELED_DUE_TO_CROSSED_MARKETS);
            case 10 -> Optional.of(CANCELED_DUE_TO_MASS_CANCEL_REQUEST);
            case 11 -> Optional.of(EXCHANGE_LOCKED_OR_CROSSED_NO_SLIDE);
            case 12 -> Optional.of(REG_SHO_VIOLATION_NO_SLIDE);
            case 13 -> Optional.of(LULD_BREACHED_NO_SLIDE);
            case 14 -> Optional.of(CANCELED_AS_PRICE_BREACHED_LULD);
            case 15 -> Optional.of(CANCELED_ON_DISCONNECT);
            case 16 -> Optional.of(AUCTION_ORDER_POST_CROSS);
            case 17 -> Optional.of(PEG_REFERENCE_PRICE_BREACHES_LIMIT_PRICE);
            case 18 -> Optional.of(ODD_LOT_NOT_EXECUTABLE);
            default -> Optional.empty();
        };
    }
}
