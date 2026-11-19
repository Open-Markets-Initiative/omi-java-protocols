package omi.siac.opra.input.obi.v5_0_i.enums;

import java.util.Optional;

/**
 * Session Indicator value on messages from Participant to OPRA. 0x00 for regular trading session, 0x01 to 0x05 for Pre-Market trading session (Global Trading Hours).
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SessionIndicator {

    /**
     * Regular trading session (only used for Regular OPRA Session)
     */
    REGULAR((short) 0, "Regular trading session (only used for Regular OPRA Session)"),

    /**
     * Pre-Market trading session (Global Trading Hours): trade day Monday
     */
    GTH_MONDAY((short) 1, "Pre-Market trading session (Global Trading Hours): trade day Monday"),

    /**
     * Pre-Market trading session (Global Trading Hours): trade day Tuesday
     */
    GTH_TUESDAY((short) 2, "Pre-Market trading session (Global Trading Hours): trade day Tuesday"),

    /**
     * Pre-Market trading session (Global Trading Hours): trade day Wednesday
     */
    GTH_WEDNESDAY((short) 3, "Pre-Market trading session (Global Trading Hours): trade day Wednesday"),

    /**
     * Pre-Market trading session (Global Trading Hours): trade day Thursday
     */
    GTH_THURSDAY((short) 4, "Pre-Market trading session (Global Trading Hours): trade day Thursday"),

    /**
     * Pre-Market trading session (Global Trading Hours): trade day Friday
     */
    GTH_FRIDAY((short) 5, "Pre-Market trading session (Global Trading Hours): trade day Friday");

    private final short wire;

    private final String description;

    SessionIndicator(short wire, String description) {
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
    public static Optional<SessionIndicator> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(REGULAR);
            case 1 -> Optional.of(GTH_MONDAY);
            case 2 -> Optional.of(GTH_TUESDAY);
            case 3 -> Optional.of(GTH_WEDNESDAY);
            case 4 -> Optional.of(GTH_THURSDAY);
            case 5 -> Optional.of(GTH_FRIDAY);
            default -> Optional.empty();
        };
    }
}
