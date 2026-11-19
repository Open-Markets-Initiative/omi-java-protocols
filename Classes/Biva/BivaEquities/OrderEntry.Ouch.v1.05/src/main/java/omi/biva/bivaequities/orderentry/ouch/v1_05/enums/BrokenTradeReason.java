package omi.biva.bivaequities.orderentry.ouch.v1_05.enums;

import java.util.Optional;

/**
 * The reason the trade was broken
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BrokenTradeReason {

    /**
     * Consent Both Parties Agreed To Break The Trade
     */
    CONSENT_BOTH_PARTIES_AGREED_TO_BREAK_THE_TRADE('C', "Consent Both Parties Agreed To Break The Trade"),

    /**
     * Supervisory Broken By Biva Market Control
     */
    SUPERVISORY_BROKEN_BY_BIVA_MARKET_CONTROL('S', "Supervisory Broken By Biva Market Control");

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
            case 'C' -> Optional.of(CONSENT_BOTH_PARTIES_AGREED_TO_BREAK_THE_TRADE);
            case 'S' -> Optional.of(SUPERVISORY_BROKEN_BY_BIVA_MARKET_CONTROL);
            default -> Optional.empty();
        };
    }
}
