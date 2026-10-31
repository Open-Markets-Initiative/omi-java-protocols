package omi.iex.iexequities.tops.iextp.v1_56.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Tops broadcasts a real-time Quote Update Message each time IEX's best bid or offer quotation is updated during the trading day
     */
    QUOTE_UPDATE_MESSAGE('Q', "Tops broadcasts a real-time Quote Update Message each time IEX's best bid or offer quotation is updated during the trading day"),

    /**
     * Trade Report Messages are sent when an order on the IEX Order Book is executed in whole or in part
     */
    TRADE_REPORT_MESSAGE('T', "Trade Report Messages are sent when an order on the IEX Order Book is executed in whole or in part"),

    /**
     * Trade Break Messages are sent when an execution on IEX is broken on that same trading day
     */
    TRADE_BREAK_MESSAGE('B', "Trade Break Messages are sent when an execution on IEX is broken on that same trading day");

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
            case 'Q' -> Optional.of(QUOTE_UPDATE_MESSAGE);
            case 'T' -> Optional.of(TRADE_REPORT_MESSAGE);
            case 'B' -> Optional.of(TRADE_BREAK_MESSAGE);
            default -> Optional.empty();
        };
    }
}
