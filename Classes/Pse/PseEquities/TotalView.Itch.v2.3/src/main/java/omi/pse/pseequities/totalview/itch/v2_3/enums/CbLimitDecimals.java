package omi.pse.pseequities.totalview.itch.v2_3.enums;

import java.util.Optional;

/**
 * Decimals to apply to the CB Limit Up % and CB Limit Down % values.
 *
 * <p>Backed by long. Values correspond to the wire integer encoding.</p>
 */
public enum CbLimitDecimals {

    /**
     * Zero Decimals
     */
    ZERO_DECIMALS(0x0L, "Zero Decimals"),

    /**
     * One Decimals
     */
    ONE_DECIMALS(0x1L, "One Decimals"),

    /**
     * Two Decimals
     */
    TWO_DECIMALS(0x2L, "Two Decimals"),

    /**
     * Three Decimals
     */
    THREE_DECIMALS(0x3L, "Three Decimals"),

    /**
     * Four Decimals
     */
    FOUR_DECIMALS(0x4L, "Four Decimals"),

    /**
     * Five Decimals
     */
    FIVE_DECIMALS(0x5L, "Five Decimals"),

    /**
     * Six Decimals
     */
    SIX_DECIMALS(0x6L, "Six Decimals"),

    /**
     * Seven Decimals
     */
    SEVEN_DECIMALS(0x7L, "Seven Decimals"),

    /**
     * Eight Decimals
     */
    EIGHT_DECIMALS(0x8L, "Eight Decimals"),

    /**
     * Nine Decimals
     */
    NINE_DECIMALS(0x9L, "Nine Decimals");

    private final long wire;

    private final String description;

    CbLimitDecimals(long wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public long wire() {
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
    public static Optional<CbLimitDecimals> fromWire(long wire) {
        if (wire == 0L) {
            return Optional.of(ZERO_DECIMALS);
        }
        if (wire == 1L) {
            return Optional.of(ONE_DECIMALS);
        }
        if (wire == 2L) {
            return Optional.of(TWO_DECIMALS);
        }
        if (wire == 3L) {
            return Optional.of(THREE_DECIMALS);
        }
        if (wire == 4L) {
            return Optional.of(FOUR_DECIMALS);
        }
        if (wire == 5L) {
            return Optional.of(FIVE_DECIMALS);
        }
        if (wire == 6L) {
            return Optional.of(SIX_DECIMALS);
        }
        if (wire == 7L) {
            return Optional.of(SEVEN_DECIMALS);
        }
        if (wire == 8L) {
            return Optional.of(EIGHT_DECIMALS);
        }
        if (wire == 9L) {
            return Optional.of(NINE_DECIMALS);
        }
        return Optional.empty();
    }
}
