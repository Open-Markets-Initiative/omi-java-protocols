package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * Appendage Id
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderReplacedOptionalField {

    /**
     * Order Replaced Optional UserRefIdx Enum
     */
    USERREFIDX((short) 37, "Order Replaced Optional UserRefIdx Enum"),

    /**
     * Order Replaced Optional MinQtyType Enum
     */
    MINQTYTYPE((short) 3, "Order Replaced Optional MinQtyType Enum"),

    /**
     * Order Replaced Optional PegType Enum
     */
    PEGTYPE((short) 2, "Order Replaced Optional PegType Enum"),

    /**
     * Order Replaced Optional MinQty Enum
     */
    MINQTY((short) 4, "Order Replaced Optional MinQty Enum"),

    /**
     * Order Replaced Optional MaxFloor Enum
     */
    MAXFLOOR((short) 5, "Order Replaced Optional MaxFloor Enum"),

    /**
     * Order Replaced Optional ExpireTime Enum
     */
    EXPIRETIME((short) 6, "Order Replaced Optional ExpireTime Enum"),

    /**
     * Order Replaced Optional PegOffset Enum
     */
    PEGOFFSET((short) 7, "Order Replaced Optional PegOffset Enum"),

    /**
     * Order Replaced Optional TargetStrategy Enum
     */
    TARGETSTRATEGY((short) 8, "Order Replaced Optional TargetStrategy Enum"),

    /**
     * Order Replaced Optional OrderOrigination Enum
     */
    ORDERORIGINATION((short) 9, "Order Replaced Optional OrderOrigination Enum"),

    /**
     * Order Replaced Optional RoutingArrangementIndicator Enum
     */
    ROUTINGARRANGEMENTINDICATOR((short) 10, "Order Replaced Optional RoutingArrangementIndicator Enum"),

    /**
     * Order Replaced Optional UMIRRegulationID Enum
     */
    UMIRREGULATIONID((short) 17, "Order Replaced Optional UMIRRegulationID Enum"),

    /**
     * Order Replaced Optional Anonymous Enum
     */
    ANONYMOUS((short) 16, "Order Replaced Optional Anonymous Enum"),

    /**
     * Order Replaced Optional DisplayRange Enum
     */
    DISPLAYRANGE((short) 24, "Order Replaced Optional DisplayRange Enum"),

    /**
     * Order Replaced Optional CustomerAccount Enum
     */
    CUSTOMERACCOUNT((short) 25, "Order Replaced Optional CustomerAccount Enum"),

    /**
     * Order Replaced Optional AlgorithmID Enum
     */
    ALGORITHMID((short) 26, "Order Replaced Optional AlgorithmID Enum"),

    /**
     * Order Replaced Optional CustomerLEI Enum
     */
    CUSTOMERLEI((short) 27, "Order Replaced Optional CustomerLEI Enum"),

    /**
     * Order Replaced Optional BrokerLEI Enum
     */
    BROKERLEI((short) 28, "Order Replaced Optional BrokerLEI Enum"),

    /**
     * Order Replaced Optional AllowConditional Enum
     */
    ALLOWCONDITIONAL((short) 30, "Order Replaced Optional AllowConditional Enum"),

    /**
     * Order Replaced Optional CXDConnect Enum
     */
    CXDCONNECT((short) 32, "Order Replaced Optional CXDConnect Enum"),

    /**
     * Order Replaced Optional PureStreamConnect Enum
     */
    PURESTREAMCONNECT((short) 33, "Order Replaced Optional PureStreamConnect Enum"),

    /**
     * Order Replaced Optional MinRate Enum
     */
    MINRATE((short) 34, "Order Replaced Optional MinRate Enum"),

    /**
     * Order Replaced Optional MaxRate Enum
     */
    MAXRATE((short) 35, "Order Replaced Optional MaxRate Enum"),

    /**
     * Order Replaced Optional HandlInst Enum
     */
    HANDLINST((short) 43, "Order Replaced Optional HandlInst Enum"),

    /**
     * Order Replaced Optional RepriceReason Enum
     */
    REPRICEREASON((short) 44, "Order Replaced Optional RepriceReason Enum"),

    /**
     * Order Replaced Optional NBBOSetter Enum
     */
    NBBOSETTER((short) 45, "Order Replaced Optional NBBOSetter Enum");

    private final short wire;

    private final String description;

    OrderReplacedOptionalField(short wire, String description) {
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
    public static Optional<OrderReplacedOptionalField> fromWire(short wire) {
        return switch (wire) {
            case 37 -> Optional.of(USERREFIDX);
            case 3 -> Optional.of(MINQTYTYPE);
            case 2 -> Optional.of(PEGTYPE);
            case 4 -> Optional.of(MINQTY);
            case 5 -> Optional.of(MAXFLOOR);
            case 6 -> Optional.of(EXPIRETIME);
            case 7 -> Optional.of(PEGOFFSET);
            case 8 -> Optional.of(TARGETSTRATEGY);
            case 9 -> Optional.of(ORDERORIGINATION);
            case 10 -> Optional.of(ROUTINGARRANGEMENTINDICATOR);
            case 17 -> Optional.of(UMIRREGULATIONID);
            case 16 -> Optional.of(ANONYMOUS);
            case 24 -> Optional.of(DISPLAYRANGE);
            case 25 -> Optional.of(CUSTOMERACCOUNT);
            case 26 -> Optional.of(ALGORITHMID);
            case 27 -> Optional.of(CUSTOMERLEI);
            case 28 -> Optional.of(BROKERLEI);
            case 30 -> Optional.of(ALLOWCONDITIONAL);
            case 32 -> Optional.of(CXDCONNECT);
            case 33 -> Optional.of(PURESTREAMCONNECT);
            case 34 -> Optional.of(MINRATE);
            case 35 -> Optional.of(MAXRATE);
            case 43 -> Optional.of(HANDLINST);
            case 44 -> Optional.of(REPRICEREASON);
            case 45 -> Optional.of(NBBOSETTER);
            default -> Optional.empty();
        };
    }
}
