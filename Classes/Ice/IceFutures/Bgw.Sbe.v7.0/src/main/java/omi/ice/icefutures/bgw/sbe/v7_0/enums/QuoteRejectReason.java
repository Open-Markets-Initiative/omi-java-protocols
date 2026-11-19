package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * quoteRejectReason
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum QuoteRejectReason {

    /**
     * Accepted
     */
    ACCEPTED((short) 0, "Accepted"),

    /**
     * Other
     */
    OTHER((short) 99, "Other"),

    /**
     * ValidationFailure
     */
    VALIDATION_FAILURE((short) 100, "ValidationFailure"),

    /**
     * InvalidUserID
     */
    INVALID_USER_ID((short) 101, "InvalidUserID"),

    /**
     * RiskProtectionActive
     */
    RISK_PROTECTION_ACTIVE((short) 102, "RiskProtectionActive"),

    /**
     * NoClearingAccountForTrader
     */
    NO_CLEARING_ACCOUNT_FOR_TRADER((short) 104, "NoClearingAccountForTrader"),

    /**
     * NoMassQuoteSets
     */
    NO_MASS_QUOTE_SETS((short) 105, "NoMassQuoteSets"),

    /**
     * FirstSetMassQuoteIsEmpty
     */
    FIRST_SET_MASS_QUOTE_IS_EMPTY((short) 106, "FirstSetMassQuoteIsEmpty"),

    /**
     * InvalidClearingAccountStatus
     */
    INVALID_CLEARING_ACCOUNT_STATUS((short) 107, "InvalidClearingAccountStatus"),

    /**
     * InvalidClearingLimits
     */
    INVALID_CLEARING_LIMITS((short) 108, "InvalidClearingLimits"),

    /**
     * InvalidMarketID
     */
    INVALID_MARKET_ID((short) 109, "InvalidMarketID"),

    /**
     * ExceedsAllowedMassQuoteSets
     */
    EXCEEDS_ALLOWED_MASS_QUOTE_SETS((short) 110, "ExceedsAllowedMassQuoteSets"),

    /**
     * ExceedsAllowedMassQuotes
     */
    EXCEEDS_ALLOWED_MASS_QUOTES((short) 111, "ExceedsAllowedMassQuotes"),

    /**
     * InvalidMassQuoteID
     */
    INVALID_MASS_QUOTE_ID((short) 112, "InvalidMassQuoteID");

    private final short wire;

    private final String description;

    QuoteRejectReason(short wire, String description) {
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
    public static Optional<QuoteRejectReason> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(ACCEPTED);
            case 99 -> Optional.of(OTHER);
            case 100 -> Optional.of(VALIDATION_FAILURE);
            case 101 -> Optional.of(INVALID_USER_ID);
            case 102 -> Optional.of(RISK_PROTECTION_ACTIVE);
            case 104 -> Optional.of(NO_CLEARING_ACCOUNT_FOR_TRADER);
            case 105 -> Optional.of(NO_MASS_QUOTE_SETS);
            case 106 -> Optional.of(FIRST_SET_MASS_QUOTE_IS_EMPTY);
            case 107 -> Optional.of(INVALID_CLEARING_ACCOUNT_STATUS);
            case 108 -> Optional.of(INVALID_CLEARING_LIMITS);
            case 109 -> Optional.of(INVALID_MARKET_ID);
            case 110 -> Optional.of(EXCEEDS_ALLOWED_MASS_QUOTE_SETS);
            case 111 -> Optional.of(EXCEEDS_ALLOWED_MASS_QUOTES);
            case 112 -> Optional.of(INVALID_MASS_QUOTE_ID);
            default -> Optional.empty();
        };
    }
}
