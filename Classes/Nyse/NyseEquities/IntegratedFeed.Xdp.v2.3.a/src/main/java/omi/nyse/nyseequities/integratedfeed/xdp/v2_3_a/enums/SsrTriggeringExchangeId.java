package omi.nyse.nyseequities.integratedfeed.xdp.v2_3_a.enums;

import java.util.Optional;

/**
 * This field is only populated when securityStatus = A and this security is listed on this exchange. Otherwise it is defaulted to 0x20.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SsrTriggeringExchangeId {

    /**
     * NYSE American
     */
    NYSE_AMERICAN('A', "NYSE American"),

    /**
     * NASDAQ OMX BX
     */
    NASDAQ_OMX_BX('B', "NASDAQ OMX BX"),

    /**
     * NYSE National
     */
    NYSE_NATIONAL('C', "NYSE National"),

    /**
     * Miami Pearl
     */
    MIAMI_PEARL('H', "Miami Pearl"),

    /**
     * Nasdaq ISE
     */
    NASDAQ_ISE('I', "Nasdaq ISE"),

    /**
     * CBOE EDGA
     */
    CBOE_EDGA('J', "CBOE EDGA"),

    /**
     * CBOE EDGX
     */
    CBOE_EDGX('K', "CBOE EDGX"),

    /**
     * LTSE
     */
    LTSE('L', "LTSE"),

    /**
     * NYSE Chicago
     */
    NYSE_CHICAGO('M', "NYSE Chicago"),

    /**
     * NYSE
     */
    NYSE('N', "NYSE"),

    /**
     * NYSE Arca
     */
    NYSE_ARCA('P', "NYSE Arca"),

    /**
     * NASDAQ
     */
    NASDAQ('Q', "NASDAQ"),

    /**
     * NASDAQ OMX
     */
    NASDAQ_OMX('T', "NASDAQ OMX"),

    /**
     * MEMX
     */
    MEMX('U', "MEMX"),

    /**
     * IEX
     */
    IEX('V', "IEX"),

    /**
     * CBSX
     */
    CBSX('W', "CBSX"),

    /**
     * NASDAQ OMX PSX
     */
    NASDAQ_OMX_PSX('X', "NASDAQ OMX PSX"),

    /**
     * CBOE BYX
     */
    CBOE_BYX('Y', "CBOE BYX"),

    /**
     * CBOE BZX
     */
    CBOE_BZX('Z', "CBOE BZX"),

    /**
     * Default (0x20) when the field is not populated
     */
    NO_VALUE(' ', "Default (0x20) when the field is not populated");

    private final char wire;

    private final String description;

    SsrTriggeringExchangeId(char wire, String description) {
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
    public static Optional<SsrTriggeringExchangeId> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NYSE_AMERICAN);
            case 'B' -> Optional.of(NASDAQ_OMX_BX);
            case 'C' -> Optional.of(NYSE_NATIONAL);
            case 'H' -> Optional.of(MIAMI_PEARL);
            case 'I' -> Optional.of(NASDAQ_ISE);
            case 'J' -> Optional.of(CBOE_EDGA);
            case 'K' -> Optional.of(CBOE_EDGX);
            case 'L' -> Optional.of(LTSE);
            case 'M' -> Optional.of(NYSE_CHICAGO);
            case 'N' -> Optional.of(NYSE);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'Q' -> Optional.of(NASDAQ);
            case 'T' -> Optional.of(NASDAQ_OMX);
            case 'U' -> Optional.of(MEMX);
            case 'V' -> Optional.of(IEX);
            case 'W' -> Optional.of(CBSX);
            case 'X' -> Optional.of(NASDAQ_OMX_PSX);
            case 'Y' -> Optional.of(CBOE_BYX);
            case 'Z' -> Optional.of(CBOE_BZX);
            case ' ' -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
