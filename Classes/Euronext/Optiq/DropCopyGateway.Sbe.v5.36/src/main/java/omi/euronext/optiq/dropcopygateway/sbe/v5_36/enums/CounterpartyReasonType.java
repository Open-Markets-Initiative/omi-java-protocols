package omi.euronext.optiq.dropcopygateway.sbe.v5_36.enums;

import java.util.Optional;

/**
 * counterpartyReasonType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum CounterpartyReasonType {

    /**
     * Internal_Matching_Service
     */
    INTERNAL_MATCHING_SERVICE((short) 1, "Internal_Matching_Service"),

    /**
     * Internal_Clearing_Service
     */
    INTERNAL_CLEARING_SERVICE((short) 2, "Internal_Clearing_Service"),

    /**
     * Primary_Market_Model_and_not_broadcast_to_the_Clearing_House
     */
    PRIMARY_MARKET_MODELANDNOTBROADCASTTOTHE_CLEARING_HOUSE((short) 3, "Primary_Market_Model_and_not_broadcast_to_the_Clearing_House"),

    /**
     * Public_Auctions_Market_VPU
     */
    PUBLIC_AUCTIONS_MARKET_VPU((short) 4, "Public_Auctions_Market_VPU"),

    /**
     * Non_clearable_instrument
     */
    NONCLEARABLEINSTRUMENT((short) 5, "Non_clearable_instrument"),

    /**
     * Firm_ID_Publication_RFQ
     */
    FIRM_ID_PUBLICATION_RFQ((short) 6, "Firm_ID_Publication_RFQ"),

    /**
     * Bilateral_Settlement_
     */
    BILATERAL_SETTLEMENT((short) 7, "Bilateral_Settlement_"),

    /**
     * counterpartyReasonType
     */
    NO_VALUE((short) 255, "counterpartyReasonType");

    private final short wire;

    private final String description;

    CounterpartyReasonType(short wire, String description) {
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
    public static Optional<CounterpartyReasonType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(INTERNAL_MATCHING_SERVICE);
            case 2 -> Optional.of(INTERNAL_CLEARING_SERVICE);
            case 3 -> Optional.of(PRIMARY_MARKET_MODELANDNOTBROADCASTTOTHE_CLEARING_HOUSE);
            case 4 -> Optional.of(PUBLIC_AUCTIONS_MARKET_VPU);
            case 5 -> Optional.of(NONCLEARABLEINSTRUMENT);
            case 6 -> Optional.of(FIRM_ID_PUBLICATION_RFQ);
            case 7 -> Optional.of(BILATERAL_SETTLEMENT);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
