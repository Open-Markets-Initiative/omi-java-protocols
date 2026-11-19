package omi.databento.marketdata.normalized.dbn.v2.enums;

import java.util.Optional;

/**
 * The input symbology type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum StypeIn {

    /**
     * Instrument Id
     */
    INSTRUMENT_ID((short) 0, "Instrument Id"),

    /**
     * Raw Symbol
     */
    RAW_SYMBOL((short) 1, "Raw Symbol"),

    /**
     * Smart
     */
    SMART((short) 2, "Smart"),

    /**
     * Continuous
     */
    CONTINUOUS((short) 3, "Continuous"),

    /**
     * Parent
     */
    PARENT((short) 4, "Parent"),

    /**
     * Nasdaq Symbol
     */
    NASDAQ_SYMBOL((short) 5, "Nasdaq Symbol"),

    /**
     * Cms Symbol
     */
    CMS_SYMBOL((short) 6, "Cms Symbol"),

    /**
     * Isin
     */
    ISIN((short) 7, "Isin"),

    /**
     * Us Code
     */
    US_CODE((short) 8, "Us Code"),

    /**
     * Bbg Comp Id
     */
    BBG_COMP_ID((short) 9, "Bbg Comp Id"),

    /**
     * Bbg Comp Ticker
     */
    BBG_COMP_TICKER((short) 10, "Bbg Comp Ticker"),

    /**
     * Figi
     */
    FIGI((short) 11, "Figi"),

    /**
     * Figi Ticker
     */
    FIGI_TICKER((short) 12, "Figi Ticker"),

    /**
     * Listing Id
     */
    LISTING_ID((short) 13, "Listing Id"),

    /**
     * Issuer Id
     */
    ISSUER_ID((short) 14, "Issuer Id"),

    /**
     * Security Id
     */
    SECURITY_ID((short) 15, "Security Id"),

    /**
     * The input symbology type
     */
    NO_VALUE((short) 255, "The input symbology type");

    private final short wire;

    private final String description;

    StypeIn(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<StypeIn> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(INSTRUMENT_ID);
            case 1 -> Optional.of(RAW_SYMBOL);
            case 2 -> Optional.of(SMART);
            case 3 -> Optional.of(CONTINUOUS);
            case 4 -> Optional.of(PARENT);
            case 5 -> Optional.of(NASDAQ_SYMBOL);
            case 6 -> Optional.of(CMS_SYMBOL);
            case 7 -> Optional.of(ISIN);
            case 8 -> Optional.of(US_CODE);
            case 9 -> Optional.of(BBG_COMP_ID);
            case 10 -> Optional.of(BBG_COMP_TICKER);
            case 11 -> Optional.of(FIGI);
            case 12 -> Optional.of(FIGI_TICKER);
            case 13 -> Optional.of(LISTING_ID);
            case 14 -> Optional.of(ISSUER_ID);
            case 15 -> Optional.of(SECURITY_ID);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
