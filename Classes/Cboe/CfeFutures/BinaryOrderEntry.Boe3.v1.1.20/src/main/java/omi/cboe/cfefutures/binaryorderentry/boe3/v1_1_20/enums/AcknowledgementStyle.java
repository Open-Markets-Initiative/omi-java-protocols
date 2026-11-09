package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.enums;

import java.util.Optional;

/**
 * Acknowledgement Style
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AcknowledgementStyle {

    /**
     * Order Cancelled Messages Are Sent For Each Cancelled Order
     */
    ORDER_CANCELLED_MESSAGES_ARE_SENT_FOR_EACH_CANCELLED_ORDER('M', "Order Cancelled Messages Are Sent For Each Cancelled Order"),

    /**
     * A Single Mass Cancel Acknowledgement Message Is Sent
     */
    A_SINGLE_MASS_CANCEL_ACKNOWLEDGEMENT_MESSAGE_IS_SENT('S', "A Single Mass Cancel Acknowledgement Message Is Sent"),

    /**
     * Both Individual Order Cancelled And Mass Cancel Acknowledgement Messages Will Be Sent
     */
    BOTH_INDIVIDUAL_ORDER_CANCELLED_AND_MASS_CANCEL_ACKNOWLEDGEMENT_MESSAGES_WILL_BE_SENT('B', "Both Individual Order Cancelled And Mass Cancel Acknowledgement Messages Will Be Sent");

    private final char wire;

    private final String description;

    AcknowledgementStyle(char wire, String description) {
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
    public static Optional<AcknowledgementStyle> fromWire(char wire) {
        return switch (wire) {
            case 'M' -> Optional.of(ORDER_CANCELLED_MESSAGES_ARE_SENT_FOR_EACH_CANCELLED_ORDER);
            case 'S' -> Optional.of(A_SINGLE_MASS_CANCEL_ACKNOWLEDGEMENT_MESSAGE_IS_SENT);
            case 'B' -> Optional.of(BOTH_INDIVIDUAL_ORDER_CANCELLED_AND_MASS_CANCEL_ACKNOWLEDGEMENT_MESSAGES_WILL_BE_SENT);
            default -> Optional.empty();
        };
    }
}
