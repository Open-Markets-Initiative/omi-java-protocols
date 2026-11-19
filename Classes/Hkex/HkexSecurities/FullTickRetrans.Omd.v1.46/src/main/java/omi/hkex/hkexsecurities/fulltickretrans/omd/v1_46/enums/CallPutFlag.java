package omi.hkex.hkexsecurities.fulltickretrans.omd.v1_46.enums;

import java.util.Optional;

/**
 * Indicator of whether the warrant or structured product is a call or put option.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CallPutFlag {

    /**
     * Call Or Bull
     */
    CALL_OR_BULL('C', "Call Or Bull"),

    /**
     * Put Or Bear Range
     */
    PUT_OR_BEAR_RANGE('P', "Put Or Bear Range"),

    /**
     * Others
     */
    OTHERS('O', "Others");

    private final char wire;

    private final String description;

    CallPutFlag(char wire, String description) {
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
    public static Optional<CallPutFlag> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CALL_OR_BULL);
            case 'P' -> Optional.of(PUT_OR_BEAR_RANGE);
            case 'O' -> Optional.of(OTHERS);
            default -> Optional.empty();
        };
    }
}
