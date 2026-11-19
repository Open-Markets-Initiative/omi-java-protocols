package omi.cboe.cboeeurope.tradereporting.boe.v2_0_40.enums;

import java.util.Optional;

/**
 * Defines the DeferralReason values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum DeferralReason {

    /**
     * No Deferral Reason
     */
    NO_DEFERRAL_REASON('-', "No Deferral Reason"),

    /**
     * Deferral for Large In Scale (LRGS)
     */
    DEFERRAL_FOR_LARGE_IN_SCALE('6', "Deferral for Large In Scale (LRGS)"),

    /**
     * Deferral for Illiquid Instrument (for RTS2 only) (ILQD) (Deprecated)
     */
    DEFERRAL_FOR_ILLIQUID_INSTRUMENT_7('7', "Deferral for Illiquid Instrument (for RTS2 only) (ILQD) (Deprecated)"),

    /**
     * Deferral for Size Specific (for RTS2 only) (SIZE) (Dep- recated)
     */
    DEFERRAL_FOR_SIZE_SPECIFIC('8', "Deferral for Size Specific (for RTS2 only) (SIZE) (Dep- recated)"),

    /**
     * Deferral for Illiquid Instrument (for RTS2 only) (ILQD) AND Deferral for Large In Scale (LRGS) (Deprecated)
     */
    DEFERRAL_FOR_ILLIQUID_INSTRUMENT_C('C', "Deferral for Illiquid Instrument (for RTS2 only) (ILQD) AND Deferral for Large In Scale (LRGS) (Deprecated)"),

    /**
     * Deferral for Illiquid Instrument (for RTS2 only) (ILQD) AND Deferral for Size Specific (for RTS2 only) (SIZE) (Deprecated)
     */
    DEFERRAL_FOR_ILLIQUID_INSTRUMENT_D('D', "Deferral for Illiquid Instrument (for RTS2 only) (ILQD) AND Deferral for Size Specific (for RTS2 only) (SIZE) (Deprecated)"),

    /**
     * Deferral for transactions in ETCs, ETNs, etc (for RTS only), only applicable on EU APA (DEFF)
     */
    DEFERRAL_FOR_TRANSACTIONS_IN_ET_CS_ET_NS_ETC('G', "Deferral for transactions in ETCs, ETNs, etc (for RTS only), only applicable on EU APA (DEFF)"),

    /**
     * Indicates a Net Asset Value (NAV) Trade. Cboe will publish such trades immediately on receipt and they will not be considered as late reporting, regardless of the arrangement time on the message. Each Deferral Reason is represented by a distinct value that can be requested individually. Deferrals that can be applied together are represented by values that indicates the deferrals being set together. Based upon what is requested, the system calculates which of these are valid. The business confirmation contains the deferral(s) that have been appplied. The values 7, 8, C, D are deprecated and are only valid on EU APA with TradeTime set to a date before 2 March 2026.
     */
    INDICATES_A_NET_ASSET_VALUE('V', "Indicates a Net Asset Value (NAV) Trade. Cboe will publish such trades immediately on receipt and they will not be considered as late reporting, regardless of the arrangement time on the message. Each Deferral Reason is represented by a distinct value that can be requested individually. Deferrals that can be applied together are represented by values that indicates the deferrals being set together. Based upon what is requested, the system calculates which of these are valid. The business confirmation contains the deferral(s) that have been appplied. The values 7, 8, C, D are deprecated and are only valid on EU APA with TradeTime set to a date before 2 March 2026.");

    private final char wire;

    private final String description;

    DeferralReason(char wire, String description) {
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
    public static Optional<DeferralReason> fromWire(char wire) {
        return switch (wire) {
            case '-' -> Optional.of(NO_DEFERRAL_REASON);
            case '6' -> Optional.of(DEFERRAL_FOR_LARGE_IN_SCALE);
            case '7' -> Optional.of(DEFERRAL_FOR_ILLIQUID_INSTRUMENT_7);
            case '8' -> Optional.of(DEFERRAL_FOR_SIZE_SPECIFIC);
            case 'C' -> Optional.of(DEFERRAL_FOR_ILLIQUID_INSTRUMENT_C);
            case 'D' -> Optional.of(DEFERRAL_FOR_ILLIQUID_INSTRUMENT_D);
            case 'G' -> Optional.of(DEFERRAL_FOR_TRANSACTIONS_IN_ET_CS_ET_NS_ETC);
            case 'V' -> Optional.of(INDICATES_A_NET_ASSET_VALUE);
            default -> Optional.empty();
        };
    }
}
