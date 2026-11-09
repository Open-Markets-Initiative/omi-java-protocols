package omi.siac.cqs.output.cta.v2_10_a.enums;

import java.util.Optional;

/**
 * Identifies CQS as the originator of a message
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SipGeneratedMessageIdentifier {

    /**
     * Sip Generated Message Not Applicable
     */
    SIP_GENERATED_MESSAGE_NOT_APPLICABLE(' ', "Sip Generated Message Not Applicable"),

    /**
     * Consolidated Quotation System
     */
    CONSOLIDATED_QUOTATION_SYSTEM('S', "Consolidated Quotation System");

    private final char wire;

    private final String description;

    SipGeneratedMessageIdentifier(char wire, String description) {
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
    public static Optional<SipGeneratedMessageIdentifier> fromWire(char wire) {
        return switch (wire) {
            case ' ' -> Optional.of(SIP_GENERATED_MESSAGE_NOT_APPLICABLE);
            case 'S' -> Optional.of(CONSOLIDATED_QUOTATION_SYSTEM);
            default -> Optional.empty();
        };
    }
}
