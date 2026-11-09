package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.enums;

import java.util.Optional;

/**
 * Identifies the participant type.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ParticipantType {

    /**
     * Customer
     */
    CUSTOMER((short) 1, "Customer"),

    /**
     * Market Maker / LMM
     */
    MARKET_MAKER((short) 2, "Market Maker / LMM"),

    /**
     * Designated Market Maker
     */
    DMM((short) 3, "Designated Market Maker"),

    /**
     * Supplemental Liquidity Provider
     */
    SLP((short) 4, "Supplemental Liquidity Provider"),

    /**
     * NYSE Floor Broker / NYSE Texas IB
     */
    FLOOR_BROKER((short) 5, "NYSE Floor Broker / NYSE Texas IB");

    private final short wire;

    private final String description;

    ParticipantType(short wire, String description) {
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
    public static Optional<ParticipantType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CUSTOMER);
            case 2 -> Optional.of(MARKET_MAKER);
            case 3 -> Optional.of(DMM);
            case 4 -> Optional.of(SLP);
            case 5 -> Optional.of(FLOOR_BROKER);
            default -> Optional.empty();
        };
    }
}
