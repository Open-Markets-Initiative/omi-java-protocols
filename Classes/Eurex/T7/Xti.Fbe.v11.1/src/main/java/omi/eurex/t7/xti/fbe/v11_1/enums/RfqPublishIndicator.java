package omi.eurex.t7.xti.fbe.v11_1.enums;

import java.util.Optional;

/**
 * Defines the RfqPublishIndicator values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum RfqPublishIndicator {

    /**
     * Market Data(public)
     */
    MARKET_DATA((short) 1, "Market Data(public)"),

    /**
     * Designated Sponsor(private)
     */
    DESIGNATED_SPONSOR((short) 2, "Designated Sponsor(private)"),

    /**
     * Market Data(public) and Designated Sponsor(private)
     */
    MARKET_DATAAND_DESIGNATED_SPONSOR((short) 3, "Market Data(public) and Designated Sponsor(private)"),

    /**
     * Market Maker(private) and Designated Sponsor(private)
     */
    MARKET_MAKERAND_DESIGNATED_SPONSOR((short) 4, "Market Maker(private) and Designated Sponsor(private)"),

    /**
     * Market Data(public) and Market Maker(private) and Designated Sponsor(private)
     */
    MARKET_DATAAND_MARKET_MAKERAND_DESIGNATED_SPONSOR((short) 5, "Market Data(public) and Market Maker(private) and Designated Sponsor(private)"),

    /**
     * Specialist(private)
     */
    SPECIALIST((short) 6, "Specialist(private)"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    RfqPublishIndicator(short wire, String description) {
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
    public static Optional<RfqPublishIndicator> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(MARKET_DATA);
            case 2 -> Optional.of(DESIGNATED_SPONSOR);
            case 3 -> Optional.of(MARKET_DATAAND_DESIGNATED_SPONSOR);
            case 4 -> Optional.of(MARKET_MAKERAND_DESIGNATED_SPONSOR);
            case 5 -> Optional.of(MARKET_DATAAND_MARKET_MAKERAND_DESIGNATED_SPONSOR);
            case 6 -> Optional.of(SPECIALIST);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
