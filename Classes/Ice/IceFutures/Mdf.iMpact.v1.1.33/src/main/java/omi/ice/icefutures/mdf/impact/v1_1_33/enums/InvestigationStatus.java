package omi.ice.icefutures.mdf.impact.v1_1_33.enums;

import java.util.Optional;

/**
 * ‘1’ – Under Investigation, ‘2’ – Investigation Completed
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum InvestigationStatus {

    /**
     * Under Investigation
     */
    UNDER_INVESTIGATION('1', "Under Investigation"),

    /**
     * Investigation Completed
     */
    INVESTIGATION_COMPLETED('2', "Investigation Completed");

    private final char wire;

    private final String description;

    InvestigationStatus(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<InvestigationStatus> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(UNDER_INVESTIGATION);
            case '2' -> Optional.of(INVESTIGATION_COMPLETED);
            default -> Optional.empty();
        };
    }
}
