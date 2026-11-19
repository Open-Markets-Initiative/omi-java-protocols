package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_18.enums;

import java.util.Optional;

/**
 * Result of the quote request. Acceptance: A = New Quote L = Modified; loss of priority R = Modified; retains priority (size reduction) N = No change, matches existing quote D = New Quote, but may remove liquidity d = Modified, but may remove liquidity Cancellation: U = User cancelled (zero size/price requested) Rejection: a = Admin P = Rejected, cannot post f = Risk management firm or Custom Group ID level S = Rejected, symbol not found p = Rejected, invalid price r = Invalid Remove s = Risk management underlying level u = Rejected, other reason Additional reasons indicating a reject may be added in the future with no notice.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteResult {

    /**
     * New Quote
     */
    NEW_QUOTE('A', "New Quote"),

    /**
     * Modified; loss of priority
     */
    MODIFIED_L('L', "Modified; loss of priority"),

    /**
     * Modified; retains priority (size reduction)
     */
    MODIFIED_R('R', "Modified; retains priority (size reduction)"),

    /**
     * No change, matches existing quote
     */
    NO_CHANGE_MATCHES_EXISTING_QUOTE('N', "No change, matches existing quote"),

    /**
     * New Quote, but may remove liquidity
     */
    NEW_QUOTE_BUT_MAY_REMOVE_LIQUIDITY('D', "New Quote, but may remove liquidity"),

    /**
     * Modified, but may remove liquidity Cancellation:
     */
    MODIFIED_BUT_MAY_REMOVE_LIQUIDITY('d', "Modified, but may remove liquidity Cancellation:"),

    /**
     * User cancelled (zero size/price requested) Rejection:
     */
    USER_CANCELLED('U', "User cancelled (zero size/price requested) Rejection:"),

    /**
     * Admin
     */
    ADMIN('a', "Admin"),

    /**
     * Rejected, cannot post
     */
    REJECTED_CANNOT_POST('P', "Rejected, cannot post"),

    /**
     * Risk management firm or Custom Group ID level
     */
    RISK_MANAGEMENT_FIRM_OR_CUSTOM_GROUP_ID('f', "Risk management firm or Custom Group ID level"),

    /**
     * Rejected, symbol not found
     */
    REJECTED_SYMBOL_NOT_FOUND('S', "Rejected, symbol not found"),

    /**
     * Rejected, invalid price
     */
    REJECTED_INVALID_PRICE('p', "Rejected, invalid price"),

    /**
     * Invalid Remove
     */
    INVALID_REMOVE('r', "Invalid Remove"),

    /**
     * Risk management underlying level
     */
    RISK_MANAGEMENT_UNDERLYING_LEVEL('s', "Risk management underlying level"),

    /**
     * Rejected, other reason Additional reasons indicating a reject may be added in the future with no notice.
     */
    REJECTED_OTHER_REASON('u', "Rejected, other reason Additional reasons indicating a reject may be added in the future with no notice.");

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
            case 'L' -> Optional.of(MODIFIED_L);
            case 'R' -> Optional.of(MODIFIED_R);
            case 'N' -> Optional.of(NO_CHANGE_MATCHES_EXISTING_QUOTE);
            case 'D' -> Optional.of(NEW_QUOTE_BUT_MAY_REMOVE_LIQUIDITY);
            case 'd' -> Optional.of(MODIFIED_BUT_MAY_REMOVE_LIQUIDITY);
            case 'U' -> Optional.of(USER_CANCELLED);
            case 'a' -> Optional.of(ADMIN);
            case 'P' -> Optional.of(REJECTED_CANNOT_POST);
            case 'f' -> Optional.of(RISK_MANAGEMENT_FIRM_OR_CUSTOM_GROUP_ID);
            case 'S' -> Optional.of(REJECTED_SYMBOL_NOT_FOUND);
            case 'p' -> Optional.of(REJECTED_INVALID_PRICE);
            case 'r' -> Optional.of(INVALID_REMOVE);
            case 's' -> Optional.of(RISK_MANAGEMENT_UNDERLYING_LEVEL);
            case 'u' -> Optional.of(REJECTED_OTHER_REASON);
            default -> Optional.empty();
        };
    }
}
