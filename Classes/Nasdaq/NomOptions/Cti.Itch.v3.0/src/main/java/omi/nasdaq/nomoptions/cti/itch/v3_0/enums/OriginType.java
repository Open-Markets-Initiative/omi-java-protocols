package omi.nasdaq.nomoptions.cti.itch.v3_0.enums;

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
     * OTTO Order
     */
    OTTO_ORDER('T', "OTTO Order"),

    /**
     * OTTO Sweep (NOM only)
     */
    OTTO_SWEEP('E', "OTTO Sweep (NOM only)"),

    /**
     * SQF Quote
     */
    SQF_QUOTE('Q', "SQF Quote"),

    /**
     * SQF Sweep
     */
    SQF_SWEEP('W', "SQF Sweep"),

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
     * Others
     */
    OTHERS(' ', "Others");

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
            case 'T' -> Optional.of(OTTO_ORDER);
            case 'E' -> Optional.of(OTTO_SWEEP);
            case 'Q' -> Optional.of(SQF_QUOTE);
            case 'W' -> Optional.of(SQF_SWEEP);
            case 'P' -> Optional.of(BLOCK_ORDER);
            case 'X' -> Optional.of(BLOCK_RESPONSE);
            case 'G' -> Optional.of(PIM_PRIMARY_ORDER);
            case 'H' -> Optional.of(PIM_CONTRA_ORDER);
            case 'I' -> Optional.of(PIM_RESPONSE_ORDER);
            case 'J' -> Optional.of(PIM_RESPONSE_SQF_SWEEP);
            case 'B' -> Optional.of(FBMS_FLOOR_TRADE);
            case 'K' -> Optional.of(QCC_PRIMARY);
            case 'L' -> Optional.of(QCC_CONTRA);
            case 'M' -> Optional.of(SOLICITATION_PRIMARY_ORDER);
            case 'N' -> Optional.of(SOLICITATION_CONTRA_ORDER);
            case 'U' -> Optional.of(SOLICITATION_RESPONSE_ORDER);
            case 'V' -> Optional.of(SOLICITATION_RESPONSE_SQF_SWEEP);
            case 'F' -> Optional.of(FACILITATION_PRIMARY_ORDER);
            case 'A' -> Optional.of(FACILITATION_CONTRA_ORDER);
            case 'D' -> Optional.of(FACILITATION_RESPONSE_ORDER);
            case 'Y' -> Optional.of(FACILITATION_RESPONSE_SQF_SWEEP);
            case ' ' -> Optional.of(OTHERS);
            default -> Optional.empty();
        };
    }
}
