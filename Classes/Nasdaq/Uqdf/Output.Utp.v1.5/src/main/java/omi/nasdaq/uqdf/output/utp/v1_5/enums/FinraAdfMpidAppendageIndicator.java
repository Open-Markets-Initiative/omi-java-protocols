package omi.nasdaq.uqdf.output.utp.v1_5.enums;

import java.util.Optional;

/**
 * FINRA ADF MPID Appendage Indicator
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum FinraAdfMpidAppendageIndicator {

    /**
     * Not applicable
     */
    NOT_APPLICABLE(' ', "Not applicable"),

    /**
     * No ADF MPID changes
     */
    NO_ADF_MPID_CHANGES('0', "No ADF MPID changes"),

    /**
     * No ADF MPID exists
     */
    NO_ADF_MPID_EXISTS('1', "No ADF MPID exists"),

    /**
     * ADF MPIDs attached
     */
    ADF_MPI_DS_ATTACHED('2', "ADF MPIDs attached");

    private final char wire;

    private final String description;

    FinraAdfMpidAppendageIndicator(char wire, String description) {
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
    public static Optional<FinraAdfMpidAppendageIndicator> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(NOT_APPLICABLE);
            case '0' -> Optional.of(NO_ADF_MPID_CHANGES);
            case '1' -> Optional.of(NO_ADF_MPID_EXISTS);
            case '2' -> Optional.of(ADF_MPI_DS_ATTACHED);
            default -> Optional.empty();
        };
    }
}
