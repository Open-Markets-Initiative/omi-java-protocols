package omi.nairobi.nairobiequities.snapshot.mitch.v1_22.enums;

import java.util.Optional;

/**
 * Direction of the imbalance.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ImbalanceDirection {

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

    ImbalanceDirection(char wire, String description) {
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
    public static Optional<ImbalanceDirection> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BUY_IMBALANCE);
            case 'N' -> Optional.of(NO_IMBALANCE);
            case 'O' -> Optional.of(INSUFFICIENT_ORDERS_FOR_AUCTION);
            case 'S' -> Optional.of(SELL_IMBALANCE);
            default -> Optional.empty();
        };
    }
}
