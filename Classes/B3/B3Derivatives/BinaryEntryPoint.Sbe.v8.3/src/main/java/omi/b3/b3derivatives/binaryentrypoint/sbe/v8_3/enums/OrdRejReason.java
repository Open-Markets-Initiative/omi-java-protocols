package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.enums;

import java.util.Optional;

/**
 * ordRejReason
 *
 * <p>Backed by long. Values correspond to the wire integer encoding.</p>
 */
public enum OrdRejReason {

    /**
     * Unable To Send Fix From Volatility Update Message
     */
    UNABLE_TO_SEND_FIX_FROM_VOLATILITYUPDATE_MESSAGE(0x38CL, "Unable To Send Fix From Volatility Update Message"),

    /**
     * Orders May Not Be Entered While The Market Is Closedpaused
     */
    ORDERS_MAY_NOT_BE_ENTERED_WHILE_THE_MARKET_IS_CLOSEDPAUSED(0x3EBL, "Orders May Not Be Entered While The Market Is Closedpaused"),

    /**
     * Fix Field Missing Or Incorrect
     */
    FIX_FIELD_MISSING_OR_INCORRECT(0x3EFL, "Fix Field Missing Or Incorrect"),

    /**
     * Required Field Missing
     */
    REQUIRED_FIELD_MISSING(0x3F2L, "Required Field Missing"),

    /**
     * Fix Field Incorrect
     */
    FIX_FIELD_INCORRECT_001011(0x3F3L, "Fix Field Incorrect"),

    /**
     * Price Must Be Greater Than Zero
     */
    PRICE_MUST_BE_GREATER_THAN_ZERO(0x3F4L, "Price Must Be Greater Than Zero"),

    /**
     * Invalid Order Qualifier
     */
    INVALID_ORDER_QUALIFIER(0x3F5L, "Invalid Order Qualifier"),

    /**
     * User Not Authorized To Trade
     */
    USER_NOT_AUTHORIZED_TO_TRADE(0x3F6L, "User Not Authorized To Trade"),

    /**
     * Required Field Missing Stop Orders Cannot Be Iocfak
     */
    REQUIRED_FIELD_MISSING_STOP_ORDERS_CANNOT_BE_IOCFAK(0x3F8L, "Required Field Missing Stop Orders Cannot Be Iocfak"),

    /**
     * Required Field Missing Display Quantity Orders Cannot Be Iocfok
     */
    REQUIRED_FIELD_MISSING_DISPLAY_QUANTITY_ORDERS_CANNOT_BE_IOCFOK(0x3F9L, "Required Field Missing Display Quantity Orders Cannot Be Iocfok"),

    /**
     * Required Field Missing Stop Orders Cannot Be Iocfok
     */
    REQUIRED_FIELD_MISSING_STOP_ORDERS_CANNOT_BE_IOCFOK(0x3FAL, "Required Field Missing Stop Orders Cannot Be Iocfok"),

    /**
     * Market Price Orders Not Supported By Opposite Limit
     */
    MARKET_PRICE_ORDERS_NOT_SUPPORTED_BY_OPPOSITE_LIMIT(0x7DDL, "Market Price Orders Not Supported By Opposite Limit"),

    /**
     * Order Gtd Expire Date Is Before The Current Or Next If Not Currently In A Session Trading Session End Date
     */
    ORDER_GTD_EXPIRE_DATE_IS_BEFORE_THE_CURRENT_OR_NEXT_IF_NOT_CURRENTLY_IN_A_SESSION_TRADING_SESSION_END_DATE(0x7E3L, "Order Gtd Expire Date Is Before The Current Or Next If Not Currently In A Session Trading Session End Date"),

    /**
     * Cannot Modify Order Because Order Does Not Exist
     */
    CANNOT_MODIFY_ORDER_BECAUSE_ORDER_DOES_NOT_EXIST(0x7FDL, "Cannot Modify Order Because Order Does Not Exist"),

    /**
     * Disclosed Quantity Cannot Be Greater Than Total Or Remaining Quantity
     */
    DISCLOSED_QUANTITY_CANNOT_BE_GREATER_THAN_TOTAL_OR_REMAINING_QUANTITY(0x7FEL, "Disclosed Quantity Cannot Be Greater Than Total Or Remaining Quantity"),

    /**
     * Order Contract Is Unknown
     */
    ORDER_CONTRACT_IS_UNKNOWN_002047(0x7FFL, "Order Contract Is Unknown"),

    /**
     * The Order Was Submitted With A Different Sender Comp Id Than The Requesting Cancel
     */
    THE_ORDER_WAS_SUBMITTED_WITH_A_DIFFERENT_SENDERCOMPID_THAN_THE_REQUESTING_CANCEL(0x800L, "The Order Was Submitted With A Different Sender Comp Id Than The Requesting Cancel"),

    /**
     * The Order Was Submitted With A Different Cl Order Id Than The Correlation Cl Order Id Of The Requesting Cancel
     */
    THE_ORDER_WAS_SUBMITTED_WITH_A_DIFFERENT_CLORDERID_THAN_THE_CORRELATIONCLORDERID_OF_THE_REQUESTING_CANCEL(0x801L, "The Order Was Submitted With A Different Cl Order Id Than The Correlation Cl Order Id Of The Requesting Cancel"),

    /**
     * The Order Was Submitted With A Different Cl Order Id Than The Original Cl Order Id Of The Requesting Cancel
     */
    THE_ORDER_WAS_SUBMITTED_WITH_A_DIFFERENT_CLORDERID_THAN_THE_ORIGINALCLORDERID_OF_THE_REQUESTING_CANCEL(0x802L, "The Order Was Submitted With A Different Cl Order Id Than The Original Cl Order Id Of The Requesting Cancel"),

    /**
     * The Order Was Submitted With A Different Side Than The Requesting Cancel
     */
    THE_ORDER_WAS_SUBMITTED_WITH_A_DIFFERENT_SIDE_THAN_THE_REQUESTING_CANCEL(0x803L, "The Order Was Submitted With A Different Side Than The Requesting Cancel"),

    /**
     * The Order Was Submitted With A Different Group Tag 55 Than The Requesting Cancel
     */
    THE_ORDER_WAS_SUBMITTED_WITH_A_DIFFERENT_GROUP_TAG_55_THAN_THE_REQUESTING_CANCEL(0x804L, "The Order Was Submitted With A Different Group Tag 55 Than The Requesting Cancel"),

    /**
     * The Order Was Submitted With A Different Security Type Than The Requesting Cancel
     */
    THE_ORDER_WAS_SUBMITTED_WITH_A_DIFFERENT_SECURITY_TYPE_THAN_THE_REQUESTING_CANCEL(0x805L, "The Order Was Submitted With A Different Security Type Than The Requesting Cancel"),

    /**
     * The Order Was Submitted With A Different Account Than The Requesting Cancel
     */
    THE_ORDER_WAS_SUBMITTED_WITH_A_DIFFERENT_ACCOUNT_THAN_THE_REQUESTING_CANCEL(0x806L, "The Order Was Submitted With A Different Account Than The Requesting Cancel"),

    /**
     * The Order Was Submitted With A Different Quantity Than The Requesting Cancel
     */
    THE_ORDER_WAS_SUBMITTED_WITH_A_DIFFERENT_QUANTITY_THAN_THE_REQUESTING_CANCEL(0x807L, "The Order Was Submitted With A Different Quantity Than The Requesting Cancel"),

    /**
     * The Order Was Submitted With A Different Trader Id Than The Requesting Cancel
     */
    THE_ORDER_WAS_SUBMITTED_WITH_A_DIFFERENT_TRADERID_THAN_THE_REQUESTING_CANCEL(0x808L, "The Order Was Submitted With A Different Trader Id Than The Requesting Cancel"),

    /**
     * Attempt To Cancel An Order With A Different Firm Id Than The Original Order
     */
    ATTEMPT_TO_CANCEL_AN_ORDER_WITH_A_DIFFERENT_FIRMID_THAN_THE_ORIGINAL_ORDER(0x809L, "Attempt To Cancel An Order With A Different Firm Id Than The Original Order"),

    /**
     * Attempt To Cancel An Order With A Different Sender Location Id Than The Original Order
     */
    ATTEMPT_TO_CANCEL_AN_ORDER_WITH_A_DIFFERENT_SENDERLOCATIONID_THAN_THE_ORIGINAL_ORDER(0x80AL, "Attempt To Cancel An Order With A Different Sender Location Id Than The Original Order"),

    /**
     * Stop Price Maxi Mini Must Be Smaller Than Or Equal To Trigger Price
     */
    STOP_PRICE_MAXIMINI_MUST_BE_SMALLER_THAN_OR_EQUAL_TO_TRIGGER_PRICE(0x80BL, "Stop Price Maxi Mini Must Be Smaller Than Or Equal To Trigger Price"),

    /**
     * Sell Order Stop Price Must Be Below Last Trade Price
     */
    SELL_ORDER_STOP_PRICE_MUST_BE_BELOW_LAST_TRADE_PRICE(0x80CL, "Sell Order Stop Price Must Be Below Last Trade Price"),

    /**
     * Buy Order Stop Price Must Be Above Last Trade Price
     */
    BUY_ORDER_STOP_PRICE_MUST_BE_ABOVE_LAST_TRADE_PRICE(0x80DL, "Buy Order Stop Price Must Be Above Last Trade Price"),

    /**
     * The Modify Was Submitted On A Different Product Than The Original Order
     */
    THE_MODIFY_WAS_SUBMITTED_ON_A_DIFFERENT_PRODUCT_THAN_THE_ORIGINAL_ORDER(0x834L, "The Modify Was Submitted On A Different Product Than The Original Order"),

    /**
     * Attempt To Modify An Order With A Different In Flight Fill Mitigation Status Than First Modification
     */
    ATTEMPT_TO_MODIFY_AN_ORDER_WITH_A_DIFFERENT_INFLIGHTFILL_MITIGATION_STATUS_THAN_FIRST_MODIFICATION(0x835L, "Attempt To Modify An Order With A Different In Flight Fill Mitigation Status Than First Modification"),

    /**
     * Attempt To Modify An Order With A Different Sender Comp Id Than The Original Order
     */
    ATTEMPT_TO_MODIFY_AN_ORDER_WITH_A_DIFFERENT_SENDERCOMPID_THAN_THE_ORIGINAL_ORDER(0x836L, "Attempt To Modify An Order With A Different Sender Comp Id Than The Original Order"),

    /**
     * Attempt To Modify An Order With A Different Trader Id Than The Original Order
     */
    ATTEMPT_TO_MODIFY_AN_ORDER_WITH_A_DIFFERENT_TRADERID_THAN_THE_ORIGINAL_ORDER(0x837L, "Attempt To Modify An Order With A Different Trader Id Than The Original Order"),

    /**
     * Attempt To Modify An Order With A Different Account Id Than The Original Order
     */
    ATTEMPT_TO_MODIFY_AN_ORDER_WITH_A_DIFFERENT_ACCOUNTID_THAN_THE_ORIGINAL_ORDER(0x838L, "Attempt To Modify An Order With A Different Account Id Than The Original Order"),

    /**
     * Attempt To Modify An Order With A Different Firm Id Than The Original Order
     */
    ATTEMPT_TO_MODIFY_AN_ORDER_WITH_A_DIFFERENT_FIRMID_THAN_THE_ORIGINAL_ORDER(0x839L, "Attempt To Modify An Order With A Different Firm Id Than The Original Order"),

    /**
     * Attempt To Modify An Order With A Different Sender Location Id Than The Original Order
     */
    ATTEMPT_TO_MODIFY_AN_ORDER_WITH_A_DIFFERENT_SENDERLOCATIONID_THAN_THE_ORIGINAL_ORDER(0x83AL, "Attempt To Modify An Order With A Different Sender Location Id Than The Original Order"),

    /**
     * Disclosed Quantity Is Not Allowed
     */
    DISCLOSED_QUANTITY_IS_NOT_ALLOWED(0x83BL, "Disclosed Quantity Is Not Allowed"),

    /**
     * Account Or Give Up Firm Required For Dma Customers
     */
    ACCOUNT_OR_GIVE_UP_FIRM_REQUIRED_FOR_DMA_CUSTOMERS(0x83CL, "Account Or Give Up Firm Required For Dma Customers"),

    /**
     * Disclosed Qty Cannot Be Less Than Disclosed Qty Min
     */
    DISCLOSED_QTY_CANNOT_BE_LESS_THAN_DISCLOSED_QTY_MIN(0x83DL, "Disclosed Qty Cannot Be Less Than Disclosed Qty Min"),

    /**
     * Acct Type 38 Not Valid For Tag 581 For Dma Customers
     */
    ACCT_TYPE_38_NOT_VALID_FOR_TAG_581_FOR_DMA_CUSTOMERS(0x83EL, "Acct Type 38 Not Valid For Tag 581 For Dma Customers"),

    /**
     * Give Up Not Valid For Fx Spot Contract
     */
    GIVE_UP_NOT_VALID_FOR_FX_SPOT_CONTRACT(0x83FL, "Give Up Not Valid For Fx Spot Contract"),

    /**
     * Visibility Permission Not Granted For Executing Trader Entering Trader
     */
    VISIBILITY_PERMISSION_NOT_GRANTED_FOR_EXECUTING_TRADERENTERING_TRADER(0x840L, "Visibility Permission Not Granted For Executing Trader Entering Trader"),

    /**
     * Executing Trader Doesnt Have Access To Product Group
     */
    EXECUTING_TRADER_DOESNT_HAVE_ACCESS_TO_PRODUCT_GROUP(0x841L, "Executing Trader Doesnt Have Access To Product Group"),

    /**
     * Attempt To Modify Market Order To Some Other Type
     */
    ATTEMPT_TO_MODIFY_MARKET_ORDER_TO_SOME_OTHER_TYPE(0x842L, "Attempt To Modify Market Order To Some Other Type"),

    /**
     * Order Quantity Is Outside Of The Allowable Range
     */
    ORDER_QUANTITY_IS_OUTSIDE_OF_THE_ALLOWABLE_RANGE(0x843L, "Order Quantity Is Outside Of The Allowable Range"),

    /**
     * Account Is Mandatory For Fx Spot
     */
    ACCOUNT_IS_MANDATORY_FOR_FX_SPOT(0x844L, "Account Is Mandatory For Fx Spot"),

    /**
     * Order On Behalf By Dma Customer Is Not Allowed
     */
    ORDER_ON_BEHALF_BY_DMA_CUSTOMER_IS_NOT_ALLOWED(0x845L, "Order On Behalf By Dma Customer Is Not Allowed"),

    /**
     * Attempt To Modify An Order With A Different Account Type Than The Original Order
     */
    ATTEMPT_TO_MODIFY_AN_ORDER_WITH_A_DIFFERENT_ACCOUNTTYPE_THAN_THE_ORIGINAL_ORDER(0x846L, "Attempt To Modify An Order With A Different Account Type Than The Original Order"),

    /**
     * Account Or Give Up Firm Required For Equities
     */
    ACCOUNT_OR_GIVE_UP_FIRM_REQUIRED_FOR_EQUITIES(0x84BL, "Account Or Give Up Firm Required For Equities"),

    /**
     * Order Type Not Permitted While The Market Is In Pre Open
     */
    ORDER_TYPE_NOT_PERMITTED_WHILE_THE_MARKET_IS_IN_PRE_OPEN(0x852L, "Order Type Not Permitted While The Market Is In Pre Open"),

    /**
     * Order Price Is Outside Limits
     */
    ORDER_PRICE_IS_OUTSIDE_LIMITS(0x859L, "Order Price Is Outside Limits"),

    /**
     * Qty Is Not Multiple Of Round Lot
     */
    QTY_IS_NOT_MULTIPLE_OF_ROUND_LOT(0x85AL, "Qty Is Not Multiple Of Round Lot"),

    /**
     * Qty Is Greater Or Equal Than Maximum Trade Volume
     */
    QTY_IS_GREATER_OR_EQUAL_THAN_MAXIMUM_TRADE_VOLUME(0x85BL, "Qty Is Greater Or Equal Than Maximum Trade Volume"),

    /**
     * Order Price Is Outside Bands
     */
    ORDER_PRICE_IS_OUTSIDE_BANDS(0x883L, "Order Price Is Outside Bands"),

    /**
     * Order Price Is Outside Auction Bands
     */
    ORDER_PRICE_IS_OUTSIDE_AUCTION_BANDS(0x884L, "Order Price Is Outside Auction Bands"),

    /**
     * Trade Outside Of Short Term Volatility Bands
     */
    TRADE_OUTSIDE_OF_SHORT_TERM_VOLATILITY_BANDS(0x885L, "Trade Outside Of Short Term Volatility Bands"),

    /**
     * All Legs Must Have Same Lot Types
     */
    ALL_LEGS_MUST_HAVE_SAME_LOT_TYPES(0x886L, "All Legs Must Have Same Lot Types"),

    /**
     * All Legs Must Have Same Tick Increment
     */
    ALL_LEGS_MUST_HAVE_SAME_TICK_INCREMENT(0x887L, "All Legs Must Have Same Tick Increment"),

    /**
     * All Legs Must Have Same Step Of Quotation
     */
    ALL_LEGS_MUST_HAVE_SAME_STEP_OF_QUOTATION(0x888L, "All Legs Must Have Same Step Of Quotation"),

    /**
     * Trade Price Is Outside Of Static Limits
     */
    TRADE_PRICE_IS_OUTSIDE_OF_STATIC_LIMITS(0x889L, "Trade Price Is Outside Of Static Limits"),

    /**
     * Cod Not Supported For Gtc Gtd Orders
     */
    COD_NOT_SUPPORTED_FOR_GTC_GTD_ORDERS(0x88AL, "Cod Not Supported For Gtc Gtd Orders"),

    /**
     * Order Not Bookable At This Time
     */
    ORDER_NOT_BOOKABLE_AT_THIS_TIME(0x88BL, "Order Not Bookable At This Time"),

    /**
     * Minimum Quantity Was Not Filled
     */
    MINIMUM_QUANTITY_WAS_NOT_FILLED(0x88CL, "Minimum Quantity Was Not Filled"),

    /**
     * Order Attributes Not Allowed To Trip An Auction
     */
    ORDER_ATTRIBUTES_NOT_ALLOWED_TO_TRIP_AN_AUCTION(0x88DL, "Order Attributes Not Allowed To Trip An Auction"),

    /**
     * Order Type Not Permitted For Group
     */
    ORDER_TYPE_NOT_PERMITTED_FOR_GROUP(0x907L, "Order Type Not Permitted For Group"),

    /**
     * Instrument Has An Request For Cross In Progress
     */
    INSTRUMENT_HAS_AN_REQUEST_FOR_CROSS_IN_PROGRESS(0x9C4L, "Instrument Has An Request For Cross In Progress"),

    /**
     * Order Quantity Too Low
     */
    ORDER_QUANTITY_TOO_LOW(0x9C5L, "Order Quantity Too Low"),

    /**
     * Cross Type Ineligible For Instrument
     */
    CROSSTYPE_INELIGIBLE_FOR_INSTRUMENT(0x9C6L, "Cross Type Ineligible For Instrument"),

    /**
     * Rfq For Cross Is Not Allowed Since Contract Is Not Rfq For Cross Eligible
     */
    RFQ_FOR_CROSS_IS_NOT_ALLOWED_SINCE_CONTRACT_IS_NOT_RFQ_FOR_CROSS_ELIGIBLE(0x9C7L, "Rfq For Cross Is Not Allowed Since Contract Is Not Rfq For Cross Eligible"),

    /**
     * Dma Cross Order Not Allowed
     */
    DMA_CROSSORDER_NOT_ALLOWED(0x9C8L, "Dma Cross Order Not Allowed"),

    /**
     * Cross Order Rejected Due To Auction Trigger Validation
     */
    CROSS_ORDER_REJECTED_DUE_TO_AUCTION_TRIGGER_VALIDATION(0x9C9L, "Cross Order Rejected Due To Auction Trigger Validation"),

    /**
     * Trade On Behalf Rejected
     */
    TRADE_ON_BEHALF_REJECTED(0x9CAL, "Trade On Behalf Rejected"),

    /**
     * Market Maker Protection In Effect For User Xxxxxxxx And Group Xxxxxx
     */
    MARKET_MAKER_PROTECTION_IN_EFFECT_FOR_USER_XXXXXXXX_AND_GROUP_XXXXXX(0xA28L, "Market Maker Protection In Effect For User Xxxxxxxx And Group Xxxxxx"),

    /**
     * Rfq Rejected Instrumentexchange Not Tradable
     */
    RFQ_REJECTED_INSTRUMENTEXCHANGE_NOT_TRADABLE(0xBB8L, "Rfq Rejected Instrumentexchange Not Tradable"),

    /**
     * Rfq Rejected Instrumentexchange Not Known
     */
    RFQ_REJECTED_INSTRUMENTEXCHANGE_NOT_KNOWN(0xBB9L, "Rfq Rejected Instrumentexchange Not Known"),

    /**
     * Error Creating Contract
     */
    ERROR_CREATING_CONTRACT(0xBBAL, "Error Creating Contract"),

    /**
     * Business Reject Other
     */
    BUSINESS_REJECT_OTHER(0xBC2L, "Business Reject Other"),

    /**
     * Business Reject Unknown Id
     */
    BUSINESS_REJECT_UNKNOWN_ID(0xBC3L, "Business Reject Unknown Id"),

    /**
     * Business Reject Unknown Security
     */
    BUSINESS_REJECT_UNKNOWN_SECURITY(0xBC4L, "Business Reject Unknown Security"),

    /**
     * Business Reject Unsupported Message Type
     */
    BUSINESS_REJECT_UNSUPPORTED_MESSAGE_TYPE(0xBC5L, "Business Reject Unsupported Message Type"),

    /**
     * Business Reject Application Not Available
     */
    BUSINESS_REJECT_APPLICATION_NOT_AVAILABLE(0xBC6L, "Business Reject Application Not Available"),

    /**
     * Business Reject Required Field Missing
     */
    BUSINESS_REJECT_REQUIRED_FIELD_MISSING(0xBC7L, "Business Reject Required Field Missing"),

    /**
     * Contract Claims To Be A Spread But Is Missing One Or More Legs
     */
    CONTRACT_CLAIMS_TO_BE_A_SPREAD_BUT_IS_MISSING_ONE_OR_MORE_LEGS(0xBC8L, "Contract Claims To Be A Spread But Is Missing One Or More Legs"),

    /**
     * Fix Field Length Exceeds Max Length
     */
    FIX_FIELD_LENGTH_EXCEEDS_MAX_LENGTH(0xBC9L, "Fix Field Length Exceeds Max Length"),

    /**
     * Special Auction Permissions Order Entry Not Allowed
     */
    SPECIAL_AUCTION_PERMISSIONS_ORDER_ENTRY_NOT_ALLOWED(0xBCCL, "Special Auction Permissions Order Entry Not Allowed"),

    /**
     * Engine Did Not Respond To Fas Request
     */
    ENGINE_DID_NOT_RESPOND_TO_FAS_REQUEST(0xFA0L, "Engine Did Not Respond To Fas Request"),

    /**
     * Termo Message Rejected Unknown Instrument
     */
    TERMO_MESSAGE_REJECTED_UNKNOWN_INSTRUMENT(0x1771L, "Termo Message Rejected Unknown Instrument"),

    /**
     * Termo Message Rejected Exchange Security Closed
     */
    TERMO_MESSAGE_REJECTED_EXCHANGE_SECURITY_CLOSED(0x1772L, "Termo Message Rejected Exchange Security Closed"),

    /**
     * Termo Rejected Instrumentexchange Not Tradable
     */
    TERMO_REJECTED_INSTRUMENTEXCHANGE_NOT_TRADABLE(0x1773L, "Termo Rejected Instrumentexchange Not Tradable"),

    /**
     * Termo Message Rejected Limits Exceeded
     */
    TERMO_MESSAGE_REJECTED_LIMITS_EXCEEDED(0x1774L, "Termo Message Rejected Limits Exceeded"),

    /**
     * Termo Message Rejected Too Late To Enter
     */
    TERMO_MESSAGE_REJECTED_TOO_LATE_TO_ENTER(0x1775L, "Termo Message Rejected Too Late To Enter"),

    /**
     * Termo Message Rejected Unknown Termo Quote
     */
    TERMO_MESSAGE_REJECTED_UNKNOWN_TERMO_QUOTE(0x1776L, "Termo Message Rejected Unknown Termo Quote"),

    /**
     * Termo Message Rejected Duplicate Termo Quote
     */
    TERMO_MESSAGE_REJECTED_DUPLICATE_TERMO_QUOTE(0x1777L, "Termo Message Rejected Duplicate Termo Quote"),

    /**
     * Termo Message Rejected Invalid Bidask Spread
     */
    TERMO_MESSAGE_REJECTED_INVALID_BIDASK_SPREAD(0x1778L, "Termo Message Rejected Invalid Bidask Spread"),

    /**
     * Termo Message Rejected Invalid Price
     */
    TERMO_MESSAGE_REJECTED_INVALID_PRICE(0x1779L, "Termo Message Rejected Invalid Price"),

    /**
     * Termo Message Rejected Not Authorized To Termo Quote This Instrument
     */
    TERMO_MESSAGE_REJECTED_NOT_AUTHORIZED_TO_TERMO_QUOTE_THIS_INSTRUMENT(0x177AL, "Termo Message Rejected Not Authorized To Termo Quote This Instrument"),

    /**
     * Termo Message Rejected Pass
     */
    TERMO_MESSAGE_REJECTED_PASS(0x177BL, "Termo Message Rejected Pass"),

    /**
     * Fix Field Incorrect
     */
    FIX_FIELD_INCORRECT_006012(0x177CL, "Fix Field Incorrect"),

    /**
     * Not A Valid Termo Instrument
     */
    NOT_A_VALID_TERMO_INSTRUMENT(0x177DL, "Not A Valid Termo Instrument"),

    /**
     * Values Dont Match With The Original Request
     */
    VALUES_DONT_MATCH_WITH_THE_ORIGINAL_REQUEST(0x177EL, "Values Dont Match With The Original Request"),

    /**
     * Current Termo Request Status Does Not Allow Rejection
     */
    CURRENT_TERMO_REQUEST_STATUS_DOES_NOT_ALLOW_REJECTION(0x177FL, "Current Termo Request Status Does Not Allow Rejection"),

    /**
     * Current Termo Request Status Does Not Allow Acceptance
     */
    CURRENT_TERMO_REQUEST_STATUS_DOES_NOT_ALLOW_ACCEPTANCE(0x1780L, "Current Termo Request Status Does Not Allow Acceptance"),

    /**
     * Wrong Type Of Order Book For Termo
     */
    WRONG_TYPE_OF_ORDER_BOOK_FOR_TERMO(0x1781L, "Wrong Type Of Order Book For Termo"),

    /**
     * Wrong Type Of Request For Termo
     */
    WRONG_TYPE_OF_REQUEST_FOR_TERMO(0x1782L, "Wrong Type Of Request For Termo"),

    /**
     * Days To Settlement Must Be Between 16 And 999
     */
    DAYS_TO_SETTLEMENT_MUST_BE_BETWEEN_16_AND_999(0x1783L, "Days To Settlement Must Be Between 16 And 999"),

    /**
     * Days To Settlement Must Be Between 16 And 90
     */
    DAYS_TO_SETTLEMENT_MUST_BE_BETWEEN_16_AND_90(0x1784L, "Days To Settlement Must Be Between 16 And 90"),

    /**
     * Instrument Not Allowed To This Market
     */
    INSTRUMENT_NOT_ALLOWED_TO_THIS_MARKET_006021(0x1785L, "Instrument Not Allowed To This Market"),

    /**
     * Instrument Not Allowed To This Market
     */
    INSTRUMENT_NOT_ALLOWED_TO_THIS_MARKET_006022(0x1786L, "Instrument Not Allowed To This Market"),

    /**
     * Termo Price Should Be Greater Than Zero
     */
    TERMO_PRICE_SHOULD_BE_GREATER_THAN_ZERO(0x1787L, "Termo Price Should Be Greater Than Zero"),

    /**
     * Termo Messages Should Not Be Entered When Market Is Paused
     */
    TERMO_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_PAUSED(0x1788L, "Termo Messages Should Not Be Entered When Market Is Paused"),

    /**
     * Termo Messages Should Not Be Entered When Market Is Pre Open
     */
    TERMO_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_PRE_OPEN_006025(0x1789L, "Termo Messages Should Not Be Entered When Market Is Pre Open"),

    /**
     * Termo Messages Should Not Be Entered When Market Is Pcp
     */
    TERMO_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_PCP(0x178AL, "Termo Messages Should Not Be Entered When Market Is Pcp"),

    /**
     * Termo Messages Should Not Be Entered When Market Is No Cancel
     */
    TERMO_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_NO_CANCEL(0x178BL, "Termo Messages Should Not Be Entered When Market Is No Cancel"),

    /**
     * Termo Messages Should Not Be Entered When Market Is Reserved
     */
    TERMO_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_RESERVED(0x178CL, "Termo Messages Should Not Be Entered When Market Is Reserved"),

    /**
     * Termo Messages Should Not Be Entered When Market Is Forbidden
     */
    TERMO_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_FORBIDDEN(0x178DL, "Termo Messages Should Not Be Entered When Market Is Forbidden"),

    /**
     * Termo Messages Should Not Be Entered When Market Is Pre Close
     */
    TERMO_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_PRE_CLOSE(0x178EL, "Termo Messages Should Not Be Entered When Market Is Pre Close"),

    /**
     * Termo Messages Should Not Be Entered When Market Is Pre Open
     */
    TERMO_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_PRE_OPEN_006031(0x178FL, "Termo Messages Should Not Be Entered When Market Is Pre Open"),

    /**
     * Not A Valid Termo Underlying Instrument
     */
    NOT_A_VALID_TERMO_UNDERLYING_INSTRUMENT(0x1790L, "Not A Valid Termo Underlying Instrument"),

    /**
     * Received A Null Admin Operation
     */
    RECEIVED_A_NULL_ADMINOPERATION(0x1791L, "Received A Null Admin Operation"),

    /**
     * First Trade Of Day For Underlying Termo Instrument
     */
    FIRST_TRADE_OF_DAY_FOR_UNDERLYING_TERMO_INSTRUMENT(0x1792L, "First Trade Of Day For Underlying Termo Instrument"),

    /**
     * Termo Messages Should Not Be Entered When Market Is In Final Closing Call
     */
    TERMO_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_IN_FINAL_CLOSING_CALL(0x1793L, "Termo Messages Should Not Be Entered When Market Is In Final Closing Call"),

    /**
     * Invalid Cash Trade In Tvr
     */
    INVALID_CASH_TRADE_IN_TVR_006036(0x1794L, "Invalid Cash Trade In Tvr"),

    /**
     * Only Buy Entry Request For Tvr Is Accepted
     */
    ONLY_BUY_ENTRY_REQUEST_FOR_TVR_IS_ACCEPTED(0x1795L, "Only Buy Entry Request For Tvr Is Accepted"),

    /**
     * There Is No Bid And Ask For Underlying Contract
     */
    THERE_IS_NO_BID_AND_ASK_FOR_UNDERLYING_CONTRACT(0x1796L, "There Is No Bid And Ask For Underlying Contract"),

    /**
     * Invalid Price
     */
    INVALID_PRICE_006039(0x1797L, "Invalid Price"),

    /**
     * Invalid Cash Trade In Tvr
     */
    INVALID_CASH_TRADE_IN_TVR_006040(0x1798L, "Invalid Cash Trade In Tvr"),

    /**
     * Invalid Cash Trade In Tvr
     */
    INVALID_CASH_TRADE_IN_TVR_006041(0x1799L, "Invalid Cash Trade In Tvr"),

    /**
     * Invalid Cash Trade In Tvr
     */
    INVALID_CASH_TRADE_IN_TVR_006042(0x179AL, "Invalid Cash Trade In Tvr"),

    /**
     * Invalid Cash Trade In Tvr
     */
    INVALID_CASH_TRADE_IN_TVR_006043(0x179BL, "Invalid Cash Trade In Tvr"),

    /**
     * Invalid Cash Trade In Tvr
     */
    INVALID_CASH_TRADE_IN_TVR_006044(0x179CL, "Invalid Cash Trade In Tvr"),

    /**
     * Order Rejected
     */
    ORDER_REJECTED(0x1B58L, "Order Rejected"),

    /**
     * Fok Order Unmatchable In Market
     */
    FOK_ORDER_UNMATCHABLE_IN_MARKET(0x1B59L, "Fok Order Unmatchable In Market"),

    /**
     * Orders May Not Be Entered While The Market Is Closed
     */
    ORDERS_MAY_NOT_BE_ENTERED_WHILE_THE_MARKET_IS_CLOSED(0x1B5AL, "Orders May Not Be Entered While The Market Is Closed"),

    /**
     * Order Contract Is Unknown
     */
    ORDER_CONTRACT_IS_UNKNOWN_007005(0x1B5DL, "Order Contract Is Unknown"),

    /**
     * No Partial Match Found For This Fak Order
     */
    NO_PARTIAL_MATCH_FOUND_FOR_THIS_FAK_ORDER(0x1B5EL, "No Partial Match Found For This Fak Order"),

    /**
     * Maximum Quantity Depth For Any One Price Group Max May Not Exceed Integer Max Value
     */
    MAXIMUM_QUANTITY_DEPTH_FOR_ANY_ONE_PRICE_GROUP_MAX_MAY_NOT_EXCEED_INTEGERMAX_VALUE(0x1B60L, "Maximum Quantity Depth For Any One Price Group Max May Not Exceed Integer Max Value"),

    /**
     * Contract For This Order Contract Is Past Expiration Date And May No Longer Be Traded
     */
    CONTRACT_FOR_THIS_ORDER_CONTRACT_IS_PAST_EXPIRATION_DATE_AND_MAY_NO_LONGER_BE_TRADED(0x1B61L, "Contract For This Order Contract Is Past Expiration Date And May No Longer Be Traded"),

    /**
     * Invalid Spread Price
     */
    INVALID_SPREAD_PRICE(0x1B62L, "Invalid Spread Price"),

    /**
     * Maximum Number Of Working Orders For This Contract Has Been Exceeded
     */
    MAXIMUM_NUMBER_OF_WORKING_ORDERS_FOR_THIS_CONTRACT_HAS_BEEN_EXCEEDED(0x1B63L, "Maximum Number Of Working Orders For This Contract Has Been Exceeded"),

    /**
     * Order Would Overwrite Existing Order On Book
     */
    ORDER_WOULD_OVERWRITE_EXISTING_ORDER_ON_BOOK(0x1B64L, "Order Would Overwrite Existing Order On Book"),

    /**
     * Order Group Does Not Match Group Of Contract
     */
    ORDER_GROUP_DOES_NOT_MATCH_GROUP_OF_CONTRACT(0x1B65L, "Order Group Does Not Match Group Of Contract"),

    /**
     * Order Security Type Does Not Match Security Type Of Contract
     */
    ORDER_SECURITY_TYPE_DOES_NOT_MATCH_SECURITY_TYPE_OF_CONTRACT(0x1B66L, "Order Security Type Does Not Match Security Type Of Contract"),

    /**
     * Order Modify Has Different Side Than Existing Order
     */
    ORDER_MODIFY_HAS_DIFFERENT_SIDE_THAN_EXISTING_ORDER(0x1B67L, "Order Modify Has Different Side Than Existing Order"),

    /**
     * Contract Is Not Eligible For Electronic Matching
     */
    CONTRACT_IS_NOT_ELIGIBLE_FOR_ELECTRONIC_MATCHING(0x1B69L, "Contract Is Not Eligible For Electronic Matching"),

    /**
     * Order Contract Is Not Gtc Or Gtd Eligible
     */
    ORDER_CONTRACT_IS_NOT_GTC_OR_GTD_ELIGIBLE(0x1B6AL, "Order Contract Is Not Gtc Or Gtd Eligible"),

    /**
     * No Trading Calendar Found On Or After Order Gtd Expire Date
     */
    NO_TRADING_CALENDAR_FOUND_ON_OR_AFTER_ORDER_GTD_EXPIRE_DATE(0x1B6CL, "No Trading Calendar Found On Or After Order Gtd Expire Date"),

    /**
     * Tag Expire Date 432 Beyond Instrument Expiration
     */
    TAG_EXPIREDATE_432_BEYOND_INSTRUMENT_EXPIRATION(0x1B6DL, "Tag Expire Date 432 Beyond Instrument Expiration"),

    /**
     * Tag Expire Date 432 Beyond Uds Combo Earliest Leg Expiration
     */
    TAG_EXPIREDATE_432_BEYOND_UDS_COMBO_EARLIEST_LEG_EXPIRATION(0x1B6EL, "Tag Expire Date 432 Beyond Uds Combo Earliest Leg Expiration"),

    /**
     * Order Cannot Be Modified Or Cancelled While The Market Is In No Cancel
     */
    ORDER_CANNOT_BE_MODIFIED_OR_CANCELLED_WHILE_THE_MARKET_IS_IN_NO_CANCEL(0x1B70L, "Order Cannot Be Modified Or Cancelled While The Market Is In No Cancel"),

    /**
     * Order Type Not Permitted While The Market Is Reserved
     */
    ORDER_TYPE_NOT_PERMITTED_WHILE_THE_MARKET_IS_RESERVED(0x1B73L, "Order Type Not Permitted While The Market Is Reserved"),

    /**
     * Order Session Date Is In The Past
     */
    ORDER_SESSION_DATE_IS_IN_THE_PAST(0x1B74L, "Order Session Date Is In The Past"),

    /**
     * Orders May Not Be Entered While The Market Is Forbidden
     */
    ORDERS_MAY_NOT_BE_ENTERED_WHILE_THE_MARKET_IS_FORBIDDEN(0x1B75L, "Orders May Not Be Entered While The Market Is Forbidden"),

    /**
     * Quote Rejected Exchange Security Is Forbidden
     */
    QUOTE_REJECTED_EXCHANGE_SECURITY_IS_FORBIDDEN_007030(0x1B76L, "Quote Rejected Exchange Security Is Forbidden"),

    /**
     * Orders May Not Be Entered While The Market Is Preclosed
     */
    ORDERS_MAY_NOT_BE_ENTERED_WHILE_THE_MARKET_IS_PRECLOSED(0x1B77L, "Orders May Not Be Entered While The Market Is Preclosed"),

    /**
     * Quote Rejected Exchange Security Is Preclosed
     */
    QUOTE_REJECTED_EXCHANGE_SECURITY_IS_PRECLOSED(0x1B78L, "Quote Rejected Exchange Security Is Preclosed"),

    /**
     * Orders May Not Be Entered While The Market Is Open
     */
    ORDERS_MAY_NOT_BE_ENTERED_WHILE_THE_MARKET_IS_OPEN(0x1B79L, "Orders May Not Be Entered While The Market Is Open"),

    /**
     * Quote Rejected Exchange Security Is Forbidden
     */
    QUOTE_REJECTED_EXCHANGE_SECURITY_IS_FORBIDDEN_007034(0x1B7AL, "Quote Rejected Exchange Security Is Forbidden"),

    /**
     * Rfq Rejected Instrument Exchange Is Open
     */
    RFQ_REJECTED_INSTRUMENT_EXCHANGE_IS_OPEN(0x1B7BL, "Rfq Rejected Instrument Exchange Is Open"),

    /**
     * Time In Force 59 Not Valid For Order Type 40
     */
    TIME_IN_FORCE_59_NOT_VALID_FOR_ORDER_TYPE_40(0x1B7CL, "Time In Force 59 Not Valid For Order Type 40"),

    /**
     * Good For Auction Order Not Allowed
     */
    GOOD_FOR_AUCTION_ORDER_NOT_ALLOWED(0x1B7DL, "Good For Auction Order Not Allowed"),

    /**
     * On Close Order Not Allowed
     */
    ON_CLOSE_ORDER_NOT_ALLOWED(0x1B7EL, "On Close Order Not Allowed"),

    /**
     * Duplicate Client Order Id For This Session Contract
     */
    DUPLICATE_CLIENT_ORDER_ID_FOR_THIS_SESSIONCONTRACT(0x1B7FL, "Duplicate Client Order Id For This Session Contract"),

    /**
     * Good For Auction Order Cancel Not Allowed
     */
    GOOD_FOR_AUCTION_ORDER_CANCEL_NOT_ALLOWED(0x1B80L, "Good For Auction Order Cancel Not Allowed"),

    /**
     * On Close Order Cancel Not Allowed
     */
    ON_CLOSE_ORDER_CANCEL_NOT_ALLOWED(0x1B81L, "On Close Order Cancel Not Allowed"),

    /**
     * Good For Auction Order Modify Not Allowed
     */
    GOOD_FOR_AUCTION_ORDER_MODIFY_NOT_ALLOWED(0x1B82L, "Good For Auction Order Modify Not Allowed"),

    /**
     * On Close Order Modify Not Allowed
     */
    ON_CLOSE_ORDER_MODIFY_NOT_ALLOWED(0x1B83L, "On Close Order Modify Not Allowed"),

    /**
     * Modify Of Order Participating In Top Not Allowed
     */
    MODIFY_OF_ORDER_PARTICIPATING_IN_TOP_NOT_ALLOWED(0x1B84L, "Modify Of Order Participating In Top Not Allowed"),

    /**
     * Cancel Of Order Participating In Top Not Allowed
     */
    CANCEL_OF_ORDER_PARTICIPATING_IN_TOP_NOT_ALLOWED(0x1B85L, "Cancel Of Order Participating In Top Not Allowed"),

    /**
     * Order Type Duration Combination Invalid For Auction
     */
    ORDER_TYPE_DURATION_COMBINATION_INVALID_FOR_AUCTION(0x1B86L, "Order Type Duration Combination Invalid For Auction"),

    /**
     * Order Type Duration Combination Invalid
     */
    ORDER_TYPE_DURATION_COMBINATION_INVALID(0x1B87L, "Order Type Duration Combination Invalid"),

    /**
     * Quantity Attribute Not Allowed On Order During Auction
     */
    QUANTITY_ATTRIBUTE_NOT_ALLOWED_ON_ORDER_DURING_AUCTION(0x1B88L, "Quantity Attribute Not Allowed On Order During Auction"),

    /**
     * Order Entry Was Unsuccessful Error Message Is Not Possible To Send Orders With Validity Type Market On Auction With Minimum Quantity
     */
    ORDER_ENTRY_WAS_UNSUCCESSFUL_ERROR_MESSAGE_IS_NOT_POSSIBLE_TO_SEND_ORDERS_WITH_VALIDITY_TYPE_MARKET_ON_AUCTION_WITH_MINIMUM_QUANTITY(0x1B89L, "Order Entry Was Unsuccessful Error Message Is Not Possible To Send Orders With Validity Type Market On Auction With Minimum Quantity"),

    /**
     * Max Floor 111 Not Valid For Time In Force 59
     */
    MAX_FLOOR_111_NOT_VALID_FOR_TIME_IN_FORCE_59(0x1B8AL, "Max Floor 111 Not Valid For Time In Force 59"),

    /**
     * Spread Orders May Not Be Entered While The Underlying Leg Market Is In Non Trading State
     */
    SPREAD_ORDERS_MAY_NOT_BE_ENTERED_WHILE_THE_UNDERLYING_LEG_MARKET_IS_IN_NON_TRADING_STATE(0x1B8FL, "Spread Orders May Not Be Entered While The Underlying Leg Market Is In Non Trading State"),

    /**
     * Orders May Not Be Entered While The Market Is In Final Closing Call
     */
    ORDERS_MAY_NOT_BE_ENTERED_WHILE_THE_MARKET_IS_IN_FINAL_CLOSING_CALL(0x1B90L, "Orders May Not Be Entered While The Market Is In Final Closing Call"),

    /**
     * Quote Rejected Unknown Instrument
     */
    QUOTE_REJECTED_UNKNOWN_INSTRUMENT(0x1BBDL, "Quote Rejected Unknown Instrument"),

    /**
     * Quote Rejected Exchange Security Closed
     */
    QUOTE_REJECTED_EXCHANGE_SECURITY_CLOSED(0x1BBEL, "Quote Rejected Exchange Security Closed"),

    /**
     * Quote Rejected Quote Exceeds Limit
     */
    QUOTE_REJECTED_QUOTE_EXCEEDS_LIMIT(0x1BBFL, "Quote Rejected Quote Exceeds Limit"),

    /**
     * Quote Rejected Too Late To Enter
     */
    QUOTE_REJECTED_TOO_LATE_TO_ENTER(0x1BC0L, "Quote Rejected Too Late To Enter"),

    /**
     * Quote Rejected Unknown Quote
     */
    QUOTE_REJECTED_UNKNOWN_QUOTE(0x1BC1L, "Quote Rejected Unknown Quote"),

    /**
     * Quote Rejected Duplicate Quote In Same Message
     */
    QUOTE_REJECTED_DUPLICATE_QUOTE_IN_SAME_MESSAGE(0x1BC2L, "Quote Rejected Duplicate Quote In Same Message"),

    /**
     * Quote Rejected Invalid Bidask Spread
     */
    QUOTE_REJECTED_INVALID_BIDASK_SPREAD(0x1BC3L, "Quote Rejected Invalid Bidask Spread"),

    /**
     * Quote Rejected Invalid Price
     */
    QUOTE_REJECTED_INVALID_PRICE(0x1BC4L, "Quote Rejected Invalid Price"),

    /**
     * Quote Rejected Not Authorized To Quote This Instrument
     */
    QUOTE_REJECTED_NOT_AUTHORIZED_TO_QUOTE_THIS_INSTRUMENT(0x1BC5L, "Quote Rejected Not Authorized To Quote This Instrument"),

    /**
     * Quote Rejected Resting Cancelled Too Many Rejects
     */
    QUOTE_REJECTED_RESTING_CANCELLED_TOO_MANY_REJECTS(0x1BC6L, "Quote Rejected Resting Cancelled Too Many Rejects"),

    /**
     * Quote Rejected Duplicate Quote Different Id
     */
    QUOTE_REJECTED_DUPLICATE_QUOTE_DIFFERENT_ID(0x1BC7L, "Quote Rejected Duplicate Quote Different Id"),

    /**
     * Quote Rejected Resting Cancelled Quote Exceeds Limit
     */
    QUOTE_REJECTED_RESTING_CANCELLED_QUOTE_EXCEEDS_LIMIT(0x1BC8L, "Quote Rejected Resting Cancelled Quote Exceeds Limit"),

    /**
     * Quote Rejected Resting Cancelled Duplicate Quote
     */
    QUOTE_REJECTED_RESTING_CANCELLED_DUPLICATE_QUOTE(0x1BC9L, "Quote Rejected Resting Cancelled Duplicate Quote"),

    /**
     * Quote Rejected Resting Cancelled Invalid Bidask Spread
     */
    QUOTE_REJECTED_RESTING_CANCELLED_INVALID_BIDASK_SPREAD(0x1BCAL, "Quote Rejected Resting Cancelled Invalid Bidask Spread"),

    /**
     * Quote Rejected Resting Cancelled Invalid Price
     */
    QUOTE_REJECTED_RESTING_CANCELLED_INVALID_PRICE(0x1BCBL, "Quote Rejected Resting Cancelled Invalid Price"),

    /**
     * Quote Rejected Resting Cancelled Not Authorized To Quote This Instrument
     */
    QUOTE_REJECTED_RESTING_CANCELLED_NOT_AUTHORIZED_TO_QUOTE_THIS_INSTRUMENT(0x1BCCL, "Quote Rejected Resting Cancelled Not Authorized To Quote This Instrument"),

    /**
     * Quote Rejected Unspecified Reason
     */
    QUOTE_REJECTED_UNSPECIFIED_REASON(0x1BCDL, "Quote Rejected Unspecified Reason"),

    /**
     * Quote Rejected Exchange Security Is In Pre Open
     */
    QUOTE_REJECTED_EXCHANGE_SECURITY_IS_IN_PRE_OPEN(0x1BCEL, "Quote Rejected Exchange Security Is In Pre Open"),

    /**
     * Quote Rejected Exchange Security Is In No Cancel
     */
    QUOTE_REJECTED_EXCHANGE_SECURITY_IS_IN_NO_CANCEL(0x1BCFL, "Quote Rejected Exchange Security Is In No Cancel"),

    /**
     * Quote Rejected Exchange Security Is Reserved
     */
    QUOTE_REJECTED_EXCHANGE_SECURITY_IS_RESERVED(0x1BD0L, "Quote Rejected Exchange Security Is Reserved"),

    /**
     * Contract Not Eligible For Negotiated Quote
     */
    CONTRACT_NOT_ELIGIBLE_FOR_NEGOTIATED_QUOTE(0x1BD1L, "Contract Not Eligible For Negotiated Quote"),

    /**
     * Rlp Order Rejected Participant Not Authorized
     */
    RLP_ORDER_REJECTED_PARTICIPANT_NOT_AUTHORIZED(0x1BD2L, "Rlp Order Rejected Participant Not Authorized"),

    /**
     * Attempt To Modify The Order Type Fromto Rlp
     */
    ATTEMPT_TO_MODIFY_THE_ORDER_TYPE_FROMTO_RLP(0x1BD3L, "Attempt To Modify The Order Type Fromto Rlp"),

    /**
     * Invalid Field For Order With Order Type Tag 40 Equals W Rlp
     */
    INVALID_FIELD_FOR_ORDER_WITH_ORDER_TYPE_TAG_40_EQUALS_W_RLP(0x1BD4L, "Invalid Field For Order With Order Type Tag 40 Equals W Rlp"),

    /**
     * Rlp Order Rejected Only One Order Is Allowed By Firm And Side
     */
    RLP_ORDER_REJECTED_ONLY_ONE_ORDER_IS_ALLOWED_BY_FIRM_AND_SIDE(0x1BD5L, "Rlp Order Rejected Only One Order Is Allowed By Firm And Side"),

    /**
     * Invalid Field For Order With Routing Instruction Tag 35487 Equals 1 Retail Liquidity Taker
     */
    INVALID_FIELD_FOR_ORDER_WITH_ROUTING_INSTRUCTION_TAG_35487_EQUALS_1_RETAIL_LIQUIDITY_TAKER(0x1BD6L, "Invalid Field For Order With Routing Instruction Tag 35487 Equals 1 Retail Liquidity Taker"),

    /**
     * Invalid Field For Order With Order Type Tag 40 Equals P Pegged
     */
    INVALID_FIELD_FOR_ORDER_WITH_ORDER_TYPE_TAG_40_EQUALS_P_PEGGED(0x1BD7L, "Invalid Field For Order With Order Type Tag 40 Equals P Pegged"),

    /**
     * Qty Is Not Multiple Of Minimum Execution Quantity For Pegged Order
     */
    QTY_IS_NOT_MULTIPLE_OF_MINIMUM_EXECUTION_QUANTITY_FOR_PEGGED_ORDER(0x1BD8L, "Qty Is Not Multiple Of Minimum Execution Quantity For Pegged Order"),

    /**
     * Account Is Mandatory For Pegged Order
     */
    ACCOUNT_IS_MANDATORY_FOR_PEGGED_ORDER(0x1BD9L, "Account Is Mandatory For Pegged Order"),

    /**
     * Pegged Order Can Not Be Sent In Non Regular Session
     */
    PEGGED_ORDER_CAN_NOT_BE_SENT_IN_NON_REGULAR_SESSION(0x1BDAL, "Pegged Order Can Not Be Sent In Non Regular Session"),

    /**
     * Attempt To Modify The Order Type Fromto Pegged
     */
    ATTEMPT_TO_MODIFY_THE_ORDER_TYPE_FROMTO_PEGGED(0x1BDBL, "Attempt To Modify The Order Type Fromto Pegged"),

    /**
     * Order Rejected Pegged Orders Are Not Allowed For This Contract
     */
    ORDER_REJECTED_PEGGED_ORDERS_ARE_NOT_ALLOWED_FOR_THIS_CONTRACT(0x1BDCL, "Order Rejected Pegged Orders Are Not Allowed For This Contract"),

    /**
     * Order Rejected Routing Instruction Tag 35487 Equals Broker Only 3 Not Allowed For This Group
     */
    ORDER_REJECTED_ROUTING_INSTRUCTION_TAG_35487_EQUALS_BROKER_ONLY_3_NOT_ALLOWED_FOR_THIS_GROUP(0x1BDDL, "Order Rejected Routing Instruction Tag 35487 Equals Broker Only 3 Not Allowed For This Group"),

    /**
     * Order Rejected Only Pegged Order With Routing Instruction Tag 35487 Equals Broker Only 3 Is Allowed For This Group
     */
    ORDER_REJECTED_ONLY_PEGGED_ORDER_WITH_ROUTING_INSTRUCTION_TAG_35487_EQUALS_BROKER_ONLY_3_IS_ALLOWED_FOR_THIS_GROUP(0x1BDEL, "Order Rejected Only Pegged Order With Routing Instruction Tag 35487 Equals Broker Only 3 Is Allowed For This Group"),

    /**
     * Cross Order Suspended For The Participant Or Session
     */
    CROSS_ORDER_SUSPENDED_FOR_THE_PARTICIPANT_OR_SESSION(0x1BDFL, "Cross Order Suspended For The Participant Or Session"),

    /**
     * Order Quantity Is Outside Of The Allowable Range Order Quantity Order Qty Contract Minimum Quantity For Cross Min Cross Qty
     */
    ORDER_QUANTITY_IS_OUTSIDE_OF_THE_ALLOWABLE_RANGE_ORDER_QUANTITY_ORDERQTY_CONTRACT_MINIMUM_QUANTITY_FOR_CROSS_MINCROSSQTY(0x1BE0L, "Order Quantity Is Outside Of The Allowable Range Order Quantity Order Qty Contract Minimum Quantity For Cross Min Cross Qty"),

    /**
     * Bbt Messages Should Not Be Entered When Market Is Paused
     */
    BBT_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_PAUSED(0x1BE1L, "Bbt Messages Should Not Be Entered When Market Is Paused"),

    /**
     * Bbt Messages Should Not Be Entered When Market Is Pre Open
     */
    BBT_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_PRE_OPEN(0x1BE2L, "Bbt Messages Should Not Be Entered When Market Is Pre Open"),

    /**
     * Bbt Messages Should Not Be Entered When Market Is Pcp
     */
    BBT_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_PCP(0x1BE3L, "Bbt Messages Should Not Be Entered When Market Is Pcp"),

    /**
     * Bbt Messages Should Not Be Entered When Market Is No Cancel
     */
    BBT_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_NO_CANCEL(0x1BE4L, "Bbt Messages Should Not Be Entered When Market Is No Cancel"),

    /**
     * Bbt Messages Should Not Be Entered When Market Is Reserved
     */
    BBT_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_RESERVED(0x1BE5L, "Bbt Messages Should Not Be Entered When Market Is Reserved"),

    /**
     * Bbt Messages Should Not Be Entered When Market Is Forbidden
     */
    BBT_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_FORBIDDEN(0x1BE6L, "Bbt Messages Should Not Be Entered When Market Is Forbidden"),

    /**
     * Bbt Messages Should Not Be Entered When Market Is Pre Close
     */
    BBT_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_PRE_CLOSE(0x1BE7L, "Bbt Messages Should Not Be Entered When Market Is Pre Close"),

    /**
     * Invalid Field For Bbt Order
     */
    INVALID_FIELD_FOR_BBT_ORDER(0x1BE8L, "Invalid Field For Bbt Order"),

    /**
     * For Cancel On Behalf Must Be Informed Only The Action Target Session Id Or The Action Target Group Id
     */
    FOR_CANCEL_ON_BEHALF_MUST_BE_INFORMED_ONLY_THE_ACTIONTARGETSESSIONID_OR_THE_ACTIONTARGETGROUPID(0x1BE9L, "For Cancel On Behalf Must Be Informed Only The Action Target Session Id Or The Action Target Group Id"),

    /**
     * Action Target Group Id Invalid It Doesnt Exist Or It Is Disabled
     */
    ACTIONTARGETGROUPID_INVALID_IT_DOESNT_EXIST_OR_IT_IS_DISABLED(0x1BEAL, "Action Target Group Id Invalid It Doesnt Exist Or It Is Disabled"),

    /**
     * Fix Session Is Blocked Due To Mass Cancel
     */
    FIX_SESSION_IS_BLOCKED_DUE_TO_MASS_CANCEL(0x1BEBL, "Fix Session Is Blocked Due To Mass Cancel"),

    /**
     * Action Target Group Id Must Be Informed
     */
    ACTIONTARGETGROUPID_MUST_BE_INFORMED(0x1BECL, "Action Target Group Id Must Be Informed"),

    /**
     * Fix Session Doesnt Belong To The Action Target Group Id
     */
    FIX_SESSION_DOESNT_BELONG_TO_THE_ACTIONTARGETGROUPID(0x1BEDL, "Fix Session Doesnt Belong To The Action Target Group Id"),

    /**
     * Technical Error Function Not Performed
     */
    TECHNICAL_ERROR_FUNCTION_NOT_PERFORMED(0x270FL, "Technical Error Function Not Performed"),

    /**
     * Exercise Price Not Allowed
     */
    EXERCISE_PRICE_NOT_ALLOWED(0x1F46L, "Exercise Price Not Allowed"),

    /**
     * No Positions Blocked
     */
    NO_POSITIONS_BLOCKED(0x1F47L, "No Positions Blocked"),

    /**
     * Quantity Doesnt Match With The Original Request Quantity On Original Request Quantity On Original Request
     */
    QUANTITY_DOESNT_MATCH_WITH_THE_ORIGINAL_REQUEST_QUANTITY_ON_ORIGINAL_REQUEST_QUANTITY_ON_ORIGINAL_REQUEST(0x1F48L, "Quantity Doesnt Match With The Original Request Quantity On Original Request Quantity On Original Request"),

    /**
     * Exercise Must Be On Maturity Date
     */
    EXERCISE_MUST_BE_ON_MATURITY_DATE(0x1F4BL, "Exercise Must Be On Maturity Date"),

    /**
     * Function Not Available This Time
     */
    FUNCTION_NOT_AVAILABLE_THIS_TIME(0x1F4EL, "Function Not Available This Time"),

    /**
     * Blocking Quantity More Than 999999999
     */
    BLOCKING_QUANTITY_MORE_THAN_999999999(0x1F4FL, "Blocking Quantity More Than 999999999"),

    /**
     * Trade Does Not Belong To The Specified Firm Firm Id Xxx
     */
    TRADE_DOES_NOT_BELONG_TO_THE_SPECIFIED_FIRM_FIRM_ID_XXX(0x1F54L, "Trade Does Not Belong To The Specified Firm Firm Id Xxx"),

    /**
     * Blocking Qty More Than Available Quantity
     */
    BLOCKING_QTY_MORE_THAN_AVAILABLE_QUANTITY(0x1F55L, "Blocking Qty More Than Available Quantity"),

    /**
     * There Arent Positions Available To Exercise
     */
    THERE_ARENT_POSITIONS_AVAILABLE_TO_EXERCISE(0x1F56L, "There Arent Positions Available To Exercise"),

    /**
     * Total Qty Must Be The Sum Of All Alloc Qty
     */
    TOTAL_QTY_MUST_BE_THE_SUM_OF_ALL_ALLOCQTY(0x1F57L, "Total Qty Must Be The Sum Of All Alloc Qty"),

    /**
     * Trade Already Cancelled Or Does Not Exist Trade Id Xxx
     */
    TRADE_ALREADY_CANCELLED_OR_DOES_NOT_EXIST_TRADE_ID_XXX(0x1F58L, "Trade Already Cancelled Or Does Not Exist Trade Id Xxx"),

    /**
     * Available Quantity To Block Is Zero
     */
    AVAILABLE_QUANTITY_TO_BLOCK_IS_ZERO(0x1F5BL, "Available Quantity To Block Is Zero"),

    /**
     * Invalid Operation For Contract Type
     */
    INVALID_OPERATION_FOR_CONTRACT_TYPE(0x1F5CL, "Invalid Operation For Contract Type"),

    /**
     * Function Closed Or Suspended
     */
    FUNCTION_CLOSED_OR_SUSPENDED(0x1F64L, "Function Closed Or Suspended"),

    /**
     * Exercise Price Outside Required Moneyness
     */
    EXERCISE_PRICE_OUTSIDE_REQUIRED_MONEYNESS(0x1F67L, "Exercise Price Outside Required Moneyness"),

    /**
     * Invalid Exercise Request Id To Cancel
     */
    INVALID_EXERCISE_REQUEST_ID_TO_CANCEL(0x1F68L, "Invalid Exercise Request Id To Cancel"),

    /**
     * Invalid Blocking Id To Unblock
     */
    INVALID_BLOCKING_ID_TO_UNBLOCK(0x1F7BL, "Invalid Blocking Id To Unblock"),

    /**
     * Invalid Quantity To Unblock
     */
    INVALID_QUANTITY_TO_UNBLOCK(0x1F7EL, "Invalid Quantity To Unblock"),

    /**
     * On Behalf Operation Not Allowed During Ccr Recovery
     */
    ON_BEHALF_OPERATION_NOT_ALLOWED_DURING_CCR_RECOVERY(0x1F7FL, "On Behalf Operation Not Allowed During Ccr Recovery"),

    /**
     * Problem Parsing Incoming Message
     */
    PROBLEM_PARSING_INCOMING_MESSAGE(0x1F81L, "Problem Parsing Incoming Message"),

    /**
     * Exercise Quantity Should Be Greater Than Zero
     */
    EXERCISE_QUANTITY_SHOULD_BE_GREATER_THAN_ZERO(0x1F82L, "Exercise Quantity Should Be Greater Than Zero"),

    /**
     * System Initialization
     */
    SYSTEM_INITIALIZATION(0x7532L, "System Initialization"),

    /**
     * Line Busy
     */
    LINE_BUSY(0x7533L, "Line Busy"),

    /**
     * Message Or Atributes Are Invalid
     */
    MESSAGE_OR_ATRIBUTES_ARE_INVALID(0x7534L, "Message Or Atributes Are Invalid"),

    /**
     * Internal Error
     */
    INTERNAL_ERROR(0x7535L, "Internal Error"),

    /**
     * Timeout Waiting Risk Evaluation
     */
    TIMEOUT_WAITING_RISK_EVALUATION(0x7536L, "Timeout Waiting Risk Evaluation"),

    /**
     * Timeout Waiting Risk Evaluation Low Priority
     */
    TIMEOUT_WAITING_RISK_EVALUATION_LOW_PRIORITY(0x7537L, "Timeout Waiting Risk Evaluation Low Priority"),

    /**
     * Broker Negotiation Blocked
     */
    BROKER_NEGOTIATION_BLOCKED_030011(0x753BL, "Broker Negotiation Blocked"),

    /**
     * Broker Not Available
     */
    BROKER_NOT_AVAILABLE_030012(0x753CL, "Broker Not Available"),

    /**
     * Brokers Capture Account Not Found
     */
    BROKERS_CAPTURE_ACCOUNT_NOT_FOUND_030013(0x753DL, "Brokers Capture Account Not Found"),

    /**
     * Brokers Segment Negotiation Blocked
     */
    BROKERS_SEGMENT_NEGOTIATION_BLOCKED_030014(0x753EL, "Brokers Segment Negotiation Blocked"),

    /**
     * Broker Segment Not Available
     */
    BROKER_SEGMENT_NOT_AVAILABLE_030015(0x753FL, "Broker Segment Not Available"),

    /**
     * Brokers Segment Protected Mode Under Activation
     */
    BROKERS_SEGMENT_PROTECTED_MODE_UNDER_ACTIVATION_030016(0x7540L, "Brokers Segment Protected Mode Under Activation"),

    /**
     * Broker Pn Negotiation Blocked
     */
    BROKER_PN_NEGOTIATION_BLOCKED(0x7541L, "Broker Pn Negotiation Blocked"),

    /**
     * Broker Pn Not Available
     */
    BROKER_PN_NOT_AVAILABLE(0x7542L, "Broker Pn Not Available"),

    /**
     * Broker Pn Protected Mode Under Activation
     */
    BROKER_PN_PROTECTED_MODE_UNDER_ACTIVATION(0x7543L, "Broker Pn Protected Mode Under Activation"),

    /**
     * Account Negotiation Blocked
     */
    ACCOUNT_NEGOTIATION_BLOCKED_030021(0x7545L, "Account Negotiation Blocked"),

    /**
     * Account Not Available
     */
    ACCOUNT_NOT_AVAILABLE_030022(0x7546L, "Account Not Available"),

    /**
     * Accounts Protected Mode Under Activation
     */
    ACCOUNTS_PROTECTED_MODE_UNDER_ACTIVATION_030023(0x7547L, "Accounts Protected Mode Under Activation"),

    /**
     * Account Mandatory On Dma Orders
     */
    ACCOUNT_MANDATORY_ON_DMA_ORDERS_030024(0x7548L, "Account Mandatory On Dma Orders"),

    /**
     * Transient Account Is Hierarchically Blocked On Protected Mode
     */
    TRANSIENT_ACCOUNT_IS_HIERARCHICALLY_BLOCKED_ON_PROTECTED_MODE_030025(0x7549L, "Transient Account Is Hierarchically Blocked On Protected Mode"),

    /**
     * Cross Orders Or Cross Forward Not Allowed While Account In Protected Mode
     */
    CROSSORDERS_OR_CROSSFORWARD_NOT_ALLOWED_WHILE_ACCOUNT_IN_PROTECTED_MODE_030026(0x754AL, "Cross Orders Or Cross Forward Not Allowed While Account In Protected Mode"),

    /**
     * Transient Account Not Allowed In Extended Hours
     */
    TRANSIENT_ACCOUNT_NOT_ALLOWED_IN_EXTENDED_HOURS_030027(0x754BL, "Transient Account Not Allowed In Extended Hours"),

    /**
     * Document Negotiation Blocked
     */
    DOCUMENT_NEGOTIATION_BLOCKED_030031(0x754FL, "Document Negotiation Blocked"),

    /**
     * Document Not Available
     */
    DOCUMENT_NOT_AVAILABLE_030032(0x7550L, "Document Not Available"),

    /**
     * Documents Protected Mode Under Activation
     */
    DOCUMENTS_PROTECTED_MODE_UNDER_ACTIVATION_030033(0x7551L, "Documents Protected Mode Under Activation"),

    /**
     * Executor Document Cannot Use Default Broker Profile
     */
    EXECUTOR_DOCUMENT_CANNOT_USE_DEFAULT_BROKER_PROFILE_030034(0x7552L, "Executor Document Cannot Use Default Broker Profile"),

    /**
     * Document In Blocked Profile
     */
    DOCUMENT_IN_BLOCKED_PROFILE_030035(0x7553L, "Document In Blocked Profile"),

    /**
     * Cross Orders Or Cross Forward Not Allowed While Document In Protected Mode
     */
    CROSSORDERS_OR_CROSSFORWARD_NOT_ALLOWED_WHILE_DOCUMENT_IN_PROTECTED_MODE_030036(0x7554L, "Cross Orders Or Cross Forward Not Allowed While Document In Protected Mode"),

    /**
     * Entering Trader Negotiation Blocked
     */
    ENTERING_TRADER_NEGOTIATION_BLOCKED_030041(0x7559L, "Entering Trader Negotiation Blocked"),

    /**
     * Entering Trader Not Available
     */
    ENTERING_TRADER_NOT_AVAILABLE_030042(0x755AL, "Entering Trader Not Available"),

    /**
     * Entering Trader Blocked By Sfd Overflow
     */
    ENTERING_TRADER_BLOCKED_BY_SFD_OVERFLOW_030043(0x755BL, "Entering Trader Blocked By Sfd Overflow"),

    /**
     * Non Dma Orders Must Provide Account While In Brokers Protected Mode
     */
    NON_DMA_ORDERS_MUST_PROVIDE_ACCOUNT_WHILE_IN_BROKERS_PROTECTED_MODE_030044(0x755CL, "Non Dma Orders Must Provide Account While In Brokers Protected Mode"),

    /**
     * Entering Trader Not Authorized To Trade Accountless Orders
     */
    ENTERING_TRADER_NOT_AUTHORIZED_TO_TRADE_ACCOUNTLESS_ORDERS_030045(0x755DL, "Entering Trader Not Authorized To Trade Accountless Orders"),

    /**
     * Entering Trader Cannot Trade On Behalf Of Other Firms Account
     */
    ENTERING_TRADER_CANNOT_TRADE_ON_BEHALF_OF_OTHER_FIRMS_ACCOUNT_030046(0x755EL, "Entering Trader Cannot Trade On Behalf Of Other Firms Account"),

    /**
     * Symbol Not Available
     */
    SYMBOL_NOT_AVAILABLE_030050(0x7562L, "Symbol Not Available"),

    /**
     * Symbol Internal Data Corrupted
     */
    SYMBOL_INTERNAL_DATA_CORRUPTED_030051(0x7563L, "Symbol Internal Data Corrupted"),

    /**
     * Fix Message Type Does Not Support Operations On Such Symbol
     */
    FIX_MESSAGE_TYPE_DOES_NOT_SUPPORT_OPERATIONS_ON_SUCH_SYMBOL_030052(0x7564L, "Fix Message Type Does Not Support Operations On Such Symbol"),

    /**
     * Symbols Underlying Not Found For Risk Aggregation
     */
    SYMBOLS_UNDERLYING_NOT_FOUND_FOR_RISK_AGGREGATION_030053(0x7565L, "Symbols Underlying Not Found For Risk Aggregation"),

    /**
     * Symbols Risk Unit Matrix Not Available
     */
    SYMBOLS_RISK_UNIT_MATRIX_NOT_AVAILABLE_030054(0x7566L, "Symbols Risk Unit Matrix Not Available"),

    /**
     * Symbols Reference Price Missing Market Orders Not Allowed
     */
    SYMBOLS_REFERENCE_PRICE_MISSING_MARKET_ORDERS_NOT_ALLOWED_030055(0x7567L, "Symbols Reference Price Missing Market Orders Not Allowed"),

    /**
     * Symbols Calculated Price Invalid
     */
    SYMBOLS_CALCULATED_PRICE_INVALID_032056(0x7D38L, "Symbols Calculated Price Invalid"),

    /**
     * Spreads Leg Not Available
     */
    SPREADS_LEG_NOT_AVAILABLE_030060(0x756CL, "Spreads Leg Not Available"),

    /**
     * Spreads Leg Internal Data Corrupted
     */
    SPREADS_LEG_INTERNAL_DATA_CORRUPTED_030061(0x756DL, "Spreads Leg Internal Data Corrupted"),

    /**
     * Unexpected Internal Error During Risk Evaluation
     */
    UNEXPECTED_INTERNAL_ERROR_DURING_RISK_EVALUATION_030070(0x7576L, "Unexpected Internal Error During Risk Evaluation"),

    /**
     * Sfd Broker Pn Pn Document Aggregation Day Trade Cash Balance Stop Loss Not Configured
     */
    SFD_BROKER_PN_PN_DOCUMENT_AGGREGATION_DAY_TRADE_CASH_BALANCE_STOP_LOSS_NOT_CONFIGURED(0x75A1L, "Sfd Broker Pn Pn Document Aggregation Day Trade Cash Balance Stop Loss Not Configured"),

    /**
     * Sdp Broker Pn Pn Document Aggregation Order Exceeded Cash Settlement Exposure
     */
    SDP_BROKER_PN_PN_DOCUMENT_AGGREGATION_ORDER_EXCEEDED_CASH_SETTLEMENT_EXPOSURE(0x75A2L, "Sdp Broker Pn Pn Document Aggregation Order Exceeded Cash Settlement Exposure"),

    /**
     * Rmkt Broker Pn Pn Document Aggregation Order Quantity Exceeded Risk Increase
     */
    RMKT_BROKER_PN_PN_DOCUMENT_AGGREGATION_ORDER_QUANTITY_EXCEEDED_RISK_INCREASE(0x75A3L, "Rmkt Broker Pn Pn Document Aggregation Order Quantity Exceeded Risk Increase"),

    /**
     * Sdp Broker Pn Pn Trader Aggregation Order Exceeded Cash Settlement Exposure
     */
    SDP_BROKER_PN_PN_TRADER_AGGREGATION_ORDER_EXCEEDED_CASH_SETTLEMENT_EXPOSURE(0x75A4L, "Sdp Broker Pn Pn Trader Aggregation Order Exceeded Cash Settlement Exposure"),

    /**
     * Spvd Broker Pn Pn Document Aggregation Order Exceeded Potential Short Uncovered Balance
     */
    SPVD_BROKER_PN_PN_DOCUMENT_AGGREGATION_ORDER_EXCEEDED_POTENTIAL_SHORT_UNCOVERED_BALANCE(0x75A5L, "Spvd Broker Pn Pn Document Aggregation Order Exceeded Potential Short Uncovered Balance"),

    /**
     * Spvd Broker Pn Pn Trader Aggregation Order Exceeded Potential Short Uncovered Balance
     */
    SPVD_BROKER_PN_PN_TRADER_AGGREGATION_ORDER_EXCEEDED_POTENTIAL_SHORT_UNCOVERED_BALANCE(0x75A6L, "Spvd Broker Pn Pn Trader Aggregation Order Exceeded Potential Short Uncovered Balance"),

    /**
     * Rmse Broker Pn Pn Document Aggregation Order Exceeded Risk Increase At Extended Session
     */
    RMSE_BROKER_PN_PN_DOCUMENT_AGGREGATION_ORDER_EXCEEDED_RISK_INCREASE_AT_EXTENDED_SESSION(0x75A7L, "Rmse Broker Pn Pn Document Aggregation Order Exceeded Risk Increase At Extended Session"),

    /**
     * Rmse Broker Order Exceeded Risk Increase At Extended Session
     */
    RMSE_BROKER_ORDER_EXCEEDED_RISK_INCREASE_AT_EXTENDED_SESSION(0x75D6L, "Rmse Broker Order Exceeded Risk Increase At Extended Session"),

    /**
     * Mkta Account Buy Not Allowed For Symbols Market
     */
    MKTA_ACCOUNT_BUY_NOT_ALLOWED_FOR_SYMBOLS_MARKET_030201(0x75F9L, "Mkta Account Buy Not Allowed For Symbols Market"),

    /**
     * Mkta Account Sell Not Allowed For Symbols Market
     */
    MKTA_ACCOUNT_SELL_NOT_ALLOWED_FOR_SYMBOLS_MARKET_030202(0x75FAL, "Mkta Account Sell Not Allowed For Symbols Market"),

    /**
     * Tmoc Account Maximum Order Size Exceeded For Single Order
     */
    TMOC_ACCOUNT_MAXIMUM_ORDER_SIZE_EXCEEDED_FOR_SINGLE_ORDER(0x75FCL, "Tmoc Account Maximum Order Size Exceeded For Single Order"),

    /**
     * Tmov Account Maximum Order Size Exceeded For Single Order
     */
    TMOV_ACCOUNT_MAXIMUM_ORDER_SIZE_EXCEEDED_FOR_SINGLE_ORDER(0x75FDL, "Tmov Account Maximum Order Size Exceeded For Single Order"),

    /**
     * Spci Account Order Quantity Exceeded Short Position Per Instrument
     */
    SPCI_ACCOUNT_ORDER_QUANTITY_EXCEEDED_SHORT_POSITION_PER_INSTRUMENT(0x75FEL, "Spci Account Order Quantity Exceeded Short Position Per Instrument"),

    /**
     * Spvi Account Order Quantity Exceeded Long Position Per Instrument
     */
    SPVI_ACCOUNT_ORDER_QUANTITY_EXCEEDED_LONG_POSITION_PER_INSTRUMENT(0x75FFL, "Spvi Account Order Quantity Exceeded Long Position Per Instrument"),

    /**
     * Sdp Account Order Exceeded Cash Settlement Exposure
     */
    SDP_ACCOUNT_ORDER_EXCEEDED_CASH_SETTLEMENT_EXPOSURE(0x7600L, "Sdp Account Order Exceeded Cash Settlement Exposure"),

    /**
     * Rmkt Account Order Quantity Exceeded Risk Increase
     */
    RMKT_ACCOUNT_ORDER_QUANTITY_EXCEEDED_RISK_INCREASE(0x7602L, "Rmkt Account Order Quantity Exceeded Risk Increase"),

    /**
     * Irmkt Account Order Quantity Exceeded Risk Increase Reducing Mode
     */
    IRMKT_ACCOUNT_ORDER_QUANTITY_EXCEEDED_RISK_INCREASE_REDUCING_MODE(0x7603L, "Irmkt Account Order Quantity Exceeded Risk Increase Reducing Mode"),

    /**
     * Spi Account Order Quantity Exceeded Long And Short Position Reducing Mode
     */
    SPI_ACCOUNT_ORDER_QUANTITY_EXCEEDED_LONG_AND_SHORT_POSITION_REDUCING_MODE(0x7604L, "Spi Account Order Quantity Exceeded Long And Short Position Reducing Mode"),

    /**
     * Std Account Termo Not Allowed Protected Mode Enabled
     */
    STD_ACCOUNT_TERMO_NOT_ALLOWED_PROTECTED_MODE_ENABLED_030213(0x7605L, "Std Account Termo Not Allowed Protected Mode Enabled"),

    /**
     * Spvd Account Order Exceeded Potential Short Uncovered Balance
     */
    SPVD_ACCOUNT_ORDER_EXCEEDED_POTENTIAL_SHORT_UNCOVERED_BALANCE_030215(0x7607L, "Spvd Account Order Exceeded Potential Short Uncovered Balance"),

    /**
     * Mkta Document Buy Sell Symbols Market Not Configured
     */
    MKTA_DOCUMENT_BUYSELL_SYMBOLS_MARKET_NOT_CONFIGURED_030300(0x765CL, "Mkta Document Buy Sell Symbols Market Not Configured"),

    /**
     * Mkta Document Buy Not Allowed For Symbols Market
     */
    MKTA_DOCUMENT_BUY_NOT_ALLOWED_FOR_SYMBOLS_MARKET_030301(0x765DL, "Mkta Document Buy Not Allowed For Symbols Market"),

    /**
     * Mkta Document Sell Not Allowed For Symbols Market
     */
    MKTA_DOCUMENT_SELL_NOT_ALLOWED_FOR_SYMBOLS_MARKET_030302(0x765EL, "Mkta Document Sell Not Allowed For Symbols Market"),

    /**
     * Tmox Document Max
     */
    TMOX_DOCUMENT_MAX(0x765FL, "Tmox Document Max"),

    /**
     * Tmoc Document Max Bid Quantity Exceeded For Single Order
     */
    TMOC_DOCUMENT_MAX_BID_QUANTITY_EXCEEDED_FOR_SINGLE_ORDER(0x7660L, "Tmoc Document Max Bid Quantity Exceeded For Single Order"),

    /**
     * Tmov Document Max Offer Quantity Exceeded For Single Order
     */
    TMOV_DOCUMENT_MAX_OFFER_QUANTITY_EXCEEDED_FOR_SINGLE_ORDER(0x7661L, "Tmov Document Max Offer Quantity Exceeded For Single Order"),

    /**
     * Spci Document Order Quantity Exceeded Max Bid Potential Balance
     */
    SPCI_DOCUMENT_ORDER_QUANTITY_EXCEEDED_MAX_BID_POTENTIAL_BALANCE(0x7662L, "Spci Document Order Quantity Exceeded Max Bid Potential Balance"),

    /**
     * Spvi Document Order Quantity Exceeded Max Offer Potential Balance
     */
    SPVI_DOCUMENT_ORDER_QUANTITY_EXCEEDED_MAX_OFFER_POTENTIAL_BALANCE(0x7663L, "Spvi Document Order Quantity Exceeded Max Offer Potential Balance"),

    /**
     * Sdp Document Order Exceeded Max Financial Potential Balance Due
     */
    SDP_DOCUMENT_ORDER_EXCEEDED_MAX_FINANCIAL_POTENTIAL_BALANCE_DUE(0x7664L, "Sdp Document Order Exceeded Max Financial Potential Balance Due"),

    /**
     * Std Document Order Quantity Exceeded Max Operations Forward Balance
     */
    STD_DOCUMENT_ORDER_QUANTITY_EXCEEDED_MAX_OPERATIONS_FORWARD_BALANCE(0x7665L, "Std Document Order Quantity Exceeded Max Operations Forward Balance"),

    /**
     * Rmkt
     */
    RMKT(0x7666L, "Rmkt"),

    /**
     * Irmkt Document Order Quantity Exceeded Max Incremental Market Risk
     */
    IRMKT_DOCUMENT_ORDER_QUANTITY_EXCEEDED_MAX_INCREMENTAL_MARKET_RISK(0x7667L, "Irmkt Document Order Quantity Exceeded Max Incremental Market Risk"),

    /**
     * Spi Document Order Quantity Exceeded Previous Potencial Balance
     */
    SPI_DOCUMENT_ORDER_QUANTITY_EXCEEDED_PREVIOUS_POTENCIAL_BALANCE(0x7668L, "Spi Document Order Quantity Exceeded Previous Potencial Balance"),

    /**
     * Std Document Termo Not Allowed
     */
    STD_DOCUMENT_TERMO_NOT_ALLOWED(0x7669L, "Std Document Termo Not Allowed"),

    /**
     * Sfd Document Day Trade Cash Balance Stop Loss Not Configured
     */
    SFD_DOCUMENT_DAY_TRADE_CASH_BALANCE_STOP_LOSS_NOT_CONFIGURED_030314(0x766AL, "Sfd Document Day Trade Cash Balance Stop Loss Not Configured"),

    /**
     * Spvd Document Order Exceeded Potential Short Uncovered Balance
     */
    SPVD_DOCUMENT_ORDER_EXCEEDED_POTENTIAL_SHORT_UNCOVERED_BALANCE_030315(0x766BL, "Spvd Document Order Exceeded Potential Short Uncovered Balance"),

    /**
     * Rmse Document Order Exceeded Risk Increase At Extended Session
     */
    RMSE_DOCUMENT_ORDER_EXCEEDED_RISK_INCREASE_AT_EXTENDED_SESSION_030316(0x766CL, "Rmse Document Order Exceeded Risk Increase At Extended Session"),

    /**
     * Rmse Document Order Exceeded Risk Increase Of Broker At Extended Session
     */
    RMSE_DOCUMENT_ORDER_EXCEEDED_RISK_INCREASE_OF_BROKER_AT_EXTENDED_SESSION_030317(0x766DL, "Rmse Document Order Exceeded Risk Increase Of Broker At Extended Session"),

    /**
     * Mkta Entering Trader Buy Sell Symbols Market Not Configured
     */
    MKTA_ENTERING_TRADER_BUYSELL_SYMBOLS_MARKET_NOT_CONFIGURED_030400(0x76C0L, "Mkta Entering Trader Buy Sell Symbols Market Not Configured"),

    /**
     * Mkta Entering Trader Buy Not Allowed For Symbols Market
     */
    MKTA_ENTERING_TRADER_BUY_NOT_ALLOWED_FOR_SYMBOLS_MARKET_030401(0x76C1L, "Mkta Entering Trader Buy Not Allowed For Symbols Market"),

    /**
     * Mkta Entering
     */
    MKTA_ENTERING(0x76C2L, "Mkta Entering"),

    /**
     * Tmox Entering Trader Max Bid Offer Quantity Not Configured
     */
    TMOX_ENTERING_TRADER_MAX_BIDOFFER_QUANTITY_NOT_CONFIGURED(0x76C3L, "Tmox Entering Trader Max Bid Offer Quantity Not Configured"),

    /**
     * Tmoc Entering Trader Max Bid Quantity Exceeded For Single Order
     */
    TMOC_ENTERING_TRADER_MAX_BID_QUANTITY_EXCEEDED_FOR_SINGLE_ORDER(0x76C4L, "Tmoc Entering Trader Max Bid Quantity Exceeded For Single Order"),

    /**
     * Tmov Entering Trader Max Offer Quantity Exceeded For Si
     */
    TMOV_ENTERING_TRADER_MAX_OFFER_QUANTITY_EXCEEDED_FOR_SI(0x76C5L, "Tmov Entering Trader Max Offer Quantity Exceeded For Si"),

    /**
     * Spci Entering Trader Order Quantity Exceeded Max Bid Potential Balance
     */
    SPCI_ENTERING_TRADER_ORDER_QUANTITY_EXCEEDED_MAX_BID_POTENTIAL_BALANCE(0x76C6L, "Spci Entering Trader Order Quantity Exceeded Max Bid Potential Balance"),

    /**
     * Spvi Entering Trader Order Quantity Exceeded Max Offer Potential Balance
     */
    SPVI_ENTERING_TRADER_ORDER_QUANTITY_EXCEEDED_MAX_OFFER_POTENTIAL_BALANCE(0x76C7L, "Spvi Entering Trader Order Quantity Exceeded Max Offer Potential Balance"),

    /**
     * Sdp Entering Trader Order Exceeded Max Financial Potential
     */
    SDP_ENTERING_TRADER_ORDER_EXCEEDED_MAX_FINANCIAL_POTENTIAL(0x76C8L, "Sdp Entering Trader Order Exceeded Max Financial Potential"),

    /**
     * Spvd Trader Order Exceeded Potential Short Uncovered Balance
     */
    SPVD_TRADER_ORDER_EXCEEDED_POTENTIAL_SHORT_UNCOVERED_BALANCE(0x76CFL, "Spvd Trader Order Exceeded Potential Short Uncovered Balance"),

    /**
     * Oms Unexpected Internal Error
     */
    OMS_UNEXPECTED_INTERNAL_ERROR_030500(0x7724L, "Oms Unexpected Internal Error"),

    /**
     * Oms Invalid Session Or Symbol
     */
    OMS_INVALID_SESSION_OR_SYMBOL_030501(0x7725L, "Oms Invalid Session Or Symbol"),

    /**
     * Oms Cl Ord Id Cannot Be Empty
     */
    OMS_CLORDID_CANNOT_BE_EMPTY_030502(0x7726L, "Oms Cl Ord Id Cannot Be Empty"),

    /**
     * Oms Cl Ord Id Is Duplicated
     */
    OMS_CLORDID_IS_DUPLICATED_030503(0x7727L, "Oms Cl Ord Id Is Duplicated"),

    /**
     * Oms Cl Ord Id Not Found
     */
    OMS_CLORDID_NOT_FOUND_030504(0x7728L, "Oms Cl Ord Id Not Found"),

    /**
     * Oms Orig Cl Ord Id Cannot Be Empty
     */
    OMS_ORIGCLORDID_CANNOT_BE_EMPTY_030505(0x7729L, "Oms Orig Cl Ord Id Cannot Be Empty"),

    /**
     * Oms Cross Id Cannot Be Empty
     */
    OMS_CROSSID_CANNOT_BE_EMPTY_030506(0x772AL, "Oms Cross Id Cannot Be Empty"),

    /**
     * Oms Cl Ord Id Is Duplicated Within Cross Order
     */
    OMS_CLORDID_IS_DUPLICATED_WITHIN_CROSS_ORDER_030507(0x772BL, "Oms Cl Ord Id Is Duplicated Within Cross Order"),

    /**
     * Oms Cross Order Modification Is Not Allowed
     */
    OMS_CROSS_ORDER_MODIFICATION_IS_NOT_ALLOWED_030508(0x772CL, "Oms Cross Order Modification Is Not Allowed"),

    /**
     * Oms Order Id Not Found
     */
    OMS_ORDERID_NOT_FOUND_030509(0x772DL, "Oms Order Id Not Found"),

    /**
     * Oms Order Id Cannot Be Empty
     */
    OMS_ORDERID_CANNOT_BE_EMPTY_030510(0x772EL, "Oms Order Id Cannot Be Empty"),

    /**
     * Oms Quote Req Id Cannot Be Empty
     */
    OMS_QUOTEREQID_CANNOT_BE_EMPTY_030511(0x772FL, "Oms Quote Req Id Cannot Be Empty"),

    /**
     * Oms Quote Req Id Is Duplicated
     */
    OMS_QUOTEREQID_IS_DUPLICATED_030512(0x7730L, "Oms Quote Req Id Is Duplicated"),

    /**
     * Oms Quote Req Id Not Found
     */
    OMS_QUOTEREQID_NOT_FOUND_030513(0x7731L, "Oms Quote Req Id Not Found"),

    /**
     * Oms Quote Id Cannot Be Empty
     */
    OMS_QUOTEID_CANNOT_BE_EMPTY_030514(0x7732L, "Oms Quote Id Cannot Be Empty"),

    /**
     * Oms In
     */
    OMS_IN(0x7739L, "Oms In"),

    /**
     * Oms
     */
    OMS(0x773AL, "Oms"),

    /**
     * Oms Entering Firm Modification Is Not Allowed
     */
    OMS_ENTERING_FIRM_MODIFICATION_IS_NOT_ALLOWED_030523(0x773BL, "Oms Entering Firm Modification Is Not Allowed"),

    /**
     * Oms Account Modification On Dma Order Is Not Allowed
     */
    OMS_ACCOUNT_MODIFICATION_ON_DMA_ORDER_IS_NOT_ALLOWED_030524(0x773CL, "Oms Account Modification On Dma Order Is Not Allowed"),

    /**
     * Oms Account Information Missing On Non
     */
    OMS_ACCOUNT_INFORMATION_MISSING_ON_NON(0x773DL, "Oms Account Information Missing On Non"),

    /**
     * Oms Entering Trader
     */
    OMS_ENTERING_TRADER(0x773EL, "Oms Entering Trader"),

    /**
     * Oms Received Execution Report Rejection For An Active Order
     */
    OMS_RECEIVED_EXECUTION_REPORT_REJECTION_FOR_AN_ACTIVE_ORDER_030527(0x773FL, "Oms Received Execution Report Rejection For An Active Order"),

    /**
     * Broker Negotiation Blocked
     */
    BROKER_NEGOTIATION_BLOCKED_031011(0x7923L, "Broker Negotiation Blocked"),

    /**
     * Broker Not Available
     */
    BROKER_NOT_AVAILABLE_031012(0x7924L, "Broker Not Available"),

    /**
     * Brokers Capture Account Not Found
     */
    BROKERS_CAPTURE_ACCOUNT_NOT_FOUND_031013(0x7925L, "Brokers Capture Account Not Found"),

    /**
     * Brokers Segment Negotiation Blocked
     */
    BROKERS_SEGMENT_NEGOTIATION_BLOCKED_031014(0x7926L, "Brokers Segment Negotiation Blocked"),

    /**
     * Broker Segment Not Available
     */
    BROKER_SEGMENT_NOT_AVAILABLE_031015(0x7927L, "Broker Segment Not Available"),

    /**
     * Brokers Segment Protected Mode Under Activation
     */
    BROKERS_SEGMENT_PROTECTED_MODE_UNDER_ACTIVATION_031016(0x7928L, "Brokers Segment Protected Mode Under Activation"),

    /**
     * Account Negotiation Blocked
     */
    ACCOUNT_NEGOTIATION_BLOCKED_031021(0x792DL, "Account Negotiation Blocked"),

    /**
     * Account Not Available
     */
    ACCOUNT_NOT_AVAILABLE_031022(0x792EL, "Account Not Available"),

    /**
     * Accounts Protected Mode Under Activation
     */
    ACCOUNTS_PROTECTED_MODE_UNDER_ACTIVATION_031023(0x792FL, "Accounts Protected Mode Under Activation"),

    /**
     * Account Mandatory On Dma Orders
     */
    ACCOUNT_MANDATORY_ON_DMA_ORDERS_031024(0x7930L, "Account Mandatory On Dma Orders"),

    /**
     * Transient Account Is Hierarchically Blocked On Protected Mode
     */
    TRANSIENT_ACCOUNT_IS_HIERARCHICALLY_BLOCKED_ON_PROTECTED_MODE_031025(0x7931L, "Transient Account Is Hierarchically Blocked On Protected Mode"),

    /**
     * Cross Orders Or Cross Forward Not Allowed While Account In Protected Mode
     */
    CROSSORDERS_OR_CROSSFORWARD_NOT_ALLOWED_WHILE_ACCOUNT_IN_PROTECTED_MODE_031026(0x7932L, "Cross Orders Or Cross Forward Not Allowed While Account In Protected Mode"),

    /**
     * Transient Account Not Allowed In Extended Hours
     */
    TRANSIENT_ACCOUNT_NOT_ALLOWED_IN_EXTENDED_HOURS_031027(0x7933L, "Transient Account Not Allowed In Extended Hours"),

    /**
     * Document Negotiation Blocked
     */
    DOCUMENT_NEGOTIATION_BLOCKED_031031(0x7937L, "Document Negotiation Blocked"),

    /**
     * Document Not Available
     */
    DOCUMENT_NOT_AVAILABLE_031032(0x7938L, "Document Not Available"),

    /**
     * Documents Protected Mode Under Activation
     */
    DOCUMENTS_PROTECTED_MODE_UNDER_ACTIVATION_031033(0x7939L, "Documents Protected Mode Under Activation"),

    /**
     * Executor Document Cannot Use Default Broker Profile
     */
    EXECUTOR_DOCUMENT_CANNOT_USE_DEFAULT_BROKER_PROFILE_031034(0x793AL, "Executor Document Cannot Use Default Broker Profile"),

    /**
     * Document In Blocked Profile
     */
    DOCUMENT_IN_BLOCKED_PROFILE_031035(0x793BL, "Document In Blocked Profile"),

    /**
     * Cross Orders Or Cross Forward Not Allowed While Document In Protected Mode
     */
    CROSSORDERS_OR_CROSSFORWARD_NOT_ALLOWED_WHILE_DOCUMENT_IN_PROTECTED_MODE_031036(0x793CL, "Cross Orders Or Cross Forward Not Allowed While Document In Protected Mode"),

    /**
     * Entering Trader Negotiation Blocked
     */
    ENTERING_TRADER_NEGOTIATION_BLOCKED_031041(0x7941L, "Entering Trader Negotiation Blocked"),

    /**
     * Entering Trader Not Available
     */
    ENTERING_TRADER_NOT_AVAILABLE_031042(0x7942L, "Entering Trader Not Available"),

    /**
     * Entering Trader Blocked By Sfd Overflow
     */
    ENTERING_TRADER_BLOCKED_BY_SFD_OVERFLOW_031043(0x7943L, "Entering Trader Blocked By Sfd Overflow"),

    /**
     * Non Dma Orders Must Provide Account While In Brokers Protected Mode
     */
    NON_DMA_ORDERS_MUST_PROVIDE_ACCOUNT_WHILE_IN_BROKERS_PROTECTED_MODE_031044(0x7944L, "Non Dma Orders Must Provide Account While In Brokers Protected Mode"),

    /**
     * Entering Trader Not Authorized To Trade Accountless Orders
     */
    ENTERING_TRADER_NOT_AUTHORIZED_TO_TRADE_ACCOUNTLESS_ORDERS_031045(0x7945L, "Entering Trader Not Authorized To Trade Accountless Orders"),

    /**
     * Entering Trader Cannot Trade On Behalf Of Other Firms Account
     */
    ENTERING_TRADER_CANNOT_TRADE_ON_BEHALF_OF_OTHER_FIRMS_ACCOUNT_031046(0x7946L, "Entering Trader Cannot Trade On Behalf Of Other Firms Account"),

    /**
     * Symbol Not Available
     */
    SYMBOL_NOT_AVAILABLE_031050(0x794AL, "Symbol Not Available"),

    /**
     * Symbol Internal Data Corrupted
     */
    SYMBOL_INTERNAL_DATA_CORRUPTED_031051(0x794BL, "Symbol Internal Data Corrupted"),

    /**
     * Fix Message Type Does Not Support Operations On Such Symbol
     */
    FIX_MESSAGE_TYPE_DOES_NOT_SUPPORT_OPERATIONS_ON_SUCH_SYMBOL_031052(0x794CL, "Fix Message Type Does Not Support Operations On Such Symbol"),

    /**
     * Symbols Underlying Not Found For Risk Aggregation
     */
    SYMBOLS_UNDERLYING_NOT_FOUND_FOR_RISK_AGGREGATION_031053(0x794DL, "Symbols Underlying Not Found For Risk Aggregation"),

    /**
     * Symbols Risk Unit Matrix Not Available
     */
    SYMBOLS_RISK_UNIT_MATRIX_NOT_AVAILABLE_031054(0x794EL, "Symbols Risk Unit Matrix Not Available"),

    /**
     * Symbols Reference Price Missing Market Orders Not Allowed
     */
    SYMBOLS_REFERENCE_PRICE_MISSING_MARKET_ORDERS_NOT_ALLOWED_031055(0x794FL, "Symbols Reference Price Missing Market Orders Not Allowed"),

    /**
     * Symbols Calculated Price Invalid
     */
    SYMBOLS_CALCULATED_PRICE_INVALID_031056(0x7950L, "Symbols Calculated Price Invalid"),

    /**
     * Spreads Leg Not Available
     */
    SPREADS_LEG_NOT_AVAILABLE_031060(0x7954L, "Spreads Leg Not Available"),

    /**
     * Spreads Leg Internal Data Corrupted
     */
    SPREADS_LEG_INTERNAL_DATA_CORRUPTED_031061(0x7955L, "Spreads Leg Internal Data Corrupted"),

    /**
     * Unexpected Internal Error During Risk Evaluation
     */
    UNEXPECTED_INTERNAL_ERROR_DURING_RISK_EVALUATION_031070(0x795EL, "Unexpected Internal Error During Risk Evaluation"),

    /**
     * Mkta Account Buy Not Allowed For Symbols Market
     */
    MKTA_ACCOUNT_BUY_NOT_ALLOWED_FOR_SYMBOLS_MARKET_031201(0x79E1L, "Mkta Account Buy Not Allowed For Symbols Market"),

    /**
     * Mkta Account Sell Not Allowed For Symbols Market
     */
    MKTA_ACCOUNT_SELL_NOT_ALLOWED_FOR_SYMBOLS_MARKET_031202(0x79E2L, "Mkta Account Sell Not Allowed For Symbols Market"),

    /**
     * Tmoc Account Max Bid Quantity Exceeded For Single Order
     */
    TMOC_ACCOUNT_MAX_BID_QUANTITY_EXCEEDED_FOR_SINGLE_ORDER(0x79E4L, "Tmoc Account Max Bid Quantity Exceeded For Single Order"),

    /**
     * Tmov Account Max Offer Quantity Exceeded For Single Order
     */
    TMOV_ACCOUNT_MAX_OFFER_QUANTITY_EXCEEDED_FOR_SINGLE_ORDER(0x79E5L, "Tmov Account Max Offer Quantity Exceeded For Single Order"),

    /**
     * Spci Account Order Quantity Exceeded Max Bid Potential Balance
     */
    SPCI_ACCOUNT_ORDER_QUANTITY_EXCEEDED_MAX_BID_POTENTIAL_BALANCE(0x79E6L, "Spci Account Order Quantity Exceeded Max Bid Potential Balance"),

    /**
     * Spvi Account Order Quantity Exceeded Max Offer Potential Balance
     */
    SPVI_ACCOUNT_ORDER_QUANTITY_EXCEEDED_MAX_OFFER_POTENTIAL_BALANCE(0x79E7L, "Spvi Account Order Quantity Exceeded Max Offer Potential Balance"),

    /**
     * Sdp Account Order Exceeded Max Financial Potential Balance Due
     */
    SDP_ACCOUNT_ORDER_EXCEEDED_MAX_FINANCIAL_POTENTIAL_BALANCE_DUE(0x79E8L, "Sdp Account Order Exceeded Max Financial Potential Balance Due"),

    /**
     * Rmkt Account Order Quantity Exceeded Max Market Risk
     */
    RMKT_ACCOUNT_ORDER_QUANTITY_EXCEEDED_MAX_MARKET_RISK(0x79EAL, "Rmkt Account Order Quantity Exceeded Max Market Risk"),

    /**
     * Irmkt Account Order Quantity Exceeded Max Incremental Market Risk
     */
    IRMKT_ACCOUNT_ORDER_QUANTITY_EXCEEDED_MAX_INCREMENTAL_MARKET_RISK(0x79EBL, "Irmkt Account Order Quantity Exceeded Max Incremental Market Risk"),

    /**
     * Spi Account Order Quantity Exceeded Previous Potencial Balance
     */
    SPI_ACCOUNT_ORDER_QUANTITY_EXCEEDED_PREVIOUS_POTENCIAL_BALANCE(0x79ECL, "Spi Account Order Quantity Exceeded Previous Potencial Balance"),

    /**
     * Std Account Termo Not Allowed Protected Mode Enabled
     */
    STD_ACCOUNT_TERMO_NOT_ALLOWED_PROTECTED_MODE_ENABLED_031213(0x79EDL, "Std Account Termo Not Allowed Protected Mode Enabled"),

    /**
     * Spvd Account Order Exceeded Potential Short Uncovered Balance
     */
    SPVD_ACCOUNT_ORDER_EXCEEDED_POTENTIAL_SHORT_UNCOVERED_BALANCE_031215(0x79EFL, "Spvd Account Order Exceeded Potential Short Uncovered Balance"),

    /**
     * Mkta Document Buy Sell Symbols Market Not Configured
     */
    MKTA_DOCUMENT_BUYSELL_SYMBOLS_MARKET_NOT_CONFIGURED_031300(0x7A44L, "Mkta Document Buy Sell Symbols Market Not Configured"),

    /**
     * Mkta Document Buy Not Allowed For Symbols Market
     */
    MKTA_DOCUMENT_BUY_NOT_ALLOWED_FOR_SYMBOLS_MARKET_031301(0x7A45L, "Mkta Document Buy Not Allowed For Symbols Market"),

    /**
     * Mkta Document Sell Not Allowed For Symbols Market
     */
    MKTA_DOCUMENT_SELL_NOT_ALLOWED_FOR_SYMBOLS_MARKET_031302(0x7A46L, "Mkta Document Sell Not Allowed For Symbols Market"),

    /**
     * Tmox Document Maximum Order Size Not Configured
     */
    TMOX_DOCUMENT_MAXIMUM_ORDER_SIZE_NOT_CONFIGURED(0x7A47L, "Tmox Document Maximum Order Size Not Configured"),

    /**
     * Tmoc Document Maximum Order Size Exceeded For Single Order
     */
    TMOC_DOCUMENT_MAXIMUM_ORDER_SIZE_EXCEEDED_FOR_SINGLE_ORDER(0x7A48L, "Tmoc Document Maximum Order Size Exceeded For Single Order"),

    /**
     * Tmov Document Maximum Order Size Exceeded For Single Order
     */
    TMOV_DOCUMENT_MAXIMUM_ORDER_SIZE_EXCEEDED_FOR_SINGLE_ORDER(0x7A49L, "Tmov Document Maximum Order Size Exceeded For Single Order"),

    /**
     * Spci Document Order Quantity Exceeded Short Position Per Instrument
     */
    SPCI_DOCUMENT_ORDER_QUANTITY_EXCEEDED_SHORT_POSITION_PER_INSTRUMENT(0x7A4AL, "Spci Document Order Quantity Exceeded Short Position Per Instrument"),

    /**
     * Spvi Document Order Quantity Exceeded Long Position Per Instrument
     */
    SPVI_DOCUMENT_ORDER_QUANTITY_EXCEEDED_LONG_POSITION_PER_INSTRUMENT(0x7A4BL, "Spvi Document Order Quantity Exceeded Long Position Per Instrument"),

    /**
     * Sdp Document Order Exceeded Cash Settlement Exposure
     */
    SDP_DOCUMENT_ORDER_EXCEEDED_CASH_SETTLEMENT_EXPOSURE(0x7A4CL, "Sdp Document Order Exceeded Cash Settlement Exposure"),

    /**
     * Std Document Order Quantity Exceeded Forward Contracts Exposure
     */
    STD_DOCUMENT_ORDER_QUANTITY_EXCEEDED_FORWARD_CONTRACTS_EXPOSURE(0x7A4DL, "Std Document Order Quantity Exceeded Forward Contracts Exposure"),

    /**
     * Rmkt Document Order Quantity Exceeded Risk Increase
     */
    RMKT_DOCUMENT_ORDER_QUANTITY_EXCEEDED_RISK_INCREASE(0x7A4EL, "Rmkt Document Order Quantity Exceeded Risk Increase"),

    /**
     * Irmkt Document Order Quantity Exceeded Risk Increase Reducing Mode
     */
    IRMKT_DOCUMENT_ORDER_QUANTITY_EXCEEDED_RISK_INCREASE_REDUCING_MODE(0x7A4FL, "Irmkt Document Order Quantity Exceeded Risk Increase Reducing Mode"),

    /**
     * Spi Document Order Quantity Exceeded Long And Short Position Reducing Mode
     */
    SPI_DOCUMENT_ORDER_QUANTITY_EXCEEDED_LONG_AND_SHORT_POSITION_REDUCING_MODE(0x7A50L, "Spi Document Order Quantity Exceeded Long And Short Position Reducing Mode"),

    /**
     * Std Document Termo Not Allowed Protected Mode Enabled
     */
    STD_DOCUMENT_TERMO_NOT_ALLOWED_PROTECTED_MODE_ENABLED(0x7A51L, "Std Document Termo Not Allowed Protected Mode Enabled"),

    /**
     * Sfd Document Day Trade Cash Balance Stop Loss Not Configured
     */
    SFD_DOCUMENT_DAY_TRADE_CASH_BALANCE_STOP_LOSS_NOT_CONFIGURED_031314(0x7A52L, "Sfd Document Day Trade Cash Balance Stop Loss Not Configured"),

    /**
     * Spvd Document Order Exceeded Potential Short Uncovered Balance
     */
    SPVD_DOCUMENT_ORDER_EXCEEDED_POTENTIAL_SHORT_UNCOVERED_BALANCE_031315(0x7A53L, "Spvd Document Order Exceeded Potential Short Uncovered Balance"),

    /**
     * Rmse Document Order Exceeded Risk Increase At Extended Session
     */
    RMSE_DOCUMENT_ORDER_EXCEEDED_RISK_INCREASE_AT_EXTENDED_SESSION_031316(0x7A54L, "Rmse Document Order Exceeded Risk Increase At Extended Session"),

    /**
     * Rmse Document Order Exceeded Risk Increase Of Broker At Extended Session
     */
    RMSE_DOCUMENT_ORDER_EXCEEDED_RISK_INCREASE_OF_BROKER_AT_EXTENDED_SESSION_031317(0x7A55L, "Rmse Document Order Exceeded Risk Increase Of Broker At Extended Session"),

    /**
     * Mkta Entering Trader Buy Sell Symbols Market Not Configured
     */
    MKTA_ENTERING_TRADER_BUYSELL_SYMBOLS_MARKET_NOT_CONFIGURED_031400(0x7AA8L, "Mkta Entering Trader Buy Sell Symbols Market Not Configured"),

    /**
     * Mkta Entering Trader Buy Not Allowed For Symbols Market
     */
    MKTA_ENTERING_TRADER_BUY_NOT_ALLOWED_FOR_SYMBOLS_MARKET_031401(0x7AA9L, "Mkta Entering Trader Buy Not Allowed For Symbols Market"),

    /**
     * Mkta Entering Trader Sell Not Allowed For Symbols Market
     */
    MKTA_ENTERING_TRADER_SELL_NOT_ALLOWED_FOR_SYMBOLS_MARKET(0x7AAAL, "Mkta Entering Trader Sell Not Allowed For Symbols Market"),

    /**
     * Tmox Entering Trader Maximum Order Size Not Configured
     */
    TMOX_ENTERING_TRADER_MAXIMUM_ORDER_SIZE_NOT_CONFIGURED(0x7AABL, "Tmox Entering Trader Maximum Order Size Not Configured"),

    /**
     * Tmoc Entering Trader Maximum Order Size Exceeded For Single Order
     */
    TMOC_ENTERING_TRADER_MAXIMUM_ORDER_SIZE_EXCEEDED_FOR_SINGLE_ORDER(0x7AACL, "Tmoc Entering Trader Maximum Order Size Exceeded For Single Order"),

    /**
     * Tmov Entering Trader Maximum Order Size Exceeded For Single Order
     */
    TMOV_ENTERING_TRADER_MAXIMUM_ORDER_SIZE_EXCEEDED_FOR_SINGLE_ORDER(0x7AADL, "Tmov Entering Trader Maximum Order Size Exceeded For Single Order"),

    /**
     * Spci Entering Trader Order Quantity Exceeded Short Position Per Instrument
     */
    SPCI_ENTERING_TRADER_ORDER_QUANTITY_EXCEEDED_SHORT_POSITION_PER_INSTRUMENT(0x7AAEL, "Spci Entering Trader Order Quantity Exceeded Short Position Per Instrument"),

    /**
     * Spvi Entering Trader Order Quantity Exceeded Long Position Per Instrument
     */
    SPVI_ENTERING_TRADER_ORDER_QUANTITY_EXCEEDED_LONG_POSITION_PER_INSTRUMENT(0x7AAFL, "Spvi Entering Trader Order Quantity Exceeded Long Position Per Instrument"),

    /**
     * Sdp Entering Trader Order Exceeded Cash Settlement Exposure
     */
    SDP_ENTERING_TRADER_ORDER_EXCEEDED_CASH_SETTLEMENT_EXPOSURE(0x7AB0L, "Sdp Entering Trader Order Exceeded Cash Settlement Exposure"),

    /**
     * Oms Unexpected Internal Error
     */
    OMS_UNEXPECTED_INTERNAL_ERROR_031500(0x7B0CL, "Oms Unexpected Internal Error"),

    /**
     * Oms Invalid Session Or Symbol
     */
    OMS_INVALID_SESSION_OR_SYMBOL_031501(0x7B0DL, "Oms Invalid Session Or Symbol"),

    /**
     * Oms Cl Ord Id Cannot Be Empty
     */
    OMS_CLORDID_CANNOT_BE_EMPTY_031502(0x7B0EL, "Oms Cl Ord Id Cannot Be Empty"),

    /**
     * Oms Cl Ord Id Is Duplicated
     */
    OMS_CLORDID_IS_DUPLICATED_031503(0x7B0FL, "Oms Cl Ord Id Is Duplicated"),

    /**
     * Oms Cl Ord Id Not Found
     */
    OMS_CLORDID_NOT_FOUND_031504(0x7B10L, "Oms Cl Ord Id Not Found"),

    /**
     * Oms Orig Cl Ord Id Cannot Be Empty
     */
    OMS_ORIGCLORDID_CANNOT_BE_EMPTY_031505(0x7B11L, "Oms Orig Cl Ord Id Cannot Be Empty"),

    /**
     * Oms Cross Id Cannot Be Empty
     */
    OMS_CROSSID_CANNOT_BE_EMPTY_031506(0x7B12L, "Oms Cross Id Cannot Be Empty"),

    /**
     * Oms Cl Ord Id Is Duplicated Within Cross Order
     */
    OMS_CLORDID_IS_DUPLICATED_WITHIN_CROSS_ORDER_031507(0x7B13L, "Oms Cl Ord Id Is Duplicated Within Cross Order"),

    /**
     * Oms Cross Order Modification Is Not Allowed
     */
    OMS_CROSS_ORDER_MODIFICATION_IS_NOT_ALLOWED_031508(0x7B14L, "Oms Cross Order Modification Is Not Allowed"),

    /**
     * Oms Order Id Not Found
     */
    OMS_ORDERID_NOT_FOUND_031509(0x7B15L, "Oms Order Id Not Found"),

    /**
     * Oms Order Id Cannot Be Empty
     */
    OMS_ORDERID_CANNOT_BE_EMPTY_031510(0x7B16L, "Oms Order Id Cannot Be Empty"),

    /**
     * Oms Quote Req Id Cannot Be Empty
     */
    OMS_QUOTEREQID_CANNOT_BE_EMPTY_031511(0x7B17L, "Oms Quote Req Id Cannot Be Empty"),

    /**
     * Oms Quote Req Id Is Duplicated
     */
    OMS_QUOTEREQID_IS_DUPLICATED_031512(0x7B18L, "Oms Quote Req Id Is Duplicated"),

    /**
     * Oms Quote Req Id Not Found
     */
    OMS_QUOTEREQID_NOT_FOUND_031513(0x7B19L, "Oms Quote Req Id Not Found"),

    /**
     * Oms Quote Id Cannot Be Empty
     */
    OMS_QUOTEID_CANNOT_BE_EMPTY_031514(0x7B1AL, "Oms Quote Id Cannot Be Empty"),

    /**
     * Oms In Flight Modification Is Not Allowed
     */
    OMS_INFLIGHT_MODIFICATION_IS_NOT_ALLOWED(0x7B21L, "Oms In Flight Modification Is Not Allowed"),

    /**
     * Oms Side Modification Is Not Allowed
     */
    OMS_SIDE_MODIFICATION_IS_NOT_ALLOWED(0x7B22L, "Oms Side Modification Is Not Allowed"),

    /**
     * Oms Entering Firm Modification Is Not Allowed
     */
    OMS_ENTERING_FIRM_MODIFICATION_IS_NOT_ALLOWED_031523(0x7B23L, "Oms Entering Firm Modification Is Not Allowed"),

    /**
     * Oms Account Modification On Dma Order Is Not Allowed
     */
    OMS_ACCOUNT_MODIFICATION_ON_DMA_ORDER_IS_NOT_ALLOWED_031524(0x7B24L, "Oms Account Modification On Dma Order Is Not Allowed"),

    /**
     * Oms Account Information Missing On Non Dma Order
     */
    OMS_ACCOUNT_INFORMATION_MISSING_ON_NONDMA_ORDER(0x7B25L, "Oms Account Information Missing On Non Dma Order"),

    /**
     * Oms Entering Trader Modification On Non Dma Order Is Not Allowed
     */
    OMS_ENTERING_TRADER_MODIFICATION_ON_NONDMA_ORDER_IS_NOT_ALLOWED(0x7B26L, "Oms Entering Trader Modification On Non Dma Order Is Not Allowed"),

    /**
     * Oms Received Execution Report Rejection For An Active Order
     */
    OMS_RECEIVED_EXECUTION_REPORT_REJECTION_FOR_AN_ACTIVE_ORDER_031527(0x7B27L, "Oms Received Execution Report Rejection For An Active Order"),

    /**
     * Field Missing Or Incorrect
     */
    FIELD_MISSING_OR_INCORRECT_032000(0x7D00L, "Field Missing Or Incorrect"),

    /**
     * Li Ne Not Available Or Busy
     */
    LINE_NOT_AVAILABLE_OR_BUSY(0x7D01L, "Li Ne Not Available Or Busy"),

    /**
     * Li Ne Internal Error
     */
    LINE_INTERNAL_ERROR(0x7D02L, "Li Ne Internal Error"),

    /**
     * Li Ne Recovering Or Starting Up
     */
    LINE_RECOVERING_OR_STARTING_UP(0x7D03L, "Li Ne Recovering Or Starting Up"),

    /**
     * Internal Gateway Error Message Forwarding Failure
     */
    INTERNAL_GATEWAY_ERROR_MESSAGE_FORWARDING_FAILURE(0x7D04L, "Internal Gateway Error Message Forwarding Failure"),

    /**
     * Invalid Quantity
     */
    INVALID_QUANTITY(0x7D05L, "Invalid Quantity"),

    /**
     * Duplicate Order
     */
    DUPLICATE_ORDER(0x7D06L, "Duplicate Order"),

    /**
     * Missing Account Field
     */
    MISSING_ACCOUNT_FIELD(0x7D07L, "Missing Account Field"),

    /**
     * Unknown Account
     */
    UNKNOWN_ACCOUNT(0x7D08L, "Unknown Account"),

    /**
     * Unknown Firm Id For Routing
     */
    UNKNOWN_FIRMID_FOR_ROUTING(0x7D09L, "Unknown Firm Id For Routing"),

    /**
     * Duplicate Firm Id
     */
    DUPLICATE_FIRMID(0x7D0AL, "Duplicate Firm Id"),

    /**
     * Duplicate Sender Location
     */
    DUPLICATE_SENDER_LOCATION(0x7D0BL, "Duplicate Sender Location"),

    /**
     * Duplicate Entering Trader
     */
    DUPLICATE_ENTERING_TRADER(0x7D0CL, "Duplicate Entering Trader"),

    /**
     * Firm Or Trader Is Missing In Non Dma Order
     */
    FIRM_OR_TRADER_IS_MISSING_IN_NONDMA_ORDER(0x7D0DL, "Firm Or Trader Is Missing In Non Dma Order"),

    /**
     * Firm Or Account Is Missing In Dma Order
     */
    FIRM_OR_ACCOUNT_IS_MISSING_IN_DMA_ORDER(0x7D0EL, "Firm Or Account Is Missing In Dma Order"),

    /**
     * Same Participants On Both Sides Or Invalid Sides
     */
    SAME_PARTICIPANTS_ON_BOTH_SIDES_OR_INVALID_SIDES(0x7D0FL, "Same Participants On Both Sides Or Invalid Sides"),

    /**
     * Buy Side And Sell Side Having Different Firm I Ds
     */
    BUY_SIDE_AND_SELL_SIDE_HAVING_DIFFERENT_FIRMIDS(0x7D10L, "Buy Side And Sell Side Having Different Firm I Ds"),

    /**
     * Buy Side And Sell Side Trading Different Assets
     */
    BUY_SIDE_AND_SELL_SIDE_TRADING_DIFFERENT_ASSETS(0x7D11L, "Buy Side And Sell Side Trading Different Assets"),

    /**
     * Invalid Price
     */
    INVALID_PRICE_032018(0x7D12L, "Invalid Price"),

    /**
     * Li Ne Overloaded
     */
    LINE_OVERLOADED(0x7D13L, "Li Ne Overloaded"),

    /**
     * Li Ne Administratively Blocked
     */
    LINE_ADMINISTRATIVELY_BLOCKED(0x7D14L, "Li Ne Administratively Blocked"),

    /**
     * Invalid Price
     */
    INVALID_PRICE_032021(0x7D15L, "Invalid Price"),

    /**
     * System Overloaded
     */
    SYSTEM_OVERLOADED(0x7D16L, "System Overloaded"),

    /**
     * System Error
     */
    SYSTEM_ERROR_032023(0x7D17L, "System Error"),

    /**
     * Throttle Limit Reached
     */
    THROTTLE_LIMIT_REACHED(0x80E8L, "Throttle Limit Reached"),

    /**
     * Invalid Security Id
     */
    INVALID_SECURITY_ID(0x80E9L, "Invalid Security Id"),

    /**
     * Unknown Market Segment Id
     */
    UNKNOWN_MARKET_SEGMENT_ID(0x80EAL, "Unknown Market Segment Id"),

    /**
     * Field Missing Or Incorrect
     */
    FIELD_MISSING_OR_INCORRECT_033003(0x80EBL, "Field Missing Or Incorrect"),

    /**
     * System Error
     */
    SYSTEM_ERROR_033050(0x811AL, "System Error");

    private final long wire;

    private final String description;

    OrdRejReason(long wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public long wire() {
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
    public static Optional<OrdRejReason> fromWire(long wire) {
        if (wire == 908L) {
            return Optional.of(UNABLE_TO_SEND_FIX_FROM_VOLATILITYUPDATE_MESSAGE);
        }
        if (wire == 1003L) {
            return Optional.of(ORDERS_MAY_NOT_BE_ENTERED_WHILE_THE_MARKET_IS_CLOSEDPAUSED);
        }
        if (wire == 1007L) {
            return Optional.of(FIX_FIELD_MISSING_OR_INCORRECT);
        }
        if (wire == 1010L) {
            return Optional.of(REQUIRED_FIELD_MISSING);
        }
        if (wire == 1011L) {
            return Optional.of(FIX_FIELD_INCORRECT_001011);
        }
        if (wire == 1012L) {
            return Optional.of(PRICE_MUST_BE_GREATER_THAN_ZERO);
        }
        if (wire == 1013L) {
            return Optional.of(INVALID_ORDER_QUALIFIER);
        }
        if (wire == 1014L) {
            return Optional.of(USER_NOT_AUTHORIZED_TO_TRADE);
        }
        if (wire == 1016L) {
            return Optional.of(REQUIRED_FIELD_MISSING_STOP_ORDERS_CANNOT_BE_IOCFAK);
        }
        if (wire == 1017L) {
            return Optional.of(REQUIRED_FIELD_MISSING_DISPLAY_QUANTITY_ORDERS_CANNOT_BE_IOCFOK);
        }
        if (wire == 1018L) {
            return Optional.of(REQUIRED_FIELD_MISSING_STOP_ORDERS_CANNOT_BE_IOCFOK);
        }
        if (wire == 2013L) {
            return Optional.of(MARKET_PRICE_ORDERS_NOT_SUPPORTED_BY_OPPOSITE_LIMIT);
        }
        if (wire == 2019L) {
            return Optional.of(ORDER_GTD_EXPIRE_DATE_IS_BEFORE_THE_CURRENT_OR_NEXT_IF_NOT_CURRENTLY_IN_A_SESSION_TRADING_SESSION_END_DATE);
        }
        if (wire == 2045L) {
            return Optional.of(CANNOT_MODIFY_ORDER_BECAUSE_ORDER_DOES_NOT_EXIST);
        }
        if (wire == 2046L) {
            return Optional.of(DISCLOSED_QUANTITY_CANNOT_BE_GREATER_THAN_TOTAL_OR_REMAINING_QUANTITY);
        }
        if (wire == 2047L) {
            return Optional.of(ORDER_CONTRACT_IS_UNKNOWN_002047);
        }
        if (wire == 2048L) {
            return Optional.of(THE_ORDER_WAS_SUBMITTED_WITH_A_DIFFERENT_SENDERCOMPID_THAN_THE_REQUESTING_CANCEL);
        }
        if (wire == 2049L) {
            return Optional.of(THE_ORDER_WAS_SUBMITTED_WITH_A_DIFFERENT_CLORDERID_THAN_THE_CORRELATIONCLORDERID_OF_THE_REQUESTING_CANCEL);
        }
        if (wire == 2050L) {
            return Optional.of(THE_ORDER_WAS_SUBMITTED_WITH_A_DIFFERENT_CLORDERID_THAN_THE_ORIGINALCLORDERID_OF_THE_REQUESTING_CANCEL);
        }
        if (wire == 2051L) {
            return Optional.of(THE_ORDER_WAS_SUBMITTED_WITH_A_DIFFERENT_SIDE_THAN_THE_REQUESTING_CANCEL);
        }
        if (wire == 2052L) {
            return Optional.of(THE_ORDER_WAS_SUBMITTED_WITH_A_DIFFERENT_GROUP_TAG_55_THAN_THE_REQUESTING_CANCEL);
        }
        if (wire == 2053L) {
            return Optional.of(THE_ORDER_WAS_SUBMITTED_WITH_A_DIFFERENT_SECURITY_TYPE_THAN_THE_REQUESTING_CANCEL);
        }
        if (wire == 2054L) {
            return Optional.of(THE_ORDER_WAS_SUBMITTED_WITH_A_DIFFERENT_ACCOUNT_THAN_THE_REQUESTING_CANCEL);
        }
        if (wire == 2055L) {
            return Optional.of(THE_ORDER_WAS_SUBMITTED_WITH_A_DIFFERENT_QUANTITY_THAN_THE_REQUESTING_CANCEL);
        }
        if (wire == 2056L) {
            return Optional.of(THE_ORDER_WAS_SUBMITTED_WITH_A_DIFFERENT_TRADERID_THAN_THE_REQUESTING_CANCEL);
        }
        if (wire == 2057L) {
            return Optional.of(ATTEMPT_TO_CANCEL_AN_ORDER_WITH_A_DIFFERENT_FIRMID_THAN_THE_ORIGINAL_ORDER);
        }
        if (wire == 2058L) {
            return Optional.of(ATTEMPT_TO_CANCEL_AN_ORDER_WITH_A_DIFFERENT_SENDERLOCATIONID_THAN_THE_ORIGINAL_ORDER);
        }
        if (wire == 2059L) {
            return Optional.of(STOP_PRICE_MAXIMINI_MUST_BE_SMALLER_THAN_OR_EQUAL_TO_TRIGGER_PRICE);
        }
        if (wire == 2060L) {
            return Optional.of(SELL_ORDER_STOP_PRICE_MUST_BE_BELOW_LAST_TRADE_PRICE);
        }
        if (wire == 2061L) {
            return Optional.of(BUY_ORDER_STOP_PRICE_MUST_BE_ABOVE_LAST_TRADE_PRICE);
        }
        if (wire == 2100L) {
            return Optional.of(THE_MODIFY_WAS_SUBMITTED_ON_A_DIFFERENT_PRODUCT_THAN_THE_ORIGINAL_ORDER);
        }
        if (wire == 2101L) {
            return Optional.of(ATTEMPT_TO_MODIFY_AN_ORDER_WITH_A_DIFFERENT_INFLIGHTFILL_MITIGATION_STATUS_THAN_FIRST_MODIFICATION);
        }
        if (wire == 2102L) {
            return Optional.of(ATTEMPT_TO_MODIFY_AN_ORDER_WITH_A_DIFFERENT_SENDERCOMPID_THAN_THE_ORIGINAL_ORDER);
        }
        if (wire == 2103L) {
            return Optional.of(ATTEMPT_TO_MODIFY_AN_ORDER_WITH_A_DIFFERENT_TRADERID_THAN_THE_ORIGINAL_ORDER);
        }
        if (wire == 2104L) {
            return Optional.of(ATTEMPT_TO_MODIFY_AN_ORDER_WITH_A_DIFFERENT_ACCOUNTID_THAN_THE_ORIGINAL_ORDER);
        }
        if (wire == 2105L) {
            return Optional.of(ATTEMPT_TO_MODIFY_AN_ORDER_WITH_A_DIFFERENT_FIRMID_THAN_THE_ORIGINAL_ORDER);
        }
        if (wire == 2106L) {
            return Optional.of(ATTEMPT_TO_MODIFY_AN_ORDER_WITH_A_DIFFERENT_SENDERLOCATIONID_THAN_THE_ORIGINAL_ORDER);
        }
        if (wire == 2107L) {
            return Optional.of(DISCLOSED_QUANTITY_IS_NOT_ALLOWED);
        }
        if (wire == 2108L) {
            return Optional.of(ACCOUNT_OR_GIVE_UP_FIRM_REQUIRED_FOR_DMA_CUSTOMERS);
        }
        if (wire == 2109L) {
            return Optional.of(DISCLOSED_QTY_CANNOT_BE_LESS_THAN_DISCLOSED_QTY_MIN);
        }
        if (wire == 2110L) {
            return Optional.of(ACCT_TYPE_38_NOT_VALID_FOR_TAG_581_FOR_DMA_CUSTOMERS);
        }
        if (wire == 2111L) {
            return Optional.of(GIVE_UP_NOT_VALID_FOR_FX_SPOT_CONTRACT);
        }
        if (wire == 2112L) {
            return Optional.of(VISIBILITY_PERMISSION_NOT_GRANTED_FOR_EXECUTING_TRADERENTERING_TRADER);
        }
        if (wire == 2113L) {
            return Optional.of(EXECUTING_TRADER_DOESNT_HAVE_ACCESS_TO_PRODUCT_GROUP);
        }
        if (wire == 2114L) {
            return Optional.of(ATTEMPT_TO_MODIFY_MARKET_ORDER_TO_SOME_OTHER_TYPE);
        }
        if (wire == 2115L) {
            return Optional.of(ORDER_QUANTITY_IS_OUTSIDE_OF_THE_ALLOWABLE_RANGE);
        }
        if (wire == 2116L) {
            return Optional.of(ACCOUNT_IS_MANDATORY_FOR_FX_SPOT);
        }
        if (wire == 2117L) {
            return Optional.of(ORDER_ON_BEHALF_BY_DMA_CUSTOMER_IS_NOT_ALLOWED);
        }
        if (wire == 2118L) {
            return Optional.of(ATTEMPT_TO_MODIFY_AN_ORDER_WITH_A_DIFFERENT_ACCOUNTTYPE_THAN_THE_ORIGINAL_ORDER);
        }
        if (wire == 2123L) {
            return Optional.of(ACCOUNT_OR_GIVE_UP_FIRM_REQUIRED_FOR_EQUITIES);
        }
        if (wire == 2130L) {
            return Optional.of(ORDER_TYPE_NOT_PERMITTED_WHILE_THE_MARKET_IS_IN_PRE_OPEN);
        }
        if (wire == 2137L) {
            return Optional.of(ORDER_PRICE_IS_OUTSIDE_LIMITS);
        }
        if (wire == 2138L) {
            return Optional.of(QTY_IS_NOT_MULTIPLE_OF_ROUND_LOT);
        }
        if (wire == 2139L) {
            return Optional.of(QTY_IS_GREATER_OR_EQUAL_THAN_MAXIMUM_TRADE_VOLUME);
        }
        if (wire == 2179L) {
            return Optional.of(ORDER_PRICE_IS_OUTSIDE_BANDS);
        }
        if (wire == 2180L) {
            return Optional.of(ORDER_PRICE_IS_OUTSIDE_AUCTION_BANDS);
        }
        if (wire == 2181L) {
            return Optional.of(TRADE_OUTSIDE_OF_SHORT_TERM_VOLATILITY_BANDS);
        }
        if (wire == 2182L) {
            return Optional.of(ALL_LEGS_MUST_HAVE_SAME_LOT_TYPES);
        }
        if (wire == 2183L) {
            return Optional.of(ALL_LEGS_MUST_HAVE_SAME_TICK_INCREMENT);
        }
        if (wire == 2184L) {
            return Optional.of(ALL_LEGS_MUST_HAVE_SAME_STEP_OF_QUOTATION);
        }
        if (wire == 2185L) {
            return Optional.of(TRADE_PRICE_IS_OUTSIDE_OF_STATIC_LIMITS);
        }
        if (wire == 2186L) {
            return Optional.of(COD_NOT_SUPPORTED_FOR_GTC_GTD_ORDERS);
        }
        if (wire == 2187L) {
            return Optional.of(ORDER_NOT_BOOKABLE_AT_THIS_TIME);
        }
        if (wire == 2188L) {
            return Optional.of(MINIMUM_QUANTITY_WAS_NOT_FILLED);
        }
        if (wire == 2189L) {
            return Optional.of(ORDER_ATTRIBUTES_NOT_ALLOWED_TO_TRIP_AN_AUCTION);
        }
        if (wire == 2311L) {
            return Optional.of(ORDER_TYPE_NOT_PERMITTED_FOR_GROUP);
        }
        if (wire == 2500L) {
            return Optional.of(INSTRUMENT_HAS_AN_REQUEST_FOR_CROSS_IN_PROGRESS);
        }
        if (wire == 2501L) {
            return Optional.of(ORDER_QUANTITY_TOO_LOW);
        }
        if (wire == 2502L) {
            return Optional.of(CROSSTYPE_INELIGIBLE_FOR_INSTRUMENT);
        }
        if (wire == 2503L) {
            return Optional.of(RFQ_FOR_CROSS_IS_NOT_ALLOWED_SINCE_CONTRACT_IS_NOT_RFQ_FOR_CROSS_ELIGIBLE);
        }
        if (wire == 2504L) {
            return Optional.of(DMA_CROSSORDER_NOT_ALLOWED);
        }
        if (wire == 2505L) {
            return Optional.of(CROSS_ORDER_REJECTED_DUE_TO_AUCTION_TRIGGER_VALIDATION);
        }
        if (wire == 2506L) {
            return Optional.of(TRADE_ON_BEHALF_REJECTED);
        }
        if (wire == 2600L) {
            return Optional.of(MARKET_MAKER_PROTECTION_IN_EFFECT_FOR_USER_XXXXXXXX_AND_GROUP_XXXXXX);
        }
        if (wire == 3000L) {
            return Optional.of(RFQ_REJECTED_INSTRUMENTEXCHANGE_NOT_TRADABLE);
        }
        if (wire == 3001L) {
            return Optional.of(RFQ_REJECTED_INSTRUMENTEXCHANGE_NOT_KNOWN);
        }
        if (wire == 3002L) {
            return Optional.of(ERROR_CREATING_CONTRACT);
        }
        if (wire == 3010L) {
            return Optional.of(BUSINESS_REJECT_OTHER);
        }
        if (wire == 3011L) {
            return Optional.of(BUSINESS_REJECT_UNKNOWN_ID);
        }
        if (wire == 3012L) {
            return Optional.of(BUSINESS_REJECT_UNKNOWN_SECURITY);
        }
        if (wire == 3013L) {
            return Optional.of(BUSINESS_REJECT_UNSUPPORTED_MESSAGE_TYPE);
        }
        if (wire == 3014L) {
            return Optional.of(BUSINESS_REJECT_APPLICATION_NOT_AVAILABLE);
        }
        if (wire == 3015L) {
            return Optional.of(BUSINESS_REJECT_REQUIRED_FIELD_MISSING);
        }
        if (wire == 3016L) {
            return Optional.of(CONTRACT_CLAIMS_TO_BE_A_SPREAD_BUT_IS_MISSING_ONE_OR_MORE_LEGS);
        }
        if (wire == 3017L) {
            return Optional.of(FIX_FIELD_LENGTH_EXCEEDS_MAX_LENGTH);
        }
        if (wire == 3020L) {
            return Optional.of(SPECIAL_AUCTION_PERMISSIONS_ORDER_ENTRY_NOT_ALLOWED);
        }
        if (wire == 4000L) {
            return Optional.of(ENGINE_DID_NOT_RESPOND_TO_FAS_REQUEST);
        }
        if (wire == 6001L) {
            return Optional.of(TERMO_MESSAGE_REJECTED_UNKNOWN_INSTRUMENT);
        }
        if (wire == 6002L) {
            return Optional.of(TERMO_MESSAGE_REJECTED_EXCHANGE_SECURITY_CLOSED);
        }
        if (wire == 6003L) {
            return Optional.of(TERMO_REJECTED_INSTRUMENTEXCHANGE_NOT_TRADABLE);
        }
        if (wire == 6004L) {
            return Optional.of(TERMO_MESSAGE_REJECTED_LIMITS_EXCEEDED);
        }
        if (wire == 6005L) {
            return Optional.of(TERMO_MESSAGE_REJECTED_TOO_LATE_TO_ENTER);
        }
        if (wire == 6006L) {
            return Optional.of(TERMO_MESSAGE_REJECTED_UNKNOWN_TERMO_QUOTE);
        }
        if (wire == 6007L) {
            return Optional.of(TERMO_MESSAGE_REJECTED_DUPLICATE_TERMO_QUOTE);
        }
        if (wire == 6008L) {
            return Optional.of(TERMO_MESSAGE_REJECTED_INVALID_BIDASK_SPREAD);
        }
        if (wire == 6009L) {
            return Optional.of(TERMO_MESSAGE_REJECTED_INVALID_PRICE);
        }
        if (wire == 6010L) {
            return Optional.of(TERMO_MESSAGE_REJECTED_NOT_AUTHORIZED_TO_TERMO_QUOTE_THIS_INSTRUMENT);
        }
        if (wire == 6011L) {
            return Optional.of(TERMO_MESSAGE_REJECTED_PASS);
        }
        if (wire == 6012L) {
            return Optional.of(FIX_FIELD_INCORRECT_006012);
        }
        if (wire == 6013L) {
            return Optional.of(NOT_A_VALID_TERMO_INSTRUMENT);
        }
        if (wire == 6014L) {
            return Optional.of(VALUES_DONT_MATCH_WITH_THE_ORIGINAL_REQUEST);
        }
        if (wire == 6015L) {
            return Optional.of(CURRENT_TERMO_REQUEST_STATUS_DOES_NOT_ALLOW_REJECTION);
        }
        if (wire == 6016L) {
            return Optional.of(CURRENT_TERMO_REQUEST_STATUS_DOES_NOT_ALLOW_ACCEPTANCE);
        }
        if (wire == 6017L) {
            return Optional.of(WRONG_TYPE_OF_ORDER_BOOK_FOR_TERMO);
        }
        if (wire == 6018L) {
            return Optional.of(WRONG_TYPE_OF_REQUEST_FOR_TERMO);
        }
        if (wire == 6019L) {
            return Optional.of(DAYS_TO_SETTLEMENT_MUST_BE_BETWEEN_16_AND_999);
        }
        if (wire == 6020L) {
            return Optional.of(DAYS_TO_SETTLEMENT_MUST_BE_BETWEEN_16_AND_90);
        }
        if (wire == 6021L) {
            return Optional.of(INSTRUMENT_NOT_ALLOWED_TO_THIS_MARKET_006021);
        }
        if (wire == 6022L) {
            return Optional.of(INSTRUMENT_NOT_ALLOWED_TO_THIS_MARKET_006022);
        }
        if (wire == 6023L) {
            return Optional.of(TERMO_PRICE_SHOULD_BE_GREATER_THAN_ZERO);
        }
        if (wire == 6024L) {
            return Optional.of(TERMO_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_PAUSED);
        }
        if (wire == 6025L) {
            return Optional.of(TERMO_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_PRE_OPEN_006025);
        }
        if (wire == 6026L) {
            return Optional.of(TERMO_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_PCP);
        }
        if (wire == 6027L) {
            return Optional.of(TERMO_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_NO_CANCEL);
        }
        if (wire == 6028L) {
            return Optional.of(TERMO_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_RESERVED);
        }
        if (wire == 6029L) {
            return Optional.of(TERMO_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_FORBIDDEN);
        }
        if (wire == 6030L) {
            return Optional.of(TERMO_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_PRE_CLOSE);
        }
        if (wire == 6031L) {
            return Optional.of(TERMO_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_PRE_OPEN_006031);
        }
        if (wire == 6032L) {
            return Optional.of(NOT_A_VALID_TERMO_UNDERLYING_INSTRUMENT);
        }
        if (wire == 6033L) {
            return Optional.of(RECEIVED_A_NULL_ADMINOPERATION);
        }
        if (wire == 6034L) {
            return Optional.of(FIRST_TRADE_OF_DAY_FOR_UNDERLYING_TERMO_INSTRUMENT);
        }
        if (wire == 6035L) {
            return Optional.of(TERMO_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_IN_FINAL_CLOSING_CALL);
        }
        if (wire == 6036L) {
            return Optional.of(INVALID_CASH_TRADE_IN_TVR_006036);
        }
        if (wire == 6037L) {
            return Optional.of(ONLY_BUY_ENTRY_REQUEST_FOR_TVR_IS_ACCEPTED);
        }
        if (wire == 6038L) {
            return Optional.of(THERE_IS_NO_BID_AND_ASK_FOR_UNDERLYING_CONTRACT);
        }
        if (wire == 6039L) {
            return Optional.of(INVALID_PRICE_006039);
        }
        if (wire == 6040L) {
            return Optional.of(INVALID_CASH_TRADE_IN_TVR_006040);
        }
        if (wire == 6041L) {
            return Optional.of(INVALID_CASH_TRADE_IN_TVR_006041);
        }
        if (wire == 6042L) {
            return Optional.of(INVALID_CASH_TRADE_IN_TVR_006042);
        }
        if (wire == 6043L) {
            return Optional.of(INVALID_CASH_TRADE_IN_TVR_006043);
        }
        if (wire == 6044L) {
            return Optional.of(INVALID_CASH_TRADE_IN_TVR_006044);
        }
        if (wire == 7000L) {
            return Optional.of(ORDER_REJECTED);
        }
        if (wire == 7001L) {
            return Optional.of(FOK_ORDER_UNMATCHABLE_IN_MARKET);
        }
        if (wire == 7002L) {
            return Optional.of(ORDERS_MAY_NOT_BE_ENTERED_WHILE_THE_MARKET_IS_CLOSED);
        }
        if (wire == 7005L) {
            return Optional.of(ORDER_CONTRACT_IS_UNKNOWN_007005);
        }
        if (wire == 7006L) {
            return Optional.of(NO_PARTIAL_MATCH_FOUND_FOR_THIS_FAK_ORDER);
        }
        if (wire == 7008L) {
            return Optional.of(MAXIMUM_QUANTITY_DEPTH_FOR_ANY_ONE_PRICE_GROUP_MAX_MAY_NOT_EXCEED_INTEGERMAX_VALUE);
        }
        if (wire == 7009L) {
            return Optional.of(CONTRACT_FOR_THIS_ORDER_CONTRACT_IS_PAST_EXPIRATION_DATE_AND_MAY_NO_LONGER_BE_TRADED);
        }
        if (wire == 7010L) {
            return Optional.of(INVALID_SPREAD_PRICE);
        }
        if (wire == 7011L) {
            return Optional.of(MAXIMUM_NUMBER_OF_WORKING_ORDERS_FOR_THIS_CONTRACT_HAS_BEEN_EXCEEDED);
        }
        if (wire == 7012L) {
            return Optional.of(ORDER_WOULD_OVERWRITE_EXISTING_ORDER_ON_BOOK);
        }
        if (wire == 7013L) {
            return Optional.of(ORDER_GROUP_DOES_NOT_MATCH_GROUP_OF_CONTRACT);
        }
        if (wire == 7014L) {
            return Optional.of(ORDER_SECURITY_TYPE_DOES_NOT_MATCH_SECURITY_TYPE_OF_CONTRACT);
        }
        if (wire == 7015L) {
            return Optional.of(ORDER_MODIFY_HAS_DIFFERENT_SIDE_THAN_EXISTING_ORDER);
        }
        if (wire == 7017L) {
            return Optional.of(CONTRACT_IS_NOT_ELIGIBLE_FOR_ELECTRONIC_MATCHING);
        }
        if (wire == 7018L) {
            return Optional.of(ORDER_CONTRACT_IS_NOT_GTC_OR_GTD_ELIGIBLE);
        }
        if (wire == 7020L) {
            return Optional.of(NO_TRADING_CALENDAR_FOUND_ON_OR_AFTER_ORDER_GTD_EXPIRE_DATE);
        }
        if (wire == 7021L) {
            return Optional.of(TAG_EXPIREDATE_432_BEYOND_INSTRUMENT_EXPIRATION);
        }
        if (wire == 7022L) {
            return Optional.of(TAG_EXPIREDATE_432_BEYOND_UDS_COMBO_EARLIEST_LEG_EXPIRATION);
        }
        if (wire == 7024L) {
            return Optional.of(ORDER_CANNOT_BE_MODIFIED_OR_CANCELLED_WHILE_THE_MARKET_IS_IN_NO_CANCEL);
        }
        if (wire == 7027L) {
            return Optional.of(ORDER_TYPE_NOT_PERMITTED_WHILE_THE_MARKET_IS_RESERVED);
        }
        if (wire == 7028L) {
            return Optional.of(ORDER_SESSION_DATE_IS_IN_THE_PAST);
        }
        if (wire == 7029L) {
            return Optional.of(ORDERS_MAY_NOT_BE_ENTERED_WHILE_THE_MARKET_IS_FORBIDDEN);
        }
        if (wire == 7030L) {
            return Optional.of(QUOTE_REJECTED_EXCHANGE_SECURITY_IS_FORBIDDEN_007030);
        }
        if (wire == 7031L) {
            return Optional.of(ORDERS_MAY_NOT_BE_ENTERED_WHILE_THE_MARKET_IS_PRECLOSED);
        }
        if (wire == 7032L) {
            return Optional.of(QUOTE_REJECTED_EXCHANGE_SECURITY_IS_PRECLOSED);
        }
        if (wire == 7033L) {
            return Optional.of(ORDERS_MAY_NOT_BE_ENTERED_WHILE_THE_MARKET_IS_OPEN);
        }
        if (wire == 7034L) {
            return Optional.of(QUOTE_REJECTED_EXCHANGE_SECURITY_IS_FORBIDDEN_007034);
        }
        if (wire == 7035L) {
            return Optional.of(RFQ_REJECTED_INSTRUMENT_EXCHANGE_IS_OPEN);
        }
        if (wire == 7036L) {
            return Optional.of(TIME_IN_FORCE_59_NOT_VALID_FOR_ORDER_TYPE_40);
        }
        if (wire == 7037L) {
            return Optional.of(GOOD_FOR_AUCTION_ORDER_NOT_ALLOWED);
        }
        if (wire == 7038L) {
            return Optional.of(ON_CLOSE_ORDER_NOT_ALLOWED);
        }
        if (wire == 7039L) {
            return Optional.of(DUPLICATE_CLIENT_ORDER_ID_FOR_THIS_SESSIONCONTRACT);
        }
        if (wire == 7040L) {
            return Optional.of(GOOD_FOR_AUCTION_ORDER_CANCEL_NOT_ALLOWED);
        }
        if (wire == 7041L) {
            return Optional.of(ON_CLOSE_ORDER_CANCEL_NOT_ALLOWED);
        }
        if (wire == 7042L) {
            return Optional.of(GOOD_FOR_AUCTION_ORDER_MODIFY_NOT_ALLOWED);
        }
        if (wire == 7043L) {
            return Optional.of(ON_CLOSE_ORDER_MODIFY_NOT_ALLOWED);
        }
        if (wire == 7044L) {
            return Optional.of(MODIFY_OF_ORDER_PARTICIPATING_IN_TOP_NOT_ALLOWED);
        }
        if (wire == 7045L) {
            return Optional.of(CANCEL_OF_ORDER_PARTICIPATING_IN_TOP_NOT_ALLOWED);
        }
        if (wire == 7046L) {
            return Optional.of(ORDER_TYPE_DURATION_COMBINATION_INVALID_FOR_AUCTION);
        }
        if (wire == 7047L) {
            return Optional.of(ORDER_TYPE_DURATION_COMBINATION_INVALID);
        }
        if (wire == 7048L) {
            return Optional.of(QUANTITY_ATTRIBUTE_NOT_ALLOWED_ON_ORDER_DURING_AUCTION);
        }
        if (wire == 7049L) {
            return Optional.of(ORDER_ENTRY_WAS_UNSUCCESSFUL_ERROR_MESSAGE_IS_NOT_POSSIBLE_TO_SEND_ORDERS_WITH_VALIDITY_TYPE_MARKET_ON_AUCTION_WITH_MINIMUM_QUANTITY);
        }
        if (wire == 7050L) {
            return Optional.of(MAX_FLOOR_111_NOT_VALID_FOR_TIME_IN_FORCE_59);
        }
        if (wire == 7055L) {
            return Optional.of(SPREAD_ORDERS_MAY_NOT_BE_ENTERED_WHILE_THE_UNDERLYING_LEG_MARKET_IS_IN_NON_TRADING_STATE);
        }
        if (wire == 7056L) {
            return Optional.of(ORDERS_MAY_NOT_BE_ENTERED_WHILE_THE_MARKET_IS_IN_FINAL_CLOSING_CALL);
        }
        if (wire == 7101L) {
            return Optional.of(QUOTE_REJECTED_UNKNOWN_INSTRUMENT);
        }
        if (wire == 7102L) {
            return Optional.of(QUOTE_REJECTED_EXCHANGE_SECURITY_CLOSED);
        }
        if (wire == 7103L) {
            return Optional.of(QUOTE_REJECTED_QUOTE_EXCEEDS_LIMIT);
        }
        if (wire == 7104L) {
            return Optional.of(QUOTE_REJECTED_TOO_LATE_TO_ENTER);
        }
        if (wire == 7105L) {
            return Optional.of(QUOTE_REJECTED_UNKNOWN_QUOTE);
        }
        if (wire == 7106L) {
            return Optional.of(QUOTE_REJECTED_DUPLICATE_QUOTE_IN_SAME_MESSAGE);
        }
        if (wire == 7107L) {
            return Optional.of(QUOTE_REJECTED_INVALID_BIDASK_SPREAD);
        }
        if (wire == 7108L) {
            return Optional.of(QUOTE_REJECTED_INVALID_PRICE);
        }
        if (wire == 7109L) {
            return Optional.of(QUOTE_REJECTED_NOT_AUTHORIZED_TO_QUOTE_THIS_INSTRUMENT);
        }
        if (wire == 7110L) {
            return Optional.of(QUOTE_REJECTED_RESTING_CANCELLED_TOO_MANY_REJECTS);
        }
        if (wire == 7111L) {
            return Optional.of(QUOTE_REJECTED_DUPLICATE_QUOTE_DIFFERENT_ID);
        }
        if (wire == 7112L) {
            return Optional.of(QUOTE_REJECTED_RESTING_CANCELLED_QUOTE_EXCEEDS_LIMIT);
        }
        if (wire == 7113L) {
            return Optional.of(QUOTE_REJECTED_RESTING_CANCELLED_DUPLICATE_QUOTE);
        }
        if (wire == 7114L) {
            return Optional.of(QUOTE_REJECTED_RESTING_CANCELLED_INVALID_BIDASK_SPREAD);
        }
        if (wire == 7115L) {
            return Optional.of(QUOTE_REJECTED_RESTING_CANCELLED_INVALID_PRICE);
        }
        if (wire == 7116L) {
            return Optional.of(QUOTE_REJECTED_RESTING_CANCELLED_NOT_AUTHORIZED_TO_QUOTE_THIS_INSTRUMENT);
        }
        if (wire == 7117L) {
            return Optional.of(QUOTE_REJECTED_UNSPECIFIED_REASON);
        }
        if (wire == 7118L) {
            return Optional.of(QUOTE_REJECTED_EXCHANGE_SECURITY_IS_IN_PRE_OPEN);
        }
        if (wire == 7119L) {
            return Optional.of(QUOTE_REJECTED_EXCHANGE_SECURITY_IS_IN_NO_CANCEL);
        }
        if (wire == 7120L) {
            return Optional.of(QUOTE_REJECTED_EXCHANGE_SECURITY_IS_RESERVED);
        }
        if (wire == 7121L) {
            return Optional.of(CONTRACT_NOT_ELIGIBLE_FOR_NEGOTIATED_QUOTE);
        }
        if (wire == 7122L) {
            return Optional.of(RLP_ORDER_REJECTED_PARTICIPANT_NOT_AUTHORIZED);
        }
        if (wire == 7123L) {
            return Optional.of(ATTEMPT_TO_MODIFY_THE_ORDER_TYPE_FROMTO_RLP);
        }
        if (wire == 7124L) {
            return Optional.of(INVALID_FIELD_FOR_ORDER_WITH_ORDER_TYPE_TAG_40_EQUALS_W_RLP);
        }
        if (wire == 7125L) {
            return Optional.of(RLP_ORDER_REJECTED_ONLY_ONE_ORDER_IS_ALLOWED_BY_FIRM_AND_SIDE);
        }
        if (wire == 7126L) {
            return Optional.of(INVALID_FIELD_FOR_ORDER_WITH_ROUTING_INSTRUCTION_TAG_35487_EQUALS_1_RETAIL_LIQUIDITY_TAKER);
        }
        if (wire == 7127L) {
            return Optional.of(INVALID_FIELD_FOR_ORDER_WITH_ORDER_TYPE_TAG_40_EQUALS_P_PEGGED);
        }
        if (wire == 7128L) {
            return Optional.of(QTY_IS_NOT_MULTIPLE_OF_MINIMUM_EXECUTION_QUANTITY_FOR_PEGGED_ORDER);
        }
        if (wire == 7129L) {
            return Optional.of(ACCOUNT_IS_MANDATORY_FOR_PEGGED_ORDER);
        }
        if (wire == 7130L) {
            return Optional.of(PEGGED_ORDER_CAN_NOT_BE_SENT_IN_NON_REGULAR_SESSION);
        }
        if (wire == 7131L) {
            return Optional.of(ATTEMPT_TO_MODIFY_THE_ORDER_TYPE_FROMTO_PEGGED);
        }
        if (wire == 7132L) {
            return Optional.of(ORDER_REJECTED_PEGGED_ORDERS_ARE_NOT_ALLOWED_FOR_THIS_CONTRACT);
        }
        if (wire == 7133L) {
            return Optional.of(ORDER_REJECTED_ROUTING_INSTRUCTION_TAG_35487_EQUALS_BROKER_ONLY_3_NOT_ALLOWED_FOR_THIS_GROUP);
        }
        if (wire == 7134L) {
            return Optional.of(ORDER_REJECTED_ONLY_PEGGED_ORDER_WITH_ROUTING_INSTRUCTION_TAG_35487_EQUALS_BROKER_ONLY_3_IS_ALLOWED_FOR_THIS_GROUP);
        }
        if (wire == 7135L) {
            return Optional.of(CROSS_ORDER_SUSPENDED_FOR_THE_PARTICIPANT_OR_SESSION);
        }
        if (wire == 7136L) {
            return Optional.of(ORDER_QUANTITY_IS_OUTSIDE_OF_THE_ALLOWABLE_RANGE_ORDER_QUANTITY_ORDERQTY_CONTRACT_MINIMUM_QUANTITY_FOR_CROSS_MINCROSSQTY);
        }
        if (wire == 7137L) {
            return Optional.of(BBT_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_PAUSED);
        }
        if (wire == 7138L) {
            return Optional.of(BBT_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_PRE_OPEN);
        }
        if (wire == 7139L) {
            return Optional.of(BBT_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_PCP);
        }
        if (wire == 7140L) {
            return Optional.of(BBT_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_NO_CANCEL);
        }
        if (wire == 7141L) {
            return Optional.of(BBT_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_RESERVED);
        }
        if (wire == 7142L) {
            return Optional.of(BBT_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_FORBIDDEN);
        }
        if (wire == 7143L) {
            return Optional.of(BBT_MESSAGES_SHOULD_NOT_BE_ENTERED_WHEN_MARKET_IS_PRE_CLOSE);
        }
        if (wire == 7144L) {
            return Optional.of(INVALID_FIELD_FOR_BBT_ORDER);
        }
        if (wire == 7145L) {
            return Optional.of(FOR_CANCEL_ON_BEHALF_MUST_BE_INFORMED_ONLY_THE_ACTIONTARGETSESSIONID_OR_THE_ACTIONTARGETGROUPID);
        }
        if (wire == 7146L) {
            return Optional.of(ACTIONTARGETGROUPID_INVALID_IT_DOESNT_EXIST_OR_IT_IS_DISABLED);
        }
        if (wire == 7147L) {
            return Optional.of(FIX_SESSION_IS_BLOCKED_DUE_TO_MASS_CANCEL);
        }
        if (wire == 7148L) {
            return Optional.of(ACTIONTARGETGROUPID_MUST_BE_INFORMED);
        }
        if (wire == 7149L) {
            return Optional.of(FIX_SESSION_DOESNT_BELONG_TO_THE_ACTIONTARGETGROUPID);
        }
        if (wire == 9999L) {
            return Optional.of(TECHNICAL_ERROR_FUNCTION_NOT_PERFORMED);
        }
        if (wire == 8006L) {
            return Optional.of(EXERCISE_PRICE_NOT_ALLOWED);
        }
        if (wire == 8007L) {
            return Optional.of(NO_POSITIONS_BLOCKED);
        }
        if (wire == 8008L) {
            return Optional.of(QUANTITY_DOESNT_MATCH_WITH_THE_ORIGINAL_REQUEST_QUANTITY_ON_ORIGINAL_REQUEST_QUANTITY_ON_ORIGINAL_REQUEST);
        }
        if (wire == 8011L) {
            return Optional.of(EXERCISE_MUST_BE_ON_MATURITY_DATE);
        }
        if (wire == 8014L) {
            return Optional.of(FUNCTION_NOT_AVAILABLE_THIS_TIME);
        }
        if (wire == 8015L) {
            return Optional.of(BLOCKING_QUANTITY_MORE_THAN_999999999);
        }
        if (wire == 8020L) {
            return Optional.of(TRADE_DOES_NOT_BELONG_TO_THE_SPECIFIED_FIRM_FIRM_ID_XXX);
        }
        if (wire == 8021L) {
            return Optional.of(BLOCKING_QTY_MORE_THAN_AVAILABLE_QUANTITY);
        }
        if (wire == 8022L) {
            return Optional.of(THERE_ARENT_POSITIONS_AVAILABLE_TO_EXERCISE);
        }
        if (wire == 8023L) {
            return Optional.of(TOTAL_QTY_MUST_BE_THE_SUM_OF_ALL_ALLOCQTY);
        }
        if (wire == 8024L) {
            return Optional.of(TRADE_ALREADY_CANCELLED_OR_DOES_NOT_EXIST_TRADE_ID_XXX);
        }
        if (wire == 8027L) {
            return Optional.of(AVAILABLE_QUANTITY_TO_BLOCK_IS_ZERO);
        }
        if (wire == 8028L) {
            return Optional.of(INVALID_OPERATION_FOR_CONTRACT_TYPE);
        }
        if (wire == 8036L) {
            return Optional.of(FUNCTION_CLOSED_OR_SUSPENDED);
        }
        if (wire == 8039L) {
            return Optional.of(EXERCISE_PRICE_OUTSIDE_REQUIRED_MONEYNESS);
        }
        if (wire == 8040L) {
            return Optional.of(INVALID_EXERCISE_REQUEST_ID_TO_CANCEL);
        }
        if (wire == 8059L) {
            return Optional.of(INVALID_BLOCKING_ID_TO_UNBLOCK);
        }
        if (wire == 8062L) {
            return Optional.of(INVALID_QUANTITY_TO_UNBLOCK);
        }
        if (wire == 8063L) {
            return Optional.of(ON_BEHALF_OPERATION_NOT_ALLOWED_DURING_CCR_RECOVERY);
        }
        if (wire == 8065L) {
            return Optional.of(PROBLEM_PARSING_INCOMING_MESSAGE);
        }
        if (wire == 8066L) {
            return Optional.of(EXERCISE_QUANTITY_SHOULD_BE_GREATER_THAN_ZERO);
        }
        if (wire == 30002L) {
            return Optional.of(SYSTEM_INITIALIZATION);
        }
        if (wire == 30003L) {
            return Optional.of(LINE_BUSY);
        }
        if (wire == 30004L) {
            return Optional.of(MESSAGE_OR_ATRIBUTES_ARE_INVALID);
        }
        if (wire == 30005L) {
            return Optional.of(INTERNAL_ERROR);
        }
        if (wire == 30006L) {
            return Optional.of(TIMEOUT_WAITING_RISK_EVALUATION);
        }
        if (wire == 30007L) {
            return Optional.of(TIMEOUT_WAITING_RISK_EVALUATION_LOW_PRIORITY);
        }
        if (wire == 30011L) {
            return Optional.of(BROKER_NEGOTIATION_BLOCKED_030011);
        }
        if (wire == 30012L) {
            return Optional.of(BROKER_NOT_AVAILABLE_030012);
        }
        if (wire == 30013L) {
            return Optional.of(BROKERS_CAPTURE_ACCOUNT_NOT_FOUND_030013);
        }
        if (wire == 30014L) {
            return Optional.of(BROKERS_SEGMENT_NEGOTIATION_BLOCKED_030014);
        }
        if (wire == 30015L) {
            return Optional.of(BROKER_SEGMENT_NOT_AVAILABLE_030015);
        }
        if (wire == 30016L) {
            return Optional.of(BROKERS_SEGMENT_PROTECTED_MODE_UNDER_ACTIVATION_030016);
        }
        if (wire == 30017L) {
            return Optional.of(BROKER_PN_NEGOTIATION_BLOCKED);
        }
        if (wire == 30018L) {
            return Optional.of(BROKER_PN_NOT_AVAILABLE);
        }
        if (wire == 30019L) {
            return Optional.of(BROKER_PN_PROTECTED_MODE_UNDER_ACTIVATION);
        }
        if (wire == 30021L) {
            return Optional.of(ACCOUNT_NEGOTIATION_BLOCKED_030021);
        }
        if (wire == 30022L) {
            return Optional.of(ACCOUNT_NOT_AVAILABLE_030022);
        }
        if (wire == 30023L) {
            return Optional.of(ACCOUNTS_PROTECTED_MODE_UNDER_ACTIVATION_030023);
        }
        if (wire == 30024L) {
            return Optional.of(ACCOUNT_MANDATORY_ON_DMA_ORDERS_030024);
        }
        if (wire == 30025L) {
            return Optional.of(TRANSIENT_ACCOUNT_IS_HIERARCHICALLY_BLOCKED_ON_PROTECTED_MODE_030025);
        }
        if (wire == 30026L) {
            return Optional.of(CROSSORDERS_OR_CROSSFORWARD_NOT_ALLOWED_WHILE_ACCOUNT_IN_PROTECTED_MODE_030026);
        }
        if (wire == 30027L) {
            return Optional.of(TRANSIENT_ACCOUNT_NOT_ALLOWED_IN_EXTENDED_HOURS_030027);
        }
        if (wire == 30031L) {
            return Optional.of(DOCUMENT_NEGOTIATION_BLOCKED_030031);
        }
        if (wire == 30032L) {
            return Optional.of(DOCUMENT_NOT_AVAILABLE_030032);
        }
        if (wire == 30033L) {
            return Optional.of(DOCUMENTS_PROTECTED_MODE_UNDER_ACTIVATION_030033);
        }
        if (wire == 30034L) {
            return Optional.of(EXECUTOR_DOCUMENT_CANNOT_USE_DEFAULT_BROKER_PROFILE_030034);
        }
        if (wire == 30035L) {
            return Optional.of(DOCUMENT_IN_BLOCKED_PROFILE_030035);
        }
        if (wire == 30036L) {
            return Optional.of(CROSSORDERS_OR_CROSSFORWARD_NOT_ALLOWED_WHILE_DOCUMENT_IN_PROTECTED_MODE_030036);
        }
        if (wire == 30041L) {
            return Optional.of(ENTERING_TRADER_NEGOTIATION_BLOCKED_030041);
        }
        if (wire == 30042L) {
            return Optional.of(ENTERING_TRADER_NOT_AVAILABLE_030042);
        }
        if (wire == 30043L) {
            return Optional.of(ENTERING_TRADER_BLOCKED_BY_SFD_OVERFLOW_030043);
        }
        if (wire == 30044L) {
            return Optional.of(NON_DMA_ORDERS_MUST_PROVIDE_ACCOUNT_WHILE_IN_BROKERS_PROTECTED_MODE_030044);
        }
        if (wire == 30045L) {
            return Optional.of(ENTERING_TRADER_NOT_AUTHORIZED_TO_TRADE_ACCOUNTLESS_ORDERS_030045);
        }
        if (wire == 30046L) {
            return Optional.of(ENTERING_TRADER_CANNOT_TRADE_ON_BEHALF_OF_OTHER_FIRMS_ACCOUNT_030046);
        }
        if (wire == 30050L) {
            return Optional.of(SYMBOL_NOT_AVAILABLE_030050);
        }
        if (wire == 30051L) {
            return Optional.of(SYMBOL_INTERNAL_DATA_CORRUPTED_030051);
        }
        if (wire == 30052L) {
            return Optional.of(FIX_MESSAGE_TYPE_DOES_NOT_SUPPORT_OPERATIONS_ON_SUCH_SYMBOL_030052);
        }
        if (wire == 30053L) {
            return Optional.of(SYMBOLS_UNDERLYING_NOT_FOUND_FOR_RISK_AGGREGATION_030053);
        }
        if (wire == 30054L) {
            return Optional.of(SYMBOLS_RISK_UNIT_MATRIX_NOT_AVAILABLE_030054);
        }
        if (wire == 30055L) {
            return Optional.of(SYMBOLS_REFERENCE_PRICE_MISSING_MARKET_ORDERS_NOT_ALLOWED_030055);
        }
        if (wire == 32056L) {
            return Optional.of(SYMBOLS_CALCULATED_PRICE_INVALID_032056);
        }
        if (wire == 30060L) {
            return Optional.of(SPREADS_LEG_NOT_AVAILABLE_030060);
        }
        if (wire == 30061L) {
            return Optional.of(SPREADS_LEG_INTERNAL_DATA_CORRUPTED_030061);
        }
        if (wire == 30070L) {
            return Optional.of(UNEXPECTED_INTERNAL_ERROR_DURING_RISK_EVALUATION_030070);
        }
        if (wire == 30113L) {
            return Optional.of(SFD_BROKER_PN_PN_DOCUMENT_AGGREGATION_DAY_TRADE_CASH_BALANCE_STOP_LOSS_NOT_CONFIGURED);
        }
        if (wire == 30114L) {
            return Optional.of(SDP_BROKER_PN_PN_DOCUMENT_AGGREGATION_ORDER_EXCEEDED_CASH_SETTLEMENT_EXPOSURE);
        }
        if (wire == 30115L) {
            return Optional.of(RMKT_BROKER_PN_PN_DOCUMENT_AGGREGATION_ORDER_QUANTITY_EXCEEDED_RISK_INCREASE);
        }
        if (wire == 30116L) {
            return Optional.of(SDP_BROKER_PN_PN_TRADER_AGGREGATION_ORDER_EXCEEDED_CASH_SETTLEMENT_EXPOSURE);
        }
        if (wire == 30117L) {
            return Optional.of(SPVD_BROKER_PN_PN_DOCUMENT_AGGREGATION_ORDER_EXCEEDED_POTENTIAL_SHORT_UNCOVERED_BALANCE);
        }
        if (wire == 30118L) {
            return Optional.of(SPVD_BROKER_PN_PN_TRADER_AGGREGATION_ORDER_EXCEEDED_POTENTIAL_SHORT_UNCOVERED_BALANCE);
        }
        if (wire == 30119L) {
            return Optional.of(RMSE_BROKER_PN_PN_DOCUMENT_AGGREGATION_ORDER_EXCEEDED_RISK_INCREASE_AT_EXTENDED_SESSION);
        }
        if (wire == 30166L) {
            return Optional.of(RMSE_BROKER_ORDER_EXCEEDED_RISK_INCREASE_AT_EXTENDED_SESSION);
        }
        if (wire == 30201L) {
            return Optional.of(MKTA_ACCOUNT_BUY_NOT_ALLOWED_FOR_SYMBOLS_MARKET_030201);
        }
        if (wire == 30202L) {
            return Optional.of(MKTA_ACCOUNT_SELL_NOT_ALLOWED_FOR_SYMBOLS_MARKET_030202);
        }
        if (wire == 30204L) {
            return Optional.of(TMOC_ACCOUNT_MAXIMUM_ORDER_SIZE_EXCEEDED_FOR_SINGLE_ORDER);
        }
        if (wire == 30205L) {
            return Optional.of(TMOV_ACCOUNT_MAXIMUM_ORDER_SIZE_EXCEEDED_FOR_SINGLE_ORDER);
        }
        if (wire == 30206L) {
            return Optional.of(SPCI_ACCOUNT_ORDER_QUANTITY_EXCEEDED_SHORT_POSITION_PER_INSTRUMENT);
        }
        if (wire == 30207L) {
            return Optional.of(SPVI_ACCOUNT_ORDER_QUANTITY_EXCEEDED_LONG_POSITION_PER_INSTRUMENT);
        }
        if (wire == 30208L) {
            return Optional.of(SDP_ACCOUNT_ORDER_EXCEEDED_CASH_SETTLEMENT_EXPOSURE);
        }
        if (wire == 30210L) {
            return Optional.of(RMKT_ACCOUNT_ORDER_QUANTITY_EXCEEDED_RISK_INCREASE);
        }
        if (wire == 30211L) {
            return Optional.of(IRMKT_ACCOUNT_ORDER_QUANTITY_EXCEEDED_RISK_INCREASE_REDUCING_MODE);
        }
        if (wire == 30212L) {
            return Optional.of(SPI_ACCOUNT_ORDER_QUANTITY_EXCEEDED_LONG_AND_SHORT_POSITION_REDUCING_MODE);
        }
        if (wire == 30213L) {
            return Optional.of(STD_ACCOUNT_TERMO_NOT_ALLOWED_PROTECTED_MODE_ENABLED_030213);
        }
        if (wire == 30215L) {
            return Optional.of(SPVD_ACCOUNT_ORDER_EXCEEDED_POTENTIAL_SHORT_UNCOVERED_BALANCE_030215);
        }
        if (wire == 30300L) {
            return Optional.of(MKTA_DOCUMENT_BUYSELL_SYMBOLS_MARKET_NOT_CONFIGURED_030300);
        }
        if (wire == 30301L) {
            return Optional.of(MKTA_DOCUMENT_BUY_NOT_ALLOWED_FOR_SYMBOLS_MARKET_030301);
        }
        if (wire == 30302L) {
            return Optional.of(MKTA_DOCUMENT_SELL_NOT_ALLOWED_FOR_SYMBOLS_MARKET_030302);
        }
        if (wire == 30303L) {
            return Optional.of(TMOX_DOCUMENT_MAX);
        }
        if (wire == 30304L) {
            return Optional.of(TMOC_DOCUMENT_MAX_BID_QUANTITY_EXCEEDED_FOR_SINGLE_ORDER);
        }
        if (wire == 30305L) {
            return Optional.of(TMOV_DOCUMENT_MAX_OFFER_QUANTITY_EXCEEDED_FOR_SINGLE_ORDER);
        }
        if (wire == 30306L) {
            return Optional.of(SPCI_DOCUMENT_ORDER_QUANTITY_EXCEEDED_MAX_BID_POTENTIAL_BALANCE);
        }
        if (wire == 30307L) {
            return Optional.of(SPVI_DOCUMENT_ORDER_QUANTITY_EXCEEDED_MAX_OFFER_POTENTIAL_BALANCE);
        }
        if (wire == 30308L) {
            return Optional.of(SDP_DOCUMENT_ORDER_EXCEEDED_MAX_FINANCIAL_POTENTIAL_BALANCE_DUE);
        }
        if (wire == 30309L) {
            return Optional.of(STD_DOCUMENT_ORDER_QUANTITY_EXCEEDED_MAX_OPERATIONS_FORWARD_BALANCE);
        }
        if (wire == 30310L) {
            return Optional.of(RMKT);
        }
        if (wire == 30311L) {
            return Optional.of(IRMKT_DOCUMENT_ORDER_QUANTITY_EXCEEDED_MAX_INCREMENTAL_MARKET_RISK);
        }
        if (wire == 30312L) {
            return Optional.of(SPI_DOCUMENT_ORDER_QUANTITY_EXCEEDED_PREVIOUS_POTENCIAL_BALANCE);
        }
        if (wire == 30313L) {
            return Optional.of(STD_DOCUMENT_TERMO_NOT_ALLOWED);
        }
        if (wire == 30314L) {
            return Optional.of(SFD_DOCUMENT_DAY_TRADE_CASH_BALANCE_STOP_LOSS_NOT_CONFIGURED_030314);
        }
        if (wire == 30315L) {
            return Optional.of(SPVD_DOCUMENT_ORDER_EXCEEDED_POTENTIAL_SHORT_UNCOVERED_BALANCE_030315);
        }
        if (wire == 30316L) {
            return Optional.of(RMSE_DOCUMENT_ORDER_EXCEEDED_RISK_INCREASE_AT_EXTENDED_SESSION_030316);
        }
        if (wire == 30317L) {
            return Optional.of(RMSE_DOCUMENT_ORDER_EXCEEDED_RISK_INCREASE_OF_BROKER_AT_EXTENDED_SESSION_030317);
        }
        if (wire == 30400L) {
            return Optional.of(MKTA_ENTERING_TRADER_BUYSELL_SYMBOLS_MARKET_NOT_CONFIGURED_030400);
        }
        if (wire == 30401L) {
            return Optional.of(MKTA_ENTERING_TRADER_BUY_NOT_ALLOWED_FOR_SYMBOLS_MARKET_030401);
        }
        if (wire == 30402L) {
            return Optional.of(MKTA_ENTERING);
        }
        if (wire == 30403L) {
            return Optional.of(TMOX_ENTERING_TRADER_MAX_BIDOFFER_QUANTITY_NOT_CONFIGURED);
        }
        if (wire == 30404L) {
            return Optional.of(TMOC_ENTERING_TRADER_MAX_BID_QUANTITY_EXCEEDED_FOR_SINGLE_ORDER);
        }
        if (wire == 30405L) {
            return Optional.of(TMOV_ENTERING_TRADER_MAX_OFFER_QUANTITY_EXCEEDED_FOR_SI);
        }
        if (wire == 30406L) {
            return Optional.of(SPCI_ENTERING_TRADER_ORDER_QUANTITY_EXCEEDED_MAX_BID_POTENTIAL_BALANCE);
        }
        if (wire == 30407L) {
            return Optional.of(SPVI_ENTERING_TRADER_ORDER_QUANTITY_EXCEEDED_MAX_OFFER_POTENTIAL_BALANCE);
        }
        if (wire == 30408L) {
            return Optional.of(SDP_ENTERING_TRADER_ORDER_EXCEEDED_MAX_FINANCIAL_POTENTIAL);
        }
        if (wire == 30415L) {
            return Optional.of(SPVD_TRADER_ORDER_EXCEEDED_POTENTIAL_SHORT_UNCOVERED_BALANCE);
        }
        if (wire == 30500L) {
            return Optional.of(OMS_UNEXPECTED_INTERNAL_ERROR_030500);
        }
        if (wire == 30501L) {
            return Optional.of(OMS_INVALID_SESSION_OR_SYMBOL_030501);
        }
        if (wire == 30502L) {
            return Optional.of(OMS_CLORDID_CANNOT_BE_EMPTY_030502);
        }
        if (wire == 30503L) {
            return Optional.of(OMS_CLORDID_IS_DUPLICATED_030503);
        }
        if (wire == 30504L) {
            return Optional.of(OMS_CLORDID_NOT_FOUND_030504);
        }
        if (wire == 30505L) {
            return Optional.of(OMS_ORIGCLORDID_CANNOT_BE_EMPTY_030505);
        }
        if (wire == 30506L) {
            return Optional.of(OMS_CROSSID_CANNOT_BE_EMPTY_030506);
        }
        if (wire == 30507L) {
            return Optional.of(OMS_CLORDID_IS_DUPLICATED_WITHIN_CROSS_ORDER_030507);
        }
        if (wire == 30508L) {
            return Optional.of(OMS_CROSS_ORDER_MODIFICATION_IS_NOT_ALLOWED_030508);
        }
        if (wire == 30509L) {
            return Optional.of(OMS_ORDERID_NOT_FOUND_030509);
        }
        if (wire == 30510L) {
            return Optional.of(OMS_ORDERID_CANNOT_BE_EMPTY_030510);
        }
        if (wire == 30511L) {
            return Optional.of(OMS_QUOTEREQID_CANNOT_BE_EMPTY_030511);
        }
        if (wire == 30512L) {
            return Optional.of(OMS_QUOTEREQID_IS_DUPLICATED_030512);
        }
        if (wire == 30513L) {
            return Optional.of(OMS_QUOTEREQID_NOT_FOUND_030513);
        }
        if (wire == 30514L) {
            return Optional.of(OMS_QUOTEID_CANNOT_BE_EMPTY_030514);
        }
        if (wire == 30521L) {
            return Optional.of(OMS_IN);
        }
        if (wire == 30522L) {
            return Optional.of(OMS);
        }
        if (wire == 30523L) {
            return Optional.of(OMS_ENTERING_FIRM_MODIFICATION_IS_NOT_ALLOWED_030523);
        }
        if (wire == 30524L) {
            return Optional.of(OMS_ACCOUNT_MODIFICATION_ON_DMA_ORDER_IS_NOT_ALLOWED_030524);
        }
        if (wire == 30525L) {
            return Optional.of(OMS_ACCOUNT_INFORMATION_MISSING_ON_NON);
        }
        if (wire == 30526L) {
            return Optional.of(OMS_ENTERING_TRADER);
        }
        if (wire == 30527L) {
            return Optional.of(OMS_RECEIVED_EXECUTION_REPORT_REJECTION_FOR_AN_ACTIVE_ORDER_030527);
        }
        if (wire == 31011L) {
            return Optional.of(BROKER_NEGOTIATION_BLOCKED_031011);
        }
        if (wire == 31012L) {
            return Optional.of(BROKER_NOT_AVAILABLE_031012);
        }
        if (wire == 31013L) {
            return Optional.of(BROKERS_CAPTURE_ACCOUNT_NOT_FOUND_031013);
        }
        if (wire == 31014L) {
            return Optional.of(BROKERS_SEGMENT_NEGOTIATION_BLOCKED_031014);
        }
        if (wire == 31015L) {
            return Optional.of(BROKER_SEGMENT_NOT_AVAILABLE_031015);
        }
        if (wire == 31016L) {
            return Optional.of(BROKERS_SEGMENT_PROTECTED_MODE_UNDER_ACTIVATION_031016);
        }
        if (wire == 31021L) {
            return Optional.of(ACCOUNT_NEGOTIATION_BLOCKED_031021);
        }
        if (wire == 31022L) {
            return Optional.of(ACCOUNT_NOT_AVAILABLE_031022);
        }
        if (wire == 31023L) {
            return Optional.of(ACCOUNTS_PROTECTED_MODE_UNDER_ACTIVATION_031023);
        }
        if (wire == 31024L) {
            return Optional.of(ACCOUNT_MANDATORY_ON_DMA_ORDERS_031024);
        }
        if (wire == 31025L) {
            return Optional.of(TRANSIENT_ACCOUNT_IS_HIERARCHICALLY_BLOCKED_ON_PROTECTED_MODE_031025);
        }
        if (wire == 31026L) {
            return Optional.of(CROSSORDERS_OR_CROSSFORWARD_NOT_ALLOWED_WHILE_ACCOUNT_IN_PROTECTED_MODE_031026);
        }
        if (wire == 31027L) {
            return Optional.of(TRANSIENT_ACCOUNT_NOT_ALLOWED_IN_EXTENDED_HOURS_031027);
        }
        if (wire == 31031L) {
            return Optional.of(DOCUMENT_NEGOTIATION_BLOCKED_031031);
        }
        if (wire == 31032L) {
            return Optional.of(DOCUMENT_NOT_AVAILABLE_031032);
        }
        if (wire == 31033L) {
            return Optional.of(DOCUMENTS_PROTECTED_MODE_UNDER_ACTIVATION_031033);
        }
        if (wire == 31034L) {
            return Optional.of(EXECUTOR_DOCUMENT_CANNOT_USE_DEFAULT_BROKER_PROFILE_031034);
        }
        if (wire == 31035L) {
            return Optional.of(DOCUMENT_IN_BLOCKED_PROFILE_031035);
        }
        if (wire == 31036L) {
            return Optional.of(CROSSORDERS_OR_CROSSFORWARD_NOT_ALLOWED_WHILE_DOCUMENT_IN_PROTECTED_MODE_031036);
        }
        if (wire == 31041L) {
            return Optional.of(ENTERING_TRADER_NEGOTIATION_BLOCKED_031041);
        }
        if (wire == 31042L) {
            return Optional.of(ENTERING_TRADER_NOT_AVAILABLE_031042);
        }
        if (wire == 31043L) {
            return Optional.of(ENTERING_TRADER_BLOCKED_BY_SFD_OVERFLOW_031043);
        }
        if (wire == 31044L) {
            return Optional.of(NON_DMA_ORDERS_MUST_PROVIDE_ACCOUNT_WHILE_IN_BROKERS_PROTECTED_MODE_031044);
        }
        if (wire == 31045L) {
            return Optional.of(ENTERING_TRADER_NOT_AUTHORIZED_TO_TRADE_ACCOUNTLESS_ORDERS_031045);
        }
        if (wire == 31046L) {
            return Optional.of(ENTERING_TRADER_CANNOT_TRADE_ON_BEHALF_OF_OTHER_FIRMS_ACCOUNT_031046);
        }
        if (wire == 31050L) {
            return Optional.of(SYMBOL_NOT_AVAILABLE_031050);
        }
        if (wire == 31051L) {
            return Optional.of(SYMBOL_INTERNAL_DATA_CORRUPTED_031051);
        }
        if (wire == 31052L) {
            return Optional.of(FIX_MESSAGE_TYPE_DOES_NOT_SUPPORT_OPERATIONS_ON_SUCH_SYMBOL_031052);
        }
        if (wire == 31053L) {
            return Optional.of(SYMBOLS_UNDERLYING_NOT_FOUND_FOR_RISK_AGGREGATION_031053);
        }
        if (wire == 31054L) {
            return Optional.of(SYMBOLS_RISK_UNIT_MATRIX_NOT_AVAILABLE_031054);
        }
        if (wire == 31055L) {
            return Optional.of(SYMBOLS_REFERENCE_PRICE_MISSING_MARKET_ORDERS_NOT_ALLOWED_031055);
        }
        if (wire == 31056L) {
            return Optional.of(SYMBOLS_CALCULATED_PRICE_INVALID_031056);
        }
        if (wire == 31060L) {
            return Optional.of(SPREADS_LEG_NOT_AVAILABLE_031060);
        }
        if (wire == 31061L) {
            return Optional.of(SPREADS_LEG_INTERNAL_DATA_CORRUPTED_031061);
        }
        if (wire == 31070L) {
            return Optional.of(UNEXPECTED_INTERNAL_ERROR_DURING_RISK_EVALUATION_031070);
        }
        if (wire == 31201L) {
            return Optional.of(MKTA_ACCOUNT_BUY_NOT_ALLOWED_FOR_SYMBOLS_MARKET_031201);
        }
        if (wire == 31202L) {
            return Optional.of(MKTA_ACCOUNT_SELL_NOT_ALLOWED_FOR_SYMBOLS_MARKET_031202);
        }
        if (wire == 31204L) {
            return Optional.of(TMOC_ACCOUNT_MAX_BID_QUANTITY_EXCEEDED_FOR_SINGLE_ORDER);
        }
        if (wire == 31205L) {
            return Optional.of(TMOV_ACCOUNT_MAX_OFFER_QUANTITY_EXCEEDED_FOR_SINGLE_ORDER);
        }
        if (wire == 31206L) {
            return Optional.of(SPCI_ACCOUNT_ORDER_QUANTITY_EXCEEDED_MAX_BID_POTENTIAL_BALANCE);
        }
        if (wire == 31207L) {
            return Optional.of(SPVI_ACCOUNT_ORDER_QUANTITY_EXCEEDED_MAX_OFFER_POTENTIAL_BALANCE);
        }
        if (wire == 31208L) {
            return Optional.of(SDP_ACCOUNT_ORDER_EXCEEDED_MAX_FINANCIAL_POTENTIAL_BALANCE_DUE);
        }
        if (wire == 31210L) {
            return Optional.of(RMKT_ACCOUNT_ORDER_QUANTITY_EXCEEDED_MAX_MARKET_RISK);
        }
        if (wire == 31211L) {
            return Optional.of(IRMKT_ACCOUNT_ORDER_QUANTITY_EXCEEDED_MAX_INCREMENTAL_MARKET_RISK);
        }
        if (wire == 31212L) {
            return Optional.of(SPI_ACCOUNT_ORDER_QUANTITY_EXCEEDED_PREVIOUS_POTENCIAL_BALANCE);
        }
        if (wire == 31213L) {
            return Optional.of(STD_ACCOUNT_TERMO_NOT_ALLOWED_PROTECTED_MODE_ENABLED_031213);
        }
        if (wire == 31215L) {
            return Optional.of(SPVD_ACCOUNT_ORDER_EXCEEDED_POTENTIAL_SHORT_UNCOVERED_BALANCE_031215);
        }
        if (wire == 31300L) {
            return Optional.of(MKTA_DOCUMENT_BUYSELL_SYMBOLS_MARKET_NOT_CONFIGURED_031300);
        }
        if (wire == 31301L) {
            return Optional.of(MKTA_DOCUMENT_BUY_NOT_ALLOWED_FOR_SYMBOLS_MARKET_031301);
        }
        if (wire == 31302L) {
            return Optional.of(MKTA_DOCUMENT_SELL_NOT_ALLOWED_FOR_SYMBOLS_MARKET_031302);
        }
        if (wire == 31303L) {
            return Optional.of(TMOX_DOCUMENT_MAXIMUM_ORDER_SIZE_NOT_CONFIGURED);
        }
        if (wire == 31304L) {
            return Optional.of(TMOC_DOCUMENT_MAXIMUM_ORDER_SIZE_EXCEEDED_FOR_SINGLE_ORDER);
        }
        if (wire == 31305L) {
            return Optional.of(TMOV_DOCUMENT_MAXIMUM_ORDER_SIZE_EXCEEDED_FOR_SINGLE_ORDER);
        }
        if (wire == 31306L) {
            return Optional.of(SPCI_DOCUMENT_ORDER_QUANTITY_EXCEEDED_SHORT_POSITION_PER_INSTRUMENT);
        }
        if (wire == 31307L) {
            return Optional.of(SPVI_DOCUMENT_ORDER_QUANTITY_EXCEEDED_LONG_POSITION_PER_INSTRUMENT);
        }
        if (wire == 31308L) {
            return Optional.of(SDP_DOCUMENT_ORDER_EXCEEDED_CASH_SETTLEMENT_EXPOSURE);
        }
        if (wire == 31309L) {
            return Optional.of(STD_DOCUMENT_ORDER_QUANTITY_EXCEEDED_FORWARD_CONTRACTS_EXPOSURE);
        }
        if (wire == 31310L) {
            return Optional.of(RMKT_DOCUMENT_ORDER_QUANTITY_EXCEEDED_RISK_INCREASE);
        }
        if (wire == 31311L) {
            return Optional.of(IRMKT_DOCUMENT_ORDER_QUANTITY_EXCEEDED_RISK_INCREASE_REDUCING_MODE);
        }
        if (wire == 31312L) {
            return Optional.of(SPI_DOCUMENT_ORDER_QUANTITY_EXCEEDED_LONG_AND_SHORT_POSITION_REDUCING_MODE);
        }
        if (wire == 31313L) {
            return Optional.of(STD_DOCUMENT_TERMO_NOT_ALLOWED_PROTECTED_MODE_ENABLED);
        }
        if (wire == 31314L) {
            return Optional.of(SFD_DOCUMENT_DAY_TRADE_CASH_BALANCE_STOP_LOSS_NOT_CONFIGURED_031314);
        }
        if (wire == 31315L) {
            return Optional.of(SPVD_DOCUMENT_ORDER_EXCEEDED_POTENTIAL_SHORT_UNCOVERED_BALANCE_031315);
        }
        if (wire == 31316L) {
            return Optional.of(RMSE_DOCUMENT_ORDER_EXCEEDED_RISK_INCREASE_AT_EXTENDED_SESSION_031316);
        }
        if (wire == 31317L) {
            return Optional.of(RMSE_DOCUMENT_ORDER_EXCEEDED_RISK_INCREASE_OF_BROKER_AT_EXTENDED_SESSION_031317);
        }
        if (wire == 31400L) {
            return Optional.of(MKTA_ENTERING_TRADER_BUYSELL_SYMBOLS_MARKET_NOT_CONFIGURED_031400);
        }
        if (wire == 31401L) {
            return Optional.of(MKTA_ENTERING_TRADER_BUY_NOT_ALLOWED_FOR_SYMBOLS_MARKET_031401);
        }
        if (wire == 31402L) {
            return Optional.of(MKTA_ENTERING_TRADER_SELL_NOT_ALLOWED_FOR_SYMBOLS_MARKET);
        }
        if (wire == 31403L) {
            return Optional.of(TMOX_ENTERING_TRADER_MAXIMUM_ORDER_SIZE_NOT_CONFIGURED);
        }
        if (wire == 31404L) {
            return Optional.of(TMOC_ENTERING_TRADER_MAXIMUM_ORDER_SIZE_EXCEEDED_FOR_SINGLE_ORDER);
        }
        if (wire == 31405L) {
            return Optional.of(TMOV_ENTERING_TRADER_MAXIMUM_ORDER_SIZE_EXCEEDED_FOR_SINGLE_ORDER);
        }
        if (wire == 31406L) {
            return Optional.of(SPCI_ENTERING_TRADER_ORDER_QUANTITY_EXCEEDED_SHORT_POSITION_PER_INSTRUMENT);
        }
        if (wire == 31407L) {
            return Optional.of(SPVI_ENTERING_TRADER_ORDER_QUANTITY_EXCEEDED_LONG_POSITION_PER_INSTRUMENT);
        }
        if (wire == 31408L) {
            return Optional.of(SDP_ENTERING_TRADER_ORDER_EXCEEDED_CASH_SETTLEMENT_EXPOSURE);
        }
        if (wire == 31500L) {
            return Optional.of(OMS_UNEXPECTED_INTERNAL_ERROR_031500);
        }
        if (wire == 31501L) {
            return Optional.of(OMS_INVALID_SESSION_OR_SYMBOL_031501);
        }
        if (wire == 31502L) {
            return Optional.of(OMS_CLORDID_CANNOT_BE_EMPTY_031502);
        }
        if (wire == 31503L) {
            return Optional.of(OMS_CLORDID_IS_DUPLICATED_031503);
        }
        if (wire == 31504L) {
            return Optional.of(OMS_CLORDID_NOT_FOUND_031504);
        }
        if (wire == 31505L) {
            return Optional.of(OMS_ORIGCLORDID_CANNOT_BE_EMPTY_031505);
        }
        if (wire == 31506L) {
            return Optional.of(OMS_CROSSID_CANNOT_BE_EMPTY_031506);
        }
        if (wire == 31507L) {
            return Optional.of(OMS_CLORDID_IS_DUPLICATED_WITHIN_CROSS_ORDER_031507);
        }
        if (wire == 31508L) {
            return Optional.of(OMS_CROSS_ORDER_MODIFICATION_IS_NOT_ALLOWED_031508);
        }
        if (wire == 31509L) {
            return Optional.of(OMS_ORDERID_NOT_FOUND_031509);
        }
        if (wire == 31510L) {
            return Optional.of(OMS_ORDERID_CANNOT_BE_EMPTY_031510);
        }
        if (wire == 31511L) {
            return Optional.of(OMS_QUOTEREQID_CANNOT_BE_EMPTY_031511);
        }
        if (wire == 31512L) {
            return Optional.of(OMS_QUOTEREQID_IS_DUPLICATED_031512);
        }
        if (wire == 31513L) {
            return Optional.of(OMS_QUOTEREQID_NOT_FOUND_031513);
        }
        if (wire == 31514L) {
            return Optional.of(OMS_QUOTEID_CANNOT_BE_EMPTY_031514);
        }
        if (wire == 31521L) {
            return Optional.of(OMS_INFLIGHT_MODIFICATION_IS_NOT_ALLOWED);
        }
        if (wire == 31522L) {
            return Optional.of(OMS_SIDE_MODIFICATION_IS_NOT_ALLOWED);
        }
        if (wire == 31523L) {
            return Optional.of(OMS_ENTERING_FIRM_MODIFICATION_IS_NOT_ALLOWED_031523);
        }
        if (wire == 31524L) {
            return Optional.of(OMS_ACCOUNT_MODIFICATION_ON_DMA_ORDER_IS_NOT_ALLOWED_031524);
        }
        if (wire == 31525L) {
            return Optional.of(OMS_ACCOUNT_INFORMATION_MISSING_ON_NONDMA_ORDER);
        }
        if (wire == 31526L) {
            return Optional.of(OMS_ENTERING_TRADER_MODIFICATION_ON_NONDMA_ORDER_IS_NOT_ALLOWED);
        }
        if (wire == 31527L) {
            return Optional.of(OMS_RECEIVED_EXECUTION_REPORT_REJECTION_FOR_AN_ACTIVE_ORDER_031527);
        }
        if (wire == 32000L) {
            return Optional.of(FIELD_MISSING_OR_INCORRECT_032000);
        }
        if (wire == 32001L) {
            return Optional.of(LINE_NOT_AVAILABLE_OR_BUSY);
        }
        if (wire == 32002L) {
            return Optional.of(LINE_INTERNAL_ERROR);
        }
        if (wire == 32003L) {
            return Optional.of(LINE_RECOVERING_OR_STARTING_UP);
        }
        if (wire == 32004L) {
            return Optional.of(INTERNAL_GATEWAY_ERROR_MESSAGE_FORWARDING_FAILURE);
        }
        if (wire == 32005L) {
            return Optional.of(INVALID_QUANTITY);
        }
        if (wire == 32006L) {
            return Optional.of(DUPLICATE_ORDER);
        }
        if (wire == 32007L) {
            return Optional.of(MISSING_ACCOUNT_FIELD);
        }
        if (wire == 32008L) {
            return Optional.of(UNKNOWN_ACCOUNT);
        }
        if (wire == 32009L) {
            return Optional.of(UNKNOWN_FIRMID_FOR_ROUTING);
        }
        if (wire == 32010L) {
            return Optional.of(DUPLICATE_FIRMID);
        }
        if (wire == 32011L) {
            return Optional.of(DUPLICATE_SENDER_LOCATION);
        }
        if (wire == 32012L) {
            return Optional.of(DUPLICATE_ENTERING_TRADER);
        }
        if (wire == 32013L) {
            return Optional.of(FIRM_OR_TRADER_IS_MISSING_IN_NONDMA_ORDER);
        }
        if (wire == 32014L) {
            return Optional.of(FIRM_OR_ACCOUNT_IS_MISSING_IN_DMA_ORDER);
        }
        if (wire == 32015L) {
            return Optional.of(SAME_PARTICIPANTS_ON_BOTH_SIDES_OR_INVALID_SIDES);
        }
        if (wire == 32016L) {
            return Optional.of(BUY_SIDE_AND_SELL_SIDE_HAVING_DIFFERENT_FIRMIDS);
        }
        if (wire == 32017L) {
            return Optional.of(BUY_SIDE_AND_SELL_SIDE_TRADING_DIFFERENT_ASSETS);
        }
        if (wire == 32018L) {
            return Optional.of(INVALID_PRICE_032018);
        }
        if (wire == 32019L) {
            return Optional.of(LINE_OVERLOADED);
        }
        if (wire == 32020L) {
            return Optional.of(LINE_ADMINISTRATIVELY_BLOCKED);
        }
        if (wire == 32021L) {
            return Optional.of(INVALID_PRICE_032021);
        }
        if (wire == 32022L) {
            return Optional.of(SYSTEM_OVERLOADED);
        }
        if (wire == 32023L) {
            return Optional.of(SYSTEM_ERROR_032023);
        }
        if (wire == 33000L) {
            return Optional.of(THROTTLE_LIMIT_REACHED);
        }
        if (wire == 33001L) {
            return Optional.of(INVALID_SECURITY_ID);
        }
        if (wire == 33002L) {
            return Optional.of(UNKNOWN_MARKET_SEGMENT_ID);
        }
        if (wire == 33003L) {
            return Optional.of(FIELD_MISSING_OR_INCORRECT_033003);
        }
        if (wire == 33050L) {
            return Optional.of(SYSTEM_ERROR_033050);
        }
        return Optional.empty();
    }
}
