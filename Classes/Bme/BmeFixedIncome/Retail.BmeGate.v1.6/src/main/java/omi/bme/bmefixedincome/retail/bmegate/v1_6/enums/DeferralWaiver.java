package omi.bme.bmefixedincome.retail.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Deferral Waiver
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DeferralWaiver {

    /**
     * Immediate Publication
     */
    IMMEDIATE_PUBLICATION(' ', "Immediate Publication"),

    /**
     * Non Immediate Publication Deferral For Medium Size Liquid Market Mlf 1
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_MEDIUM_SIZE_LIQUID_MARKET_MLF_1('A', "Non Immediate Publication Deferral For Medium Size Liquid Market Mlf 1"),

    /**
     * Non Immediate Publication Deferral For Medium Size Illiquid Market Mif 2
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_MEDIUM_SIZE_ILLIQUID_MARKET_MIF_2('B', "Non Immediate Publication Deferral For Medium Size Illiquid Market Mif 2"),

    /**
     * Non Immediate Publication Deferral For Large Size Liquid Market Llf 3
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_LARGE_SIZE_LIQUID_MARKET_LLF_3('C', "Non Immediate Publication Deferral For Large Size Liquid Market Llf 3"),

    /**
     * Non Immediate Publication Deferral For Large Size Illiquid Market Lif 4
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_LARGE_SIZE_ILLIQUID_MARKET_LIF_4('D', "Non Immediate Publication Deferral For Large Size Illiquid Market Lif 4"),

    /**
     * Non Immediate Publication Deferral For Very Large Size Liquid Market Vlf 5
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_VERY_LARGE_SIZE_LIQUID_MARKET_VLF_5('E', "Non Immediate Publication Deferral For Very Large Size Liquid Market Vlf 5"),

    /**
     * Non Immediate Publication Deferral For Very Large Size Illiquid Market Vif 5
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_VERY_LARGE_SIZE_ILLIQUID_MARKET_VIF_5('F', "Non Immediate Publication Deferral For Very Large Size Illiquid Market Vif 5"),

    /**
     * Non-Immediate Publication: Deferral for ETCs, ETNs, SFPs, Emission Allowances "DEFF"
     */
    DEFERRAL_FOR_ETCS_ETNS_SFPS_EMISSION_ALLOWANCES_DEFF('G', "Non-Immediate Publication: Deferral for ETCs, ETNs, SFPs, Emission Allowances \"DEFF\"");

    private final char wire;

    private final String description;

    DeferralWaiver(char wire, String description) {
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
    public static Optional<DeferralWaiver> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(IMMEDIATE_PUBLICATION);
            case 'A' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_MEDIUM_SIZE_LIQUID_MARKET_MLF_1);
            case 'B' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_MEDIUM_SIZE_ILLIQUID_MARKET_MIF_2);
            case 'C' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_LARGE_SIZE_LIQUID_MARKET_LLF_3);
            case 'D' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_LARGE_SIZE_ILLIQUID_MARKET_LIF_4);
            case 'E' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_VERY_LARGE_SIZE_LIQUID_MARKET_VLF_5);
            case 'F' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_VERY_LARGE_SIZE_ILLIQUID_MARKET_VIF_5);
            case 'G' -> Optional.of(DEFERRAL_FOR_ETCS_ETNS_SFPS_EMISSION_ALLOWANCES_DEFF);
            default -> Optional.empty();
        };
    }
}
