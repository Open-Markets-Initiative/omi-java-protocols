package omi.cboe.c2options.binaryorderentry.boe3.v1_0_10.enums;

import java.util.Optional;

/**
 * When sending Cboe native symbology, set PutOrCall to ASCII NUL (0x00)
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PutOrCall {

    /**
     * Put
     */
    PUT('0', "Put"),

    /**
     * Call
     */
    CALL('1', "Call");

    private final char wire;

    private final String description;

    PutOrCall(char wire, String description) {
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
    public static Optional<PutOrCall> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(PUT);
            case '1' -> Optional.of(CALL);
            default -> Optional.empty();
        };
    }
}
