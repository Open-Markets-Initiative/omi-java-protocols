package omi.nasdaq.nsmequities.orders.ouch.v5_0.enums;

import java.util.Optional;

/**
 * Appendage Id
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum EnterOrderOptionalField {

    /**
     * Enter Order Optional Firm Enum
     */
    FIRM((short) 2, "Enter Order Optional Firm Enum"),

    /**
     * Enter Order Optional MinQty Enum
     */
    MINQTY((short) 3, "Enter Order Optional MinQty Enum"),

    /**
     * Enter Order Optional CustomerType Enum
     */
    CUSTOMERTYPE((short) 4, "Enter Order Optional CustomerType Enum"),

    /**
     * Enter Order Optional MaxFloor Enum
     */
    MAXFLOOR((short) 5, "Enter Order Optional MaxFloor Enum"),

    /**
     * Enter Order Optional PriceType Enum
     */
    PRICETYPE((short) 6, "Enter Order Optional PriceType Enum"),

    /**
     * Enter Order Optional PegOffset Enum
     */
    PEGOFFSET((short) 7, "Enter Order Optional PegOffset Enum"),

    /**
     * Enter Order Optional DiscretionPrice Enum
     */
    DISCRETIONPRICE((short) 9, "Enter Order Optional DiscretionPrice Enum"),

    /**
     * Enter Order Optional DiscretionPriceType Enum
     */
    DISCRETIONPRICETYPE((short) 10, "Enter Order Optional DiscretionPriceType Enum"),

    /**
     * Enter Order Optional DiscretionPegOffset Enum
     */
    DISCRETIONPEGOFFSET((short) 11, "Enter Order Optional DiscretionPegOffset Enum"),

    /**
     * Enter Order Optional PostOnly Enum
     */
    POSTONLY((short) 12, "Enter Order Optional PostOnly Enum"),

    /**
     * Enter Order Optional RandomReserves Enum
     */
    RANDOMRESERVES((short) 13, "Enter Order Optional RandomReserves Enum"),

    /**
     * Enter Order Optional ExpireTime Enum
     */
    EXPIRETIME((short) 15, "Enter Order Optional ExpireTime Enum"),

    /**
     * Enter Order Optional TradeNow Enum
     */
    TRADENOW((short) 16, "Enter Order Optional TradeNow Enum"),

    /**
     * Enter Order Optional HandleInst Enum
     */
    HANDLEINST((short) 17, "Enter Order Optional HandleInst Enum"),

    /**
     * Enter Order Optional Group ID Enum
     */
    GROUP_ID((short) 24, "Enter Order Optional Group ID Enum"),

    /**
     * Enter Order Optional Shares Located Enum
     */
    SHARES_LOCATED((short) 25, "Enter Order Optional Shares Located Enum"),

    /**
     * Enter Order Optional Locate Broker Enum
     */
    LOCATE_BROKER((short) 26, "Enter Order Optional Locate Broker Enum"),

    /**
     * Enter Order Optional UserRefIdx Enum
     */
    USERREFIDX((short) 28, "Enter Order Optional UserRefIdx Enum"),

    /**
     * Enter Order Optional AIQ Strategy Enum
     */
    AIQ_STRATEGY((short) 29, "Enter Order Optional AIQ Strategy Enum"),

    /**
     * Enter Order Optional AIQ Group ID Enum
     */
    AIQ_GROUP_ID((short) 30, "Enter Order Optional AIQ Group ID Enum");

    private final short wire;

    private final String description;

    EnterOrderOptionalField(short wire, String description) {
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
    public static Optional<EnterOrderOptionalField> fromWire(short wire) {
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
            case 15 -> Optional.of(EXPIRETIME);
            case 16 -> Optional.of(TRADENOW);
            case 17 -> Optional.of(HANDLEINST);
            case 24 -> Optional.of(GROUP_ID);
            case 25 -> Optional.of(SHARES_LOCATED);
            case 26 -> Optional.of(LOCATE_BROKER);
            case 28 -> Optional.of(USERREFIDX);
            case 29 -> Optional.of(AIQ_STRATEGY);
            case 30 -> Optional.of(AIQ_GROUP_ID);
            default -> Optional.empty();
        };
    }
}
