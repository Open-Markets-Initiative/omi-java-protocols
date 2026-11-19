package omi.hkex.hkexsecurities.fulltickrefresh.omd.v1_45.enums;

import java.util.Optional;

/**
 * Indicates how control of trading session and sub-session transitions are performed.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingSesControlFlag {

    /**
     * Automatic Default
     */
    AUTOMATIC_DEFAULT('0', "Automatic Default"),

    /**
     * Manual Invalidates The Normal Schedule For The Day
     */
    MANUAL_INVALIDATES_THE_NORMAL_SCHEDULE_FOR_THE_DAY('1', "Manual Invalidates The Normal Schedule For The Day");

    private final char wire;

    private final String description;

    TradingSesControlFlag(char wire, String description) {
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
    public static Optional<TradingSesControlFlag> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(AUTOMATIC_DEFAULT);
            case '1' -> Optional.of(MANUAL_INVALIDATES_THE_NORMAL_SCHEDULE_FOR_THE_DAY);
            default -> Optional.empty();
        };
    }
}
