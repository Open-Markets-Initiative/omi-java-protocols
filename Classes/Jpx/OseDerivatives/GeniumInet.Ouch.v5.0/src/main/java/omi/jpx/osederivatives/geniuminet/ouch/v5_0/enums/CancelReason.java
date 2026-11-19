package omi.jpx.osederivatives.geniuminet.ouch.v5_0.enums;

import java.util.Optional;

/**
 * System-defined reason code for the cancellation.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CancelReason {

    /**
     * Order was canceled by the user.
     */
    CANCELED_BY_USER((short) 1, "Order was canceled by the user."),

    /**
     * Order was inactivated by the system.
     */
    ORDER_INACTIVATED((short) 4, "Order was inactivated by the system."),

    /**
     * Order was canceled by the system.
     */
    CANCELED_BY_SYSTEM((short) 9, "Order was canceled by the system."),

    /**
     * Order was canceled by a proxy.
     */
    CANCELED_BY_PROXY((short) 10, "Order was canceled by a proxy."),

    /**
     * Order was canceled due to a system limit change.
     */
    CANCELED_BY_SYSTEM_LIMIT_CHANGE((short) 15, "Order was canceled due to a system limit change."),

    /**
     * Order was deleted after time validity expiration.
     */
    DELETED_BY_TIME_VALIDITY_EXPIRATION((short) 19, "Order was deleted after time validity expiration."),

    /**
     * Order was canceled due to ISS.
     */
    CANCELED_DUE_TO_ISS((short) 20, "Order was canceled due to ISS."),

    /**
     * Order was inactivated due to ISS.
     */
    INACTIVATED_DUE_TO_ISS((short) 21, "Order was inactivated due to ISS."),

    /**
     * Order was canceled after the auction.
     */
    CANCELED_AFTER_AUCTION((short) 34, "Order was canceled after the auction."),

    /**
     * Order was canceled by system delta protection.
     */
    CANCELED_BY_SYSTEM_DELTA_PROTECTION((short) 41, "Order was canceled by system delta protection."),

    /**
     * Order was canceled by system quantity protection.
     */
    CANCELED_BY_SYSTEM_QUANTITY_PROTECTION((short) 42, "Order was canceled by system quantity protection."),

    /**
     * Order was canceled because the trader is not allowed to trade with himself.
     */
    SELF_TRADE_PREVENTION((short) 43, "Order was canceled because the trader is not allowed to trade with himself.");

    private final short wire;

    private final String description;

    CancelReason(short wire, String description) {
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
    public static Optional<CancelReason> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CANCELED_BY_USER);
            case 4 -> Optional.of(ORDER_INACTIVATED);
            case 9 -> Optional.of(CANCELED_BY_SYSTEM);
            case 10 -> Optional.of(CANCELED_BY_PROXY);
            case 15 -> Optional.of(CANCELED_BY_SYSTEM_LIMIT_CHANGE);
            case 19 -> Optional.of(DELETED_BY_TIME_VALIDITY_EXPIRATION);
            case 20 -> Optional.of(CANCELED_DUE_TO_ISS);
            case 21 -> Optional.of(INACTIVATED_DUE_TO_ISS);
            case 34 -> Optional.of(CANCELED_AFTER_AUCTION);
            case 41 -> Optional.of(CANCELED_BY_SYSTEM_DELTA_PROTECTION);
            case 42 -> Optional.of(CANCELED_BY_SYSTEM_QUANTITY_PROTECTION);
            case 43 -> Optional.of(SELF_TRADE_PREVENTION);
            default -> Optional.empty();
        };
    }
}
