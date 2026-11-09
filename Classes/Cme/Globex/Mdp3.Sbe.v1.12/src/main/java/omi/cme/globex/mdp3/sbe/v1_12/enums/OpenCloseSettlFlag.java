package omi.cme.globex.mdp3.sbe.v1_12.enums;

import java.util.Optional;

/**
 * Flag describing IOP and Open Price entries
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OpenCloseSettlFlag {

    /**
     * Flag describing IOP and Open Price entries
     */
    NO_VALUE((short) 255, "Flag describing IOP and Open Price entries"),

    /**
     * Daily Open Price
     */
    DAILY_OPEN_PRICE((short) 0, "Daily Open Price"),

    /**
     * Indicative Opening Price
     */
    INDICATIVE_OPENING_PRICE((short) 5, "Indicative Opening Price"),

    /**
     * Latest update to VWAP
     */
    INTRADAY_VWAP((short) 100, "Latest update to VWAP"),

    /**
     * Repo Average 8-30 AM
     */
    REPO_AVERAGE_830_AM((short) 101, "Repo Average 8-30 AM"),

    /**
     * Repo Average 10 AM
     */
    REPO_AVERAGE_10_AM((short) 102, "Repo Average 10 AM"),

    /**
     * Prev Session Repo Average 10 AM
     */
    PREV_SESSION_REPO_AVERAGE_10_AM((short) 103, "Prev Session Repo Average 10 AM");

    private final short wire;

    private final String description;

    OpenCloseSettlFlag(short wire, String description) {
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
    public static Optional<OpenCloseSettlFlag> fromWire(short wire) {
        return switch (wire) {
            case 255 -> Optional.of(NO_VALUE);
            case 0 -> Optional.of(DAILY_OPEN_PRICE);
            case 5 -> Optional.of(INDICATIVE_OPENING_PRICE);
            case 100 -> Optional.of(INTRADAY_VWAP);
            case 101 -> Optional.of(REPO_AVERAGE_830_AM);
            case 102 -> Optional.of(REPO_AVERAGE_10_AM);
            case 103 -> Optional.of(PREV_SESSION_REPO_AVERAGE_10_AM);
            default -> Optional.empty();
        };
    }
}
