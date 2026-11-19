package omi.siac.opra.output.obi.v6_3_a.enums;

import java.util.Optional;

/**
 * Series Mapping Message Type
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SeriesMappingMessageType {

    /**
     * Series Mapping Message
     */
    SERIES_MAPPING(' ', "Series Mapping Message");

    private final char wire;

    private final String description;

    SeriesMappingMessageType(char wire, String description) {
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
    public static Optional<SeriesMappingMessageType> fromWire(char wire) {
        return wire == ' ' ? Optional.of(SERIES_MAPPING) : Optional.empty();
    }
}
