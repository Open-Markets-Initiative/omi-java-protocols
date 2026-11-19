package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * severityLevel
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SeverityLevel {

    /**
     * Info
     */
    INFO((short) 1, "Info"),

    /**
     * Warning
     */
    WARNING((short) 2, "Warning"),

    /**
     * Error
     */
    ERROR((short) 3, "Error"),

    /**
     * Fatal
     */
    FATAL((short) 4, "Fatal");

    private final short wire;

    private final String description;

    SeverityLevel(short wire, String description) {
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
    public static Optional<SeverityLevel> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(INFO);
            case 2 -> Optional.of(WARNING);
            case 3 -> Optional.of(ERROR);
            case 4 -> Optional.of(FATAL);
            default -> Optional.empty();
        };
    }
}
