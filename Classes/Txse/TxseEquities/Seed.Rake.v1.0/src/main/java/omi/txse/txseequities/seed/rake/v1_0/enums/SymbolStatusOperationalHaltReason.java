package omi.txse.txseequities.seed.rake.v1_0.enums;

import java.util.Optional;

/**
 * Enum SymbolStatusOperationalHaltReason.
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum SymbolStatusOperationalHaltReason {

    /**
     * Administrative or technical halt initiated by the Exchange.
     */
    ADMINISTRATIVE((byte) 0, "Administrative or technical halt initiated by the Exchange.");

    private final byte wire;

    private final String description;

    SymbolStatusOperationalHaltReason(byte wire, String description) {
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
    public static Optional<SymbolStatusOperationalHaltReason> fromWire(byte wire) {
        return wire == 0 ? Optional.of(ADMINISTRATIVE) : Optional.empty();
    }
}
