package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Calendar exception type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CalendarExceptionType {

    /**
     * The day is closed for trading
     */
    CLOSED((short) 1, "The day is closed for trading"),

    /**
     * The day is open for trading
     */
    OPEN((short) 2, "The day is open for trading");

    private final short wire;

    private final String description;

    CalendarExceptionType(short wire, String description) {
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
    public static Optional<CalendarExceptionType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CLOSED);
            case 2 -> Optional.of(OPEN);
            default -> Optional.empty();
        };
    }
}
