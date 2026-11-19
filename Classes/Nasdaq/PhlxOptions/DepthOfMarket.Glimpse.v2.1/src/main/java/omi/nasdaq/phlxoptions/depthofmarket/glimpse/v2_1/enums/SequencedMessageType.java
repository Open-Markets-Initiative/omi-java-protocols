package omi.nasdaq.phlxoptions.depthofmarket.glimpse.v2_1.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * The system event message type is used to signal a market or data feed handler event.
     */
    SYSTEM_EVENT_MESSAGE('S', "The system event message type is used to signal a market or data feed handler event."),

    /**
     * Derivative Directory Message for active options symbols.
     */
    DERIVATIVE_DIRECTORY_MESSAGE('m', "Derivative Directory Message for active options symbols."),

    /**
     * The options system uses this administrative message to indicate the current trading status of an index or equity option within the options market.
     */
    TRADING_ACTION_MESSAGE('H', "The options system uses this administrative message to indicate the current trading status of an index or equity option within the options market."),

    /**
     * An Add Order Message indicates that a new order has been accepted and was added to the displayable book.
     */
    ADD_ORDER_SHORT_FORM_MESSAGE('r', "An Add Order Message indicates that a new order has been accepted and was added to the displayable book."),

    /**
     * An Add Order Message indicates that a new order has been accepted and was added to the displayable book.
     */
    ADD_ORDER_LONG_FORM_MESSAGE('o', "An Add Order Message indicates that a new order has been accepted and was added to the displayable book."),

    /**
     * An Add Quote Message indicates that a new quote has been accepted and was added to the displayable book.
     */
    ADD_QUOTE_SHORT_FORM_MESSAGE('j', "An Add Quote Message indicates that a new quote has been accepted and was added to the displayable book."),

    /**
     * An Add Quote Message indicates that a new quote has been accepted and was added to the displayable book.
     */
    ADD_QUOTE_LONG_FORM_MESSAGE('J', "An Add Quote Message indicates that a new quote has been accepted and was added to the displayable book."),

    /**
     * The Snapshot message reflects the Depth of Market sequence number at the time the GLIMPSE spin was requested.
     */
    SNAPSHOT_MESSAGE('M', "The Snapshot message reflects the Depth of Market sequence number at the time the GLIMPSE spin was requested.");

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
            case 'S' -> Optional.of(SYSTEM_EVENT_MESSAGE);
            case 'm' -> Optional.of(DERIVATIVE_DIRECTORY_MESSAGE);
            case 'H' -> Optional.of(TRADING_ACTION_MESSAGE);
            case 'r' -> Optional.of(ADD_ORDER_SHORT_FORM_MESSAGE);
            case 'o' -> Optional.of(ADD_ORDER_LONG_FORM_MESSAGE);
            case 'j' -> Optional.of(ADD_QUOTE_SHORT_FORM_MESSAGE);
            case 'J' -> Optional.of(ADD_QUOTE_LONG_FORM_MESSAGE);
            case 'M' -> Optional.of(SNAPSHOT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
