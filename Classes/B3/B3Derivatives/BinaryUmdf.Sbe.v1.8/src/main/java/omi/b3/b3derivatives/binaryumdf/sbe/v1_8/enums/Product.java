package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * product
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Product {

    /**
     * Commodity.
     */
    COMMODITY((short) 2, "Commodity."),

    /**
     * Corporate Fixed Income.
     */
    CORPORATE((short) 3, "Corporate Fixed Income."),

    /**
     * Currency.
     */
    CURRENCY((short) 4, "Currency."),

    /**
     * Equity.
     */
    EQUITY((short) 5, "Equity."),

    /**
     * Public debt.
     */
    GOVERNMENT((short) 6, "Public debt."),

    /**
     * Index.
     */
    INDEX((short) 7, "Index."),

    /**
     * Economic indicator.
     */
    ECONOMIC_INDICATOR((short) 15, "Economic indicator."),

    /**
     * Multileg.
     */
    MULTILEG((short) 16, "Multileg.");

    private final short wire;

    private final String description;

    Product(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<Product> fromWire(short wire) {
        return switch (wire) {
            case 2 -> Optional.of(COMMODITY);
            case 3 -> Optional.of(CORPORATE);
            case 4 -> Optional.of(CURRENCY);
            case 5 -> Optional.of(EQUITY);
            case 6 -> Optional.of(GOVERNMENT);
            case 7 -> Optional.of(INDEX);
            case 15 -> Optional.of(ECONOMIC_INDICATOR);
            case 16 -> Optional.of(MULTILEG);
            default -> Optional.empty();
        };
    }
}
