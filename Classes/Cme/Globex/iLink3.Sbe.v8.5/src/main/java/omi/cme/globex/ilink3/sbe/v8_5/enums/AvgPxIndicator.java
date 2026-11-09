package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Average pricing indicator
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AvgPxIndicator {

    /**
     * Average pricing indicator
     */
    NO_VALUE((short) 255, "Average pricing indicator"),

    /**
     * No Average Pricing
     */
    NO_AVERAGE_PRICING((short) 0, "No Average Pricing"),

    /**
     * Trade is part of an Average Price Group Identified by the AvgPxGrp ID
     */
    TRADEISPARTOFAN_AVERAGE_PRICE_GROUP_IDENTIFIEDBYTHE_AVG_PX_GRP_ID((short) 1, "Trade is part of an Average Price Group Identified by the AvgPxGrp ID"),

    /**
     * Trade is part of a Notional Value Average Price Group
     */
    TRADEISPARTOFA_NOTIONAL_VALUE_AVERAGE_PRICE_GROUP((short) 3, "Trade is part of a Notional Value Average Price Group");

    private final short wire;

    private final String description;

    AvgPxIndicator(short wire, String description) {
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
    public static Optional<AvgPxIndicator> fromWire(short wire) {
        return switch (wire) {
            case 255 -> Optional.of(NO_VALUE);
            case 0 -> Optional.of(NO_AVERAGE_PRICING);
            case 1 -> Optional.of(TRADEISPARTOFAN_AVERAGE_PRICE_GROUP_IDENTIFIEDBYTHE_AVG_PX_GRP_ID);
            case 3 -> Optional.of(TRADEISPARTOFA_NOTIONAL_VALUE_AVERAGE_PRICE_GROUP);
            default -> Optional.empty();
        };
    }
}
