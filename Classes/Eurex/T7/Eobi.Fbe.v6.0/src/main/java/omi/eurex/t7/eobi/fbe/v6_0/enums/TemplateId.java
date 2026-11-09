package omi.eurex.t7.eobi.fbe.v6_0.enums;

import java.util.Optional;

/**
 * SBE template identifier of the packet header (e.g., 13004 RefreshHeader / 13005 BeaconMessage)
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TemplateId {

    /**
     * No Value
     */
    NO_VALUE(65535, "No Value"),

    /**
     * Add Complex Instrument TemplateId
     */
    ADD_COMPLEX_INSTRUMENT(13400, "Add Complex Instrument TemplateId"),

    /**
     * Auction Bbo TemplateId
     */
    AUCTION_BBO(13500, "Auction Bbo TemplateId"),

    /**
     * Auction Clearing Price TemplateId
     */
    AUCTION_CLEARING_PRICE(13501, "Auction Clearing Price TemplateId"),

    /**
     * Cross Request TemplateId
     */
    CROSS_REQUEST(13502, "Cross Request TemplateId"),

    /**
     * Execution Summary TemplateId
     */
    EXECUTION_SUMMARY(13202, "Execution Summary TemplateId"),

    /**
     * Full Order Execution TemplateId
     */
    FULL_ORDER_EXECUTION(13104, "Full Order Execution TemplateId"),

    /**
     * Heartbeat TemplateId
     */
    HEARTBEAT(13001, "Heartbeat TemplateId"),

    /**
     * Instrument State Change TemplateId
     */
    INSTRUMENT_STATE_CHANGE(13301, "Instrument State Change TemplateId"),

    /**
     * Instrument Summary TemplateId
     */
    INSTRUMENT_SUMMARY(13601, "Instrument Summary TemplateId"),

    /**
     * Order Add TemplateId
     */
    ORDER_ADD(13100, "Order Add TemplateId"),

    /**
     * Order Delete TemplateId
     */
    ORDER_DELETE(13102, "Order Delete TemplateId"),

    /**
     * Order Mass Delete TemplateId
     */
    ORDER_MASS_DELETE(13103, "Order Mass Delete TemplateId"),

    /**
     * Order Modify TemplateId
     */
    ORDER_MODIFY(13101, "Order Modify TemplateId"),

    /**
     * Order Modify Same Prio TemplateId
     */
    ORDER_MODIFY_SAME_PRIO(13106, "Order Modify Same Prio TemplateId"),

    /**
     * Packet Header TemplateId
     */
    PACKET_HEADER(13002, "Packet Header TemplateId"),

    /**
     * Partial Order Execution TemplateId
     */
    PARTIAL_ORDER_EXECUTION(13105, "Partial Order Execution TemplateId"),

    /**
     * Product State Change TemplateId
     */
    PRODUCT_STATE_CHANGE(13300, "Product State Change TemplateId"),

    /**
     * Product Summary TemplateId
     */
    PRODUCT_SUMMARY(13600, "Product Summary TemplateId"),

    /**
     * Quote Request TemplateId
     */
    QUOTE_REQUEST(13503, "Quote Request TemplateId"),

    /**
     * Snapshot Order TemplateId
     */
    SNAPSHOT_ORDER(13602, "Snapshot Order TemplateId"),

    /**
     * Top Of Book TemplateId
     */
    TOP_OF_BOOK(13504, "Top Of Book TemplateId"),

    /**
     * Trade Report TemplateId
     */
    TRADE_REPORT(13201, "Trade Report TemplateId"),

    /**
     * Trade Reversal TemplateId
     */
    TRADE_REVERSAL(13200, "Trade Reversal TemplateId");

    private final int wire;

    private final String description;

    TemplateId(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<TemplateId> fromWire(int wire) {
        return switch (wire) {
            case 65535 -> Optional.of(NO_VALUE);
            case 13400 -> Optional.of(ADD_COMPLEX_INSTRUMENT);
            case 13500 -> Optional.of(AUCTION_BBO);
            case 13501 -> Optional.of(AUCTION_CLEARING_PRICE);
            case 13502 -> Optional.of(CROSS_REQUEST);
            case 13202 -> Optional.of(EXECUTION_SUMMARY);
            case 13104 -> Optional.of(FULL_ORDER_EXECUTION);
            case 13001 -> Optional.of(HEARTBEAT);
            case 13301 -> Optional.of(INSTRUMENT_STATE_CHANGE);
            case 13601 -> Optional.of(INSTRUMENT_SUMMARY);
            case 13100 -> Optional.of(ORDER_ADD);
            case 13102 -> Optional.of(ORDER_DELETE);
            case 13103 -> Optional.of(ORDER_MASS_DELETE);
            case 13101 -> Optional.of(ORDER_MODIFY);
            case 13106 -> Optional.of(ORDER_MODIFY_SAME_PRIO);
            case 13002 -> Optional.of(PACKET_HEADER);
            case 13105 -> Optional.of(PARTIAL_ORDER_EXECUTION);
            case 13300 -> Optional.of(PRODUCT_STATE_CHANGE);
            case 13600 -> Optional.of(PRODUCT_SUMMARY);
            case 13503 -> Optional.of(QUOTE_REQUEST);
            case 13602 -> Optional.of(SNAPSHOT_ORDER);
            case 13504 -> Optional.of(TOP_OF_BOOK);
            case 13201 -> Optional.of(TRADE_REPORT);
            case 13200 -> Optional.of(TRADE_REVERSAL);
            default -> Optional.empty();
        };
    }
}
