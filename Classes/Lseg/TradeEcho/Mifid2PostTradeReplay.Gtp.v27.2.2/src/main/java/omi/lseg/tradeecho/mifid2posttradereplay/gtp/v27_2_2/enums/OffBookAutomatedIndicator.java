package omi.lseg.tradeecho.mifid2posttradereplay.gtp.v27_2_2.enums;

import java.util.Optional;

/**
 * Off book automated indicator.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OffBookAutomatedIndicator {

    /**
     * Off Book Non Automated
     */
    OFF_BOOK_NON_AUTOMATED('M', "Off Book Non Automated"),

    /**
     * Off Book Automated
     */
    OFF_BOOK_AUTOMATED('Q', "Off Book Automated"),

    /**
     * Unspecified Or Does Not Apply
     */
    UNSPECIFIED_OR_DOES_NOT_APPLY('-', "Unspecified Or Does Not Apply");

    private final char wire;

    private final String description;

    OffBookAutomatedIndicator(char wire, String description) {
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
    public static Optional<OffBookAutomatedIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'M' -> Optional.of(OFF_BOOK_NON_AUTOMATED);
            case 'Q' -> Optional.of(OFF_BOOK_AUTOMATED);
            case '-' -> Optional.of(UNSPECIFIED_OR_DOES_NOT_APPLY);
            default -> Optional.empty();
        };
    }
}
