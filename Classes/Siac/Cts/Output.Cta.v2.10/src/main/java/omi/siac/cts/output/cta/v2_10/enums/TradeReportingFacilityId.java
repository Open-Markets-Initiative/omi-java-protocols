package omi.siac.cts.output.cta.v2_10.enums;

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
     * Finra Nasdaq Chicago
     */
    FINRA_NASDAQ_CHICAGO('B', "Finra Nasdaq Chicago"),

    /**
     * Finra Nyse
     */
    FINRA_NYSE('N', "Finra Nyse"),

    /**
     * Finra Nasdaq Carteret
     */
    FINRA_NASDAQ_CARTERET('T', "Finra Nasdaq Carteret");

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
            case 'B' -> Optional.of(FINRA_NASDAQ_CHICAGO);
            case 'N' -> Optional.of(FINRA_NYSE);
            case 'T' -> Optional.of(FINRA_NASDAQ_CARTERET);
            default -> Optional.empty();
        };
    }
}
