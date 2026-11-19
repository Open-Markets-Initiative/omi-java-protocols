package omi.cboe.cboeeurope.tradereporting.boe.v2_0_23.enums;

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
     * Deferral for Illiquid Instrument (for RTS2 only) (ILQD)
     */
    DEFERRAL_FOR_ILLIQUID_INSTRUMENT_7('7', "Deferral for Illiquid Instrument (for RTS2 only) (ILQD)"),

    /**
     * Deferral for Size Specific (for RTS2 only) (SIZE)
     */
    DEFERRAL_FOR_SIZE_SPECIFIC('8', "Deferral for Size Specific (for RTS2 only) (SIZE)"),

    /**
     * Deferral for Illiquid Instrument (for RTS2 only) (ILQD) AND Deferral for Large In Scale (LRGS)
     */
    DEFERRAL_FOR_ILLIQUID_INSTRUMENT_C('C', "Deferral for Illiquid Instrument (for RTS2 only) (ILQD) AND Deferral for Large In Scale (LRGS)"),

    /**
     * Deferral for Illiquid Instrument (for RTS2 only) (ILQD) AND Deferral for Size Specific (for RTS2 only) (SIZE) Each Deferral Reason is represented by a distinct value that can be requested individually. Deferrals that can be applied together are represented by values that indicates the deferrals being set together. Based upon what is requested, the system calculates which of these are valid. The business confirmation contains the deferral(s) that have been appplied.
     */
    DEFERRAL_FOR_ILLIQUID_INSTRUMENT_D('D', "Deferral for Illiquid Instrument (for RTS2 only) (ILQD) AND Deferral for Size Specific (for RTS2 only) (SIZE) Each Deferral Reason is represented by a distinct value that can be requested individually. Deferrals that can be applied together are represented by values that indicates the deferrals being set together. Based upon what is requested, the system calculates which of these are valid. The business confirmation contains the deferral(s) that have been appplied.");

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
            default -> Optional.empty();
        };
    }
}
