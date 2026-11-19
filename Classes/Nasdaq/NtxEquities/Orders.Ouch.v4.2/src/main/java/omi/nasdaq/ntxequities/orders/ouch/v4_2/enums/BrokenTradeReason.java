package omi.nasdaq.ntxequities.orders.ouch.v4_2.enums;

import java.util.Optional;

/**
 * The reason the trade was broken. See currently supported Broken Trade Reasons table below. Clients should anticipate additions to this list and thus support all capital letters of the English alphabet.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BrokenTradeReason {

    /**
     * Erroneous — The trade was deemed clearly erroneous.
     */
    ERRONEOUS('E', "Erroneous \u2014 The trade was deemed clearly erroneous."),

    /**
     * Consent — The two parties mutually agreed to break the trade.
     */
    CONSENT('C', "Consent \u2014 The two parties mutually agreed to break the trade."),

    /**
     * Supervisory — The trade was manually broken by a NASDAQ supervisory terminal.
     */
    SUPERVISORY('S', "Supervisory \u2014 The trade was manually broken by a NASDAQ supervisory terminal."),

    /**
     * External — The trade was broken by an externalthird party.
     */
    EXTERNAL('X', "External \u2014 The trade was broken by an externalthird party.");

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
