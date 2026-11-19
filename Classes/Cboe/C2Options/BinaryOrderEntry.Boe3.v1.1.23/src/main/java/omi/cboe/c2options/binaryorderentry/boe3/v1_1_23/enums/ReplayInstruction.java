package omi.cboe.c2options.binaryorderentry.boe3.v1_1_23.enums;

import java.util.Optional;

/**
 * Controls replay behavior for unknown units.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ReplayInstruction {

    /**
     * Deep Replay Of Specified Unit
     */
    DEEP_REPLAY_OF_SPECIFIED_UNIT('D', "Deep Replay Of Specified Unit"),

    /**
     * Fail If Unit Not Specified
     */
    FAIL_IF_UNIT_NOT_SPECIFIED('F', "Fail If Unit Not Specified"),

    /**
     * Replay Any Unspecified Unit From Zero
     */
    REPLAY_ANY_UNSPECIFIED_UNIT_FROM_ZERO('R', "Replay Any Unspecified Unit From Zero"),

    /**
     * Skip Replay Of Unspecified Units
     */
    SKIP_REPLAY_OF_UNSPECIFIED_UNITS('S', "Skip Replay Of Unspecified Units");

    private final char wire;

    private final String description;

    ReplayInstruction(char wire, String description) {
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
    public static Optional<ReplayInstruction> fromWire(char wire) {
        return switch (wire) {
            case 'D' -> Optional.of(DEEP_REPLAY_OF_SPECIFIED_UNIT);
            case 'F' -> Optional.of(FAIL_IF_UNIT_NOT_SPECIFIED);
            case 'R' -> Optional.of(REPLAY_ANY_UNSPECIFIED_UNIT_FROM_ZERO);
            case 'S' -> Optional.of(SKIP_REPLAY_OF_UNSPECIFIED_UNITS);
            default -> Optional.empty();
        };
    }
}
