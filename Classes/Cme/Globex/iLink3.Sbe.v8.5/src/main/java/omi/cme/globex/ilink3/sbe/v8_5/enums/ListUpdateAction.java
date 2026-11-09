package omi.cme.globex.ilink3.sbe.v8_5.enums;

import java.util.Optional;

/**
 * Indicates if all of the information sent in this message with a unique new PartyDetailsListRequestID is a new addition or deletion of existing information associated with an existing PartyDetailsListRequestID. For PartyDetailsListRequestID=FFFFFFFF this should always be set to "A"
 *
 * <p>Each value corresponds to the ASCII character used as the wire discriminator.</p>
 */
public enum ListUpdateAction {

    /**
     * Add
     */
    ADD('A', "Add"),

    /**
     * Delete
     */
    DELETE('D', "Delete");

    private final char wire;

    private final String description;

    ListUpdateAction(char wire, String description) {
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
    public static Optional<ListUpdateAction> fromWire(char wire) {
        return switch (wire) {
            case 'A' -> Optional.of(ADD);
            case 'D' -> Optional.of(DELETE);
            default -> Optional.empty();
        };
    }
}
