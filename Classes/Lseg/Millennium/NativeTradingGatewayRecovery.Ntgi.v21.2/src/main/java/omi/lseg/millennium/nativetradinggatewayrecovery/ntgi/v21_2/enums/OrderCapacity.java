package omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Capacity of the RFQ.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OrderCapacity {

    /**
     * Matched Principal Mtch
     */
    MATCHED_PRINCIPAL_MTCH((short) 1, "Matched Principal Mtch"),

    /**
     * Dealing On Own Account Deal
     */
    DEALING_ON_OWN_ACCOUNT_DEAL((short) 2, "Dealing On Own Account Deal"),

    /**
     * Any Other Trading Capacity Aotc
     */
    ANY_OTHER_TRADING_CAPACITY_AOTC((short) 3, "Any Other Trading Capacity Aotc");

    private final short wire;

    private final String description;

    OrderCapacity(short wire, String description) {
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
    public static Optional<OrderCapacity> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(MATCHED_PRINCIPAL_MTCH);
            case 2 -> Optional.of(DEALING_ON_OWN_ACCOUNT_DEAL);
            case 3 -> Optional.of(ANY_OTHER_TRADING_CAPACITY_AOTC);
            default -> Optional.empty();
        };
    }
}
