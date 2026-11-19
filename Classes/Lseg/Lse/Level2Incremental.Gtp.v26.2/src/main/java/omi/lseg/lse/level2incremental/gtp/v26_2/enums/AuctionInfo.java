package omi.lseg.lse.level2incremental.gtp.v26_2.enums;

import java.util.Optional;

/**
 * Populated if the Statistic Type is 1.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum AuctionInfo {

    /**
     * Not Applicable
     */
    NOT_APPLICABLE('0', "Not Applicable"),

    /**
     * Buy Imbalance
     */
    BUY_IMBALANCE('B', "Buy Imbalance"),

    /**
     * No Imbalance
     */
    NO_IMBALANCE('N', "No Imbalance"),

    /**
     * Insufficient Orders For Auction
     */
    INSUFFICIENT_ORDERS_FOR_AUCTION('O', "Insufficient Orders For Auction"),

    /**
     * Sell Imbalance
     */
    SELL_IMBALANCE('S', "Sell Imbalance");

    private final char wire;

    private final String description;

    AuctionInfo(char wire, String description) {
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
    public static Optional<AuctionInfo> fromWire(char wire) {
        return switch (wire) {
            case '0' -> Optional.of(NOT_APPLICABLE);
            case 'B' -> Optional.of(BUY_IMBALANCE);
            case 'N' -> Optional.of(NO_IMBALANCE);
            case 'O' -> Optional.of(INSUFFICIENT_ORDERS_FOR_AUCTION);
            case 'S' -> Optional.of(SELL_IMBALANCE);
            default -> Optional.empty();
        };
    }
}
