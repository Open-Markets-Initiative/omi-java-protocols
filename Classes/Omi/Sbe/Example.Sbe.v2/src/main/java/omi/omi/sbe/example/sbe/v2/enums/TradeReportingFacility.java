package omi.omi.sbe.example.sbe.v2.enums;

import java.util.Optional;

/**
 * tradeReportingFacility
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradeReportingFacility {

    /**
     * CTS Space — bonds, local issues, or otherwise TRF-not-applicable.
     */
    NOT_APPLICABLE((short) 0, "CTS Space \u2014 bonds, local issues, or otherwise TRF-not-applicable."),

    /**
     * UTDF Space — trade originated from FINRA Alternative Display Facility (off-exchange).
     */
    FINRA_ADF((short) 1, "UTDF Space \u2014 trade originated from FINRA Alternative Display Facility (off-exchange)."),

    /**
     * CTS 'N' / UTDF 'N'.
     */
    FINRA_NYSE_TRF((short) 2, "CTS 'N' / UTDF 'N'."),

    /**
     * CTS 'B' / UTDF 'B'.
     */
    FINRA_NASDAQ_TRF_CHICAGO((short) 3, "CTS 'B' / UTDF 'B'."),

    /**
     * CTS 'T' / UTDF 'Q'.
     */
    FINRA_NASDAQ_TRF_CARTERET((short) 4, "CTS 'T' / UTDF 'Q'.");

    private final short wire;

    private final String description;

    TradeReportingFacility(short wire, String description) {
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
    public static Optional<TradeReportingFacility> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NOT_APPLICABLE);
            case 1 -> Optional.of(FINRA_ADF);
            case 2 -> Optional.of(FINRA_NYSE_TRF);
            case 3 -> Optional.of(FINRA_NASDAQ_TRF_CHICAGO);
            case 4 -> Optional.of(FINRA_NASDAQ_TRF_CARTERET);
            default -> Optional.empty();
        };
    }
}
