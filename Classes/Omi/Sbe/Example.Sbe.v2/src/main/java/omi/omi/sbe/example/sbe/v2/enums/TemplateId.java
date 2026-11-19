package omi.omi.sbe.example.sbe.v2.enums;

import java.util.Optional;

/**
 * templateId
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * OpraNbboQuoteMessage
     */
    OPRA_NBBO_QUOTE_MESSAGE(16, "OpraNbboQuoteMessage"),

    /**
     * OpraLastSaleMessage
     */
    OPRA_LAST_SALE_MESSAGE(17, "OpraLastSaleMessage"),

    /**
     * OpraOpenInterestMessage
     */
    OPRA_OPEN_INTEREST_MESSAGE(18, "OpraOpenInterestMessage"),

    /**
     * OpraEndOfDaySummaryMessage
     */
    OPRA_END_OF_DAY_SUMMARY_MESSAGE(19, "OpraEndOfDaySummaryMessage"),

    /**
     * OrderMessage
     */
    ORDER_MESSAGE(20, "OrderMessage"),

    /**
     * MarketStateMessage
     */
    MARKET_STATE_MESSAGE(22, "MarketStateMessage"),

    /**
     * InstrumentDefinitionMessage
     */
    INSTRUMENT_DEFINITION_MESSAGE(24, "InstrumentDefinitionMessage"),

    /**
     * OpraAdministrativeMessage
     */
    OPRA_ADMINISTRATIVE_MESSAGE(25, "OpraAdministrativeMessage"),

    /**
     * OpraControlMessage
     */
    OPRA_CONTROL_MESSAGE(26, "OpraControlMessage"),

    /**
     * OpraUnderlyingValueMessage
     */
    OPRA_UNDERLYING_VALUE_MESSAGE(27, "OpraUnderlyingValueMessage"),

    /**
     * EquityTradeMessage
     */
    EQUITY_TRADE_MESSAGE(28, "EquityTradeMessage"),

    /**
     * EquityNbboQuoteMessage
     */
    EQUITY_NBBO_QUOTE_MESSAGE(29, "EquityNbboQuoteMessage"),

    /**
     * SecurityGroupStatusMessage
     */
    SECURITY_GROUP_STATUS_MESSAGE(30, "SecurityGroupStatusMessage");

    private final int wire;

    private final String description;

    TemplateId(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<TemplateId> fromWire(int wire) {
        return switch (wire) {
            case 16 -> Optional.of(OPRA_NBBO_QUOTE_MESSAGE);
            case 17 -> Optional.of(OPRA_LAST_SALE_MESSAGE);
            case 18 -> Optional.of(OPRA_OPEN_INTEREST_MESSAGE);
            case 19 -> Optional.of(OPRA_END_OF_DAY_SUMMARY_MESSAGE);
            case 20 -> Optional.of(ORDER_MESSAGE);
            case 22 -> Optional.of(MARKET_STATE_MESSAGE);
            case 24 -> Optional.of(INSTRUMENT_DEFINITION_MESSAGE);
            case 25 -> Optional.of(OPRA_ADMINISTRATIVE_MESSAGE);
            case 26 -> Optional.of(OPRA_CONTROL_MESSAGE);
            case 27 -> Optional.of(OPRA_UNDERLYING_VALUE_MESSAGE);
            case 28 -> Optional.of(EQUITY_TRADE_MESSAGE);
            case 29 -> Optional.of(EQUITY_NBBO_QUOTE_MESSAGE);
            case 30 -> Optional.of(SECURITY_GROUP_STATUS_MESSAGE);
            default -> Optional.empty();
        };
    }
}
