package omi.tadawul.saudiexchange.basic.itch.v1_9.enums;

import java.util.Optional;

/**
 * 'P' for put, 'C' for call options. '&lt;space&gt;' for no put or call.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PutCall {

    /**
     * Put
     */
    PUT('P', "Put"),

    /**
     * Call
     */
    CALL('C', "Call"),

    /**
     * No Put Or Call
     */
    NO_PUT_OR_CALL(' ', "No Put Or Call");

    private final char wire;

    private final String description;

    PutCall(char wire, String description) {
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
    public static Optional<PutCall> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(PUT);
            case 'C' -> Optional.of(CALL);
            case ' ' -> Optional.of(NO_PUT_OR_CALL);
            default -> Optional.empty();
        };
    }
}
