package omi.nasdaq.nomoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * Value identifying unsequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum UnsequencedMessageType {

    /**
     * Long form of the New Order request provides full flexibility of configuring order attributes: simple and multi-leg instruments (up to 10 legs), clearing overrides, preferenced, AON/FOK, reserve and attributable orders, one-sided auction initiation (Block, Exposure and Flex auctions), auction responses and Do Not Trade Through orders. Acknowledged by Order Accepted (Long Form).
     */
    NEW_ORDER_LONG_FORM_MESSAGE('A', "Long form of the New Order request provides full flexibility of configuring order attributes: simple and multi-leg instruments (up to 10 legs), clearing overrides, preferenced, AON/FOK, reserve and attributable orders, one-sided auction initiation (Block, Exposure and Flex auctions), auction responses and Do Not Trade Through orders. Acknowledged by Order Accepted (Long Form)."),

    /**
     * Short format of the New Order request is a compact message (50 bytes) with limited flexibility: simple and multi-leg instruments, quantity up to 65535, auction responses, default clearing configuration for the Firm. Acknowledged by Order Accepted (Short Form).
     */
    NEW_ORDER_SHORT_FORM_MESSAGE('B', "Short format of the New Order request is a compact message (50 bytes) with limited flexibility: simple and multi-leg instruments, quantity up to 65535, auction responses, default clearing configuration for the Firm. Acknowledged by Order Accepted (Short Form)."),

    /**
     * Replace Order message is used to modify an existing order for both simple and complex instruments. It can also be used to alter price of the contra side of Cross Orders. The order to be replaced is identified by OrigClOrdId.
     */
    REPLACE_ORDER_MESSAGE('R', "Replace Order message is used to modify an existing order for both simple and complex instruments. It can also be used to alter price of the contra side of Cross Orders. The order to be replaced is identified by OrigClOrdId."),

    /**
     * Cancel Order by Client ID. Deletes a single simple order, a single complex order, or a Cross Order (terminating an ongoing auction). The order to be deleted is identified by the ClOrdId field.
     */
    CANCEL_ORDER_MESSAGE('C', "Cancel Order by Client ID. Deletes a single simple order, a single complex order, or a Cross Order (terminating an ongoing auction). The order to be deleted is identified by the ClOrdId field."),

    /**
     * This message is used to mass-delete multiple open orders based on the specified Scope. The sequence of Order Canceled messages is terminated with a single Mass Cancel Response.
     */
    MASS_CANCEL_MESSAGE('U', "This message is used to mass-delete multiple open orders based on the specified Scope. The sequence of Order Canceled messages is terminated with a single Mass Cancel Response."),

    /**
     * Cross Order message allows specifying two opposite sides to trade against each other. The primary side of the order is exposed in an auction if CrossType is set to A (Auction). Other cross types (QCC and CCC) trade the two sides without market exposure. The Primary Side and Contra Side blocks of the document are carried as Primary and Contra prefixed fields.
     */
    NEW_CROSS_ORDER_MESSAGE('X', "Cross Order message allows specifying two opposite sides to trade against each other. The primary side of the order is exposed in an auction if CrossType is set to A (Auction). Other cross types (QCC and CCC) trade the two sides without market exposure. The Primary Side and Contra Side blocks of the document are carried as Primary and Contra prefixed fields."),

    /**
     * The Modify Trade request is used to change clearing information on an existing trade as well as split a trade into multiple components with different clearing assignments. The trade to be changed is identified by the MatchId field. Acknowledged by Modify Trade Response.
     */
    MODIFY_TRADE_MESSAGE('M', "The Modify Trade request is used to change clearing information on an existing trade as well as split a trade into multiple components with different clearing assignments. The trade to be changed is identified by the MatchId field. Acknowledged by Modify Trade Response."),

    /**
     * The Member Kill Switch Request is used to block ability to enter new orders, alter existing orders, delete orders, and create complex instruments. Scope of the Kill Switch Request is one firm per request. Answered by Member Kill Switch Notification or Reject.
     */
    MEMBER_KILL_SWITCH_REQUEST_MESSAGE('K', "The Member Kill Switch Request is used to block ability to enter new orders, alter existing orders, delete orders, and create complex instruments. Scope of the Kill Switch Request is one firm per request. Answered by Member Kill Switch Notification or Reject.");

    private final char wire;

    private final String description;

    UnsequencedMessageType(char wire, String description) {
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
    public static Optional<UnsequencedMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NEW_ORDER_LONG_FORM_MESSAGE);
            case 'B' -> Optional.of(NEW_ORDER_SHORT_FORM_MESSAGE);
            case 'R' -> Optional.of(REPLACE_ORDER_MESSAGE);
            case 'C' -> Optional.of(CANCEL_ORDER_MESSAGE);
            case 'U' -> Optional.of(MASS_CANCEL_MESSAGE);
            case 'X' -> Optional.of(NEW_CROSS_ORDER_MESSAGE);
            case 'M' -> Optional.of(MODIFY_TRADE_MESSAGE);
            case 'K' -> Optional.of(MEMBER_KILL_SWITCH_REQUEST_MESSAGE);
            default -> Optional.empty();
        };
    }
}
