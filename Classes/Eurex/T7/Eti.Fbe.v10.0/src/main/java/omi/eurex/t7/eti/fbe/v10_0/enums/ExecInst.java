package omi.eurex.t7.eti.fbe.v10_0.enums;

import java.util.Optional;

/**
 * Defines the ExecInst values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum ExecInst {

    /**
     * Persistent Order (FIX value 'H')
     */
    H((short) 1, "Persistent Order (FIX value 'H')"),

    /**
     * Non-persistent Order (FIX value 'Q')
     */
    Q((short) 2, "Non-persistent Order (FIX value 'Q')"),

    /**
     * Persistent and non-persistent orders affected (FIX value 'H Q')
     */
    HQ((short) 3, "Persistent and non-persistent orders affected (FIX value 'H Q')"),

    /**
     * Persistent and Book or Cancel order (FIX value 'H 6')
     */
    H6((short) 5, "Persistent and Book or Cancel order (FIX value 'H 6')"),

    /**
     * Non-persistent and Book or Cancel order (FIX value 'Q 6')
     */
    Q6((short) 6, "Non-persistent and Book or Cancel order (FIX value 'Q 6')"),

    /**
     * No Value
     */
    NO_VALUE((short) 255, "No Value");

    private final short wire;

    private final String description;

    ExecInst(short wire, String description) {
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
    public static Optional<ExecInst> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(H);
            case 2 -> Optional.of(Q);
            case 3 -> Optional.of(HQ);
            case 5 -> Optional.of(H6);
            case 6 -> Optional.of(Q6);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
