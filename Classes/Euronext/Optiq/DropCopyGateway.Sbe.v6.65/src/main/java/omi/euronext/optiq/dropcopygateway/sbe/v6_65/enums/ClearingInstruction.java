package omi.euronext.optiq.dropcopygateway.sbe.v6_65.enums;

import java.util.Optional;

/**
 * clearingInstruction
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum ClearingInstruction {

    /**
     * Process_normally__formerly_Systematic_posting_
     */
    PROCESSNORMALLYFORMERLY_SYSTEMATICPOSTING(0, "Process_normally__formerly_Systematic_posting_"),

    /**
     * Manual_mode
     */
    MANUALMODE(8, "Manual_mode"),

    /**
     * Automatic_posting_mode
     */
    AUTOMATICPOSTINGMODE(9, "Automatic_posting_mode"),

    /**
     * Automatic_give_up_mode
     */
    AUTOMATICGIVEUPMODE(10, "Automatic_give_up_mode"),

    /**
     * Automatic_and_account_authorization
     */
    AUTOMATICANDACCOUNTAUTHORIZATION(4008, "Automatic_and_account_authorization"),

    /**
     * Manual_and_account_authorization
     */
    MANUALANDACCOUNTAUTHORIZATION(4009, "Manual_and_account_authorization"),

    /**
     * Give_up_to_single_firm
     */
    GIVEUPTOSINGLEFIRM(4010, "Give_up_to_single_firm");

    private final int wire;

    private final String description;

    ClearingInstruction(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
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
    public static Optional<ClearingInstruction> fromWire(int wire) {
        return switch (wire) {
            case 0 -> Optional.of(PROCESSNORMALLYFORMERLY_SYSTEMATICPOSTING);
            case 8 -> Optional.of(MANUALMODE);
            case 9 -> Optional.of(AUTOMATICPOSTINGMODE);
            case 10 -> Optional.of(AUTOMATICGIVEUPMODE);
            case 4008 -> Optional.of(AUTOMATICANDACCOUNTAUTHORIZATION);
            case 4009 -> Optional.of(MANUALANDACCOUNTAUTHORIZATION);
            case 4010 -> Optional.of(GIVEUPTOSINGLEFIRM);
            default -> Optional.empty();
        };
    }
}
