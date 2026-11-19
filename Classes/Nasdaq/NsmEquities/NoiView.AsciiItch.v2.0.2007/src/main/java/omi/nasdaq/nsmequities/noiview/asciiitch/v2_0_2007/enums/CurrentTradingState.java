package omi.nasdaq.nsmequities.noiview.asciiitch.v2_0_2007.enums;

import java.util.Optional;

/**
 * Reflects the current trading state for the issue.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CurrentTradingState {

    /**
     * Halt In Effect
     */
    HALT_IN_EFFECT('H', "Halt In Effect"),

    /**
     * Quotation Only Period In Effect
     */
    QUOTATION_ONLY_PERIOD_IN_EFFECT('Q', "Quotation Only Period In Effect"),

    /**
     * Trading On Nasdaq
     */
    TRADING_ON_NASDAQ('T', "Trading On Nasdaq");

    private final char wire;

    private final String description;

    CurrentTradingState(char wire, String description) {
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
    public static Optional<CurrentTradingState> fromWire(char wire) {
        return switch (wire) {
            case 'H' -> Optional.of(HALT_IN_EFFECT);
            case 'Q' -> Optional.of(QUOTATION_ONLY_PERIOD_IN_EFFECT);
            case 'T' -> Optional.of(TRADING_ON_NASDAQ);
            default -> Optional.empty();
        };
    }
}
