package omi.koscom.mdcsrealtime.koscom.exture.v1_20.enums;

import java.util.Optional;

/**
 * End of text sentinel (0xFF). Workbook field name: 정보분배메세지종료키워드.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum EndKeyword {

    /**
     * End Of Message
     */
    END_OF_MESSAGE((short) 255, "End Of Message");

    private final short wire;

    private final String description;

    EndKeyword(short wire, String description) {
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
    public static Optional<EndKeyword> fromWire(short wire) {
        return wire == 255 ? Optional.of(END_OF_MESSAGE) : Optional.empty();
    }
}
