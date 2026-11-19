package omi.ice.icefutures.bgw.sbe.v7_0.enums;

import java.util.Optional;

/**
 * custOrderHandlingInst
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CustOrderHandlingInst {

    /**
     * Vendor-provided platform billed by executing broker
     */
    C('C', "Vendor-provided platform billed by executing broker"),

    /**
     * Other, including other-provided screen
     */
    D('D', "Other, including other-provided screen"),

    /**
     * Sponsored access via exchange API or provided by executing broker
     */
    G('G', "Sponsored access via exchange API or provided by executing broker"),

    /**
     * Premium algorithmic trading provider billed by executing broker
     */
    H('H', "Premium algorithmic trading provider billed by executing broker"),

    /**
     * Desk
     */
    W('W', "Desk"),

    /**
     * Electronic
     */
    Y('Y', "Electronic");

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
            case 'C' -> Optional.of(C);
            case 'D' -> Optional.of(D);
            case 'G' -> Optional.of(G);
            case 'H' -> Optional.of(H);
            case 'W' -> Optional.of(W);
            case 'Y' -> Optional.of(Y);
            default -> Optional.empty();
        };
    }
}
