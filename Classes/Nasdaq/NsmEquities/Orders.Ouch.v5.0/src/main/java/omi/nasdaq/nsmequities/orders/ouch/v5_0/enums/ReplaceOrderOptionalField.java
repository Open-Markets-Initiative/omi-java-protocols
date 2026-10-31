package omi.nasdaq.nsmequities.orders.ouch.v5_0.enums;

import java.util.Optional;

/**
 * Appendage Id
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ReplaceOrderOptionalField {

    /**
     * Replace Order Optional MinQty Enum
     */
    MINQTY((short) 3, "Replace Order Optional MinQty Enum"),

    /**
     * Replace Order Optional MaxFloor Enum
     */
    MAXFLOOR((short) 5, "Replace Order Optional MaxFloor Enum"),

    /**
     * Replace Order Optional PriceType Enum
     */
    PRICETYPE((short) 6, "Replace Order Optional PriceType Enum"),

    /**
     * Replace Order Optional PostOnly Enum
     */
    POSTONLY((short) 12, "Replace Order Optional PostOnly Enum"),

    /**
     * Replace Order Optional ExpireTime Enum
     */
    EXPIRETIME((short) 15, "Replace Order Optional ExpireTime Enum"),

    /**
     * Replace Order Optional TradeNow Enum
     */
    TRADENOW((short) 16, "Replace Order Optional TradeNow Enum"),

    /**
     * Replace Order Optional HandleInst Enum
     */
    HANDLEINST((short) 17, "Replace Order Optional HandleInst Enum"),

    /**
     * Replace Order Optional RandomReserves Enum
     */
    RANDOMRESERVES((short) 13, "Replace Order Optional RandomReserves Enum"),

    /**
     * Replace Order Optional PegOffset Enum
     */
    PEGOFFSET((short) 7, "Replace Order Optional PegOffset Enum"),

    /**
     * Replace Order Optional DiscretionPrice Enum
     */
    DISCRETIONPRICE((short) 9, "Replace Order Optional DiscretionPrice Enum"),

    /**
     * Replace Order Optional DiscretionPriceType Enum
     */
    DISCRETIONPRICETYPE((short) 10, "Replace Order Optional DiscretionPriceType Enum"),

    /**
     * Replace Order Optional DiscretionPegOffset Enum
     */
    DISCRETIONPEGOFFSET((short) 11, "Replace Order Optional DiscretionPegOffset Enum"),

    /**
     * Replace Order Optional Shares Located Enum
     */
    SHARES_LOCATED((short) 25, "Replace Order Optional Shares Located Enum"),

    /**
     * Replace Order Optional Locate Broker Enum
     */
    LOCATE_BROKER((short) 26, "Replace Order Optional Locate Broker Enum"),

    /**
     * Replace Order Optional UserRefIdx Enum
     */
    USERREFIDX((short) 28, "Replace Order Optional UserRefIdx Enum"),

    /**
     * Replace Order Optional Side Enum
     */
    SIDE((short) 27, "Replace Order Optional Side Enum"),

    /**
     * Replace Order Optional AIQ Strategy Enum
     */
    AIQ_STRATEGY((short) 29, "Replace Order Optional AIQ Strategy Enum"),

    /**
     * Replace Order Optional AIQ Group ID Enum
     */
    AIQ_GROUP_ID((short) 30, "Replace Order Optional AIQ Group ID Enum");

    private final short wire;

    private final String description;

    ReplaceOrderOptionalField(short wire, String description) {
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
    public static Optional<ReplaceOrderOptionalField> fromWire(short wire) {
        return switch (wire) {
            case 3 -> Optional.of(MINQTY);
            case 5 -> Optional.of(MAXFLOOR);
            case 6 -> Optional.of(PRICETYPE);
            case 12 -> Optional.of(POSTONLY);
            case 15 -> Optional.of(EXPIRETIME);
            case 16 -> Optional.of(TRADENOW);
            case 17 -> Optional.of(HANDLEINST);
            case 13 -> Optional.of(RANDOMRESERVES);
            case 7 -> Optional.of(PEGOFFSET);
            case 9 -> Optional.of(DISCRETIONPRICE);
            case 10 -> Optional.of(DISCRETIONPRICETYPE);
            case 11 -> Optional.of(DISCRETIONPEGOFFSET);
            case 25 -> Optional.of(SHARES_LOCATED);
            case 26 -> Optional.of(LOCATE_BROKER);
            case 28 -> Optional.of(USERREFIDX);
            case 27 -> Optional.of(SIDE);
            case 29 -> Optional.of(AIQ_STRATEGY);
            case 30 -> Optional.of(AIQ_GROUP_ID);
            default -> Optional.empty();
        };
    }
}
