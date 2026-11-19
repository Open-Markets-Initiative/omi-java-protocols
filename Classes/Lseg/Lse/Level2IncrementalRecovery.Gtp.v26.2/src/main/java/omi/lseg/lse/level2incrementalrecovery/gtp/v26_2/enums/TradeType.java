package omi.lseg.lse.level2incrementalrecovery.gtp.v26_2.enums;

import java.util.Optional;

/**
 * Type of the trade.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradeType {

    /**
     * Regular Or Continuous Trade
     */
    REGULAR_OR_CONTINUOUS_TRADE((short) 0, "Regular Or Continuous Trade"),

    /**
     * Auction Trade Bulk
     */
    AUCTION_TRADE_BULK((short) 1, "Auction Trade Bulk"),

    /**
     * Auction Trade Individual
     */
    AUCTION_TRADE_INDIVIDUAL((short) 2, "Auction Trade Individual"),

    /**
     * On Book Trade Cancellation
     */
    ON_BOOK_TRADE_CANCELLATION((short) 9, "On Book Trade Cancellation"),

    /**
     * Trade Correction
     */
    TRADE_CORRECTION((short) 11, "Trade Correction"),

    /**
     * Rfq Trade
     */
    RFQ_TRADE((short) 22, "Rfq Trade"),

    /**
     * Rfq Trade Cancellation
     */
    RFQ_TRADE_CANCELLATION((short) 23, "Rfq Trade Cancellation"),

    /**
     * Rfq Trade Correction
     */
    RFQ_TRADE_CORRECTION((short) 24, "Rfq Trade Correction");

    private final short wire;

    private final String description;

    TradeType(short wire, String description) {
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
    public static Optional<TradeType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(REGULAR_OR_CONTINUOUS_TRADE);
            case 1 -> Optional.of(AUCTION_TRADE_BULK);
            case 2 -> Optional.of(AUCTION_TRADE_INDIVIDUAL);
            case 9 -> Optional.of(ON_BOOK_TRADE_CANCELLATION);
            case 11 -> Optional.of(TRADE_CORRECTION);
            case 22 -> Optional.of(RFQ_TRADE);
            case 23 -> Optional.of(RFQ_TRADE_CANCELLATION);
            case 24 -> Optional.of(RFQ_TRADE_CORRECTION);
            default -> Optional.empty();
        };
    }
}
