package omi.box.boxoptions.solatradereporting.atr.v4_5.enums;

import java.util.Optional;

/**
 * Possible values: N: Normal – A regular trade O: CrossedOrders – A trade with the same Firm ID on both sides T: TraderCrossedOrders – A trade with the same Trader ID on both sides M: TPR Trade – A trade done by a Third Party Router P: PIP – A trade done at the end of a PIP auction F: FirmDo – A trade resulting from a Directed Order A: AsOf – A trade entered by the BOX MOC to correct a trade executed on a previous day E: Late – A trade entered by the BOX MOC to correct a trade executed on the same day S: Solicitation – A trade done as part of a Solicitation auction I: Facilitation – A trade done as part of a Facilitation auction R: FloorTrade C: Customer Cross Orders or Qualified Contingent Cross Orders
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeType {

    /**
     * Crossed Orders A Trade With The Same Firm Id On Both Sides
     */
    CROSSED_ORDERS_A_TRADE_WITH_THE_SAME_FIRM_ID_ON_BOTH_SIDES('O', "Crossed Orders A Trade With The Same Firm Id On Both Sides"),

    /**
     * Trader Crossed Orders A Trade With The Same Trader Id On Both Sides
     */
    TRADER_CROSSED_ORDERS_A_TRADE_WITH_THE_SAME_TRADER_ID_ON_BOTH_SIDES('T', "Trader Crossed Orders A Trade With The Same Trader Id On Both Sides"),

    /**
     * Tpr Trade A Trade Done By A Third Party Router
     */
    TPR_TRADE_A_TRADE_DONE_BY_A_THIRD_PARTY_ROUTER('M', "Tpr Trade A Trade Done By A Third Party Router"),

    /**
     * Pip A Trade Done At The End Of A Pip Auction
     */
    PIP_A_TRADE_DONE_AT_THE_END_OF_A_PIP_AUCTION('P', "Pip A Trade Done At The End Of A Pip Auction"),

    /**
     * Firm Do A Trade Resulting From A Directed Order
     */
    FIRM_DO_A_TRADE_RESULTING_FROM_A_DIRECTED_ORDER('F', "Firm Do A Trade Resulting From A Directed Order"),

    /**
     * As Of A Trade Entered By The Box Moc To Correct A Trade Executed On A Previous Day
     */
    AS_OF_A_TRADE_ENTERED_BY_THE_BOX_MOC_TO_CORRECT_A_TRADE_EXECUTED_ON_A_PREVIOUS_DAY('A', "As Of A Trade Entered By The Box Moc To Correct A Trade Executed On A Previous Day"),

    /**
     * Late A Trade Entered By The Box Moc To Correct A Trade Executed On The Same Day
     */
    LATE_A_TRADE_ENTERED_BY_THE_BOX_MOC_TO_CORRECT_A_TRADE_EXECUTED_ON_THE_SAME_DAY('E', "Late A Trade Entered By The Box Moc To Correct A Trade Executed On The Same Day"),

    /**
     * Solicitation A Trade Done As Part Of A Solicitation Auction
     */
    SOLICITATION_A_TRADE_DONE_AS_PART_OF_A_SOLICITATION_AUCTION('S', "Solicitation A Trade Done As Part Of A Solicitation Auction"),

    /**
     * Facilitation A Trade Done As Part Of A Facilitation Auction
     */
    FACILITATION_A_TRADE_DONE_AS_PART_OF_A_FACILITATION_AUCTION('I', "Facilitation A Trade Done As Part Of A Facilitation Auction"),

    /**
     * Floor Trade
     */
    FLOOR_TRADE('R', "Floor Trade"),

    /**
     * Customer Cross Orders Or Qualified Contingent Cross Orders
     */
    CUSTOMER_CROSS_ORDERS_OR_QUALIFIED_CONTINGENT_CROSS_ORDERS('C', "Customer Cross Orders Or Qualified Contingent Cross Orders");

    private final char wire;

    private final String description;

    TradeType(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<TradeType> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(CROSSED_ORDERS_A_TRADE_WITH_THE_SAME_FIRM_ID_ON_BOTH_SIDES);
            case 'T' -> Optional.of(TRADER_CROSSED_ORDERS_A_TRADE_WITH_THE_SAME_TRADER_ID_ON_BOTH_SIDES);
            case 'M' -> Optional.of(TPR_TRADE_A_TRADE_DONE_BY_A_THIRD_PARTY_ROUTER);
            case 'P' -> Optional.of(PIP_A_TRADE_DONE_AT_THE_END_OF_A_PIP_AUCTION);
            case 'F' -> Optional.of(FIRM_DO_A_TRADE_RESULTING_FROM_A_DIRECTED_ORDER);
            case 'A' -> Optional.of(AS_OF_A_TRADE_ENTERED_BY_THE_BOX_MOC_TO_CORRECT_A_TRADE_EXECUTED_ON_A_PREVIOUS_DAY);
            case 'E' -> Optional.of(LATE_A_TRADE_ENTERED_BY_THE_BOX_MOC_TO_CORRECT_A_TRADE_EXECUTED_ON_THE_SAME_DAY);
            case 'S' -> Optional.of(SOLICITATION_A_TRADE_DONE_AS_PART_OF_A_SOLICITATION_AUCTION);
            case 'I' -> Optional.of(FACILITATION_A_TRADE_DONE_AS_PART_OF_A_FACILITATION_AUCTION);
            case 'R' -> Optional.of(FLOOR_TRADE);
            case 'C' -> Optional.of(CUSTOMER_CROSS_ORDERS_OR_QUALIFIED_CONTINGENT_CROSS_ORDERS);
            default -> Optional.empty();
        };
    }
}
