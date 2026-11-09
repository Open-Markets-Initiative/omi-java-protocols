package omi.cboe.c1options.marketdatafeed.csm.v1_4_2.enums;

import java.util.Optional;

/**
 * Defines the MdControlType values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MdControlType {

    /**
     * Start Of Summary
     */
    START_OF_SUMMARY((short) 0, "Start Of Summary"),

    /**
     * End Of Summary
     */
    END_OF_SUMMARY((short) 1, "End Of Summary"),

    /**
     * Start Of Settlement
     */
    START_OF_SETTLEMENT((short) 2, "Start Of Settlement"),

    /**
     * End Of Settlement
     */
    END_OF_SETTLEMENT((short) 3, "End Of Settlement");

    private final short wire;

    private final String description;

    MdControlType(short wire, String description) {
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
    public static Optional<MdControlType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(START_OF_SUMMARY);
            case 1 -> Optional.of(END_OF_SUMMARY);
            case 2 -> Optional.of(START_OF_SETTLEMENT);
            case 3 -> Optional.of(END_OF_SETTLEMENT);
            default -> Optional.empty();
        };
    }
}
