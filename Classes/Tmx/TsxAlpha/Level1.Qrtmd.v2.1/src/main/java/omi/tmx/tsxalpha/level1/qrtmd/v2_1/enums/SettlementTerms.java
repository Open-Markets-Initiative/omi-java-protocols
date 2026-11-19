package omi.tmx.tsxalpha.level1.qrtmd.v2_1.enums;

import java.util.Optional;

/**
 * Settlement terms associated with the order.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SettlementTerms {

    /**
     * Default
     */
    DEFAULT(' ', "Default"),

    /**
     * Cash
     */
    CASH('C', "Cash"),

    /**
     * Non Net
     */
    NON_NET('N', "Non Net"),

    /**
     * Derivatives Related Contingent Equity Trade
     */
    DERIVATIVES_RELATED_CONTINGENT_EQUITY_TRADE('M', "Derivatives Related Contingent Equity Trade"),

    /**
     * Cash Today
     */
    CASH_TODAY('T', "Cash Today"),

    /**
     * There is a valid Settlement Date associated with the order
     */
    SETTLEMENT_DATE('D', "There is a valid Settlement Date associated with the order");

    private final char wire;

    private final String description;

    SettlementTerms(char wire, String description) {
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
    public static Optional<SettlementTerms> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(DEFAULT);
            case 'C' -> Optional.of(CASH);
            case 'N' -> Optional.of(NON_NET);
            case 'M' -> Optional.of(DERIVATIVES_RELATED_CONTINGENT_EQUITY_TRADE);
            case 'T' -> Optional.of(CASH_TODAY);
            case 'D' -> Optional.of(SETTLEMENT_DATE);
            default -> Optional.empty();
        };
    }
}
