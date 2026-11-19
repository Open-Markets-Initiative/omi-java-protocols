package omi.euronext.optiq.orderentrygateway.sbe.v1_3.enums;

import java.util.Optional;

/**
 * preMatchingType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum PreMatchingType {

    /**
     * Not_prematched
     */
    NOTPREMATCHED((short) 1, "Not_prematched"),

    /**
     * Prematched_for_the_next_fixing
     */
    PREMATCHEDFORTHENEXTFIXING((short) 2, "Prematched_for_the_next_fixing"),

    /**
     * Prematched_for_the_second_next_fixing
     */
    PREMATCHEDFORTHESECONDNEXTFIXING((short) 3, "Prematched_for_the_second_next_fixing"),

    /**
     * Prematched_for_the_third_next_fixing
     */
    PREMATCHEDFORTHETHIRDNEXTFIXING((short) 4, "Prematched_for_the_third_next_fixing"),

    /**
     * Prematched_for_the_fourth_next_fixing
     */
    PREMATCHEDFORTHEFOURTHNEXTFIXING((short) 5, "Prematched_for_the_fourth_next_fixing"),

    /**
     * Prematched_for_the_fifth_next_fixing
     */
    PREMATCHEDFORTHEFIFTHNEXTFIXING((short) 6, "Prematched_for_the_fifth_next_fixing"),

    /**
     * preMatchingType
     */
    NO_VALUE((short) 255, "preMatchingType");

    private final short wire;

    private final String description;

    PreMatchingType(short wire, String description) {
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
    public static Optional<PreMatchingType> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(NOTPREMATCHED);
            case 2 -> Optional.of(PREMATCHEDFORTHENEXTFIXING);
            case 3 -> Optional.of(PREMATCHEDFORTHESECONDNEXTFIXING);
            case 4 -> Optional.of(PREMATCHEDFORTHETHIRDNEXTFIXING);
            case 5 -> Optional.of(PREMATCHEDFORTHEFOURTHNEXTFIXING);
            case 6 -> Optional.of(PREMATCHEDFORTHEFIFTHNEXTFIXING);
            case 255 -> Optional.of(NO_VALUE);
            default -> Optional.empty();
        };
    }
}
