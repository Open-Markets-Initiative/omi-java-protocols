package omi.euronext.optiq.dropcopygateway.sbe.v5_36.enums;

import java.util.Optional;

/**
 * stopTriggeredTimeInForce
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum StopTriggeredTimeInForce {

    /**
     * Day
     */
    DAY((short) 0, "Day"),

    /**
     * Good_Till_Cancel
     */
    GOOD_TILL_CANCEL((short) 1, "Good_Till_Cancel"),

    /**
     * Immediate_or_Cancel
     */
    IMMEDIATEOR_CANCEL((short) 3, "Immediate_or_Cancel"),

    /**
     * Good_till_Date
     */
    GOODTILL_DATE((short) 6, "Good_till_Date"),

    /**
     * Good_Till_Month__GTM_
     */
    GOOD_TILL_MONTH_GTM((short) 10, "Good_Till_Month__GTM_"),

    /**
     * stopTriggeredTimeInForce
     */
    NO_VALUE((short) 255, "stopTriggeredTimeInForce");

    private final short wire;

    private final String description;

    StopTriggeredTimeInForce(short wire, String description) {
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
    public static Optional<StopTriggeredTimeInForce> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DAY);
            case 1 -> Optional.of(GOOD_TILL_CANCEL);
            case 3 -> Optional.of(IMMEDIATEOR_CANCEL);
            case 6 -> Optional.of(GOODTILL_DATE);
            case 10 -> Optional.of(GOOD_TILL_MONTH_GTM);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
