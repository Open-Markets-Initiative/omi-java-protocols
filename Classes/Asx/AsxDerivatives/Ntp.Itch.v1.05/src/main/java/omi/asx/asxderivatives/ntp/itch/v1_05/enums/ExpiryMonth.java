package omi.asx.asxderivatives.ntp.itch.v1_05.enums;

import java.util.Optional;

/**
 * Month of expiry for futures contract types, zero otherwise.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ExpiryMonth {

    /**
     * Jan
     */
    JAN((short) 1, "Jan"),

    /**
     * Feb
     */
    FEB((short) 2, "Feb"),

    /**
     * Mar
     */
    MAR((short) 3, "Mar"),

    /**
     * Apr
     */
    APR((short) 4, "Apr"),

    /**
     * May
     */
    MAY((short) 5, "May"),

    /**
     * Jun
     */
    JUN((short) 6, "Jun"),

    /**
     * Jul
     */
    JUL((short) 7, "Jul"),

    /**
     * Aug
     */
    AUG((short) 8, "Aug"),

    /**
     * Sep
     */
    SEP((short) 9, "Sep"),

    /**
     * Oct
     */
    OCT((short) 10, "Oct"),

    /**
     * Nov
     */
    NOV((short) 11, "Nov"),

    /**
     * Dec
     */
    DEC((short) 12, "Dec");

    private final short wire;

    private final String description;

    ExpiryMonth(short wire, String description) {
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
    public static Optional<ExpiryMonth> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(JAN);
            case 2 -> Optional.of(FEB);
            case 3 -> Optional.of(MAR);
            case 4 -> Optional.of(APR);
            case 5 -> Optional.of(MAY);
            case 6 -> Optional.of(JUN);
            case 7 -> Optional.of(JUL);
            case 8 -> Optional.of(AUG);
            case 9 -> Optional.of(SEP);
            case 10 -> Optional.of(OCT);
            case 11 -> Optional.of(NOV);
            case 12 -> Optional.of(DEC);
            default -> Optional.empty();
        };
    }
}
