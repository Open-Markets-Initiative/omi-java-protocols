package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.enums;

import java.util.Optional;

/**
 * customerOrFirm
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum CustomerOrFirmOptional {

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
    PROF_CUSTOMER((byte) 5, "ProfCustomer"),

    /**
     * customerOrFirm
     */
    NO_VALUE((byte) -128, "customerOrFirm");

    private final byte wire;

    private final String description;

    CustomerOrFirmOptional(byte wire, String description) {
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
    public static Optional<CustomerOrFirmOptional> fromWire(byte wire) {
        return switch (wire) {
            case 0 -> Optional.of(CUSTOMER);
            case 1 -> Optional.of(FIRM);
            case 2 -> Optional.of(BROKER_DEALER);
            case 3 -> Optional.of(MARKET_MAKER);
            case 4 -> Optional.of(AWAY_MARKET_MAKER);
            case 5 -> Optional.of(PROF_CUSTOMER);
            case -128 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
