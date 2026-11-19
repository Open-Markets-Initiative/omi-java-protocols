package omi.nasdaq.ntxoptions.cti.itch.v1_3.enums;

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
     * OTTO/QUO Order
     */
    OTTO_QUO_ORDER('T', "OTTO/QUO Order"),

    /**
     * OTTO Sweep
     */
    OTTO_SWEEP('E', "OTTO Sweep"),

    /**
     * SQF Quote
     */
    SQF_QUOTE('Q', "SQF Quote"),

    /**
     * SQF Sweep
     */
    SQF_SWEEP('W', "SQF Sweep"),

    /**
     * PIXL/PRISM Primary FIX Order
     */
    PIXL_PRISM_PRIMARY_FIX_ORDER('G', "PIXL/PRISM Primary FIX Order"),

    /**
     * PIXL/PRISM Contra FIX Order
     */
    PIXL_PRISM_CONTRA_FIX_ORDER('H', "PIXL/PRISM Contra FIX Order"),

    /**
     * PIXL/PRISM Response FIX Order
     */
    PIXL_PRISM_RESPONSE_FIX_ORDER('I', "PIXL/PRISM Response FIX Order"),

    /**
     * PIXL/PRISM Response SQF Sweep
     */
    PIXL_PRISM_RESPONSE_SQF_SWEEP('J', "PIXL/PRISM Response SQF Sweep"),

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
            case 'T' -> Optional.of(OTTO_QUO_ORDER);
            case 'E' -> Optional.of(OTTO_SWEEP);
            case 'Q' -> Optional.of(SQF_QUOTE);
            case 'W' -> Optional.of(SQF_SWEEP);
            case 'G' -> Optional.of(PIXL_PRISM_PRIMARY_FIX_ORDER);
            case 'H' -> Optional.of(PIXL_PRISM_CONTRA_FIX_ORDER);
            case 'I' -> Optional.of(PIXL_PRISM_RESPONSE_FIX_ORDER);
            case 'J' -> Optional.of(PIXL_PRISM_RESPONSE_SQF_SWEEP);
            case ' ' -> Optional.of(OTHERS);
            default -> Optional.empty();
        };
    }
}
