package omi.finra.finraorf.tdds.dfi.v2_1.enums;

import java.util.Optional;

/**
 * This Function field denotes if the original trade report is being cancelled or was reported in error
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ReportFunction {

    /**
     * Cancel
     */
    CANCEL('C', "Cancel"),

    /**
     * Error
     */
    ERROR('E', "Error"),

    /**
     * Correction
     */
    CORRECTION('N', "Correction");

    private final char wire;

    private final String description;

    ReportFunction(char wire, String description) {
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
    public static Optional<ReportFunction> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CANCEL);
            case 'E' -> Optional.of(ERROR);
            case 'N' -> Optional.of(CORRECTION);
            default -> Optional.empty();
        };
    }
}
