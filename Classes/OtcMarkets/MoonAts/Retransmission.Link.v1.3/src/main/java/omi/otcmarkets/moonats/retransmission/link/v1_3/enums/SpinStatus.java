package omi.otcmarkets.moonats.retransmission.link.v1_3.enums;

import java.util.Optional;

/**
 * "S" Start of Spin or "E" End of Spin. Field renamed from "Status" in the PDF to disambiguate from sibling Status fields.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum SpinStatus {

    /**
     * "S" - Start of Spin.
     */
    START_OF_SPIN((short) 83, "\"S\" - Start of Spin."),

    /**
     * "E" - End of Spin.
     */
    END_OF_SPIN((short) 69, "\"E\" - End of Spin.");

    private final short wire;

    private final String description;

    SpinStatus(short wire, String description) {
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
    public static Optional<SpinStatus> fromWire(short wire) {
        return switch (wire) {
            case 83 -> Optional.of(START_OF_SPIN);
            case 69 -> Optional.of(END_OF_SPIN);
            default -> Optional.empty();
        };
    }
}
