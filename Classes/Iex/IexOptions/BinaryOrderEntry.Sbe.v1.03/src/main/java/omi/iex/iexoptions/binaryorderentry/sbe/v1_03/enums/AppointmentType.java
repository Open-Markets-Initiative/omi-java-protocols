package omi.iex.iexoptions.binaryorderentry.sbe.v1_03.enums;

import java.util.Optional;

/**
 * appointmentType
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum AppointmentType {

    /**
     * RegisteredMarketMaker
     */
    REGISTERED_MARKET_MAKER((byte) 1, "RegisteredMarketMaker"),

    /**
     * DirectedMarketMaker
     */
    DIRECTED_MARKET_MAKER((byte) 2, "DirectedMarketMaker"),

    /**
     * Specialist
     */
    SPECIALIST((byte) 3, "Specialist");

    private final byte wire;

    private final String description;

    AppointmentType(byte wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public byte wire() {
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
    public static Optional<AppointmentType> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(REGISTERED_MARKET_MAKER);
            case 2 -> Optional.of(DIRECTED_MARKET_MAKER);
            case 3 -> Optional.of(SPECIALIST);
            default -> Optional.empty();
        };
    }
}
