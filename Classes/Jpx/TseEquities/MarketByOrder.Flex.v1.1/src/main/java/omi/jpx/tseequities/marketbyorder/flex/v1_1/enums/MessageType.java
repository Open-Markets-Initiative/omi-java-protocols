package omi.jpx.tseequities.marketbyorder.flex.v1_1.enums;

import java.util.Optional;

/**
 * First byte of the tag identifying the message type used as dispatch key
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Provides information about the time of processing on the Trading Server to the nearest second. Always delivered at the time the information is generated, except for Reset and Communication Control. Only one tag is delivered per process and stored at the top of the first packet.
     */
    SECONDS_TIMESTAMP_MESSAGE('T', "Provides information about the time of processing on the Trading Server to the nearest second. Always delivered at the time the information is generated, except for Reset and Communication Control. Only one tag is delivered per process and stored at the top of the first packet."),

    /**
     * Provides information about the status of trading on a per-issue basis. Delivered when there is a change in the tag.
     */
    TRADING_STATUS_MESSAGE('O', "Provides information about the status of trading on a per-issue basis. Delivered when there is a change in the tag."),

    /**
     * Provides summary information about execution. Delivered when an execution occurs.
     */
    EXECUTION_SUMMARY_MESSAGE('K', "Provides summary information about execution. Delivered when an execution occurs."),

    /**
     * Provides information about book registration. Delivered when a new order or modification order is registered.
     */
    ADD_ORDER_MESSAGE('A', "Provides information about book registration. Delivered when a new order or modification order is registered."),

    /**
     * Provides information about registered orders in case of Zaraba execution. Delivered when an execution occurs in Zaraba.
     */
    ORDER_EXECUTED_MESSAGE('E', "Provides information about registered orders in case of Zaraba execution. Delivered when an execution occurs in Zaraba."),

    /**
     * Provides information about registered orders in case of Itayose execution. Delivered when an execution occurs by the Itayose method or while an SQ or STQ is displayed.
     */
    ORDER_EXECUTED_WITH_PRICE_MESSAGE('C', "Provides information about registered orders in case of Itayose execution. Delivered when an execution occurs by the Itayose method or while an SQ or STQ is displayed."),

    /**
     * Provides information about order deletion from the order book. Delivered when an order is deleted via a cancel order or a modification order or when a registered order expires.
     */
    ORDER_DELETE_MESSAGE('D', "Provides information about order deletion from the order book. Delivered when an order is deleted via a cancel order or a modification order or when a registered order expires."),

    /**
     * A tag requesting the resetting (i.e. cancellation) of all distributed information. When the user receives this tag, the user must clear all valid A tags.
     */
    RESET_MESSAGE('R', "A tag requesting the resetting (i.e. cancellation) of all distributed information. When the user receives this tag, the user must clear all valid A tags."),

    /**
     * Provides information about communication control. Delivered when communication starts and ends, and in between at minute intervals.
     */
    COMMUNICATION_CONTROL_MESSAGE('L', "Provides information about communication control. Delivered when communication starts and ends, and in between at minute intervals.");

    private final char wire;

    private final String description;

    MessageType(char wire, String description) {
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
    public static Optional<MessageType> fromWire(char wire) {
        return switch (wire) {
            case 'T' -> Optional.of(SECONDS_TIMESTAMP_MESSAGE);
            case 'O' -> Optional.of(TRADING_STATUS_MESSAGE);
            case 'K' -> Optional.of(EXECUTION_SUMMARY_MESSAGE);
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'C' -> Optional.of(ORDER_EXECUTED_WITH_PRICE_MESSAGE);
            case 'D' -> Optional.of(ORDER_DELETE_MESSAGE);
            case 'R' -> Optional.of(RESET_MESSAGE);
            case 'L' -> Optional.of(COMMUNICATION_CONTROL_MESSAGE);
            default -> Optional.empty();
        };
    }
}
