package omi.bme.bmeequities.marketandorder.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Confirmation type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ExecType {

    /**
     * New Order Confirmation
     */
    NEW_ORDER_CONFIRMATION('A', "New Order Confirmation"),

    /**
     * Order Cancellation
     */
    ORDER_CANCELLATION('B', "Order Cancellation"),

    /**
     * Order Refresh Due To Change Of Book
     */
    ORDER_REFRESH_DUE_TO_CHANGE_OF_BOOK('C', "Order Refresh Due To Change Of Book"),

    /**
     * Order Modification
     */
    ORDER_MODIFICATION('M', "Order Modification"),

    /**
     * Order Modification Deleting Intermediated Member
     */
    ORDER_MODIFICATION_DELETING_INTERMEDIATED_MEMBER('G', "Order Modification Deleting Intermediated Member"),

    /**
     * Order Modification Changing Intermediated Member
     */
    ORDER_MODIFICATION_CHANGING_INTERMEDIATED_MEMBER('F', "Order Modification Changing Intermediated Member"),

    /**
     * Order Refresh
     */
    ORDER_REFRESH('R', "Order Refresh"),

    /**
     * Stop Order Triggered At The Close Order Activation
     */
    STOP_ORDER_TRIGGERED_AT_THE_CLOSE_ORDER_ACTIVATION('D', "Stop Order Triggered At The Close Order Activation"),

    /**
     * Order Rejection
     */
    ORDER_REJECTION('8', "Order Rejection"),

    /**
     * Order Pending Validation
     */
    ORDER_PENDING_VALIDATION('N', "Order Pending Validation"),

    /**
     * Order Modification Pending Validation
     */
    ORDER_MODIFICATION_PENDING_VALIDATION('P', "Order Modification Pending Validation"),

    /**
     * Order Refresh Due To New Display Qty
     */
    ORDER_REFRESH_DUE_TO_NEW_DISPLAY_QTY('V', "Order Refresh Due To New Display Qty"),

    /**
     * Beginning Of Day Order Refresh
     */
    BEGINNING_OF_DAY_ORDER_REFRESH('I', "Beginning Of Day Order Refresh"),

    /**
     * Expired Order
     */
    EXPIRED_ORDER('X', "Expired Order"),

    /**
     * Order Status
     */
    ORDER_STATUS('W', "Order Status");

    private final char wire;

    private final String description;

    ExecType(char wire, String description) {
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
    public static Optional<ExecType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NEW_ORDER_CONFIRMATION);
            case 'B' -> Optional.of(ORDER_CANCELLATION);
            case 'C' -> Optional.of(ORDER_REFRESH_DUE_TO_CHANGE_OF_BOOK);
            case 'M' -> Optional.of(ORDER_MODIFICATION);
            case 'G' -> Optional.of(ORDER_MODIFICATION_DELETING_INTERMEDIATED_MEMBER);
            case 'F' -> Optional.of(ORDER_MODIFICATION_CHANGING_INTERMEDIATED_MEMBER);
            case 'R' -> Optional.of(ORDER_REFRESH);
            case 'D' -> Optional.of(STOP_ORDER_TRIGGERED_AT_THE_CLOSE_ORDER_ACTIVATION);
            case '8' -> Optional.of(ORDER_REJECTION);
            case 'N' -> Optional.of(ORDER_PENDING_VALIDATION);
            case 'P' -> Optional.of(ORDER_MODIFICATION_PENDING_VALIDATION);
            case 'V' -> Optional.of(ORDER_REFRESH_DUE_TO_NEW_DISPLAY_QTY);
            case 'I' -> Optional.of(BEGINNING_OF_DAY_ORDER_REFRESH);
            case 'X' -> Optional.of(EXPIRED_ORDER);
            case 'W' -> Optional.of(ORDER_STATUS);
            default -> Optional.empty();
        };
    }
}
