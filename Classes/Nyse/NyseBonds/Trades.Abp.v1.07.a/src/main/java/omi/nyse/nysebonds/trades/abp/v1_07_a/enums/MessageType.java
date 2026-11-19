package omi.nyse.nysebonds.trades.abp.v1_07_a.enums;

import java.util.Optional;

/**
 * Alpha character indicating the type of message
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Sent to indicate a successful login. Carries the current version of ArcaTrade.
     */
    LOGIN_ACCEPTED_MESSAGE('Q', "Sent to indicate a successful login. Carries the current version of ArcaTrade."),

    /**
     * Sent when login fails authentication, the client does not log in within 30 seconds, no trade data feed was subscribed to, the sequence number was invalid, or no connections are available. The socket is closed afterwards.
     */
    LOGIN_REJECTED_MESSAGE('R', "Sent when login fails authentication, the client does not log in within 30 seconds, no trade data feed was subscribed to, the sequence number was invalid, or no connections are available. The socket is closed afterwards."),

    /**
     * Sent every 60 seconds during periods of client inactivity, so that firewalls do not time the connection out. The client must answer with a Heartbeat Response. There is no message body, and the header length is always zero.
     */
    HEARTBEAT_MESSAGE('H', "Sent every 60 seconds during periods of client inactivity, so that firewalls do not time the connection out. The client must answer with a Heartbeat Response. There is no message body, and the header length is always zero."),

    /**
     * Sent in response to a Test Request, echoing back any text the request carried.
     */
    TEST_RESPONSE_MESSAGE('S', "Sent in response to a Test Request, echoing back any text the request carried."),

    /**
     * Sent when an order partially trades or completely trades.
     */
    LAST_SALE_MESSAGE('X', "Sent when an order partially trades or completely trades."),

    /**
     * Sent when trades are busted or corrected. The Event Code field says which.
     */
    TRADE_BUST_OR_CORRECTION_MESSAGE('U', "Sent when trades are busted or corrected. The Event Code field says which."),

    /**
     * Sent during day end processing with the final closing price and volume for a bond. The specification notes this message is not supported at the time of writing and will be implemented in a future release.
     */
    NYSE_BOND_CLOSING_PRICE_MESSAGE('Z', "Sent during day end processing with the final closing price and volume for a bond. The specification notes this message is not supported at the time of writing and will be implemented in a future release.");

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
            case 'Q' -> Optional.of(LOGIN_ACCEPTED_MESSAGE);
            case 'R' -> Optional.of(LOGIN_REJECTED_MESSAGE);
            case 'H' -> Optional.of(HEARTBEAT_MESSAGE);
            case 'S' -> Optional.of(TEST_RESPONSE_MESSAGE);
            case 'X' -> Optional.of(LAST_SALE_MESSAGE);
            case 'U' -> Optional.of(TRADE_BUST_OR_CORRECTION_MESSAGE);
            case 'Z' -> Optional.of(NYSE_BOND_CLOSING_PRICE_MESSAGE);
            default -> Optional.empty();
        };
    }
}
