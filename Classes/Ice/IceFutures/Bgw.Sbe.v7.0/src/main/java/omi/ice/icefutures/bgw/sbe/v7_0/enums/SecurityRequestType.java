package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * securityRequestType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SecurityRequestType {

    /**
     * CreateStrategy
     */
    CREATE_STRATEGY((short) 1, "CreateStrategy"),

    /**
     * RequestListofFutures
     */
    REQUEST_LISTOF_FUTURES((short) 3, "RequestListofFutures"),

    /**
     * RequestListofOptions
     */
    REQUEST_LISTOF_OPTIONS((short) 100, "RequestListofOptions"),

    /**
     * RequestListofStrategies
     */
    REQUEST_LISTOF_STRATEGIES((short) 101, "RequestListofStrategies"),

    /**
     * CreateFlexOption
     */
    CREATE_FLEX_OPTION((short) 102, "CreateFlexOption"),

    /**
     * CreateFlexExpiry
     */
    CREATE_FLEX_EXPIRY((short) 103, "CreateFlexExpiry"),

    /**
     * RequestListOfProducts
     */
    REQUEST_LIST_OF_PRODUCTS((short) 104, "RequestListOfProducts");

    private final short wire;

    private final String description;

    SecurityRequestType(short wire, String description) {
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
    public static Optional<SecurityRequestType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(CREATE_STRATEGY);
            case 3 -> Optional.of(REQUEST_LISTOF_FUTURES);
            case 100 -> Optional.of(REQUEST_LISTOF_OPTIONS);
            case 101 -> Optional.of(REQUEST_LISTOF_STRATEGIES);
            case 102 -> Optional.of(CREATE_FLEX_OPTION);
            case 103 -> Optional.of(CREATE_FLEX_EXPIRY);
            case 104 -> Optional.of(REQUEST_LIST_OF_PRODUCTS);
            default -> Optional.empty();
        };
    }
}
