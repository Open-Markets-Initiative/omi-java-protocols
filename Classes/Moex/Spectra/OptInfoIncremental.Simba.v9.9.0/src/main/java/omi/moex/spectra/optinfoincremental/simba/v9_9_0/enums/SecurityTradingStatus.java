package omi.moex.spectra.optinfoincremental.simba.v9_9_0.enums;

import java.util.Optional;

/**
 * SecurityTradingStatus
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityTradingStatus {

    /**
     * Trading halt
     */
    TRADING_HALT((short) 2, "Trading halt"),

    /**
     * Ready to trade
     */
    READY_TO_TRADE((short) 17, "Ready to trade"),

    /**
     * Not available for trading
     */
    NOT_AVAILABLE_FOR_TRADING((short) 18, "Not available for trading"),

    /**
     * Not traded on this market
     */
    NOT_TRADED_ON_THIS_MARKET((short) 19, "Not traded on this market"),

    /**
     * Unknown or Invalid status
     */
    UNKNOWN_OR_INVALID((short) 20, "Unknown or Invalid status"),

    /**
     * Pre-open
     */
    PRE_OPEN((short) 21, "Pre-open"),

    /**
     * Discrete auction started
     */
    DISCRETE_AUCTION_OPEN((short) 119, "Discrete auction started"),

    /**
     * Discrete auction ended
     */
    DISCRETE_AUCTION_CLOSE((short) 121, "Discrete auction ended"),

    /**
     * Instrument halt
     */
    INSTRUMENT_HALT((short) 122, "Instrument halt"),

    /**
     * Ready to trade. Close position
     */
    CLOSE_POSITION((short) 123, "Ready to trade. Close position"),

    /**
     * Discrete auction. Close position
     */
    DISCRETE_AUCTION_CLOSE_POSITION((short) 124, "Discrete auction. Close position");

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
            case 2 -> Optional.of(TRADING_HALT);
            case 17 -> Optional.of(READY_TO_TRADE);
            case 18 -> Optional.of(NOT_AVAILABLE_FOR_TRADING);
            case 19 -> Optional.of(NOT_TRADED_ON_THIS_MARKET);
            case 20 -> Optional.of(UNKNOWN_OR_INVALID);
            case 21 -> Optional.of(PRE_OPEN);
            case 119 -> Optional.of(DISCRETE_AUCTION_OPEN);
            case 121 -> Optional.of(DISCRETE_AUCTION_CLOSE);
            case 122 -> Optional.of(INSTRUMENT_HALT);
            case 123 -> Optional.of(CLOSE_POSITION);
            case 124 -> Optional.of(DISCRETE_AUCTION_CLOSE_POSITION);
            default -> Optional.empty();
        };
    }
}
