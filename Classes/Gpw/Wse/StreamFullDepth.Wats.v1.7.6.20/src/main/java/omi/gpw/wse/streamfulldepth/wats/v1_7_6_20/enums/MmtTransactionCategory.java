package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * MMT Transaction Category
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MmtTransactionCategory {

    /**
     * D = Dark Trade
     */
    DARK_TRADE((short) 1, "D = Dark Trade"),

    /**
     * R = Trade that has received price improvement
     */
    TRADE_PRICE_IMPROVEMENT((short) 2, "R = Trade that has received price improvement"),

    /**
     * Z = Package Trade (excluding Exchange For Physicals)
     */
    PACKAGE_TRADE((short) 3, "Z = Package Trade (excluding Exchange For Physicals)"),

    /**
     * Y = Exchange For Physicals Trade
     */
    EXCHANGE_FOR_PHYSICALS_TRADE((short) 4, "Y = Exchange For Physicals Trade"),

    /**
     * - = None apply (a standard trade for the Market Mechanism and Trading Mode)
     */
    NONE((short) 5, "- = None apply (a standard trade for the Market Mechanism and Trading Mode)");

    private final short wire;

    private final String description;

    MmtTransactionCategory(short wire, String description) {
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
    public static Optional<MmtTransactionCategory> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(DARK_TRADE);
            case 2 -> Optional.of(TRADE_PRICE_IMPROVEMENT);
            case 3 -> Optional.of(PACKAGE_TRADE);
            case 4 -> Optional.of(EXCHANGE_FOR_PHYSICALS_TRADE);
            case 5 -> Optional.of(NONE);
            default -> Optional.empty();
        };
    }
}
