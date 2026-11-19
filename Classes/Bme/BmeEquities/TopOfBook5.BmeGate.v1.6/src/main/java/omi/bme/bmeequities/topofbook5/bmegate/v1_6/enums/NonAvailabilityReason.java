package omi.bme.bmeequities.topofbook5.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Reason security halted
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum NonAvailabilityReason {

    /**
     * Not Halted
     */
    NOT_HALTED((short) 0, "Not Halted"),

    /**
     * Halted By Regulator
     */
    HALTED_BY_REGULATOR((short) 100, "Halted By Regulator"),

    /**
     * Halted By Market Surveillance
     */
    HALTED_BY_MARKET_SURVEILLANCE((short) 101, "Halted By Market Surveillance"),

    /**
     * Knock Out
     */
    KNOCK_OUT((short) 102, "Knock Out"),

    /**
     * Knock In Pending
     */
    KNOCK_IN_PENDING((short) 103, "Knock In Pending");

    private final short wire;

    private final String description;

    NonAvailabilityReason(short wire, String description) {
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
    public static Optional<NonAvailabilityReason> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_HALTED);
            case 100 -> Optional.of(HALTED_BY_REGULATOR);
            case 101 -> Optional.of(HALTED_BY_MARKET_SURVEILLANCE);
            case 102 -> Optional.of(KNOCK_OUT);
            case 103 -> Optional.of(KNOCK_IN_PENDING);
            default -> Optional.empty();
        };
    }
}
