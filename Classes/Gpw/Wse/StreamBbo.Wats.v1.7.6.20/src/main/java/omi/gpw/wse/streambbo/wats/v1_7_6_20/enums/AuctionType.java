package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Type of auction
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AuctionType {

    /**
     * NotApplicable
     */
    NOT_APPLICABLE((short) 1, "NotApplicable"),

    /**
     * Opening auction
     */
    AUCTION_OPENING((short) 2, "Opening auction"),

    /**
     * Closing auction
     */
    AUCTION_CLOSING((short) 3, "Closing auction"),

    /**
     * Intraday auction
     */
    AUCTION_INTRADAY((short) 4, "Intraday auction"),

    /**
     * Volatility auction after static collars breach
     */
    AUCTION_VOLATILITY_STATIC((short) 5, "Volatility auction after static collars breach"),

    /**
     * Volatility auction after dynamic collars breach
     */
    AUCTION_VOLATILITY_DYNAMIC((short) 6, "Volatility auction after dynamic collars breach"),

    /**
     * Additional volatility auction after static collar breach
     */
    AUCTION_EXTENDED_VOLATILITY_STATIC((short) 7, "Additional volatility auction after static collar breach"),

    /**
     * Additional volatility auction after dynamic collar breach
     */
    AUCTION_EXTENDED_VOLATILITY_DYNAMIC((short) 8, "Additional volatility auction after dynamic collar breach"),

    /**
     * A phase triggered whenever an instrument’s changes its status from RegulatorySuspension or MarketOperationSuspension before entering into continuous phase
     */
    UNSUSPENSION_AUCTION((short) 9, "A phase triggered whenever an instrument\u2019s changes its status from RegulatorySuspension or MarketOperationSuspension before entering into continuous phase");

    private final short wire;

    private final String description;

    AuctionType(short wire, String description) {
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
    public static Optional<AuctionType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NOT_APPLICABLE);
            case 2 -> Optional.of(AUCTION_OPENING);
            case 3 -> Optional.of(AUCTION_CLOSING);
            case 4 -> Optional.of(AUCTION_INTRADAY);
            case 5 -> Optional.of(AUCTION_VOLATILITY_STATIC);
            case 6 -> Optional.of(AUCTION_VOLATILITY_DYNAMIC);
            case 7 -> Optional.of(AUCTION_EXTENDED_VOLATILITY_STATIC);
            case 8 -> Optional.of(AUCTION_EXTENDED_VOLATILITY_DYNAMIC);
            case 9 -> Optional.of(UNSUSPENSION_AUCTION);
            default -> Optional.empty();
        };
    }
}
