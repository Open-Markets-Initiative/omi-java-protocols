package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.enums;

import java.util.Optional;

/**
 * crossType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CrossType {

    /**
     * ALL_OR_NONE_CROSS
     */
    ALL_OR_NONE_CROSS((short) 1, "ALL_OR_NONE_CROSS"),

    /**
     * CROSS_EXECUTED_AGAINST_BOOK_FROM_CLIENT
     */
    CROSS_EXECUTED_AGAINST_BOOK_FROM_CLIENT((short) 4, "CROSS_EXECUTED_AGAINST_BOOK_FROM_CLIENT"),

    /**
     * crossType
     */
    NO_VALUE((short) 0, "crossType");

    private final short wire;

    private final String description;

    CrossType(short wire, String description) {
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
    public static Optional<CrossType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ALL_OR_NONE_CROSS);
            case 4 -> Optional.of(CROSS_EXECUTED_AGAINST_BOOK_FROM_CLIENT);
            case 0 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
