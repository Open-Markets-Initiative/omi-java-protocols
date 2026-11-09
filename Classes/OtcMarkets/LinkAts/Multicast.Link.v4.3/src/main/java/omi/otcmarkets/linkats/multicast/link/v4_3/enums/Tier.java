package omi.otcmarkets.linkats.multicast.link.v4_3.enums;

import java.util.Optional;

/**
 * The market tier assigned by OTC Markets Group.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Tier {

    /**
     * No tier assigned
     */
    NO_TIER((short) 0, "No tier assigned"),

    /**
     * OTCQX U.S. Premier
     */
    OTCQXUS_PREMIER((short) 1, "OTCQX U.S. Premier"),

    /**
     * OTCQX U.S.
     */
    OTCQXUS((short) 2, "OTCQX U.S."),

    /**
     * OTCQX International Premier
     */
    OTCQX_INTERNATIONAL_PREMIER((short) 5, "OTCQX International Premier"),

    /**
     * OTCQX International
     */
    OTCQX_INTERNATIONAL((short) 6, "OTCQX International"),

    /**
     * OTCQB market
     */
    OTCQB((short) 10, "OTCQB market"),

    /**
     * OTC Bulletin Board only
     */
    OTCBB_ONLY((short) 11, "OTC Bulletin Board only"),

    /**
     * Pink Current Information
     */
    PINK_CURRENT((short) 20, "Pink Current Information"),

    /**
     * Pink Limited Information
     */
    PINK_LIMITED((short) 21, "Pink Limited Information"),

    /**
     * Pink No Information
     */
    PINK_NO_INFORMATION((short) 22, "Pink No Information"),

    /**
     * Grey Market
     */
    GREY_MARKET((short) 30, "Grey Market"),

    /**
     * Expert Market
     */
    EXPERT_MARKET((short) 40, "Expert Market"),

    /**
     * OTC Bonds
     */
    OTC_BONDS((short) 50, "OTC Bonds");

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
            case 1 -> Optional.of(OTCQXUS_PREMIER);
            case 2 -> Optional.of(OTCQXUS);
            case 5 -> Optional.of(OTCQX_INTERNATIONAL_PREMIER);
            case 6 -> Optional.of(OTCQX_INTERNATIONAL);
            case 10 -> Optional.of(OTCQB);
            case 11 -> Optional.of(OTCBB_ONLY);
            case 20 -> Optional.of(PINK_CURRENT);
            case 21 -> Optional.of(PINK_LIMITED);
            case 22 -> Optional.of(PINK_NO_INFORMATION);
            case 30 -> Optional.of(GREY_MARKET);
            case 40 -> Optional.of(EXPERT_MARKET);
            case 50 -> Optional.of(OTC_BONDS);
            default -> Optional.empty();
        };
    }
}
