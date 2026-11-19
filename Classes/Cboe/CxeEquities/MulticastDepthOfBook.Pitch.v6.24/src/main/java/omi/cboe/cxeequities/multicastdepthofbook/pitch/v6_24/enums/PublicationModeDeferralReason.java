package omi.cboe.cxeequities.multicastdepthofbook.pitch.v6_24.enums;

import java.util.Optional;

/**
 * MMT Level 4.1
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PublicationModeDeferralReason {

    /**
     * Trade Report Reported Late Without Permitted Deferral
     */
    TRADE_REPORT_REPORTED_LATE_WITHOUT_PERMITTED_DEFERRAL('1', "Trade Report Reported Late Without Permitted Deferral"),

    /**
     * Deferral Trade For Large In Scale
     */
    DEFERRAL_TRADE_FOR_LARGE_IN_SCALE('2', "Deferral Trade For Large In Scale"),

    /**
     * Deferral Trade For Illiquid Instrument
     */
    DEFERRAL_TRADE_FOR_ILLIQUID_INSTRUMENT('3', "Deferral Trade For Illiquid Instrument"),

    /**
     * Deferral Trade For Size Specific
     */
    DEFERRAL_TRADE_FOR_SIZE_SPECIFIC('4', "Deferral Trade For Size Specific"),

    /**
     * Deferral Trade For Illiquid Instrument And Size Specific
     */
    DEFERRAL_TRADE_FOR_ILLIQUID_INSTRUMENT_AND_SIZE_SPECIFIC('5', "Deferral Trade For Illiquid Instrument And Size Specific"),

    /**
     * Deferral Trade For Illiquid Instrument And Large In Scale
     */
    DEFERRAL_TRADE_FOR_ILLIQUID_INSTRUMENT_AND_LARGE_IN_SCALE('6', "Deferral Trade For Illiquid Instrument And Large In Scale"),

    /**
     * Not Specified Immediate Publication
     */
    NOT_SPECIFIED_IMMEDIATE_PUBLICATION('-', "Not Specified Immediate Publication");

    private final char wire;

    private final String description;

    PublicationModeDeferralReason(char wire, String description) {
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
    public static Optional<PublicationModeDeferralReason> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(TRADE_REPORT_REPORTED_LATE_WITHOUT_PERMITTED_DEFERRAL);
            case '2' -> Optional.of(DEFERRAL_TRADE_FOR_LARGE_IN_SCALE);
            case '3' -> Optional.of(DEFERRAL_TRADE_FOR_ILLIQUID_INSTRUMENT);
            case '4' -> Optional.of(DEFERRAL_TRADE_FOR_SIZE_SPECIFIC);
            case '5' -> Optional.of(DEFERRAL_TRADE_FOR_ILLIQUID_INSTRUMENT_AND_SIZE_SPECIFIC);
            case '6' -> Optional.of(DEFERRAL_TRADE_FOR_ILLIQUID_INSTRUMENT_AND_LARGE_IN_SCALE);
            case '-' -> Optional.of(NOT_SPECIFIED_IMMEDIATE_PUBLICATION);
            default -> Optional.empty();
        };
    }
}
