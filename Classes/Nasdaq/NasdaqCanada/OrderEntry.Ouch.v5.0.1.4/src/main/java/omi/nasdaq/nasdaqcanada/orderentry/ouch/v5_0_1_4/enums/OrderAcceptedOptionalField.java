package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * Appendage Id
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderAcceptedOptionalField {

    /**
     * Order Accepted Optional UserRefIdx Enum
     */
    USERREFIDX((short) 37, "Order Accepted Optional UserRefIdx Enum"),

    /**
     * Order Accepted Optional Account Enum
     */
    ACCOUNT((short) 1, "Order Accepted Optional Account Enum"),

    /**
     * Order Accepted Optional PegType Enum
     */
    PEGTYPE((short) 2, "Order Accepted Optional PegType Enum"),

    /**
     * Order Accepted Optional MinQtyType Enum
     */
    MINQTYTYPE((short) 3, "Order Accepted Optional MinQtyType Enum"),

    /**
     * Order Accepted Optional MinQty Enum
     */
    MINQTY((short) 4, "Order Accepted Optional MinQty Enum"),

    /**
     * Order Accepted Optional MaxFloor Enum
     */
    MAXFLOOR((short) 5, "Order Accepted Optional MaxFloor Enum"),

    /**
     * Order Accepted Optional ExpireTime Enum
     */
    EXPIRETIME((short) 6, "Order Accepted Optional ExpireTime Enum"),

    /**
     * Order Accepted Optional PegOffset Enum
     */
    PEGOFFSET((short) 7, "Order Accepted Optional PegOffset Enum"),

    /**
     * Order Accepted Optional TargetStrategy Enum
     */
    TARGETSTRATEGY((short) 8, "Order Accepted Optional TargetStrategy Enum"),

    /**
     * Order Accepted Optional OrderOrigination Enum
     */
    ORDERORIGINATION((short) 9, "Order Accepted Optional OrderOrigination Enum"),

    /**
     * Order Accepted Optional RoutingArrangementIndicator Enum
     */
    ROUTINGARRANGEMENTINDICATOR((short) 10, "Order Accepted Optional RoutingArrangementIndicator Enum"),

    /**
     * Order Accepted Optional BasketTrade Enum
     */
    BASKETTRADE((short) 11, "Order Accepted Optional BasketTrade Enum"),

    /**
     * Order Accepted Optional ProgramTrade Enum
     */
    PROGRAMTRADE((short) 12, "Order Accepted Optional ProgramTrade Enum"),

    /**
     * Order Accepted Optional Jitney Enum
     */
    JITNEY((short) 14, "Order Accepted Optional Jitney Enum"),

    /**
     * Order Accepted Optional GEFEligible Enum
     */
    GEFELIGIBLE((short) 15, "Order Accepted Optional GEFEligible Enum"),

    /**
     * Order Accepted Optional Anonymous Enum
     */
    ANONYMOUS((short) 16, "Order Accepted Optional Anonymous Enum"),

    /**
     * Order Accepted Optional UMIRRegulationID Enum
     */
    UMIRREGULATIONID((short) 17, "Order Accepted Optional UMIRRegulationID Enum"),

    /**
     * Order Accepted Optional Bypass Enum
     */
    BYPASS((short) 18, "Order Accepted Optional Bypass Enum"),

    /**
     * Order Accepted Optional TSXNCIB Enum
     */
    TSXNCIB((short) 19, "Order Accepted Optional TSXNCIB Enum"),

    /**
     * Order Accepted Optional NoTradeFeat Enum
     */
    NOTRADEFEAT((short) 20, "Order Accepted Optional NoTradeFeat Enum"),

    /**
     * Order Accepted Optional NoTradeKey Enum
     */
    NOTRADEKEY((short) 21, "Order Accepted Optional NoTradeKey Enum"),

    /**
     * Order Accepted Optional ShortMarkingExempt Enum
     */
    SHORTMARKINGEXEMPT((short) 22, "Order Accepted Optional ShortMarkingExempt Enum"),

    /**
     * Order Accepted Optional POComment Enum
     */
    POCOMMENT((short) 23, "Order Accepted Optional POComment Enum"),

    /**
     * Order Accepted Optional DisplayRange Enum
     */
    DISPLAYRANGE((short) 24, "Order Accepted Optional DisplayRange Enum"),

    /**
     * Order Accepted Optional CustomerAccount Enum
     */
    CUSTOMERACCOUNT((short) 25, "Order Accepted Optional CustomerAccount Enum"),

    /**
     * Order Accepted Optional AlgorithmID Enum
     */
    ALGORITHMID((short) 26, "Order Accepted Optional AlgorithmID Enum"),

    /**
     * Order Accepted Optional CustomerLEI Enum
     */
    CUSTOMERLEI((short) 27, "Order Accepted Optional CustomerLEI Enum"),

    /**
     * Order Accepted Optional BrokerLEI Enum
     */
    BROKERLEI((short) 28, "Order Accepted Optional BrokerLEI Enum"),

    /**
     * Order Accepted Optional ConditionalOrder Enum
     */
    CONDITIONALORDER((short) 29, "Order Accepted Optional ConditionalOrder Enum"),

    /**
     * Order Accepted Optional AllowConditional Enum
     */
    ALLOWCONDITIONAL((short) 30, "Order Accepted Optional AllowConditional Enum"),

    /**
     * Order Accepted Optional FirmUpID Enum
     */
    FIRMUPID((short) 31, "Order Accepted Optional FirmUpID Enum"),

    /**
     * Order Accepted Optional CXDConnect Enum
     */
    CXDCONNECT((short) 32, "Order Accepted Optional CXDConnect Enum"),

    /**
     * Order Accepted Optional PureStreamConnect Enum
     */
    PURESTREAMCONNECT((short) 33, "Order Accepted Optional PureStreamConnect Enum"),

    /**
     * Order Accepted Optional MinRate Enum
     */
    MINRATE((short) 34, "Order Accepted Optional MinRate Enum"),

    /**
     * Order Accepted Optional MaxRate Enum
     */
    MAXRATE((short) 35, "Order Accepted Optional MaxRate Enum"),

    /**
     * Order Accepted Optional RoutingStrategy Enum
     */
    ROUTINGSTRATEGY((short) 39, "Order Accepted Optional RoutingStrategy Enum"),

    /**
     * Order Accepted Optional HandlInst Enum
     */
    HANDLINST((short) 43, "Order Accepted Optional HandlInst Enum"),

    /**
     * Order Accepted Optional RepriceReason Enum
     */
    REPRICEREASON((short) 44, "Order Accepted Optional RepriceReason Enum"),

    /**
     * Order Accepted Optional NBBOSetter Enum
     */
    NBBOSETTER((short) 45, "Order Accepted Optional NBBOSetter Enum");

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
            case 37 -> Optional.of(USERREFIDX);
            case 1 -> Optional.of(ACCOUNT);
            case 2 -> Optional.of(PEGTYPE);
            case 3 -> Optional.of(MINQTYTYPE);
            case 4 -> Optional.of(MINQTY);
            case 5 -> Optional.of(MAXFLOOR);
            case 6 -> Optional.of(EXPIRETIME);
            case 7 -> Optional.of(PEGOFFSET);
            case 8 -> Optional.of(TARGETSTRATEGY);
            case 9 -> Optional.of(ORDERORIGINATION);
            case 10 -> Optional.of(ROUTINGARRANGEMENTINDICATOR);
            case 11 -> Optional.of(BASKETTRADE);
            case 12 -> Optional.of(PROGRAMTRADE);
            case 14 -> Optional.of(JITNEY);
            case 15 -> Optional.of(GEFELIGIBLE);
            case 16 -> Optional.of(ANONYMOUS);
            case 17 -> Optional.of(UMIRREGULATIONID);
            case 18 -> Optional.of(BYPASS);
            case 19 -> Optional.of(TSXNCIB);
            case 20 -> Optional.of(NOTRADEFEAT);
            case 21 -> Optional.of(NOTRADEKEY);
            case 22 -> Optional.of(SHORTMARKINGEXEMPT);
            case 23 -> Optional.of(POCOMMENT);
            case 24 -> Optional.of(DISPLAYRANGE);
            case 25 -> Optional.of(CUSTOMERACCOUNT);
            case 26 -> Optional.of(ALGORITHMID);
            case 27 -> Optional.of(CUSTOMERLEI);
            case 28 -> Optional.of(BROKERLEI);
            case 29 -> Optional.of(CONDITIONALORDER);
            case 30 -> Optional.of(ALLOWCONDITIONAL);
            case 31 -> Optional.of(FIRMUPID);
            case 32 -> Optional.of(CXDCONNECT);
            case 33 -> Optional.of(PURESTREAMCONNECT);
            case 34 -> Optional.of(MINRATE);
            case 35 -> Optional.of(MAXRATE);
            case 39 -> Optional.of(ROUTINGSTRATEGY);
            case 43 -> Optional.of(HANDLINST);
            case 44 -> Optional.of(REPRICEREASON);
            case 45 -> Optional.of(NBBOSETTER);
            default -> Optional.empty();
        };
    }
}
