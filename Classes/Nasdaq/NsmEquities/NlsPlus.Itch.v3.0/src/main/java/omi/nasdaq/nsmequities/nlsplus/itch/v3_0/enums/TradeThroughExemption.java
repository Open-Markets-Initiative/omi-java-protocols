package omi.nasdaq.nsmequities.nlsplus.itch.v3_0.enums;

import java.util.Optional;

/**
 * Used for Sec Regulation Nms Trade Through Exemption codes
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeThroughExemption {

    /**
     * Intermarket Sweep
     */
    INTERMARKET_SWEEP('F', "Intermarket Sweep"),

    /**
     * Opening Print
     */
    OPENING_PRINT('O', "Opening Print"),

    /**
     * Derivative Priced
     */
    DERIVATIVE_PRICED('4', "Derivative Priced"),

    /**
     * Re-Opening Print
     */
    RE_OPENING_PRINT('5', "Re-Opening Print"),

    /**
     * Closing Print
     */
    CLOSING_PRINT('6', "Closing Print"),

    /**
     * Qualified Contingent Trade (QCT)
     */
    QUALIFIED_CONTINGENT_TRADE('7', "Qualified Contingent Trade (QCT)"),

    /**
     * Not applicable
     */
    NOT_APPLICABLE(' ', "Not applicable");

    private final char wire;

    private final String description;

    TradeThroughExemption(char wire, String description) {
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
    public static Optional<TradeThroughExemption> fromWire(char wire) {
        return switch (wire) {
            case 'F' -> Optional.of(INTERMARKET_SWEEP);
            case 'O' -> Optional.of(OPENING_PRINT);
            case '4' -> Optional.of(DERIVATIVE_PRICED);
            case '5' -> Optional.of(RE_OPENING_PRINT);
            case '6' -> Optional.of(CLOSING_PRINT);
            case '7' -> Optional.of(QUALIFIED_CONTINGENT_TRADE);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
