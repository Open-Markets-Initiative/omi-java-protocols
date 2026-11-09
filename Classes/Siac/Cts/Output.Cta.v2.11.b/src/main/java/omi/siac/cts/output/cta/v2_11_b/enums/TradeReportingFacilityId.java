package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * Identifies the Participant with whom a Trade Reporting Facility (TRF) has been formed. Space-filled
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeReportingFacilityId {

    /**
     * Trf Not Applicable
     */
    TRF_NOT_APPLICABLE(' ', "Trf Not Applicable"),

    /**
     * Not Currently Active
     */
    NOT_CURRENTLY_ACTIVE_A('A', "Not Currently Active"),

    /**
     * Finra Nasdaq Trf Chicago
     */
    FINRA_NASDAQ_TRF_CHICAGO('B', "Finra Nasdaq Trf Chicago"),

    /**
     * Not Currently Active
     */
    NOT_CURRENTLY_ACTIVE_C('C', "Not Currently Active"),

    /**
     * Not Currently Active
     */
    NOT_CURRENTLY_ACTIVE_D('D', "Not Currently Active"),

    /**
     * Not Currently Active
     */
    NOT_CURRENTLY_ACTIVE_I('I', "Not Currently Active"),

    /**
     * Not Currently Active
     */
    NOT_CURRENTLY_ACTIVE_J('J', "Not Currently Active"),

    /**
     * Not Currently Active
     */
    NOT_CURRENTLY_ACTIVE_K('K', "Not Currently Active"),

    /**
     * Not Currently Active
     */
    NOT_CURRENTLY_ACTIVE_M('M', "Not Currently Active"),

    /**
     * Finra Nyse Trf
     */
    FINRA_NYSE_TRF('N', "Finra Nyse Trf"),

    /**
     * Not Currently Active
     */
    NOT_CURRENTLY_ACTIVE_P('P', "Not Currently Active"),

    /**
     * Finra Nasdaq Trf Carteret
     */
    FINRA_NASDAQ_TRF_CARTERET('T', "Finra Nasdaq Trf Carteret"),

    /**
     * Not Currently Active
     */
    NOT_CURRENTLY_ACTIVE_V('V', "Not Currently Active"),

    /**
     * Not Currently Active
     */
    NOT_CURRENTLY_ACTIVE_W('W', "Not Currently Active"),

    /**
     * Not Currently Active
     */
    NOT_CURRENTLY_ACTIVE_X('X', "Not Currently Active"),

    /**
     * Not Currently Active
     */
    NOT_CURRENTLY_ACTIVE_Y('Y', "Not Currently Active"),

    /**
     * Not Currently Active
     */
    NOT_CURRENTLY_ACTIVE_Z('Z', "Not Currently Active");

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
            case ' ' -> Optional.of(TRF_NOT_APPLICABLE);
            case 'A' -> Optional.of(NOT_CURRENTLY_ACTIVE_A);
            case 'B' -> Optional.of(FINRA_NASDAQ_TRF_CHICAGO);
            case 'C' -> Optional.of(NOT_CURRENTLY_ACTIVE_C);
            case 'D' -> Optional.of(NOT_CURRENTLY_ACTIVE_D);
            case 'I' -> Optional.of(NOT_CURRENTLY_ACTIVE_I);
            case 'J' -> Optional.of(NOT_CURRENTLY_ACTIVE_J);
            case 'K' -> Optional.of(NOT_CURRENTLY_ACTIVE_K);
            case 'M' -> Optional.of(NOT_CURRENTLY_ACTIVE_M);
            case 'N' -> Optional.of(FINRA_NYSE_TRF);
            case 'P' -> Optional.of(NOT_CURRENTLY_ACTIVE_P);
            case 'T' -> Optional.of(FINRA_NASDAQ_TRF_CARTERET);
            case 'V' -> Optional.of(NOT_CURRENTLY_ACTIVE_V);
            case 'W' -> Optional.of(NOT_CURRENTLY_ACTIVE_W);
            case 'X' -> Optional.of(NOT_CURRENTLY_ACTIVE_X);
            case 'Y' -> Optional.of(NOT_CURRENTLY_ACTIVE_Y);
            case 'Z' -> Optional.of(NOT_CURRENTLY_ACTIVE_Z);
            default -> Optional.empty();
        };
    }
}
