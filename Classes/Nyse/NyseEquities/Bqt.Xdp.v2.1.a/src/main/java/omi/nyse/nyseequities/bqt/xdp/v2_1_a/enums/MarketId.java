package omi.nyse.nyseequities.bqt.xdp.v2_1_a.enums;

import java.util.Optional;

/**
 * ID of the Originating Market
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MarketId {

    /**
     * NYSE Group (BQT)
     */
    NYSE_GROUP_BQT(0, "NYSE Group (BQT)"),

    /**
     * NYSE
     */
    NYSE(1, "NYSE"),

    /**
     * NYSE Arca
     */
    NYSE_ARCA(3, "NYSE Arca"),

    /**
     * NYSE Arca Options
     */
    NYSE_ARCA_OPTIONS(4, "NYSE Arca Options"),

    /**
     * NYSE Bonds
     */
    NYSE_BONDS(5, "NYSE Bonds"),

    /**
     * Global OTC
     */
    GLOBAL_OTC(6, "Global OTC"),

    /**
     * NYSE Amex Options
     */
    NYSE_AMEX_OPTIONS(8, "NYSE Amex Options"),

    /**
     * NYSE American
     */
    NYSE_AMERICAN(9, "NYSE American"),

    /**
     * NYSE National
     */
    NYSE_NATIONAL(10, "NYSE National");

    private final int wire;

    private final String description;

    MarketId(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<MarketId> fromWire(int wire) {
        return switch (wire) {
            case 0 -> Optional.of(NYSE_GROUP_BQT);
            case 1 -> Optional.of(NYSE);
            case 3 -> Optional.of(NYSE_ARCA);
            case 4 -> Optional.of(NYSE_ARCA_OPTIONS);
            case 5 -> Optional.of(NYSE_BONDS);
            case 6 -> Optional.of(GLOBAL_OTC);
            case 8 -> Optional.of(NYSE_AMEX_OPTIONS);
            case 9 -> Optional.of(NYSE_AMERICAN);
            case 10 -> Optional.of(NYSE_NATIONAL);
            default -> Optional.empty();
        };
    }
}
