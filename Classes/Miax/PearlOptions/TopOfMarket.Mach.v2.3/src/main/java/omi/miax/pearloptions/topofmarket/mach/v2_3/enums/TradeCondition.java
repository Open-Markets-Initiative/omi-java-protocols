package omi.miax.pearloptions.topofmarket.mach.v2_3.enums;

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
    RESERVED_73('I', "Reserved For Future Use"),

    /**
     * Trade Due To Reopening Of An Option In Which Trading Has Been Previously Halted Process As A Regular Transaction
     */
    REOPENING_OF_AN_OPTION('J', "Trade Due To Reopening Of An Option In Which Trading Has Been Previously Halted Process As A Regular Transaction"),

    /**
     * Reserved For Future Use
     */
    RESERVED_75('K', "Reserved For Future Use"),

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
    RESERVED_78('N', "Reserved For Future Use"),

    /**
     * Reserved For Future Use
     */
    RESERVED_79('O', "Reserved For Future Use"),

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
    RESERVED_84('T', "Reserved For Future Use"),

    /**
     * Trade That Is Trade Through Exempt The Trade Should Be Treated Like A Regular Sale
     */
    TRADE_THROUGH_EXEMPT('X', "Trade That Is Trade Through Exempt The Trade Should Be Treated Like A Regular Sale"),

    /**
     * Trade From A Paired Prime Transaction
     */
    PAIRED_PRIME('a', "Trade From A Paired Prime Transaction"),

    /**
     * Reserved For Future Use
     */
    RESERVED_98('b', "Reserved For Future Use"),

    /**
     * Trade From Prime Customer To Customer Cross Or Prime Qcc Transaction
     */
    PRIME_CUSTOMER_TO_CUSTOMER_CROSS_OR_PRIME_QCC('c', "Trade From Prime Customer To Customer Cross Or Prime Qcc Transaction"),

    /**
     * Reserved For Future Use
     */
    RESERVED_100('d', "Reserved For Future Use"),

    /**
     * Reserved For Future Use
     */
    RESERVED_101('e', "Reserved For Future Use"),

    /**
     * Trade From A Complex Transaction That Is Not Complex Stocktied And Does Not Involve Legging
     */
    COMPLEX_TRANSACTION_THAT_IS_NOT_COMPLEX_STOCKTIED_AND_DOES_NOT_INVOLVE_LEGGING('f', "Trade From A Complex Transaction That Is Not Complex Stocktied And Does Not Involve Legging"),

    /**
     * Trade From A Complex Prime Transaction That Is Not Complex Stocktied And Does Not Involve Legging
     */
    COMPLEX_PRIME_TRANSACTION_THAT_IS_NOT_COMPLEX_STOCKTIED_AND_DOES_NOT_INVOLVE_LEGGING('g', "Trade From A Complex Prime Transaction That Is Not Complex Stocktied And Does Not Involve Legging"),

    /**
     * Trade From A Complex Prime Customer To Customer Cross Or Complex Prime Qcc Transaction That Is Not Complex Stocktied
     */
    COMPLEX_PRIME_CUSTOMER_TO_CUSTOMER_CROSS_OR_COMPLEX_PRIME_QCC_TRANSACTION_THAT_IS_NOT_COMPLEX_STOCKTIED('h', "Trade From A Complex Prime Customer To Customer Cross Or Complex Prime Qcc Transaction That Is Not Complex Stocktied"),

    /**
     * Reserved For Future Use
     */
    RESERVED_105('i', "Reserved For Future Use"),

    /**
     * Trade From A Complex Legging Transaction That Is Not Complex Stocktied
     */
    COMPLEX_LEGGING_TRANSACTION_THAT_IS_NOT_COMPLEX_STOCKTIED('j', "Trade From A Complex Legging Transaction That Is Not Complex Stocktied"),

    /**
     * Trade From A Complex Prime Stocktied Transaction That Does Not Involve Legging
     */
    COMPLEX_PRIME_STOCKTIED_TRANSACTION_THAT_DOES_NOT_INVOLVE_LEGGING('k', "Trade From A Complex Prime Stocktied Transaction That Does Not Involve Legging"),

    /**
     * Trade From A Complex Prime Legging Transaction That Is Not Complex Stocktied
     */
    COMPLEX_PRIME_LEGGING_TRANSACTION_THAT_IS_NOT_COMPLEX_STOCKTIED('l', "Trade From A Complex Prime Legging Transaction That Is Not Complex Stocktied"),

    /**
     * Reserved For Future Use
     */
    RESERVED_109('m', "Reserved For Future Use"),

    /**
     * Trade From A Complex Stocktied Transaction That Does Not Involve Legging
     */
    COMPLEX_STOCKTIED_TRANSACTION_THAT_DOES_NOT_INVOLVE_LEGGING('n', "Trade From A Complex Stocktied Transaction That Does Not Involve Legging"),

    /**
     * Trade From Complex Customer To Customer Cross Stocktied Or Complex Qcc Stocktied Transaction
     */
    COMPLEX_CUSTOMER_TO_CUSTOMER_CROSS_STOCKTIED_OR_COMPLEX_QCC_STOCKTIED_TRANSACTION('o', "Trade From Complex Customer To Customer Cross Stocktied Or Complex Qcc Stocktied Transaction"),

    /**
     * Reserved For Future Use
     */
    RESERVED_112('p', "Reserved For Future Use"),

    /**
     * Reserved For Future Use
     */
    RESERVED_113('q', "Reserved For Future Use"),

    /**
     * Reserved For Future Use
     */
    RESERVED_114('r', "Reserved For Future Use"),

    /**
     * Reserved For Future Use
     */
    RESERVED_115('s', "Reserved For Future Use"),

    /**
     * Reserved For Future Use
     */
    RESERVED_116('t', "Reserved For Future Use");

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
            case 'I' -> Optional.of(RESERVED_73);
            case 'J' -> Optional.of(REOPENING_OF_AN_OPTION);
            case 'K' -> Optional.of(RESERVED_75);
            case 'L' -> Optional.of(A_BUY_AND_A_SELL_IN_THE_SAME_CLASS);
            case 'M' -> Optional.of(A_BUY_AND_A_SELL_IN_A_PUT_AND_A_CALL);
            case 'N' -> Optional.of(RESERVED_78);
            case 'O' -> Optional.of(RESERVED_79);
            case 'P' -> Optional.of(BUY_OR_SELL_OF_A_CALL_OR_PUT);
            case 'Q' -> Optional.of(BUY_OF_A_CALL_AND_A_SELL_OF_A_PUT_FOR_THE_SAME_UNDERLYING_STOCK_OR_INDEX);
            case 'R' -> Optional.of(EXECUTION_OF_AN_ORDER_WHICH_WAS_STOPPED_AT_A_PRICE_THAT_DID_NOT_CONSTITUTE_A_TRADE_THROUGH_ON_ANOTHER_MARKET_AT_THE_TIME_OF_THE_STOP);
            case 'S' -> Optional.of(EXECUTION_OF_AN_ISO_ORDER);
            case 'T' -> Optional.of(RESERVED_84);
            case 'X' -> Optional.of(TRADE_THROUGH_EXEMPT);
            case 'a' -> Optional.of(PAIRED_PRIME);
            case 'b' -> Optional.of(RESERVED_98);
            case 'c' -> Optional.of(PRIME_CUSTOMER_TO_CUSTOMER_CROSS_OR_PRIME_QCC);
            case 'd' -> Optional.of(RESERVED_100);
            case 'e' -> Optional.of(RESERVED_101);
            case 'f' -> Optional.of(COMPLEX_TRANSACTION_THAT_IS_NOT_COMPLEX_STOCKTIED_AND_DOES_NOT_INVOLVE_LEGGING);
            case 'g' -> Optional.of(COMPLEX_PRIME_TRANSACTION_THAT_IS_NOT_COMPLEX_STOCKTIED_AND_DOES_NOT_INVOLVE_LEGGING);
            case 'h' -> Optional.of(COMPLEX_PRIME_CUSTOMER_TO_CUSTOMER_CROSS_OR_COMPLEX_PRIME_QCC_TRANSACTION_THAT_IS_NOT_COMPLEX_STOCKTIED);
            case 'i' -> Optional.of(RESERVED_105);
            case 'j' -> Optional.of(COMPLEX_LEGGING_TRANSACTION_THAT_IS_NOT_COMPLEX_STOCKTIED);
            case 'k' -> Optional.of(COMPLEX_PRIME_STOCKTIED_TRANSACTION_THAT_DOES_NOT_INVOLVE_LEGGING);
            case 'l' -> Optional.of(COMPLEX_PRIME_LEGGING_TRANSACTION_THAT_IS_NOT_COMPLEX_STOCKTIED);
            case 'm' -> Optional.of(RESERVED_109);
            case 'n' -> Optional.of(COMPLEX_STOCKTIED_TRANSACTION_THAT_DOES_NOT_INVOLVE_LEGGING);
            case 'o' -> Optional.of(COMPLEX_CUSTOMER_TO_CUSTOMER_CROSS_STOCKTIED_OR_COMPLEX_QCC_STOCKTIED_TRANSACTION);
            case 'p' -> Optional.of(RESERVED_112);
            case 'q' -> Optional.of(RESERVED_113);
            case 'r' -> Optional.of(RESERVED_114);
            case 's' -> Optional.of(RESERVED_115);
            case 't' -> Optional.of(RESERVED_116);
            default -> Optional.empty();
        };
    }
}
