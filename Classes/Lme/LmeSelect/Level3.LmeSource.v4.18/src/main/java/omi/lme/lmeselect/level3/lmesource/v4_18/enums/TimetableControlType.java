package omi.lme.lmeselect.level3.lmesource.v4_18.enums;

import java.util.Optional;

/**
 * Timetable Control Type.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TimetableControlType {

    /**
     * Automatic The Default Trading Schedule
     */
    AUTOMATIC_THE_DEFAULT_TRADING_SCHEDULE('A', "Automatic The Default Trading Schedule"),

    /**
     * Manual A Temporary Trading Schedule
     */
    MANUAL_A_TEMPORARY_TRADING_SCHEDULE('M', "Manual A Temporary Trading Schedule");

    private final char wire;

    private final String description;

    TimetableControlType(char wire, String description) {
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
    public static Optional<TimetableControlType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AUTOMATIC_THE_DEFAULT_TRADING_SCHEDULE);
            case 'M' -> Optional.of(MANUAL_A_TEMPORARY_TRADING_SCHEDULE);
            default -> Optional.empty();
        };
    }
}
