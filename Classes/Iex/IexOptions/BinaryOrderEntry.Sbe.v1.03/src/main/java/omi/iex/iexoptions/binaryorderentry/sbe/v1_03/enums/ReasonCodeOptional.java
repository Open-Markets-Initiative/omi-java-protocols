package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.enums;

import java.util.Optional;

/**
 * reasonCode
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ReasonCodeOptional {

    /**
     * UnknownInstrumentIdentifier
     */
    UNKNOWN_INSTRUMENT_IDENTIFIER((short) 1, "UnknownInstrumentIdentifier"),

    /**
     * InvalidOrdType
     */
    INVALID_ORD_TYPE((short) 2, "InvalidOrdType"),

    /**
     * InvalidSide
     */
    INVALID_SIDE((short) 3, "InvalidSide"),

    /**
     * InvalidTimeInForce
     */
    INVALID_TIME_IN_FORCE((short) 4, "InvalidTimeInForce"),

    /**
     * InvalidOpenClose
     */
    INVALID_OPEN_CLOSE((short) 5, "InvalidOpenClose"),

    /**
     * InvalidCustomerOrFirm
     */
    INVALID_CUSTOMER_OR_FIRM((short) 6, "InvalidCustomerOrFirm"),

    /**
     * InvalidDisplayInst
     */
    INVALID_DISPLAY_INST((short) 7, "InvalidDisplayInst"),

    /**
     * InvalidAttributedQuote
     */
    INVALID_ATTRIBUTED_QUOTE((short) 8, "InvalidAttributedQuote"),

    /**
     * InvalidExecInst
     */
    INVALID_EXEC_INST((short) 9, "InvalidExecInst"),

    /**
     * InvalidCancelInsteadOfSlide
     */
    INVALID_CANCEL_INSTEAD_OF_SLIDE((short) 10, "InvalidCancelInsteadOfSlide"),

    /**
     * InvalidOrderQty
     */
    INVALID_ORDER_QTY((short) 11, "InvalidOrderQty"),

    /**
     * ClosingOnly
     */
    CLOSING_ONLY((short) 12, "ClosingOnly"),

    /**
     * NotAppointed
     */
    NOT_APPOINTED((short) 13, "NotAppointed"),

    /**
     * InvalidPrice
     */
    INVALID_PRICE((short) 14, "InvalidPrice"),

    /**
     * InvalidTagCombinationForMarketOrder
     */
    INVALID_TAG_COMBINATION_FOR_MARKET_ORDER((short) 15, "InvalidTagCombinationForMarketOrder"),

    /**
     * InvalidTagCombinationForIOC
     */
    INVALID_TAG_COMBINATION_FOR_IOC((short) 16, "InvalidTagCombinationForIOC"),

    /**
     * InvalidAIQ
     */
    INVALID_AIQ((short) 17, "InvalidAIQ"),

    /**
     * AIQCancelNewest
     */
    AIQ_CANCEL_NEWEST((short) 18, "AIQCancelNewest"),

    /**
     * AIQCancelOldest
     */
    AIQ_CANCEL_OLDEST((short) 19, "AIQCancelOldest"),

    /**
     * AIQCancelSmallest
     */
    AIQ_CANCEL_SMALLEST((short) 20, "AIQCancelSmallest"),

    /**
     * AIQCancelBoth
     */
    AIQ_CANCEL_BOTH((short) 21, "AIQCancelBoth"),

    /**
     * NoOrderFound
     */
    NO_ORDER_FOUND((short) 22, "NoOrderFound"),

    /**
     * OrderInPendingState
     */
    ORDER_IN_PENDING_STATE((short) 23, "OrderInPendingState"),

    /**
     * OrderTerminal
     */
    ORDER_TERMINAL((short) 24, "OrderTerminal"),

    /**
     * NoBid
     */
    NO_BID((short) 25, "NoBid"),

    /**
     * NoOffer
     */
    NO_OFFER((short) 26, "NoOffer"),

    /**
     * OrderNotMarketable
     */
    ORDER_NOT_MARKETABLE((short) 27, "OrderNotMarketable"),

    /**
     * OrderWouldLockCross
     */
    ORDER_WOULD_LOCK_CROSS((short) 28, "OrderWouldLockCross"),

    /**
     * InvalidQuoteCount
     */
    INVALID_QUOTE_COUNT((short) 29, "InvalidQuoteCount"),

    /**
     * InconsistentUnderlying
     */
    INCONSISTENT_UNDERLYING((short) 30, "InconsistentUnderlying"),

    /**
     * DuplicateQuote
     */
    DUPLICATE_QUOTE((short) 31, "DuplicateQuote"),

    /**
     * InvalidQuoteType
     */
    INVALID_QUOTE_TYPE((short) 32, "InvalidQuoteType"),

    /**
     * InvalidBulkAction
     */
    INVALID_BULK_ACTION((short) 33, "InvalidBulkAction"),

    /**
     * InvalidBulkActionParameters
     */
    INVALID_BULK_ACTION_PARAMETERS((short) 34, "InvalidBulkActionParameters"),

    /**
     * InvalidCustomGroupId
     */
    INVALID_CUSTOM_GROUP_ID((short) 35, "InvalidCustomGroupId"),

    /**
     * BlockedUnderlyingId
     */
    BLOCKED_UNDERLYING_ID((short) 36, "BlockedUnderlyingId"),

    /**
     * OrderWillBeCanceled
     */
    ORDER_WILL_BE_CANCELED((short) 37, "OrderWillBeCanceled"),

    /**
     * InvalidAckStyle
     */
    INVALID_ACK_STYLE((short) 38, "InvalidAckStyle"),

    /**
     * InvalidMPIDFilter
     */
    INVALID_MPID_FILTER((short) 39, "InvalidMPIDFilter"),

    /**
     * InvalidBlock
     */
    INVALID_BLOCK((short) 40, "InvalidBlock"),

    /**
     * InvalidRiskControl
     */
    INVALID_RISK_CONTROL((short) 41, "InvalidRiskControl"),

    /**
     * InvalidRiskActionType
     */
    INVALID_RISK_ACTION_TYPE((short) 42, "InvalidRiskActionType"),

    /**
     * InvalidUnblockParameters
     */
    INVALID_UNBLOCK_PARAMETERS((short) 43, "InvalidUnblockParameters"),

    /**
     * InvalidClOrdId
     */
    INVALID_CL_ORD_ID((short) 44, "InvalidClOrdId"),

    /**
     * InvalidMarketParticipantId
     */
    INVALID_MARKET_PARTICIPANT_ID((short) 45, "InvalidMarketParticipantId"),

    /**
     * InvalidNbboWidth
     */
    INVALID_NBBO_WIDTH((short) 46, "InvalidNbboWidth"),

    /**
     * MissingClearingAccount
     */
    MISSING_CLEARING_ACCOUNT((short) 47, "MissingClearingAccount"),

    /**
     * InvalidClearingAccount
     */
    INVALID_CLEARING_ACCOUNT((short) 48, "InvalidClearingAccount"),

    /**
     * InvalidAccount
     */
    INVALID_ACCOUNT((short) 49, "InvalidAccount"),

    /**
     * QuoteNotMarketable
     */
    QUOTE_NOT_MARKETABLE((short) 50, "QuoteNotMarketable"),

    /**
     * ConstrainedByDrillThroughProtection
     */
    CONSTRAINED_BY_DRILL_THROUGH_PROTECTION((short) 51, "ConstrainedByDrillThroughProtection"),

    /**
     * InvalidOptionalData
     */
    INVALID_OPTIONAL_DATA((short) 52, "InvalidOptionalData"),

    /**
     * DrillThroughProtectionCancel
     */
    DRILL_THROUGH_PROTECTION_CANCEL((short) 53, "DrillThroughProtectionCancel"),

    /**
     * RiskBreach
     */
    RISK_BREACH((short) 54, "RiskBreach"),

    /**
     * InternalError
     */
    INTERNAL_ERROR((short) 55, "InternalError"),

    /**
     * BlockedCustomGroupId
     */
    BLOCKED_CUSTOM_GROUP_ID((short) 56, "BlockedCustomGroupId"),

    /**
     * OrpReject
     */
    ORP_REJECT((short) 57, "OrpReject"),

    /**
     * QuoteNotFound
     */
    QUOTE_NOT_FOUND((short) 58, "QuoteNotFound"),

    /**
     * TooLateToCancel
     */
    TOO_LATE_TO_CANCEL((short) 59, "TooLateToCancel"),

    /**
     * InvalidOrpRepriceCheck
     */
    INVALID_ORP_REPRICE_CHECK((short) 60, "InvalidOrpRepriceCheck"),

    /**
     * ContraMMInterest
     */
    CONTRA_MM_INTEREST((short) 61, "ContraMMInterest"),

    /**
     * MarketClosed
     */
    MARKET_CLOSED((short) 62, "MarketClosed"),

    /**
     * MarketSuspended
     */
    MARKET_SUSPENDED((short) 63, "MarketSuspended"),

    /**
     * InvalidIOCForNonContinuous
     */
    INVALID_IOC_FOR_NON_CONTINUOUS((short) 64, "InvalidIOCForNonContinuous"),

    /**
     * LimitUpLimitDown
     */
    LIMIT_UP_LIMIT_DOWN((short) 65, "LimitUpLimitDown"),

    /**
     * InvalidRiskControlStatus
     */
    INVALID_RISK_CONTROL_STATUS((short) 66, "InvalidRiskControlStatus"),

    /**
     * InvalidTimeLimit
     */
    INVALID_TIME_LIMIT((short) 67, "InvalidTimeLimit"),

    /**
     * InvalidPercentageLimit
     */
    INVALID_PERCENTAGE_LIMIT((short) 68, "InvalidPercentageLimit"),

    /**
     * InvalidCountLimit
     */
    INVALID_COUNT_LIMIT((short) 69, "InvalidCountLimit"),

    /**
     * InvalidIOCAttribution
     */
    INVALID_IOC_ATTRIBUTION((short) 70, "InvalidIOCAttribution"),

    /**
     * CancelRemainingIOC
     */
    CANCEL_REMAINING_IOC((short) 71, "CancelRemainingIOC"),

    /**
     * NoMarketForMarketOrder
     */
    NO_MARKET_FOR_MARKET_ORDER((short) 72, "NoMarketForMarketOrder"),

    /**
     * GrmpBlock
     */
    GRMP_BLOCK((short) 73, "GrmpBlock"),

    /**
     * FullyFilled
     */
    FULLY_FILLED((short) 74, "FullyFilled"),

    /**
     * InvalidAuctionId
     */
    INVALID_AUCTION_ID((short) 75, "InvalidAuctionId"),

    /**
     * InvalidResponseOrderQty
     */
    INVALID_RESPONSE_ORDER_QTY((short) 76, "InvalidResponseOrderQty"),

    /**
     * SUMComplete
     */
    SUM_COMPLETE((short) 77, "SUMComplete"),

    /**
     * LimitOrderPriceProtectionBreach
     */
    LIMIT_ORDER_PRICE_PROTECTION_BREACH((short) 78, "LimitOrderPriceProtectionBreach"),

    /**
     * IntrinsicValueBreach
     */
    INTRINSIC_VALUE_BREACH((short) 79, "IntrinsicValueBreach"),

    /**
     * InvalidUnderlyingId
     */
    INVALID_UNDERLYING_ID((short) 80, "InvalidUnderlyingId"),

    /**
     * MarketHalt
     */
    MARKET_HALT((short) 81, "MarketHalt"),

    /**
     * MarketOrderMaxNotionalBreach
     */
    MARKET_ORDER_MAX_NOTIONAL_BREACH((short) 82, "MarketOrderMaxNotionalBreach"),

    /**
     * InvalidTargetPartyId
     */
    INVALID_TARGET_PARTY_ID((short) 83, "InvalidTargetPartyId"),

    /**
     * InvalidRoutingFirmId
     */
    INVALID_ROUTING_FIRM_ID((short) 84, "InvalidRoutingFirmId"),

    /**
     * OpeningProcessCancel
     */
    OPENING_PROCESS_CANCEL((short) 85, "OpeningProcessCancel"),

    /**
     * QuoteWouldLockCross
     */
    QUOTE_WOULD_LOCK_CROSS((short) 86, "QuoteWouldLockCross"),

    /**
     * InvalidClearingFirm
     */
    INVALID_CLEARING_FIRM((short) 87, "InvalidClearingFirm"),

    /**
     * DuplicateClOrdId
     */
    DUPLICATE_CL_ORD_ID((short) 88, "DuplicateClOrdId"),

    /**
     * InvalidOrigClOrdId
     */
    INVALID_ORIG_CL_ORD_ID((short) 89, "InvalidOrigClOrdId"),

    /**
     * UnknownOrigClOrdId
     */
    UNKNOWN_ORIG_CL_ORD_ID((short) 90, "UnknownOrigClOrdId"),

    /**
     * InvalidOnBehalfOfCompId
     */
    INVALID_ON_BEHALF_OF_COMP_ID((short) 91, "InvalidOnBehalfOfCompId"),

    /**
     * DisallowedMarketOrders
     */
    DISALLOWED_MARKET_ORDERS((short) 92, "DisallowedMarketOrders"),

    /**
     * DisallowedIsoIocOrders
     */
    DISALLOWED_ISO_IOC_ORDERS((short) 93, "DisallowedIsoIocOrders"),

    /**
     * DisallowedIsoDayOrders
     */
    DISALLOWED_ISO_DAY_ORDERS((short) 94, "DisallowedIsoDayOrders"),

    /**
     * RestrictedSymbol
     */
    RESTRICTED_SYMBOL((short) 95, "RestrictedSymbol"),

    /**
     * CancelOnDisconnect
     */
    CANCEL_ON_DISCONNECT((short) 96, "CancelOnDisconnect"),

    /**
     * InvalidSendTime
     */
    INVALID_SEND_TIME((short) 97, "InvalidSendTime"),

    /**
     * InvalidCustCapacityWeight
     */
    INVALID_CUST_CAPACITY_WEIGHT((short) 98, "InvalidCustCapacityWeight"),

    /**
     * MaxDuplicative
     */
    MAX_DUPLICATIVE((short) 99, "MaxDuplicative"),

    /**
     * MPIDBlocked
     */
    MPID_BLOCKED((short) 100, "MPIDBlocked"),

    /**
     * QuoteCanceled
     */
    QUOTE_CANCELED((short) 101, "QuoteCanceled"),

    /**
     * InvalidCustomGroupIdCount
     */
    INVALID_CUSTOM_GROUP_ID_COUNT((short) 102, "InvalidCustomGroupIdCount"),

    /**
     * GrmpTrip
     */
    GRMP_TRIP((short) 103, "GrmpTrip"),

    /**
     * MaxQtyExceeded
     */
    MAX_QTY_EXCEEDED((short) 104, "MaxQtyExceeded"),

    /**
     * MaxNotionalExceeded
     */
    MAX_NOTIONAL_EXCEEDED((short) 105, "MaxNotionalExceeded"),

    /**
     * OccIdentifierNotConfigured
     */
    OCC_IDENTIFIER_NOT_CONFIGURED((short) 106, "OccIdentifierNotConfigured"),

    /**
     * ArbitrageBreach
     */
    ARBITRAGE_BREACH((short) 107, "ArbitrageBreach"),

    /**
     * ABRCBreach
     */
    ABRC_BREACH((short) 108, "ABRCBreach"),

    /**
     * AdminCancel
     */
    ADMIN_CANCEL((short) 109, "AdminCancel"),

    /**
     * InvalidReserved
     */
    INVALID_RESERVED((short) 110, "InvalidReserved"),

    /**
     * NBBOFade
     */
    NBBO_FADE((short) 111, "NBBOFade"),

    /**
     * LockedOrCrossedByAway
     */
    LOCKED_OR_CROSSED_BY_AWAY((short) 112, "LockedOrCrossedByAway"),

    /**
     * SUMTimeout
     */
    SUM_TIMEOUT((short) 113, "SUMTimeout"),

    /**
     * PortalCancelExternal
     */
    PORTAL_CANCEL_EXTERNAL((short) 114, "PortalCancelExternal"),

    /**
     * PortalCancelInternal
     */
    PORTAL_CANCEL_INTERNAL((short) 115, "PortalCancelInternal"),

    /**
     * reasonCode
     */
    NO_VALUE((short) 255, "reasonCode");

    private final short wire;

    private final String description;

    ReasonCodeOptional(short wire, String description) {
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
    public static Optional<ReasonCodeOptional> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(UNKNOWN_INSTRUMENT_IDENTIFIER);
            case 2 -> Optional.of(INVALID_ORD_TYPE);
            case 3 -> Optional.of(INVALID_SIDE);
            case 4 -> Optional.of(INVALID_TIME_IN_FORCE);
            case 5 -> Optional.of(INVALID_OPEN_CLOSE);
            case 6 -> Optional.of(INVALID_CUSTOMER_OR_FIRM);
            case 7 -> Optional.of(INVALID_DISPLAY_INST);
            case 8 -> Optional.of(INVALID_ATTRIBUTED_QUOTE);
            case 9 -> Optional.of(INVALID_EXEC_INST);
            case 10 -> Optional.of(INVALID_CANCEL_INSTEAD_OF_SLIDE);
            case 11 -> Optional.of(INVALID_ORDER_QTY);
            case 12 -> Optional.of(CLOSING_ONLY);
            case 13 -> Optional.of(NOT_APPOINTED);
            case 14 -> Optional.of(INVALID_PRICE);
            case 15 -> Optional.of(INVALID_TAG_COMBINATION_FOR_MARKET_ORDER);
            case 16 -> Optional.of(INVALID_TAG_COMBINATION_FOR_IOC);
            case 17 -> Optional.of(INVALID_AIQ);
            case 18 -> Optional.of(AIQ_CANCEL_NEWEST);
            case 19 -> Optional.of(AIQ_CANCEL_OLDEST);
            case 20 -> Optional.of(AIQ_CANCEL_SMALLEST);
            case 21 -> Optional.of(AIQ_CANCEL_BOTH);
            case 22 -> Optional.of(NO_ORDER_FOUND);
            case 23 -> Optional.of(ORDER_IN_PENDING_STATE);
            case 24 -> Optional.of(ORDER_TERMINAL);
            case 25 -> Optional.of(NO_BID);
            case 26 -> Optional.of(NO_OFFER);
            case 27 -> Optional.of(ORDER_NOT_MARKETABLE);
            case 28 -> Optional.of(ORDER_WOULD_LOCK_CROSS);
            case 29 -> Optional.of(INVALID_QUOTE_COUNT);
            case 30 -> Optional.of(INCONSISTENT_UNDERLYING);
            case 31 -> Optional.of(DUPLICATE_QUOTE);
            case 32 -> Optional.of(INVALID_QUOTE_TYPE);
            case 33 -> Optional.of(INVALID_BULK_ACTION);
            case 34 -> Optional.of(INVALID_BULK_ACTION_PARAMETERS);
            case 35 -> Optional.of(INVALID_CUSTOM_GROUP_ID);
            case 36 -> Optional.of(BLOCKED_UNDERLYING_ID);
            case 37 -> Optional.of(ORDER_WILL_BE_CANCELED);
            case 38 -> Optional.of(INVALID_ACK_STYLE);
            case 39 -> Optional.of(INVALID_MPID_FILTER);
            case 40 -> Optional.of(INVALID_BLOCK);
            case 41 -> Optional.of(INVALID_RISK_CONTROL);
            case 42 -> Optional.of(INVALID_RISK_ACTION_TYPE);
            case 43 -> Optional.of(INVALID_UNBLOCK_PARAMETERS);
            case 44 -> Optional.of(INVALID_CL_ORD_ID);
            case 45 -> Optional.of(INVALID_MARKET_PARTICIPANT_ID);
            case 46 -> Optional.of(INVALID_NBBO_WIDTH);
            case 47 -> Optional.of(MISSING_CLEARING_ACCOUNT);
            case 48 -> Optional.of(INVALID_CLEARING_ACCOUNT);
            case 49 -> Optional.of(INVALID_ACCOUNT);
            case 50 -> Optional.of(QUOTE_NOT_MARKETABLE);
            case 51 -> Optional.of(CONSTRAINED_BY_DRILL_THROUGH_PROTECTION);
            case 52 -> Optional.of(INVALID_OPTIONAL_DATA);
            case 53 -> Optional.of(DRILL_THROUGH_PROTECTION_CANCEL);
            case 54 -> Optional.of(RISK_BREACH);
            case 55 -> Optional.of(INTERNAL_ERROR);
            case 56 -> Optional.of(BLOCKED_CUSTOM_GROUP_ID);
            case 57 -> Optional.of(ORP_REJECT);
            case 58 -> Optional.of(QUOTE_NOT_FOUND);
            case 59 -> Optional.of(TOO_LATE_TO_CANCEL);
            case 60 -> Optional.of(INVALID_ORP_REPRICE_CHECK);
            case 61 -> Optional.of(CONTRA_MM_INTEREST);
            case 62 -> Optional.of(MARKET_CLOSED);
            case 63 -> Optional.of(MARKET_SUSPENDED);
            case 64 -> Optional.of(INVALID_IOC_FOR_NON_CONTINUOUS);
            case 65 -> Optional.of(LIMIT_UP_LIMIT_DOWN);
            case 66 -> Optional.of(INVALID_RISK_CONTROL_STATUS);
            case 67 -> Optional.of(INVALID_TIME_LIMIT);
            case 68 -> Optional.of(INVALID_PERCENTAGE_LIMIT);
            case 69 -> Optional.of(INVALID_COUNT_LIMIT);
            case 70 -> Optional.of(INVALID_IOC_ATTRIBUTION);
            case 71 -> Optional.of(CANCEL_REMAINING_IOC);
            case 72 -> Optional.of(NO_MARKET_FOR_MARKET_ORDER);
            case 73 -> Optional.of(GRMP_BLOCK);
            case 74 -> Optional.of(FULLY_FILLED);
            case 75 -> Optional.of(INVALID_AUCTION_ID);
            case 76 -> Optional.of(INVALID_RESPONSE_ORDER_QTY);
            case 77 -> Optional.of(SUM_COMPLETE);
            case 78 -> Optional.of(LIMIT_ORDER_PRICE_PROTECTION_BREACH);
            case 79 -> Optional.of(INTRINSIC_VALUE_BREACH);
            case 80 -> Optional.of(INVALID_UNDERLYING_ID);
            case 81 -> Optional.of(MARKET_HALT);
            case 82 -> Optional.of(MARKET_ORDER_MAX_NOTIONAL_BREACH);
            case 83 -> Optional.of(INVALID_TARGET_PARTY_ID);
            case 84 -> Optional.of(INVALID_ROUTING_FIRM_ID);
            case 85 -> Optional.of(OPENING_PROCESS_CANCEL);
            case 86 -> Optional.of(QUOTE_WOULD_LOCK_CROSS);
            case 87 -> Optional.of(INVALID_CLEARING_FIRM);
            case 88 -> Optional.of(DUPLICATE_CL_ORD_ID);
            case 89 -> Optional.of(INVALID_ORIG_CL_ORD_ID);
            case 90 -> Optional.of(UNKNOWN_ORIG_CL_ORD_ID);
            case 91 -> Optional.of(INVALID_ON_BEHALF_OF_COMP_ID);
            case 92 -> Optional.of(DISALLOWED_MARKET_ORDERS);
            case 93 -> Optional.of(DISALLOWED_ISO_IOC_ORDERS);
            case 94 -> Optional.of(DISALLOWED_ISO_DAY_ORDERS);
            case 95 -> Optional.of(RESTRICTED_SYMBOL);
            case 96 -> Optional.of(CANCEL_ON_DISCONNECT);
            case 97 -> Optional.of(INVALID_SEND_TIME);
            case 98 -> Optional.of(INVALID_CUST_CAPACITY_WEIGHT);
            case 99 -> Optional.of(MAX_DUPLICATIVE);
            case 100 -> Optional.of(MPID_BLOCKED);
            case 101 -> Optional.of(QUOTE_CANCELED);
            case 102 -> Optional.of(INVALID_CUSTOM_GROUP_ID_COUNT);
            case 103 -> Optional.of(GRMP_TRIP);
            case 104 -> Optional.of(MAX_QTY_EXCEEDED);
            case 105 -> Optional.of(MAX_NOTIONAL_EXCEEDED);
            case 106 -> Optional.of(OCC_IDENTIFIER_NOT_CONFIGURED);
            case 107 -> Optional.of(ARBITRAGE_BREACH);
            case 108 -> Optional.of(ABRC_BREACH);
            case 109 -> Optional.of(ADMIN_CANCEL);
            case 110 -> Optional.of(INVALID_RESERVED);
            case 111 -> Optional.of(NBBO_FADE);
            case 112 -> Optional.of(LOCKED_OR_CROSSED_BY_AWAY);
            case 113 -> Optional.of(SUM_TIMEOUT);
            case 114 -> Optional.of(PORTAL_CANCEL_EXTERNAL);
            case 115 -> Optional.of(PORTAL_CANCEL_INTERNAL);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
