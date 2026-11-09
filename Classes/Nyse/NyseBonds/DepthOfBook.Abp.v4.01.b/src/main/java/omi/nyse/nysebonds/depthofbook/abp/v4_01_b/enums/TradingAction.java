package omi.nyse.nysebonds.depthofbook.abp.v4_01_b.enums;

import java.util.Optional;

/**
 * The current state of trading for this bond.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum TradingAction {

    /**
     * Called
     */
    CALLED((short) 1, "Called"),

    /**
     * Delisted
     */
    DELISTED((short) 2, "Delisted"),

    /**
     * Ex Interest
     */
    EX_INTEREST((short) 3, "Ex Interest"),

    /**
     * Missed An Interest Payment
     */
    MISSED_AN_INTEREST_PAYMENT((short) 4, "Missed An Interest Payment"),

    /**
     * Bankrupt
     */
    BANKRUPT((short) 5, "Bankrupt"),

    /**
     * Late Filing
     */
    LATE_FILING((short) 6, "Late Filing"),

    /**
     * Below Listing Standards
     */
    BELOW_LISTING_STANDARDS((short) 7, "Below Listing Standards"),

    /**
     * Late Filing And Below Listing Standards
     */
    LATE_FILING_AND_BELOW_LISTING_STANDARDS((short) 8, "Late Filing And Below Listing Standards"),

    /**
     * Bankrupt And Late Filing
     */
    BANKRUPT_AND_LATE_FILING((short) 9, "Bankrupt And Late Filing"),

    /**
     * Bankrupt And Below Listing Standards
     */
    BANKRUPT_AND_BELOW_LISTING_STANDARDS((short) 10, "Bankrupt And Below Listing Standards");

    private final short wire;

    private final String description;

    TradingAction(short wire, String description) {
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
    public static Optional<TradingAction> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CALLED);
            case 2 -> Optional.of(DELISTED);
            case 3 -> Optional.of(EX_INTEREST);
            case 4 -> Optional.of(MISSED_AN_INTEREST_PAYMENT);
            case 5 -> Optional.of(BANKRUPT);
            case 6 -> Optional.of(LATE_FILING);
            case 7 -> Optional.of(BELOW_LISTING_STANDARDS);
            case 8 -> Optional.of(LATE_FILING_AND_BELOW_LISTING_STANDARDS);
            case 9 -> Optional.of(BANKRUPT_AND_LATE_FILING);
            case 10 -> Optional.of(BANKRUPT_AND_BELOW_LISTING_STANDARDS);
            default -> Optional.empty();
        };
    }
}
