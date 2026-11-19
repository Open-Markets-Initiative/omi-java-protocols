package omi.pse.pseequities.totalview.itch.v2_3.enums;

import java.util.Optional;

/**
 * Instrument Type.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum InstrumentType {

    /**
     * Common Stock
     */
    COMMON_STOCK('C', "Common Stock"),

    /**
     * Preferred Stock
     */
    PREFERRED_STOCK('P', "Preferred Stock"),

    /**
     * Warrant
     */
    WARRANT('W', "Warrant"),

    /**
     * ETF
     */
    ETF('E', "ETF"),

    /**
     * PDR
     */
    PDR('D', "PDR"),

    /**
     * Index
     */
    INDEX('I', "Index");

    private final char wire;

    private final String description;

    InstrumentType(char wire, String description) {
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
    public static Optional<InstrumentType> fromWire(char wire) {
        return switch (wire) {
            case 'C' -> Optional.of(COMMON_STOCK);
            case 'P' -> Optional.of(PREFERRED_STOCK);
            case 'W' -> Optional.of(WARRANT);
            case 'E' -> Optional.of(ETF);
            case 'D' -> Optional.of(PDR);
            case 'I' -> Optional.of(INDEX);
            default -> Optional.empty();
        };
    }
}
