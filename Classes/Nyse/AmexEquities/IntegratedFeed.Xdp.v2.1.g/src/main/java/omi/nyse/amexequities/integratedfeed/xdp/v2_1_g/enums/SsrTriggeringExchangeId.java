package omi.nyse.amexequities.integratedfeed.xdp.v2_1_g.enums;

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
     * FINRA
     */
    FINRA('D', "FINRA"),

    /**
     * ISE
     */
    ISE('I', "ISE"),

    /**
     * EDGA
     */
    EDGA('J', "EDGA"),

    /**
     * EDGX
     */
    EDGX('K', "EDGX"),

    /**
     * CHX
     */
    CHX('M', "CHX"),

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
     * CTS
     */
    CTS('S', "CTS"),

    /**
     * NASDAQ OMX
     */
    NASDAQ_OMX('T', "NASDAQ OMX"),

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
     * BATS Y
     */
    BATS_Y('Y', "BATS Y"),

    /**
     * BATS
     */
    BATS('Z', "BATS"),

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
            case 'D' -> Optional.of(FINRA);
            case 'I' -> Optional.of(ISE);
            case 'J' -> Optional.of(EDGA);
            case 'K' -> Optional.of(EDGX);
            case 'M' -> Optional.of(CHX);
            case 'N' -> Optional.of(NYSE);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'Q' -> Optional.of(NASDAQ);
            case 'S' -> Optional.of(CTS);
            case 'T' -> Optional.of(NASDAQ_OMX);
            case 'V' -> Optional.of(IEX);
            case 'W' -> Optional.of(CBSX);
            case 'X' -> Optional.of(NASDAQ_OMX_PSX);
            case 'Y' -> Optional.of(BATS_Y);
            case 'Z' -> Optional.of(BATS);
            case ' ' -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
