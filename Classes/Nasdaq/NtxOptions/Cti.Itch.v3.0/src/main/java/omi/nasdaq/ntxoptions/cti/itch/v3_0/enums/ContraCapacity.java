package omi.nasdaq.ntxoptions.cti.itch.v3_0.enums;

import java.util.Optional;

/**
 * Contra side capacity
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ContraCapacity {

    /**
     * Customer
     */
    CUSTOMER('C', "Customer"),

    /**
     * Proprietary Customer
     */
    PROPRIETARY_CUSTOMER('E', "Proprietary Customer"),

    /**
     * Retail Customer
     */
    RETAIL_CUSTOMER('R', "Retail Customer"),

    /**
     * Professional Customer
     */
    PROFESSIONAL_CUSTOMER('P', "Professional Customer"),

    /**
     * Broker Dealer Customer
     */
    BROKER_DEALER_CUSTOMER('B', "Broker Dealer Customer"),

    /**
     * Exchange Registered Market Maker
     */
    EXCHANGE_REGISTERED_MARKET_MAKER('M', "Exchange Registered Market Maker"),

    /**
     * Other Exchange Registered Market Maker (FARMM/AWAYMM)
     */
    OTHER_EXCHANGE_REGISTERED_MARKET_MAKER('O', "Other Exchange Registered Market Maker (FARMM/AWAYMM)"),

    /**
     * Not Applicable (stock leg execution or routed away execution)
     */
    NOT_APPLICABLE(' ', "Not Applicable (stock leg execution or routed away execution)"),

    /**
     * Joint BackOffice (JBO)
     */
    JOINT_BACK_OFFICE('J', "Joint BackOffice (JBO)"),

    /**
     * Firm
     */
    FIRM('F', "Firm"),

    /**
     * Proprietary Firm
     */
    PROPRIETARY_FIRM('f', "Proprietary Firm"),

    /**
     * Broker Dealer - Firm
     */
    BROKER_DEALER_FIRM('K', "Broker Dealer - Firm");

    private final char wire;

    private final String description;

    ContraCapacity(char wire, String description) {
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
    public static Optional<ContraCapacity> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CUSTOMER);
            case 'E' -> Optional.of(PROPRIETARY_CUSTOMER);
            case 'R' -> Optional.of(RETAIL_CUSTOMER);
            case 'P' -> Optional.of(PROFESSIONAL_CUSTOMER);
            case 'B' -> Optional.of(BROKER_DEALER_CUSTOMER);
            case 'M' -> Optional.of(EXCHANGE_REGISTERED_MARKET_MAKER);
            case 'O' -> Optional.of(OTHER_EXCHANGE_REGISTERED_MARKET_MAKER);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case 'J' -> Optional.of(JOINT_BACK_OFFICE);
            case 'F' -> Optional.of(FIRM);
            case 'f' -> Optional.of(PROPRIETARY_FIRM);
            case 'K' -> Optional.of(BROKER_DEALER_FIRM);
            default -> Optional.empty();
        };
    }
}
