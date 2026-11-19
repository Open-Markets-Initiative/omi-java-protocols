package omi.coinbase.deribit.ordersapi.sbe.v0_1.enums;

import java.util.Optional;

/**
 * cancelReason
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum CancelReason {

    /**
     * UNKNOWN
     */
    UNKNOWN((byte) 0, "UNKNOWN"),

    /**
     * SELF_MATCH_PREVENTION
     */
    SELF_MATCH_PREVENTION((byte) 1, "SELF_MATCH_PREVENTION"),

    /**
     * TIME_IN_FORCE
     */
    TIME_IN_FORCE((byte) 2, "TIME_IN_FORCE"),

    /**
     * ADMIN
     */
    ADMIN((byte) 3, "ADMIN"),

    /**
     * MM_PROTECTION
     */
    MM_PROTECTION((byte) 4, "MM_PROTECTION"),

    /**
     * LIQUIDATION
     */
    LIQUIDATION((byte) 5, "LIQUIDATION"),

    /**
     * MARKET_STATE_TRANSITION
     */
    MARKET_STATE_TRANSITION((byte) 6, "MARKET_STATE_TRANSITION"),

    /**
     * CLIENT_DISCONNECT
     */
    CLIENT_DISCONNECT((byte) 7, "CLIENT_DISCONNECT"),

    /**
     * REDUCE_ONLY
     */
    REDUCE_ONLY((byte) 8, "REDUCE_ONLY"),

    /**
     * Instrument status changed to DELIVERED
     */
    DELIVERED((byte) 9, "Instrument status changed to DELIVERED"),

    /**
     * Instrument entered settlement
     */
    SETTLEMENT((byte) 10, "Instrument entered settlement"),

    /**
     * Instrument status changed to INACTIVE
     */
    BOOK_DEACTIVATED((byte) 11, "Instrument status changed to INACTIVE"),

    /**
     * BY_REQUEST
     */
    BY_REQUEST((byte) 12, "BY_REQUEST"),

    /**
     * RISK_CHECK_TIMED_OUT
     */
    RISK_CHECK_TIMED_OUT((byte) 13, "RISK_CHECK_TIMED_OUT"),

    /**
     * MMP_GROUP_DELETED
     */
    MMP_GROUP_DELETED((byte) 14, "MMP_GROUP_DELETED");

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
            case 0 -> Optional.of(UNKNOWN);
            case 1 -> Optional.of(SELF_MATCH_PREVENTION);
            case 2 -> Optional.of(TIME_IN_FORCE);
            case 3 -> Optional.of(ADMIN);
            case 4 -> Optional.of(MM_PROTECTION);
            case 5 -> Optional.of(LIQUIDATION);
            case 6 -> Optional.of(MARKET_STATE_TRANSITION);
            case 7 -> Optional.of(CLIENT_DISCONNECT);
            case 8 -> Optional.of(REDUCE_ONLY);
            case 9 -> Optional.of(DELIVERED);
            case 10 -> Optional.of(SETTLEMENT);
            case 11 -> Optional.of(BOOK_DEACTIVATED);
            case 12 -> Optional.of(BY_REQUEST);
            case 13 -> Optional.of(RISK_CHECK_TIMED_OUT);
            case 14 -> Optional.of(MMP_GROUP_DELETED);
            default -> Optional.empty();
        };
    }
}
