package omi.cme.globex.mdp3.sbe.v1_5.enums;

import java.util.Optional;

/**
 * Identifies the reason for the status change
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum HaltReason {

    /**
     * Group Schedule
     */
    GROUP_SCHEDULE((short) 0, "Group Schedule"),

    /**
     * Surveillance Intervention
     */
    SURVEILLANCE_INTERVENTION((short) 1, "Surveillance Intervention"),

    /**
     * Market Event
     */
    MARKET_EVENT((short) 2, "Market Event"),

    /**
     * Instrument Activation
     */
    INSTRUMENT_ACTIVATION((short) 3, "Instrument Activation"),

    /**
     * Instrument Expiration
     */
    INSTRUMENT_EXPIRATION((short) 4, "Instrument Expiration"),

    /**
     * Unknown
     */
    UNKNOWN((short) 5, "Unknown"),

    /**
     * Recovery In Process
     */
    RECOVERY_IN_PROCESS((short) 6, "Recovery In Process");

    private final short wire;

    private final String description;

    HaltReason(short wire, String description) {
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
    public static Optional<HaltReason> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(GROUP_SCHEDULE);
            case 1 -> Optional.of(SURVEILLANCE_INTERVENTION);
            case 2 -> Optional.of(MARKET_EVENT);
            case 3 -> Optional.of(INSTRUMENT_ACTIVATION);
            case 4 -> Optional.of(INSTRUMENT_EXPIRATION);
            case 5 -> Optional.of(UNKNOWN);
            case 6 -> Optional.of(RECOVERY_IN_PROCESS);
            default -> Optional.empty();
        };
    }
}
