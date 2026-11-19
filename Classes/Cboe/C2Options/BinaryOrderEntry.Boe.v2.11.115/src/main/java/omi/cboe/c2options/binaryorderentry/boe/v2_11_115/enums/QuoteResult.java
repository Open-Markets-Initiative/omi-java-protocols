package omi.cboe.c2options.binaryorderentry.boe.v2_11_115.enums;

import java.util.Optional;

/**
 * Result of the quote request. Acceptance: A = New Quote I = IOC Quote Accepted L = Modified; loss of priority R = Modified; retains priority (size reduction) N = No change, matches existing quote D = New Quote, but may remove liquidity d = Modified, but may remove liquidity V = No change, existing constituent series quote modify attempt after cutoff time (C1 only) Cancellation: U = User cancelled (zero size/price requested) Rejection: a = Admin O = Rejected, doesn’t match a known quote P = Rejected, can’t post f = Risk management firm or Custom Group ID level S = Rejected, symbol not found p = Rejected, invalid price r = Invalid Remove s = Risk management risk root level u = Rejected, other reason + = Risk management EFID Group level c = Rejected, closing only series v = Rejected, attempt to add constituent series quote after cutoff time (C1 only) Additional reasons indicating a reject may be added in the future with no notice.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteResult {

    /**
     * New Quote
     */
    NEW_QUOTE('A', "New Quote"),

    /**
     * IOC Quote Accepted
     */
    IOC_QUOTE_ACCEPTED('I', "IOC Quote Accepted"),

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
     * Modified, but may remove liquidity
     */
    MODIFIED_BUT_MAY_REMOVE_LIQUIDITY('d', "Modified, but may remove liquidity"),

    /**
     * No change, existing constituent series quote modify attempt after cutoff time (C1 only) Cancellation:
     */
    NO_CHANGE_EXISTING_CONSTITUENT_SERIES_QUOTE('V', "No change, existing constituent series quote modify attempt after cutoff time (C1 only) Cancellation:"),

    /**
     * User cancelled (zero size/price requested) Rejection:
     */
    USER_CANCELLED('U', "User cancelled (zero size/price requested) Rejection:"),

    /**
     * Admin
     */
    ADMIN('a', "Admin"),

    /**
     * Rejected, doesn’t match a known quote
     */
    REJECTED_DOESNT_MATCH_A_KNOWN_QUOTE('O', "Rejected, doesn\u2019t match a known quote"),

    /**
     * Rejected, can’t post
     */
    REJECTED_CANT_POST('P', "Rejected, can\u2019t post"),

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
     * Risk management risk root level
     */
    RISK_MANAGEMENT_RISK_ROOT_LEVEL('s', "Risk management risk root level"),

    /**
     * Rejected, other reason
     */
    REJECTED_OTHER_REASON('u', "Rejected, other reason"),

    /**
     * Risk management EFID Group level
     */
    RISK_MANAGEMENT_EFID_GROUP_LEVEL('+', "Risk management EFID Group level"),

    /**
     * Rejected, closing only series
     */
    REJECTED_CLOSING_ONLY_SERIES('c', "Rejected, closing only series"),

    /**
     * Rejected, attempt to add constituent series quote after cutoff time (C1 only) Additional reasons indicating a reject may be added in the future with no notice.
     */
    REJECTED_ATTEMPT_TO_ADD_CONSTITUENT_SERIES('v', "Rejected, attempt to add constituent series quote after cutoff time (C1 only) Additional reasons indicating a reject may be added in the future with no notice.");

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
            case 'I' -> Optional.of(IOC_QUOTE_ACCEPTED);
            case 'L' -> Optional.of(MODIFIED_L);
            case 'R' -> Optional.of(MODIFIED_R);
            case 'N' -> Optional.of(NO_CHANGE_MATCHES_EXISTING_QUOTE);
            case 'D' -> Optional.of(NEW_QUOTE_BUT_MAY_REMOVE_LIQUIDITY);
            case 'd' -> Optional.of(MODIFIED_BUT_MAY_REMOVE_LIQUIDITY);
            case 'V' -> Optional.of(NO_CHANGE_EXISTING_CONSTITUENT_SERIES_QUOTE);
            case 'U' -> Optional.of(USER_CANCELLED);
            case 'a' -> Optional.of(ADMIN);
            case 'O' -> Optional.of(REJECTED_DOESNT_MATCH_A_KNOWN_QUOTE);
            case 'P' -> Optional.of(REJECTED_CANT_POST);
            case 'f' -> Optional.of(RISK_MANAGEMENT_FIRM_OR_CUSTOM_GROUP_ID);
            case 'S' -> Optional.of(REJECTED_SYMBOL_NOT_FOUND);
            case 'p' -> Optional.of(REJECTED_INVALID_PRICE);
            case 'r' -> Optional.of(INVALID_REMOVE);
            case 's' -> Optional.of(RISK_MANAGEMENT_RISK_ROOT_LEVEL);
            case 'u' -> Optional.of(REJECTED_OTHER_REASON);
            case '+' -> Optional.of(RISK_MANAGEMENT_EFID_GROUP_LEVEL);
            case 'c' -> Optional.of(REJECTED_CLOSING_ONLY_SERIES);
            case 'v' -> Optional.of(REJECTED_ATTEMPT_TO_ADD_CONSTITUENT_SERIES);
            default -> Optional.empty();
        };
    }
}
