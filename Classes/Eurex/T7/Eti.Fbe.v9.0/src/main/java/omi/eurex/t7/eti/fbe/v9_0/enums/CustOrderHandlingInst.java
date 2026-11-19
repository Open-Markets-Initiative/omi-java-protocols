package omi.eurex.t7.eti.fbe.v9_0.enums;

import java.util.Optional;

/**
 * Defines the CustOrderHandlingInst values.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CustOrderHandlingInst {

    /**
     * W - Desk
     */
    W('W', "W - Desk"),

    /**
     * Y - Electronic
     */
    Y('Y', "Y - Electronic"),

    /**
     * C - FCM-provided screen
     */
    C('C', "C - FCM-provided screen"),

    /**
     * G - FCM API or FIX
     */
    G('G', "G - FCM API or FIX"),

    /**
     * H - Algo Engine
     */
    H('H', "H - Algo Engine"),

    /**
     * D - Default
     */
    D('D', "D - Default");

    private final char wire;

    private final String description;

    CustOrderHandlingInst(char wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public char wire() {
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
    public static Optional<CustOrderHandlingInst> fromWire(char wire) {
        return switch (wire) {
            case 'W' -> Optional.of(W);
            case 'Y' -> Optional.of(Y);
            case 'C' -> Optional.of(C);
            case 'G' -> Optional.of(G);
            case 'H' -> Optional.of(H);
            case 'D' -> Optional.of(D);
            default -> Optional.empty();
        };
    }
}
