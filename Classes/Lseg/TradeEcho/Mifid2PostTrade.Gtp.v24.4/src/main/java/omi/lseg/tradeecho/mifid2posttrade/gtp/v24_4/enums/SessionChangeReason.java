package omi.lseg.tradeecho.mifid2posttrade.gtp.v24_4.enums;

import java.util.Optional;

/**
 * Session Change Reason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SessionChangeReason {

    /**
     * Scheduled Transition
     */
    SCHEDULED_TRANSITION((short) 0, "Scheduled Transition");

    private final short wire;

    private final String description;

    SessionChangeReason(short wire, String description) {
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
    public static Optional<SessionChangeReason> fromWire(short wire) {
        return wire == 0 ? Optional.of(SCHEDULED_TRANSITION) : Optional.empty();
    }
}
