package omi.nasdaq.nasdaqcanada.orderentry.ouch.v5_0_1_4.enums;

import java.util.Optional;

/**
 * N = MAQ; m = MAQ at touch (CXD only); t = MQ at touch (CXD only); z = Minimum Quantity (MQ). Default N
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MinQtyType {

    /**
     * MAQ (Minimum Acceptable Quantity), MinQty must be met on every partial execution
     */
    MAQ('N', "MAQ (Minimum Acceptable Quantity), MinQty must be met on every partial execution"),

    /**
     * MAQ at touch (CXD only)
     */
    MAQ_AT_TOUCH('m', "MAQ at touch (CXD only)"),

    /**
     * MQ at touch (CXD only)
     */
    MQ_AT_TOUCH('t', "MQ at touch (CXD only)"),

    /**
     * Minimum Quantity (MQ), MinQty may be met in aggregate
     */
    MINIMUM_QUANTITY('z', "Minimum Quantity (MQ), MinQty may be met in aggregate");

    private final char wire;

    private final String description;

    MinQtyType(char wire, String description) {
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
    public static Optional<MinQtyType> fromWire(char wire) {
        return switch (wire) {
            case 'N' -> Optional.of(MAQ);
            case 'm' -> Optional.of(MAQ_AT_TOUCH);
            case 't' -> Optional.of(MQ_AT_TOUCH);
            case 'z' -> Optional.of(MINIMUM_QUANTITY);
            default -> Optional.empty();
        };
    }
}
