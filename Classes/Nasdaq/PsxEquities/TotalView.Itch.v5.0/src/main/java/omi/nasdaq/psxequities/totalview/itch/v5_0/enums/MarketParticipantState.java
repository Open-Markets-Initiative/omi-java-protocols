package omi.nasdaq.psxequities.totalview.itch.v5_0.enums;

import java.util.Optional;

/**
 * Indicates the market participant’s current registration status in the issue
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketParticipantState {

    /**
     * Active
     */
    ACTIVE('A', "Active"),

    /**
     * Excused/Withdrawn
     */
    EXCUSED_WITHDRAWN('E', "Excused/Withdrawn"),

    /**
     * Withdrawn
     */
    WITHDRAWN('W', "Withdrawn"),

    /**
     * Suspended
     */
    SUSPENDED('S', "Suspended"),

    /**
     * Deleted
     */
    DELETED('D', "Deleted");

    private final char wire;

    private final String description;

    MarketParticipantState(char wire, String description) {
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
    public static Optional<MarketParticipantState> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ACTIVE);
            case 'E' -> Optional.of(EXCUSED_WITHDRAWN);
            case 'W' -> Optional.of(WITHDRAWN);
            case 'S' -> Optional.of(SUSPENDED);
            case 'D' -> Optional.of(DELETED);
            default -> Optional.empty();
        };
    }
}
