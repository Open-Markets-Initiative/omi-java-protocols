package omi.nyse.amexoptions.complexfeed.xdp.v1_3_a.enums;

import java.util.Optional;

/**
 * The type of this message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * The Complex Quote message is a two-sided message providing best bid and offer limits of orders on complex symbols with aggregated volumes at each limit.
     */
    COMPLEX_QUOTE_MESSAGE(423, "The Complex Quote message is a two-sided message providing best bid and offer limits of orders on complex symbols with aggregated volumes at each limit."),

    /**
     * The Complex Trade message is used to publish all complex Last Sales.
     */
    COMPLEX_TRADE_MESSAGE(425, "The Complex Trade message is used to publish all complex Last Sales."),

    /**
     * The Complex Crossing RFQ (Request for Quote) message is sent out in the event of a COA auction on a complex order.
     */
    COMPLEX_CROSSING_RFQ_MESSAGE(429, "The Complex Crossing RFQ (Request for Quote) message is sent out in the event of a COA auction on a complex order."),

    /**
     * Complex Cube Rfq Message
     */
    COMPLEX_CUBE_RFQ_MESSAGE(472, "Complex Cube Rfq Message"),

    /**
     * The Complex Status message is used to inform the subscribers of changes in symbol status of a complex symbol.
     */
    COMPLEX_STATUS_MESSAGE(433, "The Complex Status message is used to inform the subscribers of changes in symbol status of a complex symbol."),

    /**
     * The Refresh Complex Quote message is sent in the event no quote messages are published for the symbol for 2 consecutive minutes.
     */
    REFRESH_COMPLEX_QUOTE_MESSAGE(511, "The Refresh Complex Quote message is sent in the event no quote messages are published for the symbol for 2 consecutive minutes."),

    /**
     * The Refresh Complex Trade message is sent in the event no Complex Trade messages are published for the symbol for 2 consecutive minutes.
     */
    REFRESH_COMPLEX_TRADE_MESSAGE(513, "The Refresh Complex Trade message is sent in the event no Complex Trade messages are published for the symbol for 2 consecutive minutes."),

    /**
     * The Complex Symbol Definition message provides a description of the legs in a Complex symbol, and specifies its Complex symbol ID, which is unique for its stream. If the same symbol ID appears in a different stream, it represents a different Complex symbol.
     */
    COMPLEX_SYMBOL_DEFINITION_MESSAGE(439, "The Complex Symbol Definition message provides a description of the legs in a Complex symbol, and specifies its Complex symbol ID, which is unique for its stream. If the same symbol ID appears in a different stream, it represents a different Complex symbol."),

    /**
     * In all multicast channels, a Stream ID Message is sent immediately after each packet header to uniquely identify the source or Stream ID of the data in the packet.
     */
    STREAM_ID_MESSAGE(455, "In all multicast channels, a Stream ID Message is sent immediately after each packet header to uniquely identify the source or Stream ID of the data in the packet."),

    /**
     * This message is sent to reset the Message Sequence Number at start of day, or in response to failures.
     */
    SEQUENCE_NUMBER_RESET_MESSAGE(1, "This message is sent to reset the Message Sequence Number at start of day, or in response to failures.");

    private final int wire;

    private final String description;

    MessageType(int wire, String description) {
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
    public static Optional<MessageType> fromWire(int wire) {
        return switch (wire) {
            case 423 -> Optional.of(COMPLEX_QUOTE_MESSAGE);
            case 425 -> Optional.of(COMPLEX_TRADE_MESSAGE);
            case 429 -> Optional.of(COMPLEX_CROSSING_RFQ_MESSAGE);
            case 472 -> Optional.of(COMPLEX_CUBE_RFQ_MESSAGE);
            case 433 -> Optional.of(COMPLEX_STATUS_MESSAGE);
            case 511 -> Optional.of(REFRESH_COMPLEX_QUOTE_MESSAGE);
            case 513 -> Optional.of(REFRESH_COMPLEX_TRADE_MESSAGE);
            case 439 -> Optional.of(COMPLEX_SYMBOL_DEFINITION_MESSAGE);
            case 455 -> Optional.of(STREAM_ID_MESSAGE);
            case 1 -> Optional.of(SEQUENCE_NUMBER_RESET_MESSAGE);
            default -> Optional.empty();
        };
    }
}
