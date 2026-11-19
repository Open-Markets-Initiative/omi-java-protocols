package omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_46.enums;

import java.util.Optional;

/**
 * Indicator for stamp duty requirement.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum StampDutyFlag {

    /**
     * Stamp Duty Required
     */
    STAMP_DUTY_REQUIRED('Y', "Stamp Duty Required"),

    /**
     * Stamp Duty Not Required
     */
    STAMP_DUTY_NOT_REQUIRED('N', "Stamp Duty Not Required");

    private final char wire;

    private final String description;

    StampDutyFlag(char wire, String description) {
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
    public static Optional<StampDutyFlag> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(STAMP_DUTY_REQUIRED);
            case 'N' -> Optional.of(STAMP_DUTY_NOT_REQUIRED);
            default -> Optional.empty();
        };
    }
}
