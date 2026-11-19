package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * MMT Post-Trade Deferral Reason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MmtPostTradeDeferralReason {

    /**
     * - = Immediate Publication
     */
    IMMEDIATE_PUBLICATION((short) 1, "- = Immediate Publication"),

    /**
     * 1 = Non-Immediate Publication
     */
    NON_IMMEDIATE_PUBLICATION((short) 2, "1 = Non-Immediate Publication"),

    /**
     * 2 = Non-Immediate Publication : Deferral for 'Large in Scale'
     */
    NON_IMMEDIATE_PUBLICATION_LARGE_IN_SCALE((short) 3, "2 = Non-Immediate Publication : Deferral for 'Large in Scale'"),

    /**
     * 3 = Non-Immediate Publication : Deferral for 'Illiquid Instrument' (for RTS 2 only)
     */
    NON_IMMEDIATE_PUBLICATION_ILLIQUID_INSTRUMENT((short) 4, "3 = Non-Immediate Publication : Deferral for 'Illiquid Instrument' (for RTS 2 only)"),

    /**
     * 4 = Non-Immediate Publication : Deferral for 'Size Specific' (for RTS 2 only)
     */
    NON_IMMEDIATE_PUBLICATION_SIZE_SPECIFIC((short) 5, "4 = Non-Immediate Publication : Deferral for 'Size Specific' (for RTS 2 only)"),

    /**
     * 5 = Non-Immediate Publication : Deferrals of ILQD and SIZE (for RTS 2 use only)
     */
    NON_IMMEDIATE_PUBLICATION_ILQD_AND_SIZE((short) 6, "5 = Non-Immediate Publication : Deferrals of ILQD and SIZE (for RTS 2 use only)"),

    /**
     * 6 = Non-Immediate Publication : Deferrals of ILQD and LRGS (for RTS 2 use only)
     */
    NON_IMMEDIATE_PUBLICATION_ILQD_AND_LRGS((short) 7, "6 = Non-Immediate Publication : Deferrals of ILQD and LRGS (for RTS 2 use only)");

    private final short wire;

    private final String description;

    MmtPostTradeDeferralReason(short wire, String description) {
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
    public static Optional<MmtPostTradeDeferralReason> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(IMMEDIATE_PUBLICATION);
            case 2 -> Optional.of(NON_IMMEDIATE_PUBLICATION);
            case 3 -> Optional.of(NON_IMMEDIATE_PUBLICATION_LARGE_IN_SCALE);
            case 4 -> Optional.of(NON_IMMEDIATE_PUBLICATION_ILLIQUID_INSTRUMENT);
            case 5 -> Optional.of(NON_IMMEDIATE_PUBLICATION_SIZE_SPECIFIC);
            case 6 -> Optional.of(NON_IMMEDIATE_PUBLICATION_ILQD_AND_SIZE);
            case 7 -> Optional.of(NON_IMMEDIATE_PUBLICATION_ILQD_AND_LRGS);
            default -> Optional.empty();
        };
    }
}
