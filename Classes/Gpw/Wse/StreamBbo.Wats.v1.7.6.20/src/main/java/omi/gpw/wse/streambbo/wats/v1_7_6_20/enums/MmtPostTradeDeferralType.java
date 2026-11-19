package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * MMT Post-Trade Deferral Type
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MmtPostTradeDeferralType {

    /**
     * 1 = Limited Details Trade
     */
    LIMITED_DETAILS_TRADE((short) 1, "1 = Limited Details Trade"),

    /**
     * 2 = Daily Aggregated Trade
     */
    DAILY_AGGREGATED_TRADE((short) 2, "2 = Daily Aggregated Trade"),

    /**
     * 3 = Volume Omission Trade
     */
    VOLUME_OMISSION_TRADE((short) 3, "3 = Volume Omission Trade"),

    /**
     * 4 = Four Weeks Aggregation Trade
     */
    FOUR_WEEKS_AGGREGATION_TRADE((short) 4, "4 = Four Weeks Aggregation Trade"),

    /**
     * 5 = Indefinite Aggregation Trade
     */
    INDEFINITE_AGGREGATION_TRADE((short) 5, "5 = Indefinite Aggregation Trade"),

    /**
     * 6 = Volume Omission Trade, eligible for subsequent enrichment in aggregated form
     */
    VOLUME_OMISSION_TRADE_AGGREGATED((short) 6, "6 = Volume Omission Trade, eligible for subsequent enrichment in aggregated form"),

    /**
     * - = Not applicable / No relevant deferral or enrichment type
     */
    NOT_APPLICABLE((short) 7, "- = Not applicable / No relevant deferral or enrichment type");

    private final short wire;

    private final String description;

    MmtPostTradeDeferralType(short wire, String description) {
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
    public static Optional<MmtPostTradeDeferralType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(LIMITED_DETAILS_TRADE);
            case 2 -> Optional.of(DAILY_AGGREGATED_TRADE);
            case 3 -> Optional.of(VOLUME_OMISSION_TRADE);
            case 4 -> Optional.of(FOUR_WEEKS_AGGREGATION_TRADE);
            case 5 -> Optional.of(INDEFINITE_AGGREGATION_TRADE);
            case 6 -> Optional.of(VOLUME_OMISSION_TRADE_AGGREGATED);
            case 7 -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
