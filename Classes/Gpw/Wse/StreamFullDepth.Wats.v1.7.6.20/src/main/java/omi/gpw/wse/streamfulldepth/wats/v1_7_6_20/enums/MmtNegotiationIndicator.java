package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * MMT Negotiation Indicator
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MmtNegotiationIndicator {

    /**
     * N = Negotiated Trade
     */
    NEGOTIATED_TRADE((short) 1, "N = Negotiated Trade"),

    /**
     * 1 = Negotiated Trade in Liquid Financial Instruments
     */
    NEGOTIATED_TRADE_LIQUID_FINANCIAL_INSTRUMENTS((short) 2, "1 = Negotiated Trade in Liquid Financial Instruments"),

    /**
     * 2 = Negotiated Trade in Illiquid Financial Instruments
     */
    NEGOTIATED_TRADE_ILLIQUID_FINANCIAL_INSTRUMENTS((short) 3, "2 = Negotiated Trade in Illiquid Financial Instruments"),

    /**
     * 3 = Negotiated Trade subject to conditions other than the current market price
     */
    NEGOTIATED_TRADE_OTHER((short) 4, "3 = Negotiated Trade subject to conditions other than the current market price"),

    /**
     * - = No Negotiated Trade
     */
    NO_NEGOTIATED_TRADE((short) 5, "- = No Negotiated Trade"),

    /**
     * 4 = Pre-Trade Transparency Waiver for Illiquid Instrument on an SI (for RTS 1 only)
     */
    PRE_TRADE_TRANSPARENCY_WAIVER_ILLIQUID_INSTRUMENT((short) 6, "4 = Pre-Trade Transparency Waiver for Illiquid Instrument on an SI (for RTS 1 only)"),

    /**
     * 5 = Pre-Trade Transparency Waiver for above Standard Market Size on an SI (for RTS 1 only)
     */
    PRE_TRADE_TRANSPARENCY_WAIVER_STANDARD_MARKET_SIZE((short) 7, "5 = Pre-Trade Transparency Waiver for above Standard Market Size on an SI (for RTS 1 only)"),

    /**
     * 6 = Pre-Trade Transparency Waivers of ILQD and SIZE (for RTS 1 only)
     */
    PRE_TRADE_TRANSPARENCY_WAIVERS_ILQD_AND_SIZE((short) 8, "6 = Pre-Trade Transparency Waivers of ILQD and SIZE (for RTS 1 only)");

    private final short wire;

    private final String description;

    MmtNegotiationIndicator(short wire, String description) {
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
    public static Optional<MmtNegotiationIndicator> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NEGOTIATED_TRADE);
            case 2 -> Optional.of(NEGOTIATED_TRADE_LIQUID_FINANCIAL_INSTRUMENTS);
            case 3 -> Optional.of(NEGOTIATED_TRADE_ILLIQUID_FINANCIAL_INSTRUMENTS);
            case 4 -> Optional.of(NEGOTIATED_TRADE_OTHER);
            case 5 -> Optional.of(NO_NEGOTIATED_TRADE);
            case 6 -> Optional.of(PRE_TRADE_TRANSPARENCY_WAIVER_ILLIQUID_INSTRUMENT);
            case 7 -> Optional.of(PRE_TRADE_TRANSPARENCY_WAIVER_STANDARD_MARKET_SIZE);
            case 8 -> Optional.of(PRE_TRADE_TRANSPARENCY_WAIVERS_ILQD_AND_SIZE);
            default -> Optional.empty();
        };
    }
}
