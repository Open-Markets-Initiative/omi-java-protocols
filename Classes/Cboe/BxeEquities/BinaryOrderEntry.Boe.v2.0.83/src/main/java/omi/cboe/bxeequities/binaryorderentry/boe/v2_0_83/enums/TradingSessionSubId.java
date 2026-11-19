package omi.cboe.bxeequities.binaryorderentry.boe.v2_0_83.enums;

import java.util.Optional;

/**
 * Defines the TradingSessionSubId values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingSessionSubId {

    /**
     * Scheduled Opening Auction
     */
    SCHEDULED_OPENING_AUCTION((short) 2, "Scheduled Opening Auction"),

    /**
     * Scheduled Closing Auction
     */
    SCHEDULED_CLOSING_AUCTION((short) 4, "Scheduled Closing Auction"),

    /**
     * Scheduled Intraday Auction
     */
    SCHEDULED_INTRADAY_AUCTION((short) 6, "Scheduled Intraday Auction"),

    /**
     * Unspecified Auction
     */
    UNSPECIFIED_AUCTION((short) 8, "Unspecified Auction"),

    /**
     * Unscheduled Auction
     */
    UNSCHEDULED_AUCTION((short) 9, "Unscheduled Auction"),

    /**
     * Continuous Trading
     */
    CONTINUOUS_TRADING((short) 3, "Continuous Trading"),

    /**
     * Post Trading 10 = Out of Main Session Trading
     */
    POST_TRADING((short) 5, "Post Trading 10 = Out of Main Session Trading");

    private final short wire;

    private final String description;

    TradingSessionSubId(short wire, String description) {
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
    public static Optional<TradingSessionSubId> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(SCHEDULED_OPENING_AUCTION);
            case 4 -> Optional.of(SCHEDULED_CLOSING_AUCTION);
            case 6 -> Optional.of(SCHEDULED_INTRADAY_AUCTION);
            case 8 -> Optional.of(UNSPECIFIED_AUCTION);
            case 9 -> Optional.of(UNSCHEDULED_AUCTION);
            case 3 -> Optional.of(CONTINUOUS_TRADING);
            case 5 -> Optional.of(POST_TRADING);
            default -> Optional.empty();
        };
    }
}
