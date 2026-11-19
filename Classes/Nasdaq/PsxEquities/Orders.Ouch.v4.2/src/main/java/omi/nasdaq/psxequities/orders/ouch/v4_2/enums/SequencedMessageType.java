package omi.nasdaq.psxequities.orders.ouch.v4_2.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * System Event Messages signal events that affect the entire NASDAQ OMX PSX system
     */
    SYSTEM_EVENT_MESSAGE('S', "System Event Messages signal events that affect the entire NASDAQ OMX PSX system"),

    /**
     * This message acknowledges the receipt and acceptance of a valid Enter Order Message. The data fields from the Enter Order Message are echoed back in this message. Note that the accepted values may differ from the entered values for some fields.
     */
    ACCEPTED_MESSAGE('A', "This message acknowledges the receipt and acceptance of a valid Enter Order Message. The data fields from the Enter Order Message are echoed back in this message. Note that the accepted values may differ from the entered values for some fields."),

    /**
     * This message acknowledges the receipt and acceptance of a valid Replace Order Message. The data fields from the Replace Order Message are echoed back in this message. Note that the accepted values may differ from the entered values for some fields. You will receive one and only one of these two for each replacement.
     */
    REPLACED_MESSAGE('U', "This message acknowledges the receipt and acceptance of a valid Replace Order Message. The data fields from the Replace Order Message are echoed back in this message. Note that the accepted values may differ from the entered values for some fields. You will receive one and only one of these two for each replacement."),

    /**
     * A Canceled Message informs you that an order has been reduced or canceled. This could be acknowledging a Cancel Order Message, or it could be the result of the order timing out or being canceled automatically.
     */
    CANCELED_MESSAGE('C', "A Canceled Message informs you that an order has been reduced or canceled. This could be acknowledging a Cancel Order Message, or it could be the result of the order timing out or being canceled automatically."),

    /**
     * Aiq Canceled Message
     */
    AIQ_CANCELED_MESSAGE('D', "Aiq Canceled Message"),

    /**
     * An Executed Order Message informs you that all or part of an order has been executed
     */
    EXECUTED_MESSAGE('E', "An Executed Order Message informs you that all or part of an order has been executed"),

    /**
     * A Broken Trade Message informs you that an execution has been broken. The trade is no longer good and will not clear. The reason for the break is given.
     */
    BROKEN_TRADE_MESSAGE('B', "A Broken Trade Message informs you that an execution has been broken. The trade is no longer good and will not clear. The reason for the break is given."),

    /**
     * A Rejected Message may be sent in response to an Enter Order Message or Replace Order Message if the order or replace cannot be accepted at this time. The reason for the rejection is given.
     */
    REJECTED_MESSAGE('J', "A Rejected Message may be sent in response to an Enter Order Message or Replace Order Message if the order or replace cannot be accepted at this time. The reason for the rejection is given."),

    /**
     * A Cancel Pending Message is sent in response to a cancel request for a cross order during a pre-cross late period signifying that it cannot be canceled at this time, but any unexecuted portion of this order will automatically be canceled immediately after the cross completes.
     */
    CANCEL_PENDING_MESSAGE('P', "A Cancel Pending Message is sent in response to a cancel request for a cross order during a pre-cross late period signifying that it cannot be canceled at this time, but any unexecuted portion of this order will automatically be canceled immediately after the cross completes."),

    /**
     * A Cancel Reject Message is sent in response to a partial cancel request (with non-zero “intended order size”) for a cross order during a pre-cross late period signifying that it cannot be partially canceled at this time. No automatic cancel will be scheduled for this order. Clients could repeat their request for any unexecuted portion of the order after the cross completes.
     */
    CANCEL_REJECT_MESSAGE('I', "A Cancel Reject Message is sent in response to a partial cancel request (with non-zero \u201Cintended order size\u201D) for a cross order during a pre-cross late period signifying that it cannot be partially canceled at this time. No automatic cancel will be scheduled for this order. Clients could repeat their request for any unexecuted portion of the order after the cross completes."),

    /**
     * A Priority Update Message is sent whenever priority of the order has been changed by the system.
     */
    ORDER_PRIORITY_UPDATE_MESSAGE('T', "A Priority Update Message is sent whenever priority of the order has been changed by the system."),

    /**
     * An Order Modified Message is sent in response to an order modify request.
     */
    ORDER_MODIFIED_MESSAGE('M', "An Order Modified Message is sent in response to an order modify request.");

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
            case 'A' -> Optional.of(ACCEPTED_MESSAGE);
            case 'U' -> Optional.of(REPLACED_MESSAGE);
            case 'C' -> Optional.of(CANCELED_MESSAGE);
            case 'D' -> Optional.of(AIQ_CANCELED_MESSAGE);
            case 'E' -> Optional.of(EXECUTED_MESSAGE);
            case 'B' -> Optional.of(BROKEN_TRADE_MESSAGE);
            case 'J' -> Optional.of(REJECTED_MESSAGE);
            case 'P' -> Optional.of(CANCEL_PENDING_MESSAGE);
            case 'I' -> Optional.of(CANCEL_REJECT_MESSAGE);
            case 'T' -> Optional.of(ORDER_PRIORITY_UPDATE_MESSAGE);
            case 'M' -> Optional.of(ORDER_MODIFIED_MESSAGE);
            default -> Optional.empty();
        };
    }
}
