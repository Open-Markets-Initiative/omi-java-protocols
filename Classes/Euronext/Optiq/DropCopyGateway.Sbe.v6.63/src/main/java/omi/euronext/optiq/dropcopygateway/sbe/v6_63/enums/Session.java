package omi.euronext.optiq.dropcopygateway.sbe.v6_63.enums;

import java.util.Optional;

/**
 * session
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum Session {

    /**
     * Session_0
     */
    SESSION_0((short) 0, "Session_0"),

    /**
     * Session_1
     */
    SESSION_1((short) 1, "Session_1"),

    /**
     * Session_2
     */
    SESSION_2((short) 2, "Session_2"),

    /**
     * Session_3
     */
    SESSION_3((short) 3, "Session_3"),

    /**
     * Session_4
     */
    SESSION_4((short) 4, "Session_4"),

    /**
     * Session_5
     */
    SESSION_5((short) 5, "Session_5"),

    /**
     * Session_6
     */
    SESSION_6((short) 6, "Session_6"),

    /**
     * Session_7
     */
    SESSION_7((short) 7, "Session_7"),

    /**
     * Session_8
     */
    SESSION_8((short) 8, "Session_8"),

    /**
     * Session_9
     */
    SESSION_9((short) 9, "Session_9");

    private final short wire;

    private final String description;

    Session(short wire, String description) {
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
    public static Optional<Session> fromWire(short wire) {
        return switch (wire) {
            case 0 -> Optional.of(SESSION_0);
            case 1 -> Optional.of(SESSION_1);
            case 2 -> Optional.of(SESSION_2);
            case 3 -> Optional.of(SESSION_3);
            case 4 -> Optional.of(SESSION_4);
            case 5 -> Optional.of(SESSION_5);
            case 6 -> Optional.of(SESSION_6);
            case 7 -> Optional.of(SESSION_7);
            case 8 -> Optional.of(SESSION_8);
            case 9 -> Optional.of(SESSION_9);
            default -> Optional.empty();
        };
    }
}
