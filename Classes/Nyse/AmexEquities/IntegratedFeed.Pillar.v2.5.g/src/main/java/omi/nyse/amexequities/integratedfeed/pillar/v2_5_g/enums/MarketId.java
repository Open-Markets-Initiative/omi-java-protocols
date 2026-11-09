package omi.nyse.amexequities.integratedfeed.pillar.v2_5_g.enums;

import java.util.Optional;

/**
 * ID of the Originating Market.
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MarketId {

    /**
     * NYSE Equities
     */
    NYSE_EQUITIES(1, "NYSE Equities"),

    /**
     * NYSE Arca Equities
     */
    NYSE_ARCA_EQUITIES(3, "NYSE Arca Equities"),

    /**
     * NYSE Arca Options
     */
    NYSE_ARCA_OPTIONS(4, "NYSE Arca Options"),

    /**
     * NYSE Bonds
     */
    NYSE_BONDS(5, "NYSE Bonds"),

    /**
     * NYSE American Options
     */
    NYSE_AMERICAN_OPTIONS(8, "NYSE American Options"),

    /**
     * NYSE American Equities
     */
    NYSE_AMERICAN_EQUITIES(9, "NYSE American Equities"),

    /**
     * NYSE National Equities
     */
    NYSE_NATIONAL_EQUITIES(10, "NYSE National Equities"),

    /**
     * NYSE Texas Equities
     */
    NYSE_TEXAS_EQUITIES(11, "NYSE Texas Equities");

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
            case 1 -> Optional.of(NYSE_EQUITIES);
            case 3 -> Optional.of(NYSE_ARCA_EQUITIES);
            case 4 -> Optional.of(NYSE_ARCA_OPTIONS);
            case 5 -> Optional.of(NYSE_BONDS);
            case 8 -> Optional.of(NYSE_AMERICAN_OPTIONS);
            case 9 -> Optional.of(NYSE_AMERICAN_EQUITIES);
            case 10 -> Optional.of(NYSE_NATIONAL_EQUITIES);
            case 11 -> Optional.of(NYSE_TEXAS_EQUITIES);
            default -> Optional.empty();
        };
    }
}
