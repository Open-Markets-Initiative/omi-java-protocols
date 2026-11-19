package omi.b3.b3derivatives.binaryumdf.sbe.v2_3.enums;

import java.util.Optional;

/**
 * openCloseSettlFlag
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum OpenCloseSettlFlagOptional {

    /**
     * Daily settlement entry.
     */
    DAILY((short) 0, "Daily settlement entry."),

    /**
     * Session settlement entry.
     */
    SESSION((short) 1, "Session settlement entry."),

    /**
     * Expected entry (preliminary price).
     */
    EXPECTED_ENTRY((short) 3, "Expected entry (preliminary price)."),

    /**
     * Entry from previous business day.
     */
    ENTRY_FROM_PREVIOUS_BUSINESS_DAY((short) 4, "Entry from previous business day."),

    /**
     * Theoretical Price.
     */
    THEORETICAL_PRICE((short) 5, "Theoretical Price."),

    /**
     * openCloseSettlFlag
     */
    NO_VALUE((short) 255, "openCloseSettlFlag");

    private final short wire;

    private final String description;

    OpenCloseSettlFlagOptional(short wire, String description) {
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
    public static Optional<OpenCloseSettlFlagOptional> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(DAILY);
            case 1 -> Optional.of(SESSION);
            case 3 -> Optional.of(EXPECTED_ENTRY);
            case 4 -> Optional.of(ENTRY_FROM_PREVIOUS_BUSINESS_DAY);
            case 5 -> Optional.of(THEORETICAL_PRICE);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
