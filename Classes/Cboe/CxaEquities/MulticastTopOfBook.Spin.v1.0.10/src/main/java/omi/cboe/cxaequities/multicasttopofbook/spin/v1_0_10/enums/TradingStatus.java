package omi.cboe.cxaequities.multicasttopofbook.spin.v1_0_10.enums;

import java.util.Optional;

/**
 * Trading status of the session for the symbol.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradingStatus {

    /**
     * Closed
     */
    CLOSED('C', "Closed"),

    /**
     * Pre Market
     */
    PRE_MARKET('A', "Pre Market"),

    /**
     * Trading
     */
    TRADING('T', "Trading"),

    /**
     * Moc Trading
     */
    MOC_TRADING('M', "Moc Trading"),

    /**
     * Post Market
     */
    POST_MARKET('P', "Post Market"),

    /**
     * Halted
     */
    HALTED('H', "Halted"),

    /**
     * Trading Suspended
     */
    TRADING_SUSPENDED('S', "Trading Suspended"),

    /**
     * Pre Open
     */
    PRE_OPEN('O', "Pre Open"),

    /**
     * Pre Close
     */
    PRE_CLOSE('E', "Pre Close");

    private final char wire;

    private final String description;

    TradingStatus(char wire, String description) {
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
    public static Optional<TradingStatus> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CLOSED);
            case 'A' -> Optional.of(PRE_MARKET);
            case 'T' -> Optional.of(TRADING);
            case 'M' -> Optional.of(MOC_TRADING);
            case 'P' -> Optional.of(POST_MARKET);
            case 'H' -> Optional.of(HALTED);
            case 'S' -> Optional.of(TRADING_SUSPENDED);
            case 'O' -> Optional.of(PRE_OPEN);
            case 'E' -> Optional.of(PRE_CLOSE);
            default -> Optional.empty();
        };
    }
}
