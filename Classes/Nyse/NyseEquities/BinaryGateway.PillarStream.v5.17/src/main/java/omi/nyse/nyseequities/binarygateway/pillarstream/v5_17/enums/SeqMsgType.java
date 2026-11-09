package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum SeqMsgType {

    /**
     * This message may be sent by the firm to change their configuration settings for a given gateway session, as defined by its Username). If accepted by the gateway, the updated settings will be applied on a go forward basis only.
     */
    SESSION_CONFIGURATION_REQUEST_MESSAGE(544, "This message may be sent by the firm to change their configuration settings for a given gateway session, as defined by its Username). If accepted by the gateway, the updated settings will be applied on a go forward basis only."),

    /**
     * This message type is used to increase the next expected sequence number of a TG stream by 1 on a given gateway session.
     */
    SEQUENCED_FILLER_MESSAGE(642, "This message type is used to increase the next expected sequence number of a TG stream by 1 on a given gateway session."),

    /**
     * This message type is used as both a New Order message or a Cancel/Replacement message
     */
    NEW_ORDER_SINGLE_AND_CANCEL_REPLACE_REQUEST_MESSAGE(576, "This message type is used as both a New Order message or a Cancel/Replacement message"),

    /**
     * This message is used to cancel a single targeted order. Populate the field OrigClOrdID with the ClOrdID of the order intended for cancellation.
     */
    ORDER_CANCEL_REQUEST_MESSAGE(640, "This message is used to cancel a single targeted order. Populate the field OrigClOrdID with the ClOrdID of the order intended for cancellation."),

    /**
     * This message is used to reduce the total order quantity or change the side of an existing order between Sell, Sell Short, and Sell Short Exempt while preserving the order’s ranking and original OrderID. The modified order receives a new ClOrdID equal to the ClOrdID of the Modify Request. Reducing the total quantity to 0 will cancel the order.
     */
    ORDER_MODIFY_REQUEST_MESSAGE(624, "This message is used to reduce the total order quantity or change the side of an existing order between Sell, Sell Short, and Sell Short Exempt while preserving the order\u2019s ranking and original OrderID. The modified order receives a new ClOrdID equal to the ClOrdID of the Modify Request. Reducing the total quantity to 0 will cancel the order."),

    /**
     * This message is used to bulk cancel multiple orders based on the specified combination of criteria. MPID must be valid for the session. Depending on BulkCancelType, cancellation may apply at the session or MPID level. Certain order types are always excluded from bulk cancellation.
     */
    BULK_CANCEL_REQUEST_MESSAGE(641, "This message is used to bulk cancel multiple orders based on the specified combination of criteria. MPID must be valid for the session. Depending on BulkCancelType, cancellation may apply at the session or MPID level. Certain order types are always excluded from bulk cancellation."),

    /**
     * This message is sent by a NYSE Designated Market Maker to designate a gateway session to receive auction price data, auction requests, manual action requests, and echo messages of DMM manual order activity for a specified symbol.
     */
    SYMBOL_SUBSCRIPTION_REQUEST_MESSAGE(838, "This message is sent by a NYSE Designated Market Maker to designate a gateway session to receive auction price data, auction requests, manual action requests, and echo messages of DMM manual order activity for a specified symbol."),

    /**
     * This is used to define the beginning boundary of a multi-message originating from the firm, which is a sequence of messages that is intended to be read and processed atomically by Pillar.
     */
    TG_BEGIN_MESSAGE(835, "This is used to define the beginning boundary of a multi-message originating from the firm, which is a sequence of messages that is intended to be read and processed atomically by Pillar."),

    /**
     * This is used to define the ending boundary of a multi-message, which is a set of messages originating from the firm that is intended to be read and processed atomically by Pillar.
     */
    TG_END_MESSAGE(836, "This is used to define the ending boundary of a multi-message, which is a set of messages originating from the firm that is intended to be read and processed atomically by Pillar."),

    /**
     * Response message used by a DMM to approve or reject a Manual Action Request. Depending on the ManualResponseType, this message may result in order creation or rejection with an optional reject reason.
     */
    MANUAL_ACTION_RESPONSE_MESSAGE(852, "Response message used by a DMM to approve or reject a Manual Action Request. Depending on the ManualResponseType, this message may result in order creation or rejection with an optional reject reason."),

    /**
     * Risk limit update request used by Risk Admin to configure or update risk controls for a specified risk entity. Field applicability depends on RiskControlType; non-applicable fields should be set to 0 or ignored as documented.
     */
    RISK_LIMIT_UPDATE_REQUEST_MESSAGE(816, "Risk limit update request used by Risk Admin to configure or update risk controls for a specified risk entity. Field applicability depends on RiskControlType; non-applicable fields should be set to 0 or ignored as documented."),

    /**
     * Risk Action Request Message
     */
    RISK_ACTION_REQUEST_MESSAGE(817, "Risk Action Request Message"),

    /**
     * This message is published for each security traded on the market for which a gateway session is configured to trade and provides the information needed to enter orders for those securities.
     */
    EQUITIES_SYMBOL_REFERENCE_DATA_MESSAGE(562, "This message is published for each security traded on the market for which a gateway session is configured to trade and provides the information needed to enter orders for those securities."),

    /**
     * DMM Symbol Reference Data
     */
    DMM_SYMBOL_REFERENCE_DATA_MESSAGE(2098, "DMM Symbol Reference Data"),

    /**
     * Defines a single Minimum Price Variant (MPV) Class by name and identification number and provides attributes belonging to that class.
     */
    MINIMUM_PRICE_VARIANT_CLASS_REFERENCE_DATA_MESSAGE(560, "Defines a single Minimum Price Variant (MPV) Class by name and identification number and provides attributes belonging to that class."),

    /**
     * Defines one or more Minimum Price Variant (MPV) Levels within a single MPV Class. Each embedded MPVLevelDefinition structure defines a single MPV Level.
     */
    MINIMUM_PRICE_VARIANT_LEVEL_REFERENCE_DATA_MESSAGE(561, "Defines one or more Minimum Price Variant (MPV) Levels within a single MPV Class. Each embedded MPVLevelDefinition structure defines a single MPV Level."),

    /**
     * This message is published for each MPID configured on a gateway session and indicates the current status of the MPID.
     */
    MPID_CONFIGURATION_MESSAGE(626, "This message is published for each MPID configured on a gateway session and indicates the current status of the MPID."),

    /**
     * This message is published for each MMID configured on a gateway session and provides the character representation of a Market Maker and the integer MMID value assigned to it.
     */
    MMID_CONFIGURATION_MESSAGE(627, "This message is published for each MMID configured on a gateway session and provides the character representation of a Market Maker and the integer MMID value assigned to it."),

    /**
     * Indicates the current configured settings for the gateway session.
     */
    SESSION_CONFIGURATION_ACKNOWLEDGEMENT_MESSAGE(545, "Indicates the current configured settings for the gateway session."),

    /**
     * Exchange acknowledgement in response to an Order or Cancel/Replace request.
     */
    ORDER_AND_CANCEL_REPLACE_ACKNOWLEDGEMENT_MESSAGE(608, "Exchange acknowledgement in response to an Order or Cancel/Replace request."),

    /**
     * Used as a Modify Request Acknowledgement, Cancel Request Acknowledgement, UROUT, and Billable Cancel, distinguished by AckType.
     */
    ORDER_MODIFY_CANCEL_REQUEST_ACKNOWLEDGMENT_AND_UROUT_MESSAGE(625, "Used as a Modify Request Acknowledgement, Cancel Request Acknowledgement, UROUT, and Billable Cancel, distinguished by AckType."),

    /**
     * Unsolicited message sent by the Exchange to notify the firm of a Reserve Order replenishment event. The displayed portion of a Reserve Order has been replenished according to MaxFloor and assigned a new OrderID.
     */
    ORDER_PRIORITY_UPDATE_ACKNOWLEDGMENT_MESSAGE(610, "Unsolicited message sent by the Exchange to notify the firm of a Reserve Order replenishment event. The displayed portion of a Reserve Order has been replenished according to MaxFloor and assigned a new OrderID."),

    /**
     * Returned on executions for Orders and indicates whether an order has been partially or entirely filled.
     */
    EXECUTION_REPORT_MESSAGE(656, "Returned on executions for Orders and indicates whether an order has been partially or entirely filled."),

    /**
     * This message is sent as a result of a report bust or correction (NYSE Texas only).
     */
    TRADE_BUST_CORRECT_MESSAGE(658, "This message is sent as a result of a report bust or correction (NYSE Texas only)."),

    /**
     * This message informs the firm that a New Order, Cancel, Cancel/Replace, or Modify request has been rejected. For NYSE DMM sessions it is also used to reject TG Action and Manual Action Response.
     */
    APPLICATION_LAYER_REJECT_MESSAGE(611, "This message informs the firm that a New Order, Cancel, Cancel/Replace, or Modify request has been rejected. For NYSE DMM sessions it is also used to reject TG Action and Manual Action Response."),

    /**
     * Response to a Symbol Subscription Request indicating whether the DMM session is subscribed to the symbol.
     */
    SYMBOL_SUBSCRIPTION_ACKNOWLEDGEMENT_MESSAGE(839, "Response to a Symbol Subscription Request indicating whether the DMM session is subscribed to the symbol."),

    /**
     * Defines the beginning boundary of a multi-message sequence originating from Pillar that must be processed atomically by the firm.
     */
    GT_BEGIN_MESSAGE(841, "Defines the beginning boundary of a multi-message sequence originating from Pillar that must be processed atomically by the firm."),

    /**
     * Defines the ending boundary of a multi-message sequence originating from Pillar that must be processed atomically by the firm.
     */
    GT_END_MESSAGE(848, "Defines the ending boundary of a multi-message sequence originating from Pillar that must be processed atomically by the firm."),

    /**
     * Provides opening, re-opening, and closing auction imbalance and DMM interest information at each eligible auction price point. Sent as part of a multi-message between GT Begin and GT End.
     */
    AUCTION_PRICE_DATA_MESSAGE(850, "Provides opening, re-opening, and closing auction imbalance and DMM interest information at each eligible auction price point. Sent as part of a multi-message between GT Begin and GT End."),

    /**
     * Request from Pillar to open, re-open, or close a symbol with an auction trade.
     */
    AUCTION_REQUEST_MESSAGE(840, "Request from Pillar to open, re-open, or close a symbol with an auction trade."),

    /**
     * Manual action details initiated by a DMM on the NYSE Trading Floor via DBK GUI.
     */
    MANUAL_ACTION_REQUEST_MESSAGE(851, "Manual action details initiated by a DMM on the NYSE Trading Floor via DBK GUI."),

    /**
     * Provides current configurations and calculations of a Risk Entity for Pillar Risk Controls.
     */
    RISK_CONTROL_ACKNOWLEDGEMENT_MESSAGE(818, "Provides current configurations and calculations of a Risk Entity for Pillar Risk Controls."),

    /**
     * Provides notification of threshold or breach events, reinstatement events, and kill switch actions for firms using Pillar Risk Controls.
     */
    RISK_CONTROL_ALERT_MESSAGE(819, "Provides notification of threshold or breach events, reinstatement events, and kill switch actions for firms using Pillar Risk Controls.");

    private final int wire;

    private final String description;

    SeqMsgType(int wire, String description) {
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
    public static Optional<SeqMsgType> fromWire(int wire) {
        return switch (wire) {
            case 544 -> Optional.of(SESSION_CONFIGURATION_REQUEST_MESSAGE);
            case 642 -> Optional.of(SEQUENCED_FILLER_MESSAGE);
            case 576 -> Optional.of(NEW_ORDER_SINGLE_AND_CANCEL_REPLACE_REQUEST_MESSAGE);
            case 640 -> Optional.of(ORDER_CANCEL_REQUEST_MESSAGE);
            case 624 -> Optional.of(ORDER_MODIFY_REQUEST_MESSAGE);
            case 641 -> Optional.of(BULK_CANCEL_REQUEST_MESSAGE);
            case 838 -> Optional.of(SYMBOL_SUBSCRIPTION_REQUEST_MESSAGE);
            case 835 -> Optional.of(TG_BEGIN_MESSAGE);
            case 836 -> Optional.of(TG_END_MESSAGE);
            case 852 -> Optional.of(MANUAL_ACTION_RESPONSE_MESSAGE);
            case 816 -> Optional.of(RISK_LIMIT_UPDATE_REQUEST_MESSAGE);
            case 817 -> Optional.of(RISK_ACTION_REQUEST_MESSAGE);
            case 562 -> Optional.of(EQUITIES_SYMBOL_REFERENCE_DATA_MESSAGE);
            case 2098 -> Optional.of(DMM_SYMBOL_REFERENCE_DATA_MESSAGE);
            case 560 -> Optional.of(MINIMUM_PRICE_VARIANT_CLASS_REFERENCE_DATA_MESSAGE);
            case 561 -> Optional.of(MINIMUM_PRICE_VARIANT_LEVEL_REFERENCE_DATA_MESSAGE);
            case 626 -> Optional.of(MPID_CONFIGURATION_MESSAGE);
            case 627 -> Optional.of(MMID_CONFIGURATION_MESSAGE);
            case 545 -> Optional.of(SESSION_CONFIGURATION_ACKNOWLEDGEMENT_MESSAGE);
            case 608 -> Optional.of(ORDER_AND_CANCEL_REPLACE_ACKNOWLEDGEMENT_MESSAGE);
            case 625 -> Optional.of(ORDER_MODIFY_CANCEL_REQUEST_ACKNOWLEDGMENT_AND_UROUT_MESSAGE);
            case 610 -> Optional.of(ORDER_PRIORITY_UPDATE_ACKNOWLEDGMENT_MESSAGE);
            case 656 -> Optional.of(EXECUTION_REPORT_MESSAGE);
            case 658 -> Optional.of(TRADE_BUST_CORRECT_MESSAGE);
            case 611 -> Optional.of(APPLICATION_LAYER_REJECT_MESSAGE);
            case 839 -> Optional.of(SYMBOL_SUBSCRIPTION_ACKNOWLEDGEMENT_MESSAGE);
            case 841 -> Optional.of(GT_BEGIN_MESSAGE);
            case 848 -> Optional.of(GT_END_MESSAGE);
            case 850 -> Optional.of(AUCTION_PRICE_DATA_MESSAGE);
            case 840 -> Optional.of(AUCTION_REQUEST_MESSAGE);
            case 851 -> Optional.of(MANUAL_ACTION_REQUEST_MESSAGE);
            case 818 -> Optional.of(RISK_CONTROL_ACKNOWLEDGEMENT_MESSAGE);
            case 819 -> Optional.of(RISK_CONTROL_ALERT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
