package omi.nasdaq.nsmequities.rash.asciirash.v1_1_2016.enums;

import java.util.Optional;

/**
 * The reason the trade was broken. See Broken Trade Reasons.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BrokenTradeReason {

    /**
     * Erroneous. The trade was deemed clearly erroneous
     */
    ERRONEOUS('E', "Erroneous. The trade was deemed clearly erroneous"),

    /**
     * Consent. The two parties mutually agreed to break the trade
     */
    CONSENT('C', "Consent. The two parties mutually agreed to break the trade"),

    /**
     * Supervisory. The trade was manually broken by a supervisory terminal
     */
    SUPERVISORY('S', "Supervisory. The trade was manually broken by a supervisory terminal"),

    /**
     * External. The trade was broken by an external third party
     */
    EXTERNAL('X', "External. The trade was broken by an external third party");

    private final char wire;

    private final String description;

    BrokenTradeReason(char wire, String description) {
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
    public static Optional<BrokenTradeReason> fromWire(char wire) {
        return switch (wire) {
            case 'E' -> Optional.of(ERRONEOUS);
            case 'C' -> Optional.of(CONSENT);
            case 'S' -> Optional.of(SUPERVISORY);
            case 'X' -> Optional.of(EXTERNAL);
            default -> Optional.empty();
        };
    }
}
