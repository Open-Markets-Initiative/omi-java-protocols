package omi.b3.b3derivatives.binaryumdf.sbe.v1_8.enums;

import java.util.Optional;

/**
 * governanceIndicator
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum GovernanceIndicator {

    /**
     * Unspecified.
     */
    NO((short) 0, "Unspecified."),

    /**
     * Level 1.
     */
    N1((short) 1, "Level 1."),

    /**
     * Level 2.
     */
    N2((short) 2, "Level 2."),

    /**
     * New Market.
     */
    NM((short) 4, "New Market."),

    /**
     * Bovespa Mais.
     */
    MA((short) 5, "Bovespa Mais."),

    /**
     * Over the counter (SOMA Market).
     */
    MB((short) 6, "Over the counter (SOMA Market)."),

    /**
     * Bovespa Mais Level 2.
     */
    M2((short) 7, "Bovespa Mais Level 2."),

    /**
     * governanceIndicator
     */
    NO_VALUE((short) 255, "governanceIndicator");

    private final short wire;

    private final String description;

    GovernanceIndicator(short wire, String description) {
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
    public static Optional<GovernanceIndicator> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NO);
            case 1 -> Optional.of(N1);
            case 2 -> Optional.of(N2);
            case 4 -> Optional.of(NM);
            case 5 -> Optional.of(MA);
            case 6 -> Optional.of(MB);
            case 7 -> Optional.of(M2);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
