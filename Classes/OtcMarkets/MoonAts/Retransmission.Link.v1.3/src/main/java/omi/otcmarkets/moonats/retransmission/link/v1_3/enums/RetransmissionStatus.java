package omi.otcmarkets.moonats.retransmission.link.v1_3.enums;

import java.util.Optional;

/**
 * "Y" - retransmission will follow as requested. "N" - request ignored. Field renamed from "Status" in the PDF to disambiguate from sibling Status fields.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RetransmissionStatus {

    /**
     * "Y" - retransmission will follow as requested.
     */
    WILL_FOLLOW((short) 89, "\"Y\" - retransmission will follow as requested."),

    /**
     * "N" - request ignored.
     */
    REQUEST_IGNORED((short) 78, "\"N\" - request ignored.");

    private final short wire;

    private final String description;

    RetransmissionStatus(short wire, String description) {
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
    public static Optional<RetransmissionStatus> fromWire(short wire) {
        return switch (wire) {
            case 89 -> Optional.of(WILL_FOLLOW);
            case 78 -> Optional.of(REQUEST_IGNORED);
            default -> Optional.empty();
        };
    }
}
