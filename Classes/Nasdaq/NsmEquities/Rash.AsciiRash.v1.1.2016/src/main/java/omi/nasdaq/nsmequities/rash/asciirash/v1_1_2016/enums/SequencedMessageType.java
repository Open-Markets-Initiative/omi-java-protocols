package omi.nasdaq.nsmequities.rash.asciirash.v1_1_2016.enums;

import java.util.Optional;

/**
 * Code identifying the RASH outbound message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * System Event Messages signal events that affect the entire system.
     */
    SYSTEM_EVENT_MESSAGE('S', "System Event Messages signal events that affect the entire system."),

    /**
     * An Accepted Order Message acknowledges the receipt of a valid Enter Order Message. The data fields from the Enter Order Message are echoed back; the accepted values may differ from the entered values for some fields.
     */
    ACCEPTED_ORDER_MESSAGE('A', "An Accepted Order Message acknowledges the receipt of a valid Enter Order Message. The data fields from the Enter Order Message are echoed back; the accepted values may differ from the entered values for some fields."),

    /**
     * Similar to the regular Accepted Order Message, with the additional information provided upon order entry using the Enter Order Message with Cross Functionality.
     */
    ACCEPTED_ORDER_MESSAGE_WITH_CROSS_FUNCTIONALITY('R', "Similar to the regular Accepted Order Message, with the additional information provided upon order entry using the Enter Order Message with Cross Functionality."),

    /**
     * A Canceled Order Message informs you that an order has been reduced or canceled. Canceled shares reflect the number of shares that are out.
     */
    CANCELED_ORDER_MESSAGE('C', "A Canceled Order Message informs you that an order has been reduced or canceled. Canceled shares reflect the number of shares that are out."),

    /**
     * A Rejected Order Message may be sent in response to an Enter Order Message if the order cannot be accepted at this time. The Token of a rejected order cannot be re-used.
     */
    REJECTED_ORDER_MESSAGE('J', "A Rejected Order Message may be sent in response to an Enter Order Message if the order cannot be accepted at this time. The Token of a rejected order cannot be re-used."),

    /**
     * An Executed Order Message informs you that all or part of an order has been executed.
     */
    EXECUTED_ORDER_MESSAGE('E', "An Executed Order Message informs you that all or part of an order has been executed."),

    /**
     * A Broken Trade Message informs you that an execution has been broken. The trade is no longer good and will not clear.
     */
    BROKEN_TRADE_MESSAGE('B', "A Broken Trade Message informs you that an execution has been broken. The trade is no longer good and will not clear."),

    /**
     * Informs you that all or part of an order has been executed, with the reference price associated with the execution.
     */
    EXECUTED_WITH_REFERENCE_PRICE_MESSAGE('G', "Informs you that all or part of an order has been executed, with the reference price associated with the execution."),

    /**
     * A Trade Correction Message informs you that there has been a change to an execution.
     */
    TRADE_CORRECTION_MESSAGE('F', "A Trade Correction Message informs you that there has been a change to an execution.");

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
            case 'A' -> Optional.of(ACCEPTED_ORDER_MESSAGE);
            case 'R' -> Optional.of(ACCEPTED_ORDER_MESSAGE_WITH_CROSS_FUNCTIONALITY);
            case 'C' -> Optional.of(CANCELED_ORDER_MESSAGE);
            case 'J' -> Optional.of(REJECTED_ORDER_MESSAGE);
            case 'E' -> Optional.of(EXECUTED_ORDER_MESSAGE);
            case 'B' -> Optional.of(BROKEN_TRADE_MESSAGE);
            case 'G' -> Optional.of(EXECUTED_WITH_REFERENCE_PRICE_MESSAGE);
            case 'F' -> Optional.of(TRADE_CORRECTION_MESSAGE);
            default -> Optional.empty();
        };
    }
}
