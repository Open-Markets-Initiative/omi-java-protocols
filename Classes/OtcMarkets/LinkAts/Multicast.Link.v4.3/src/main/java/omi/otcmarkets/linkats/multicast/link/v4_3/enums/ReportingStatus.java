package omi.otcmarkets.linkats.multicast.link.v4_3.enums;

import java.util.Optional;

/**
 * Reporting status.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ReportingStatus {

    /**
     * Alternative Reporting Standard
     */
    ALTERNATIVE_REPORTING('A', "Alternative Reporting Standard"),

    /**
     * Bank or Thrift
     */
    BANK_THRIFT('B', "Bank or Thrift"),

    /**
     * SEC Reporting
     */
    SEC_REPORTING('F', "SEC Reporting"),

    /**
     * International Reporting
     */
    INTERNATIONAL_REPORTING('G', "International Reporting"),

    /**
     * Insurance Company
     */
    INSURANCE_COMPANY('I', "Insurance Company"),

    /**
     * No Reporting
     */
    NO_REPORTING('N', "No Reporting"),

    /**
     * Other Reporting Standard
     */
    OTHER_REPORTING('O', "Other Reporting Standard"),

    /**
     * FINRA Reporting
     */
    FINRA_REPORTING('R', "FINRA Reporting"),

    /**
     * SEC Reporting Investment Company
     */
    SEC_INVESTMENT_COMPANY('V', "SEC Reporting Investment Company"),

    /**
     * SEC Reporting Reg A
     */
    SEC_REG_A('W', "SEC Reporting Reg A");

    private final char wire;

    private final String description;

    ReportingStatus(char wire, String description) {
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
    public static Optional<ReportingStatus> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ALTERNATIVE_REPORTING);
            case 'B' -> Optional.of(BANK_THRIFT);
            case 'F' -> Optional.of(SEC_REPORTING);
            case 'G' -> Optional.of(INTERNATIONAL_REPORTING);
            case 'I' -> Optional.of(INSURANCE_COMPANY);
            case 'N' -> Optional.of(NO_REPORTING);
            case 'O' -> Optional.of(OTHER_REPORTING);
            case 'R' -> Optional.of(FINRA_REPORTING);
            case 'V' -> Optional.of(SEC_INVESTMENT_COMPANY);
            case 'W' -> Optional.of(SEC_REG_A);
            default -> Optional.empty();
        };
    }
}
