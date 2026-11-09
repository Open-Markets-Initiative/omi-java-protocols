package omi.eurex.t7.eobi.fbe.v3_0.enums;

import java.util.Optional;

/**
 * Defines the MdEntryType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MdEntryType {

    /**
     * Trade
     */
    TRADE((short) 2, "Trade"),

    /**
     * Opening Price
     */
    OPENING_PRICE((short) 4, "Opening Price"),

    /**
     * Closing Price
     */
    CLOSING_PRICE((short) 5, "Closing Price"),

    /**
     * High Price
     */
    HIGH_PRICE((short) 7, "High Price"),

    /**
     * Low Price
     */
    LOW_PRICE((short) 8, "Low Price"),

    /**
     * Trade Volume
     */
    TRADE_VOLUME((short) 66, "Trade Volume"),

    /**
     * Previous Closing Price
     */
    PREVIOUS_CLOSING_PRICE((short) 101, "Previous Closing Price"),

    /**
     * Opening Auction
     */
    OPENING_AUCTION((short) 200, "Opening Auction"),

    /**
     * Intraday Auction
     */
    INTRADAY_AUCTION((short) 201, "Intraday Auction"),

    /**
     * Circuit Breaker Auction
     */
    CIRCUIT_BREAKER_AUCTION((short) 202, "Circuit Breaker Auction"),

    /**
     * Closing Auction
     */
    CLOSING_AUCTION((short) 203, "Closing Auction"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    MdEntryType(short wire, String description) {
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
    public static Optional<MdEntryType> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(TRADE);
            case 4 -> Optional.of(OPENING_PRICE);
            case 5 -> Optional.of(CLOSING_PRICE);
            case 7 -> Optional.of(HIGH_PRICE);
            case 8 -> Optional.of(LOW_PRICE);
            case 66 -> Optional.of(TRADE_VOLUME);
            case 101 -> Optional.of(PREVIOUS_CLOSING_PRICE);
            case 200 -> Optional.of(OPENING_AUCTION);
            case 201 -> Optional.of(INTRADAY_AUCTION);
            case 202 -> Optional.of(CIRCUIT_BREAKER_AUCTION);
            case 203 -> Optional.of(CLOSING_AUCTION);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
