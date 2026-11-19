package omi.siac.cts.output.cta.v2_9.enums;

import java.util.Optional;

/**
 * The Message Category represents the message classification
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageCategory {

    /**
     * Administrative Message Header
     */
    ADMINISTRATIVE('A', "Administrative Message Header"),

    /**
     * Control Message Header
     */
    CONTROL('C', "Control Message Header"),

    /**
     * Index Messages Header
     */
    INDEX('I', "Index Messages Header"),

    /**
     * Market Status Message Header
     */
    MARKET_STATUS('M', "Market Status Message Header"),

    /**
     * Prior Day Messages
     */
    PRIOR_DAY('P', "Prior Day Messages"),

    /**
     * Summary Messages
     */
    SUMMARY('S', "Summary Messages"),

    /**
     * Trade Messages
     */
    TRADE('T', "Trade Messages");

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
            case 'A' -> Optional.of(ADMINISTRATIVE);
            case 'C' -> Optional.of(CONTROL);
            case 'I' -> Optional.of(INDEX);
            case 'M' -> Optional.of(MARKET_STATUS);
            case 'P' -> Optional.of(PRIOR_DAY);
            case 'S' -> Optional.of(SUMMARY);
            case 'T' -> Optional.of(TRADE);
            default -> Optional.empty();
        };
    }
}
