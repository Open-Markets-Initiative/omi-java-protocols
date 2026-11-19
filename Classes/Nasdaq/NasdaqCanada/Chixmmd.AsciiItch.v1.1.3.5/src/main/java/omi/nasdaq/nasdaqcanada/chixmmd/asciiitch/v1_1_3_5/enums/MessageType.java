package omi.nasdaq.nasdaqcanada.chixmmd.asciiitch.v1_1_3_5.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * An Add Order Message indicates that CXC or CX2 has accepted a visible order into the book. It includes a day-unique Order Reference key assigned to the order. The issuing of an Add Order Message is not necessarily always for a new order (see Modification of Existing Orders). Not applicable to CXD.
     */
    ADD_ORDER_MESSAGE('A', "An Add Order Message indicates that CXC or CX2 has accepted a visible order into the book. It includes a day-unique Order Reference key assigned to the order. The issuing of an Add Order Message is not necessarily always for a new order (see Modification of Existing Orders). Not applicable to CXD."),

    /**
     * An Add Order Message indicates that CXC or CX2 has accepted a visible order into the book. It includes a day-unique Order Reference key assigned to the order. The issuing of an Add Order Message is not necessarily always for a new order (see Modification of Existing Orders). Not applicable to CXD. Long form messages are used when either the price or size is larger than the standard messages can permit.
     */
    LONG_FORM_ADD_ORDER_MESSAGE('a', "An Add Order Message indicates that CXC or CX2 has accepted a visible order into the book. It includes a day-unique Order Reference key assigned to the order. The issuing of an Add Order Message is not necessarily always for a new order (see Modification of Existing Orders). Not applicable to CXD. Long form messages are used when either the price or size is larger than the standard messages can permit."),

    /**
     * An Order Execution Message is sent whenever an order on the book is executed in whole or in part. Not applicable to CXD.
     */
    ORDER_EXECUTION_MESSAGE('E', "An Order Execution Message is sent whenever an order on the book is executed in whole or in part. Not applicable to CXD."),

    /**
     * An Order Execution Message is sent whenever an order on the book is executed in whole or in part. Not applicable to CXD. Long form messages are used when either the price or size is larger than the standard messages can permit.
     */
    LONG_FORM_ORDER_EXECUTION_MESSAGE('e', "An Order Execution Message is sent whenever an order on the book is executed in whole or in part. Not applicable to CXD. Long form messages are used when either the price or size is larger than the standard messages can permit."),

    /**
     * An Order Cancel Message is sent whenever an order on the book is fully canceled, its quantity revised down or when a pegged order is re-priced. Not applicable to CXD.
     */
    ORDER_CANCEL_MESSAGE('X', "An Order Cancel Message is sent whenever an order on the book is fully canceled, its quantity revised down or when a pegged order is re-priced. Not applicable to CXD."),

    /**
     * An Order Cancel Message is sent whenever an order on the book is fully canceled, its quantity revised down or when a pegged order is re-priced. Not applicable to CXD. Long form messages are used when either the price or size is larger than the standard messages can permit.
     */
    LONG_FORM_ORDER_CANCEL_MESSAGE('x', "An Order Cancel Message is sent whenever an order on the book is fully canceled, its quantity revised down or when a pegged order is re-priced. Not applicable to CXD. Long form messages are used when either the price or size is larger than the standard messages can permit."),

    /**
     * A Trade Message is sent when a trade occurs against order quantity not visible on the book (i.e. a fully or partially hidden order). They do not affect the book. The Order Reference is always 0 and the Buy/Sell indicator B.
     */
    TRADE_MESSAGE('P', "A Trade Message is sent when a trade occurs against order quantity not visible on the book (i.e. a fully or partially hidden order). They do not affect the book. The Order Reference is always 0 and the Buy/Sell indicator B."),

    /**
     * A Trade Message is sent when a trade occurs against order quantity not visible on the book (i.e. a fully or partially hidden order). They do not affect the book. The Order Reference is always 0 and the Buy/Sell indicator B. Long form messages are used when either the price or size is larger than the standard messages can permit.
     */
    LONG_FORM_TRADE_MESSAGE('p', "A Trade Message is sent when a trade occurs against order quantity not visible on the book (i.e. a fully or partially hidden order). They do not affect the book. The Order Reference is always 0 and the Buy/Sell indicator B. Long form messages are used when either the price or size is larger than the standard messages can permit."),

    /**
     * A Broken Trade message is sent whenever an execution is broken. A Broken Trade is final; once a trade is broken it cannot be reinstated.
     */
    BROKEN_TRADE_MESSAGE('B', "A Broken Trade message is sent whenever an execution is broken. A Broken Trade is final; once a trade is broken it cannot be reinstated."),

    /**
     * The system event message type is used to indicate a market state event.
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message type is used to indicate a market state event."),

    /**
     * This message indicates the current trading status of a stock. At the start of day, the feed will send out a stock status message for each of the symbols trading on CXC, CX2 and CXD. Subsequently, stock status messages will be sent when a stock is halted or is released for trading.
     */
    STOCK_STATUS_MESSAGE('H', "This message indicates the current trading status of a stock. At the start of day, the feed will send out a stock status message for each of the symbols trading on CXC, CX2 and CXD. Subsequently, stock status messages will be sent when a stock is halted or is released for trading.");

    private final char wire;

    private final String description;

    MessageType(char wire, String description) {
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
    public static Optional<MessageType> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ADD_ORDER_MESSAGE);
            case 'a' -> Optional.of(LONG_FORM_ADD_ORDER_MESSAGE);
            case 'E' -> Optional.of(ORDER_EXECUTION_MESSAGE);
            case 'e' -> Optional.of(LONG_FORM_ORDER_EXECUTION_MESSAGE);
            case 'X' -> Optional.of(ORDER_CANCEL_MESSAGE);
            case 'x' -> Optional.of(LONG_FORM_ORDER_CANCEL_MESSAGE);
            case 'P' -> Optional.of(TRADE_MESSAGE);
            case 'p' -> Optional.of(LONG_FORM_TRADE_MESSAGE);
            case 'B' -> Optional.of(BROKEN_TRADE_MESSAGE);
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'H' -> Optional.of(STOCK_STATUS_MESSAGE);
            default -> Optional.empty();
        };
    }
}
