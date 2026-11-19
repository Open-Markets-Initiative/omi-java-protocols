package omi.currenex.currenexforex.now.cbp.v10.enums;

import java.util.Optional;

/**
 * The type of message being sent
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MessageType {

    /**
     * Client initiates a session by submitting a Logon message to Currenex_NOW
     */
    LOGON_MESSAGE('A', "Client initiates a session by submitting a Logon message to Currenex_NOW"),

    /**
     * Terminate a session by sending or receiving a Logout message
     */
    LOGOUT_MESSAGE('B', "Terminate a session by sending or receiving a Logout message"),

    /**
     * Keep-alive ping sent every 15 seconds; client must respond
     */
    HEART_BEAT_MESSAGE('C', "Keep-alive ping sent every 15 seconds; client must respond"),

    /**
     * Definition of a currency or metal instrument
     */
    INSTRUMENT_INFO('D', "Definition of a currency or metal instrument"),

    /**
     * Acknowledge receipt of InstrumentInfo
     */
    INSTRUMENT_INFO_ACK_MESSAGE('E', "Acknowledge receipt of InstrumentInfo"),

    /**
     * Request market data for a specific instrument
     */
    SUBSCRIPTION_REQUEST_MESSAGE('X', "Request market data for a specific instrument"),

    /**
     * Subscribe or unsubscribe all instruments at once
     */
    MASS_SUBSCRIPTION_REQUEST_MESSAGE('Y', "Subscribe or unsubscribe all instruments at once"),

    /**
     * Response to SubscriptionRequest
     */
    SUBSCRIPTION_REPLY_MESSAGE('G', "Response to SubscriptionRequest"),

    /**
     * Response to MassSubscriptionRequest
     */
    MASS_SUBSCRIPTION_REPLY_MESSAGE('Z', "Response to MassSubscriptionRequest"),

    /**
     * Depth of book updates up to 20 levels
     */
    DEPTH_OF_BOOK_MESSAGE('d', "Depth of book updates up to 20 levels"),

    /**
     * Latest trade versus liquidity
     */
    PAID_GIVEN_MESSAGE('k', "Latest trade versus liquidity"),

    /**
     * Weighted average mid-rate with confidence factors
     */
    WAMR_WITH_CONFIDENCE_FACTOR_MESSAGE('r', "Weighted average mid-rate with confidence factors"),

    /**
     * Indicator of mid-rate activity windows
     */
    MID_ACTIVITY_INDICATOR_MESSAGE('x', "Indicator of mid-rate activity windows"),

    /**
     * Reject incorrectly formatted or invalid messages
     */
    REJECT_MESSAGE('K', "Reject incorrectly formatted or invalid messages");

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
            case 'A' -> Optional.of(LOGON_MESSAGE);
            case 'B' -> Optional.of(LOGOUT_MESSAGE);
            case 'C' -> Optional.of(HEART_BEAT_MESSAGE);
            case 'D' -> Optional.of(INSTRUMENT_INFO);
            case 'E' -> Optional.of(INSTRUMENT_INFO_ACK_MESSAGE);
            case 'X' -> Optional.of(SUBSCRIPTION_REQUEST_MESSAGE);
            case 'Y' -> Optional.of(MASS_SUBSCRIPTION_REQUEST_MESSAGE);
            case 'G' -> Optional.of(SUBSCRIPTION_REPLY_MESSAGE);
            case 'Z' -> Optional.of(MASS_SUBSCRIPTION_REPLY_MESSAGE);
            case 'd' -> Optional.of(DEPTH_OF_BOOK_MESSAGE);
            case 'k' -> Optional.of(PAID_GIVEN_MESSAGE);
            case 'r' -> Optional.of(WAMR_WITH_CONFIDENCE_FACTOR_MESSAGE);
            case 'x' -> Optional.of(MID_ACTIVITY_INDICATOR_MESSAGE);
            case 'K' -> Optional.of(REJECT_MESSAGE);
            default -> Optional.empty();
        };
    }
}
