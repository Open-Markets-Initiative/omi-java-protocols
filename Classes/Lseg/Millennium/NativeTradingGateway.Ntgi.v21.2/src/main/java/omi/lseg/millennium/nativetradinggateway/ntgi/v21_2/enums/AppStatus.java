package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.enums;

import java.util.Optional;

/**
 * Defines the AppStatus values.
 *
 * <p>Backed by short. Values correspond to the wire integer encoding.</p>
 */
public enum AppStatus {

    /**
     * Recovery Service Resumed
     */
    RECOVERY_SERVICE_RESUMED((short) 1, "Recovery Service Resumed"),

    /**
     * Recovery Service Not Available
     */
    RECOVERY_SERVICE_NOT_AVAILABLE((short) 2, "Recovery Service Not Available"),

    /**
     * Realtime Channel To Indicate Service Non Availability Of A Partition Due To Order Cache Outage
     */
    REALTIME_CHANNEL_TO_INDICATE_SERVICE_NON_AVAILABILITY_OF_A_PARTITION_DUE_TO_ORDER_CACHE_OUTAGE((short) 3, "Realtime Channel To Indicate Service Non Availability Of A Partition Due To Order Cache Outage");

    private final short wire;

    private final String description;

    AppStatus(short wire, String description) {
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
    public static Optional<AppStatus> fromWire(short wire) {
        return switch (wire) {
            case 1 -> Optional.of(RECOVERY_SERVICE_RESUMED);
            case 2 -> Optional.of(RECOVERY_SERVICE_NOT_AVAILABLE);
            case 3 -> Optional.of(REALTIME_CHANNEL_TO_INDICATE_SERVICE_NON_AVAILABILITY_OF_A_PARTITION_DUE_TO_ORDER_CACHE_OUTAGE);
            default -> Optional.empty();
        };
    }
}
