package omi.siac.opra.output.obi.v6_2.enums;

import java.util.Optional;

/**
 * Identifies the participant that entered the Best Bid.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BestBidParticipantId {

    /**
     * NYSE American
     */
    NYSE_AMERICAN('A', "NYSE American"),

    /**
     * Boston Options Exchange
     */
    BOSTON_OPTIONS_EXCHANGE('B', "Boston Options Exchange"),

    /**
     * Cboe Options Exchange
     */
    CBOE_OPTIONS_EXCHANGE('C', "Cboe Options Exchange"),

    /**
     * MIAX EMERALD
     */
    MIAX_EMERALD('D', "MIAX EMERALD"),

    /**
     * Cboe EDGX Options
     */
    CBOE_EDGX_OPTIONS('E', "Cboe EDGX Options"),

    /**
     * Nasdaq GEMX
     */
    NASDAQ_GEMX('H', "Nasdaq GEMX"),

    /**
     * Nasdaq Ise
     */
    NASDAQ_ISE('I', "Nasdaq Ise"),

    /**
     * Nasdaq MRX
     */
    NASDAQ_MRX('J', "Nasdaq MRX"),

    /**
     * Miami International Securities Exchange
     */
    MIAMI_INTERNATIONAL_SECURITIES_EXCHANGE('M', "Miami International Securities Exchange"),

    /**
     * NYSE ARCA
     */
    NYSE_ARCA('N', "NYSE ARCA"),

    /**
     * Options Price Reporting Authority
     */
    OPTIONS_PRICE_REPORTING_AUTHORITY('O', "Options Price Reporting Authority"),

    /**
     * MIAX PEARL
     */
    MIAX_PEARL('P', "MIAX PEARL"),

    /**
     * NASDAQ Options Market
     */
    NASDAQ_OPTIONS_MARKET('Q', "NASDAQ Options Market"),

    /**
     * NASDAQ BX Options
     */
    NASDAQ_BX_OPTIONS('T', "NASDAQ BX Options"),

    /**
     * Cboe C2 Options
     */
    CBOE_C2_OPTIONS('W', "Cboe C2 Options"),

    /**
     * NASDAQ PHLX
     */
    NASDAQ_PHLX('X', "NASDAQ PHLX"),

    /**
     * Cboe BZX Options Exchange
     */
    CBOE_BZX_OPTIONS_EXCHANGE('Z', "Cboe BZX Options Exchange");

    private final char wire;

    private final String description;

    BestBidParticipantId(char wire, String description) {
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
    public static Optional<BestBidParticipantId> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NYSE_AMERICAN);
            case 'B' -> Optional.of(BOSTON_OPTIONS_EXCHANGE);
            case 'C' -> Optional.of(CBOE_OPTIONS_EXCHANGE);
            case 'D' -> Optional.of(MIAX_EMERALD);
            case 'E' -> Optional.of(CBOE_EDGX_OPTIONS);
            case 'H' -> Optional.of(NASDAQ_GEMX);
            case 'I' -> Optional.of(NASDAQ_ISE);
            case 'J' -> Optional.of(NASDAQ_MRX);
            case 'M' -> Optional.of(MIAMI_INTERNATIONAL_SECURITIES_EXCHANGE);
            case 'N' -> Optional.of(NYSE_ARCA);
            case 'O' -> Optional.of(OPTIONS_PRICE_REPORTING_AUTHORITY);
            case 'P' -> Optional.of(MIAX_PEARL);
            case 'Q' -> Optional.of(NASDAQ_OPTIONS_MARKET);
            case 'T' -> Optional.of(NASDAQ_BX_OPTIONS);
            case 'W' -> Optional.of(CBOE_C2_OPTIONS);
            case 'X' -> Optional.of(NASDAQ_PHLX);
            case 'Z' -> Optional.of(CBOE_BZX_OPTIONS_EXCHANGE);
            default -> Optional.empty();
        };
    }
}
