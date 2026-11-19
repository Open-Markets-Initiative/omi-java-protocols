package omi.aix.aixmarket.geniuminet.itch.v3_0.enums;

import java.util.Optional;

/**
 * Number of decimals in Nominal Value.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum NumberOfDecimalsInNominalValue {

    /**
     * Zero Decimals
     */
    ZERO_DECIMALS(0, "Zero Decimals"),

    /**
     * One Decimals
     */
    ONE_DECIMALS(1, "One Decimals"),

    /**
     * Two Decimals
     */
    TWO_DECIMALS(2, "Two Decimals"),

    /**
     * Three Decimals
     */
    THREE_DECIMALS(3, "Three Decimals"),

    /**
     * Four Decimals
     */
    FOUR_DECIMALS(4, "Four Decimals"),

    /**
     * Five Decimals
     */
    FIVE_DECIMALS(5, "Five Decimals"),

    /**
     * Six Decimals
     */
    SIX_DECIMALS(6, "Six Decimals"),

    /**
     * Seven Decimals
     */
    SEVEN_DECIMALS(7, "Seven Decimals"),

    /**
     * Eight Decimals
     */
    EIGHT_DECIMALS(8, "Eight Decimals"),

    /**
     * Nine Decimals
     */
    NINE_DECIMALS(9, "Nine Decimals");

    private final int wire;

    private final String description;

    NumberOfDecimalsInNominalValue(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<NumberOfDecimalsInNominalValue> fromWire(int wire) {
        return switch (wire) {
            case 0 -> Optional.of(ZERO_DECIMALS);
            case 1 -> Optional.of(ONE_DECIMALS);
            case 2 -> Optional.of(TWO_DECIMALS);
            case 3 -> Optional.of(THREE_DECIMALS);
            case 4 -> Optional.of(FOUR_DECIMALS);
            case 5 -> Optional.of(FIVE_DECIMALS);
            case 6 -> Optional.of(SIX_DECIMALS);
            case 7 -> Optional.of(SEVEN_DECIMALS);
            case 8 -> Optional.of(EIGHT_DECIMALS);
            case 9 -> Optional.of(NINE_DECIMALS);
            default -> Optional.empty();
        };
    }
}
