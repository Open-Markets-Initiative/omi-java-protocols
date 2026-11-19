package omi.lseg.millennium.level2recovery.mitch.v11_9.enums;

import java.util.Optional;

/**
 * Code identifying this message type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MessageType {

    /**
     * Used by the client to log in to the recovery channel.
     */
    LOGIN_REQUEST_MESSAGE((short) 1, "Used by the client to log in to the recovery channel."),

    /**
     * Used by the server to accept or reject a login request.
     */
    LOGIN_RESPONSE_MESSAGE((short) 2, "Used by the server to accept or reject a login request."),

    /**
     * Used by the client to request a snapshot of the order book for a segment or an instrument.
     */
    SNAPSHOT_REQUEST_MESSAGE((short) 129, "Used by the client to request a snapshot of the order book for a segment or an instrument."),

    /**
     * Used by the server to accept or reject a snapshot request.
     */
    SNAPSHOT_RESPONSE_MESSAGE((short) 130, "Used by the server to accept or reject a snapshot request."),

    /**
     * Sent once the details of all active orders of an order book, or of every instrument in a segment, are disseminated.
     */
    SNAPSHOT_COMPLETE_MESSAGE((short) 131, "Sent once the details of all active orders of an order book, or of every instrument in a segment, are disseminated."),

    /**
     * Used by the client to log out of the recovery channel.
     */
    LOGOUT_REQUEST_MESSAGE((short) 5, "Used by the client to log out of the recovery channel."),

    /**
     * Indicates the trading session (pre-opening, regular trading, etc.) that currently applies to an instrument.
     */
    SYMBOL_STATUS_MESSAGE((short) 72, "Indicates the trading session (pre-opening, regular trading, etc.) that currently applies to an instrument."),

    /**
     * Sent to indicate that an anonymous limit or market order is added to the order book.
     */
    ADD_ORDER_MESSAGE((short) 65, "Sent to indicate that an anonymous limit or market order is added to the order book."),

    /**
     * Indicates that a named order is added to the order book.
     */
    ADD_ATTRIBUTED_ORDER_MESSAGE((short) 70, "Indicates that a named order is added to the order book.");

    private final short wire;

    private final String description;

    MessageType(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<MessageType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(LOGIN_REQUEST_MESSAGE);
            case 2 -> Optional.of(LOGIN_RESPONSE_MESSAGE);
            case 129 -> Optional.of(SNAPSHOT_REQUEST_MESSAGE);
            case 130 -> Optional.of(SNAPSHOT_RESPONSE_MESSAGE);
            case 131 -> Optional.of(SNAPSHOT_COMPLETE_MESSAGE);
            case 5 -> Optional.of(LOGOUT_REQUEST_MESSAGE);
            case 72 -> Optional.of(SYMBOL_STATUS_MESSAGE);
            case 65 -> Optional.of(ADD_ORDER_MESSAGE);
            case 70 -> Optional.of(ADD_ATTRIBUTED_ORDER_MESSAGE);
            default -> Optional.empty();
        };
    }
}
