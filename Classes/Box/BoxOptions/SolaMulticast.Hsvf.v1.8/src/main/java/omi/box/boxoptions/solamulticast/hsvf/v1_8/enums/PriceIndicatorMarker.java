package omi.box.boxoptions.solamulticast.hsvf.v1_8.enums;

import java.util.Optional;

/**
 * Identifies the type of transaction
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum PriceIndicatorMarker {

    /**
     * As Of Trade
     */
    AS_OF_TRADE('A', "As Of Trade"),

    /**
     * Trades Performed At The End Of A Pip Allocation Phase
     */
    TRADES_PERFORMED_AT_THE_END_OF_A_PIP_ALLOCATION_PHASE('C', "Trades Performed At The End Of A Pip Allocation Phase"),

    /**
     * Late Trade
     */
    LATE_TRADE('L', "Late Trade"),

    /**
     * Trades Performed During The Opening
     */
    TRADES_PERFORMED_DURING_THE_OPENING('O', "Trades Performed During The Opening"),

    /**
     * Reference Price
     */
    REFERENCE_PRICE('S', "Reference Price"),

    /**
     * Trades Resulting From The Transmission Of An Iso Inbound Order
     */
    TRADES_RESULTING_FROM_THE_TRANSMISSION_OF_AN_ISO_INBOUND_ORDER('W', "Trades Resulting From The Transmission Of An Iso Inbound Order"),

    /**
     * Trades Performed When The Market Is Crossed
     */
    TRADES_PERFORMED_WHEN_THE_MARKET_IS_CROSSED('X', "Trades Performed When The Market Is Crossed"),

    /**
     * Contingent Trade Price Of The Trade Was Not Controlled Against The Nbbo
     */
    CONTINGENT_TRADE_PRICE_OF_THE_TRADE_WAS_NOT_CONTROLLED_AGAINST_THE_NBBO('G', "Contingent Trade Price Of The Trade Was Not Controlled Against The Nbbo"),

    /**
     * Trade Involving An Implied Order Or Leg Trade Of A Complex Order Instrument
     */
    TRADE_INVOLVING_AN_IMPLIED_ORDER_OR_LEG_TRADE_OF_A_COMPLEX_ORDER_INSTRUMENT('I', "Trade Involving An Implied Order Or Leg Trade Of A Complex Order Instrument"),

    /**
     * Trade Done On A Complex Order Instrument
     */
    TRADE_DONE_ON_A_COMPLEX_ORDER_INSTRUMENT('P', "Trade Done On A Complex Order Instrument"),

    /**
     * Actual Transaction Took Place
     */
    ACTUAL_TRANSACTION_TOOK_PLACE(' ', "Actual Transaction Took Place");

    private final char wire;

    private final String description;

    PriceIndicatorMarker(char wire, String description) {
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
    public static Optional<PriceIndicatorMarker> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(AS_OF_TRADE);
            case 'C' -> Optional.of(TRADES_PERFORMED_AT_THE_END_OF_A_PIP_ALLOCATION_PHASE);
            case 'L' -> Optional.of(LATE_TRADE);
            case 'O' -> Optional.of(TRADES_PERFORMED_DURING_THE_OPENING);
            case 'S' -> Optional.of(REFERENCE_PRICE);
            case 'W' -> Optional.of(TRADES_RESULTING_FROM_THE_TRANSMISSION_OF_AN_ISO_INBOUND_ORDER);
            case 'X' -> Optional.of(TRADES_PERFORMED_WHEN_THE_MARKET_IS_CROSSED);
            case 'G' -> Optional.of(CONTINGENT_TRADE_PRICE_OF_THE_TRADE_WAS_NOT_CONTROLLED_AGAINST_THE_NBBO);
            case 'I' -> Optional.of(TRADE_INVOLVING_AN_IMPLIED_ORDER_OR_LEG_TRADE_OF_A_COMPLEX_ORDER_INSTRUMENT);
            case 'P' -> Optional.of(TRADE_DONE_ON_A_COMPLEX_ORDER_INSTRUMENT);
            case ' ' -> Optional.of(ACTUAL_TRANSACTION_TOOK_PLACE);
            default -> Optional.empty();
        };
    }
}
