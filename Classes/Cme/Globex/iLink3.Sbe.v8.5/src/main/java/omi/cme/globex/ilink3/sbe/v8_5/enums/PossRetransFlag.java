package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Flags message as possible retransmission. This will convey whether a message is an original transmission or duplicate in response to RetransmissionRequest. This will become pertinent when original messages get interleaved with Retransmission responses
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PossRetransFlag {

    /**
     * False, No
     */
    FALSE((short) 0, "False, No"),

    /**
     * True, Yes
     */
    TRUE((short) 1, "True, Yes");

    private final short wire;

    private final String description;

    PossRetransFlag(short wire, String description) {
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
    public static Optional<PossRetransFlag> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(FALSE);
            case 1 -> Optional.of(TRUE);
            default -> Optional.empty();
        };
    }
}
