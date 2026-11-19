package omi.bme.bmeequities.retail.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Security Trading Status
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityTradingStatus {

    /**
     * Ready To Trade
     */
    READY_TO_TRADE((short) 17, "Ready To Trade"),

    /**
     * Not Available For Trading
     */
    NOT_AVAILABLE_FOR_TRADING((short) 18, "Not Available For Trading"),

    /**
     * Not Traded On This Segment
     */
    NOT_TRADED_ON_THIS_SEGMENT((short) 19, "Not Traded On This Segment"),

    /**
     * Unknown Or Invalid
     */
    UNKNOWN_OR_INVALID((short) 20, "Unknown Or Invalid"),

    /**
     * Pre Open
     */
    PRE_OPEN((short) 21, "Pre Open"),

    /**
     * Post Close Ready To Trade In Tal
     */
    POST_CLOSE_READY_TO_TRADE_IN_TAL((short) 26, "Post Close Ready To Trade In Tal"),

    /**
     * Fast Market
     */
    FAST_MARKET((short) 23, "Fast Market"),

    /**
     * Extraordinary Market Conditions
     */
    EXTRAORDINARY_MARKET_CONDITIONS((short) 100, "Extraordinary Market Conditions");

    private final short wire;

    private final String description;

    SecurityTradingStatus(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<SecurityTradingStatus> fromWire(short wire) {
        return switch (wire) {
            case 17 -> Optional.of(READY_TO_TRADE);
            case 18 -> Optional.of(NOT_AVAILABLE_FOR_TRADING);
            case 19 -> Optional.of(NOT_TRADED_ON_THIS_SEGMENT);
            case 20 -> Optional.of(UNKNOWN_OR_INVALID);
            case 21 -> Optional.of(PRE_OPEN);
            case 26 -> Optional.of(POST_CLOSE_READY_TO_TRADE_IN_TAL);
            case 23 -> Optional.of(FAST_MARKET);
            case 100 -> Optional.of(EXTRAORDINARY_MARKET_CONDITIONS);
            default -> Optional.empty();
        };
    }
}
