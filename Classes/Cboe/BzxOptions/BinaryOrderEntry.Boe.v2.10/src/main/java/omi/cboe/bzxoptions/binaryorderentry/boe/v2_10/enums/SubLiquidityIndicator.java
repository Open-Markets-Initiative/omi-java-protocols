package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.enums;

import java.util.Optional;

/**
 * Defines the SubLiquidityIndicator values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SubLiquidityIndicator {

    /**
     * Execution From Order That Set The Nbbo
     */
    EXECUTION_FROM_ORDER_THAT_SET_THE_NBBO('S', "Execution From Order That Set The Nbbo"),

    /**
     * Step Up Mechanism
     */
    STEP_UP_MECHANISM('B', "Step Up Mechanism"),

    /**
     * Carried
     */
    CARRIED('C', "Carried"),

    /**
     * Done For Day
     */
    DONE_FOR_DAY('D', "Done For Day");

    private final char wire;

    private final String description;

    SubLiquidityIndicator(char wire, String description) {
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
    public static Optional<SubLiquidityIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'S' -> Optional.of(EXECUTION_FROM_ORDER_THAT_SET_THE_NBBO);
            case 'B' -> Optional.of(STEP_UP_MECHANISM);
            case 'C' -> Optional.of(CARRIED);
            case 'D' -> Optional.of(DONE_FOR_DAY);
            default -> Optional.empty();
        };
    }
}
