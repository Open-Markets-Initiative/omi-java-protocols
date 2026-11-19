package omi.jse.itac.enhancednativetrading.ntgi.v4_04.enums;

import java.util.Optional;

/**
 * Whether the Reference Instrument carries a symbol or an instrument id
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ReferenceInstrumentIdentifier {

    /**
     * Symbol
     */
    SYMBOL((short) 0, "Symbol"),

    /**
     * Instrument Id
     */
    INSTRUMENT_ID((short) 1, "Instrument Id");

    private final short wire;

    private final String description;

    ReferenceInstrumentIdentifier(short wire, String description) {
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
    public static Optional<ReferenceInstrumentIdentifier> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(SYMBOL);
            case 1 -> Optional.of(INSTRUMENT_ID);
            default -> Optional.empty();
        };
    }
}
