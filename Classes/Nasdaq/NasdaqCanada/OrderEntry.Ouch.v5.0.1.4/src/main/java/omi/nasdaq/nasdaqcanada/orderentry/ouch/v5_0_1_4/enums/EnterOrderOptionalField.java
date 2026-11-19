package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * Appendage Id
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum EnterOrderOptionalField {

    /**
     * Enter Order Optional UserRefIdx Enum
     */
    USERREFIDX((short) 37, "Enter Order Optional UserRefIdx Enum"),

    /**
     * Enter Order Optional Account Enum
     */
    ACCOUNT((short) 1, "Enter Order Optional Account Enum"),

    /**
     * Enter Order Optional PegType Enum
     */
    PEGTYPE((short) 2, "Enter Order Optional PegType Enum"),

    /**
     * Enter Order Optional MinQtyType Enum
     */
    MINQTYTYPE((short) 3, "Enter Order Optional MinQtyType Enum"),

    /**
     * Enter Order Optional MinQty Enum
     */
    MINQTY((short) 4, "Enter Order Optional MinQty Enum"),

    /**
     * Enter Order Optional MaxFloor Enum
     */
    MAXFLOOR((short) 5, "Enter Order Optional MaxFloor Enum"),

    /**
     * Enter Order Optional ExpireTime Enum
     */
    EXPIRETIME((short) 6, "Enter Order Optional ExpireTime Enum"),

    /**
     * Enter Order Optional PegOffset Enum
     */
    PEGOFFSET((short) 7, "Enter Order Optional PegOffset Enum"),

    /**
     * Enter Order Optional TargetStrategy Enum
     */
    TARGETSTRATEGY((short) 8, "Enter Order Optional TargetStrategy Enum"),

    /**
     * Enter Order Optional OrderOrigination Enum
     */
    ORDERORIGINATION((short) 9, "Enter Order Optional OrderOrigination Enum"),

    /**
     * Enter Order Optional RoutingArrangementIndicator Enum
     */
    ROUTINGARRANGEMENTINDICATOR((short) 10, "Enter Order Optional RoutingArrangementIndicator Enum"),

    /**
     * Enter Order Optional BasketTrade Enum
     */
    BASKETTRADE((short) 11, "Enter Order Optional BasketTrade Enum"),

    /**
     * Enter Order Optional ProgramTrade Enum
     */
    PROGRAMTRADE((short) 12, "Enter Order Optional ProgramTrade Enum"),

    /**
     * Enter Order Optional Jitney Enum
     */
    JITNEY((short) 14, "Enter Order Optional Jitney Enum"),

    /**
     * Enter Order Optional GEFEligible Enum
     */
    GEFELIGIBLE((short) 15, "Enter Order Optional GEFEligible Enum"),

    /**
     * Enter Order Optional Anonymous Enum
     */
    ANONYMOUS((short) 16, "Enter Order Optional Anonymous Enum"),

    /**
     * Enter Order Optional UMIRRegulationID Enum
     */
    UMIRREGULATIONID((short) 17, "Enter Order Optional UMIRRegulationID Enum"),

    /**
     * Enter Order Optional Bypass Enum
     */
    BYPASS((short) 18, "Enter Order Optional Bypass Enum"),

    /**
     * Enter Order Optional TSXNCIB Enum
     */
    TSXNCIB((short) 19, "Enter Order Optional TSXNCIB Enum"),

    /**
     * Enter Order Optional NoTradeFeat Enum
     */
    NOTRADEFEAT((short) 20, "Enter Order Optional NoTradeFeat Enum"),

    /**
     * Enter Order Optional NoTradeKey Enum
     */
    NOTRADEKEY((short) 21, "Enter Order Optional NoTradeKey Enum"),

    /**
     * Enter Order Optional ShortMarkingExempt Enum
     */
    SHORTMARKINGEXEMPT((short) 22, "Enter Order Optional ShortMarkingExempt Enum"),

    /**
     * Enter Order Optional POComment Enum
     */
    POCOMMENT((short) 23, "Enter Order Optional POComment Enum"),

    /**
     * Enter Order Optional DisplayRange Enum
     */
    DISPLAYRANGE((short) 24, "Enter Order Optional DisplayRange Enum"),

    /**
     * Enter Order Optional CustomerAccount Enum
     */
    CUSTOMERACCOUNT((short) 25, "Enter Order Optional CustomerAccount Enum"),

    /**
     * Enter Order Optional AlgorithmID Enum
     */
    ALGORITHMID((short) 26, "Enter Order Optional AlgorithmID Enum"),

    /**
     * Enter Order Optional CustomerLEI Enum
     */
    CUSTOMERLEI((short) 27, "Enter Order Optional CustomerLEI Enum"),

    /**
     * Enter Order Optional BrokerLEI Enum
     */
    BROKERLEI((short) 28, "Enter Order Optional BrokerLEI Enum"),

    /**
     * Enter Order Optional ConditionalOrder Enum
     */
    CONDITIONALORDER((short) 29, "Enter Order Optional ConditionalOrder Enum"),

    /**
     * Enter Order Optional AllowConditional Enum
     */
    ALLOWCONDITIONAL((short) 30, "Enter Order Optional AllowConditional Enum"),

    /**
     * Enter Order Optional FirmUpID Enum
     */
    FIRMUPID((short) 31, "Enter Order Optional FirmUpID Enum"),

    /**
     * Enter Order Optional CXDConnect Enum
     */
    CXDCONNECT((short) 32, "Enter Order Optional CXDConnect Enum"),

    /**
     * Enter Order Optional PureStreamConnect Enum
     */
    PURESTREAMCONNECT((short) 33, "Enter Order Optional PureStreamConnect Enum"),

    /**
     * Enter Order Optional MinRate Enum
     */
    MINRATE((short) 34, "Enter Order Optional MinRate Enum"),

    /**
     * Enter Order Optional MaxRate Enum
     */
    MAXRATE((short) 35, "Enter Order Optional MaxRate Enum"),

    /**
     * Enter Order Optional RoutingStrategy Enum
     */
    ROUTINGSTRATEGY((short) 39, "Enter Order Optional RoutingStrategy Enum"),

    /**
     * Enter Order Optional HandlInst Enum
     */
    HANDLINST((short) 43, "Enter Order Optional HandlInst Enum");

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
            default -> Optional.empty();
        };
    }
}
