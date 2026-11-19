package omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * B=Buy, S=Sell
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Side {

    /**
     * Buy (Bought on executions, Bid on Auction Notification)
     */
    BUY('B', "Buy (Bought on executions, Bid on Auction Notification)"),

    /**
     * Sell (Sold on executions)
     */
    SELL('S', "Sell (Sold on executions)"),

    /**
     * Offer (Auction Notification only)
     */
    OFFER('O', "Offer (Auction Notification only)"),

    /**
     * Not Disclosed (Auction Notification only)
     */
    NOT_DISCLOSED('N', "Not Disclosed (Auction Notification only)");

    private final char wire;

    private final String description;

    Side(char wire, String description) {
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
    public static Optional<Side> fromWire(char wire) {
        return switch (wire) {
            case 'B' -> Optional.of(BUY);
            case 'S' -> Optional.of(SELL);
            case 'O' -> Optional.of(OFFER);
            case 'N' -> Optional.of(NOT_DISCLOSED);
            default -> Optional.empty();
        };
    }
}
