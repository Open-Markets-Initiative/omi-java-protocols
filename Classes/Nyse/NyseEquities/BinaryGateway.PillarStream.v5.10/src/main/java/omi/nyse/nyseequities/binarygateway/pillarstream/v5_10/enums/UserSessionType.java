package omi.nyse.nyseequities.binarygateway.pillarstream.v5_10.enums;

import java.util.Optional;

/**
 * Defines the permission type assigned to the gateway session.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum UserSessionType {

    /**
     * Customer (all asset classes) and/or Equities Market Maker
     */
    CUSTOMER((short) 1, "Customer (all asset classes) and/or Equities Market Maker"),

    /**
     * Service Bureau
     */
    SERVICE_BUREAU((short) 2, "Service Bureau"),

    /**
     * Designated Market Maker (DMM)
     */
    DESIGNATED_MARKET_MAKER((short) 3, "Designated Market Maker (DMM)"),

    /**
     * Options Market Maker
     */
    OPTIONS_MARKET_MAKER((short) 4, "Options Market Maker"),

    /**
     * Third Party Algo Vendor
     */
    THIRD_PARTY_ALGO_VENDOR((short) 5, "Third Party Algo Vendor"),

    /**
     * NYSE Floor Broker
     */
    NYSE_FLOOR_BROKER((short) 6, "NYSE Floor Broker"),

    /**
     * Direct to NYSE Floor Broker
     */
    DIRECT_TO_NYSE_FLOOR_BROKER((short) 7, "Direct to NYSE Floor Broker");

    private final short wire;

    private final String description;

    UserSessionType(short wire, String description) {
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
    public static Optional<UserSessionType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CUSTOMER);
            case 2 -> Optional.of(SERVICE_BUREAU);
            case 3 -> Optional.of(DESIGNATED_MARKET_MAKER);
            case 4 -> Optional.of(OPTIONS_MARKET_MAKER);
            case 5 -> Optional.of(THIRD_PARTY_ALGO_VENDOR);
            case 6 -> Optional.of(NYSE_FLOOR_BROKER);
            case 7 -> Optional.of(DIRECT_TO_NYSE_FLOOR_BROKER);
            default -> Optional.empty();
        };
    }
}
