package omi.cboe.neoequities.orderentry.boe3.v1_0_19.enums;

import java.util.Optional;

/**
 * Broker executed a Wash trade indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum WashTrade {

    /**
     * Broker Executed A Wash Trade
     */
    BROKER_EXECUTED_A_WASH_TRADE('Y', "Broker Executed A Wash Trade"),

    /**
     * All Other Cases
     */
    ALL_OTHER_CASES('N', "All Other Cases");

    private final char wire;

    private final String description;

    WashTrade(char wire, String description) {
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
    public static Optional<WashTrade> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(BROKER_EXECUTED_A_WASH_TRADE);
            case 'N' -> Optional.of(ALL_OTHER_CASES);
            default -> Optional.empty();
        };
    }
}
