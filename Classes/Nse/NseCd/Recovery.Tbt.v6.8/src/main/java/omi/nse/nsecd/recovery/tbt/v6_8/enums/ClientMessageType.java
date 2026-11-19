package omi.nse.nsecd.recovery.tbt.v6_8.enums;

import java.util.Optional;

/**
 * cMsgType. Code identifying message type [1, Char]
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ClientMessageType {

    /**
     * Sent to the Recovery Server whenever tick data is missed.
     */
    TICK_DATA_RECOVERY_REQUEST_MESSAGE('R', "Sent to the Recovery Server whenever tick data is missed.");

    private final char wire;

    private final String description;

    ClientMessageType(char wire, String description) {
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
    public static Optional<ClientMessageType> fromWire(char wire) {
        return wire == 'R' ? Optional.of(TICK_DATA_RECOVERY_REQUEST_MESSAGE) : Optional.empty();
    }
}
