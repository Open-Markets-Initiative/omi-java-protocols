package omi.blueoceanats.blueequities.memoirlastsale.sbe.v1_3.enums;

import java.util.Optional;

/**
 * The corrected sale condition code level 2, Trade Through Exemption Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CorrectedSaleCondition2 {

    /**
     * IntermarketSweep
     */
    INTERMARKET_SWEEP('F', "IntermarketSweep"),

    /**
     * NotApplicable
     */
    NOT_APPLICABLE(' ', "NotApplicable");

    private final char wire;

    private final String description;

    CorrectedSaleCondition2(char wire, String description) {
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
    public static Optional<CorrectedSaleCondition2> fromWire(char wire) {
        return switch (wire) {
            case 'F' -> Optional.of(INTERMARKET_SWEEP);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
