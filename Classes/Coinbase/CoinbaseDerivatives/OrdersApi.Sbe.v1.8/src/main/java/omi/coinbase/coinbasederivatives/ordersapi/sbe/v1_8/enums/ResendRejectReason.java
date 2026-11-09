package omi.coinbase.coinbasederivatives.ordersapi.sbe.v1_8.enums;

import java.util.Optional;

/**
 * rejectReason
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum ResendRejectReason {

    /**
     * BEGIN_EXEC_ID_TOO_SMALL
     */
    BEGIN_EXEC_ID_TOO_SMALL((byte) 1, "BEGIN_EXEC_ID_TOO_SMALL"),

    /**
     * END_EXEC_ID_TOO_LARGE
     */
    END_EXEC_ID_TOO_LARGE((byte) 2, "END_EXEC_ID_TOO_LARGE"),

    /**
     * RESEND_ALREADY_IN_PROGRESS
     */
    RESEND_ALREADY_IN_PROGRESS((byte) 3, "RESEND_ALREADY_IN_PROGRESS"),

    /**
     * TOO_MANY_RESEND_REQUESTS
     */
    TOO_MANY_RESEND_REQUESTS((byte) 4, "TOO_MANY_RESEND_REQUESTS"),

    /**
     * SERVER_ERROR
     */
    SERVER_ERROR((byte) 5, "SERVER_ERROR");

    private final byte wire;

    private final String description;

    ResendRejectReason(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<ResendRejectReason> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(BEGIN_EXEC_ID_TOO_SMALL);
            case 2 -> Optional.of(END_EXEC_ID_TOO_LARGE);
            case 3 -> Optional.of(RESEND_ALREADY_IN_PROGRESS);
            case 4 -> Optional.of(TOO_MANY_RESEND_REQUESTS);
            case 5 -> Optional.of(SERVER_ERROR);
            default -> Optional.empty();
        };
    }
}
