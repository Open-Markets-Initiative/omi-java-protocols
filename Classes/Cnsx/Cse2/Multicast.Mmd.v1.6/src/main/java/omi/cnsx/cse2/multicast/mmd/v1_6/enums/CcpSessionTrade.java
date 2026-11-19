package omi.cnsx.cse2.multicast.mmd.v1_6.enums;

import java.util.Optional;

/**
 * "Y" = CCP Session Trade, "N" = Not CCP Session Trade.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CcpSessionTrade {

    /**
     * Ccp Session Trade
     */
    CCP_SESSION_TRADE('Y', "Ccp Session Trade"),

    /**
     * Not Ccp Session Trade
     */
    NOT_CCP_SESSION_TRADE('N', "Not Ccp Session Trade");

    private final char wire;

    private final String description;

    CcpSessionTrade(char wire, String description) {
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
    public static Optional<CcpSessionTrade> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(CCP_SESSION_TRADE);
            case 'N' -> Optional.of(NOT_CCP_SESSION_TRADE);
            default -> Optional.empty();
        };
    }
}
