package omi.nse.nsecd.snapshot.tbt.v7_1.enums;

import java.util.Optional;

/**
 * cMsgType. Code identifying message type [1, Char]
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ResponseMessageType {

    /**
     * Sent by the Orderbook Snapshot Recovery Server to indicate whether the request was processed successfully.
     */
    ORDER_BOOK_SNAPSHOT_RECOVERY_RESPONSE_MESSAGE('B', "Sent by the Orderbook Snapshot Recovery Server to indicate whether the request was processed successfully.");

    private final char wire;

    private final String description;

    ResponseMessageType(char wire, String description) {
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
    public static Optional<ResponseMessageType> fromWire(char wire) {
        return wire == 'B' ? Optional.of(ORDER_BOOK_SNAPSHOT_RECOVERY_RESPONSE_MESSAGE) : Optional.empty();
    }
}
