package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * Attribute value appropriate to the InstrAttribType (871) field.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum InstrAttribValue {

    /**
     * Electronic Match Eligible (871=24) or GTD/GTC Eligible (871=34).
     */
    ELECTRONIC_MATCH_OR_GTD_GTC_ELIGIBLE((short) 1, "Electronic Match Eligible (871=24) or GTD/GTC Eligible (871=34)."),

    /**
     * Order Cross Eligible (871=24).
     */
    ORDER_CROSS_ELIGIBLE((short) 2, "Order Cross Eligible (871=24)."),

    /**
     * Block Trade Eligible (871=24).
     */
    BLOCK_TRADE_ELIGIBLE((short) 3, "Block Trade Eligible (871=24)."),

    /**
     * Request for Quote (RFQ) for Cross Eligible (871=24).
     */
    FLAG_RFQ_FOR_CROSS_ELIGIBLE((short) 14, "Request for Quote (RFQ) for Cross Eligible (871=24)."),

    /**
     * Negotiated Quote Eligible (871=24).
     */
    NEGOTIATED_QUOTE_ELIGIBLE((short) 17, "Negotiated Quote Eligible (871=24).");

    private final short wire;

    private final String description;

    InstrAttribValue(short wire, String description) {
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
    public static Optional<InstrAttribValue> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ELECTRONIC_MATCH_OR_GTD_GTC_ELIGIBLE);
            case 2 -> Optional.of(ORDER_CROSS_ELIGIBLE);
            case 3 -> Optional.of(BLOCK_TRADE_ELIGIBLE);
            case 14 -> Optional.of(FLAG_RFQ_FOR_CROSS_ELIGIBLE);
            case 17 -> Optional.of(NEGOTIATED_QUOTE_ELIGIBLE);
            default -> Optional.empty();
        };
    }
}
