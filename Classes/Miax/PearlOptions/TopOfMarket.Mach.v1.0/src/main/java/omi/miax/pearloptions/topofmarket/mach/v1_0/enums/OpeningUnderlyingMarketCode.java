package omi.miax.pearloptions.topofmarket.mach.v1_0.enums;

import java.util.Optional;

/**
 * Options opening will be triggered on receipt of Opening quote/trade from this Underlying market:
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OpeningUnderlyingMarketCode {

    /**
     * Nyse Amex
     */
    NYSE_AMEX('A', "Nyse Amex"),

    /**
     * Nasdaq Omx Bx
     */
    NASDAQ_OMX_BX('B', "Nasdaq Omx Bx"),

    /**
     * National Stock Exchange
     */
    NATIONAL_STOCK('C', "National Stock Exchange"),

    /**
     * Finra Adf
     */
    FINRA_ADF('D', "Finra Adf"),

    /**
     * Market Independent Any Market That Opens First
     */
    MARKET_INDEPENDENT('E', "Market Independent Any Market That Opens First"),

    /**
     * International Securities Exchange
     */
    INTERNATIONAL_SECURITIES('I', "International Securities Exchange"),

    /**
     * Edga Exchange Inc
     */
    EDGA_EXCHANGE('J', "Edga Exchange Inc"),

    /**
     * Edgx Exchange Inc
     */
    EDGX_EXCHANGE('K', "Edgx Exchange Inc"),

    /**
     * Chicago Stock Exchange
     */
    CHICAGO_STOCK('M', "Chicago Stock Exchange"),

    /**
     * Nyse Euronext
     */
    NYSE_EURONEXT('N', "Nyse Euronext"),

    /**
     * Nyse Arca Exchange
     */
    NYSE_ARCA('P', "Nyse Arca Exchange"),

    /**
     * Nasdaq Omx Via Utp Feed
     */
    NASDAQ_OMX_Q('Q', "Nasdaq Omx Via Utp Feed"),

    /**
     * Nasdaq Omx Via Cta Feed
     */
    NASDAQ_OMX_T('T', "Nasdaq Omx Via Cta Feed"),

    /**
     * Iex
     */
    IEX('V', "Iex"),

    /**
     * Nasdaq Omx Phlx
     */
    NASDAQ_OMX_PHLX('X', "Nasdaq Omx Phlx"),

    /**
     * Bats Y Exchange Inc
     */
    BATS_Y_EXCHANGE('Y', "Bats Y Exchange Inc"),

    /**
     * Bats Exchange Inc
     */
    BATS_EXCHANGE('Z', "Bats Exchange Inc");

    private final char wire;

    private final String description;

    OpeningUnderlyingMarketCode(char wire, String description) {
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
    public static Optional<OpeningUnderlyingMarketCode> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NYSE_AMEX);
            case 'B' -> Optional.of(NASDAQ_OMX_BX);
            case 'C' -> Optional.of(NATIONAL_STOCK);
            case 'D' -> Optional.of(FINRA_ADF);
            case 'E' -> Optional.of(MARKET_INDEPENDENT);
            case 'I' -> Optional.of(INTERNATIONAL_SECURITIES);
            case 'J' -> Optional.of(EDGA_EXCHANGE);
            case 'K' -> Optional.of(EDGX_EXCHANGE);
            case 'M' -> Optional.of(CHICAGO_STOCK);
            case 'N' -> Optional.of(NYSE_EURONEXT);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'Q' -> Optional.of(NASDAQ_OMX_Q);
            case 'T' -> Optional.of(NASDAQ_OMX_T);
            case 'V' -> Optional.of(IEX);
            case 'X' -> Optional.of(NASDAQ_OMX_PHLX);
            case 'Y' -> Optional.of(BATS_Y_EXCHANGE);
            case 'Z' -> Optional.of(BATS_EXCHANGE);
            default -> Optional.empty();
        };
    }
}
