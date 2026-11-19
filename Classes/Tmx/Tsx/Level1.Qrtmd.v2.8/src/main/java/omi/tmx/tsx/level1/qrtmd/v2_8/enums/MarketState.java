package omi.tmx.tsx.level1.qrtmd.v2_8.enums;

import java.util.Optional;

/**
 * The indication of the current market state.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum MarketState {

    /**
     * Pre Open
     */
    PRE_OPEN('P', "Pre Open"),

    /**
     * Opening
     */
    OPENING('O', "Opening"),

    /**
     * Open
     */
    OPEN('S', "Open"),

    /**
     * Closed
     */
    CLOSED('C', "Closed"),

    /**
     * Extended Hours Open
     */
    EXTENDED_HOURS_OPEN('R', "Extended Hours Open"),

    /**
     * Extended Hours Close
     */
    EXTENDED_HOURS_CLOSE('F', "Extended Hours Close"),

    /**
     * Extended Hours Cxls
     */
    EXTENDED_HOURS_CXLS('N', "Extended Hours Cxls"),

    /**
     * Moc Imbalance
     */
    MOC_IMBALANCE('M', "Moc Imbalance"),

    /**
     * Moc Freeze
     */
    MOC_FREEZE('T', "Moc Freeze"),

    /**
     * Ccp Determination
     */
    CCP_DETERMINATION('A', "Ccp Determination"),

    /**
     * Price Movement Extension
     */
    PRICE_MOVEMENT_EXTENSION('E', "Price Movement Extension"),

    /**
     * Closing
     */
    CLOSING('L', "Closing"),

    /**
     * Navex stock groups
     */
    NAVEX_CLOSED('J', "Navex stock groups"),

    /**
     * Navex stock groups
     */
    NAVEX_ORDER_ENTRY('G', "Navex stock groups"),

    /**
     * Navex stock groups
     */
    NAVEX_ORDER_ENTRY_CLOSE('H', "Navex stock groups"),

    /**
     * Navex stock groups
     */
    NAVEX_AM_EXECUTION('K', "Navex stock groups"),

    /**
     * Navex stock groups
     */
    NAVEX_PM_EXECUTION('X', "Navex stock groups"),

    /**
     * Navex stock groups
     */
    NAVEX_CLOSE('Y', "Navex stock groups");

    private final char wire;

    private final String description;

    MarketState(char wire, String description) {
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
    public static Optional<MarketState> fromWire(char wire) {
        return switch (wire) {
            case 'P' -> Optional.of(PRE_OPEN);
            case 'O' -> Optional.of(OPENING);
            case 'S' -> Optional.of(OPEN);
            case 'C' -> Optional.of(CLOSED);
            case 'R' -> Optional.of(EXTENDED_HOURS_OPEN);
            case 'F' -> Optional.of(EXTENDED_HOURS_CLOSE);
            case 'N' -> Optional.of(EXTENDED_HOURS_CXLS);
            case 'M' -> Optional.of(MOC_IMBALANCE);
            case 'T' -> Optional.of(MOC_FREEZE);
            case 'A' -> Optional.of(CCP_DETERMINATION);
            case 'E' -> Optional.of(PRICE_MOVEMENT_EXTENSION);
            case 'L' -> Optional.of(CLOSING);
            case 'J' -> Optional.of(NAVEX_CLOSED);
            case 'G' -> Optional.of(NAVEX_ORDER_ENTRY);
            case 'H' -> Optional.of(NAVEX_ORDER_ENTRY_CLOSE);
            case 'K' -> Optional.of(NAVEX_AM_EXECUTION);
            case 'X' -> Optional.of(NAVEX_PM_EXECUTION);
            case 'Y' -> Optional.of(NAVEX_CLOSE);
            default -> Optional.empty();
        };
    }
}
