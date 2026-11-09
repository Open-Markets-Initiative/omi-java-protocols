package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.enums;

import java.util.Optional;

/**
 * Matching engine reason code qualifying the event that produced the message.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum ReasonCode {

    /**
     * Ok
     */
    OK(0, "Ok"),

    /**
     * Invalid Sender Comp Id
     */
    INVALID_SENDER_COMP_ID(1, "Invalid Sender Comp Id"),

    /**
     * Invalid Sender Sub Id
     */
    INVALID_SENDER_SUB_ID(2, "Invalid Sender Sub Id"),

    /**
     * Invalid Sending Time
     */
    INVALID_SENDING_TIME(3, "Invalid Sending Time"),

    /**
     * Invalid Target Comp Id
     */
    INVALID_TARGET_COMP_ID(4, "Invalid Target Comp Id"),

    /**
     * Invalid Target Sub Id
     */
    INVALID_TARGET_SUB_ID(5, "Invalid Target Sub Id"),

    /**
     * Invalid On Behalf Of Comp Id
     */
    INVALID_ON_BEHALF_OF_COMP_ID(6, "Invalid On Behalf Of Comp Id"),

    /**
     * Invalid On Behalf Of Sub Id
     */
    INVALID_ON_BEHALF_OF_SUB_ID(7, "Invalid On Behalf Of Sub Id"),

    /**
     * Invalid Deliver To Comp Id
     */
    INVALID_DELIVER_TO_COMP_ID(8, "Invalid Deliver To Comp Id"),

    /**
     * Invalid Deliver To Sub Id
     */
    INVALID_DELIVER_TO_SUB_ID(9, "Invalid Deliver To Sub Id"),

    /**
     * Invalid Account
     */
    INVALID_ACCOUNT(10, "Invalid Account"),

    /**
     * Invalid Cl Ord Id
     */
    INVALID_CL_ORD_ID(11, "Invalid Cl Ord Id"),

    /**
     * Invalid Exec Inst
     */
    INVALID_EXEC_INST(12, "Invalid Exec Inst"),

    /**
     * Invalid Id Source
     */
    INVALID_ID_SOURCE(13, "Invalid Id Source"),

    /**
     * Invalid Order Qty
     */
    INVALID_ORDER_QTY(14, "Invalid Order Qty"),

    /**
     * Invalid Ord Type
     */
    INVALID_ORD_TYPE(15, "Invalid Ord Type"),

    /**
     * Invalid Price
     */
    INVALID_PRICE(16, "Invalid Price"),

    /**
     * Invalid Order Capacity
     */
    INVALID_ORDER_CAPACITY(17, "Invalid Order Capacity"),

    /**
     * Invalid Security Id
     */
    INVALID_SECURITY_ID(18, "Invalid Security Id"),

    /**
     * Invalid Side
     */
    INVALID_SIDE(19, "Invalid Side"),

    /**
     * Invalid Symbol Series
     */
    INVALID_SYMBOL_SERIES(20, "Invalid Symbol Series"),

    /**
     * Invalid Text
     */
    INVALID_TEXT(21, "Invalid Text"),

    /**
     * Invalid Time In Force
     */
    INVALID_TIME_IN_FORCE(22, "Invalid Time In Force"),

    /**
     * Invalid Settlement Type
     */
    INVALID_SETTLEMENT_TYPE(23, "Invalid Settlement Type"),

    /**
     * Invalid Fut Sett Date
     */
    INVALID_FUT_SETT_DATE(24, "Invalid Fut Sett Date"),

    /**
     * Invalid Symbol Sfx
     */
    INVALID_SYMBOL_SFX(25, "Invalid Symbol Sfx"),

    /**
     * Invalid Open Close
     */
    INVALID_OPEN_CLOSE(26, "Invalid Open Close"),

    /**
     * Invalid Stop Px
     */
    INVALID_STOP_PX(27, "Invalid Stop Px"),

    /**
     * Invalid Client Id
     */
    INVALID_CLIENT_ID(28, "Invalid Client Id"),

    /**
     * Invalid Min Qty
     */
    INVALID_MIN_QTY(29, "Invalid Min Qty"),

    /**
     * Invalid Max Floor
     */
    INVALID_MAX_FLOOR(30, "Invalid Max Floor"),

    /**
     * Invalid Locate Reqd
     */
    INVALID_LOCATE_REQD(31, "Invalid Locate Reqd"),

    /**
     * Invalid Expire Time
     */
    INVALID_EXPIRE_TIME(32, "Invalid Expire Time"),

    /**
     * Invalid Security Type
     */
    INVALID_SECURITY_TYPE(33, "Invalid Security Type"),

    /**
     * Invalid Maturity Month Year
     */
    INVALID_MATURITY_MONTH_YEAR(34, "Invalid Maturity Month Year"),

    /**
     * Invalid Put Or Call
     */
    INVALID_PUT_OR_CALL(35, "Invalid Put Or Call"),

    /**
     * Invalid Strike Price
     */
    INVALID_STRIKE_PRICE(36, "Invalid Strike Price"),

    /**
     * Invalid Covered Or Uncovered
     */
    INVALID_COVERED_OR_UNCOVERED(37, "Invalid Covered Or Uncovered"),

    /**
     * Invalid Customer Or Firm
     */
    INVALID_CUSTOMER_OR_FIRM(38, "Invalid Customer Or Firm"),

    /**
     * Invalid Maturity Day
     */
    INVALID_MATURITY_DAY(39, "Invalid Maturity Day"),

    /**
     * Invalid Peg Difference
     */
    INVALID_PEG_DIFFERENCE(40, "Invalid Peg Difference"),

    /**
     * Invalid Sellers Days
     */
    INVALID_SELLERS_DAYS(41, "Invalid Sellers Days"),

    /**
     * Invalid Trading Session Id
     */
    INVALID_TRADING_SESSION_ID(42, "Invalid Trading Session Id"),

    /**
     * Invalid No Trading Sessions
     */
    INVALID_NO_TRADING_SESSIONS(43, "Invalid No Trading Sessions"),

    /**
     * Invalid Discretion Inst
     */
    INVALID_DISCRETION_INST(44, "Invalid Discretion Inst"),

    /**
     * Invalid Discretion Offset
     */
    INVALID_DISCRETION_OFFSET(45, "Invalid Discretion Offset"),

    /**
     * Invalid Price Type
     */
    INVALID_PRICE_TYPE(46, "Invalid Price Type"),

    /**
     * Invalid Clearing Firm
     */
    INVALID_CLEARING_FIRM(47, "Invalid Clearing Firm"),

    /**
     * Invalid Clearing Account
     */
    INVALID_CLEARING_ACCOUNT(48, "Invalid Clearing Account"),

    /**
     * Invalid Party Id
     */
    INVALID_PARTY_ID(49, "Invalid Party Id"),

    /**
     * Invalid Optional Data
     */
    INVALID_OPTIONAL_DATA(50, "Invalid Optional Data"),

    /**
     * Invalid Cross Id
     */
    INVALID_CROSS_ID(51, "Invalid Cross Id"),

    /**
     * Invalid Strategy Indicator
     */
    INVALID_STRATEGY_INDICATOR(52, "Invalid Strategy Indicator"),

    /**
     * Invalid Trade Id
     */
    INVALID_TRADE_ID(53, "Invalid Trade Id"),

    /**
     * Invalid No Self Trade
     */
    INVALID_NO_SELF_TRADE(54, "Invalid No Self Trade"),

    /**
     * Invalid Cap Strategy
     */
    INVALID_CAP_STRATEGY(55, "Invalid Cap Strategy"),

    /**
     * Invalid Special Ord Type
     */
    INVALID_SPECIAL_ORD_TYPE(56, "Invalid Special Ord Type"),

    /**
     * Invalid Routing Inst
     */
    INVALID_ROUTING_INST(57, "Invalid Routing Inst"),

    /**
     * Invalid Offset Price
     */
    INVALID_OFFSET_PRICE(58, "Invalid Offset Price"),

    /**
     * Invalid Extended Exec Inst
     */
    INVALID_EXTENDED_EXEC_INST(59, "Invalid Extended Exec Inst"),

    /**
     * Invalid Introducing Badge Id
     */
    INVALID_INTRODUCING_BADGE_ID(60, "Invalid Introducing Badge Id"),

    /**
     * Invalid Bill To
     */
    INVALID_BILL_TO(61, "Invalid Bill To"),

    /**
     * Invalid Parent Firm Cl Ord Id
     */
    INVALID_PARENT_FIRM_CL_ORD_ID(62, "Invalid Parent Firm Cl Ord Id"),

    /**
     * Invalid Parent Firm Exchange Ord Id
     */
    INVALID_PARENT_FIRM_EXCHANGE_ORD_ID(63, "Invalid Parent Firm Exchange Ord Id"),

    /**
     * Invalid Parent Firm
     */
    INVALID_PARENT_FIRM(64, "Invalid Parent Firm"),

    /**
     * Invalid Interest Type
     */
    INVALID_INTEREST_TYPE(65, "Invalid Interest Type"),

    /**
     * Invalid Display Ind
     */
    INVALID_DISPLAY_IND(66, "Invalid Display Ind"),

    /**
     * Invalid Peg Ind
     */
    INVALID_PEG_IND(67, "Invalid Peg Ind"),

    /**
     * Invalid Ceiling Floor Price
     */
    INVALID_CEILING_FLOOR_PRICE(68, "Invalid Ceiling Floor Price"),

    /**
     * Invalid Min Peg Qty
     */
    INVALID_MIN_PEG_QTY(69, "Invalid Min Peg Qty"),

    /**
     * Invalid D Order Auction Price
     */
    INVALID_D_ORDER_AUCTION_PRICE(70, "Invalid D Order Auction Price"),

    /**
     * Invalid Disc Max Vol
     */
    INVALID_DISC_MAX_VOL(71, "Invalid Disc Max Vol"),

    /**
     * Invalid Dics Route Ind
     */
    INVALID_DICS_ROUTE_IND(72, "Invalid Dics Route Ind"),

    /**
     * Invalid Minimum Trigger Vol Mtv
     */
    INVALID_MINIMUM_TRIGGER_VOL_MTV(73, "Invalid Minimum Trigger Vol Mtv"),

    /**
     * Invalid Attributed Quote
     */
    INVALID_ATTRIBUTED_QUOTE(74, "Invalid Attributed Quote"),

    /**
     * Invalid Proactive If Locked
     */
    INVALID_PROACTIVE_IF_LOCKED(75, "Invalid Proactive If Locked"),

    /**
     * System Not Available
     */
    SYSTEM_NOT_AVAILABLE(76, "System Not Available"),

    /**
     * System Full Meng Rate Exceeded
     */
    SYSTEM_FULL_MENG_RATE_EXCEEDED(77, "System Full Meng Rate Exceeded"),

    /**
     * Throttle Reject
     */
    THROTTLE_REJECT(78, "Throttle Reject"),

    /**
     * Symbol Series Halted
     */
    SYMBOL_SERIES_HALTED(79, "Symbol Series Halted"),

    /**
     * No Symbolseries Permission
     */
    NO_SYMBOLSERIES_PERMISSION(80, "No Symbolseries Permission"),

    /**
     * Price Too Far Outside
     */
    PRICE_TOO_FAR_OUTSIDE(81, "Price Too Far Outside"),

    /**
     * Mwcb Halt
     */
    MWCB_HALT(82, "Mwcb Halt"),

    /**
     * Market Closed
     */
    MARKET_CLOSED(83, "Market Closed"),

    /**
     * Symbolseries Closed
     */
    SYMBOLSERIES_CLOSED(84, "Symbolseries Closed"),

    /**
     * Luld Cancel Instruction
     */
    LULD_CANCEL_INSTRUCTION(85, "Luld Cancel Instruction"),

    /**
     * No Price Slide Inst During Ssr
     */
    NO_PRICE_SLIDE_INST_DURING_SSR(86, "No Price Slide Inst During Ssr"),

    /**
     * Invalid Stock Leg Give Up
     */
    INVALID_STOCK_LEG_GIVE_UP(87, "Invalid Stock Leg Give Up"),

    /**
     * Invalid No Legs
     */
    INVALID_NO_LEGS(88, "Invalid No Legs"),

    /**
     * Invalid Leg Position Effect
     */
    INVALID_LEG_POSITION_EFFECT(89, "Invalid Leg Position Effect"),

    /**
     * Invalid Leg Symbol
     */
    INVALID_LEG_SYMBOL_90(90, "Invalid Leg Symbol"),

    /**
     * Invalid Leg Cfi Code
     */
    INVALID_LEG_CFI_CODE(91, "Invalid Leg Cfi Code"),

    /**
     * Invalid Leg Maturity Date
     */
    INVALID_LEG_MATURITY_DATE(92, "Invalid Leg Maturity Date"),

    /**
     * Invalid Leg Strike Price
     */
    INVALID_LEG_STRIKE_PRICE(93, "Invalid Leg Strike Price"),

    /**
     * Invalid Leg Contract Multiplier
     */
    INVALID_LEG_CONTRACT_MULTIPLIER(94, "Invalid Leg Contract Multiplier"),

    /**
     * Invalid Leg Ratio Qty
     */
    INVALID_LEG_RATIO_QTY(95, "Invalid Leg Ratio Qty"),

    /**
     * Invalid Leg Side
     */
    INVALID_LEG_SIDE(96, "Invalid Leg Side"),

    /**
     * Invalid Leg Ref Id
     */
    INVALID_LEG_REF_ID(97, "Invalid Leg Ref Id"),

    /**
     * Unsupported Order Type
     */
    UNSUPPORTED_ORDER_TYPE(98, "Unsupported Order Type"),

    /**
     * Urout
     */
    UROUT(99, "Urout"),

    /**
     * Primary Market Not Available
     */
    PRIMARY_MARKET_NOT_AVAILABLE(100, "Primary Market Not Available"),

    /**
     * No Nbbopbbo For Peg
     */
    NO_NBBOPBBO_FOR_PEG(101, "No Nbbopbbo For Peg"),

    /**
     * No Market For Market Order
     */
    NO_MARKET_FOR_MARKET_ORDER(102, "No Market For Market Order"),

    /**
     * Marketable Price
     */
    MARKETABLE_PRICE(103, "Marketable Price"),

    /**
     * Done For Day
     */
    DONE_FOR_DAY(104, "Done For Day"),

    /**
     * Credit Limit Violation
     */
    CREDIT_LIMIT_VIOLATION(105, "Credit Limit Violation"),

    /**
     * Cancel Remaining Ioc
     */
    CANCEL_REMAINING_IOC(106, "Cancel Remaining Ioc"),

    /**
     * Too Late To Cancel
     */
    TOO_LATE_TO_CANCEL(107, "Too Late To Cancel"),

    /**
     * Invalid Poss Resend
     */
    INVALID_POSS_RESEND(108, "Invalid Poss Resend"),

    /**
     * Cancel Pending
     */
    CANCEL_PENDING(109, "Cancel Pending"),

    /**
     * Symbol Series Already Opened
     */
    SYMBOL_SERIES_ALREADY_OPENED(110, "Symbol Series Already Opened"),

    /**
     * Firm Bulk Cancel
     */
    FIRM_BULK_CANCEL(111, "Firm Bulk Cancel"),

    /**
     * On Behalf Of Comp Id Blocked
     */
    ON_BEHALF_OF_COMP_ID_BLOCKED(112, "On Behalf Of Comp Id Blocked"),

    /**
     * Clearing Firm Blocked
     */
    CLEARING_FIRM_BLOCKED(113, "Clearing Firm Blocked"),

    /**
     * Cancel Replace Pending
     */
    CANCEL_REPLACE_PENDING(114, "Cancel Replace Pending"),

    /**
     * Modify Pending
     */
    MODIFY_PENDING(115, "Modify Pending"),

    /**
     * Cannot Flip Imbalance
     */
    CANNOT_FLIP_IMBALANCE(116, "Cannot Flip Imbalance"),

    /**
     * Cannot Increase Imbalance
     */
    CANNOT_INCREASE_IMBALANCE(117, "Cannot Increase Imbalance"),

    /**
     * Pending Cancel Imbalance Freeze
     */
    PENDING_CANCEL_IMBALANCE_FREEZE(118, "Pending Cancel Imbalance Freeze"),

    /**
     * Pending Replace Imbalance Freeze
     */
    PENDING_REPLACE_IMBALANCE_FREEZE(119, "Pending Replace Imbalance Freeze"),

    /**
     * Pending Modify Imbalance Freeze
     */
    PENDING_MODIFY_IMBALANCE_FREEZE(120, "Pending Modify Imbalance Freeze"),

    /**
     * Pending Cancel Routed Interest
     */
    PENDING_CANCEL_ROUTED_INTEREST(121, "Pending Cancel Routed Interest"),

    /**
     * Pending Replace Routed Interest
     */
    PENDING_REPLACE_ROUTED_INTEREST(122, "Pending Replace Routed Interest"),

    /**
     * Pending Modify Routed Interest
     */
    PENDING_MODIFY_ROUTED_INTEREST(123, "Pending Modify Routed Interest"),

    /**
     * Pending Auction Running
     */
    PENDING_AUCTION_RUNNING(124, "Pending Auction Running"),

    /**
     * Duplicative Order Check
     */
    DUPLICATIVE_ORDER_CHECK(125, "Duplicative Order Check"),

    /**
     * Cancelled By Exchange
     */
    CANCELLED_BY_EXCHANGE(126, "Cancelled By Exchange"),

    /**
     * New Order
     */
    NEW_ORDER(127, "New Order"),

    /**
     * Fill
     */
    FILL(128, "Fill"),

    /**
     * Partial Fill
     */
    PARTIAL_FILL(129, "Partial Fill"),

    /**
     * Reduced
     */
    REDUCED(130, "Reduced"),

    /**
     * Replaced
     */
    REPLACED(131, "Replaced"),

    /**
     * No Market For Cross
     */
    NO_MARKET_FOR_CROSS(132, "No Market For Cross"),

    /**
     * Stp Cancel
     */
    STP_CANCEL(133, "Stp Cancel"),

    /**
     * Invalid Poss Dupe
     */
    INVALID_POSS_DUPE(134, "Invalid Poss Dupe"),

    /**
     * Tpid Blocked
     */
    TPID_BLOCKED(135, "Tpid Blocked"),

    /**
     * Invalid Bulk Cancel
     */
    INVALID_BULK_CANCEL(136, "Invalid Bulk Cancel"),

    /**
     * Pending Bulk Cancel
     */
    PENDING_BULK_CANCEL(137, "Pending Bulk Cancel"),

    /**
     * Symbol Series Not Open
     */
    SYMBOL_SERIES_NOT_OPEN(138, "Symbol Series Not Open"),

    /**
     * Symbol Series Suspended
     */
    SYMBOL_SERIES_SUSPENDED(139, "Symbol Series Suspended"),

    /**
     * Symbol Ipo Halt
     */
    SYMBOL_IPO_HALT(140, "Symbol Ipo Halt"),

    /**
     * Invld Inst During Imbalance Freeze
     */
    INVLD_INST_DURING_IMBALANCE_FREEZE(141, "Invld Inst During Imbalance Freeze"),

    /**
     * Invld Inst After Cutoff Time
     */
    INVLD_INST_AFTER_CUTOFF_TIME(142, "Invld Inst After Cutoff Time"),

    /**
     * Cancelled By Primary Market
     */
    CANCELLED_BY_PRIMARY_MARKET(143, "Cancelled By Primary Market"),

    /**
     * Pending Imbalance Freeze
     */
    PENDING_IMBALANCE_FREEZE(144, "Pending Imbalance Freeze"),

    /**
     * No Rlp Permission
     */
    NO_RLP_PERMISSION(145, "No Rlp Permission"),

    /**
     * Invalid Instruction For Io Cs
     */
    INVALID_INSTRUCTION_FOR_IO_CS(146, "Invalid Instruction For Io Cs"),

    /**
     * System Full Cg Rate Exceeded
     */
    SYSTEM_FULL_CG_RATE_EXCEEDED(147, "System Full Cg Rate Exceeded"),

    /**
     * Pending Cancel Auction Running
     */
    PENDING_CANCEL_AUCTION_RUNNING(148, "Pending Cancel Auction Running"),

    /**
     * Pending Modify Auction Running
     */
    PENDING_MODIFY_AUCTION_RUNNING(149, "Pending Modify Auction Running"),

    /**
     * Pending Replace Auction Running
     */
    PENDING_REPLACE_AUCTION_RUNNING(150, "Pending Replace Auction Running"),

    /**
     * Invld Inst For Pending Order
     */
    INVLD_INST_FOR_PENDING_ORDER(151, "Invld Inst For Pending Order"),

    /**
     * Ssh Price Below Nbb On Iso
     */
    SSH_PRICE_BELOW_NBB_ON_ISO(152, "Ssh Price Below Nbb On Iso"),

    /**
     * Ioc Received While Auction Running
     */
    IOC_RECEIVED_WHILE_AUCTION_RUNNING(153, "Ioc Received While Auction Running"),

    /**
     * Pending Session Transition
     */
    PENDING_SESSION_TRANSITION(154, "Pending Session Transition"),

    /**
     * Pending Cancel Session Transition
     */
    PENDING_CANCEL_SESSION_TRANSITION(155, "Pending Cancel Session Transition"),

    /**
     * Pending Modify Session Transition
     */
    PENDING_MODIFY_SESSION_TRANSITION(156, "Pending Modify Session Transition"),

    /**
     * Pending Replace Session Transition
     */
    PENDING_REPLACE_SESSION_TRANSITION(157, "Pending Replace Session Transition"),

    /**
     * Invalid For Tick Pilot
     */
    INVALID_FOR_TICK_PILOT(158, "Invalid For Tick Pilot"),

    /**
     * Invalid Mmid
     */
    INVALID_MMID(159, "Invalid Mmid"),

    /**
     * Invalid Mpid
     */
    INVALID_MPID(160, "Invalid Mpid"),

    /**
     * Invalid Cancel Instead Of Reprice
     */
    INVALID_CANCEL_INSTEAD_OF_REPRICE(161, "Invalid Cancel Instead Of Reprice"),

    /**
     * Invalid Retail Indicator
     */
    INVALID_RETAIL_INDICATOR(162, "Invalid Retail Indicator"),

    /**
     * Sender Comp Id Not Active
     */
    SENDER_COMP_ID_NOT_ACTIVE(163, "Sender Comp Id Not Active"),

    /**
     * Mpid Blocked
     */
    MPID_BLOCKED(164, "Mpid Blocked"),

    /**
     * Invalid Timestamp
     */
    INVALID_TIMESTAMP(165, "Invalid Timestamp"),

    /**
     * Invalid Permission For Sender Comp Id
     */
    INVALID_PERMISSION_FOR_SENDER_COMP_ID(166, "Invalid Permission For Sender Comp Id"),

    /**
     * Invalid User Data
     */
    INVALID_USER_DATA(167, "Invalid User Data"),

    /**
     * Pillar Risk Mitigation
     */
    PILLAR_RISK_MITIGATION(168, "Pillar Risk Mitigation"),

    /**
     * No Last Sale For Peg
     */
    NO_LAST_SALE_FOR_PEG(169, "No Last Sale For Peg"),

    /**
     * Symbol Pending Closing Auction
     */
    SYMBOL_PENDING_CLOSING_AUCTION(170, "Symbol Pending Closing Auction"),

    /**
     * Extreme Closing Order Imbalance
     */
    EXTREME_CLOSING_ORDER_IMBALANCE(171, "Extreme Closing Order Imbalance"),

    /**
     * Invalid Multi Message
     */
    INVALID_MULTI_MESSAGE(172, "Invalid Multi Message"),

    /**
     * Invalid Request Targeting Manual Sender Comp Id
     */
    INVALID_REQUEST_TARGETING_MANUAL_SENDER_COMP_ID(173, "Invalid Request Targeting Manual Sender Comp Id"),

    /**
     * Invalid Dmm Reject Reason
     */
    INVALID_DMM_REJECT_REASON(174, "Invalid Dmm Reject Reason"),

    /**
     * Pending Pending Auction State
     */
    PENDING_PENDING_AUCTION_STATE(175, "Pending Pending Auction State"),

    /**
     * Pending Cancel Pending Auction State
     */
    PENDING_CANCEL_PENDING_AUCTION_STATE(176, "Pending Cancel Pending Auction State"),

    /**
     * Pending Modify Pending Auction State
     */
    PENDING_MODIFY_PENDING_AUCTION_STATE(177, "Pending Modify Pending Auction State"),

    /**
     * Pending Replace Pending Auction State
     */
    PENDING_REPLACE_PENDING_AUCTION_STATE(178, "Pending Replace Pending Auction State"),

    /**
     * Cancelled Dmm Manual Order Reprice
     */
    CANCELLED_DMM_MANUAL_ORDER_REPRICE(179, "Cancelled Dmm Manual Order Reprice"),

    /**
     * Too Early To Open
     */
    TOO_EARLY_TO_OPEN(180, "Too Early To Open"),

    /**
     * Too Early To Close
     */
    TOO_EARLY_TO_CLOSE(181, "Too Early To Close"),

    /**
     * Symbol Not Frozen By Auction Request
     */
    SYMBOL_NOT_FROZEN_BY_AUCTION_REQUEST(182, "Symbol Not Frozen By Auction Request"),

    /**
     * Symbol Is Frozen By Dbk Gui
     */
    SYMBOL_IS_FROZEN_BY_DBK_GUI(183, "Symbol Is Frozen By Dbk Gui"),

    /**
     * Too Late Auction Running
     */
    TOO_LATE_AUCTION_RUNNING(184, "Too Late Auction Running"),

    /**
     * Too Late Symbol Transition
     */
    TOO_LATE_SYMBOL_TRANSITION(185, "Too Late Symbol Transition"),

    /**
     * No Eligible Crossing Interest
     */
    NO_ELIGIBLE_CROSSING_INTEREST(186, "No Eligible Crossing Interest"),

    /**
     * Book Is Lockedcrossed
     */
    BOOK_IS_LOCKEDCROSSED(187, "Book Is Lockedcrossed"),

    /**
     * No Interest Exists
     */
    NO_INTEREST_EXISTS(188, "No Interest Exists"),

    /**
     * Imbalance Too Large
     */
    IMBALANCE_TOO_LARGE(189, "Imbalance Too Large"),

    /**
     * Ssh Price Below Ssr Filing Price
     */
    SSH_PRICE_BELOW_SSR_FILING_PRICE(190, "Ssh Price Below Ssr Filing Price"),

    /**
     * Symbol Already Closed
     */
    SYMBOL_ALREADY_CLOSED(191, "Symbol Already Closed"),

    /**
     * Opening Template Opened
     */
    OPENING_TEMPLATE_OPENED(192, "Opening Template Opened"),

    /**
     * Closing Template Opened
     */
    CLOSING_TEMPLATE_OPENED(193, "Closing Template Opened"),

    /**
     * Prin Entered On Auction Template
     */
    PRIN_ENTERED_ON_AUCTION_TEMPLATE(194, "Prin Entered On Auction Template"),

    /**
     * Mandatory Indication Submitted
     */
    MANDATORY_INDICATION_SUBMITTED(195, "Mandatory Indication Submitted"),

    /**
     * Pending Crowd Exists
     */
    PENDING_CROWD_EXISTS(196, "Pending Crowd Exists"),

    /**
     * No Consolidated Last Sale
     */
    NO_CONSOLIDATED_LAST_SALE(197, "No Consolidated Last Sale"),

    /**
     * Paired Qty Exceeds Max Trade Parameter
     */
    PAIRED_QTY_EXCEEDS_MAX_TRADE_PARAMETER(198, "Paired Qty Exceeds Max Trade Parameter"),

    /**
     * Luld Or Mwcb Timer Running
     */
    LULD_OR_MWCB_TIMER_RUNNING(199, "Luld Or Mwcb Timer Running"),

    /**
     * Locking Crossing Away Quote
     */
    LOCKING_CROSSING_AWAY_QUOTE(200, "Locking Crossing Away Quote"),

    /**
     * Cross Not Eligible
     */
    CROSS_NOT_ELIGIBLE(201, "Cross Not Eligible"),

    /**
     * Reserved For Future Use
     */
    RESERVED_FOR_FUTURE_USE_202(202, "Reserved For Future Use"),

    /**
     * Pending Acceptance For Ack On Order Arrival
     */
    PENDING_ACCEPTANCE_FOR_ACK_ON_ORDER_ARRIVAL(203, "Pending Acceptance For Ack On Order Arrival"),

    /**
     * Rejected Cancel By Dmm
     */
    REJECTED_CANCEL_BY_DMM(204, "Rejected Cancel By Dmm"),

    /**
     * Cancelled By Dmm
     */
    CANCELLED_BY_DMM(205, "Cancelled By Dmm"),

    /**
     * Price Is Outside Allowable Range
     */
    PRICE_IS_OUTSIDE_ALLOWABLE_RANGE(206, "Price Is Outside Allowable Range"),

    /**
     * Auction Validation In Progress
     */
    AUCTION_VALIDATION_IN_PROGRESS(207, "Auction Validation In Progress"),

    /**
     * Invalid Manual Action Id
     */
    INVALID_MANUAL_ACTION_ID(208, "Invalid Manual Action Id"),

    /**
     * Invalid Auction Sell Indicator
     */
    INVALID_AUCTION_SELL_INDICATOR(209, "Invalid Auction Sell Indicator"),

    /**
     * Invalid Intraday Sell Short Qty
     */
    INVALID_INTRADAY_SELL_SHORT_QTY(210, "Invalid Intraday Sell Short Qty"),

    /**
     * Indication Template Is Open
     */
    INDICATION_TEMPLATE_IS_OPEN(211, "Indication Template Is Open"),

    /**
     * No Prev Closing Price
     */
    NO_PREV_CLOSING_PRICE(212, "No Prev Closing Price"),

    /**
     * Cancelled Due To Trading Collars
     */
    CANCELLED_DUE_TO_TRADING_COLLARS(213, "Cancelled Due To Trading Collars"),

    /**
     * Underlying Is In Luld State
     */
    UNDERLYING_IS_IN_LULD_STATE(214, "Underlying Is In Luld State"),

    /**
     * Invalid Manual Response Type
     */
    INVALID_MANUAL_RESPONSE_TYPE(215, "Invalid Manual Response Type"),

    /**
     * No Nyse Last Sale
     */
    NO_NYSE_LAST_SALE(216, "No Nyse Last Sale"),

    /**
     * Symbol Direct Listing State
     */
    SYMBOL_DIRECT_LISTING_STATE(217, "Symbol Direct Listing State"),

    /**
     * Dmm Gui Reduction In Manual Order Qty
     */
    DMM_GUI_REDUCTION_IN_MANUAL_ORDER_QTY(218, "Dmm Gui Reduction In Manual Order Qty"),

    /**
     * Cross Eligible
     */
    CROSS_ELIGIBLE(219, "Cross Eligible"),

    /**
     * Dry Run
     */
    DRY_RUN(220, "Dry Run"),

    /**
     * Unsupported By Broker Plex
     */
    UNSUPPORTED_BY_BROKER_PLEX(221, "Unsupported By Broker Plex"),

    /**
     * Cross Blocked By Bbopbbo
     */
    CROSS_BLOCKED_BY_BBOPBBO(222, "Cross Blocked By Bbopbbo"),

    /**
     * Risk Single Ord Max Qty
     */
    RISK_SINGLE_ORD_MAX_QTY(223, "Risk Single Ord Max Qty"),

    /**
     * Risk Single Ord Max Notional
     */
    RISK_SINGLE_ORD_MAX_NOTIONAL(224, "Risk Single Ord Max Notional"),

    /**
     * Risk Gross Credit Breach
     */
    RISK_GROSS_CREDIT_BREACH(225, "Risk Gross Credit Breach"),

    /**
     * Risk Kill Switch
     */
    RISK_KILL_SWITCH(226, "Risk Kill Switch"),

    /**
     * Invalid Route To Broker
     */
    INVALID_ROUTE_TO_BROKER(227, "Invalid Route To Broker"),

    /**
     * Spread Too Wide
     */
    SPREAD_TOO_WIDE(228, "Spread Too Wide"),

    /**
     * Expire Fok
     */
    EXPIRE_FOK(229, "Expire Fok"),

    /**
     * Locks Displayed Interest
     */
    LOCKS_DISPLAYED_INTEREST(230, "Locks Displayed Interest"),

    /**
     * Mm Quote Price Lockcross Contra Side Nbbo
     */
    MM_QUOTE_PRICE_LOCKCROSS_CONTRA_SIDE_NBBO(231, "Mm Quote Price Lockcross Contra Side Nbbo"),

    /**
     * Invalid Leg Symbol
     */
    INVALID_LEG_SYMBOL_232(232, "Invalid Leg Symbol"),

    /**
     * Duplicate Leg Symbol
     */
    DUPLICATE_LEG_SYMBOL(233, "Duplicate Leg Symbol"),

    /**
     * Symbol Not In Underlying
     */
    SYMBOL_NOT_IN_UNDERLYING(234, "Symbol Not In Underlying"),

    /**
     * Leg Ratios Not In The Most Reduced Form
     */
    LEG_RATIOS_NOT_IN_THE_MOST_REDUCED_FORM(235, "Leg Ratios Not In The Most Reduced Form"),

    /**
     * Option Leg Ratio Too High
     */
    OPTION_LEG_RATIO_TOO_HIGH(236, "Option Leg Ratio Too High"),

    /**
     * Stock Leg Ratio Too Low
     */
    STOCK_LEG_RATIO_TOO_LOW(237, "Stock Leg Ratio Too Low"),

    /**
     * Complex Series Already Exists
     */
    COMPLEX_SERIES_ALREADY_EXISTS(238, "Complex Series Already Exists"),

    /**
     * Number Of Legs Incorrect
     */
    NUMBER_OF_LEGS_INCORRECT(239, "Number Of Legs Incorrect"),

    /**
     * Cancel Does Not Set Nbbo Inst
     */
    CANCEL_DOES_NOT_SET_NBBO_INST(240, "Cancel Does Not Set Nbbo Inst"),

    /**
     * Cancel Avoid Reprice Inst
     */
    CANCEL_AVOID_REPRICE_INST(241, "Cancel Avoid Reprice Inst"),

    /**
     * Allow Reprice Once Then Cancel Inst
     */
    ALLOW_REPRICE_ONCE_THEN_CANCEL_INST(242, "Allow Reprice Once Then Cancel Inst"),

    /**
     * Invalid Allocation Pct
     */
    INVALID_ALLOCATION_PCT(243, "Invalid Allocation Pct"),

    /**
     * Invalid Mm Quote Type
     */
    INVALID_MM_QUOTE_TYPE(244, "Invalid Mm Quote Type"),

    /**
     * Invalid Mm Sent Time
     */
    INVALID_MM_SENT_TIME(245, "Invalid Mm Sent Time"),

    /**
     * Series Expired
     */
    SERIES_EXPIRED(246, "Series Expired"),

    /**
     * Invalid Give Up Mmid
     */
    INVALID_GIVE_UP_MMID(247, "Invalid Give Up Mmid"),

    /**
     * Invalid No Sides
     */
    INVALID_NO_SIDES(248, "Invalid No Sides"),

    /**
     * Pending To Acceptance
     */
    PENDING_TO_ACCEPTANCE(249, "Pending To Acceptance"),

    /**
     * Reserved For Future Use
     */
    RESERVED_FOR_FUTURE_USE_250(250, "Reserved For Future Use"),

    /**
     * Invalid Bulk Action
     */
    INVALID_BULK_ACTION(251, "Invalid Bulk Action"),

    /**
     * Invalid Cancel Scope
     */
    INVALID_CANCEL_SCOPE(252, "Invalid Cancel Scope"),

    /**
     * No Legal Width Spread
     */
    NO_LEGAL_WIDTH_SPREAD(253, "No Legal Width Spread"),

    /**
     * Invalid Target Cancel Mpid
     */
    INVALID_TARGET_CANCEL_MPID(254, "Invalid Target Cancel Mpid"),

    /**
     * Invalid Target Cancel Sender Comp Id
     */
    INVALID_TARGET_CANCEL_SENDER_COMP_ID(255, "Invalid Target Cancel Sender Comp Id"),

    /**
     * Clear The Book Prev Entered
     */
    CLEAR_THE_BOOK_PREV_ENTERED(256, "Clear The Book Prev Entered"),

    /**
     * Timer Expired Api Allocation
     */
    TIMER_EXPIRED_API_ALLOCATION(257, "Timer Expired Api Allocation"),

    /**
     * Invalid Number Of Quotes
     */
    INVALID_NUMBER_OF_QUOTES(258, "Invalid Number Of Quotes"),

    /**
     * Invalid Order Id
     */
    INVALID_ORDER_ID(259, "Invalid Order Id"),

    /**
     * Risk Control Event
     */
    RISK_CONTROL_EVENT(260, "Risk Control Event"),

    /**
     * To Rejected
     */
    TO_REJECTED(261, "To Rejected"),

    /**
     * Cancelled Corporate Action
     */
    CANCELLED_CORPORATE_ACTION(262, "Cancelled Corporate Action"),

    /**
     * Too Late To Replace
     */
    TOO_LATE_TO_REPLACE(263, "Too Late To Replace"),

    /**
     * Invalid Ref Delta
     */
    INVALID_REF_DELTA(264, "Invalid Ref Delta"),

    /**
     * Invalid Stock Price
     */
    INVALID_STOCK_PRICE(265, "Invalid Stock Price"),

    /**
     * Reserved For Future Use
     */
    RESERVED_FOR_FUTURE_USE_266(266, "Reserved For Future Use"),

    /**
     * Invalid Tied To Stock
     */
    INVALID_TIED_TO_STOCK(267, "Invalid Tied To Stock"),

    /**
     * Too Late To Allocate
     */
    TOO_LATE_TO_ALLOCATE(268, "Too Late To Allocate"),

    /**
     * Customer Interest On Bbo
     */
    CUSTOMER_INTEREST_ON_BBO(269, "Customer Interest On Bbo"),

    /**
     * Ido Cannot Be Modified
     */
    IDO_CANNOT_BE_MODIFIED(270, "Ido Cannot Be Modified"),

    /**
     * Cross Outside Bbo
     */
    CROSS_OUTSIDE_BBO(271, "Cross Outside Bbo"),

    /**
     * Pending To Approval
     */
    PENDING_TO_APPROVAL(272, "Pending To Approval"),

    /**
     * Invalid Leg Open Close
     */
    INVALID_LEG_OPEN_CLOSE(273, "Invalid Leg Open Close"),

    /**
     * Invalid Risk Control Type
     */
    INVALID_RISK_CONTROL_TYPE(274, "Invalid Risk Control Type"),

    /**
     * Invalid Risk Control Activation
     */
    INVALID_RISK_CONTROL_ACTIVATION(275, "Invalid Risk Control Activation"),

    /**
     * Invalid Breach Action Request
     */
    INVALID_BREACH_ACTION_REQUEST(276, "Invalid Breach Action Request"),

    /**
     * Invalid Ioc Attribution
     */
    INVALID_IOC_ATTRIBUTION(277, "Invalid Ioc Attribution"),

    /**
     * Invalid Risk Action Type
     */
    INVALID_RISK_ACTION_TYPE(278, "Invalid Risk Action Type"),

    /**
     * Invalid Usd Limit
     */
    INVALID_USD_LIMIT(279, "Invalid Usd Limit"),

    /**
     * Ido Already Exists
     */
    IDO_ALREADY_EXISTS(280, "Ido Already Exists"),

    /**
     * Invalid Time Limit
     */
    INVALID_TIME_LIMIT(281, "Invalid Time Limit"),

    /**
     * Invalid Percentage Limit
     */
    INVALID_PERCENTAGE_LIMIT(282, "Invalid Percentage Limit"),

    /**
     * Invalid Count Limit
     */
    INVALID_COUNT_LIMIT(283, "Invalid Count Limit"),

    /**
     * Risk Roll Transact Breach
     */
    RISK_ROLL_TRANSACT_BREACH(284, "Risk Roll Transact Breach"),

    /**
     * Risk Roll Vol Breach
     */
    RISK_ROLL_VOL_BREACH(285, "Risk Roll Vol Breach"),

    /**
     * Risk Roll Pct Breach
     */
    RISK_ROLL_PCT_BREACH(286, "Risk Roll Pct Breach"),

    /**
     * Risk Roll Grmp Breach
     */
    RISK_ROLL_GRMP_BREACH(287, "Risk Roll Grmp Breach"),

    /**
     * Risk Mm Arbitrage Breach
     */
    RISK_MM_ARBITRAGE_BREACH(288, "Risk Mm Arbitrage Breach"),

    /**
     * Risk Mm Intrinsic Breach
     */
    RISK_MM_INTRINSIC_BREACH(289, "Risk Mm Intrinsic Breach"),

    /**
     * Ido Must Exist
     */
    IDO_MUST_EXIST(290, "Ido Must Exist"),

    /**
     * Invalid Allocation Tag
     */
    INVALID_ALLOCATION_TAG(291, "Invalid Allocation Tag"),

    /**
     * Invalid Trade Tag
     */
    INVALID_TRADE_TAG(292, "Invalid Trade Tag"),

    /**
     * Arbitrage Check
     */
    ARBITRAGE_CHECK(293, "Arbitrage Check"),

    /**
     * Intrinsic Value Check
     */
    INTRINSIC_VALUE_CHECK(294, "Intrinsic Value Check"),

    /**
     * Credit Debit Check
     */
    CREDIT_DEBIT_CHECK(295, "Credit Debit Check"),

    /**
     * Invalid Risk User
     */
    INVALID_RISK_USER(296, "Invalid Risk User"),

    /**
     * Invalid Risk Entity
     */
    INVALID_RISK_ENTITY(297, "Invalid Risk Entity"),

    /**
     * Invalid Flex Series Already Exists
     */
    INVALID_FLEX_SERIES_ALREADY_EXISTS(298, "Invalid Flex Series Already Exists"),

    /**
     * Invalid Flex Series Key
     */
    INVALID_FLEX_SERIES_KEY(299, "Invalid Flex Series Key"),

    /**
     * Invalid Clear The Book
     */
    INVALID_CLEAR_THE_BOOK(300, "Invalid Clear The Book"),

    /**
     * Invalid Stock Qty
     */
    INVALID_STOCK_QTY(301, "Invalid Stock Qty"),

    /**
     * Invalid Package Link Id
     */
    INVALID_PACKAGE_LINK_ID(302, "Invalid Package Link Id"),

    /**
     * Complex Max Series Breach
     */
    COMPLEX_MAX_SERIES_BREACH(303, "Complex Max Series Breach"),

    /**
     * Invalid Flex Eod Tag
     */
    INVALID_FLEX_EOD_TAG(304, "Invalid Flex Eod Tag"),

    /**
     * Invalid Percentage Price
     */
    INVALID_PERCENTAGE_PRICE(305, "Invalid Percentage Price"),

    /**
     * Unknown Issue Encountered
     */
    UNKNOWN_ISSUE_ENCOUNTERED(999, "Unknown Issue Encountered");

    private final int wire;

    private final String description;

    ReasonCode(int wire, String description) {
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
    public static Optional<ReasonCode> fromWire(int wire) {
        return switch (wire) {
            case 0 -> Optional.of(OK);
            case 1 -> Optional.of(INVALID_SENDER_COMP_ID);
            case 2 -> Optional.of(INVALID_SENDER_SUB_ID);
            case 3 -> Optional.of(INVALID_SENDING_TIME);
            case 4 -> Optional.of(INVALID_TARGET_COMP_ID);
            case 5 -> Optional.of(INVALID_TARGET_SUB_ID);
            case 6 -> Optional.of(INVALID_ON_BEHALF_OF_COMP_ID);
            case 7 -> Optional.of(INVALID_ON_BEHALF_OF_SUB_ID);
            case 8 -> Optional.of(INVALID_DELIVER_TO_COMP_ID);
            case 9 -> Optional.of(INVALID_DELIVER_TO_SUB_ID);
            case 10 -> Optional.of(INVALID_ACCOUNT);
            case 11 -> Optional.of(INVALID_CL_ORD_ID);
            case 12 -> Optional.of(INVALID_EXEC_INST);
            case 13 -> Optional.of(INVALID_ID_SOURCE);
            case 14 -> Optional.of(INVALID_ORDER_QTY);
            case 15 -> Optional.of(INVALID_ORD_TYPE);
            case 16 -> Optional.of(INVALID_PRICE);
            case 17 -> Optional.of(INVALID_ORDER_CAPACITY);
            case 18 -> Optional.of(INVALID_SECURITY_ID);
            case 19 -> Optional.of(INVALID_SIDE);
            case 20 -> Optional.of(INVALID_SYMBOL_SERIES);
            case 21 -> Optional.of(INVALID_TEXT);
            case 22 -> Optional.of(INVALID_TIME_IN_FORCE);
            case 23 -> Optional.of(INVALID_SETTLEMENT_TYPE);
            case 24 -> Optional.of(INVALID_FUT_SETT_DATE);
            case 25 -> Optional.of(INVALID_SYMBOL_SFX);
            case 26 -> Optional.of(INVALID_OPEN_CLOSE);
            case 27 -> Optional.of(INVALID_STOP_PX);
            case 28 -> Optional.of(INVALID_CLIENT_ID);
            case 29 -> Optional.of(INVALID_MIN_QTY);
            case 30 -> Optional.of(INVALID_MAX_FLOOR);
            case 31 -> Optional.of(INVALID_LOCATE_REQD);
            case 32 -> Optional.of(INVALID_EXPIRE_TIME);
            case 33 -> Optional.of(INVALID_SECURITY_TYPE);
            case 34 -> Optional.of(INVALID_MATURITY_MONTH_YEAR);
            case 35 -> Optional.of(INVALID_PUT_OR_CALL);
            case 36 -> Optional.of(INVALID_STRIKE_PRICE);
            case 37 -> Optional.of(INVALID_COVERED_OR_UNCOVERED);
            case 38 -> Optional.of(INVALID_CUSTOMER_OR_FIRM);
            case 39 -> Optional.of(INVALID_MATURITY_DAY);
            case 40 -> Optional.of(INVALID_PEG_DIFFERENCE);
            case 41 -> Optional.of(INVALID_SELLERS_DAYS);
            case 42 -> Optional.of(INVALID_TRADING_SESSION_ID);
            case 43 -> Optional.of(INVALID_NO_TRADING_SESSIONS);
            case 44 -> Optional.of(INVALID_DISCRETION_INST);
            case 45 -> Optional.of(INVALID_DISCRETION_OFFSET);
            case 46 -> Optional.of(INVALID_PRICE_TYPE);
            case 47 -> Optional.of(INVALID_CLEARING_FIRM);
            case 48 -> Optional.of(INVALID_CLEARING_ACCOUNT);
            case 49 -> Optional.of(INVALID_PARTY_ID);
            case 50 -> Optional.of(INVALID_OPTIONAL_DATA);
            case 51 -> Optional.of(INVALID_CROSS_ID);
            case 52 -> Optional.of(INVALID_STRATEGY_INDICATOR);
            case 53 -> Optional.of(INVALID_TRADE_ID);
            case 54 -> Optional.of(INVALID_NO_SELF_TRADE);
            case 55 -> Optional.of(INVALID_CAP_STRATEGY);
            case 56 -> Optional.of(INVALID_SPECIAL_ORD_TYPE);
            case 57 -> Optional.of(INVALID_ROUTING_INST);
            case 58 -> Optional.of(INVALID_OFFSET_PRICE);
            case 59 -> Optional.of(INVALID_EXTENDED_EXEC_INST);
            case 60 -> Optional.of(INVALID_INTRODUCING_BADGE_ID);
            case 61 -> Optional.of(INVALID_BILL_TO);
            case 62 -> Optional.of(INVALID_PARENT_FIRM_CL_ORD_ID);
            case 63 -> Optional.of(INVALID_PARENT_FIRM_EXCHANGE_ORD_ID);
            case 64 -> Optional.of(INVALID_PARENT_FIRM);
            case 65 -> Optional.of(INVALID_INTEREST_TYPE);
            case 66 -> Optional.of(INVALID_DISPLAY_IND);
            case 67 -> Optional.of(INVALID_PEG_IND);
            case 68 -> Optional.of(INVALID_CEILING_FLOOR_PRICE);
            case 69 -> Optional.of(INVALID_MIN_PEG_QTY);
            case 70 -> Optional.of(INVALID_D_ORDER_AUCTION_PRICE);
            case 71 -> Optional.of(INVALID_DISC_MAX_VOL);
            case 72 -> Optional.of(INVALID_DICS_ROUTE_IND);
            case 73 -> Optional.of(INVALID_MINIMUM_TRIGGER_VOL_MTV);
            case 74 -> Optional.of(INVALID_ATTRIBUTED_QUOTE);
            case 75 -> Optional.of(INVALID_PROACTIVE_IF_LOCKED);
            case 76 -> Optional.of(SYSTEM_NOT_AVAILABLE);
            case 77 -> Optional.of(SYSTEM_FULL_MENG_RATE_EXCEEDED);
            case 78 -> Optional.of(THROTTLE_REJECT);
            case 79 -> Optional.of(SYMBOL_SERIES_HALTED);
            case 80 -> Optional.of(NO_SYMBOLSERIES_PERMISSION);
            case 81 -> Optional.of(PRICE_TOO_FAR_OUTSIDE);
            case 82 -> Optional.of(MWCB_HALT);
            case 83 -> Optional.of(MARKET_CLOSED);
            case 84 -> Optional.of(SYMBOLSERIES_CLOSED);
            case 85 -> Optional.of(LULD_CANCEL_INSTRUCTION);
            case 86 -> Optional.of(NO_PRICE_SLIDE_INST_DURING_SSR);
            case 87 -> Optional.of(INVALID_STOCK_LEG_GIVE_UP);
            case 88 -> Optional.of(INVALID_NO_LEGS);
            case 89 -> Optional.of(INVALID_LEG_POSITION_EFFECT);
            case 90 -> Optional.of(INVALID_LEG_SYMBOL_90);
            case 91 -> Optional.of(INVALID_LEG_CFI_CODE);
            case 92 -> Optional.of(INVALID_LEG_MATURITY_DATE);
            case 93 -> Optional.of(INVALID_LEG_STRIKE_PRICE);
            case 94 -> Optional.of(INVALID_LEG_CONTRACT_MULTIPLIER);
            case 95 -> Optional.of(INVALID_LEG_RATIO_QTY);
            case 96 -> Optional.of(INVALID_LEG_SIDE);
            case 97 -> Optional.of(INVALID_LEG_REF_ID);
            case 98 -> Optional.of(UNSUPPORTED_ORDER_TYPE);
            case 99 -> Optional.of(UROUT);
            case 100 -> Optional.of(PRIMARY_MARKET_NOT_AVAILABLE);
            case 101 -> Optional.of(NO_NBBOPBBO_FOR_PEG);
            case 102 -> Optional.of(NO_MARKET_FOR_MARKET_ORDER);
            case 103 -> Optional.of(MARKETABLE_PRICE);
            case 104 -> Optional.of(DONE_FOR_DAY);
            case 105 -> Optional.of(CREDIT_LIMIT_VIOLATION);
            case 106 -> Optional.of(CANCEL_REMAINING_IOC);
            case 107 -> Optional.of(TOO_LATE_TO_CANCEL);
            case 108 -> Optional.of(INVALID_POSS_RESEND);
            case 109 -> Optional.of(CANCEL_PENDING);
            case 110 -> Optional.of(SYMBOL_SERIES_ALREADY_OPENED);
            case 111 -> Optional.of(FIRM_BULK_CANCEL);
            case 112 -> Optional.of(ON_BEHALF_OF_COMP_ID_BLOCKED);
            case 113 -> Optional.of(CLEARING_FIRM_BLOCKED);
            case 114 -> Optional.of(CANCEL_REPLACE_PENDING);
            case 115 -> Optional.of(MODIFY_PENDING);
            case 116 -> Optional.of(CANNOT_FLIP_IMBALANCE);
            case 117 -> Optional.of(CANNOT_INCREASE_IMBALANCE);
            case 118 -> Optional.of(PENDING_CANCEL_IMBALANCE_FREEZE);
            case 119 -> Optional.of(PENDING_REPLACE_IMBALANCE_FREEZE);
            case 120 -> Optional.of(PENDING_MODIFY_IMBALANCE_FREEZE);
            case 121 -> Optional.of(PENDING_CANCEL_ROUTED_INTEREST);
            case 122 -> Optional.of(PENDING_REPLACE_ROUTED_INTEREST);
            case 123 -> Optional.of(PENDING_MODIFY_ROUTED_INTEREST);
            case 124 -> Optional.of(PENDING_AUCTION_RUNNING);
            case 125 -> Optional.of(DUPLICATIVE_ORDER_CHECK);
            case 126 -> Optional.of(CANCELLED_BY_EXCHANGE);
            case 127 -> Optional.of(NEW_ORDER);
            case 128 -> Optional.of(FILL);
            case 129 -> Optional.of(PARTIAL_FILL);
            case 130 -> Optional.of(REDUCED);
            case 131 -> Optional.of(REPLACED);
            case 132 -> Optional.of(NO_MARKET_FOR_CROSS);
            case 133 -> Optional.of(STP_CANCEL);
            case 134 -> Optional.of(INVALID_POSS_DUPE);
            case 135 -> Optional.of(TPID_BLOCKED);
            case 136 -> Optional.of(INVALID_BULK_CANCEL);
            case 137 -> Optional.of(PENDING_BULK_CANCEL);
            case 138 -> Optional.of(SYMBOL_SERIES_NOT_OPEN);
            case 139 -> Optional.of(SYMBOL_SERIES_SUSPENDED);
            case 140 -> Optional.of(SYMBOL_IPO_HALT);
            case 141 -> Optional.of(INVLD_INST_DURING_IMBALANCE_FREEZE);
            case 142 -> Optional.of(INVLD_INST_AFTER_CUTOFF_TIME);
            case 143 -> Optional.of(CANCELLED_BY_PRIMARY_MARKET);
            case 144 -> Optional.of(PENDING_IMBALANCE_FREEZE);
            case 145 -> Optional.of(NO_RLP_PERMISSION);
            case 146 -> Optional.of(INVALID_INSTRUCTION_FOR_IO_CS);
            case 147 -> Optional.of(SYSTEM_FULL_CG_RATE_EXCEEDED);
            case 148 -> Optional.of(PENDING_CANCEL_AUCTION_RUNNING);
            case 149 -> Optional.of(PENDING_MODIFY_AUCTION_RUNNING);
            case 150 -> Optional.of(PENDING_REPLACE_AUCTION_RUNNING);
            case 151 -> Optional.of(INVLD_INST_FOR_PENDING_ORDER);
            case 152 -> Optional.of(SSH_PRICE_BELOW_NBB_ON_ISO);
            case 153 -> Optional.of(IOC_RECEIVED_WHILE_AUCTION_RUNNING);
            case 154 -> Optional.of(PENDING_SESSION_TRANSITION);
            case 155 -> Optional.of(PENDING_CANCEL_SESSION_TRANSITION);
            case 156 -> Optional.of(PENDING_MODIFY_SESSION_TRANSITION);
            case 157 -> Optional.of(PENDING_REPLACE_SESSION_TRANSITION);
            case 158 -> Optional.of(INVALID_FOR_TICK_PILOT);
            case 159 -> Optional.of(INVALID_MMID);
            case 160 -> Optional.of(INVALID_MPID);
            case 161 -> Optional.of(INVALID_CANCEL_INSTEAD_OF_REPRICE);
            case 162 -> Optional.of(INVALID_RETAIL_INDICATOR);
            case 163 -> Optional.of(SENDER_COMP_ID_NOT_ACTIVE);
            case 164 -> Optional.of(MPID_BLOCKED);
            case 165 -> Optional.of(INVALID_TIMESTAMP);
            case 166 -> Optional.of(INVALID_PERMISSION_FOR_SENDER_COMP_ID);
            case 167 -> Optional.of(INVALID_USER_DATA);
            case 168 -> Optional.of(PILLAR_RISK_MITIGATION);
            case 169 -> Optional.of(NO_LAST_SALE_FOR_PEG);
            case 170 -> Optional.of(SYMBOL_PENDING_CLOSING_AUCTION);
            case 171 -> Optional.of(EXTREME_CLOSING_ORDER_IMBALANCE);
            case 172 -> Optional.of(INVALID_MULTI_MESSAGE);
            case 173 -> Optional.of(INVALID_REQUEST_TARGETING_MANUAL_SENDER_COMP_ID);
            case 174 -> Optional.of(INVALID_DMM_REJECT_REASON);
            case 175 -> Optional.of(PENDING_PENDING_AUCTION_STATE);
            case 176 -> Optional.of(PENDING_CANCEL_PENDING_AUCTION_STATE);
            case 177 -> Optional.of(PENDING_MODIFY_PENDING_AUCTION_STATE);
            case 178 -> Optional.of(PENDING_REPLACE_PENDING_AUCTION_STATE);
            case 179 -> Optional.of(CANCELLED_DMM_MANUAL_ORDER_REPRICE);
            case 180 -> Optional.of(TOO_EARLY_TO_OPEN);
            case 181 -> Optional.of(TOO_EARLY_TO_CLOSE);
            case 182 -> Optional.of(SYMBOL_NOT_FROZEN_BY_AUCTION_REQUEST);
            case 183 -> Optional.of(SYMBOL_IS_FROZEN_BY_DBK_GUI);
            case 184 -> Optional.of(TOO_LATE_AUCTION_RUNNING);
            case 185 -> Optional.of(TOO_LATE_SYMBOL_TRANSITION);
            case 186 -> Optional.of(NO_ELIGIBLE_CROSSING_INTEREST);
            case 187 -> Optional.of(BOOK_IS_LOCKEDCROSSED);
            case 188 -> Optional.of(NO_INTEREST_EXISTS);
            case 189 -> Optional.of(IMBALANCE_TOO_LARGE);
            case 190 -> Optional.of(SSH_PRICE_BELOW_SSR_FILING_PRICE);
            case 191 -> Optional.of(SYMBOL_ALREADY_CLOSED);
            case 192 -> Optional.of(OPENING_TEMPLATE_OPENED);
            case 193 -> Optional.of(CLOSING_TEMPLATE_OPENED);
            case 194 -> Optional.of(PRIN_ENTERED_ON_AUCTION_TEMPLATE);
            case 195 -> Optional.of(MANDATORY_INDICATION_SUBMITTED);
            case 196 -> Optional.of(PENDING_CROWD_EXISTS);
            case 197 -> Optional.of(NO_CONSOLIDATED_LAST_SALE);
            case 198 -> Optional.of(PAIRED_QTY_EXCEEDS_MAX_TRADE_PARAMETER);
            case 199 -> Optional.of(LULD_OR_MWCB_TIMER_RUNNING);
            case 200 -> Optional.of(LOCKING_CROSSING_AWAY_QUOTE);
            case 201 -> Optional.of(CROSS_NOT_ELIGIBLE);
            case 202 -> Optional.of(RESERVED_FOR_FUTURE_USE_202);
            case 203 -> Optional.of(PENDING_ACCEPTANCE_FOR_ACK_ON_ORDER_ARRIVAL);
            case 204 -> Optional.of(REJECTED_CANCEL_BY_DMM);
            case 205 -> Optional.of(CANCELLED_BY_DMM);
            case 206 -> Optional.of(PRICE_IS_OUTSIDE_ALLOWABLE_RANGE);
            case 207 -> Optional.of(AUCTION_VALIDATION_IN_PROGRESS);
            case 208 -> Optional.of(INVALID_MANUAL_ACTION_ID);
            case 209 -> Optional.of(INVALID_AUCTION_SELL_INDICATOR);
            case 210 -> Optional.of(INVALID_INTRADAY_SELL_SHORT_QTY);
            case 211 -> Optional.of(INDICATION_TEMPLATE_IS_OPEN);
            case 212 -> Optional.of(NO_PREV_CLOSING_PRICE);
            case 213 -> Optional.of(CANCELLED_DUE_TO_TRADING_COLLARS);
            case 214 -> Optional.of(UNDERLYING_IS_IN_LULD_STATE);
            case 215 -> Optional.of(INVALID_MANUAL_RESPONSE_TYPE);
            case 216 -> Optional.of(NO_NYSE_LAST_SALE);
            case 217 -> Optional.of(SYMBOL_DIRECT_LISTING_STATE);
            case 218 -> Optional.of(DMM_GUI_REDUCTION_IN_MANUAL_ORDER_QTY);
            case 219 -> Optional.of(CROSS_ELIGIBLE);
            case 220 -> Optional.of(DRY_RUN);
            case 221 -> Optional.of(UNSUPPORTED_BY_BROKER_PLEX);
            case 222 -> Optional.of(CROSS_BLOCKED_BY_BBOPBBO);
            case 223 -> Optional.of(RISK_SINGLE_ORD_MAX_QTY);
            case 224 -> Optional.of(RISK_SINGLE_ORD_MAX_NOTIONAL);
            case 225 -> Optional.of(RISK_GROSS_CREDIT_BREACH);
            case 226 -> Optional.of(RISK_KILL_SWITCH);
            case 227 -> Optional.of(INVALID_ROUTE_TO_BROKER);
            case 228 -> Optional.of(SPREAD_TOO_WIDE);
            case 229 -> Optional.of(EXPIRE_FOK);
            case 230 -> Optional.of(LOCKS_DISPLAYED_INTEREST);
            case 231 -> Optional.of(MM_QUOTE_PRICE_LOCKCROSS_CONTRA_SIDE_NBBO);
            case 232 -> Optional.of(INVALID_LEG_SYMBOL_232);
            case 233 -> Optional.of(DUPLICATE_LEG_SYMBOL);
            case 234 -> Optional.of(SYMBOL_NOT_IN_UNDERLYING);
            case 235 -> Optional.of(LEG_RATIOS_NOT_IN_THE_MOST_REDUCED_FORM);
            case 236 -> Optional.of(OPTION_LEG_RATIO_TOO_HIGH);
            case 237 -> Optional.of(STOCK_LEG_RATIO_TOO_LOW);
            case 238 -> Optional.of(COMPLEX_SERIES_ALREADY_EXISTS);
            case 239 -> Optional.of(NUMBER_OF_LEGS_INCORRECT);
            case 240 -> Optional.of(CANCEL_DOES_NOT_SET_NBBO_INST);
            case 241 -> Optional.of(CANCEL_AVOID_REPRICE_INST);
            case 242 -> Optional.of(ALLOW_REPRICE_ONCE_THEN_CANCEL_INST);
            case 243 -> Optional.of(INVALID_ALLOCATION_PCT);
            case 244 -> Optional.of(INVALID_MM_QUOTE_TYPE);
            case 245 -> Optional.of(INVALID_MM_SENT_TIME);
            case 246 -> Optional.of(SERIES_EXPIRED);
            case 247 -> Optional.of(INVALID_GIVE_UP_MMID);
            case 248 -> Optional.of(INVALID_NO_SIDES);
            case 249 -> Optional.of(PENDING_TO_ACCEPTANCE);
            case 250 -> Optional.of(RESERVED_FOR_FUTURE_USE_250);
            case 251 -> Optional.of(INVALID_BULK_ACTION);
            case 252 -> Optional.of(INVALID_CANCEL_SCOPE);
            case 253 -> Optional.of(NO_LEGAL_WIDTH_SPREAD);
            case 254 -> Optional.of(INVALID_TARGET_CANCEL_MPID);
            case 255 -> Optional.of(INVALID_TARGET_CANCEL_SENDER_COMP_ID);
            case 256 -> Optional.of(CLEAR_THE_BOOK_PREV_ENTERED);
            case 257 -> Optional.of(TIMER_EXPIRED_API_ALLOCATION);
            case 258 -> Optional.of(INVALID_NUMBER_OF_QUOTES);
            case 259 -> Optional.of(INVALID_ORDER_ID);
            case 260 -> Optional.of(RISK_CONTROL_EVENT);
            case 261 -> Optional.of(TO_REJECTED);
            case 262 -> Optional.of(CANCELLED_CORPORATE_ACTION);
            case 263 -> Optional.of(TOO_LATE_TO_REPLACE);
            case 264 -> Optional.of(INVALID_REF_DELTA);
            case 265 -> Optional.of(INVALID_STOCK_PRICE);
            case 266 -> Optional.of(RESERVED_FOR_FUTURE_USE_266);
            case 267 -> Optional.of(INVALID_TIED_TO_STOCK);
            case 268 -> Optional.of(TOO_LATE_TO_ALLOCATE);
            case 269 -> Optional.of(CUSTOMER_INTEREST_ON_BBO);
            case 270 -> Optional.of(IDO_CANNOT_BE_MODIFIED);
            case 271 -> Optional.of(CROSS_OUTSIDE_BBO);
            case 272 -> Optional.of(PENDING_TO_APPROVAL);
            case 273 -> Optional.of(INVALID_LEG_OPEN_CLOSE);
            case 274 -> Optional.of(INVALID_RISK_CONTROL_TYPE);
            case 275 -> Optional.of(INVALID_RISK_CONTROL_ACTIVATION);
            case 276 -> Optional.of(INVALID_BREACH_ACTION_REQUEST);
            case 277 -> Optional.of(INVALID_IOC_ATTRIBUTION);
            case 278 -> Optional.of(INVALID_RISK_ACTION_TYPE);
            case 279 -> Optional.of(INVALID_USD_LIMIT);
            case 280 -> Optional.of(IDO_ALREADY_EXISTS);
            case 281 -> Optional.of(INVALID_TIME_LIMIT);
            case 282 -> Optional.of(INVALID_PERCENTAGE_LIMIT);
            case 283 -> Optional.of(INVALID_COUNT_LIMIT);
            case 284 -> Optional.of(RISK_ROLL_TRANSACT_BREACH);
            case 285 -> Optional.of(RISK_ROLL_VOL_BREACH);
            case 286 -> Optional.of(RISK_ROLL_PCT_BREACH);
            case 287 -> Optional.of(RISK_ROLL_GRMP_BREACH);
            case 288 -> Optional.of(RISK_MM_ARBITRAGE_BREACH);
            case 289 -> Optional.of(RISK_MM_INTRINSIC_BREACH);
            case 290 -> Optional.of(IDO_MUST_EXIST);
            case 291 -> Optional.of(INVALID_ALLOCATION_TAG);
            case 292 -> Optional.of(INVALID_TRADE_TAG);
            case 293 -> Optional.of(ARBITRAGE_CHECK);
            case 294 -> Optional.of(INTRINSIC_VALUE_CHECK);
            case 295 -> Optional.of(CREDIT_DEBIT_CHECK);
            case 296 -> Optional.of(INVALID_RISK_USER);
            case 297 -> Optional.of(INVALID_RISK_ENTITY);
            case 298 -> Optional.of(INVALID_FLEX_SERIES_ALREADY_EXISTS);
            case 299 -> Optional.of(INVALID_FLEX_SERIES_KEY);
            case 300 -> Optional.of(INVALID_CLEAR_THE_BOOK);
            case 301 -> Optional.of(INVALID_STOCK_QTY);
            case 302 -> Optional.of(INVALID_PACKAGE_LINK_ID);
            case 303 -> Optional.of(COMPLEX_MAX_SERIES_BREACH);
            case 304 -> Optional.of(INVALID_FLEX_EOD_TAG);
            case 305 -> Optional.of(INVALID_PERCENTAGE_PRICE);
            case 999 -> Optional.of(UNKNOWN_ISSUE_ENCOUNTERED);
            default -> Optional.empty();
        };
    }
}
