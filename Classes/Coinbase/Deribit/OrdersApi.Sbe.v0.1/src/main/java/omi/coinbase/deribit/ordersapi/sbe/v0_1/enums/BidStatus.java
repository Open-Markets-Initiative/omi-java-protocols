package omi.coinbase.deribit.ordersapi.sbe.v0_1.enums;

import java.util.Optional;

/**
 * bidStatus
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum BidStatus {

    /**
     * no active quote in book (before or after update)
     */
    INACTIVE((byte) 0, "no active quote in book (before or after update)"),

    /**
     * live in book with no change
     */
    UNMODIFIED((byte) 1, "live in book with no change"),

    /**
     * QTY_REDUCED
     */
    QTY_REDUCED((byte) 2, "QTY_REDUCED"),

    /**
     * live in book (possibly with fills)
     */
    UPDATED((byte) 3, "live in book (possibly with fills)"),

    /**
     * fully filled
     */
    FILLED((byte) 4, "fully filled"),

    /**
     * existing quote/order was canceled by client request or because update was rejected
     */
    CANCELED_BY_REQUEST((byte) 5, "existing quote/order was canceled by client request or because update was rejected"),

    /**
     * quote was accepted then canceled because MMP was triggered
     */
    CANCELED_BY_MMP((byte) 6, "quote was accepted then canceled because MMP was triggered"),

    /**
     * quote was accepted then canceled due to self-match prevention
     */
    CANCELED_BY_SELF_MATCH((byte) 7, "quote was accepted then canceled due to self-match prevention"),

    /**
     * quote is speed bumped (pending in book)
     */
    SPEED_BUMPED((byte) 8, "quote is speed bumped (pending in book)");

    private final byte wire;

    private final String description;

    BidStatus(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<BidStatus> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(INACTIVE);
            case 1 -> Optional.of(UNMODIFIED);
            case 2 -> Optional.of(QTY_REDUCED);
            case 3 -> Optional.of(UPDATED);
            case 4 -> Optional.of(FILLED);
            case 5 -> Optional.of(CANCELED_BY_REQUEST);
            case 6 -> Optional.of(CANCELED_BY_MMP);
            case 7 -> Optional.of(CANCELED_BY_SELF_MATCH);
            case 8 -> Optional.of(SPEED_BUMPED);
            default -> Optional.empty();
        };
    }
}
