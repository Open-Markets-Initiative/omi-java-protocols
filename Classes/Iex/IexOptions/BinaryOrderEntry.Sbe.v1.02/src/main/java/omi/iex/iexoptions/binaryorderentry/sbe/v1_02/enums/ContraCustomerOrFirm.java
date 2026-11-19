package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.enums;

import java.util.Optional;

/**
 * contraCustomerOrFirm
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum ContraCustomerOrFirm {

    /**
     * Customer
     */
    CUSTOMER((byte) 0, "Customer"),

    /**
     * Firm
     */
    FIRM((byte) 1, "Firm"),

    /**
     * BrokerDealer
     */
    BROKER_DEALER((byte) 2, "BrokerDealer"),

    /**
     * MarketMaker
     */
    MARKET_MAKER((byte) 3, "MarketMaker"),

    /**
     * AwayMarketMaker
     */
    AWAY_MARKET_MAKER((byte) 4, "AwayMarketMaker"),

    /**
     * ProfCustomer
     */
    PROF_CUSTOMER((byte) 5, "ProfCustomer");

    private final byte wire;

    private final String description;

    ContraCustomerOrFirm(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<ContraCustomerOrFirm> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(CUSTOMER);
            case 1 -> Optional.of(FIRM);
            case 2 -> Optional.of(BROKER_DEALER);
            case 3 -> Optional.of(MARKET_MAKER);
            case 4 -> Optional.of(AWAY_MARKET_MAKER);
            case 5 -> Optional.of(PROF_CUSTOMER);
            default -> Optional.empty();
        };
    }
}
