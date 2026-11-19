package omi.cboe.cedxderivatives.multicastdepthofbook.pitch.v1_11.enums;

import java.util.Optional;

/**
 * Cboe Trade Flags
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CboeTradeFlags {

    /**
     * Eu The Trade Was Reported To Cboe On Time And In The Main Session
     */
    EU_THE_TRADE_WAS_REPORTED_TO_CBOE_ON_TIME_AND_IN_THE_MAIN_SESSION('4', "Eu The Trade Was Reported To Cboe On Time And In The Main Session"),

    /**
     * Eu The Trade Was Reported To Cboe Late
     */
    EU_THE_TRADE_WAS_REPORTED_TO_CBOE_LATE('5', "Eu The Trade Was Reported To Cboe Late"),

    /**
     * Eu The Trade Was Reported To Cboe Out Of The Main Session
     */
    EU_THE_TRADE_WAS_REPORTED_TO_CBOE_OUT_OF_THE_MAIN_SESSION('6', "Eu The Trade Was Reported To Cboe Out Of The Main Session"),

    /**
     * Eu The Trade Was Reported To Cboe Late And Out Of The Main Session
     */
    EU_THE_TRADE_WAS_REPORTED_TO_CBOE_LATE_AND_OUT_OF_THE_MAIN_SESSION('7', "Eu The Trade Was Reported To Cboe Late And Out Of The Main Session");

    private final char wire;

    private final String description;

    CboeTradeFlags(char wire, String description) {
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
    public static Optional<CboeTradeFlags> fromWire(char wire) {
        return switch (wire) {
            case '4' -> Optional.of(EU_THE_TRADE_WAS_REPORTED_TO_CBOE_ON_TIME_AND_IN_THE_MAIN_SESSION);
            case '5' -> Optional.of(EU_THE_TRADE_WAS_REPORTED_TO_CBOE_LATE);
            case '6' -> Optional.of(EU_THE_TRADE_WAS_REPORTED_TO_CBOE_OUT_OF_THE_MAIN_SESSION);
            case '7' -> Optional.of(EU_THE_TRADE_WAS_REPORTED_TO_CBOE_LATE_AND_OUT_OF_THE_MAIN_SESSION);
            default -> Optional.empty();
        };
    }
}
