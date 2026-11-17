package omi.zerocopy.iex.iexequities.tops.iextp.v1_56.enums;

/**
 * Code identifying this message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Tops broadcasts a real-time Quote Update Message each time IEX's best bid or offer quotation is updated during the trading day
     */
    QUOTE_UPDATE_MESSAGE('Q'),

    /**
     * Trade Report Messages are sent when an order on the IEX Order Book is executed in whole or in part
     */
    TRADE_REPORT_MESSAGE('T'),

    /**
     * Trade Break Messages are sent when an execution on IEX is broken on that same trading day
     */
    TRADE_BREAK_MESSAGE('B');

    private static final MessageType[] BY_WIRE = new MessageType[256];

    static {
        for (MessageType value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    MessageType(char wire) {
        this.wire = wire;
    }

    /**
     * Gets the value as it is sent.
     *
     * @return the wire value
     */
    public char wire() {
        return wire;
    }

    /**
     * Looks a value up from its wire form, allocating nothing.
     *
     * @param wire the wire value
     * @return the value, or null when the protocol declares none for it
     */
    public static MessageType get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
