package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * MMT Modification Indicator
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MmtModificationIndicator {

    /**
     * C = Trade Cancellation
     */
    TRADE_CANCELLATION((short) 1, "C = Trade Cancellation"),

    /**
     * A = Trade Amendment
     */
    TRADE_AMENDMENT((short) 2, "A = Trade Amendment"),

    /**
     * - = New Trade
     */
    NEW_TRADE((short) 3, "- = New Trade");

    private final short wire;

    private final String description;

    MmtModificationIndicator(short wire, String description) {
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
    public static Optional<MmtModificationIndicator> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(TRADE_CANCELLATION);
            case 2 -> Optional.of(TRADE_AMENDMENT);
            case 3 -> Optional.of(NEW_TRADE);
            default -> Optional.empty();
        };
    }
}
