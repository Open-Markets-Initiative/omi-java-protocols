package omi.nyse.amexequities.openbook.xdp.v1_9_a.enums;

import java.util.Optional;

/**
 * Trading sessions the order is eligible for. For NYSE and NYSE MKT, only 2 is applicable.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradeSession {

    /**
     * Ok For Morning Hours
     */
    OK_FOR_MORNING_HOURS((short) 1, "Ok For Morning Hours"),

    /**
     * Ok For National Hours Core
     */
    OK_FOR_NATIONAL_HOURS_CORE((short) 2, "Ok For National Hours Core"),

    /**
     * Ok For Morning And Core
     */
    OK_FOR_MORNING_AND_CORE((short) 3, "Ok For Morning And Core"),

    /**
     * Ok For Late Hours
     */
    OK_FOR_LATE_HOURS((short) 4, "Ok For Late Hours"),

    /**
     * Ok For Core And Late
     */
    OK_FOR_CORE_AND_LATE((short) 6, "Ok For Core And Late"),

    /**
     * Ok For Morning Core And Late
     */
    OK_FOR_MORNING_CORE_AND_LATE((short) 7, "Ok For Morning Core And Late");

    private final short wire;

    private final String description;

    TradeSession(short wire, String description) {
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
    public static Optional<TradeSession> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(OK_FOR_MORNING_HOURS);
            case 2 -> Optional.of(OK_FOR_NATIONAL_HOURS_CORE);
            case 3 -> Optional.of(OK_FOR_MORNING_AND_CORE);
            case 4 -> Optional.of(OK_FOR_LATE_HOURS);
            case 6 -> Optional.of(OK_FOR_CORE_AND_LATE);
            case 7 -> Optional.of(OK_FOR_MORNING_CORE_AND_LATE);
            default -> Optional.empty();
        };
    }
}
