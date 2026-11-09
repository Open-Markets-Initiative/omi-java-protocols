package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.enums;

import java.util.Optional;

/**
 * CTI code
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum CtiCode {

    /**
     * Transactions initiated and executed by an individual TPH for the TPH’s own account, for an account the TPH controls, or for the account in which the TPH has an ownership or financial interest
     */
    CTI_1('1', "Transactions initiated and executed by an individual TPH for the TPH\u2019s own account, for an account the TPH controls, or for the account in which the TPH has an ownership or financial interest"),

    /**
     * Transactions executed for the proprietary account of a clearing TPH or non-clearing TPH
     */
    CTI_2('2', "Transactions executed for the proprietary account of a clearing TPH or non-clearing TPH"),

    /**
     * Transactions where an individual TPH or authorized trader executes for the personal account of another individual TPH, for an account the other individual TPH controls or for an account in which the other individual TPH has an ownership or financial interest
     */
    CTI_3('3', "Transactions where an individual TPH or authorized trader executes for the personal account of another individual TPH, for an account the other individual TPH controls or for an account in which the other individual TPH has an ownership or financial interest"),

    /**
     * Any transaction not meeting the definition of CTI 1, 2 or 3
     */
    CTI_4('4', "Any transaction not meeting the definition of CTI 1, 2 or 3");

    private final char wire;

    private final String description;

    CtiCode(char wire, String description) {
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
    public static Optional<CtiCode> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(CTI_1);
            case '2' -> Optional.of(CTI_2);
            case '3' -> Optional.of(CTI_3);
            case '4' -> Optional.of(CTI_4);
            default -> Optional.empty();
        };
    }
}
