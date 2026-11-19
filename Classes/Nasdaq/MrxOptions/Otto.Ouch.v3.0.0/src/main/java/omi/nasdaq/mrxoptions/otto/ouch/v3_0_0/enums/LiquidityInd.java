package omi.nasdaq.mrxoptions.otto.ouch.v3_0_0.enums;

import java.util.Optional;

/**
 * See Liquidity (Maker/Taker) Field Codes
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum LiquidityInd {

    /**
     * None
     */
    NONE((short) 0, "None"),

    /**
     * Maker
     */
    MAKER((short) 1, "Maker"),

    /**
     * Taker
     */
    TAKER((short) 2, "Taker"),

    /**
     * Response
     */
    RESPONSE((short) 4, "Response"),

    /**
     * Hidden
     */
    HIDDEN((short) 5, "Hidden"),

    /**
     * Opening Rotation
     */
    OPENING_ROTATION((short) 6, "Opening Rotation"),

    /**
     * Cross
     */
    CROSS((short) 7, "Cross"),

    /**
     * Flashed Order
     */
    FLASHED_ORDER((short) 8, "Flashed Order"),

    /**
     * Flash Response
     */
    FLASH_RESPONSE((short) 9, "Flash Response"),

    /**
     * Routed Out
     */
    ROUTED_OUT((short) 10, "Routed Out"),

    /**
     * Trade Report
     */
    TRADE_REPORT((short) 11, "Trade Report"),

    /**
     * Combo Maker Against Combo
     */
    COMBO_MAKER_AGAINST_COMBO((short) 12, "Combo Maker Against Combo"),

    /**
     * Combo Taker Against Combo
     */
    COMBO_TAKER_AGAINST_COMBO((short) 13, "Combo Taker Against Combo"),

    /**
     * Combo Response Against Combo
     */
    COMBO_RESPONSE_AGAINST_COMBO((short) 14, "Combo Response Against Combo"),

    /**
     * Combo Hidden Against Combo
     */
    COMBO_HIDDEN_AGAINST_COMBO((short) 15, "Combo Hidden Against Combo"),

    /**
     * Combo Opening Rotation
     */
    COMBO_OPENING_ROTATION((short) 16, "Combo Opening Rotation"),

    /**
     * Combo Cross
     */
    COMBO_CROSS((short) 17, "Combo Cross"),

    /**
     * Combo Taker Against Regular
     */
    COMBO_TAKER_AGAINST_REGULAR((short) 18, "Combo Taker Against Regular"),

    /**
     * Regular Maker Against Combo
     */
    REGULAR_MAKER_AGAINST_COMBO((short) 19, "Regular Maker Against Combo"),

    /**
     * Combo Taker Against IO
     */
    COMBO_TAKER_AGAINST_IO((short) 20, "Combo Taker Against IO"),

    /**
     * Regular (incl. PIM) Taker Against IO
     */
    REGULAR_INCL_PIM_TAKER_AGAINST_IO((short) 21, "Regular (incl. PIM) Taker Against IO"),

    /**
     * IO Maker Against Combo
     */
    IO_MAKER_AGAINST_COMBO((short) 22, "IO Maker Against Combo"),

    /**
     * IO Maker Against Regular
     */
    IO_MAKER_AGAINST_REGULAR((short) 23, "IO Maker Against Regular"),

    /**
     * Regular Maker Against IO Participant
     */
    REGULAR_MAKER_AGAINST_IO_PARTICIPANT((short) 24, "Regular Maker Against IO Participant"),

    /**
     * IO Participant Taker Against Regular
     */
    IO_PARTICIPANT_TAKER_AGAINST_REGULAR((short) 25, "IO Participant Taker Against Regular"),

    /**
     * Broken Price Improvement
     */
    BROKEN_PRICE_IMPROVEMENT((short) 26, "Broken Price Improvement"),

    /**
     * Broken Facilitation
     */
    BROKEN_FACILITATION((short) 27, "Broken Facilitation"),

    /**
     * Broken Solicitation
     */
    BROKEN_SOLICITATION((short) 28, "Broken Solicitation"),

    /**
     * Combo Broken Price Improvement
     */
    COMBO_BROKEN_PRICE_IMPROVEMENT((short) 29, "Combo Broken Price Improvement"),

    /**
     * Combo Broken Facilitation
     */
    COMBO_BROKEN_FACILITATION((short) 30, "Combo Broken Facilitation"),

    /**
     * Combo Broken Solicitation
     */
    COMBO_BROKEN_SOLICITATION((short) 31, "Combo Broken Solicitation"),

    /**
     * Block
     */
    BLOCK((short) 32, "Block"),

    /**
     * Block Response
     */
    BLOCK_RESPONSE((short) 33, "Block Response"),

    /**
     * Directed Response
     */
    DIRECTED_RESPONSE((short) 34, "Directed Response"),

    /**
     * Facilitation
     */
    FACILITATION((short) 35, "Facilitation"),

    /**
     * Facilitation Response
     */
    FACILITATION_RESPONSE((short) 36, "Facilitation Response"),

    /**
     * Price Improvement
     */
    PRICE_IMPROVEMENT((short) 37, "Price Improvement"),

    /**
     * Price improvement Response
     */
    PRICE_IMPROVEMENT_RESPONSE((short) 38, "Price improvement Response"),

    /**
     * Solicitation
     */
    SOLICITATION((short) 39, "Solicitation"),

    /**
     * Solicitation Response
     */
    SOLICITATION_RESPONSE((short) 40, "Solicitation Response"),

    /**
     * Qualified Contingent Cross
     */
    QUALIFIED_CONTINGENT_CROSS((short) 41, "Qualified Contingent Cross"),

    /**
     * Customer to Customer
     */
    CUSTOMER_TO_CUSTOMER((short) 42, "Customer to Customer"),

    /**
     * Combo Facilitation
     */
    COMBO_FACILITATION((short) 43, "Combo Facilitation"),

    /**
     * Combo Facilitation Response
     */
    COMBO_FACILITATION_RESPONSE((short) 44, "Combo Facilitation Response"),

    /**
     * Combo Price Improvement
     */
    COMBO_PRICE_IMPROVEMENT((short) 45, "Combo Price Improvement"),

    /**
     * Combo Price Improvement Response
     */
    COMBO_PRICE_IMPROVEMENT_RESPONSE((short) 46, "Combo Price Improvement Response"),

    /**
     * Combo Solicitation
     */
    COMBO_SOLICITATION((short) 47, "Combo Solicitation"),

    /**
     * Combo Solicitation Response
     */
    COMBO_SOLICITATION_RESPONSE((short) 48, "Combo Solicitation Response"),

    /**
     * Combo Qualified Contingent Cross
     */
    COMBO_QUALIFIED_CONTINGENT_CROSS((short) 49, "Combo Qualified Contingent Cross"),

    /**
     * Combo Customer to Customer
     */
    COMBO_CUSTOMER_TO_CUSTOMER((short) 50, "Combo Customer to Customer"),

    /**
     * Sweep Routed Out
     */
    SWEEP_ROUTED_OUT((short) 51, "Sweep Routed Out"),

    /**
     * Sweep Trade Report
     */
    SWEEP_TRADE_REPORT((short) 52, "Sweep Trade Report"),

    /**
     * Combo Taker Against Regular - Thru NBBO
     */
    COMBO_TAKER_AGAINST_REGULAR_THRU_NBBO((short) 53, "Combo Taker Against Regular - Thru NBBO"),

    /**
     * Combo Taker Against IO - Thru NBBO
     */
    COMBO_TAKER_AGAINST_IO_THRU_NBBO((short) 54, "Combo Taker Against IO - Thru NBBO"),

    /**
     * Simple Exposure Order Initiator Upon Receipt
     */
    SIMPLE_EXPOSURE_ORDER_INITIATOR_UPON_RECEIPT((short) 55, "Simple Exposure Order Initiator Upon Receipt"),

    /**
     * Simple Exposure Order Initiator
     */
    SIMPLE_EXPOSURE_ORDER_INITIATOR((short) 56, "Simple Exposure Order Initiator"),

    /**
     * Simple Exposure Order Responder
     */
    SIMPLE_EXPOSURE_ORDER_RESPONDER((short) 57, "Simple Exposure Order Responder"),

    /**
     * Flex Auction
     */
    FLEX_AUCTION((short) 58, "Flex Auction"),

    /**
     * Flex Auction Responder
     */
    FLEX_AUCTION_RESPONDER((short) 59, "Flex Auction Responder"),

    /**
     * Flex Price Improvement
     */
    FLEX_PRICE_IMPROVEMENT((short) 60, "Flex Price Improvement"),

    /**
     * Flex Price Improvement Responder
     */
    FLEX_PRICE_IMPROVEMENT_RESPONDER((short) 61, "Flex Price Improvement Responder"),

    /**
     * Flex Broken Price Improvement
     */
    FLEX_BROKEN_PRICE_IMPROVEMENT((short) 62, "Flex Broken Price Improvement"),

    /**
     * Flex Solicitation
     */
    FLEX_SOLICITATION((short) 63, "Flex Solicitation"),

    /**
     * Flex Solicitation Responder
     */
    FLEX_SOLICITATION_RESPONDER((short) 64, "Flex Solicitation Responder"),

    /**
     * Flex Broken Solicitation
     */
    FLEX_BROKEN_SOLICITATION((short) 65, "Flex Broken Solicitation"),

    /**
     * Combo Flex Auction
     */
    COMBO_FLEX_AUCTION((short) 66, "Combo Flex Auction"),

    /**
     * Combo Flex Auction Responder
     */
    COMBO_FLEX_AUCTION_RESPONDER((short) 67, "Combo Flex Auction Responder"),

    /**
     * Combo Flex Price Improvement
     */
    COMBO_FLEX_PRICE_IMPROVEMENT((short) 68, "Combo Flex Price Improvement"),

    /**
     * Combo Flex Price Improvement Responder
     */
    COMBO_FLEX_PRICE_IMPROVEMENT_RESPONDER((short) 69, "Combo Flex Price Improvement Responder"),

    /**
     * Combo Flex Broken Price Improvement
     */
    COMBO_FLEX_BROKEN_PRICE_IMPROVEMENT((short) 70, "Combo Flex Broken Price Improvement"),

    /**
     * Combo Flex Solicitation
     */
    COMBO_FLEX_SOLICITATION((short) 71, "Combo Flex Solicitation"),

    /**
     * Combo Flex Solicitation Responder
     */
    COMBO_FLEX_SOLICITATION_RESPONDER((short) 72, "Combo Flex Solicitation Responder"),

    /**
     * Combo Flex Broken Solicitation
     */
    COMBO_FLEX_BROKEN_SOLICITATION((short) 73, "Combo Flex Broken Solicitation");

    private final short wire;

    private final String description;

    LiquidityInd(short wire, String description) {
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
    public static Optional<LiquidityInd> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NONE);
            case 1 -> Optional.of(MAKER);
            case 2 -> Optional.of(TAKER);
            case 4 -> Optional.of(RESPONSE);
            case 5 -> Optional.of(HIDDEN);
            case 6 -> Optional.of(OPENING_ROTATION);
            case 7 -> Optional.of(CROSS);
            case 8 -> Optional.of(FLASHED_ORDER);
            case 9 -> Optional.of(FLASH_RESPONSE);
            case 10 -> Optional.of(ROUTED_OUT);
            case 11 -> Optional.of(TRADE_REPORT);
            case 12 -> Optional.of(COMBO_MAKER_AGAINST_COMBO);
            case 13 -> Optional.of(COMBO_TAKER_AGAINST_COMBO);
            case 14 -> Optional.of(COMBO_RESPONSE_AGAINST_COMBO);
            case 15 -> Optional.of(COMBO_HIDDEN_AGAINST_COMBO);
            case 16 -> Optional.of(COMBO_OPENING_ROTATION);
            case 17 -> Optional.of(COMBO_CROSS);
            case 18 -> Optional.of(COMBO_TAKER_AGAINST_REGULAR);
            case 19 -> Optional.of(REGULAR_MAKER_AGAINST_COMBO);
            case 20 -> Optional.of(COMBO_TAKER_AGAINST_IO);
            case 21 -> Optional.of(REGULAR_INCL_PIM_TAKER_AGAINST_IO);
            case 22 -> Optional.of(IO_MAKER_AGAINST_COMBO);
            case 23 -> Optional.of(IO_MAKER_AGAINST_REGULAR);
            case 24 -> Optional.of(REGULAR_MAKER_AGAINST_IO_PARTICIPANT);
            case 25 -> Optional.of(IO_PARTICIPANT_TAKER_AGAINST_REGULAR);
            case 26 -> Optional.of(BROKEN_PRICE_IMPROVEMENT);
            case 27 -> Optional.of(BROKEN_FACILITATION);
            case 28 -> Optional.of(BROKEN_SOLICITATION);
            case 29 -> Optional.of(COMBO_BROKEN_PRICE_IMPROVEMENT);
            case 30 -> Optional.of(COMBO_BROKEN_FACILITATION);
            case 31 -> Optional.of(COMBO_BROKEN_SOLICITATION);
            case 32 -> Optional.of(BLOCK);
            case 33 -> Optional.of(BLOCK_RESPONSE);
            case 34 -> Optional.of(DIRECTED_RESPONSE);
            case 35 -> Optional.of(FACILITATION);
            case 36 -> Optional.of(FACILITATION_RESPONSE);
            case 37 -> Optional.of(PRICE_IMPROVEMENT);
            case 38 -> Optional.of(PRICE_IMPROVEMENT_RESPONSE);
            case 39 -> Optional.of(SOLICITATION);
            case 40 -> Optional.of(SOLICITATION_RESPONSE);
            case 41 -> Optional.of(QUALIFIED_CONTINGENT_CROSS);
            case 42 -> Optional.of(CUSTOMER_TO_CUSTOMER);
            case 43 -> Optional.of(COMBO_FACILITATION);
            case 44 -> Optional.of(COMBO_FACILITATION_RESPONSE);
            case 45 -> Optional.of(COMBO_PRICE_IMPROVEMENT);
            case 46 -> Optional.of(COMBO_PRICE_IMPROVEMENT_RESPONSE);
            case 47 -> Optional.of(COMBO_SOLICITATION);
            case 48 -> Optional.of(COMBO_SOLICITATION_RESPONSE);
            case 49 -> Optional.of(COMBO_QUALIFIED_CONTINGENT_CROSS);
            case 50 -> Optional.of(COMBO_CUSTOMER_TO_CUSTOMER);
            case 51 -> Optional.of(SWEEP_ROUTED_OUT);
            case 52 -> Optional.of(SWEEP_TRADE_REPORT);
            case 53 -> Optional.of(COMBO_TAKER_AGAINST_REGULAR_THRU_NBBO);
            case 54 -> Optional.of(COMBO_TAKER_AGAINST_IO_THRU_NBBO);
            case 55 -> Optional.of(SIMPLE_EXPOSURE_ORDER_INITIATOR_UPON_RECEIPT);
            case 56 -> Optional.of(SIMPLE_EXPOSURE_ORDER_INITIATOR);
            case 57 -> Optional.of(SIMPLE_EXPOSURE_ORDER_RESPONDER);
            case 58 -> Optional.of(FLEX_AUCTION);
            case 59 -> Optional.of(FLEX_AUCTION_RESPONDER);
            case 60 -> Optional.of(FLEX_PRICE_IMPROVEMENT);
            case 61 -> Optional.of(FLEX_PRICE_IMPROVEMENT_RESPONDER);
            case 62 -> Optional.of(FLEX_BROKEN_PRICE_IMPROVEMENT);
            case 63 -> Optional.of(FLEX_SOLICITATION);
            case 64 -> Optional.of(FLEX_SOLICITATION_RESPONDER);
            case 65 -> Optional.of(FLEX_BROKEN_SOLICITATION);
            case 66 -> Optional.of(COMBO_FLEX_AUCTION);
            case 67 -> Optional.of(COMBO_FLEX_AUCTION_RESPONDER);
            case 68 -> Optional.of(COMBO_FLEX_PRICE_IMPROVEMENT);
            case 69 -> Optional.of(COMBO_FLEX_PRICE_IMPROVEMENT_RESPONDER);
            case 70 -> Optional.of(COMBO_FLEX_BROKEN_PRICE_IMPROVEMENT);
            case 71 -> Optional.of(COMBO_FLEX_SOLICITATION);
            case 72 -> Optional.of(COMBO_FLEX_SOLICITATION_RESPONDER);
            case 73 -> Optional.of(COMBO_FLEX_BROKEN_SOLICITATION);
            default -> Optional.empty();
        };
    }
}
