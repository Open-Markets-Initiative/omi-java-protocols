package omi.lseg.tradeecho.mifid2posttraderecovery.gtp.v27_2_2.enums;

import java.util.Optional;

/**
 * Post trade deferral reason short code.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PostTradeDeferralReason {

    /**
     * Non Immediate Publication Deferral For Large In Scale
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_LARGE_IN_SCALE('2', "Non Immediate Publication Deferral For Large In Scale"),

    /**
     * Non Immediate Publication Deferral For Illiquid Instrument
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_ILLIQUID_INSTRUMENT('3', "Non Immediate Publication Deferral For Illiquid Instrument"),

    /**
     * Non Immediate Publication Deferral For Size Specific
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_SIZE_SPECIFIC('4', "Non Immediate Publication Deferral For Size Specific"),

    /**
     * Non Immediate Publication Deferrals Of Illiquid Instrument And Size Specific
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRALS_OF_ILLIQUID_INSTRUMENT_AND_SIZE_SPECIFIC('5', "Non Immediate Publication Deferrals Of Illiquid Instrument And Size Specific"),

    /**
     * Non Immediate Publication Deferrals Of Illiquid Instrument And Large In Scale
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRALS_OF_ILLIQUID_INSTRUMENT_AND_LARGE_IN_SCALE('6', "Non Immediate Publication Deferrals Of Illiquid Instrument And Large In Scale"),

    /**
     * Non Immediate Publication Deferral For Medium Size Liquid Market
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_MEDIUM_SIZE_LIQUID_MARKET('A', "Non Immediate Publication Deferral For Medium Size Liquid Market"),

    /**
     * Non Immediate Publication Deferral For Medium Size Illiquid Market
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_MEDIUM_SIZE_ILLIQUID_MARKET('B', "Non Immediate Publication Deferral For Medium Size Illiquid Market"),

    /**
     * Non Immediate Publication Deferral For Large Size Liquid Market
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_LARGE_SIZE_LIQUID_MARKET('C', "Non Immediate Publication Deferral For Large Size Liquid Market"),

    /**
     * Non Immediate Publication Deferral For Large Size Illiquid Market
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_LARGE_SIZE_ILLIQUID_MARKET('D', "Non Immediate Publication Deferral For Large Size Illiquid Market"),

    /**
     * Non Immediate Publication Deferral For Very Large Size Liquid Market
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_VERY_LARGE_SIZE_LIQUID_MARKET('E', "Non Immediate Publication Deferral For Very Large Size Liquid Market"),

    /**
     * Non Immediate Publication Deferral For Very Large Size Illiquid Market
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_VERY_LARGE_SIZE_ILLIQUID_MARKET('F', "Non Immediate Publication Deferral For Very Large Size Illiquid Market"),

    /**
     * Non Immediate Publication Deferral For Et Cs Et Ns Sf Ps Emission Allowances
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_ET_CS_ET_NS_SF_PS_EMISSION_ALLOWANCES('G', "Non Immediate Publication Deferral For Et Cs Et Ns Sf Ps Emission Allowances"),

    /**
     * Immediate Publication
     */
    IMMEDIATE_PUBLICATION('-', "Immediate Publication");

    private final char wire;

    private final String description;

    PostTradeDeferralReason(char wire, String description) {
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
    public static Optional<PostTradeDeferralReason> fromWire(char wire) {
        return switch (wire) {
            case '2' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_LARGE_IN_SCALE);
            case '3' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_ILLIQUID_INSTRUMENT);
            case '4' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_SIZE_SPECIFIC);
            case '5' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRALS_OF_ILLIQUID_INSTRUMENT_AND_SIZE_SPECIFIC);
            case '6' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRALS_OF_ILLIQUID_INSTRUMENT_AND_LARGE_IN_SCALE);
            case 'A' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_MEDIUM_SIZE_LIQUID_MARKET);
            case 'B' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_MEDIUM_SIZE_ILLIQUID_MARKET);
            case 'C' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_LARGE_SIZE_LIQUID_MARKET);
            case 'D' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_LARGE_SIZE_ILLIQUID_MARKET);
            case 'E' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_VERY_LARGE_SIZE_LIQUID_MARKET);
            case 'F' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_VERY_LARGE_SIZE_ILLIQUID_MARKET);
            case 'G' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_ET_CS_ET_NS_SF_PS_EMISSION_ALLOWANCES);
            case '-' -> Optional.of(IMMEDIATE_PUBLICATION);
            default -> Optional.empty();
        };
    }
}
