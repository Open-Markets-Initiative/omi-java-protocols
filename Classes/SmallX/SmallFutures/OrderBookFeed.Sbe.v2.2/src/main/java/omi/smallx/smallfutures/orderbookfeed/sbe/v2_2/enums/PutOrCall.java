package omi.smallx.smallfutures.orderbookfeed.sbe.v2_2.enums;

import java.util.Optional;

/**
 * Option put/call flag
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PutOrCall {

    /**
     * PUT
     */
    PUT('P', "PUT"),

    /**
     * CALL
     */
    CALL('C', "CALL"),

    /**
     * Not option (for futures)
     */
    NOT_OPTION('N', "Not option (for futures)");

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
            case 'P' -> Optional.of(PUT);
            case 'C' -> Optional.of(CALL);
            case 'N' -> Optional.of(NOT_OPTION);
            default -> Optional.empty();
        };
    }
}
