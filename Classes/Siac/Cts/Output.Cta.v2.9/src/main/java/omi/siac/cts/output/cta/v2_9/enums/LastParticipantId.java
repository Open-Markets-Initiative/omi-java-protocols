package omi.siac.cts.output.cta.v2_9.enums;

import java.util.Optional;

/**
 * Refer to Participant ID field description for Participant codes
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LastParticipantId {

    /**
     * NYSE American
     */
    NYSE_AMERICAN('A', "NYSE American"),

    /**
     * NASDAQ BX
     */
    NASDAQ_BX('B', "NASDAQ BX"),

    /**
     * NYSE National
     */
    NYSE_NATIONAL('C', "NYSE National"),

    /**
     * FINRA Alternative Display Facility
     */
    FINRA_ADF('D', "FINRA Alternative Display Facility"),

    /**
     * International Securities Exchange
     */
    ISE('I', "International Securities Exchange"),

    /**
     * Cboe EDGA Exchange
     */
    CBOE_EDGA('J', "Cboe EDGA Exchange"),

    /**
     * Cboe EDGX Exchange
     */
    CBOE_EDGX('K', "Cboe EDGX Exchange"),

    /**
     * Long-Term Stock Exchange
     */
    LTSE('L', "Long-Term Stock Exchange"),

    /**
     * NYSE Chicago
     */
    NYSE_CHICAGO('M', "NYSE Chicago"),

    /**
     * New York Stock Exchange
     */
    NYSE('N', "New York Stock Exchange"),

    /**
     * NYSE Arca
     */
    NYSE_ARCA('P', "NYSE Arca"),

    /**
     * Consolidated Tape System
     */
    CTS('S', "Consolidated Tape System"),

    /**
     * NASDAQ Stock Market
     */
    NASDAQ('T', "NASDAQ Stock Market"),

    /**
     * Investors Exchange
     */
    IEX('V', "Investors Exchange"),

    /**
     * CBOE Stock Exchange
     */
    CBSX('W', "CBOE Stock Exchange"),

    /**
     * NASDAQ OMX PSX
     */
    NASDAQ_PSX('X', "NASDAQ OMX PSX"),

    /**
     * Cboe BYX Exchange
     */
    CBOE_BYX('Y', "Cboe BYX Exchange"),

    /**
     * Cboe BZX Exchange
     */
    CBOE_BZX('Z', "Cboe BZX Exchange");

    private final char wire;

    private final String description;

    LastParticipantId(char wire, String description) {
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
    public static Optional<LastParticipantId> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NYSE_AMERICAN);
            case 'B' -> Optional.of(NASDAQ_BX);
            case 'C' -> Optional.of(NYSE_NATIONAL);
            case 'D' -> Optional.of(FINRA_ADF);
            case 'I' -> Optional.of(ISE);
            case 'J' -> Optional.of(CBOE_EDGA);
            case 'K' -> Optional.of(CBOE_EDGX);
            case 'L' -> Optional.of(LTSE);
            case 'M' -> Optional.of(NYSE_CHICAGO);
            case 'N' -> Optional.of(NYSE);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'S' -> Optional.of(CTS);
            case 'T' -> Optional.of(NASDAQ);
            case 'V' -> Optional.of(IEX);
            case 'W' -> Optional.of(CBSX);
            case 'X' -> Optional.of(NASDAQ_PSX);
            case 'Y' -> Optional.of(CBOE_BYX);
            case 'Z' -> Optional.of(CBOE_BZX);
            default -> Optional.empty();
        };
    }
}
