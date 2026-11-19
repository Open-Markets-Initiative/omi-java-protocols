package omi.bme.bmefixedincome.fulldepth.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Calculation Method
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CalculationMethod {

    /**
     * 30/360 (US-NASD)
     */
    THIRTY_360_US_NASD('0', "30/360 (US-NASD)"),

    /**
     * Actual Actual
     */
    ACTUAL_ACTUAL('1', "Actual Actual"),

    /**
     * Actual 360
     */
    ACTUAL_360('2', "Actual 360"),

    /**
     * Actual 365
     */
    ACTUAL_365('3', "Actual 365"),

    /**
     * 30/360 (European)
     */
    THIRTY_360_EUROPEAN('4', "30/360 (European)"),

    /**
     * If Days To Maturity 365 Actual 360 Else Actual 365
     */
    IF_DAYS_TO_MATURITY_365_ACTUAL_360_ELSE_ACTUAL_365('5', "If Days To Maturity 365 Actual 360 Else Actual 365");

    private final char wire;

    private final String description;

    CalculationMethod(char wire, String description) {
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
    public static Optional<CalculationMethod> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(THIRTY_360_US_NASD);
            case '1' -> Optional.of(ACTUAL_ACTUAL);
            case '2' -> Optional.of(ACTUAL_360);
            case '3' -> Optional.of(ACTUAL_365);
            case '4' -> Optional.of(THIRTY_360_EUROPEAN);
            case '5' -> Optional.of(IF_DAYS_TO_MATURITY_365_ACTUAL_360_ELSE_ACTUAL_365);
            default -> Optional.empty();
        };
    }
}
