package omi.nasdaq.utdf.output.utp.v3_0_c.enums;

import java.util.Optional;

/**
 * Sub-Market Center ID
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SubMarketCenterId {

    /**
     * Finra Nyse Trf
     */
    FINRA_NYSE_TRF('N', "Finra Nyse Trf"),

    /**
     * Finra Nasdaq Trf Carteret
     */
    FINRA_NASDAQ_TRF_CARTERET('Q', "Finra Nasdaq Trf Carteret"),

    /**
     * Finra Nasdaq Trf Chicago
     */
    FINRA_NASDAQ_TRF_CHICAGO('B', "Finra Nasdaq Trf Chicago"),

    /**
     * Trade Originates From Finra Alternative Display Facility
     */
    TRADE_ORIGINATES_FROM_FINRA_ALTERNATIVE_DISPLAY_FACILITY(' ', "Trade Originates From Finra Alternative Display Facility");

    private final char wire;

    private final String description;

    SubMarketCenterId(char wire, String description) {
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
    public static Optional<SubMarketCenterId> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(FINRA_NYSE_TRF);
            case 'Q' -> Optional.of(FINRA_NASDAQ_TRF_CARTERET);
            case 'B' -> Optional.of(FINRA_NASDAQ_TRF_CHICAGO);
            case ' ' -> Optional.of(TRADE_ORIGINATES_FROM_FINRA_ALTERNATIVE_DISPLAY_FACILITY);
            default -> Optional.empty();
        };
    }
}
