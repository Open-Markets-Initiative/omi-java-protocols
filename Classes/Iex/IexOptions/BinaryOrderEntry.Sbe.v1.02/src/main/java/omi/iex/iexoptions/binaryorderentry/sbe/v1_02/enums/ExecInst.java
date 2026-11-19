package omi.iex.iexoptions.binaryorderentry.sbe.v1_02.enums;

import java.util.Optional;

/**
 * execInst
 *
 * <p>Backed by byte. Values correspond to the wire integer encoding.</p>
 */
public enum ExecInst {

    /**
     * ISO
     */
    ISO((byte) 1, "ISO"),

    /**
     * DoNotRoute
     */
    DO_NOT_ROUTE((byte) 2, "DoNotRoute");

    private final byte wire;

    private final String description;

    ExecInst(byte wire, String description) {
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
    public static Optional<ExecInst> fromWire(byte wire) {
        return switch (wire) {
            case 1 -> Optional.of(ISO);
            case 2 -> Optional.of(DO_NOT_ROUTE);
            default -> Optional.empty();
        };
    }
}
