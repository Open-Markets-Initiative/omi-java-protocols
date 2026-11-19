package omi.nyse.nysebonds.quote.pdp.v1_2_a.enums;

import java.util.Optional;

/**
 * The type of this message
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MsgType {

    /**
     * Sent to reset the sequence number at start of day and in response to failures. The message carries its own valid sequence number in the header.
     */
    SEQUENCE_NUMBER_RESET_MESSAGE(1, "Sent to reset the sequence number at start of day and in response to failures. The message carries its own valid sequence number in the header."),

    /**
     * Sent to subscribers connected to the Tcp retransmission server to show the connection is still alive. There is no message body.
     */
    HEARTBEAT_MESSAGE(2, "Sent to subscribers connected to the Tcp retransmission server to show the connection is still alive. There is no message body."),

    /**
     * Sent when the requested messages cannot be retransmitted.
     */
    MESSAGE_UNAVAILABLE_MESSAGE(5, "Sent when the requested messages cannot be retransmitted."),

    /**
     * Sent in response to a Refresh Quote Request, and automatically when there are intraday symbol additions. The same body as a Quote message with the symbol and Cusip appended.
     */
    REFRESH_QUOTE_MESSAGE(23, "Sent in response to a Refresh Quote Request, and automatically when there are intraday symbol additions. The same body as a Quote message with the symbol and Cusip appended."),

    /**
     * Maps a symbol index to its bond symbol and Cusip.
     */
    SYMBOL_INDEX_MAPPING_MESSAGE(26, "Maps a symbol index to its bond symbol and Cusip."),

    /**
     * The L1 top of book quote for a bond.
     */
    QUOTE_MESSAGE(141, "The L1 top of book quote for a bond.");

    private final int wire;

    private final String description;

    MsgType(int wire, String description) {
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
    public static Optional<MsgType> fromWire(int wire) {
        return switch (wire) {
            case 1 -> Optional.of(SEQUENCE_NUMBER_RESET_MESSAGE);
            case 2 -> Optional.of(HEARTBEAT_MESSAGE);
            case 5 -> Optional.of(MESSAGE_UNAVAILABLE_MESSAGE);
            case 23 -> Optional.of(REFRESH_QUOTE_MESSAGE);
            case 26 -> Optional.of(SYMBOL_INDEX_MAPPING_MESSAGE);
            case 141 -> Optional.of(QUOTE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
