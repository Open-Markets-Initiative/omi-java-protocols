package omi.siac.cts.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * Identifies the Participant with whom a Trade Reporting Facility has been formed
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeReportingFacilityId {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE(' ', "Not Applicable"),

    /**
     * Inactive Value A
     */
    INACTIVE_VALUE_A('A', "Inactive Value A"),

    /**
     * Finra Nasdaq Chicago
     */
    FINRA_NASDAQ_CHICAGO('B', "Finra Nasdaq Chicago"),

    /**
     * Inactive Value C
     */
    INACTIVE_VALUE_C('C', "Inactive Value C"),

    /**
     * Inactive Value D
     */
    INACTIVE_VALUE_D('D', "Inactive Value D"),

    /**
     * Inactive Value I
     */
    INACTIVE_VALUE_I('I', "Inactive Value I"),

    /**
     * Inactive Value J
     */
    INACTIVE_VALUE_J('J', "Inactive Value J"),

    /**
     * Inactive Value K
     */
    INACTIVE_VALUE_K('K', "Inactive Value K"),

    /**
     * Inactive Value M
     */
    INACTIVE_VALUE_M('M', "Inactive Value M"),

    /**
     * Finra Nyse
     */
    FINRA_NYSE('N', "Finra Nyse"),

    /**
     * Inactive Value P
     */
    INACTIVE_VALUE_P('P', "Inactive Value P"),

    /**
     * Finra Nasdaq Carteret
     */
    FINRA_NASDAQ_CARTERET('T', "Finra Nasdaq Carteret"),

    /**
     * Inactive Value V
     */
    INACTIVE_VALUE_V('V', "Inactive Value V"),

    /**
     * Inactive Value W
     */
    INACTIVE_VALUE_W('W', "Inactive Value W"),

    /**
     * Inactive Value X
     */
    INACTIVE_VALUE_X('X', "Inactive Value X"),

    /**
     * Inactive Value Y
     */
    INACTIVE_VALUE_Y('Y', "Inactive Value Y"),

    /**
     * Inactive Value Z
     */
    INACTIVE_VALUE_Z('Z', "Inactive Value Z");

    private final char wire;

    private final String description;

    TradeReportingFacilityId(char wire, String description) {
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
    public static Optional<TradeReportingFacilityId> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case 'A' -> Optional.of(INACTIVE_VALUE_A);
            case 'B' -> Optional.of(FINRA_NASDAQ_CHICAGO);
            case 'C' -> Optional.of(INACTIVE_VALUE_C);
            case 'D' -> Optional.of(INACTIVE_VALUE_D);
            case 'I' -> Optional.of(INACTIVE_VALUE_I);
            case 'J' -> Optional.of(INACTIVE_VALUE_J);
            case 'K' -> Optional.of(INACTIVE_VALUE_K);
            case 'M' -> Optional.of(INACTIVE_VALUE_M);
            case 'N' -> Optional.of(FINRA_NYSE);
            case 'P' -> Optional.of(INACTIVE_VALUE_P);
            case 'T' -> Optional.of(FINRA_NASDAQ_CARTERET);
            case 'V' -> Optional.of(INACTIVE_VALUE_V);
            case 'W' -> Optional.of(INACTIVE_VALUE_W);
            case 'X' -> Optional.of(INACTIVE_VALUE_X);
            case 'Y' -> Optional.of(INACTIVE_VALUE_Y);
            case 'Z' -> Optional.of(INACTIVE_VALUE_Z);
            default -> Optional.empty();
        };
    }
}
