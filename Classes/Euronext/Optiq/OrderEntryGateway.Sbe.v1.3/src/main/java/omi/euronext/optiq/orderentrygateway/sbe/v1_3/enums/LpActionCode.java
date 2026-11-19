package omi.euronext.optiq.orderentrygateway.sbe.v1_3.enums;

import java.util.Optional;

/**
 * lPActionCode
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LpActionCode {

    /**
     * Knock_In_By_Issuer_KIBI
     */
    KNOCK_IN_BY_ISSUER_KIBI((short) 1, "Knock_In_By_Issuer_KIBI"),

    /**
     * Knock_Out_By_Issuer_KOBI
     */
    KNOCK_OUT_BY_ISSUER_KOBI((short) 2, "Knock_Out_By_Issuer_KOBI"),

    /**
     * Payment_After_Knock_Out_PAKO
     */
    PAYMENT_AFTER_KNOCK_OUT_PAKO((short) 3, "Payment_After_Knock_Out_PAKO"),

    /**
     * Bid_Only
     */
    BID_ONLY((short) 4, "Bid_Only"),

    /**
     * Offer_Only
     */
    OFFER_ONLY((short) 5, "Offer_Only");

    private final short wire;

    private final String description;

    LpActionCode(short wire, String description) {
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
    public static Optional<LpActionCode> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(KNOCK_IN_BY_ISSUER_KIBI);
            case 2 -> Optional.of(KNOCK_OUT_BY_ISSUER_KOBI);
            case 3 -> Optional.of(PAYMENT_AFTER_KNOCK_OUT_PAKO);
            case 4 -> Optional.of(BID_ONLY);
            case 5 -> Optional.of(OFFER_ONLY);
            default -> Optional.empty();
        };
    }
}
