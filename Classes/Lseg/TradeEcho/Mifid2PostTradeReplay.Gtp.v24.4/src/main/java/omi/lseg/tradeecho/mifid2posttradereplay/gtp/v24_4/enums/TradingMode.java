package omi.lseg.tradeecho.mifid2posttradereplay.gtp.v24_4.enums;

import java.util.Optional;

/**
 * Trading Mode
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingMode {

    /**
     * On Exchange
     */
    ON_EXCHANGE('5', "On Exchange"),

    /**
     * Off Exchange
     */
    OFF_EXCHANGE('6', "Off Exchange"),

    /**
     * Systemic Internaliser
     */
    SYSTEMIC_INTERNALISER('7', "Systemic Internaliser");

    private final char wire;

    private final String description;

    TradingMode(char wire, String description) {
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
    public static Optional<TradingMode> fromWire(char wire) {
        return switch (wire) {
            case '5' -> Optional.of(ON_EXCHANGE);
            case '6' -> Optional.of(OFF_EXCHANGE);
            case '7' -> Optional.of(SYSTEMIC_INTERNALISER);
            default -> Optional.empty();
        };
    }
}
