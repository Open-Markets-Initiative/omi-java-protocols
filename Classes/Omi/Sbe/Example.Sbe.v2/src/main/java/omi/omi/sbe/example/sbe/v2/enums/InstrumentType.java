package omi.omi.sbe.example.sbe.v2.enums;

import java.util.Optional;

/**
 * instrumentType
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum InstrumentType {

    /**
     * CTS 0 — generic CTS-eligible equity (no further classification on wire); also the default for UTP symbols before issue_symbol_directory_message has been observed.
     */
    CTA_ELIGIBLE_EQUITY((short) 0, "CTS 0 \u2014 generic CTS-eligible equity (no further classification on wire); also the default for UTP symbols before issue_symbol_directory_message has been observed."),

    /**
     * CTS 1.
     */
    LOCAL_ISSUE((short) 1, "CTS 1."),

    /**
     * CTS 2.
     */
    CORPORATE_BOND((short) 2, "CTS 2."),

    /**
     * CTS 3.
     */
    GOVERNMENT_BOND((short) 3, "CTS 3."),

    /**
     * UTDF issue_type 'C'.
     */
    COMMON_STOCK((short) 4, "UTDF issue_type 'C'."),

    /**
     * UTDF issue_type 'P'.
     */
    PREFERRED_STOCK((short) 5, "UTDF issue_type 'P'."),

    /**
     * UTDF issue_type 'A'.
     */
    AMERICAN_DEPOSITORY_RECEIPT((short) 6, "UTDF issue_type 'A'."),

    /**
     * UTDF issue_type 'F'.
     */
    DEPOSITORY_RECEIPT((short) 7, "UTDF issue_type 'F'."),

    /**
     * UTDF issue_type 'O'.
     */
    ORDINARY_SHARES((short) 8, "UTDF issue_type 'O'."),

    /**
     * UTDF issue_type 'S'.
     */
    SHARES_OF_BENEFICIAL_INTEREST((short) 9, "UTDF issue_type 'S'."),

    /**
     * UTDF issue_type 'U'.
     */
    UNIT((short) 10, "UTDF issue_type 'U'."),

    /**
     * UTDF issue_type 'V'.
     */
    UNITS_OF_BENEFICIAL_INTEREST((short) 11, "UTDF issue_type 'V'."),

    /**
     * UTDF issue_type 'L'.
     */
    LIMITED_PARTNERSHIP((short) 12, "UTDF issue_type 'L'."),

    /**
     * UTDF issue_type 'W'.
     */
    WARRANT((short) 13, "UTDF issue_type 'W'."),

    /**
     * UTDF issue_type 'R'.
     */
    RIGHTS((short) 14, "UTDF issue_type 'R'."),

    /**
     * UTDF issue_type 'I'.
     */
    RESTRICTED_144A((short) 15, "UTDF issue_type 'I'."),

    /**
     * UTDF issue_type 'N'.
     */
    NOTE((short) 16, "UTDF issue_type 'N'."),

    /**
     * UTDF issue_type 'T'.
     */
    CONVERTIBLE_DEBENTURE((short) 17, "UTDF issue_type 'T'."),

    /**
     * UTDF issue_type 'B' — generic UTDF bond; CTS distinguishes via CorporateBond/GovernmentBond.
     */
    BOND((short) 18, "UTDF issue_type 'B' \u2014 generic UTDF bond; CTS distinguishes via CorporateBond/GovernmentBond."),

    /**
     * UTDF issue_type 'Q'.
     */
    OTHER_SECURITIES((short) 19, "UTDF issue_type 'Q'.");

    private final short wire;

    private final String description;

    InstrumentType(short wire, String description) {
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
    public static Optional<InstrumentType> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(CTA_ELIGIBLE_EQUITY);
            case 1 -> Optional.of(LOCAL_ISSUE);
            case 2 -> Optional.of(CORPORATE_BOND);
            case 3 -> Optional.of(GOVERNMENT_BOND);
            case 4 -> Optional.of(COMMON_STOCK);
            case 5 -> Optional.of(PREFERRED_STOCK);
            case 6 -> Optional.of(AMERICAN_DEPOSITORY_RECEIPT);
            case 7 -> Optional.of(DEPOSITORY_RECEIPT);
            case 8 -> Optional.of(ORDINARY_SHARES);
            case 9 -> Optional.of(SHARES_OF_BENEFICIAL_INTEREST);
            case 10 -> Optional.of(UNIT);
            case 11 -> Optional.of(UNITS_OF_BENEFICIAL_INTEREST);
            case 12 -> Optional.of(LIMITED_PARTNERSHIP);
            case 13 -> Optional.of(WARRANT);
            case 14 -> Optional.of(RIGHTS);
            case 15 -> Optional.of(RESTRICTED_144A);
            case 16 -> Optional.of(NOTE);
            case 17 -> Optional.of(CONVERTIBLE_DEBENTURE);
            case 18 -> Optional.of(BOND);
            case 19 -> Optional.of(OTHER_SECURITIES);
            default -> Optional.empty();
        };
    }
}
