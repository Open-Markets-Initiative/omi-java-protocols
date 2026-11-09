package omi.nasdaq.uqdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * Sub Market Center ID
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SubMarketCenterId {

    /**
     * NYSE TRF
     */
    NYSE_TRF('N', "NYSE TRF"),

    /**
     * Nasdaq TRF Carteret
     */
    NASDAQ_TRF_CARTERET('Q', "Nasdaq TRF Carteret"),

    /**
     * Nasdaq TRF Chicago
     */
    NASDAQ_TRF_CHICAGO('B', "Nasdaq TRF Chicago"),

    /**
     * FINRA Alternative Display Facility
     */
    FINRA_ALTERNATIVE_DISPLAY_FACILITY(' ', "FINRA Alternative Display Facility");

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
            case 'N' -> Optional.of(NYSE_TRF);
            case 'Q' -> Optional.of(NASDAQ_TRF_CARTERET);
            case 'B' -> Optional.of(NASDAQ_TRF_CHICAGO);
            case ' ' -> Optional.of(FINRA_ALTERNATIVE_DISPLAY_FACILITY);
            default -> Optional.empty();
        };
    }
}
