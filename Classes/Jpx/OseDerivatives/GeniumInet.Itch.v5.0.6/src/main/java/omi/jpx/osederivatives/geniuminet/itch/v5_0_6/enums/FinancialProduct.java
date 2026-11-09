package omi.jpx.osederivatives.geniuminet.itch.v5_0_6.enums;

import java.util.Optional;

/**
 * Product type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum FinancialProduct {

    /**
     * Option
     */
    OPTION((short) 1, "Option"),

    /**
     * Forward
     */
    FORWARD((short) 2, "Forward"),

    /**
     * Future
     */
    FUTURE((short) 3, "Future"),

    /**
     * Fra
     */
    FRA((short) 4, "Fra"),

    /**
     * Cash
     */
    CASH((short) 5, "Cash"),

    /**
     * Payment
     */
    PAYMENT((short) 6, "Payment"),

    /**
     * Exchange Rate
     */
    EXCHANGE_RATE((short) 7, "Exchange Rate"),

    /**
     * Interest Rate Swap
     */
    INTEREST_RATE_SWAP((short) 8, "Interest Rate Swap"),

    /**
     * Repo
     */
    REPO((short) 9, "Repo"),

    /**
     * Synthetic Box Leg Or Reference
     */
    SYNTHETIC_BOX_LEG_OR_REFERENCE((short) 10, "Synthetic Box Leg Or Reference"),

    /**
     * Combination
     */
    COMBINATION((short) 11, "Combination"),

    /**
     * Guarantee
     */
    GUARANTEE((short) 12, "Guarantee"),

    /**
     * Otc General
     */
    OTC_GENERAL((short) 13, "Otc General"),

    /**
     * Equity Warrant
     */
    EQUITY_WARRANT((short) 14, "Equity Warrant"),

    /**
     * Security Lending
     */
    SECURITY_LENDING((short) 15, "Security Lending");

    private final short wire;

    private final String description;

    FinancialProduct(short wire, String description) {
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
    public static Optional<FinancialProduct> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(OPTION);
            case 2 -> Optional.of(FORWARD);
            case 3 -> Optional.of(FUTURE);
            case 4 -> Optional.of(FRA);
            case 5 -> Optional.of(CASH);
            case 6 -> Optional.of(PAYMENT);
            case 7 -> Optional.of(EXCHANGE_RATE);
            case 8 -> Optional.of(INTEREST_RATE_SWAP);
            case 9 -> Optional.of(REPO);
            case 10 -> Optional.of(SYNTHETIC_BOX_LEG_OR_REFERENCE);
            case 11 -> Optional.of(COMBINATION);
            case 12 -> Optional.of(GUARANTEE);
            case 13 -> Optional.of(OTC_GENERAL);
            case 14 -> Optional.of(EQUITY_WARRANT);
            case 15 -> Optional.of(SECURITY_LENDING);
            default -> Optional.empty();
        };
    }
}
