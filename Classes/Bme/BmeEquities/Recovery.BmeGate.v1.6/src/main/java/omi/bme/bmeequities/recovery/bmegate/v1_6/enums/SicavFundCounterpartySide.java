package omi.bme.bmeequities.recovery.bmegate.v1_6.enums;

import java.util.Optional;

/**
 * Indicates the side of the Counterparty member in a SICAV or Mutual Fund
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SicavFundCounterpartySide {

    /**
     * Buyer
     */
    BUYER('1', "Buyer"),

    /**
     * Seller
     */
    SELLER('2', "Seller"),

    /**
     * N/A
     */
    NOT_APPLICABLE(' ', "N/A");

    private final char wire;

    private final String description;

    SicavFundCounterpartySide(char wire, String description) {
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
    public static Optional<SicavFundCounterpartySide> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(BUYER);
            case '2' -> Optional.of(SELLER);
            case ' ' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
