package omi.zerocopy.iex.iexequities.tops.iextp.v1_66.enums;

/**
 * System event identifier
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum SystemEvent {

    /**
     * Outside Of Heartbeat Messages On The Lower Level Protocol The Start Of Day Message Is The First Message Sent In Any Trading Session
     */
    START_OF_MESSAGES('O'),

    /**
     * This Message Indicates That Iex Is Open And Ready To Start Accepting Orders
     */
    START_OF_SYSTEM_HOURS('S'),

    /**
     * This Message Indicates That Day And Gtx Orders As Well As Market Orders And Pegged Orders Are Available For Execution On Iex
     */
    START_OF_REGULAR_MARKET_HOURS('R'),

    /**
     * This Message Indicates That Day Orders Market Orders And Pegged Orders Are No Longer Accepted By Iex
     */
    END_OF_REGULAR_MARKET_HOURS('M'),

    /**
     * This Message Indicates That Iex Is Now Closed And Will Not Accept Any New Orders During This Trading Session
     */
    END_OF_SYSTEM_HOURS('E'),

    /**
     * This Is Always The Last Message Sent In Any Trading Session
     */
    END_OF_MESSAGES('C');

    private static final SystemEvent[] BY_WIRE = new SystemEvent[256];

    static {
        for (SystemEvent value : values()) {
            if (BY_WIRE[value.wire & 0xFF] == null) {
                BY_WIRE[value.wire & 0xFF] = value;
            }
        }
    }

    private final char wire;

    SystemEvent(char wire) {
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
    public static SystemEvent get(char wire) {
        return wire < BY_WIRE.length ? BY_WIRE[wire] : null;
    }
}
