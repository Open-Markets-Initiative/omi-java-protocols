package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.enums;

import java.util.Optional;

/**
 * crossedIndicator
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum CrossedIndicator {

    /**
     * STRUCTURED_TRANSACTION
     */
    STRUCTURED_TRANSACTION(1001, "STRUCTURED_TRANSACTION"),

    /**
     * OPERATIONAL_ERROR
     */
    OPERATIONAL_ERROR(1002, "OPERATIONAL_ERROR"),

    /**
     * TWAP_VWAP
     */
    TWAP_VWAP(1003, "TWAP_VWAP"),

    /**
     * crossedIndicator
     */
    NO_VALUE(0, "crossedIndicator");

    private final int wire;

    private final String description;

    CrossedIndicator(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<CrossedIndicator> fromWire(int wire) {
        return switch (wire) {
            case 1001 -> Optional.of(STRUCTURED_TRANSACTION);
            case 1002 -> Optional.of(OPERATIONAL_ERROR);
            case 1003 -> Optional.of(TWAP_VWAP);
            case 0 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
