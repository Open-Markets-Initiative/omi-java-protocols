package omi.nasdaq.utdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * Reason for TT Exemption
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Level2 {

    /**
     * Intermarket Sweep
     */
    INTERMARKET_SWEEP('F', "Intermarket Sweep"),

    /**
     * Opening Prints
     */
    OPENING_PRINTS('O', "Opening Prints"),

    /**
     * Derivatively Priced
     */
    DERIVATIVELY_PRICED('4', "Derivatively Priced"),

    /**
     * Re-Opening Prints
     */
    RE_OPENING_PRINTS('5', "Re-Opening Prints"),

    /**
     * Closing Prints
     */
    CLOSING_PRINTS('6', "Closing Prints"),

    /**
     * Qualified Contingent Trade
     */
    QUALIFIED_CONTINGENT_TRADE('7', "Qualified Contingent Trade"),

    /**
     * Placeholder For 611 Exempt
     */
    PLACEHOLDER_FOR_611_EXEMPT('8', "Placeholder For 611 Exempt"),

    /**
     * Corrected Consolidated Close
     */
    CORRECTED_CONSOLIDATED_CLOSE('9', "Corrected Consolidated Close"),

    /**
     * Not Available
     */
    NOT_AVAILABLE(' ', "Not Available");

    private final char wire;

    private final String description;

    Level2(char wire, String description) {
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
    public static Optional<Level2> fromWire(char wire) {
        return switch (wire) {
            case 'F' -> Optional.of(INTERMARKET_SWEEP);
            case 'O' -> Optional.of(OPENING_PRINTS);
            case '4' -> Optional.of(DERIVATIVELY_PRICED);
            case '5' -> Optional.of(RE_OPENING_PRINTS);
            case '6' -> Optional.of(CLOSING_PRINTS);
            case '7' -> Optional.of(QUALIFIED_CONTINGENT_TRADE);
            case '8' -> Optional.of(PLACEHOLDER_FOR_611_EXEMPT);
            case '9' -> Optional.of(CORRECTED_CONSOLIDATED_CLOSE);
            case ' ' -> Optional.of(NOT_AVAILABLE);
            default -> Optional.empty();
        };
    }
}
