package omi.miax.pearlequities.expressorders.meo.v2_6.enums;

import java.util.Optional;

/**
 * Login Status
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LoginStatus {

    /**
     * Successful
     */
    SUCCESSFUL(' ', "Successful"),

    /**
     * Invalid trading session requested for the Matching Engine
     */
    INVALID_TRADING_SESSION_REQUESTED('S', "Invalid trading session requested for the Matching Engine"),

    /**
     * Invalid start sequence number requested for the Matching Engine
     */
    INVALID_START_SEQUENCE_NUMBER_REQUESTED('N', "Invalid start sequence number requested for the Matching Engine"),

    /**
     * No active trading session exists for the Matching Engine, Matching Engine unavailable
     */
    NO_ACTIVE_TRADING_SESSION_EXISTS('U', "No active trading session exists for the Matching Engine, Matching Engine unavailable"),

    /**
     * Invalid Username/Computer ID combination
     */
    REJECTED('X', "Invalid Username/Computer ID combination"),

    /**
     * Incompatible Session protocol version
     */
    INCOMPATIBLE_SESSION_PROTOCOL_VERSION('I', "Incompatible Session protocol version"),

    /**
     * Incompatible Application protocol version
     */
    INCOMPATIBLE_APPLICATION_PROTOCOL_VERSION('A', "Incompatible Application protocol version"),

    /**
     * Invalid Number of Matching Engines specified in Login Request
     */
    INVALID_NUMBER_OF_MATCHING_ENGINES_SPECIFIED_IN_LOGIN_REQUEST('C', "Invalid Number of Matching Engines specified in Login Request"),

    /**
     * Request rejected because client already logged in
     */
    REQUEST_REJECTED_BECAUSE_CLIENT_ALREADY_LOGGED_IN('L', "Request rejected because client already logged in");

    private final char wire;

    private final String description;

    LoginStatus(char wire, String description) {
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
    public static Optional<LoginStatus> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(SUCCESSFUL);
            case 'S' -> Optional.of(INVALID_TRADING_SESSION_REQUESTED);
            case 'N' -> Optional.of(INVALID_START_SEQUENCE_NUMBER_REQUESTED);
            case 'U' -> Optional.of(NO_ACTIVE_TRADING_SESSION_EXISTS);
            case 'X' -> Optional.of(REJECTED);
            case 'I' -> Optional.of(INCOMPATIBLE_SESSION_PROTOCOL_VERSION);
            case 'A' -> Optional.of(INCOMPATIBLE_APPLICATION_PROTOCOL_VERSION);
            case 'C' -> Optional.of(INVALID_NUMBER_OF_MATCHING_ENGINES_SPECIFIED_IN_LOGIN_REQUEST);
            case 'L' -> Optional.of(REQUEST_REJECTED_BECAUSE_CLIENT_ALREADY_LOGGED_IN);
            default -> Optional.empty();
        };
    }
}
