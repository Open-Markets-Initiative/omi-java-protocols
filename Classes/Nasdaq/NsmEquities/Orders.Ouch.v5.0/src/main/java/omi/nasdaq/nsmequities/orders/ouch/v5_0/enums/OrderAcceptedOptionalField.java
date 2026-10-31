package omi.nasdaq.nsmequities.orders.ouch.v5_0.enums;

import java.util.Optional;

/**
 * Appendage Id
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderAcceptedOptionalField {

    /**
     * Order Accepted Optional Firm Enum
     */
    FIRM((short) 2, "Order Accepted Optional Firm Enum"),

    /**
     * Order Accepted Optional MinQty Enum
     */
    MINQTY((short) 3, "Order Accepted Optional MinQty Enum"),

    /**
     * Order Accepted Optional CustomerType Enum
     */
    CUSTOMERTYPE((short) 4, "Order Accepted Optional CustomerType Enum"),

    /**
     * Order Accepted Optional MaxFloor Enum
     */
    MAXFLOOR((short) 5, "Order Accepted Optional MaxFloor Enum"),

    /**
     * Order Accepted Optional PriceType Enum
     */
    PRICETYPE((short) 6, "Order Accepted Optional PriceType Enum"),

    /**
     * Order Accepted Optional PegOffset Enum
     */
    PEGOFFSET((short) 7, "Order Accepted Optional PegOffset Enum"),

    /**
     * Order Accepted Optional DiscretionPrice Enum
     */
    DISCRETIONPRICE((short) 9, "Order Accepted Optional DiscretionPrice Enum"),

    /**
     * Order Accepted Optional DiscretionPriceType Enum
     */
    DISCRETIONPRICETYPE((short) 10, "Order Accepted Optional DiscretionPriceType Enum"),

    /**
     * Order Accepted Optional DiscretionPegOffset Enum
     */
    DISCRETIONPEGOFFSET((short) 11, "Order Accepted Optional DiscretionPegOffset Enum"),

    /**
     * Order Accepted Optional PostOnly Enum
     */
    POSTONLY((short) 12, "Order Accepted Optional PostOnly Enum"),

    /**
     * Order Accepted Optional RandomReserves Enum
     */
    RANDOMRESERVES((short) 13, "Order Accepted Optional RandomReserves Enum"),

    /**
     * Order Accepted Optional Route Enum
     */
    ROUTE((short) 14, "Order Accepted Optional Route Enum"),

    /**
     * Order Accepted Optional ExpireTime Enum
     */
    EXPIRETIME((short) 15, "Order Accepted Optional ExpireTime Enum"),

    /**
     * Order Accepted Optional TradeNow Enum
     */
    TRADENOW((short) 16, "Order Accepted Optional TradeNow Enum"),

    /**
     * Order Accepted Optional HandleInst Enum
     */
    HANDLEINST((short) 17, "Order Accepted Optional HandleInst Enum"),

    /**
     * Order Accepted Optional BBO Weight Indicator Enum
     */
    BBO_WEIGHT_INDICATOR((short) 18, "Order Accepted Optional BBO Weight Indicator Enum"),

    /**
     * Order Accepted Optional Group ID Enum
     */
    GROUP_ID((short) 24, "Order Accepted Optional Group ID Enum"),

    /**
     * Order Accepted Optional Shares Located Enum
     */
    SHARES_LOCATED((short) 25, "Order Accepted Optional Shares Located Enum"),

    /**
     * Order Accepted Optional UserRefIdx Enum
     */
    USERREFIDX((short) 28, "Order Accepted Optional UserRefIdx Enum"),

    /**
     * Order Accepted Optional AIQ Strategy Enum
     */
    AIQ_STRATEGY((short) 29, "Order Accepted Optional AIQ Strategy Enum"),

    /**
     * Order Accepted Optional AIQ Group ID Enum
     */
    AIQ_GROUP_ID((short) 30, "Order Accepted Optional AIQ Group ID Enum");

    private final short wire;

    private final String description;

    OrderAcceptedOptionalField(short wire, String description) {
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
    public static Optional<OrderAcceptedOptionalField> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(FIRM);
            case 3 -> Optional.of(MINQTY);
            case 4 -> Optional.of(CUSTOMERTYPE);
            case 5 -> Optional.of(MAXFLOOR);
            case 6 -> Optional.of(PRICETYPE);
            case 7 -> Optional.of(PEGOFFSET);
            case 9 -> Optional.of(DISCRETIONPRICE);
            case 10 -> Optional.of(DISCRETIONPRICETYPE);
            case 11 -> Optional.of(DISCRETIONPEGOFFSET);
            case 12 -> Optional.of(POSTONLY);
            case 13 -> Optional.of(RANDOMRESERVES);
            case 14 -> Optional.of(ROUTE);
            case 15 -> Optional.of(EXPIRETIME);
            case 16 -> Optional.of(TRADENOW);
            case 17 -> Optional.of(HANDLEINST);
            case 18 -> Optional.of(BBO_WEIGHT_INDICATOR);
            case 24 -> Optional.of(GROUP_ID);
            case 25 -> Optional.of(SHARES_LOCATED);
            case 28 -> Optional.of(USERREFIDX);
            case 29 -> Optional.of(AIQ_STRATEGY);
            case 30 -> Optional.of(AIQ_GROUP_ID);
            default -> Optional.empty();
        };
    }
}
