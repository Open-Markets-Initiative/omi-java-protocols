package omi.nasdaq.nsmequities.orders.ouch.v5_0.enums;

import java.util.Optional;

/**
 * Appendage Id
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ReplacedMessageOptionalField {

    /**
     * Replaced Message Optional Firm Enum
     */
    FIRM((short) 2, "Replaced Message Optional Firm Enum"),

    /**
     * Replaced Message Optional MinQty Enum
     */
    MINQTY((short) 3, "Replaced Message Optional MinQty Enum"),

    /**
     * Replaced Message Optional MaxFloor Enum
     */
    MAXFLOOR((short) 5, "Replaced Message Optional MaxFloor Enum"),

    /**
     * Replaced Message Optional PriceType Enum
     */
    PRICETYPE((short) 6, "Replaced Message Optional PriceType Enum"),

    /**
     * Replaced Message Optional PostOnly Enum
     */
    POSTONLY((short) 12, "Replaced Message Optional PostOnly Enum"),

    /**
     * Replaced Message Optional ExpireTime Enum
     */
    EXPIRETIME((short) 15, "Replaced Message Optional ExpireTime Enum"),

    /**
     * Replaced Message Optional TradeNow Enum
     */
    TRADENOW((short) 16, "Replaced Message Optional TradeNow Enum"),

    /**
     * Replaced Message Optional HandleInst Enum
     */
    HANDLEINST((short) 17, "Replaced Message Optional HandleInst Enum"),

    /**
     * Replaced Message Optional BBO Weight Indicator Enum
     */
    BBO_WEIGHT_INDICATOR((short) 18, "Replaced Message Optional BBO Weight Indicator Enum"),

    /**
     * Replaced Message Optional UserRefIdx Enum
     */
    USERREFIDX((short) 28, "Replaced Message Optional UserRefIdx Enum"),

    /**
     * Replaced Message Optional AIQ Strategy Enum
     */
    AIQ_STRATEGY((short) 29, "Replaced Message Optional AIQ Strategy Enum"),

    /**
     * Replaced Message Optional AIQ Group ID Enum
     */
    AIQ_GROUP_ID((short) 30, "Replaced Message Optional AIQ Group ID Enum");

    private final short wire;

    private final String description;

    ReplacedMessageOptionalField(short wire, String description) {
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
    public static Optional<ReplacedMessageOptionalField> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(FIRM);
            case 3 -> Optional.of(MINQTY);
            case 5 -> Optional.of(MAXFLOOR);
            case 6 -> Optional.of(PRICETYPE);
            case 12 -> Optional.of(POSTONLY);
            case 15 -> Optional.of(EXPIRETIME);
            case 16 -> Optional.of(TRADENOW);
            case 17 -> Optional.of(HANDLEINST);
            case 18 -> Optional.of(BBO_WEIGHT_INDICATOR);
            case 28 -> Optional.of(USERREFIDX);
            case 29 -> Optional.of(AIQ_STRATEGY);
            case 30 -> Optional.of(AIQ_GROUP_ID);
            default -> Optional.empty();
        };
    }
}
