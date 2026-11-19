package omi.euronext.optiq.dropcopygateway.sbe.v5_36.enums;

import java.util.Optional;

/**
 * originalShortCodeType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OriginalShortCodeType {

    /**
     * Original_EWFSC
     */
    ORIGINAL_EWFSC((short) 1, "Original_EWFSC"),

    /**
     * Original_CISC
     */
    ORIGINAL_CISC((short) 2, "Original_CISC"),

    /**
     * Original_INVSC
     */
    ORIGINAL_INVSC((short) 3, "Original_INVSC"),

    /**
     * Original_NBSC
     */
    ORIGINAL_NBSC((short) 4, "Original_NBSC"),

    /**
     * originalShortCodeType
     */
    NO_VALUE((short) 255, "originalShortCodeType");

    private final short wire;

    private final String description;

    OriginalShortCodeType(short wire, String description) {
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
    public static Optional<OriginalShortCodeType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(ORIGINAL_EWFSC);
            case 2 -> Optional.of(ORIGINAL_CISC);
            case 3 -> Optional.of(ORIGINAL_INVSC);
            case 4 -> Optional.of(ORIGINAL_NBSC);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
