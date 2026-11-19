package omi.asianext.asianextderivatives.replay.amd.v1_3.enums;

import java.util.Optional;

/**
 * Replay response code
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ResponseCode {

    /**
     * Login Successful
     */
    LOGIN_SUCCESSFUL((short) 0, "Login Successful"),

    /**
     * Bad Begin Seq No In Resend Request
     */
    BAD_BEGIN_SEQ_NO_IN_RESEND_REQUEST((short) 1, "Bad Begin Seq No In Resend Request"),

    /**
     * Bad End Seq No In Resend Request
     */
    BAD_END_SEQ_NO_IN_RESEND_REQUEST((short) 2, "Bad End Seq No In Resend Request"),

    /**
     * Max replay quota encountered. Please indicate smaller range in request
     */
    MAX_REPLAY_QUOTA_ENCOUNTERED((short) 3, "Max replay quota encountered. Please indicate smaller range in request");

    private final short wire;

    private final String description;

    ResponseCode(short wire, String description) {
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
    public static Optional<ResponseCode> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(LOGIN_SUCCESSFUL);
            case 1 -> Optional.of(BAD_BEGIN_SEQ_NO_IN_RESEND_REQUEST);
            case 2 -> Optional.of(BAD_END_SEQ_NO_IN_RESEND_REQUEST);
            case 3 -> Optional.of(MAX_REPLAY_QUOTA_ENCOUNTERED);
            default -> Optional.empty();
        };
    }
}
