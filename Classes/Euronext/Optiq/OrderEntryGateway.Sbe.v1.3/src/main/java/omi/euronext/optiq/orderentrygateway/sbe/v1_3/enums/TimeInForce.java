package omi.euronext.optiq.orderentrygateway.sbe.v1_3.enums;

import java.util.Optional;

/**
 * timeInForce
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TimeInForce {

    /**
     * Day
     */
    DAY((short) 0, "Day"),

    /**
     * Good_Till_Cancel
     */
    GOOD_TILL_CANCEL((short) 1, "Good_Till_Cancel"),

    /**
     * Valid_for_Uncrossing
     */
    VALIDFOR_UNCROSSING((short) 2, "Valid_for_Uncrossing"),

    /**
     * Immediate_or_Cancel
     */
    IMMEDIATEOR_CANCEL((short) 3, "Immediate_or_Cancel"),

    /**
     * Fill_or_Kill
     */
    FILLOR_KILL((short) 4, "Fill_or_Kill"),

    /**
     * Good_till_Time
     */
    GOODTILL_TIME((short) 5, "Good_till_Time"),

    /**
     * Good_till_Date
     */
    GOODTILL_DATE((short) 6, "Good_till_Date"),

    /**
     * Valid_for_Closing_Uncrossing
     */
    VALIDFOR_CLOSING_UNCROSSING((short) 7, "Valid_for_Closing_Uncrossing"),

    /**
     * Valid_for_Session
     */
    VALIDFOR_SESSION((short) 8, "Valid_for_Session");

    private final short wire;

    private final String description;

    TimeInForce(short wire, String description) {
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
    public static Optional<TimeInForce> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DAY);
            case 1 -> Optional.of(GOOD_TILL_CANCEL);
            case 2 -> Optional.of(VALIDFOR_UNCROSSING);
            case 3 -> Optional.of(IMMEDIATEOR_CANCEL);
            case 4 -> Optional.of(FILLOR_KILL);
            case 5 -> Optional.of(GOODTILL_TIME);
            case 6 -> Optional.of(GOODTILL_DATE);
            case 7 -> Optional.of(VALIDFOR_CLOSING_UNCROSSING);
            case 8 -> Optional.of(VALIDFOR_SESSION);
            default -> Optional.empty();
        };
    }
}
