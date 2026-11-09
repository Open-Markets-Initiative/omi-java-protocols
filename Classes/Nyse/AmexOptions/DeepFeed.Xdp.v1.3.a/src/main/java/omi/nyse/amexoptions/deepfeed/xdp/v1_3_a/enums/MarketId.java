package omi.nyse.amexoptions.deepfeed.xdp.v1_3_a.enums;

import java.util.Optional;

/**
 * Identifies originating market
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MarketId {

    /**
     * NYSE Cash
     */
    NYSE_CASH(1, "NYSE Cash"),

    /**
     * Europe Cash
     */
    EUROPE_CASH(2, "Europe Cash"),

    /**
     * NYSE Arca Cash
     */
    NYSE_ARCA_CASH(3, "NYSE Arca Cash"),

    /**
     * NYSE/Arca Options
     */
    NYSE_ARCA_OPTIONS(4, "NYSE/Arca Options"),

    /**
     * NYSE/Arca Bonds
     */
    NYSE_ARCA_BONDS(5, "NYSE/Arca Bonds"),

    /**
     * ArcaEdge
     */
    ARCA_EDGE(6, "ArcaEdge"),

    /**
     * LIFFE
     */
    LIFFE(7, "LIFFE"),

    /**
     * NYSE American Options
     */
    NYSE_AMERICAN_OPTIONS(8, "NYSE American Options"),

    /**
     * NYSE MKT Cash
     */
    NYSE_MKT_CASH(9, "NYSE MKT Cash");

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
            case 1 -> Optional.of(NYSE_CASH);
            case 2 -> Optional.of(EUROPE_CASH);
            case 3 -> Optional.of(NYSE_ARCA_CASH);
            case 4 -> Optional.of(NYSE_ARCA_OPTIONS);
            case 5 -> Optional.of(NYSE_ARCA_BONDS);
            case 6 -> Optional.of(ARCA_EDGE);
            case 7 -> Optional.of(LIFFE);
            case 8 -> Optional.of(NYSE_AMERICAN_OPTIONS);
            case 9 -> Optional.of(NYSE_MKT_CASH);
            default -> Optional.empty();
        };
    }
}
