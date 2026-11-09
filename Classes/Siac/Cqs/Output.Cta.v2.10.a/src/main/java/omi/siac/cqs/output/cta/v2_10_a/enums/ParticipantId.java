package omi.siac.cqs.output.cta.v2_10_a.enums;

import java.util.Optional;

/**
 * Identifies the Participant or Processor that generated the message
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ParticipantId {

    /**
     * NYSE American, LLC (NYSE American)
     */
    NYSE_AMERICAN('A', "NYSE American, LLC (NYSE American)"),

    /**
     * NASDAQ OMX BX, Inc. (NASDAQ OMX BX)
     */
    NASDAQ_OMX_BX('B', "NASDAQ OMX BX, Inc. (NASDAQ OMX BX)"),

    /**
     * NYSE National, Inc. (NYSE National)
     */
    NYSE_NATIONAL('C', "NYSE National, Inc. (NYSE National)"),

    /**
     * FINRA Alternative Display Facility (ADF)
     */
    FINRA_ADF('D', "FINRA Alternative Display Facility (ADF)"),

    /**
     * 24X National Exchange LLC (24X)
     */
    N2_4X('G', "24X National Exchange LLC (24X)"),

    /**
     * MIAX Pearl Exchange, LLC (MIAX)
     */
    MIAX('H', "MIAX Pearl Exchange, LLC (MIAX)"),

    /**
     * International Securities Exchange, LLC (ISE)
     */
    ISE('I', "International Securities Exchange, LLC (ISE)"),

    /**
     * Cboe EDGA Exchange, Inc. (Cboe EDGA)
     */
    CBOE_EDGA('J', "Cboe EDGA Exchange, Inc. (Cboe EDGA)"),

    /**
     * Cboe EDGX Exchange, Inc. (Cboe EDGX)
     */
    CBOE_EDGX('K', "Cboe EDGX Exchange, Inc. (Cboe EDGX)"),

    /**
     * Long-Term Stock Exchange, Inc. (LTSE)
     */
    LTSE('L', "Long-Term Stock Exchange, Inc. (LTSE)"),

    /**
     * NYSE Texas, Inc. (NYSE Texas)
     */
    NYSE_TEXAS('M', "NYSE Texas, Inc. (NYSE Texas)"),

    /**
     * New York Stock Exchange, LLC (NYSE)
     */
    NYSE('N', "New York Stock Exchange, LLC (NYSE)"),

    /**
     * NYSE Arca, Inc. (NYSE Arca)
     */
    NYSE_ARCA('P', "NYSE Arca, Inc. (NYSE Arca)"),

    /**
     * Consolidated Quotation System
     */
    CQS('S', "Consolidated Quotation System"),

    /**
     * NASDAQ Stock Market, LLC (NASDAQ)
     */
    NASDAQ('T', "NASDAQ Stock Market, LLC (NASDAQ)"),

    /**
     * Members Exchange, LLC (MEMX)
     */
    MEMX('U', "Members Exchange, LLC (MEMX)"),

    /**
     * Investors' Exchange, LLC. (IEX)
     */
    IEX('V', "Investors' Exchange, LLC. (IEX)"),

    /**
     * CBOE Stock Exchange, Inc. (CBSX)
     */
    CBSX('W', "CBOE Stock Exchange, Inc. (CBSX)"),

    /**
     * NASDAQ OMX PSX, Inc. (NASDAQ OMX PSX)
     */
    NASDAQ_OMX_PSX('X', "NASDAQ OMX PSX, Inc. (NASDAQ OMX PSX)"),

    /**
     * Cboe BYX Exchange, Inc. (Cboe BYX)
     */
    CBOE_BYX('Y', "Cboe BYX Exchange, Inc. (Cboe BYX)"),

    /**
     * Cboe BZX Exchange, Inc. (Cboe BZX)
     */
    CBOE_BZX('Z', "Cboe BZX Exchange, Inc. (Cboe BZX)");

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
            case 'A' -> Optional.of(NYSE_AMERICAN);
            case 'B' -> Optional.of(NASDAQ_OMX_BX);
            case 'C' -> Optional.of(NYSE_NATIONAL);
            case 'D' -> Optional.of(FINRA_ADF);
            case 'G' -> Optional.of(N2_4X);
            case 'H' -> Optional.of(MIAX);
            case 'I' -> Optional.of(ISE);
            case 'J' -> Optional.of(CBOE_EDGA);
            case 'K' -> Optional.of(CBOE_EDGX);
            case 'L' -> Optional.of(LTSE);
            case 'M' -> Optional.of(NYSE_TEXAS);
            case 'N' -> Optional.of(NYSE);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'S' -> Optional.of(CQS);
            case 'T' -> Optional.of(NASDAQ);
            case 'U' -> Optional.of(MEMX);
            case 'V' -> Optional.of(IEX);
            case 'W' -> Optional.of(CBSX);
            case 'X' -> Optional.of(NASDAQ_OMX_PSX);
            case 'Y' -> Optional.of(CBOE_BYX);
            case 'Z' -> Optional.of(CBOE_BZX);
            default -> Optional.empty();
        };
    }
}
