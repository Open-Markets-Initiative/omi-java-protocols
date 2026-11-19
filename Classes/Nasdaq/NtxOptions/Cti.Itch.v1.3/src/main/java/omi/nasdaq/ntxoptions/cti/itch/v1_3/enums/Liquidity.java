package omi.nasdaq.ntxoptions.cti.itch.v1_3.enums;

import java.util.Optional;

/**
 * Liquidity indicator. Additional alphanumeric values may be added in the future and should be considered as potential valid values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Liquidity {

    /**
     * Add
     */
    ADD('A', "Add"),

    /**
     * Remove
     */
    REMOVE('R', "Remove"),

    /**
     * Order Exposure Alerted (Flash Order)
     */
    ORDER_EXPOSURE_ALERTED('J', "Order Exposure Alerted (Flash Order)"),

    /**
     * Executed against a Flash Order
     */
    EXECUTED_AGAINST_A_FLASH_ORDER('K', "Executed against a Flash Order"),

    /**
     * Opening Trade Customer to Customer (not available on PHLX XL)
     */
    OPENING_TRADE_CUSTOMER_TO_CUSTOMER('F', "Opening Trade Customer to Customer (not available on PHLX XL)"),

    /**
     * Opening Trade (not available on PHLX XL)
     */
    OPENING_TRADE('O', "Opening Trade (not available on PHLX XL)"),

    /**
     * None (not applicable)
     */
    NONE('N', "None (not applicable)");

    private final char wire;

    private final String description;

    Liquidity(char wire, String description) {
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
    public static Optional<Liquidity> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ADD);
            case 'R' -> Optional.of(REMOVE);
            case 'J' -> Optional.of(ORDER_EXPOSURE_ALERTED);
            case 'K' -> Optional.of(EXECUTED_AGAINST_A_FLASH_ORDER);
            case 'F' -> Optional.of(OPENING_TRADE_CUSTOMER_TO_CUSTOMER);
            case 'O' -> Optional.of(OPENING_TRADE);
            case 'N' -> Optional.of(NONE);
            default -> Optional.empty();
        };
    }
}
