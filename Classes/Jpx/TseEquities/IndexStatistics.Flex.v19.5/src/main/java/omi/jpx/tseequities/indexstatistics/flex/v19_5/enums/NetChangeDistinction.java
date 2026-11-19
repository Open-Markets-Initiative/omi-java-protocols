package omi.jpx.tseequities.indexstatistics.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the distinction between net change.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum NetChangeDistinction {

    /**
     * Up
     */
    UP('1', "Up"),

    /**
     * Down
     */
    DOWN('2', "Down");

    private final char wire;

    private final String description;

    NetChangeDistinction(char wire, String description) {
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
    public static Optional<NetChangeDistinction> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(UP);
            case '2' -> Optional.of(DOWN);
            default -> Optional.empty();
        };
    }
}
