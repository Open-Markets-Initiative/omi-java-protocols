package omi.miax.pearlequities.expressorders.meo.v2_6.enums;

import java.util.Optional;

/**
 * NBBO Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum NbboIndicator {

    /**
     * Order Set New Nbbo
     */
    ORDER_SET_NEW_NBBO('Y', "Order Set New Nbbo"),

    /**
     * First Order To Set Mbbo Equal To Nbbo
     */
    FIRST_ORDER_TO_SET_MBBO_EQUAL_TO_NBBO('F', "First Order To Set Mbbo Equal To Nbbo"),

    /**
     * Not Applicable
     */
    NOT_APPLICABLE('N', "Not Applicable");

    private final char wire;

    private final String description;

    NbboIndicator(char wire, String description) {
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
    public static Optional<NbboIndicator> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(ORDER_SET_NEW_NBBO);
            case 'F' -> Optional.of(FIRST_ORDER_TO_SET_MBBO_EQUAL_TO_NBBO);
            case 'N' -> Optional.of(NOT_APPLICABLE);
            default -> Optional.empty();
        };
    }
}
