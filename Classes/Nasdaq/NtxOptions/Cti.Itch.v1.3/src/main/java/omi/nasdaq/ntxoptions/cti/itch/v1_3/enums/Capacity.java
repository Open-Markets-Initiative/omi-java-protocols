package omi.nasdaq.ntxoptions.cti.itch.v1_3.enums;

import java.util.Optional;

/**
 * Same side capacity
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Capacity {

    /**
     * Customer
     */
    CUSTOMER('C', "Customer"),

    /**
     * Broker Dealer
     */
    BROKER_DEALER('Y', "Broker Dealer"),

    /**
     * Professional Customer
     */
    PROFESSIONAL_CUSTOMER('P', "Professional Customer"),

    /**
     * Firm
     */
    FIRM('F', "Firm"),

    /**
     * On-Floor Specialist, SQT or ROT (PHLX) or NOM/BX Options Market maker (NOM/BX Options)
     */
    MARKET_MAKER('M', "On-Floor Specialist, SQT or ROT (PHLX) or NOM/BX Options Market maker (NOM/BX Options)"),

    /**
     * Non-PHLX Registered Market Maker (PHLX) or Non-NOM/BX Options Registered Market Maker (NOM/BX Options)
     */
    NON_REGISTERED_MARKET_MAKER('O', "Non-PHLX Registered Market Maker (PHLX) or Non-NOM/BX Options Registered Market Maker (NOM/BX Options)"),

    /**
     * Joint BackOffice (JBO)
     */
    JOINT_BACK_OFFICE('J', "Joint BackOffice (JBO)");

    private final char wire;

    private final String description;

    Capacity(char wire, String description) {
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
    public static Optional<Capacity> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(CUSTOMER);
            case 'Y' -> Optional.of(BROKER_DEALER);
            case 'P' -> Optional.of(PROFESSIONAL_CUSTOMER);
            case 'F' -> Optional.of(FIRM);
            case 'M' -> Optional.of(MARKET_MAKER);
            case 'O' -> Optional.of(NON_REGISTERED_MARKET_MAKER);
            case 'J' -> Optional.of(JOINT_BACK_OFFICE);
            default -> Optional.empty();
        };
    }
}
