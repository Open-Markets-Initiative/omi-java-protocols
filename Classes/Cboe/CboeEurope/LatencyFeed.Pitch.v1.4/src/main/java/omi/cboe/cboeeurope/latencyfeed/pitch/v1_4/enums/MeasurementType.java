package omi.cboe.cboeeurope.latencyfeed.pitch.v1_4.enums;

import java.util.Optional;

/**
 * 0 (zero) = Order to Quote
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum MeasurementType {

    /**
     * Order To Quote
     */
    ORDER_TO_QUOTE((short) 0, "Order To Quote");

    private final short wire;

    private final String description;

    MeasurementType(short wire, String description) {
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
    public static Optional<MeasurementType> fromWire(short wire) {
        return wire == 0 ? Optional.of(ORDER_TO_QUOTE) : Optional.empty();
    }
}
