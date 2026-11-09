package omi.miax.pearlequities.expressorders.meo.v2_6.enums;

import java.util.Optional;

/**
 * Cancel Status
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CancelStatus {

    /**
     * Successful
     */
    SUCCESSFUL(' ', "Successful"),

    /**
     * Duplicate Client Order Id
     */
    DUPLICATE_CLIENT_ORDER_ID('A', "Duplicate Client Order Id"),

    /**
     * Not In Live Order Window
     */
    NOT_IN_LIVE_ORDER_WINDOW('B', "Not In Live Order Window"),

    /**
     * Matching Engine Is Not Available
     */
    MATCHING_ENGINE_IS_NOT_AVAILABLE('C', "Matching Engine Is Not Available"),

    /**
     * Cannot Find Order With Target Client Order Id
     */
    CANNOT_FIND_ORDER_WITH_TARGET_CLIENT_ORDER_ID('D', "Cannot Find Order With Target Client Order Id"),

    /**
     * Exceeded Test Symbol Throttle
     */
    EXCEEDED_TEST_SYMBOL_THROTTLE('E', "Exceeded Test Symbol Throttle"),

    /**
     * Order Is Routed
     */
    ORDER_IS_ROUTED('F', "Order Is Routed"),

    /**
     * Invalid Mpid
     */
    INVALID_MPID('I', "Invalid Mpid"),

    /**
     * Invalid Client Order Id
     */
    INVALID_CLIENT_ORDER_ID('O', "Invalid Client Order Id"),

    /**
     * Request Is Not Permitted For This Session
     */
    REQUEST_IS_NOT_PERMITTED_FOR_THIS_SESSION('P', "Request Is Not Permitted For This Session"),

    /**
     * Specified Mpid Does Not Match Target Order
     */
    SPECIFIED_MPID_DOES_NOT_MATCH_TARGET_ORDER('Q', "Specified Mpid Does Not Match Target Order"),

    /**
     * Invalid Symbol Id
     */
    INVALID_SYMBOL_ID('S', "Invalid Symbol Id"),

    /**
     * Invalid Target Client Order Id
     */
    INVALID_TARGET_CLIENT_ORDER_ID('T', "Invalid Target Client Order Id"),

    /**
     * Mpid Not Permitted
     */
    MPID_NOT_PERMITTED('X', "Mpid Not Permitted"),

    /**
     * Undefined Reason
     */
    UNDEFINED_REASON('Z', "Undefined Reason"),

    /**
     * Modification Request Is Sent To Another Market And Pending Completion
     */
    MODIFICATION_REQUEST_IS_SENT_TO_ANOTHER_MARKET_AND_PENDING_COMPLETION('c', "Modification Request Is Sent To Another Market And Pending Completion"),

    /**
     * Downgraded From Older Version
     */
    DOWNGRADED_FROM_OLDER_VERSION('*', "Downgraded From Older Version");

    private final char wire;

    private final String description;

    CancelStatus(char wire, String description) {
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
    public static Optional<CancelStatus> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(SUCCESSFUL);
            case 'A' -> Optional.of(DUPLICATE_CLIENT_ORDER_ID);
            case 'B' -> Optional.of(NOT_IN_LIVE_ORDER_WINDOW);
            case 'C' -> Optional.of(MATCHING_ENGINE_IS_NOT_AVAILABLE);
            case 'D' -> Optional.of(CANNOT_FIND_ORDER_WITH_TARGET_CLIENT_ORDER_ID);
            case 'E' -> Optional.of(EXCEEDED_TEST_SYMBOL_THROTTLE);
            case 'F' -> Optional.of(ORDER_IS_ROUTED);
            case 'I' -> Optional.of(INVALID_MPID);
            case 'O' -> Optional.of(INVALID_CLIENT_ORDER_ID);
            case 'P' -> Optional.of(REQUEST_IS_NOT_PERMITTED_FOR_THIS_SESSION);
            case 'Q' -> Optional.of(SPECIFIED_MPID_DOES_NOT_MATCH_TARGET_ORDER);
            case 'S' -> Optional.of(INVALID_SYMBOL_ID);
            case 'T' -> Optional.of(INVALID_TARGET_CLIENT_ORDER_ID);
            case 'X' -> Optional.of(MPID_NOT_PERMITTED);
            case 'Z' -> Optional.of(UNDEFINED_REASON);
            case 'c' -> Optional.of(MODIFICATION_REQUEST_IS_SENT_TO_ANOTHER_MARKET_AND_PENDING_COMPLETION);
            case '*' -> Optional.of(DOWNGRADED_FROM_OLDER_VERSION);
            default -> Optional.empty();
        };
    }
}
