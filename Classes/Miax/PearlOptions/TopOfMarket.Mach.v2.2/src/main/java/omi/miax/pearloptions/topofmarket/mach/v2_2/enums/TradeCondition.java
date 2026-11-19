package omi.miax.pearloptions.topofmarket.mach.v2_2.enums;

import java.util.Optional;

/**
 * Trade Condition Value
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
    CANCEL_OF_TRADE_PREVIOUSLY_REPORTED_OTHER_THAN_AS_THE_LAST_OR_OPENING('A', "Cancel Of Trade Previously Reported Other Than As The Last Or Opening For The Particular Option"),

    /**
     * Trade That Is Late And Is Out Of Sequence
     */
    LATE_AND_IS_OUT_OF_SEQUENCE('B', "Trade That Is Late And Is Out Of Sequence"),

    /**
     * Cancel Of The Last Reported Trade For The Particular Option
     */
    CANCEL_OF_THE_LAST_REPORTED_TRADE('C', "Cancel Of The Last Reported Trade For The Particular Option"),

    /**
     * Trade That Is Late And Is In Correct Sequence
     */
    LATE_AND_IS_IN_CORRECT_SEQUENCE('D', "Trade That Is Late And Is In Correct Sequence"),

    /**
     * Cancel Of The First Opening Reported Trade For The Particular Option
     */
    CANCEL_OF_THE_FIRST_REPORTED_TRADE('E', "Cancel Of The First Opening Reported Trade For The Particular Option"),

    /**
     * Trade That Is Late Report Of The Opening Trade And Is Out Of Sequence
     */
    LATE_REPORT_OF_THE_OPENING_TRADE_AND_IS_OUT_OF_SEQUENCE('F', "Trade That Is Late Report Of The Opening Trade And Is Out Of Sequence"),

    /**
     * Cancel Of The Only Reported Trade For The Particular Option
     */
    CANCEL_OF_THE_ONLY_REPORTED_TRADE('G', "Cancel Of The Only Reported Trade For The Particular Option"),

    /**
     * Trade That Is Late Report Of The Opening Trade And Is In Correct Sequence
     */
    LATE_REPORT_OF_THE_OPENING_TRADE_AND_IS_IN_CORRECT_SEQUENCE('H', "Trade That Is Late Report Of The Opening Trade And Is In Correct Sequence"),

    /**
     * Reserved For Future Use
     */
    RESERVED_I('I', "Reserved For Future Use"),

    /**
     * Trade Due To Reopening Of An Option In Which Trading Has Been Previously Halted Process As A Regular Transaction
     */
    REOPENING_OF_AN_OPTION('J', "Trade Due To Reopening Of An Option In Which Trading Has Been Previously Halted Process As A Regular Transaction"),

    /**
     * Reserved For Future Use
     */
    RESERVED_K('K', "Reserved For Future Use"),

    /**
     * Transaction Represents A Trade In Two Options In The Same Class A Buy And A Sell In The Same Class Prefix Appears Solely For Information Process As A Regular Transaction
     */
    A_BUY_AND_A_SELL_IN_THE_SAME_CLASS('L', "Transaction Represents A Trade In Two Options In The Same Class A Buy And A Sell In The Same Class Prefix Appears Solely For Information Process As A Regular Transaction"),

    /**
     * Transaction Represents A Trade In Two Options In The Same Class A Buy And A Sell In A Put And A Call Prefix Appears Solely For Information Process As A Regular Transaction
     */
    A_BUY_AND_A_SELL_IN_A_PUT_AND_A_CALL('M', "Transaction Represents A Trade In Two Options In The Same Class A Buy And A Sell In A Put And A Call Prefix Appears Solely For Information Process As A Regular Transaction"),

    /**
     * Reserved For Future Use
     */
    RESERVED_N('N', "Reserved For Future Use"),

    /**
     * Reserved For Future Use
     */
    RESERVED_O('O', "Reserved For Future Use"),

    /**
     * Transaction Represents The Option Portion Of An Order Involving A Single Option Leg Buy Or Sell Of A Call Or Put And Stock Prefix Appears Solely For Information Process As A Regular Transaction
     */
    BUY_OR_SELL_OF_A_CALL_OR_PUT('P', "Transaction Represents The Option Portion Of An Order Involving A Single Option Leg Buy Or Sell Of A Call Or Put And Stock Prefix Appears Solely For Information Process As A Regular Transaction"),

    /**
     * Transaction Represents The Buying Of A Call And The Selling Of A Put For The Same Underlying Stock Or Index Prefix Appears Solely For Information Process As A Regular Transaction
     */
    BUY_OF_A_CALL_AND_A_SELL_OF_A_PUT_FOR_THE_SAME_UNDERLYING_STOCK_OR_INDEX('Q', "Transaction Represents The Buying Of A Call And The Selling Of A Put For The Same Underlying Stock Or Index Prefix Appears Solely For Information Process As A Regular Transaction"),

    /**
     * Trade Was The Execution Of An Order Which Was Stopped At A Price That Did Not Constitute A Trade Through On Another Market At The Time Of The Stop Process Like A Normal Transaction Except Dont Update Last
     */
    EXECUTION_OF_AN_ORDER_WHICH_WAS_STOPPED_AT_A_PRICE_THAT_DID_NOT_CONSTITUTE_A_TRADE_THROUGH_ON_ANOTHER_MARKET_AT_THE_TIME_OF_THE_STOP('R', "Trade Was The Execution Of An Order Which Was Stopped At A Price That Did Not Constitute A Trade Through On Another Market At The Time Of The Stop Process Like A Normal Transaction Except Dont Update Last"),

    /**
     * Trade Was The Execution Of An Order Identified As An Intermarket Sweep Order Iso
     */
    EXECUTION_OF_AN_ISO_ORDER('S', "Trade Was The Execution Of An Order Identified As An Intermarket Sweep Order Iso"),

    /**
     * Reserved For Future Use
     */
    RESERVED_T('T', "Reserved For Future Use"),

    /**
     * Trade That Is Trade Through Exempt The Trade Should Be Treated Like A Regular Sale
     */
    TRADE_THROUGH_EXEMPT('X', "Trade That Is Trade Through Exempt The Trade Should Be Treated Like A Regular Sale");

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
            case 'A' -> Optional.of(CANCEL_OF_TRADE_PREVIOUSLY_REPORTED_OTHER_THAN_AS_THE_LAST_OR_OPENING);
            case 'B' -> Optional.of(LATE_AND_IS_OUT_OF_SEQUENCE);
            case 'C' -> Optional.of(CANCEL_OF_THE_LAST_REPORTED_TRADE);
            case 'D' -> Optional.of(LATE_AND_IS_IN_CORRECT_SEQUENCE);
            case 'E' -> Optional.of(CANCEL_OF_THE_FIRST_REPORTED_TRADE);
            case 'F' -> Optional.of(LATE_REPORT_OF_THE_OPENING_TRADE_AND_IS_OUT_OF_SEQUENCE);
            case 'G' -> Optional.of(CANCEL_OF_THE_ONLY_REPORTED_TRADE);
            case 'H' -> Optional.of(LATE_REPORT_OF_THE_OPENING_TRADE_AND_IS_IN_CORRECT_SEQUENCE);
            case 'I' -> Optional.of(RESERVED_I);
            case 'J' -> Optional.of(REOPENING_OF_AN_OPTION);
            case 'K' -> Optional.of(RESERVED_K);
            case 'L' -> Optional.of(A_BUY_AND_A_SELL_IN_THE_SAME_CLASS);
            case 'M' -> Optional.of(A_BUY_AND_A_SELL_IN_A_PUT_AND_A_CALL);
            case 'N' -> Optional.of(RESERVED_N);
            case 'O' -> Optional.of(RESERVED_O);
            case 'P' -> Optional.of(BUY_OR_SELL_OF_A_CALL_OR_PUT);
            case 'Q' -> Optional.of(BUY_OF_A_CALL_AND_A_SELL_OF_A_PUT_FOR_THE_SAME_UNDERLYING_STOCK_OR_INDEX);
            case 'R' -> Optional.of(EXECUTION_OF_AN_ORDER_WHICH_WAS_STOPPED_AT_A_PRICE_THAT_DID_NOT_CONSTITUTE_A_TRADE_THROUGH_ON_ANOTHER_MARKET_AT_THE_TIME_OF_THE_STOP);
            case 'S' -> Optional.of(EXECUTION_OF_AN_ISO_ORDER);
            case 'T' -> Optional.of(RESERVED_T);
            case 'X' -> Optional.of(TRADE_THROUGH_EXEMPT);
            default -> Optional.empty();
        };
    }
}
