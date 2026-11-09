package omi.siac.cts.output.cta.v2_11_b.enums;

import java.util.Optional;

/**
 * Identifies the Participant or Processor that initiated the message
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ParticipantId {

    /**
     * Nyse American Llc Nyse American
     */
    NYSE_AMERICAN_LLC_NYSE_AMERICAN('A', "Nyse American Llc Nyse American"),

    /**
     * Nasdaq Omx Bx Inc Nasdaq Omx Bx
     */
    NASDAQ_OMX_BX_INC_NASDAQ_OMX_BX('B', "Nasdaq Omx Bx Inc Nasdaq Omx Bx"),

    /**
     * Nyse National Inc Nyse National
     */
    NYSE_NATIONAL_INC_NYSE_NATIONAL('C', "Nyse National Inc Nyse National"),

    /**
     * Finra Alternative Display Facility Adf
     */
    FINRA_ALTERNATIVE_DISPLAY_FACILITY_ADF('D', "Finra Alternative Display Facility Adf"),

    /**
     * Texas Stock Exchange Llc Txse
     */
    TEXAS_STOCK_EXCHANGE_LLC_TXSE('F', "Texas Stock Exchange Llc Txse"),

    /**
     * 24 X National Exchange Llc 24 X
     */
    N2_4X_NATIONAL_EXCHANGE_LLC_24X('G', "24 X National Exchange Llc 24 X"),

    /**
     * Miax Pearl Exchange Llc Miax
     */
    MIAX_PEARL_EXCHANGE_LLC_MIAX('H', "Miax Pearl Exchange Llc Miax"),

    /**
     * International Securities Exchange Llc Ise
     */
    INTERNATIONAL_SECURITIES_EXCHANGE_LLC_ISE('I', "International Securities Exchange Llc Ise"),

    /**
     * Cboe Edga Exchange Inc Cboe Edga
     */
    CBOE_EDGA_EXCHANGE_INC_CBOE_EDGA('J', "Cboe Edga Exchange Inc Cboe Edga"),

    /**
     * Cboe Edgx Exchange Inc Cboe Edgx
     */
    CBOE_EDGX_EXCHANGE_INC_CBOE_EDGX('K', "Cboe Edgx Exchange Inc Cboe Edgx"),

    /**
     * Long Term Stock Exchange Inc Ltse
     */
    LONG_TERM_STOCK_EXCHANGE_INC_LTSE('L', "Long Term Stock Exchange Inc Ltse"),

    /**
     * Nyse Texas Inc Nyse Texas
     */
    NYSE_TEXAS_INC_NYSE_TEXAS('M', "Nyse Texas Inc Nyse Texas"),

    /**
     * New York Stock Exchange Llc Nyse
     */
    NEW_YORK_STOCK_EXCHANGE_LLC_NYSE('N', "New York Stock Exchange Llc Nyse"),

    /**
     * Nyse Arca Inc Nyse Arca
     */
    NYSE_ARCA_INC_NYSE_ARCA('P', "Nyse Arca Inc Nyse Arca"),

    /**
     * Consolidated Tape System Cts
     */
    CONSOLIDATED_TAPE_SYSTEM_CTS('S', "Consolidated Tape System Cts"),

    /**
     * Nasdaq Stock Market Llc Nasdaq
     */
    NASDAQ_STOCK_MARKET_LLC_NASDAQ('T', "Nasdaq Stock Market Llc Nasdaq"),

    /**
     * Members Exchange Llc Memx
     */
    MEMBERS_EXCHANGE_LLC_MEMX('U', "Members Exchange Llc Memx"),

    /**
     * Investors Exchange Llc Iex
     */
    INVESTORS_EXCHANGE_LLC_IEX('V', "Investors Exchange Llc Iex"),

    /**
     * Cboe Stock Exchange Inc Cbsx
     */
    CBOE_STOCK_EXCHANGE_INC_CBSX('W', "Cboe Stock Exchange Inc Cbsx"),

    /**
     * Nasdaq Omx Psx Inc Nasdaq Omx Psx
     */
    NASDAQ_OMX_PSX_INC_NASDAQ_OMX_PSX('X', "Nasdaq Omx Psx Inc Nasdaq Omx Psx"),

    /**
     * Cboe Byx Exchange Inc Cboe Byx
     */
    CBOE_BYX_EXCHANGE_INC_CBOE_BYX('Y', "Cboe Byx Exchange Inc Cboe Byx"),

    /**
     * Cboe Bzx Exchange Inc Cboe Bzx
     */
    CBOE_BZX_EXCHANGE_INC_CBOE_BZX('Z', "Cboe Bzx Exchange Inc Cboe Bzx");

    private final char wire;

    private final String description;

    ParticipantId(char wire, String description) {
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
    public static Optional<ParticipantId> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NYSE_AMERICAN_LLC_NYSE_AMERICAN);
            case 'B' -> Optional.of(NASDAQ_OMX_BX_INC_NASDAQ_OMX_BX);
            case 'C' -> Optional.of(NYSE_NATIONAL_INC_NYSE_NATIONAL);
            case 'D' -> Optional.of(FINRA_ALTERNATIVE_DISPLAY_FACILITY_ADF);
            case 'F' -> Optional.of(TEXAS_STOCK_EXCHANGE_LLC_TXSE);
            case 'G' -> Optional.of(N2_4X_NATIONAL_EXCHANGE_LLC_24X);
            case 'H' -> Optional.of(MIAX_PEARL_EXCHANGE_LLC_MIAX);
            case 'I' -> Optional.of(INTERNATIONAL_SECURITIES_EXCHANGE_LLC_ISE);
            case 'J' -> Optional.of(CBOE_EDGA_EXCHANGE_INC_CBOE_EDGA);
            case 'K' -> Optional.of(CBOE_EDGX_EXCHANGE_INC_CBOE_EDGX);
            case 'L' -> Optional.of(LONG_TERM_STOCK_EXCHANGE_INC_LTSE);
            case 'M' -> Optional.of(NYSE_TEXAS_INC_NYSE_TEXAS);
            case 'N' -> Optional.of(NEW_YORK_STOCK_EXCHANGE_LLC_NYSE);
            case 'P' -> Optional.of(NYSE_ARCA_INC_NYSE_ARCA);
            case 'S' -> Optional.of(CONSOLIDATED_TAPE_SYSTEM_CTS);
            case 'T' -> Optional.of(NASDAQ_STOCK_MARKET_LLC_NASDAQ);
            case 'U' -> Optional.of(MEMBERS_EXCHANGE_LLC_MEMX);
            case 'V' -> Optional.of(INVESTORS_EXCHANGE_LLC_IEX);
            case 'W' -> Optional.of(CBOE_STOCK_EXCHANGE_INC_CBSX);
            case 'X' -> Optional.of(NASDAQ_OMX_PSX_INC_NASDAQ_OMX_PSX);
            case 'Y' -> Optional.of(CBOE_BYX_EXCHANGE_INC_CBOE_BYX);
            case 'Z' -> Optional.of(CBOE_BZX_EXCHANGE_INC_CBOE_BZX);
            default -> Optional.empty();
        };
    }
}
