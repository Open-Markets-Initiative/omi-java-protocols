package omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * System Event message informs of a market or a session-level event.
     */
    SYSTEM_EVENT_MESSAGE('z', "System Event message informs of a market or a session-level event."),

    /**
     * At the start of each trading day and during intra-day market state changes, the system disseminates directory messages for all symbols trading on the system.
     */
    SIMPLE_INSTRUMENT_DIRECTORY_MESSAGE('o', "At the start of each trading day and during intra-day market state changes, the system disseminates directory messages for all symbols trading on the system."),

    /**
     * This message is sent whenever new complex strategy is created on the system. InstrumentId of a complex strategy is unique for the trading day across both simple and complex instruments.
     */
    COMPLEX_INSTRUMENT_DIRECTORY_MESSAGE('s', "This message is sent whenever new complex strategy is created on the system. InstrumentId of a complex strategy is unique for the trading day across both simple and complex instruments."),

    /**
     * This message notifies of changes to the trading status of an instrument.
     */
    INSTRUMENT_TRADING_ACTION_MESSAGE('i', "This message notifies of changes to the trading status of an instrument."),

    /**
     * Auction Notification message announces that a new Auction has started in the market for Nasdaq PHLX, ISE, GEMX and MRX. Auction orders include Block, Complex Exposure, Simple Exposed order, Facilitation, Solicitation, and PIM.
     */
    AUCTION_NOTIFICATION_MESSAGE('n', "Auction Notification message announces that a new Auction has started in the market for Nasdaq PHLX, ISE, GEMX and MRX. Auction orders include Block, Complex Exposure, Simple Exposed order, Facilitation, Solicitation, and PIM."),

    /**
     * Acknowledges the receipt and acceptance of a valid New Order (Long Form). The data fields from the New Order Message are echoed back. Order Accepted messages always come before any Order Executed or Order Canceled Messages for an order. Does not include Leg Prices or Auction Duration.
     */
    ORDER_ACCEPTED_LONG_FORM_MESSAGE('a', "Acknowledges the receipt and acceptance of a valid New Order (Long Form). The data fields from the New Order Message are echoed back. Order Accepted messages always come before any Order Executed or Order Canceled Messages for an order. Does not include Leg Prices or Auction Duration."),

    /**
     * This message is used to acknowledge a valid order submitted via New Order (Short Form).
     */
    ORDER_ACCEPTED_SHORT_FORM_MESSAGE('b', "This message is used to acknowledge a valid order submitted via New Order (Short Form)."),

    /**
     * Acknowledges a Replace Order request.
     */
    ORDER_REPLACED_MESSAGE('r', "Acknowledges a Replace Order request."),

    /**
     * An Order Canceled Message informs you that an order has been fully canceled. This could be acknowledging a Cancel Order Message, or it could be the result of the order being canceled automatically by the system.
     */
    ORDER_CANCELED_MESSAGE('c', "An Order Canceled Message informs you that an order has been fully canceled. This could be acknowledging a Cancel Order Message, or it could be the result of the order being canceled automatically by the system."),

    /**
     * Order Executed message reports an execution of an order for a simple instrument, a complex instrument, or an option or stock leg of a complex order.
     */
    ORDER_EXECUTED_MESSAGE('e', "Order Executed message reports an execution of an order for a simple instrument, a complex instrument, or an option or stock leg of a complex order."),

    /**
     * A Trade Details message contains additional details, specifically clearing information. This message is sent out with a nominal delay after Order Executed message. Trade Busts and Adjustments are made against individual MatchIds; Modify Trade results are reported with TransType B for the original trade and C for the new trades.
     */
    TRADE_DETAILS_MESSAGE('t', "A Trade Details message contains additional details, specifically clearing information. This message is sent out with a nominal delay after Order Executed message. Trade Busts and Adjustments are made against individual MatchIds; Modify Trade results are reported with TransType B for the original trade and C for the new trades."),

    /**
     * Acknowledges a valid New Cross Order. The Primary Side and Contra Side blocks of the document are carried as Primary and Contra prefixed fields.
     */
    CROSS_ORDER_ACCEPTED_MESSAGE('x', "Acknowledges a valid New Cross Order. The Primary Side and Contra Side blocks of the document are carried as Primary and Contra prefixed fields."),

    /**
     * The Member Kill Switch Notification informs of a Member Kill Switch Request issued by this OTTO account, or a Kill Switch Action (User or System initiated) targeting Firm ID(s) associated with this OTTO account.
     */
    MEMBER_KILL_SWITCH_NOTIFICATION_MESSAGE('k', "The Member Kill Switch Notification informs of a Member Kill Switch Request issued by this OTTO account, or a Kill Switch Action (User or System initiated) targeting Firm ID(s) associated with this OTTO account."),

    /**
     * Mass Cancel Response is sent out upon completion of processing of a valid Mass Cancel Request.
     */
    MASS_CANCEL_RESPONSE_MESSAGE('u', "Mass Cancel Response is sent out upon completion of processing of a valid Mass Cancel Request."),

    /**
     * Add Complex Instrument Response indicates successful creation of new Complex Instrument using Add Complex Instrument Request.
     */
    ADD_COMPLEX_INSTRUMENT_RESPONSE_MESSAGE('d', "Add Complex Instrument Response indicates successful creation of new Complex Instrument using Add Complex Instrument Request."),

    /**
     * Modify Trade Response is sent when a valid Modify Trade Request is accepted.
     */
    MODIFY_TRADE_RESPONSE_MESSAGE('m', "Modify Trade Response is sent when a valid Modify Trade Request is accepted."),

    /**
     * Subscription Response is sent after a valid Subscription Request has been processed.
     */
    SUBSCRIPTION_RESPONSE_MESSAGE('f', "Subscription Response is sent after a valid Subscription Request has been processed."),

    /**
     * Reject is sent in response to a Request that is deemed invalid. Reject message contains error code explaining the reason for rejection.
     */
    REJECT_MESSAGE('j', "Reject is sent in response to a Request that is deemed invalid. Reject message contains error code explaining the reason for rejection."),

    /**
     * A Pending Response is sent by OTTO when a Request cannot be immediately, fully processed or validated, and indicates that the final status of the Request is not yet known (typically, any Request for a pending instrument). It is eventually followed by the Notification associated with the Request or a Reject.
     */
    PENDING_RESPONSE_MESSAGE('p', "A Pending Response is sent by OTTO when a Request cannot be immediately, fully processed or validated, and indicates that the final status of the Request is not yet known (typically, any Request for a pending instrument). It is eventually followed by the Notification associated with the Request or a Reject.");

    private final char wire;

    private final String description;

    SequencedMessageType(char wire, String description) {
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
    public static Optional<SequencedMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'z' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'o' -> Optional.of(SIMPLE_INSTRUMENT_DIRECTORY_MESSAGE);
            case 's' -> Optional.of(COMPLEX_INSTRUMENT_DIRECTORY_MESSAGE);
            case 'i' -> Optional.of(INSTRUMENT_TRADING_ACTION_MESSAGE);
            case 'n' -> Optional.of(AUCTION_NOTIFICATION_MESSAGE);
            case 'a' -> Optional.of(ORDER_ACCEPTED_LONG_FORM_MESSAGE);
            case 'b' -> Optional.of(ORDER_ACCEPTED_SHORT_FORM_MESSAGE);
            case 'r' -> Optional.of(ORDER_REPLACED_MESSAGE);
            case 'c' -> Optional.of(ORDER_CANCELED_MESSAGE);
            case 'e' -> Optional.of(ORDER_EXECUTED_MESSAGE);
            case 't' -> Optional.of(TRADE_DETAILS_MESSAGE);
            case 'x' -> Optional.of(CROSS_ORDER_ACCEPTED_MESSAGE);
            case 'k' -> Optional.of(MEMBER_KILL_SWITCH_NOTIFICATION_MESSAGE);
            case 'u' -> Optional.of(MASS_CANCEL_RESPONSE_MESSAGE);
            case 'd' -> Optional.of(ADD_COMPLEX_INSTRUMENT_RESPONSE_MESSAGE);
            case 'm' -> Optional.of(MODIFY_TRADE_RESPONSE_MESSAGE);
            case 'f' -> Optional.of(SUBSCRIPTION_RESPONSE_MESSAGE);
            case 'j' -> Optional.of(REJECT_MESSAGE);
            case 'p' -> Optional.of(PENDING_RESPONSE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
