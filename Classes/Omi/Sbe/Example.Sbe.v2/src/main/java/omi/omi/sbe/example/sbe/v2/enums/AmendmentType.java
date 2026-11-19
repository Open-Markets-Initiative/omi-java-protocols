package omi.omi.sbe.example.sbe.v2.enums;

import java.util.Optional;

/**
 * amendmentType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AmendmentType {

    /**
     * Fresh trade — no amendment.
     */
    NONE((short) 0, "Fresh trade \u2014 no amendment."),

    /**
     * Same-day trade correction (CTS Trade Correction / UTDF Trade Correction).
     */
    CORRECTION((short) 1, "Same-day trade correction (CTS Trade Correction / UTDF Trade Correction)."),

    /**
     * Same-day cancellation (CTS Cancel Error Action='Cancel' / UTDF Trade Cancellation Type='Cancel').
     */
    CANCEL((short) 2, "Same-day cancellation (CTS Cancel Error Action='Cancel' / UTDF Trade Cancellation Type='Cancel')."),

    /**
     * Same-day error (CTS Cancel Error Action='Error' / UTDF Trade Cancellation Type='Error').
     */
    ERROR((short) 3, "Same-day error (CTS Cancel Error Action='Error' / UTDF Trade Cancellation Type='Error')."),

    /**
     * CTS Prior Day Trade — a prior-day trade entered today.
     */
    PRIOR_DAY_TRADE((short) 4, "CTS Prior Day Trade \u2014 a prior-day trade entered today."),

    /**
     * CTS Prior Day Trade Correction.
     */
    PRIOR_DAY_CORRECTION((short) 5, "CTS Prior Day Trade Correction."),

    /**
     * CTS Prior Day Trade Cancel Error with action='Cancel'.
     */
    PRIOR_DAY_CANCEL((short) 6, "CTS Prior Day Trade Cancel Error with action='Cancel'."),

    /**
     * CTS Prior Day Trade Cancel Error with action='Error'.
     */
    PRIOR_DAY_ERROR((short) 7, "CTS Prior Day Trade Cancel Error with action='Error'."),

    /**
     * UTDF Prior Day As Of Trade with action='A' (addition).
     */
    AS_OF_TRADE_ADDITION((short) 8, "UTDF Prior Day As Of Trade with action='A' (addition)."),

    /**
     * UTDF Prior Day As Of Trade with action='C' (cancel).
     */
    AS_OF_TRADE_CANCEL((short) 9, "UTDF Prior Day As Of Trade with action='C' (cancel).");

    private final short wire;

    private final String description;

    AmendmentType(short wire, String description) {
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
    public static Optional<AmendmentType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(NONE);
            case 1 -> Optional.of(CORRECTION);
            case 2 -> Optional.of(CANCEL);
            case 3 -> Optional.of(ERROR);
            case 4 -> Optional.of(PRIOR_DAY_TRADE);
            case 5 -> Optional.of(PRIOR_DAY_CORRECTION);
            case 6 -> Optional.of(PRIOR_DAY_CANCEL);
            case 7 -> Optional.of(PRIOR_DAY_ERROR);
            case 8 -> Optional.of(AS_OF_TRADE_ADDITION);
            case 9 -> Optional.of(AS_OF_TRADE_CANCEL);
            default -> Optional.empty();
        };
    }
}
