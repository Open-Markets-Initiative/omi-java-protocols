package omi.nse.nsecd.snapshot.tbt.v7_0.enums;

import java.util.Optional;

/**
 * Transcode of the message [2, Short]
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TransCode {

    /**
     * Transcode carried by every Mtbt order book snapshot buffer
     */
    ORDER_BOOK_SNAPSHOT((short) 10501, "Transcode carried by every Mtbt order book snapshot buffer");

    private final short wire;

    private final String description;

    TransCode(short wire, String description) {
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
    public static Optional<TransCode> fromWire(short wire) {
        return wire == 10501 ? Optional.of(ORDER_BOOK_SNAPSHOT) : Optional.empty();
    }
}
