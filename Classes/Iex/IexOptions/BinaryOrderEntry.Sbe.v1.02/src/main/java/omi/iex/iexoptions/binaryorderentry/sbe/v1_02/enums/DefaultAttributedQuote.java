package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.enums;

import java.util.Optional;

/**
 * defaultAttributedQuote
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum DefaultAttributedQuote {

    /**
     * Sum
     */
    SUM((byte) 1, "Sum"),

    /**
     * OrderInfo_Capacity
     */
    ORDER_INFO_CAPACITY((byte) 2, "OrderInfo_Capacity"),

    /**
     * OrderInfo_Mpid
     */
    ORDER_INFO_MPID((byte) 3, "OrderInfo_Mpid"),

    /**
     * OrderInfo_Capacity_Mpid
     */
    ORDER_INFO_CAPACITY_MPID((byte) 4, "OrderInfo_Capacity_Mpid"),

    /**
     * DoNotUseSum
     */
    DO_NOT_USE_SUM((byte) 5, "DoNotUseSum"),

    /**
     * defaultAttributedQuote
     */
    NO_VALUE((byte) -128, "defaultAttributedQuote");

    private final byte wire;

    private final String description;

    DefaultAttributedQuote(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<DefaultAttributedQuote> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(SUM);
            case 2 -> Optional.of(ORDER_INFO_CAPACITY);
            case 3 -> Optional.of(ORDER_INFO_MPID);
            case 4 -> Optional.of(ORDER_INFO_CAPACITY_MPID);
            case 5 -> Optional.of(DO_NOT_USE_SUM);
            case -128 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
