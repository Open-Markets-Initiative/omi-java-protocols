package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * Appendage Id
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ReplaceOrderRequestOptionalField {

    /**
     * Replace Order Request Optional UserRefIdx Enum
     */
    USERREFIDX((short) 37, "Replace Order Request Optional UserRefIdx Enum"),

    /**
     * Replace Order Request Optional MinQtyType Enum
     */
    MINQTYTYPE((short) 3, "Replace Order Request Optional MinQtyType Enum"),

    /**
     * Replace Order Request Optional PegType Enum
     */
    PEGTYPE((short) 2, "Replace Order Request Optional PegType Enum"),

    /**
     * Replace Order Request Optional MinQty Enum
     */
    MINQTY((short) 4, "Replace Order Request Optional MinQty Enum"),

    /**
     * Replace Order Request Optional MaxFloor Enum
     */
    MAXFLOOR((short) 5, "Replace Order Request Optional MaxFloor Enum"),

    /**
     * Replace Order Request Optional ExpireTime Enum
     */
    EXPIRETIME((short) 6, "Replace Order Request Optional ExpireTime Enum"),

    /**
     * Replace Order Request Optional PegOffset Enum
     */
    PEGOFFSET((short) 7, "Replace Order Request Optional PegOffset Enum"),

    /**
     * Replace Order Request Optional TargetStrategy Enum
     */
    TARGETSTRATEGY((short) 8, "Replace Order Request Optional TargetStrategy Enum"),

    /**
     * Replace Order Request Optional OrderOrigination Enum
     */
    ORDERORIGINATION((short) 9, "Replace Order Request Optional OrderOrigination Enum"),

    /**
     * Replace Order Request Optional RoutingArrangementIndicator Enum
     */
    ROUTINGARRANGEMENTINDICATOR((short) 10, "Replace Order Request Optional RoutingArrangementIndicator Enum"),

    /**
     * Replace Order Request Optional UMIRRegulationID Enum
     */
    UMIRREGULATIONID((short) 17, "Replace Order Request Optional UMIRRegulationID Enum"),

    /**
     * Replace Order Request Optional Anonymous Enum
     */
    ANONYMOUS((short) 16, "Replace Order Request Optional Anonymous Enum"),

    /**
     * Replace Order Request Optional DisplayRange Enum
     */
    DISPLAYRANGE((short) 24, "Replace Order Request Optional DisplayRange Enum"),

    /**
     * Replace Order Request Optional CustomerAccount Enum
     */
    CUSTOMERACCOUNT((short) 25, "Replace Order Request Optional CustomerAccount Enum"),

    /**
     * Replace Order Request Optional AlgorithmID Enum
     */
    ALGORITHMID((short) 26, "Replace Order Request Optional AlgorithmID Enum"),

    /**
     * Replace Order Request Optional CustomerLEI Enum
     */
    CUSTOMERLEI((short) 27, "Replace Order Request Optional CustomerLEI Enum"),

    /**
     * Replace Order Request Optional BrokerLEI Enum
     */
    BROKERLEI((short) 28, "Replace Order Request Optional BrokerLEI Enum"),

    /**
     * Replace Order Request Optional AllowConditional Enum
     */
    ALLOWCONDITIONAL((short) 30, "Replace Order Request Optional AllowConditional Enum"),

    /**
     * Replace Order Request Optional CXDConnect Enum
     */
    CXDCONNECT((short) 32, "Replace Order Request Optional CXDConnect Enum"),

    /**
     * Replace Order Request Optional PureStreamConnect Enum
     */
    PURESTREAMCONNECT((short) 33, "Replace Order Request Optional PureStreamConnect Enum"),

    /**
     * Replace Order Request Optional MinRate Enum
     */
    MINRATE((short) 34, "Replace Order Request Optional MinRate Enum"),

    /**
     * Replace Order Request Optional MaxRate Enum
     */
    MAXRATE((short) 35, "Replace Order Request Optional MaxRate Enum"),

    /**
     * Replace Order Request Optional HandlInst Enum
     */
    HANDLINST((short) 43, "Replace Order Request Optional HandlInst Enum");

    private final short wire;

    private final String description;

    ReplaceOrderRequestOptionalField(short wire, String description) {
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
    public static Optional<ReplaceOrderRequestOptionalField> fromWire(short wire) {
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
            default -> Optional.empty();
        };
    }
}
