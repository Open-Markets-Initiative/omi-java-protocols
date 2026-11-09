package omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.enums;

import java.util.Optional;

/**
 * The type of this message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * The Buy Market Depth message provides prices and aggregated volumes for each of the best three Buy levels.
     */
    OUTRIGHT_MARKET_DEPTH_BUY_MESSAGE(403, "The Buy Market Depth message provides prices and aggregated volumes for each of the best three Buy levels."),

    /**
     * The Sell Market Depth message provides prices and aggregated volumes for each of the best three Sell levels.
     */
    OUTRIGHT_MARKET_DEPTH_SELL_MESSAGE(405, "The Sell Market Depth message provides prices and aggregated volumes for each of the best three Sell levels."),

    /**
     * The Underlying Status message is used to inform the subscribers of changes in the status of an Underlying symbol.
     */
    UNDERLYING_STATUS_MESSAGE(419, "The Underlying Status message is used to inform the subscribers of changes in the status of an Underlying symbol."),

    /**
     * The Series Status message is used to inform the subscribers of changes in symbol status of an outright symbol.
     */
    OUTRIGHT_SERIES_STATUS_MESSAGE(421, "The Series Status message is used to inform the subscribers of changes in symbol status of an outright symbol."),

    /**
     * The Refresh Market Depth Buy message is sent in the event no Buy Market Depth messages are published for the symbol for 2 consecutive minutes.
     */
    REFRESH_OUTRIGHT_MARKET_DEPTH_BUY_MESSAGE(503, "The Refresh Market Depth Buy message is sent in the event no Buy Market Depth messages are published for the symbol for 2 consecutive minutes."),

    /**
     * The Refresh Market Depth Sell message is sent in the event no Sell Market Depth messages are published for the symbol for 2 consecutive minutes.
     */
    REFRESH_OUTRIGHT_MARKET_DEPTH_SELL_MESSAGE(505, "The Refresh Market Depth Sell message is sent in the event no Sell Market Depth messages are published for the symbol for 2 consecutive minutes."),

    /**
     * On system startup, each multicast channel sends all the symbols on its channel. Underlying Index Mapping messages are published first, followed by all Series Index Mapping messages, and for the Complex feed, Complex Symbol Definitions last of all.
     */
    UNDERLYING_INDEX_MAPPING_MESSAGE(435, "On system startup, each multicast channel sends all the symbols on its channel. Underlying Index Mapping messages are published first, followed by all Series Index Mapping messages, and for the Complex feed, Complex Symbol Definitions last of all."),

    /**
     * On system startup, each multicast channel sends all the symbols on its channel. Underlying Index Mapping messages are published first, followed by all Series Index Mapping messages, and for the Complex feed, Complex Symbol Definitions last of all.
     */
    SERIES_INDEX_MAPPING_MESSAGE(437, "On system startup, each multicast channel sends all the symbols on its channel. Underlying Index Mapping messages are published first, followed by all Series Index Mapping messages, and for the Complex feed, Complex Symbol Definitions last of all."),

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
            case 403 -> Optional.of(OUTRIGHT_MARKET_DEPTH_BUY_MESSAGE);
            case 405 -> Optional.of(OUTRIGHT_MARKET_DEPTH_SELL_MESSAGE);
            case 419 -> Optional.of(UNDERLYING_STATUS_MESSAGE);
            case 421 -> Optional.of(OUTRIGHT_SERIES_STATUS_MESSAGE);
            case 503 -> Optional.of(REFRESH_OUTRIGHT_MARKET_DEPTH_BUY_MESSAGE);
            case 505 -> Optional.of(REFRESH_OUTRIGHT_MARKET_DEPTH_SELL_MESSAGE);
            case 435 -> Optional.of(UNDERLYING_INDEX_MAPPING_MESSAGE);
            case 437 -> Optional.of(SERIES_INDEX_MAPPING_MESSAGE);
            case 455 -> Optional.of(STREAM_ID_MESSAGE);
            case 1 -> Optional.of(SEQUENCE_NUMBER_RESET_MESSAGE);
            default -> Optional.empty();
        };
    }
}
