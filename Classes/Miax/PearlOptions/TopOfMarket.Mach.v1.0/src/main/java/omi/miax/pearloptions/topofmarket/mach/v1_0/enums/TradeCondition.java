package omi.miax.pearloptions.topofmarket.mach.v1_0.enums;

import java.util.Optional;

/**
 * Valid Values: Please refer to Appendix A
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum TradeCondition {

    /**
     * Regular
     */
    REGULAR(' ', "Regular"),

    /**
     * Cancel Of Trade Previously Reported Other Than As The Last Or Opening For The Particular Option
     */
    CANCEL_OF_TRADE('A', "Cancel Of Trade Previously Reported Other Than As The Last Or Opening For The Particular Option"),

    /**
     * Trade That Is Late And Is Out Of Sequence
     */
    TRADE_THAT_IS_LATE_AND_IS_OUT_OF_SEQUENCE('B', "Trade That Is Late And Is Out Of Sequence"),

    /**
     * Cancel Of The Last Reported Trade For The Particular Option
     */
    CANCEL_OF_THE_LAST_REPORTED_TRADE('C', "Cancel Of The Last Reported Trade For The Particular Option"),

    /**
     * Trade That Is Late And Is In Correct Sequence
     */
    TRADE_THAT_IS_LATE_AND_IS_IN_CORRECT_SEQUENCE('D', "Trade That Is Late And Is In Correct Sequence"),

    /**
     * Cancel Of The First Opening Reported Trade For The Particular Option
     */
    CANCEL_OF_THE_FIRST_OPENING_REPORTED_TRADE('E', "Cancel Of The First Opening Reported Trade For The Particular Option"),

    /**
     * Trade That Is Late Report Of The Opening Trade And Is Out Of Sequence
     */
    TRADE_THAT_IS_LATE_REPORT_OF_THE_OPENING_TRADE_AND_IS_OUT_OF_SEQUENCE('F', "Trade That Is Late Report Of The Opening Trade And Is Out Of Sequence"),

    /**
     * Cancel Of The Only Reported Trade For The Particular Option
     */
    CANCEL_OF_THE_ONLY_REPORTED_TRADE('G', "Cancel Of The Only Reported Trade For The Particular Option"),

    /**
     * Trade That Is Late Report Of The Opening Trade And Is In Correct Sequence
     */
    TRADE_THAT_IS_LATE_REPORT_OF_THE_OPENING_TRADE_AND_IS_IN_CORRECT_SEQUENCE('H', "Trade That Is Late Report Of The Opening Trade And Is In Correct Sequence"),

    /**
     * Reserved For Future Use
     */
    RESERVED_FOR_FUTURE_USE_I('I', "Reserved For Future Use"),

    /**
     * Trade Due To Reopening Of An Option In Which Trading Has Been Previously Halted Process As A Regular Transaction
     */
    TRADE_DUE_TO_REOPENING_OF_AN_OPTION_IN_WHICH_TRADING_HAS_BEEN_PREVIOUSLY_HALTED('J', "Trade Due To Reopening Of An Option In Which Trading Has Been Previously Halted Process As A Regular Transaction"),

    /**
     * Reserved For Future Use
     */
    RESERVED_FOR_FUTURE_USE_K('K', "Reserved For Future Use"),

    /**
     * Reserved For Future Use
     */
    RESERVED_FOR_FUTURE_USE_L('L', "Reserved For Future Use"),

    /**
     * Reserved For Future Use
     */
    RESERVED_FOR_FUTURE_USE_M('M', "Reserved For Future Use"),

    /**
     * Reserved For Future Use
     */
    RESERVED_FOR_FUTURE_USE_N('N', "Reserved For Future Use"),

    /**
     * Reserved For Future Use
     */
    RESERVED_FOR_FUTURE_USE_O('O', "Reserved For Future Use"),

    /**
     * Reserved For Future Use
     */
    RESERVED_FOR_FUTURE_USE_P('P', "Reserved For Future Use"),

    /**
     * Reserved For Future Use
     */
    RESERVED_FOR_FUTURE_USE_Q('Q', "Reserved For Future Use"),

    /**
     * Trade Was The Execution Of An Order Which Was Stopped At A Price That Did Not Constitute A Trade Through On Another Market At The Time Of The Stop Process Like A Normal Transaction Except Dont Update Last
     */
    TRADE_WAS_THE_EXECUTION_OF_AN_ORDER_WHICH_WAS_STOPPED_AT_A_PRICE_THAT_DID_NOT_CONSTITUTE_A_TRADE_THROUGH_ON_ANOTHER_MARKET_AT_THE_TIME_OF_THE_STOP('R', "Trade Was The Execution Of An Order Which Was Stopped At A Price That Did Not Constitute A Trade Through On Another Market At The Time Of The Stop Process Like A Normal Transaction Except Dont Update Last"),

    /**
     * Trade Was The Execution Of An Order Identified As An Intermarket Sweep Order Iso
     */
    TRADE_WAS_THE_EXECUTION_OF_AN_ORDER_IDENTIFIED('S', "Trade Was The Execution Of An Order Identified As An Intermarket Sweep Order Iso"),

    /**
     * Reserved For Future Use
     */
    RESERVED_FOR_FUTURE_USE_T('T', "Reserved For Future Use"),

    /**
     * Trade That Is Trade Through Exempt The Trade Should Be Treated Like A Regular Sale
     */
    TRADE_THAT_IS_TRADE_THROUGH_EXEMPT('X', "Trade That Is Trade Through Exempt The Trade Should Be Treated Like A Regular Sale");

    private final char wire;

    private final String description;

    TradeCondition(char wire, String description) {
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
    public static Optional<TradeCondition> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(REGULAR);
            case 'A' -> Optional.of(CANCEL_OF_TRADE);
            case 'B' -> Optional.of(TRADE_THAT_IS_LATE_AND_IS_OUT_OF_SEQUENCE);
            case 'C' -> Optional.of(CANCEL_OF_THE_LAST_REPORTED_TRADE);
            case 'D' -> Optional.of(TRADE_THAT_IS_LATE_AND_IS_IN_CORRECT_SEQUENCE);
            case 'E' -> Optional.of(CANCEL_OF_THE_FIRST_OPENING_REPORTED_TRADE);
            case 'F' -> Optional.of(TRADE_THAT_IS_LATE_REPORT_OF_THE_OPENING_TRADE_AND_IS_OUT_OF_SEQUENCE);
            case 'G' -> Optional.of(CANCEL_OF_THE_ONLY_REPORTED_TRADE);
            case 'H' -> Optional.of(TRADE_THAT_IS_LATE_REPORT_OF_THE_OPENING_TRADE_AND_IS_IN_CORRECT_SEQUENCE);
            case 'I' -> Optional.of(RESERVED_FOR_FUTURE_USE_I);
            case 'J' -> Optional.of(TRADE_DUE_TO_REOPENING_OF_AN_OPTION_IN_WHICH_TRADING_HAS_BEEN_PREVIOUSLY_HALTED);
            case 'K' -> Optional.of(RESERVED_FOR_FUTURE_USE_K);
            case 'L' -> Optional.of(RESERVED_FOR_FUTURE_USE_L);
            case 'M' -> Optional.of(RESERVED_FOR_FUTURE_USE_M);
            case 'N' -> Optional.of(RESERVED_FOR_FUTURE_USE_N);
            case 'O' -> Optional.of(RESERVED_FOR_FUTURE_USE_O);
            case 'P' -> Optional.of(RESERVED_FOR_FUTURE_USE_P);
            case 'Q' -> Optional.of(RESERVED_FOR_FUTURE_USE_Q);
            case 'R' -> Optional.of(TRADE_WAS_THE_EXECUTION_OF_AN_ORDER_WHICH_WAS_STOPPED_AT_A_PRICE_THAT_DID_NOT_CONSTITUTE_A_TRADE_THROUGH_ON_ANOTHER_MARKET_AT_THE_TIME_OF_THE_STOP);
            case 'S' -> Optional.of(TRADE_WAS_THE_EXECUTION_OF_AN_ORDER_IDENTIFIED);
            case 'T' -> Optional.of(RESERVED_FOR_FUTURE_USE_T);
            case 'X' -> Optional.of(TRADE_THAT_IS_TRADE_THROUGH_EXEMPT);
            default -> Optional.empty();
        };
    }
}
