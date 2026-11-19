package omi.nse.nsecm.snapshot.tbt.v7_1.enums;

import java.util.Optional;

/**
 * Code identifying message type [1, Char]
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Outstanding normal order in the order book at the last snapshot refresh.
     */
    NEW_ORDER_MESSAGE('N', "Outstanding normal order in the order book at the last snapshot refresh."),

    /**
     * Outstanding spread order in the order book at the last snapshot refresh.
     */
    NEW_SPREAD_ORDER_MESSAGE('G', "Outstanding spread order in the order book at the last snapshot refresh.");

    private final char wire;

    private final String description;

    MessageType(char wire, String description) {
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
    public static Optional<MessageType> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(NEW_ORDER_MESSAGE);
            case 'G' -> Optional.of(NEW_SPREAD_ORDER_MESSAGE);
            default -> Optional.empty();
        };
    }
}
