package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * System Event Messages signal events that affect the entire Nasdaq Canada system.
     */
    SYSTEM_EVENT_MESSAGE('S', "System Event Messages signal events that affect the entire Nasdaq Canada system."),

    /**
     * This message acknowledges the receipt and acceptance of a valid Enter Order Message. The data fields from the Enter Order Message are echoed back in this message. When the Order State is Order Dead (D) the order was accepted and automatically canceled and no additional messages will be received for it.
     */
    ORDER_ACCEPTED_MESSAGE('A', "This message acknowledges the receipt and acceptance of a valid Enter Order Message. The data fields from the Enter Order Message are echoed back in this message. When the Order State is Order Dead (D) the order was accepted and automatically canceled and no additional messages will be received for it."),

    /**
     * This message acknowledges the receipt and acceptance of a valid Replace Order Message. The data fields from the Replace Order Message are echoed back in this message. The OrderQty indicates how many shares were left exposed when the replacement completed.
     */
    ORDER_REPLACED_MESSAGE('U', "This message acknowledges the receipt and acceptance of a valid Replace Order Message. The data fields from the Replace Order Message are echoed back in this message. The OrderQty indicates how many shares were left exposed when the replacement completed."),

    /**
     * A Canceled Message informs you that an order has been reduced or canceled. This could be acknowledging a Cancel Order Message, or it could be the result of the order timing out or being canceled automatically.
     */
    ORDER_CANCELED_MESSAGE('C', "A Canceled Message informs you that an order has been reduced or canceled. This could be acknowledging a Cancel Order Message, or it could be the result of the order timing out or being canceled automatically."),

    /**
     * STP Canceled Message
     */
    STP_CANCELED_MESSAGE('D', "STP Canceled Message"),

    /**
     * An Executed Order Message informs you that all or part of an order has been executed.
     */
    ORDER_EXECUTED_MESSAGE('E', "An Executed Order Message informs you that all or part of an order has been executed."),

    /**
     * A Corrected Trade Message informs you that an execution has been corrected. The corrected trade details are provided in the message. You will always get an Executed Order Message prior to getting a Corrected Trade Message for a given execution. If no Optional Appendage fields are present, the Appendage Length will be set to 0.
     */
    CORRECTED_TRADE_MESSAGE('B', "A Corrected Trade Message informs you that an execution has been corrected. The corrected trade details are provided in the message. You will always get an Executed Order Message prior to getting a Corrected Trade Message for a given execution. If no Optional Appendage fields are present, the Appendage Length will be set to 0."),

    /**
     * Rejected Order Message
     */
    REJECTED_ORDER_MESSAGE('J', "Rejected Order Message"),

    /**
     * Cancel Reject Message
     */
    CANCEL_REJECT_MESSAGE('I', "Cancel Reject Message"),

    /**
     * The Order Restated Message is sent to indicate that the system has modified an order as part of its order management.
     */
    ORDER_RESTATED_MESSAGE('R', "The Order Restated Message is sent to indicate that the system has modified an order as part of its order management."),

    /**
     * The Account Query Response message is sent in response to an Account Query Request to indicate the next available UserRefNum that can be used to identify new transactions. It only carries the Appendage Length and Optional Appendage fields if the Appendage Length was specified on the inbound message.
     */
    ACCOUNT_QUERY_RESPONSE_MESSAGE('Q', "The Account Query Response message is sent in response to an Account Query Request to indicate the next available UserRefNum that can be used to identify new transactions. It only carries the Appendage Length and Optional Appendage fields if the Appendage Length was specified on the inbound message.");

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
            case 'C' -> Optional.of(ORDER_CANCELED_MESSAGE);
            case 'D' -> Optional.of(STP_CANCELED_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 'B' -> Optional.of(CORRECTED_TRADE_MESSAGE);
            case 'J' -> Optional.of(REJECTED_ORDER_MESSAGE);
            case 'I' -> Optional.of(CANCEL_REJECT_MESSAGE);
            case 'R' -> Optional.of(ORDER_RESTATED_MESSAGE);
            case 'Q' -> Optional.of(ACCOUNT_QUERY_RESPONSE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
