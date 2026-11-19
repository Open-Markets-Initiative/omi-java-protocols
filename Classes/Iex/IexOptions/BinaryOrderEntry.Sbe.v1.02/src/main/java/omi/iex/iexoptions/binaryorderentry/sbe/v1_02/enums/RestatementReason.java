package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.enums;

import java.util.Optional;

/**
 * restatementReason
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum RestatementReason {

    /**
     * PriceAdjustRepricing
     */
    PRICE_ADJUST_REPRICING((byte) 1, "PriceAdjustRepricing"),

    /**
     * DrillThroughProtectionRepricing
     */
    DRILL_THROUGH_PROTECTION_REPRICING((byte) 2, "DrillThroughProtectionRepricing"),

    /**
     * TradingHalt
     */
    TRADING_HALT((byte) 3, "TradingHalt"),

    /**
     * SUMConclusion
     */
    SUM_CONCLUSION((byte) 4, "SUMConclusion"),

    /**
     * BookResubmission
     */
    BOOK_RESUBMISSION((byte) 5, "BookResubmission");

    private final byte wire;

    private final String description;

    RestatementReason(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<RestatementReason> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(PRICE_ADJUST_REPRICING);
            case 2 -> Optional.of(DRILL_THROUGH_PROTECTION_REPRICING);
            case 3 -> Optional.of(TRADING_HALT);
            case 4 -> Optional.of(SUM_CONCLUSION);
            case 5 -> Optional.of(BOOK_RESUBMISSION);
            default -> Optional.empty();
        };
    }
}
