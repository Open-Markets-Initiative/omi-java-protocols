package omi.euronext.optiq.orderentrygateway.sbe.v1_3.enums;

import java.util.Optional;

/**
 * logonRejectCode
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LogonRejectCode {

    /**
     * Unknown_Connection_Identifier
     */
    UNKNOWN_CONNECTION_IDENTIFIER((short) 1, "Unknown_Connection_Identifier"),

    /**
     * System_unavailable
     */
    SYSTEMUNAVAILABLE((short) 2, "System_unavailable"),

    /**
     * Invalid_sequence_number
     */
    INVALIDSEQUENCENUMBER((short) 3, "Invalid_sequence_number"),

    /**
     * Client_session_already_logged_on
     */
    CLIENTSESSIONALREADYLOGGEDON((short) 4, "Client_session_already_logged_on"),

    /**
     * Client_session_disabled
     */
    CLIENTSESSIONDISABLED((short) 5, "Client_session_disabled"),

    /**
     * Invalid_Queueing_Indicator
     */
    INVALID_QUEUEING_INDICATOR((short) 6, "Invalid_Queueing_Indicator"),

    /**
     * Invalid_Logon_format
     */
    INVALID_LOGONFORMAT((short) 7, "Invalid_Logon_format");

    private final short wire;

    private final String description;

    LogonRejectCode(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<LogonRejectCode> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(UNKNOWN_CONNECTION_IDENTIFIER);
            case 2 -> Optional.of(SYSTEMUNAVAILABLE);
            case 3 -> Optional.of(INVALIDSEQUENCENUMBER);
            case 4 -> Optional.of(CLIENTSESSIONALREADYLOGGEDON);
            case 5 -> Optional.of(CLIENTSESSIONDISABLED);
            case 6 -> Optional.of(INVALID_QUEUEING_INDICATOR);
            case 7 -> Optional.of(INVALID_LOGONFORMAT);
            default -> Optional.empty();
        };
    }
}
