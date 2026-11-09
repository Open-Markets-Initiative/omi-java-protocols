package omi.siac.cqs.output.cta.v1_91.enums;

import java.util.Optional;

/**
 * The Message Category represents the message classification
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageCategory {

    /**
     * Administrative Messages Header
     */
    ADMINISTRATIVE('A', "Administrative Messages Header"),

    /**
     * Control Messages Header
     */
    CONTROL('C', "Control Messages Header"),

    /**
     * Market Status Messages Header
     */
    MARKET_STATUS('M', "Market Status Messages Header"),

    /**
     * Quote Messages
     */
    QUOTE('Q', "Quote Messages");

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
            case 'M' -> Optional.of(MARKET_STATUS);
            case 'Q' -> Optional.of(QUOTE);
            default -> Optional.empty();
        };
    }
}
