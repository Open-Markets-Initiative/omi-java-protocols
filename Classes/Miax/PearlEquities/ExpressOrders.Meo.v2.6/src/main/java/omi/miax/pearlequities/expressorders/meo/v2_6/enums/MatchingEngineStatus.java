package omi.miax.pearlequities.expressorders.meo.v2_6.enums;

import java.util.Optional;

/**
 * Status response for the Mass Cancel Request from the Matching Engine
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MatchingEngineStatus {

    /**
     * Successful
     */
    SUCCESSFUL(' ', "Successful"),

    /**
     * Invalid Mpid
     */
    INVALID_MPID('I', "Invalid Mpid"),

    /**
     * Mpid Not Permitted
     */
    MPID_NOT_PERMITTED('X', "Mpid Not Permitted"),

    /**
     * Request Is Not Permitted For This Session
     */
    REQUEST_IS_NOT_PERMITTED_FOR_THIS_SESSION('P', "Request Is Not Permitted For This Session"),

    /**
     * Invalid Scope
     */
    INVALID_SCOPE('R', "Invalid Scope"),

    /**
     * Invalid Action
     */
    INVALID_ACTION('A', "Invalid Action"),

    /**
     * Matching Engine Not Available
     */
    MATCHING_ENGINE_NOT_AVAILABLE('C', "Matching Engine Not Available"),

    /**
     * State Of The Request For This Matching Engine
     */
    STATE_OF_THE_REQUEST_FOR_THIS_MATCHING_ENGINE('U', "State Of The Request For This Matching Engine"),

    /**
     * Invalid Client Order Id
     */
    INVALID_CLIENT_ORDER_ID('O', "Invalid Client Order Id"),

    /**
     * Undefined Reason
     */
    UNDEFINED_REASON('Z', "Undefined Reason"),

    /**
     * Invalid Purge Group Specified
     */
    INVALID_PURGE_GROUP_SPECIFIED('6', "Invalid Purge Group Specified"),

    /**
     * Downgraded From Older Version
     */
    DOWNGRADED_FROM_OLDER_VERSION('*', "Downgraded From Older Version");

    private final char wire;

    private final String description;

    MatchingEngineStatus(char wire, String description) {
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
    public static Optional<MatchingEngineStatus> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(SUCCESSFUL);
            case 'I' -> Optional.of(INVALID_MPID);
            case 'X' -> Optional.of(MPID_NOT_PERMITTED);
            case 'P' -> Optional.of(REQUEST_IS_NOT_PERMITTED_FOR_THIS_SESSION);
            case 'R' -> Optional.of(INVALID_SCOPE);
            case 'A' -> Optional.of(INVALID_ACTION);
            case 'C' -> Optional.of(MATCHING_ENGINE_NOT_AVAILABLE);
            case 'U' -> Optional.of(STATE_OF_THE_REQUEST_FOR_THIS_MATCHING_ENGINE);
            case 'O' -> Optional.of(INVALID_CLIENT_ORDER_ID);
            case 'Z' -> Optional.of(UNDEFINED_REASON);
            case '6' -> Optional.of(INVALID_PURGE_GROUP_SPECIFIED);
            case '*' -> Optional.of(DOWNGRADED_FROM_OLDER_VERSION);
            default -> Optional.empty();
        };
    }
}
