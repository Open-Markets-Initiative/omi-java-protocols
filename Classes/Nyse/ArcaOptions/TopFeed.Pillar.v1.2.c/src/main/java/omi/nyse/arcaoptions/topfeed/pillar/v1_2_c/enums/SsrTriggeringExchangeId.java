package omi.nyse.arcaoptions.topfeed.pillar.v1_2_c.enums;

import java.util.Optional;

/**
 * This field is only populated when securityStatus = A and this security is listed on this exchange. Otherwise it is defaulted to 0x20.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SsrTriggeringExchangeId {

    /**
     * Nyse American
     */
    NYSE_AMERICAN('A', "Nyse American"),

    /**
     * Nasdaq Omx Bx
     */
    NASDAQ_OMX_BX('B', "Nasdaq Omx Bx"),

    /**
     * Nyse National
     */
    NYSE_NATIONAL('C', "Nyse National"),

    /**
     * Finra
     */
    FINRA('D', "Finra"),

    /**
     * Ise
     */
    ISE('I', "Ise"),

    /**
     * Edga
     */
    EDGA('J', "Edga"),

    /**
     * Cboe Edgx
     */
    CBOE_EDGX('K', "Cboe Edgx"),

    /**
     * Ltse
     */
    LTSE('L', "Ltse"),

    /**
     * Nyse Chicago
     */
    NYSE_CHICAGO('M', "Nyse Chicago"),

    /**
     * Nyse
     */
    NYSE('N', "Nyse"),

    /**
     * Nyse Arca
     */
    NYSE_ARCA('P', "Nyse Arca"),

    /**
     * Nasdaq
     */
    NASDAQ('Q', "Nasdaq"),

    /**
     * Cts
     */
    CTS('S', "Cts"),

    /**
     * Nasdaq Omx
     */
    NASDAQ_OMX('T', "Nasdaq Omx"),

    /**
     * Iex
     */
    IEX('V', "Iex"),

    /**
     * Cbsx
     */
    CBSX('W', "Cbsx"),

    /**
     * Nasdaq Omx Psx
     */
    NASDAQ_OMX_PSX('X', "Nasdaq Omx Psx"),

    /**
     * Cboe Byx
     */
    CBOE_BYX('Y', "Cboe Byx"),

    /**
     * Cboe Bzx
     */
    CBOE_BZX('Z', "Cboe Bzx"),

    /**
     * Miax
     */
    MIAX('H', "Miax"),

    /**
     * Memx
     */
    MEMX('U', "Memx"),

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
            case 'K' -> Optional.of(CBOE_EDGX);
            case 'L' -> Optional.of(LTSE);
            case 'M' -> Optional.of(NYSE_CHICAGO);
            case 'N' -> Optional.of(NYSE);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'Q' -> Optional.of(NASDAQ);
            case 'S' -> Optional.of(CTS);
            case 'T' -> Optional.of(NASDAQ_OMX);
            case 'V' -> Optional.of(IEX);
            case 'W' -> Optional.of(CBSX);
            case 'X' -> Optional.of(NASDAQ_OMX_PSX);
            case 'Y' -> Optional.of(CBOE_BYX);
            case 'Z' -> Optional.of(CBOE_BZX);
            case 'H' -> Optional.of(MIAX);
            case 'U' -> Optional.of(MEMX);
            case ' ' -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
