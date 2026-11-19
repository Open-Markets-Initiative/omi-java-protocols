package omi.gpw.wse.streamfulldepth.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Type of quantity returned
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PosType {

    /**
     * Start-of-Day Qty
     */
    SOD((short) 1, "Start-of-Day Qty"),

    /**
     * Intraday Qty
     */
    ITD((short) 2, "Intraday Qty"),

    /**
     * End-of-Day Qty
     */
    FIN((short) 3, "End-of-Day Qty");

    private final short wire;

    private final String description;

    PosType(short wire, String description) {
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
    public static Optional<PosType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(SOD);
            case 2 -> Optional.of(ITD);
            case 3 -> Optional.of(FIN);
            default -> Optional.empty();
        };
    }
}
