package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * quoteCancelType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteCancelType {

    /**
     * CancelByUnderlyingMarket
     */
    CANCEL_BY_UNDERLYING_MARKET((short) 3, "CancelByUnderlyingMarket"),

    /**
     * CancelAll
     */
    CANCEL_ALL((short) 4, "CancelAll"),

    /**
     * CancelByProductID
     */
    CANCEL_BY_PRODUCT_ID((short) 5, "CancelByProductID");

    private final short wire;

    private final String description;

    QuoteCancelType(short wire, String description) {
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
    public static Optional<QuoteCancelType> fromWire(short wire) {
        return switch (wire) {
            case 3 -> Optional.of(CANCEL_BY_UNDERLYING_MARKET);
            case 4 -> Optional.of(CANCEL_ALL);
            case 5 -> Optional.of(CANCEL_BY_PRODUCT_ID);
            default -> Optional.empty();
        };
    }
}
