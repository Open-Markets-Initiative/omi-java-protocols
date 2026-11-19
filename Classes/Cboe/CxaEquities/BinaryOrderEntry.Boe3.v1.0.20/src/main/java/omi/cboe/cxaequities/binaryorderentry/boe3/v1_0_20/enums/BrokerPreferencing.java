package omi.cboe.cxaequities.binaryorderentry.boe3.v1_0_20.enums;

import java.util.Optional;

/**
 * Broker preferencing instruction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum BrokerPreferencing {

    /**
     * Match With Other Orders Using Broker Preferencing When Possible
     */
    MATCH_WITH_OTHER_ORDERS_USING_BROKER_PREFERENCING_WHEN_POSSIBLE('Y', "Match With Other Orders Using Broker Preferencing When Possible"),

    /**
     * Do Not Apply Broker Preferencing
     */
    DO_NOT_APPLY_BROKER_PREFERENCING('N', "Do Not Apply Broker Preferencing"),

    /**
     * NULL (0x00), apply port default
     */
    APPLY_PORT_DEFAULT('0', "NULL (0x00), apply port default");

    private final char wire;

    private final String description;

    BrokerPreferencing(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<BrokerPreferencing> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(MATCH_WITH_OTHER_ORDERS_USING_BROKER_PREFERENCING_WHEN_POSSIBLE);
            case 'N' -> Optional.of(DO_NOT_APPLY_BROKER_PREFERENCING);
            case '0' -> Optional.of(APPLY_PORT_DEFAULT);
            default -> Optional.empty();
        };
    }
}
