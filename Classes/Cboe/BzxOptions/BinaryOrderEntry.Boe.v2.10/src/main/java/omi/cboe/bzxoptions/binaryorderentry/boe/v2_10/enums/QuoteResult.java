package omi.cboe.bzxoptions.binaryorderentry.boe.v2_10.enums;

import java.util.Optional;

/**
 * Result of the quote request.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteResult {

    /**
     * New Quote
     */
    NEW_QUOTE('A', "New Quote"),

    /**
     * Modified Loss Of Priority
     */
    MODIFIED_LOSS_OF_PRIORITY('L', "Modified Loss Of Priority"),

    /**
     * Modified Retains Priority
     */
    MODIFIED_RETAINS_PRIORITY('R', "Modified Retains Priority"),

    /**
     * No Change Matches Existing Quote
     */
    NO_CHANGE_MATCHES_EXISTING_QUOTE('N', "No Change Matches Existing Quote"),

    /**
     * New Quote But May Remove Liquidity
     */
    NEW_QUOTE_BUT_MAY_REMOVE_LIQUIDITY('D', "New Quote But May Remove Liquidity"),

    /**
     * Modified But May Remove Liquidity
     */
    MODIFIED_BUT_MAY_REMOVE_LIQUIDITY('d', "Modified But May Remove Liquidity"),

    /**
     * User Cancelled
     */
    USER_CANCELLED('U', "User Cancelled"),

    /**
     * Admin Rejection
     */
    ADMIN_REJECTION('a', "Admin Rejection"),

    /**
     * Rejected Cant Post
     */
    REJECTED_CANT_POST('P', "Rejected Cant Post"),

    /**
     * Risk Management Firm Or Custom Group Id Level
     */
    RISK_MANAGEMENT_FIRM_OR_CUSTOM_GROUP_ID_LEVEL('f', "Risk Management Firm Or Custom Group Id Level"),

    /**
     * Rejected Symbol Not Found
     */
    REJECTED_SYMBOL_NOT_FOUND('S', "Rejected Symbol Not Found"),

    /**
     * Rejected Invalid Price
     */
    REJECTED_INVALID_PRICE('p', "Rejected Invalid Price"),

    /**
     * Invalid Remove
     */
    INVALID_REMOVE('r', "Invalid Remove"),

    /**
     * Risk Management Risk Root Level
     */
    RISK_MANAGEMENT_RISK_ROOT_LEVEL('s', "Risk Management Risk Root Level"),

    /**
     * Rejected Other Reason
     */
    REJECTED_OTHER_REASON('u', "Rejected Other Reason"),

    /**
     * Risk Management Efid Group Level
     */
    RISK_MANAGEMENT_EFID_GROUP_LEVEL('+', "Risk Management Efid Group Level"),

    /**
     * Rejected Closing Only Series
     */
    REJECTED_CLOSING_ONLY_SERIES('c', "Rejected Closing Only Series");

    private final char wire;

    private final String description;

    QuoteResult(char wire, String description) {
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
    public static Optional<QuoteResult> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(NEW_QUOTE);
            case 'L' -> Optional.of(MODIFIED_LOSS_OF_PRIORITY);
            case 'R' -> Optional.of(MODIFIED_RETAINS_PRIORITY);
            case 'N' -> Optional.of(NO_CHANGE_MATCHES_EXISTING_QUOTE);
            case 'D' -> Optional.of(NEW_QUOTE_BUT_MAY_REMOVE_LIQUIDITY);
            case 'd' -> Optional.of(MODIFIED_BUT_MAY_REMOVE_LIQUIDITY);
            case 'U' -> Optional.of(USER_CANCELLED);
            case 'a' -> Optional.of(ADMIN_REJECTION);
            case 'P' -> Optional.of(REJECTED_CANT_POST);
            case 'f' -> Optional.of(RISK_MANAGEMENT_FIRM_OR_CUSTOM_GROUP_ID_LEVEL);
            case 'S' -> Optional.of(REJECTED_SYMBOL_NOT_FOUND);
            case 'p' -> Optional.of(REJECTED_INVALID_PRICE);
            case 'r' -> Optional.of(INVALID_REMOVE);
            case 's' -> Optional.of(RISK_MANAGEMENT_RISK_ROOT_LEVEL);
            case 'u' -> Optional.of(REJECTED_OTHER_REASON);
            case '+' -> Optional.of(RISK_MANAGEMENT_EFID_GROUP_LEVEL);
            case 'c' -> Optional.of(REJECTED_CLOSING_ONLY_SERIES);
            default -> Optional.empty();
        };
    }
}
