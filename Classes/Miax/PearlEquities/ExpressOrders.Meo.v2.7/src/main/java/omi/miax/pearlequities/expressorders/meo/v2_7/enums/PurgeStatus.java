package omi.miax.pearlequities.expressorders.meo.v2_7.enums;

import java.util.Optional;

/**
 * Status of this request
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PurgeStatus {

    /**
     * Successful
     */
    SUCCESSFUL(' ', "Successful"),

    /**
     * Matching Engine Is Not Available
     */
    MATCHING_ENGINE_IS_NOT_AVAILABLE('C', "Matching Engine Is Not Available"),

    /**
     * Exceeded Test Symbol Throttle
     */
    EXCEEDED_TEST_SYMBOL_THROTTLE('E', "Exceeded Test Symbol Throttle"),

    /**
     * Invalid Mpid
     */
    INVALID_MPID('I', "Invalid Mpid"),

    /**
     * Invalid Price
     */
    INVALID_PRICE('J', "Invalid Price"),

    /**
     * Invalid Client Order Id
     */
    INVALID_CLIENT_ORDER_ID('O', "Invalid Client Order Id"),

    /**
     * Request Is Not Permitted For This Session
     */
    REQUEST_IS_NOT_PERMITTED_FOR_THIS_SESSION('P', "Request Is Not Permitted For This Session"),

    /**
     * Invalid Symbol Id
     */
    INVALID_SYMBOL_ID('S', "Invalid Symbol Id"),

    /**
     * Mpid Not Permitted
     */
    MPID_NOT_PERMITTED('X', "Mpid Not Permitted"),

    /**
     * Undefined Reason
     */
    UNDEFINED_REASON('Z', "Undefined Reason"),

    /**
     * Downgraded From Older Version
     */
    DOWNGRADED_FROM_OLDER_VERSION('*', "Downgraded From Older Version");

    private final char wire;

    private final String description;

    PurgeStatus(char wire, String description) {
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
    public static Optional<PurgeStatus> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(SUCCESSFUL);
            case 'C' -> Optional.of(MATCHING_ENGINE_IS_NOT_AVAILABLE);
            case 'E' -> Optional.of(EXCEEDED_TEST_SYMBOL_THROTTLE);
            case 'I' -> Optional.of(INVALID_MPID);
            case 'J' -> Optional.of(INVALID_PRICE);
            case 'O' -> Optional.of(INVALID_CLIENT_ORDER_ID);
            case 'P' -> Optional.of(REQUEST_IS_NOT_PERMITTED_FOR_THIS_SESSION);
            case 'S' -> Optional.of(INVALID_SYMBOL_ID);
            case 'X' -> Optional.of(MPID_NOT_PERMITTED);
            case 'Z' -> Optional.of(UNDEFINED_REASON);
            case '*' -> Optional.of(DOWNGRADED_FROM_OLDER_VERSION);
            default -> Optional.empty();
        };
    }
}
