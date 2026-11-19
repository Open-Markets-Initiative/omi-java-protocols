package omi.nse.nsefo.recovery.tbt.v7_1.enums;

import java.util.Optional;

/**
 * cMsgType. Code identifying message type [1, Char]
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * For every new order request, this message is sent.
     */
    NEW_ORDER_MESSAGE('N', "For every new order request, this message is sent."),

    /**
     * For every order modification request, this message is sent.
     */
    ORDER_MODIFICATION_MESSAGE('M', "For every order modification request, this message is sent."),

    /**
     * For every order cancellation request, this message is sent.
     */
    ORDER_CANCELLATION_MESSAGE('X', "For every order cancellation request, this message is sent."),

    /**
     * This message is sent whenever an order in the order book gets executed fully or partially.
     */
    TRADE_MESSAGE('T', "This message is sent whenever an order in the order book gets executed fully or partially."),

    /**
     * FO and CD segments only. For every new spread order request, this message is sent.
     */
    NEW_SPREAD_ORDER_MESSAGE('G', "FO and CD segments only. For every new spread order request, this message is sent."),

    /**
     * FO and CD segments only. For every spread order modification request, this message is sent.
     */
    SPREAD_ORDER_MODIFICATION_MESSAGE('H', "FO and CD segments only. For every spread order modification request, this message is sent."),

    /**
     * FO and CD segments only. For every spread order cancellation request, this message is sent.
     */
    SPREAD_ORDER_CANCELLATION_MESSAGE('J', "FO and CD segments only. For every spread order cancellation request, this message is sent."),

    /**
     * FO and CD segments only. This message is sent whenever a spread order in the order book gets executed fully or partially.
     */
    SPREAD_TRADE_MESSAGE('K', "FO and CD segments only. This message is sent whenever a spread order in the order book gets executed fully or partially."),

    /**
     * For CM and FO segments only. This message is sent whenever a Trade gets cancelled.
     */
    TRADE_CANCEL_MESSAGE('C', "For CM and FO segments only. This message is sent whenever a Trade gets cancelled."),

    /**
     * Heartbeat message will be sent when there is no data available for a few seconds. Only applicable for UDP TBT multicast channels.
     */
    HEARTBEAT_MESSAGE('Z', "Heartbeat message will be sent when there is no data available for a few seconds. Only applicable for UDP TBT multicast channels."),

    /**
     * First message sent by the Recovery Server, indicating whether the request was processed successfully.
     */
    TICK_DATA_RECOVERY_RESPONSE_MESSAGE('Y', "First message sent by the Recovery Server, indicating whether the request was processed successfully.");

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
            case 'N' -> Optional.of(NEW_ORDER_MESSAGE);
            case 'M' -> Optional.of(ORDER_MODIFICATION_MESSAGE);
            case 'X' -> Optional.of(ORDER_CANCELLATION_MESSAGE);
            case 'T' -> Optional.of(TRADE_MESSAGE);
            case 'G' -> Optional.of(NEW_SPREAD_ORDER_MESSAGE);
            case 'H' -> Optional.of(SPREAD_ORDER_MODIFICATION_MESSAGE);
            case 'J' -> Optional.of(SPREAD_ORDER_CANCELLATION_MESSAGE);
            case 'K' -> Optional.of(SPREAD_TRADE_MESSAGE);
            case 'C' -> Optional.of(TRADE_CANCEL_MESSAGE);
            case 'Z' -> Optional.of(HEARTBEAT_MESSAGE);
            case 'Y' -> Optional.of(TICK_DATA_RECOVERY_RESPONSE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
