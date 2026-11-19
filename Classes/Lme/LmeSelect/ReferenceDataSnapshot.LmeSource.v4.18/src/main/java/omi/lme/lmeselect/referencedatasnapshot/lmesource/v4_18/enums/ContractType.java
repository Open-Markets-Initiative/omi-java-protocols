package omi.lme.lmeselect.referencedatasnapshot.lmesource.v4_18.enums;

import java.util.Optional;

/**
 * Constant contract type.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ContractType {

    /**
     * Future
     */
    FUTURE('F', "Future"),

    /**
     * Option
     */
    OPTION('O', "Option");

    private final char wire;

    private final String description;

    ContractType(char wire, String description) {
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
    public static Optional<ContractType> fromWire(char wire) {
        return switch (wire) {
            case 'F' -> Optional.of(FUTURE);
            case 'O' -> Optional.of(OPTION);
            default -> Optional.empty();
        };
    }
}
