package omi.jpx.fseequities.standard.flex.v19_5.enums;

import java.util.Optional;

/**
 * Control Code DC3 (0x13) between tags, or DC1 (0x11) on the tag that ends the message
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SeparationOfTag {

    /**
     * DC3, 0x13, another tag follows
     */
    SEPARATION_BETWEEN_TAG((short) 19, "DC3, 0x13, another tag follows"),

    /**
     * DC1, 0x11, this tag ends the message
     */
    END_OF_MESSAGE((short) 17, "DC1, 0x11, this tag ends the message");

    private final short wire;

    private final String description;

    SeparationOfTag(short wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public short wire() {
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
    public static Optional<SeparationOfTag> fromWire(short wire) {
        return switch (wire) {
            case 19 -> Optional.of(SEPARATION_BETWEEN_TAG);
            case 17 -> Optional.of(END_OF_MESSAGE);
            default -> Optional.empty();
        };
    }
}
