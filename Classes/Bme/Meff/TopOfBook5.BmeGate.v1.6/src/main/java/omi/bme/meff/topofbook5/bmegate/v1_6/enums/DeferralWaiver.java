package omi.bme.meff.topofbook5.bmegate.v1_6.enums;

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
     * Non Immediate Publication Deferral For Large In Scale Lrgs
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_LARGE_IN_SCALE_LRGS('6', "Non Immediate Publication Deferral For Large In Scale Lrgs"),

    /**
     * Non Immediate Publication Deferral For Illiquid Instrument Ilqd
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_ILLIQUID_INSTRUMENT_ILQD('7', "Non Immediate Publication Deferral For Illiquid Instrument Ilqd"),

    /**
     * Non Immediate Publication Deferral For Size Specific Size Rts 2
     */
    NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_SIZE_SPECIFIC_SIZE_RTS_2('8', "Non Immediate Publication Deferral For Size Specific Size Rts 2");

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
            case '6' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_LARGE_IN_SCALE_LRGS);
            case '7' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_ILLIQUID_INSTRUMENT_ILQD);
            case '8' -> Optional.of(NON_IMMEDIATE_PUBLICATION_DEFERRAL_FOR_SIZE_SPECIFIC_SIZE_RTS_2);
            default -> Optional.empty();
        };
    }
}
