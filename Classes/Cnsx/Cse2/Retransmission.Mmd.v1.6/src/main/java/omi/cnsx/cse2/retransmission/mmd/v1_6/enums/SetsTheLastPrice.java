package omi.cnsx.cse2.retransmission.mmd.v1_6.enums;

import java.util.Optional;

/**
 * "Y" = Last sale, "N" = Not last sale.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SetsTheLastPrice {

    /**
     * Last Sale
     */
    LAST_SALE('Y', "Last Sale"),

    /**
     * Not Last Sale
     */
    NOT_LAST_SALE('N', "Not Last Sale");

    private final char wire;

    private final String description;

    SetsTheLastPrice(char wire, String description) {
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
    public static Optional<SetsTheLastPrice> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(LAST_SALE);
            case 'N' -> Optional.of(NOT_LAST_SALE);
            default -> Optional.empty();
        };
    }
}
