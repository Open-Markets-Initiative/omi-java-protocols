package omi.memx.memxequities.memoirdepthfeed.sbe.v1_3.enums;

import java.util.Optional;

/**
 * TradingSession
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingSession {

    /**
     * Opening
     */
    OPENING('1', "Opening"),

    /**
     * Trading
     */
    TRADING('2', "Trading"),

    /**
     * PostTrading
     */
    POST_TRADING('3', "PostTrading"),

    /**
     * Closed
     */
    CLOSED('4', "Closed");

    private final char wire;

    private final String description;

    TradingSession(char wire, String description) {
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
    public static Optional<TradingSession> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(OPENING);
            case '2' -> Optional.of(TRADING);
            case '3' -> Optional.of(POST_TRADING);
            case '4' -> Optional.of(CLOSED);
            default -> Optional.empty();
        };
    }
}
