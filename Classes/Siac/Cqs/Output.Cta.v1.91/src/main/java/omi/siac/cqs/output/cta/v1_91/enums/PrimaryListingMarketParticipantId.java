package omi.siac.cqs.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * Identifies the Primary Listing Market for a security
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PrimaryListingMarketParticipantId {

    /**
     * Primary Listing Market Participant Id Not Applicable
     */
    PRIMARY_LISTING_MARKET_PARTICIPANT_ID_NOT_APPLICABLE(' ', "Primary Listing Market Participant Id Not Applicable"),

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
     * Finra Adf
     */
    FINRA_ADF('D', "Finra Adf"),

    /**
     * Ise
     */
    ISE('I', "Ise"),

    /**
     * Cboe Edga
     */
    CBOE_EDGA('J', "Cboe Edga"),

    /**
     * Cboe Edgx
     */
    CBOE_EDGX('K', "Cboe Edgx"),

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
    NASDAQ('T', "Nasdaq"),

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
    CBOE_BZX('Z', "Cboe Bzx");

    private final char wire;

    private final String description;

    PrimaryListingMarketParticipantId(char wire, String description) {
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
    public static Optional<PrimaryListingMarketParticipantId> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(PRIMARY_LISTING_MARKET_PARTICIPANT_ID_NOT_APPLICABLE);
            case 'A' -> Optional.of(NYSE_AMERICAN);
            case 'B' -> Optional.of(NASDAQ_OMX_BX);
            case 'C' -> Optional.of(NYSE_NATIONAL);
            case 'D' -> Optional.of(FINRA_ADF);
            case 'I' -> Optional.of(ISE);
            case 'J' -> Optional.of(CBOE_EDGA);
            case 'K' -> Optional.of(CBOE_EDGX);
            case 'M' -> Optional.of(NYSE_CHICAGO);
            case 'N' -> Optional.of(NYSE);
            case 'P' -> Optional.of(NYSE_ARCA);
            case 'T' -> Optional.of(NASDAQ);
            case 'V' -> Optional.of(IEX);
            case 'W' -> Optional.of(CBSX);
            case 'X' -> Optional.of(NASDAQ_OMX_PSX);
            case 'Y' -> Optional.of(CBOE_BYX);
            case 'Z' -> Optional.of(CBOE_BZX);
            default -> Optional.empty();
        };
    }
}
