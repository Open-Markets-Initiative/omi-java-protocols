package omi.nasdaq.nsmequities.orders.ouch.v5_0.enums;

import java.util.Optional;

/**
 * The reason the trade was broken.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BrokenTradeReason {

    /**
     * Erroneous (trade deemed clearly erroneous)
     */
    ERRONEOUS('E', "Erroneous (trade deemed clearly erroneous)"),

    /**
     * Consent (both parties agreed to break the trade)
     */
    CONSENT('C', "Consent (both parties agreed to break the trade)"),

    /**
     * Supervisory (manually broken by supervisory)
     */
    SUPERVISORY('S', "Supervisory (manually broken by supervisory)"),

    /**
     * External (trade broken by an external third party)
     */
    EXTERNAL('X', "External (trade broken by an external third party)");

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
