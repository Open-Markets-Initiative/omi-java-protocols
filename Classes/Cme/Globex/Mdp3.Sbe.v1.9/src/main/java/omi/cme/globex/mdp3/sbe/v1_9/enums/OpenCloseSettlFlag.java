package omi.cme.globex.mdp3.sbe.v1_9.enums;

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
    INDICATIVE_OPENING_PRICE((short) 5, "Indicative Opening Price");

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
            default -> Optional.empty();
        };
    }
}
