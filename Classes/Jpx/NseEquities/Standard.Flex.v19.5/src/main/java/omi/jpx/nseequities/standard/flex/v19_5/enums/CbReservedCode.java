package omi.jpx.nseequities.standard.flex.v19_5.enums;

import java.util.Optional;

/**
 * Reserved Code.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CbReservedCode {

    /**
     * SW
     */
    SW('4', "SW"),

    /**
     * Exchangeable bond (EB)
     */
    EXCHANGEABLE_BOND('8', "Exchangeable bond (EB)"),

    /**
     * CB
     */
    CB('9', "CB"),

    /**
     * Bond other than the above
     */
    OTHER_BOND(' ', "Bond other than the above");

    private final char wire;

    private final String description;

    CbReservedCode(char wire, String description) {
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
    public static Optional<CbReservedCode> fromWire(char wire) {
        return switch (wire) {
            case '4' -> Optional.of(SW);
            case '8' -> Optional.of(EXCHANGEABLE_BOND);
            case '9' -> Optional.of(CB);
            case ' ' -> Optional.of(OTHER_BOND);
            default -> Optional.empty();
        };
    }
}
