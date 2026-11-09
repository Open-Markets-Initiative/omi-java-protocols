package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.enums;

import java.util.Optional;

/**
 * Result of the quote request
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum QuoteResult {

    /**
     * New Quote
     */
    NEW_QUOTE_A('A', "New Quote"),

    /**
     * Modified Loss Of Priority
     */
    MODIFIED_LOSS_OF_PRIORITY('L', "Modified Loss Of Priority"),

    /**
     * Size reduction
     */
    MODIFIED_RETAINS_PRIORITY('R', "Size reduction"),

    /**
     * Matches existing quote
     */
    NO_CHANGE('N', "Matches existing quote"),

    /**
     * May remove liquidity
     */
    NEW_QUOTE_D('D', "May remove liquidity"),

    /**
     * Modified But May Remove Liquidity
     */
    MODIFIED_BUT_MAY_REMOVE_LIQUIDITY('d', "Modified But May Remove Liquidity"),

    /**
     * zero size/price
     */
    USER_CANCELLED('U', "zero size/price"),

    /**
     * Admin
     */
    ADMIN('a', "Admin"),

    /**
     * Rejected Doesnt Match A Known Quote
     */
    REJECTED_DOESNT_MATCH_A_KNOWN_QUOTE('O', "Rejected Doesnt Match A Known Quote"),

    /**
     * Rejected Cant Post
     */
    REJECTED_CANT_POST('P', "Rejected Cant Post"),

    /**
     * Risk Management Efid Or Custom Group Id Level
     */
    RISK_MANAGEMENT_EFID_OR_CUSTOM_GROUP_ID_LEVEL('f', "Risk Management Efid Or Custom Group Id Level"),

    /**
     * Rejected Symbol Not Found
     */
    REJECTED_SYMBOL_NOT_FOUND('S', "Rejected Symbol Not Found"),

    /**
     * Rejected Invalid Price
     */
    REJECTED_INVALID_PRICE('p', "Rejected Invalid Price"),

    /**
     * Risk Management Product Root Level
     */
    RISK_MANAGEMENT_PRODUCT_ROOT_LEVEL('s', "Risk Management Product Root Level"),

    /**
     * Risk Management Configuration Is Insuffcient
     */
    RISK_MANAGEMENT_CONFIGURATION_IS_INSUFFCIENT('n', "Risk Management Configuration Is Insuffcient"),

    /**
     * Rejected Other Reason
     */
    REJECTED_OTHER_REASON('u', "Rejected Other Reason");

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
            case 'A' -> Optional.of(NEW_QUOTE_A);
            case 'L' -> Optional.of(MODIFIED_LOSS_OF_PRIORITY);
            case 'R' -> Optional.of(MODIFIED_RETAINS_PRIORITY);
            case 'N' -> Optional.of(NO_CHANGE);
            case 'D' -> Optional.of(NEW_QUOTE_D);
            case 'd' -> Optional.of(MODIFIED_BUT_MAY_REMOVE_LIQUIDITY);
            case 'U' -> Optional.of(USER_CANCELLED);
            case 'a' -> Optional.of(ADMIN);
            case 'O' -> Optional.of(REJECTED_DOESNT_MATCH_A_KNOWN_QUOTE);
            case 'P' -> Optional.of(REJECTED_CANT_POST);
            case 'f' -> Optional.of(RISK_MANAGEMENT_EFID_OR_CUSTOM_GROUP_ID_LEVEL);
            case 'S' -> Optional.of(REJECTED_SYMBOL_NOT_FOUND);
            case 'p' -> Optional.of(REJECTED_INVALID_PRICE);
            case 's' -> Optional.of(RISK_MANAGEMENT_PRODUCT_ROOT_LEVEL);
            case 'n' -> Optional.of(RISK_MANAGEMENT_CONFIGURATION_IS_INSUFFCIENT);
            case 'u' -> Optional.of(REJECTED_OTHER_REASON);
            default -> Optional.empty();
        };
    }
}
