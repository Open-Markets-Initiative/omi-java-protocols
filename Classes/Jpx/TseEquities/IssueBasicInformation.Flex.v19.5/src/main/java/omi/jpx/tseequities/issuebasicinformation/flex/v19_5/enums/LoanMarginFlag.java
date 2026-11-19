package omi.jpx.tseequities.issuebasicinformation.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the Loan・margin flag.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum LoanMarginFlag {

    /**
     * Loan Issue
     */
    LOAN_ISSUE('1', "Loan Issue"),

    /**
     * Margin Transaction Issue
     */
    MARGIN_TRANSACTION_ISSUE('2', "Margin Transaction Issue"),

    /**
     * Other Than The Above
     */
    OTHER_THAN_THE_ABOVE('0', "Other Than The Above");

    private final char wire;

    private final String description;

    LoanMarginFlag(char wire, String description) {
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
    public static Optional<LoanMarginFlag> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(LOAN_ISSUE);
            case '2' -> Optional.of(MARGIN_TRANSACTION_ISSUE);
            case '0' -> Optional.of(OTHER_THAN_THE_ABOVE);
            default -> Optional.empty();
        };
    }
}
