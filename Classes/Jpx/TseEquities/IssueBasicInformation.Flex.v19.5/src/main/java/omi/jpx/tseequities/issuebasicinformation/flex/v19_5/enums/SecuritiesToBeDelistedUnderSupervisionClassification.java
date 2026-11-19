package omi.jpx.tseequities.issuebasicinformation.flex.v19_5.enums;

import java.util.Optional;

/**
 * Indicates the Securities to be delisted / under supervision classification.
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SecuritiesToBeDelistedUnderSupervisionClassification {

    /**
     * Under Supervision Presently Under Examination
     */
    UNDER_SUPERVISION_PRESENTLY_UNDER_EXAMINATION('1', "Under Supervision Presently Under Examination"),

    /**
     * Under Supervision Presently Under Confirmation
     */
    UNDER_SUPERVISION_PRESENTLY_UNDER_CONFIRMATION('2', "Under Supervision Presently Under Confirmation"),

    /**
     * Under Supervision Presently Under Examination And Confirmation
     */
    UNDER_SUPERVISION_PRESENTLY_UNDER_EXAMINATION_AND_CONFIRMATION('3', "Under Supervision Presently Under Examination And Confirmation"),

    /**
     * Under Supervision Presently Under Examination And On Special Alert
     */
    UNDER_SUPERVISION_PRESENTLY_UNDER_EXAMINATION_AND_ON_SPECIAL_ALERT('4', "Under Supervision Presently Under Examination And On Special Alert"),

    /**
     * Under Supervision Presently Under Confirmation And On Special Alert
     */
    UNDER_SUPERVISION_PRESENTLY_UNDER_CONFIRMATION_AND_ON_SPECIAL_ALERT('5', "Under Supervision Presently Under Confirmation And On Special Alert"),

    /**
     * Under Supervision Presently Under Examination And Confirmation And On Special Alert
     */
    UNDER_SUPERVISION_PRESENTLY_UNDER_EXAMINATION_AND_CONFIRMATION_AND_ON_SPECIAL_ALERT('6', "Under Supervision Presently Under Examination And Confirmation And On Special Alert"),

    /**
     * To Be Delisted
     */
    TO_BE_DELISTED('7', "To Be Delisted"),

    /**
     * To Be Delisted And On Special Alert
     */
    TO_BE_DELISTED_AND_ON_SPECIAL_ALERT('8', "To Be Delisted And On Special Alert"),

    /**
     * On Special Alert
     */
    ON_SPECIAL_ALERT('9', "On Special Alert"),

    /**
     * None Specified
     */
    NONE_SPECIFIED('0', "None Specified");

    private final char wire;

    private final String description;

    SecuritiesToBeDelistedUnderSupervisionClassification(char wire, String description) {
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
    public static Optional<SecuritiesToBeDelistedUnderSupervisionClassification> fromWire(char wire) {
        return switch (wire) {
            case '1' -> Optional.of(UNDER_SUPERVISION_PRESENTLY_UNDER_EXAMINATION);
            case '2' -> Optional.of(UNDER_SUPERVISION_PRESENTLY_UNDER_CONFIRMATION);
            case '3' -> Optional.of(UNDER_SUPERVISION_PRESENTLY_UNDER_EXAMINATION_AND_CONFIRMATION);
            case '4' -> Optional.of(UNDER_SUPERVISION_PRESENTLY_UNDER_EXAMINATION_AND_ON_SPECIAL_ALERT);
            case '5' -> Optional.of(UNDER_SUPERVISION_PRESENTLY_UNDER_CONFIRMATION_AND_ON_SPECIAL_ALERT);
            case '6' -> Optional.of(UNDER_SUPERVISION_PRESENTLY_UNDER_EXAMINATION_AND_CONFIRMATION_AND_ON_SPECIAL_ALERT);
            case '7' -> Optional.of(TO_BE_DELISTED);
            case '8' -> Optional.of(TO_BE_DELISTED_AND_ON_SPECIAL_ALERT);
            case '9' -> Optional.of(ON_SPECIAL_ALERT);
            case '0' -> Optional.of(NONE_SPECIFIED);
            default -> Optional.empty();
        };
    }
}
