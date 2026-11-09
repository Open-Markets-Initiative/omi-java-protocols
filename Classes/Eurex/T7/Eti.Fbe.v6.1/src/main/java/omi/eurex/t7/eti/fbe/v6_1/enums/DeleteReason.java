package omi.eurex.t7.eti.fbe.v6_1.enums;

import java.util.Optional;

/**
 * Defines the DeleteReason values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum DeleteReason {

    /**
     * Deletion via the TES Delete Request
     */
    NOSPECIALREASON((short) 100, "Deletion via the TES Delete Request"),

    /**
     * Automatic deletion due to TES Activity State Change
     */
    TAS_CHANGE((short) 101, "Automatic deletion due to TES Activity State Change"),

    /**
     * Automatic deletion due to instrument expiration
     */
    INTRADAY_EXPIRATION((short) 102, "Automatic deletion due to instrument expiration"),

    /**
     * Deletion caused by Clearing/Risk stop
     */
    RISK_EVENT((short) 103, "Deletion caused by Clearing/Risk stop"),

    /**
     * Deletion caused by Trading stop
     */
    STOP_TRADING((short) 104, "Deletion caused by Trading stop"),

    /**
     * Deletion of Instrument
     */
    INSTRUMENT_DELETION((short) 105, "Deletion of Instrument"),

    /**
     * Suspension of Instrument
     */
    INSTRUMENT_SUSPENSION((short) 106, "Suspension of Instrument"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    DeleteReason(short wire, String description) {
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
    public static Optional<DeleteReason> fromWire(short wire) {
        return switch (wire) {
            case 100 -> Optional.of(NOSPECIALREASON);
            case 101 -> Optional.of(TAS_CHANGE);
            case 102 -> Optional.of(INTRADAY_EXPIRATION);
            case 103 -> Optional.of(RISK_EVENT);
            case 104 -> Optional.of(STOP_TRADING);
            case 105 -> Optional.of(INSTRUMENT_DELETION);
            case 106 -> Optional.of(INSTRUMENT_SUSPENSION);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
