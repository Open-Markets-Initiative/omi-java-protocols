package omi.euronext.optiq.dropcopygateway.sbe.v5_36.enums;

import java.util.Optional;

/**
 * ackType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AckType {

    /**
     * New_Order_Ack
     */
    NEW_ORDER_ACK((short) 0, "New_Order_Ack"),

    /**
     * Replace_Ack
     */
    REPLACE_ACK((short) 1, "Replace_Ack"),

    /**
     * Order_Creation_By_Market_Operations
     */
    ORDER_CREATION_BY_MARKET_OPERATIONS((short) 2, "Order_Creation_By_Market_Operations"),

    /**
     * Stop_Triggered_Ack
     */
    STOP_TRIGGERED_ACK((short) 3, "Stop_Triggered_Ack"),

    /**
     * Collar_Confirmation_Ack
     */
    COLLAR_CONFIRMATION_ACK((short) 4, "Collar_Confirmation_Ack"),

    /**
     * Refilled_Iceberg_Ack
     */
    REFILLED_ICEBERG_ACK((short) 5, "Refilled_Iceberg_Ack"),

    /**
     * MTL_Second_Ack
     */
    MTL_SECOND_ACK((short) 6, "MTL_Second_Ack"),

    /**
     * KnockIn_By_Issuer_KIBI_Ack
     */
    KNOCK_IN_BY_ISSUER_KIBI_ACK((short) 7, "KnockIn_By_Issuer_KIBI_Ack"),

    /**
     * KnockOut_By_Issuer_KOBI_Ack
     */
    KNOCK_OUT_BY_ISSUER_KOBI_ACK((short) 8, "KnockOut_By_Issuer_KOBI_Ack"),

    /**
     * Payment_After_KnockOut_PAKO_Ack
     */
    PAYMENT_AFTER_KNOCK_OUT_PAKO_ACK((short) 9, "Payment_After_KnockOut_PAKO_Ack"),

    /**
     * Price_Input_Ack
     */
    PRICE_INPUT_ACK((short) 10, "Price_Input_Ack"),

    /**
     * RFQ_Ack
     */
    RFQ_ACK((short) 11, "RFQ_Ack"),

    /**
     * Bid_Only_Ack
     */
    BID_ONLY_ACK((short) 12, "Bid_Only_Ack"),

    /**
     * Offer_Only_Ack
     */
    OFFER_ONLY_ACK((short) 13, "Offer_Only_Ack"),

    /**
     * Iceberg_Transformed_to_Limit
     */
    ICEBERG_TRANSFORMEDTO_LIMIT((short) 14, "Iceberg_Transformed_to_Limit"),

    /**
     * Ownership_Request_Ack
     */
    OWNERSHIP_REQUEST_ACK((short) 15, "Ownership_Request_Ack"),

    /**
     * VFU_VFC_Triggered_Ack
     */
    VFUVFC_TRIGGERED_ACK((short) 16, "VFU_VFC_Triggered_Ack"),

    /**
     * Open_Order_Request_Ack
     */
    OPEN_ORDER_REQUEST_ACK((short) 17, "Open_Order_Request_Ack"),

    /**
     * Reload_Ack
     */
    RELOAD_ACK((short) 18, "Reload_Ack"),

    /**
     * RFIE_Ack
     */
    RFIE_ACK((short) 21, "RFIE_Ack"),

    /**
     * Cross_Order_Ack
     */
    CROSS_ORDER_ACK((short) 22, "Cross_Order_Ack"),

    /**
     * Move_Dark_to_COB_as_Limit
     */
    MOVE_DARKTO_CO_BAS_LIMIT((short) 23, "Move_Dark_to_COB_as_Limit"),

    /**
     * Move_Dark_to_COB_as_Market
     */
    MOVE_DARKTO_CO_BAS_MARKET((short) 24, "Move_Dark_to_COB_as_Market"),

    /**
     * ackType
     */
    NO_VALUE((short) 255, "ackType");

    private final short wire;

    private final String description;

    AckType(short wire, String description) {
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
    public static Optional<AckType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NEW_ORDER_ACK);
            case 1 -> Optional.of(REPLACE_ACK);
            case 2 -> Optional.of(ORDER_CREATION_BY_MARKET_OPERATIONS);
            case 3 -> Optional.of(STOP_TRIGGERED_ACK);
            case 4 -> Optional.of(COLLAR_CONFIRMATION_ACK);
            case 5 -> Optional.of(REFILLED_ICEBERG_ACK);
            case 6 -> Optional.of(MTL_SECOND_ACK);
            case 7 -> Optional.of(KNOCK_IN_BY_ISSUER_KIBI_ACK);
            case 8 -> Optional.of(KNOCK_OUT_BY_ISSUER_KOBI_ACK);
            case 9 -> Optional.of(PAYMENT_AFTER_KNOCK_OUT_PAKO_ACK);
            case 10 -> Optional.of(PRICE_INPUT_ACK);
            case 11 -> Optional.of(RFQ_ACK);
            case 12 -> Optional.of(BID_ONLY_ACK);
            case 13 -> Optional.of(OFFER_ONLY_ACK);
            case 14 -> Optional.of(ICEBERG_TRANSFORMEDTO_LIMIT);
            case 15 -> Optional.of(OWNERSHIP_REQUEST_ACK);
            case 16 -> Optional.of(VFUVFC_TRIGGERED_ACK);
            case 17 -> Optional.of(OPEN_ORDER_REQUEST_ACK);
            case 18 -> Optional.of(RELOAD_ACK);
            case 21 -> Optional.of(RFIE_ACK);
            case 22 -> Optional.of(CROSS_ORDER_ACK);
            case 23 -> Optional.of(MOVE_DARKTO_CO_BAS_LIMIT);
            case 24 -> Optional.of(MOVE_DARKTO_CO_BAS_MARKET);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
