package omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.enums;

import java.util.Optional;

/**
 * Value identifying unsequenced message type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum UnsequencedMessageType {

    /**
     * Returns the PRM API port's next expected user reference number
     */
    ACCOUNT_QUERY_MESSAGE('Q', "Returns the PRM API port's next expected user reference number"),

    /**
     * Updates the settings for a given PRM Account
     */
    MODIFY_ACCOUNT_SETTINGS_MESSAGE('C', "Updates the settings for a given PRM Account"),

    /**
     * Marks an Order Book as restricted or non-restricted for a given PRM Account
     */
    MODIFY_ORDER_BOOK_RESTRICTION_MESSAGE('R', "Marks an Order Book as restricted or non-restricted for a given PRM Account"),

    /**
     * Marks a Market Segment as restricted or non-restricted for a given PRM Account
     */
    MODIFY_MARKET_SEGMENT_RESTRICTION_MESSAGE('S', "Marks a Market Segment as restricted or non-restricted for a given PRM Account"),

    /**
     * Updates the Limit settings for a given PRM Account and Currency
     */
    MODIFY_LIMIT_SETTINGS_MESSAGE('L', "Updates the Limit settings for a given PRM Account and Currency"),

    /**
     * Updates the settings for a given PRM Account's currency
     */
    MODIFY_ACCOUNT_CURRENCY_SETTING_MESSAGE('F', "Updates the settings for a given PRM Account's currency");

    private final char wire;

    private final String description;

    UnsequencedMessageType(char wire, String description) {
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
    public static Optional<UnsequencedMessageType> fromWire(char wire) {
        return switch (wire) {
            case 'Q' -> Optional.of(ACCOUNT_QUERY_MESSAGE);
            case 'C' -> Optional.of(MODIFY_ACCOUNT_SETTINGS_MESSAGE);
            case 'R' -> Optional.of(MODIFY_ORDER_BOOK_RESTRICTION_MESSAGE);
            case 'S' -> Optional.of(MODIFY_MARKET_SEGMENT_RESTRICTION_MESSAGE);
            case 'L' -> Optional.of(MODIFY_LIMIT_SETTINGS_MESSAGE);
            case 'F' -> Optional.of(MODIFY_ACCOUNT_CURRENCY_SETTING_MESSAGE);
            default -> Optional.empty();
        };
    }
}
