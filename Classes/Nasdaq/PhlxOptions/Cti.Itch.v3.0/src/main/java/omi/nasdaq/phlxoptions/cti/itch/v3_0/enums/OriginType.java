package omi.nasdaq.phlxoptions.cti.itch.v3_0.enums;

import java.util.Optional;

/**
 * Origin of this side of the trade
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum OriginType {

    /**
     * FIX Order
     */
    FIX_ORDER('O', "FIX Order"),

    /**
     * FIX Complex Order
     */
    FIX_COMPLEX_ORDER('C', "FIX Complex Order"),

    /**
     * OTTO Order
     */
    OTTO_ORDER('T', "OTTO Order"),

    /**
     * OTTO Complex Order
     */
    OTTO_COMPLEX_ORDER('Z', "OTTO Complex Order"),

    /**
     * SQF Quote
     */
    SQF_QUOTE('Q', "SQF Quote"),

    /**
     * SQF Sweep
     */
    SQF_SWEEP('W', "SQF Sweep"),

    /**
     * SQF Complex Sweep
     */
    SQF_COMPLEX_SWEEP('S', "SQF Complex Sweep"),

    /**
     * Block Order
     */
    BLOCK_ORDER('P', "Block Order"),

    /**
     * Block Response
     */
    BLOCK_RESPONSE('X', "Block Response"),

    /**
     * PIXL/PRISM/PIM Primary Order
     */
    PIM_PRIMARY_ORDER('G', "PIXL/PRISM/PIM Primary Order"),

    /**
     * PIXL/PRISM/PIM Contra Order
     */
    PIM_CONTRA_ORDER('H', "PIXL/PRISM/PIM Contra Order"),

    /**
     * PIXL/PRISM/PIM Response Order
     */
    PIM_RESPONSE_ORDER('I', "PIXL/PRISM/PIM Response Order"),

    /**
     * PIXL/PRISM/PIM Response SQF Sweep
     */
    PIM_RESPONSE_SQF_SWEEP('J', "PIXL/PRISM/PIM Response SQF Sweep"),

    /**
     * PIXL/PIM Primary Complex Order
     */
    PIM_PRIMARY_COMPLEX_ORDER('g', "PIXL/PIM Primary Complex Order"),

    /**
     * PIXL/PIM Contra Complex Order
     */
    PIM_CONTRA_COMPLEX_ORDER('h', "PIXL/PIM Contra Complex Order"),

    /**
     * PIXL/PIM Response Complex Order
     */
    PIM_RESPONSE_COMPLEX_ORDER('i', "PIXL/PIM Response Complex Order"),

    /**
     * PIXL/PIM Response SQF Complex Sweep
     */
    PIM_RESPONSE_SQF_COMPLEX_SWEEP('j', "PIXL/PIM Response SQF Complex Sweep"),

    /**
     * FBMS Floor Trade
     */
    FBMS_FLOOR_TRADE('B', "FBMS Floor Trade"),

    /**
     * QCC Primary
     */
    QCC_PRIMARY('K', "QCC Primary"),

    /**
     * QCC Contra
     */
    QCC_CONTRA('L', "QCC Contra"),

    /**
     * Solicitation Primary Order
     */
    SOLICITATION_PRIMARY_ORDER('M', "Solicitation Primary Order"),

    /**
     * Solicitation Contra Order
     */
    SOLICITATION_CONTRA_ORDER('N', "Solicitation Contra Order"),

    /**
     * Solicitation Response Order
     */
    SOLICITATION_RESPONSE_ORDER('U', "Solicitation Response Order"),

    /**
     * Solicitation Response SQF Sweep
     */
    SOLICITATION_RESPONSE_SQF_SWEEP('V', "Solicitation Response SQF Sweep"),

    /**
     * Solicitation Primary Complex Order
     */
    SOLICITATION_PRIMARY_COMPLEX_ORDER('m', "Solicitation Primary Complex Order"),

    /**
     * Solicitation Contra Complex Order
     */
    SOLICITATION_CONTRA_COMPLEX_ORDER('n', "Solicitation Contra Complex Order"),

    /**
     * Solicitation Response Complex Order
     */
    SOLICITATION_RESPONSE_COMPLEX_ORDER('u', "Solicitation Response Complex Order"),

    /**
     * Solicitation Response SQF Complex Sweep
     */
    SOLICITATION_RESPONSE_SQF_COMPLEX_SWEEP('v', "Solicitation Response SQF Complex Sweep"),

    /**
     * Facilitation Primary Order
     */
    FACILITATION_PRIMARY_ORDER('F', "Facilitation Primary Order"),

    /**
     * Facilitation Contra Order
     */
    FACILITATION_CONTRA_ORDER('A', "Facilitation Contra Order"),

    /**
     * Facilitation Response Order
     */
    FACILITATION_RESPONSE_ORDER('D', "Facilitation Response Order"),

    /**
     * Facilitation Response SQF Sweep
     */
    FACILITATION_RESPONSE_SQF_SWEEP('Y', "Facilitation Response SQF Sweep"),

    /**
     * Facilitation Primary Complex Order
     */
    FACILITATION_PRIMARY_COMPLEX_ORDER('f', "Facilitation Primary Complex Order"),

    /**
     * Facilitation Contra Complex Order
     */
    FACILITATION_CONTRA_COMPLEX_ORDER('a', "Facilitation Contra Complex Order"),

    /**
     * Facilitation Response Complex Order
     */
    FACILITATION_RESPONSE_COMPLEX_ORDER('d', "Facilitation Response Complex Order"),

    /**
     * Facilitation Response SQF Complex Sweep
     */
    FACILITATION_RESPONSE_SQF_COMPLEX_SWEEP('y', "Facilitation Response SQF Complex Sweep"),

    /**
     * Others
     */
    OTHERS(' ', "Others"),

    /**
     * Simple Flex Initiator
     */
    SIMPLE_FLEX_INITIATOR('0', "Simple Flex Initiator"),

    /**
     * Simple Flex Response Order
     */
    SIMPLE_FLEX_RESPONSE_ORDER('1', "Simple Flex Response Order"),

    /**
     * Simple Flex Response SQF Sweep
     */
    SIMPLE_FLEX_RESPONSE_SQF_SWEEP('2', "Simple Flex Response SQF Sweep"),

    /**
     * Complex Flex Initiator
     */
    COMPLEX_FLEX_INITIATOR('3', "Complex Flex Initiator"),

    /**
     * Complex Flex Response Order
     */
    COMPLEX_FLEX_RESPONSE_ORDER('4', "Complex Flex Response Order"),

    /**
     * Complex Flex Response SQF Sweep
     */
    COMPLEX_FLEX_RESPONSE_SQF_SWEEP('5', "Complex Flex Response SQF Sweep");

    private final char wire;

    private final String description;

    OriginType(char wire, String description) {
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
    public static Optional<OriginType> fromWire(char wire) {
        return switch (wire) {
            case 'O' -> Optional.of(FIX_ORDER);
            case 'C' -> Optional.of(FIX_COMPLEX_ORDER);
            case 'T' -> Optional.of(OTTO_ORDER);
            case 'Z' -> Optional.of(OTTO_COMPLEX_ORDER);
            case 'Q' -> Optional.of(SQF_QUOTE);
            case 'W' -> Optional.of(SQF_SWEEP);
            case 'S' -> Optional.of(SQF_COMPLEX_SWEEP);
            case 'P' -> Optional.of(BLOCK_ORDER);
            case 'X' -> Optional.of(BLOCK_RESPONSE);
            case 'G' -> Optional.of(PIM_PRIMARY_ORDER);
            case 'H' -> Optional.of(PIM_CONTRA_ORDER);
            case 'I' -> Optional.of(PIM_RESPONSE_ORDER);
            case 'J' -> Optional.of(PIM_RESPONSE_SQF_SWEEP);
            case 'g' -> Optional.of(PIM_PRIMARY_COMPLEX_ORDER);
            case 'h' -> Optional.of(PIM_CONTRA_COMPLEX_ORDER);
            case 'i' -> Optional.of(PIM_RESPONSE_COMPLEX_ORDER);
            case 'j' -> Optional.of(PIM_RESPONSE_SQF_COMPLEX_SWEEP);
            case 'B' -> Optional.of(FBMS_FLOOR_TRADE);
            case 'K' -> Optional.of(QCC_PRIMARY);
            case 'L' -> Optional.of(QCC_CONTRA);
            case 'M' -> Optional.of(SOLICITATION_PRIMARY_ORDER);
            case 'N' -> Optional.of(SOLICITATION_CONTRA_ORDER);
            case 'U' -> Optional.of(SOLICITATION_RESPONSE_ORDER);
            case 'V' -> Optional.of(SOLICITATION_RESPONSE_SQF_SWEEP);
            case 'm' -> Optional.of(SOLICITATION_PRIMARY_COMPLEX_ORDER);
            case 'n' -> Optional.of(SOLICITATION_CONTRA_COMPLEX_ORDER);
            case 'u' -> Optional.of(SOLICITATION_RESPONSE_COMPLEX_ORDER);
            case 'v' -> Optional.of(SOLICITATION_RESPONSE_SQF_COMPLEX_SWEEP);
            case 'F' -> Optional.of(FACILITATION_PRIMARY_ORDER);
            case 'A' -> Optional.of(FACILITATION_CONTRA_ORDER);
            case 'D' -> Optional.of(FACILITATION_RESPONSE_ORDER);
            case 'Y' -> Optional.of(FACILITATION_RESPONSE_SQF_SWEEP);
            case 'f' -> Optional.of(FACILITATION_PRIMARY_COMPLEX_ORDER);
            case 'a' -> Optional.of(FACILITATION_CONTRA_COMPLEX_ORDER);
            case 'd' -> Optional.of(FACILITATION_RESPONSE_COMPLEX_ORDER);
            case 'y' -> Optional.of(FACILITATION_RESPONSE_SQF_COMPLEX_SWEEP);
            case ' ' -> Optional.of(OTHERS);
            case '0' -> Optional.of(SIMPLE_FLEX_INITIATOR);
            case '1' -> Optional.of(SIMPLE_FLEX_RESPONSE_ORDER);
            case '2' -> Optional.of(SIMPLE_FLEX_RESPONSE_SQF_SWEEP);
            case '3' -> Optional.of(COMPLEX_FLEX_INITIATOR);
            case '4' -> Optional.of(COMPLEX_FLEX_RESPONSE_ORDER);
            case '5' -> Optional.of(COMPLEX_FLEX_RESPONSE_SQF_SWEEP);
            default -> Optional.empty();
        };
    }
}
