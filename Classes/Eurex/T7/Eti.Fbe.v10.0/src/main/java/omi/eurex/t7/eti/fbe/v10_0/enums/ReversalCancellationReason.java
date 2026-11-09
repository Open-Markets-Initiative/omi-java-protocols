package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the ReversalCancellationReason values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ReversalCancellationReason {

    /**
     * TES Activity State Change
     */
    TAS_CHANGE((short) 1, "TES Activity State Change"),

    /**
     * Instrument Expiration
     */
    INTRADAY_EXPIRATION((short) 2, "Instrument Expiration"),

    /**
     * Instrument Deletion
     */
    INSTRUMENT_DELETION((short) 3, "Instrument Deletion"),

    /**
     * Instrument Suspension
     */
    INSTRUMENT_SUSPENSION((short) 4, "Instrument Suspension"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    ReversalCancellationReason(short wire, String description) {
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
    public static Optional<ReversalCancellationReason> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(TAS_CHANGE);
            case 2 -> Optional.of(INTRADAY_EXPIRATION);
            case 3 -> Optional.of(INSTRUMENT_DELETION);
            case 4 -> Optional.of(INSTRUMENT_SUSPENSION);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
