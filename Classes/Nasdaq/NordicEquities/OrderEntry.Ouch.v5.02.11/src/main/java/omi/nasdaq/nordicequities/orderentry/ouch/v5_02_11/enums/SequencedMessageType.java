package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * Signals an event affecting the entire Nasdaq Nordic system
     */
    SYSTEM_EVENT_MESSAGE('S', "Signals an event affecting the entire Nasdaq Nordic system"),

    /**
     * Acknowledges receipt and acceptance of a valid Enter Order
     */
    ORDER_ACCEPTED_MESSAGE('A', "Acknowledges receipt and acceptance of a valid Enter Order"),

    /**
     * Confirms that an order has been replaced
     */
    ORDER_REPLACED_MESSAGE('U', "Confirms that an order has been replaced"),

    /**
     * An order has been reduced or cancelled
     */
    CANCELLED_ORDER_MESSAGE('C', "An order has been reduced or cancelled"),

    /**
     * A cancel request cannot be applied immediately
     */
    CANCEL_PENDING_MESSAGE('P', "A cancel request cannot be applied immediately"),

    /**
     * A replace request cannot be applied immediately
     */
    REPLACE_PENDING_MESSAGE('N', "A replace request cannot be applied immediately"),

    /**
     * An order has been executed in whole or in part
     */
    EXECUTED_ORDER_MESSAGE('E', "An order has been executed in whole or in part"),

    /**
     * An execution has been broken and cannot be reinstated
     */
    BROKEN_TRADE_MESSAGE('B', "An execution has been broken and cannot be reinstated"),

    /**
     * An order has been rejected
     */
    REJECTED_ORDER_MESSAGE('J', "An order has been rejected"),

    /**
     * A cancel request has been rejected
     */
    CANCEL_REJECTED_MESSAGE('I', "A cancel request has been rejected"),

    /**
     * An order has been restated by the system
     */
    ORDER_RESTATED_MESSAGE('T', "An order has been restated by the system"),

    /**
     * Requests a market maker order refresh
     */
    MMO_REFRESH_REQUEST_MESSAGE('W', "Requests a market maker order refresh"),

    /**
     * Indicates the next available UserRefNum
     */
    ACCOUNT_QUERY_RESPONSE_MESSAGE('Q', "Indicates the next available UserRefNum"),

    /**
     * A Gtc order could not be restated in the morning
     */
    GTC_CANCELLED_MESSAGE('G', "A Gtc order could not be restated in the morning"),

    /**
     * Response to a market making instruction notification
     */
    RESPONSE_TO_MMI_NOTIFICATION_MESSAGE('R', "Response to a market making instruction notification"),

    /**
     * An order is pending while the system processes it
     */
    PENDING_ORDER_MESSAGE('M', "An order is pending while the system processes it"),

    /**
     * Sent whenever an indication of interest changes its streaming
     */
    STREAM_STATUS_MESSAGE('D', "Sent whenever an indication of interest changes its streaming");

    private final char wire;

    private final String description;

    SequencedMessageType(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<SequencedMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'A' -> Optional.of(ORDER_ACCEPTED_MESSAGE);
            case 'U' -> Optional.of(ORDER_REPLACED_MESSAGE);
            case 'C' -> Optional.of(CANCELLED_ORDER_MESSAGE);
            case 'P' -> Optional.of(CANCEL_PENDING_MESSAGE);
            case 'N' -> Optional.of(REPLACE_PENDING_MESSAGE);
            case 'E' -> Optional.of(EXECUTED_ORDER_MESSAGE);
            case 'B' -> Optional.of(BROKEN_TRADE_MESSAGE);
            case 'J' -> Optional.of(REJECTED_ORDER_MESSAGE);
            case 'I' -> Optional.of(CANCEL_REJECTED_MESSAGE);
            case 'T' -> Optional.of(ORDER_RESTATED_MESSAGE);
            case 'W' -> Optional.of(MMO_REFRESH_REQUEST_MESSAGE);
            case 'Q' -> Optional.of(ACCOUNT_QUERY_RESPONSE_MESSAGE);
            case 'G' -> Optional.of(GTC_CANCELLED_MESSAGE);
            case 'R' -> Optional.of(RESPONSE_TO_MMI_NOTIFICATION_MESSAGE);
            case 'M' -> Optional.of(PENDING_ORDER_MESSAGE);
            case 'D' -> Optional.of(STREAM_STATUS_MESSAGE);
            default -> Optional.empty();
        };
    }
}
