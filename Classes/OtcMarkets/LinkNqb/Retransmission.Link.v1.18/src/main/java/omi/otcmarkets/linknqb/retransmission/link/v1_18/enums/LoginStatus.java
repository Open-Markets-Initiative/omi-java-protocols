package omi.otcmarkets.linknqb.retransmission.link.v1_18.enums;

import java.util.Optional;

/**
 * Always "Y". If it is an invalid userid, system will close socket after 5 seconds without sending back a login response. Field renamed from "Status" in the PDF to disambiguate from sibling Status fields.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LoginStatus {

    /**
     * "Y" - login accepted.
     */
    ACCEPTED((short) 89, "\"Y\" - login accepted.");

    private final short wire;

    private final String description;

    LoginStatus(short wire, String description) {
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
    public static Optional<LoginStatus> fromWire(short wire) {
        return wire == 89 ? Optional.of(ACCEPTED) : Optional.empty();
    }
}
