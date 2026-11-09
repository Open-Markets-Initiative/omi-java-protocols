package omi.siac.opra.output.obi.v6_2.enums;

import java.util.Optional;

/**
 * Message identifier
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageCategory {

    /**
     * Administrative Message
     */
    ADMINISTRATIVE('C', "Administrative Message"),

    /**
     * Control Message
     */
    CONTROL('H', "Control Message"),

    /**
     * Equity And Index Last Sale Message
     */
    EQUITY_AND_INDEX_LAST_SALE('a', "Equity And Index Last Sale Message"),

    /**
     * Open Interest Message
     */
    OPEN_INTEREST('d', "Open Interest Message"),

    /**
     * Equity And Index End Of Day Summary Message
     */
    EQUITY_AND_INDEX_END_OF_DAY_SUMMARY('f', "Equity And Index End Of Day Summary Message"),

    /**
     * Long Equity And Index Quote Message
     */
    LONG_EQUITY_AND_INDEX_QUOTE('k', "Long Equity And Index Quote Message"),

    /**
     * Short Equity And Index Quote Message
     */
    SHORT_EQUITY_AND_INDEX_QUOTE('q', "Short Equity And Index Quote Message"),

    /**
     * Underlying Value Message
     */
    UNDERLYING_VALUE('Y', "Underlying Value Message");

    private final char wire;

    private final String description;

    MessageCategory(char wire, String description) {
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
    public static Optional<MessageCategory> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(ADMINISTRATIVE);
            case 'H' -> Optional.of(CONTROL);
            case 'a' -> Optional.of(EQUITY_AND_INDEX_LAST_SALE);
            case 'd' -> Optional.of(OPEN_INTEREST);
            case 'f' -> Optional.of(EQUITY_AND_INDEX_END_OF_DAY_SUMMARY);
            case 'k' -> Optional.of(LONG_EQUITY_AND_INDEX_QUOTE);
            case 'q' -> Optional.of(SHORT_EQUITY_AND_INDEX_QUOTE);
            case 'Y' -> Optional.of(UNDERLYING_VALUE);
            default -> Optional.empty();
        };
    }
}
