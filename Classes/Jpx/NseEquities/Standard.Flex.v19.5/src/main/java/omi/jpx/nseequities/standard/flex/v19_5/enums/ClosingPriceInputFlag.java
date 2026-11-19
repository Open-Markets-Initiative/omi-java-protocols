package omi.jpx.nseequities.standard.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates whether a closing price was reached.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ClosingPriceInputFlag {

    /**
     * When the trade isn’t established at closing (ZARABA Close).
     */
    TRADE_NOT_ESTABLISHED_AT_CLOSING('1', "When the trade isn\u2019t established at closing (ZARABA Close)."),

    /**
     * When the trade is established with closing (Close at the Closing Price).
     */
    TRADE_ESTABLISHED_WITH_CLOSING('2', "When the trade is established with closing (Close at the Closing Price)."),

    /**
     * Other Than The Above
     */
    OTHER_THAN_THE_ABOVE(' ', "Other Than The Above");

    private final char wire;

    private final String description;

    ClosingPriceInputFlag(char wire, String description) {
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
    public static Optional<ClosingPriceInputFlag> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(TRADE_NOT_ESTABLISHED_AT_CLOSING);
            case '2' -> Optional.of(TRADE_ESTABLISHED_WITH_CLOSING);
            case ' ' -> Optional.of(OTHER_THAN_THE_ABOVE);
            default -> Optional.empty();
        };
    }
}
