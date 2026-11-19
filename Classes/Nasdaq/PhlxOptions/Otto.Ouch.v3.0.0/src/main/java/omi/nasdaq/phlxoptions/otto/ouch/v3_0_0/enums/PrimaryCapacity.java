package omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * See Order Capacity Field
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PrimaryCapacity {

    /**
     * Customer
     */
    CUSTOMER('C', "Customer"),

    /**
     * Firm
     */
    FIRM('F', "Firm"),

    /**
     * Market Maker
     */
    MARKET_MAKER('M', "Market Maker"),

    /**
     * Other-Exchange Registered Market Maker (FARMM/AWAYMM)
     */
    OTHER_EXCHANGE_REGISTERED_MARKET_MAKER('O', "Other-Exchange Registered Market Maker (FARMM/AWAYMM)"),

    /**
     * Professional Customer
     */
    PROFESSIONAL_CUSTOMER('P', "Professional Customer"),

    /**
     * Broker/Dealer
     */
    BROKER_DEALER('B', "Broker/Dealer"),

    /**
     * Joint BackOffice (JBO). Supported on PHLX and NOM; placeholder on ISE, GEMX and MRX
     */
    JOINT_BACK_OFFICE('J', "Joint BackOffice (JBO). Supported on PHLX and NOM; placeholder on ISE, GEMX and MRX"),

    /**
     * Retail. Placeholder in all venues
     */
    RETAIL('R', "Retail. Placeholder in all venues"),

    /**
     * Space = N/A
     */
    NOT_APPLICABLE(' ', "Space = N/A");

    private final char wire;

    private final String description;

    PrimaryCapacity(char wire, String description) {
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
    public static Optional<PrimaryCapacity> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CUSTOMER);
            case 'F' -> Optional.of(FIRM);
            case 'M' -> Optional.of(MARKET_MAKER);
            case 'O' -> Optional.of(OTHER_EXCHANGE_REGISTERED_MARKET_MAKER);
            case 'P' -> Optional.of(PROFESSIONAL_CUSTOMER);
            case 'B' -> Optional.of(BROKER_DEALER);
            case 'J' -> Optional.of(JOINT_BACK_OFFICE);
            case 'R' -> Optional.of(RETAIL);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
