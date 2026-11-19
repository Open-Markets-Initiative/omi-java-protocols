package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Indicates price update message variant
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PriceUpdateType {

    /**
     * Reference price placed in the value field
     */
    REFERENCE_PRICE((short) 1, "Reference price placed in the value field"),

    /**
     * TBSP.Price price placed in the value field
     */
    REFERENCE_INDEX_PRICE((short) 2, "TBSP.Price price placed in the value field"),

    /**
     * TBSP.FixPrice price placed in the value field
     */
    REFERENCE_FIXING_INDEX_PRICE((short) 3, "TBSP.FixPrice price placed in the value field"),

    /**
     * MidPrice price placed in the value field
     */
    MID_PRICE((short) 4, "MidPrice price placed in the value field"),

    /**
     * The fixing prices placed appropriately in the value field as the average price, valueBid as the bid price, and valueAsk as the ask price
     */
    FIXING_PRICE((short) 5, "The fixing prices placed appropriately in the value field as the average price, valueBid as the bid price, and valueAsk as the ask price"),

    /**
     * The fixing YTM (i.e
     */
    FIXING_YTM((short) 6, "The fixing YTM (i.e");

    private final short wire;

    private final String description;

    PriceUpdateType(short wire, String description) {
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
    public static Optional<PriceUpdateType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(REFERENCE_PRICE);
            case 2 -> Optional.of(REFERENCE_INDEX_PRICE);
            case 3 -> Optional.of(REFERENCE_FIXING_INDEX_PRICE);
            case 4 -> Optional.of(MID_PRICE);
            case 5 -> Optional.of(FIXING_PRICE);
            case 6 -> Optional.of(FIXING_YTM);
            default -> Optional.empty();
        };
    }
}
