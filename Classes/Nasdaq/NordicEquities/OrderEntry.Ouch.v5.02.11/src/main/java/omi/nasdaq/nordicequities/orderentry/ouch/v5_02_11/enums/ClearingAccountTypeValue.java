package omi.nasdaq.nordicequities.orderentry.ouch.v5_02_11.enums;

import java.util.Optional;

/**
 * Account type used for the order when submitted to clearing
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ClearingAccountTypeValue {

    /**
     * Customer Client
     */
    CUSTOMER_CLIENT('1', "Customer Client"),

    /**
     * Firm House
     */
    FIRM_HOUSE('2', "Firm House");

    private final char wire;

    private final String description;

    ClearingAccountTypeValue(char wire, String description) {
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
    public static Optional<ClearingAccountTypeValue> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(CUSTOMER_CLIENT);
            case '2' -> Optional.of(FIRM_HOUSE);
            default -> Optional.empty();
        };
    }
}
