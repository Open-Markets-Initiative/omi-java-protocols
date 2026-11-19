package omi.cboe.cxaequities.multicastdepthofbook.pitch.v1_0_12.enums;

import java.util.Optional;

/**
 * Category of the calculated value.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ValueCategory {

    /**
     * Closing Price
     */
    CLOSING_PRICE('1', "Closing Price"),

    /**
     * I Nav Values Etf
     */
    I_NAV_VALUES_ETF('2', "I Nav Values Etf"),

    /**
     * Index Values
     */
    INDEX_VALUES('3', "Index Values"),

    /**
     * Eod Nav From Issuer
     */
    EOD_NAV_FROM_ISSUER('4', "Eod Nav From Issuer");

    private final char wire;

    private final String description;

    ValueCategory(char wire, String description) {
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
    public static Optional<ValueCategory> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(CLOSING_PRICE);
            case '2' -> Optional.of(I_NAV_VALUES_ETF);
            case '3' -> Optional.of(INDEX_VALUES);
            case '4' -> Optional.of(EOD_NAV_FROM_ISSUER);
            default -> Optional.empty();
        };
    }
}
