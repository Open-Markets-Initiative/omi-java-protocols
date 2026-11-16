package omi.zerocopyflyweight.nasdaq.iseoptions.ordercombofeed.itch.v1_1.enums;

/**
 * Refer to System Event Codes below
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum EventCode {

    /**
     * Start of Messages
     */
    START_OF_MESSAGES('O'),

    /**
     * Start of System Hours
     */
    START_OF_SYSTEM_HOURS('S'),

    /**
     * Start of Opening Process
     */
    START_OF_OPENING_PROCESS('Q'),

    /**
     * Start of Normal Hours Closing Process
     */
    START_OF_NORMAL_HOURS_CLOSING_PROCESS('N'),

    /**
     * Start of Late Hours Closing Process
     */
    START_OF_LATE_HOURS_CLOSING_PROCESS('L'),

    /**
     * End of System Hours
     */
    END_OF_SYSTEM_HOURS('E'),

    /**
     * End of Messages
     */
    END_OF_MESSAGES('C'),

    /**
     * End of WCO Early closing
     */
    END_OF_WCO_EARLY_CLOSING('W');

    private static final EventCode[] BY_WIRE = new EventCode[256];

    static {
        for (EventCode value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    EventCode(char wire) {
        this.wire = wire;
    }

    /**
     * Gets the value as it is sent.
     *
     * @return the wire value
     */
    public char wire() {
        return wire;
    }

    /**
     * Looks a value up from its wire form, allocating nothing.
     *
     * @param wire the wire value
     * @return the value, or null when the protocol declares none for it
     */
    public static EventCode get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
