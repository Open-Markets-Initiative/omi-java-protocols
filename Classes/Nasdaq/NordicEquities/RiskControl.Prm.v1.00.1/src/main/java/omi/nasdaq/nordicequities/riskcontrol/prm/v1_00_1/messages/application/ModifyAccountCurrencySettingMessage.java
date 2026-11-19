package omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.BlowThroughProtectionField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.CurrencyField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.PrmAccountField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.RejectAllFlagField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.UserRefNumField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.types.Field;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.types.Message;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.types.PrintOptions;

/**
 * Represents the ModifyAccountCurrencySettingMessage message from the RiskControl protocol.
 *
 * <p>Updates the settings for a given PRM Account's currency</p>
 */
public final class ModifyAccountCurrencySettingMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'F';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 15;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Modify Account Currency Setting Message";

    /**
     * A unique sequential number starting from 1 at start of day
     */
    private final UserRefNumField userRefNum = new UserRefNumField();

    /**
     * PRM Account in which the settings apply
     */
    private final PrmAccountField prmAccount = new PrmAccountField();

    /**
     * Currency in which the settings apply
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Reject all orders, previous value kept if ?
     */
    private final RejectAllFlagField rejectAllFlag = new RejectAllFlagField();

    /**
     * Enable blow through protection, previous value kept if ?
     */
    private final BlowThroughProtectionField blowThroughProtection = new BlowThroughProtectionField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(userRefNum, prmAccount, currency, rejectAllFlag, blowThroughProtection);

    private byte[] buffer;

    private boolean decoded;

    /**
     * A unique sequential number starting from 1 at start of day
     *
     * @return the UserRefNum field
     */
    public UserRefNumField userRefNum() {
        return userRefNum;
    }

    /**
     * PRM Account in which the settings apply
     *
     * @return the PrmAccount field
     */
    public PrmAccountField prmAccount() {
        return prmAccount;
    }

    /**
     * Currency in which the settings apply
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
    }

    /**
     * Reject all orders, previous value kept if ?
     *
     * @return the RejectAllFlag field
     */
    public RejectAllFlagField rejectAllFlag() {
        return rejectAllFlag;
    }

    /**
     * Enable blow through protection, previous value kept if ?
     *
     * @return the BlowThroughProtection field
     */
    public BlowThroughProtectionField blowThroughProtection() {
        return blowThroughProtection;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
    }

    @Override
    public int byteLength() {
        return BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public static int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.empty();
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!userRefNum.parse(data, cursor)) {
            return false;
        }
        cursor += UserRefNumField.BYTE_LENGTH;
        if (!prmAccount.parse(data, cursor)) {
            return false;
        }
        cursor += PrmAccountField.BYTE_LENGTH;
        if (!currency.parse(data, cursor)) {
            return false;
        }
        cursor += CurrencyField.BYTE_LENGTH;
        if (!rejectAllFlag.parse(data, cursor)) {
            return false;
        }
        cursor += RejectAllFlagField.BYTE_LENGTH;
        return blowThroughProtection.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = userRefNum.encode(data, cursor);
        cursor = prmAccount.encode(data, cursor);
        cursor = currency.encode(data, cursor);
        cursor = rejectAllFlag.encode(data, cursor);
        cursor = blowThroughProtection.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[BYTE_LENGTH];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        return isRecognized();
    }

    /**
     * Returns a copy of the bytes this message was decoded from.
     *
     * <p>A failed decode leaves behind the partial range that was available, which is what a diagnostic needs to see.</p>
     *
     * @return the message bytes, or empty when no decode has been attempted
     */
    @Override
    public Optional<byte[]> raw() {
        if (buffer == null) {
            return Optional.empty();
        }
        return Optional.of(buffer.clone());
    }

    @Override
    public Optional<Field> failedAt() {
        if (buffer == null || decoded) {
            return Optional.empty();
        }
        for (Field field : fields) {
            if (!field.isDecoded()) {
                return Optional.of(field);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields;
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "UserRefNum" -> Optional.of(userRefNum);
            case "PrmAccount" -> Optional.of(prmAccount);
            case "Currency" -> Optional.of(currency);
            case "RejectAllFlag" -> Optional.of(rejectAllFlag);
            case "BlowThroughProtection" -> Optional.of(blowThroughProtection);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ModifyAccountCurrencySettingMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        return changed;
    }

    @Override
    public String toFormattedString(PrintOptions options) {
        StringBuilder builder = new StringBuilder();
        toFormattedString(builder, options);
        return builder.toString();
    }

    /**
     * Appends this message's formatted representation.
     *
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line.</p>
     *
     * @param builder the destination
     * @param options the display options
     */
    @Override
    public void toFormattedString(StringBuilder builder, PrintOptions options) {
        if (options.identifier()) {
            builder.append(NAME);
            return;
        }

        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < fields.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                fields.get(index).toFormattedString(builder, options);
            }
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : fields) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
    }

    @Override
    public String toString() {
        return toFormattedString(PrintOptions.DEFAULT);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModifyAccountCurrencySettingMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
