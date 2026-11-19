package omi.tmx.tsxalpha.level1.qrtmd.v2_1.enums;

import java.util.Optional;

/**
 * An indicator for bypass crosses, which can be printed outside of the Protected NBBO and are not subject to cross interference.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum Bypass {

    /**
     * Yes
     */
    YES('Y', "Yes"),

    /**
     * Default
     */
    NO('N', "Default");

    private final char wire;

    private final String description;

    Bypass(char wire, String description) {
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
    public static Optional<Bypass> fromWire(char wire) {
        return switch (wire) {
            case 'Y' -> Optional.of(YES);
            case 'N' -> Optional.of(NO);
            default -> Optional.empty();
        };
    }
}
