package omi.nyse.nyseequities.bqt.xdp.v1_7_a.enums;

import java.util.Optional;

/**
 * The ID of the Originating Market
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum MarketIdOfOpenPrice {

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
     * NYSE American
     */
    NYSE_AMERICAN(9, "NYSE American");

    private final int wire;

    private final String description;

    MarketIdOfOpenPrice(int wire, String description) {
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
    public static Optional<MarketIdOfOpenPrice> fromWire(int wire) {
        return switch (wire) {
            case 0 -> Optional.of(NYSE_GROUP_BQT);
            case 1 -> Optional.of(NYSE);
            case 3 -> Optional.of(NYSE_ARCA);
            case 9 -> Optional.of(NYSE_AMERICAN);
            default -> Optional.empty();
        };
    }
}
