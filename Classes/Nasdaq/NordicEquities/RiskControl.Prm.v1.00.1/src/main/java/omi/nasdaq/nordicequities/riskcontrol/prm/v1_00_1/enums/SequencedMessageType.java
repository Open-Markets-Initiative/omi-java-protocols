package omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.enums;

import java.util.Optional;

/**
 * Value identifying sequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SequencedMessageType {

    /**
     * Provides the PRM API port's next expected user reference number
     */
    ACCOUNT_QUERY_RESPONSE_MESSAGE('Q', "Provides the PRM API port's next expected user reference number"),

    /**
     * Indicates that the settings for a given PRM Account have been updated
     */
    ACCOUNT_SETTINGS_RESPONSE_MESSAGE('C', "Indicates that the settings for a given PRM Account have been updated"),

    /**
     * Indicates that an Order Book has been restricted or non-restricted for a given PRM Account
     */
    ORDER_BOOK_RESTRICTION_RESPONSE_MESSAGE('R', "Indicates that an Order Book has been restricted or non-restricted for a given PRM Account"),

    /**
     * Indicates that a Market Segment has been restricted or non-restricted for a given PRM Account
     */
    MARKET_SEGMENT_RESTRICTION_RESPONSE_MESSAGE('S', "Indicates that a Market Segment has been restricted or non-restricted for a given PRM Account"),

    /**
     * Indicates that the Limit settings for a given PRM Account and Currency have been updated
     */
    LIMIT_SETTINGS_RESPONSE_MESSAGE('L', "Indicates that the Limit settings for a given PRM Account and Currency have been updated"),

    /**
     * Indicates that the settings for a given PRM Account's currency have been updated
     */
    ACCOUNT_CURRENCY_SETTING_RESPONSE_MESSAGE('F', "Indicates that the settings for a given PRM Account's currency have been updated"),

    /**
     * Indicates that an inbound message has been rejected
     */
    REJECT_MESSAGE('J', "Indicates that an inbound message has been rejected"),

    /**
     * Indicates that the port's rate limit has been breached
     */
    API_PORT_RATE_BREACH_MESSAGE('P', "Indicates that the port's rate limit has been breached"),

    /**
     * Indicates that a PRM Account's rate limit has been breached
     */
    ACCOUNT_RATE_BREACH_MESSAGE('B', "Indicates that a PRM Account's rate limit has been breached"),

    /**
     * Indicates the current Accumulated Values for a PRM Account and Currency, sent after order or trade updates
     */
    ACCUMULATED_VALUES_MESSAGE('V', "Indicates the current Accumulated Values for a PRM Account and Currency, sent after order or trade updates");

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
            case 'Q' -> Optional.of(ACCOUNT_QUERY_RESPONSE_MESSAGE);
            case 'C' -> Optional.of(ACCOUNT_SETTINGS_RESPONSE_MESSAGE);
            case 'R' -> Optional.of(ORDER_BOOK_RESTRICTION_RESPONSE_MESSAGE);
            case 'S' -> Optional.of(MARKET_SEGMENT_RESTRICTION_RESPONSE_MESSAGE);
            case 'L' -> Optional.of(LIMIT_SETTINGS_RESPONSE_MESSAGE);
            case 'F' -> Optional.of(ACCOUNT_CURRENCY_SETTING_RESPONSE_MESSAGE);
            case 'J' -> Optional.of(REJECT_MESSAGE);
            case 'P' -> Optional.of(API_PORT_RATE_BREACH_MESSAGE);
            case 'B' -> Optional.of(ACCOUNT_RATE_BREACH_MESSAGE);
            case 'V' -> Optional.of(ACCUMULATED_VALUES_MESSAGE);
            default -> Optional.empty();
        };
    }
}
