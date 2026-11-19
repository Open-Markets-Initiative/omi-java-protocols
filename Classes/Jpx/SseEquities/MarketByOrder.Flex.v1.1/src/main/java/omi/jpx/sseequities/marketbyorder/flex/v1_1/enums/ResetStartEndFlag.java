package omi.jpx.sseequities.marketbyorder.flex.v1_1.enums;

import java.util.Optional;

/**
 * When TSE needs to reset all distributed data, this indicates the start or end of the process
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ResetStartEndFlag {

    /**
     * Start Of Reset Dissemination
     */
    START_OF_RESET_DISSEMINATION((short) 1, "Start Of Reset Dissemination"),

    /**
     * End Of Reset Dissemination
     */
    END_OF_RESET_DISSEMINATION((short) 2, "End Of Reset Dissemination");

    private final short wire;

    private final String description;

    ResetStartEndFlag(short wire, String description) {
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
    public static Optional<ResetStartEndFlag> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(START_OF_RESET_DISSEMINATION);
            case 2 -> Optional.of(END_OF_RESET_DISSEMINATION);
            default -> Optional.empty();
        };
    }
}
