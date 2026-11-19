package omi.otcmarkets.linknqb.topofbook.link.v1_18.enums;

import java.util.Optional;

/**
 * The market tier assigned by OTC Markets Group.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Tier {

    /**
     * No Tier.
     */
    NO_TIER((short) 0, "No Tier."),

    /**
     * OTCQX U.S.
     */
    OTCQX_US((short) 2, "OTCQX U.S."),

    /**
     * OTCQX International.
     */
    OTCQX_INTERNATIONAL((short) 6, "OTCQX International."),

    /**
     * OTCQB.
     */
    OTCQB((short) 10, "OTCQB."),

    /**
     * OTCID.
     */
    OTCID((short) 20, "OTCID."),

    /**
     * Pink Limited.
     */
    PINK_LIMITED((short) 21, "Pink Limited."),

    /**
     * Grey Market.
     */
    GREY_MARKET((short) 30, "Grey Market."),

    /**
     * Expert Market.
     */
    EXPERT_MARKET((short) 40, "Expert Market."),

    /**
     * OTC Bonds.
     */
    OTC_BONDS((short) 50, "OTC Bonds.");

    private final short wire;

    private final String description;

    Tier(short wire, String description) {
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
    public static Optional<Tier> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NO_TIER);
            case 2 -> Optional.of(OTCQX_US);
            case 6 -> Optional.of(OTCQX_INTERNATIONAL);
            case 10 -> Optional.of(OTCQB);
            case 20 -> Optional.of(OTCID);
            case 21 -> Optional.of(PINK_LIMITED);
            case 30 -> Optional.of(GREY_MARKET);
            case 40 -> Optional.of(EXPERT_MARKET);
            case 50 -> Optional.of(OTC_BONDS);
            default -> Optional.empty();
        };
    }
}
