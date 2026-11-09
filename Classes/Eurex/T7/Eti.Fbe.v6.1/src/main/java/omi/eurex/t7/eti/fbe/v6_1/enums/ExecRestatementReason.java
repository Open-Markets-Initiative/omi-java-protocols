package omi.eurex.t7.eti.fbe.v6_1.enums;

import java.util.Optional;

/**
 * Defines the ExecRestatementReason values.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum ExecRestatementReason {

    /**
     * Order book restatement
     */
    ORDER_BOOK_RESTATEMENT(1, "Order book restatement"),

    /**
     * Order add accepted
     */
    ORDER_ADDED(101, "Order add accepted"),

    /**
     * Order modify accepted
     */
    ORDER_MODIFIED(102, "Order modify accepted"),

    /**
     * Order delete accepted
     */
    ORDER_CANCELLED(103, "Order delete accepted"),

    /**
     * IOC Order accepted
     */
    IOC_ORDER_CANCELLED(105, "IOC Order accepted"),

    /**
     * Book Order executed
     */
    BOOK_ORDER_EXECUTED(108, "Book Order executed"),

    /**
     * Market Order triggered and executed
     */
    MARKET_ORDER_TRIGGERED(135, "Market Order triggered and executed"),

    /**
     * Closing Auction Order has been activated
     */
    CAO_ORDER_ACTIVATED(149, "Closing Auction Order has been activated"),

    /**
     * Closing Auction Order has been inactivated
     */
    CAO_ORDER_INACTIVATED(150, "Closing Auction Order has been inactivated"),

    /**
     * One-cancels-the-other Order has been triggered
     */
    OCO_ORDER_TRIGGERED(164, "One-cancels-the-other Order has been triggered"),

    /**
     * Stop Order has been triggered
     */
    STOP_ORDER_TRIGGERED(172, "Stop Order has been triggered"),

    /**
     * Ownership Changed
     */
    OWNERSHIP_CHANGED(181, "Ownership Changed"),

    /**
     * Pending order deletion
     */
    ORDER_CANCELLATION_PENDING(197, "Pending order deletion"),

    /**
     * Pending order cancellation executed (end of FREEZE state)
     */
    PENDING_CANCELLATION_EXECUTED(199, "Pending order cancellation executed (end of FREEZE state)"),

    /**
     * Book or Cancel Order accepted
     */
    BOC_ORDER_CANCELLED(212, "Book or Cancel Order accepted"),

    /**
     * No Value
     */
    NO_VALUE(65535, "No Value");

    private final int wire;

    private final String description;

    ExecRestatementReason(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<ExecRestatementReason> fromWire(int wire) {
        return switch (wire) {
            case 1 -> Optional.of(ORDER_BOOK_RESTATEMENT);
            case 101 -> Optional.of(ORDER_ADDED);
            case 102 -> Optional.of(ORDER_MODIFIED);
            case 103 -> Optional.of(ORDER_CANCELLED);
            case 105 -> Optional.of(IOC_ORDER_CANCELLED);
            case 108 -> Optional.of(BOOK_ORDER_EXECUTED);
            case 135 -> Optional.of(MARKET_ORDER_TRIGGERED);
            case 149 -> Optional.of(CAO_ORDER_ACTIVATED);
            case 150 -> Optional.of(CAO_ORDER_INACTIVATED);
            case 164 -> Optional.of(OCO_ORDER_TRIGGERED);
            case 172 -> Optional.of(STOP_ORDER_TRIGGERED);
            case 181 -> Optional.of(OWNERSHIP_CHANGED);
            case 197 -> Optional.of(ORDER_CANCELLATION_PENDING);
            case 199 -> Optional.of(PENDING_CANCELLATION_EXECUTED);
            case 212 -> Optional.of(BOC_ORDER_CANCELLED);
            case 65535 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
