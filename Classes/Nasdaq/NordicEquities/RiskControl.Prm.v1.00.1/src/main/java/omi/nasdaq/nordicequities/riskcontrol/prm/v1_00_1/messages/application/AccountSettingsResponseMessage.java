package omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.BlockAndCancelField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.InAuctionFatFingerProtectionField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.InAuctionMarketOrderPreventionField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.InAuctionMarketOrderProtectionField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.PrmAccountField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.RepeatedOrderGenerationField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.TriggerRestrictSymbolOnRepeatedOrderGenerationField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.fields.UserRefNumField;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.types.Field;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.types.Message;
import omi.nasdaq.nordicequities.riskcontrol.prm.v1_00_1.types.PrintOptions;

/**
 * Represents the AccountSettingsResponseMessage message from the RiskControl protocol.
 *
 * <p>Indicates that the settings for a given PRM Account have been updated</p>
 */
public final class AccountSettingsResponseMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'C';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 19;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Account Settings Response Message";

    /**
     * A unique sequential number starting from 1 at start of day
     */
    private final UserRefNumField userRefNum = new UserRefNumField();

    /**
     * PRM Account in which the settings apply
     */
    private final PrmAccountField prmAccount = new PrmAccountField();

    /**
     * Maximum allowed number of consecutive identical orders, previous value kept if -1
     */
    private final RepeatedOrderGenerationField repeatedOrderGeneration = new RepeatedOrderGenerationField();

    /**
     * Restrict symbol when order repetition limit is breached, previous value kept if ?
     */
    private final TriggerRestrictSymbolOnRepeatedOrderGenerationField triggerRestrictSymbolOnRepeatedOrderGeneration = new TriggerRestrictSymbolOnRepeatedOrderGenerationField();

    /**
     * Enable market order prevention, previous value kept if ?
     */
    private final InAuctionMarketOrderPreventionField inAuctionMarketOrderPrevention = new InAuctionMarketOrderPreventionField();

    /**
     * Enable fat finger protection, previous value kept if ?
     */
    private final InAuctionFatFingerProtectionField inAuctionFatFingerProtection = new InAuctionFatFingerProtectionField();

    /**
     * Enable market order protection, previous value kept if ?
     */
    private final InAuctionMarketOrderProtectionField inAuctionMarketOrderProtection = new InAuctionMarketOrderProtectionField();

    /**
     * Block, unblock or cancel open orders of this PRM Account, previous value kept if ?
     */
    private final BlockAndCancelField blockAndCancel = new BlockAndCancelField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(userRefNum, prmAccount, repeatedOrderGeneration, triggerRestrictSymbolOnRepeatedOrderGeneration, inAuctionMarketOrderPrevention, inAuctionFatFingerProtection, inAuctionMarketOrderProtection, blockAndCancel);

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
     * Maximum allowed number of consecutive identical orders, previous value kept if -1
     *
     * @return the RepeatedOrderGeneration field
     */
    public RepeatedOrderGenerationField repeatedOrderGeneration() {
        return repeatedOrderGeneration;
    }

    /**
     * Restrict symbol when order repetition limit is breached, previous value kept if ?
     *
     * @return the TriggerRestrictSymbolOnRepeatedOrderGeneration field
     */
    public TriggerRestrictSymbolOnRepeatedOrderGenerationField triggerRestrictSymbolOnRepeatedOrderGeneration() {
        return triggerRestrictSymbolOnRepeatedOrderGeneration;
    }

    /**
     * Enable market order prevention, previous value kept if ?
     *
     * @return the InAuctionMarketOrderPrevention field
     */
    public InAuctionMarketOrderPreventionField inAuctionMarketOrderPrevention() {
        return inAuctionMarketOrderPrevention;
    }

    /**
     * Enable fat finger protection, previous value kept if ?
     *
     * @return the InAuctionFatFingerProtection field
     */
    public InAuctionFatFingerProtectionField inAuctionFatFingerProtection() {
        return inAuctionFatFingerProtection;
    }

    /**
     * Enable market order protection, previous value kept if ?
     *
     * @return the InAuctionMarketOrderProtection field
     */
    public InAuctionMarketOrderProtectionField inAuctionMarketOrderProtection() {
        return inAuctionMarketOrderProtection;
    }

    /**
     * Block, unblock or cancel open orders of this PRM Account, previous value kept if ?
     *
     * @return the BlockAndCancel field
     */
    public BlockAndCancelField blockAndCancel() {
        return blockAndCancel;
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
        if (!repeatedOrderGeneration.parse(data, cursor)) {
            return false;
        }
        cursor += RepeatedOrderGenerationField.BYTE_LENGTH;
        if (!triggerRestrictSymbolOnRepeatedOrderGeneration.parse(data, cursor)) {
            return false;
        }
        cursor += TriggerRestrictSymbolOnRepeatedOrderGenerationField.BYTE_LENGTH;
        if (!inAuctionMarketOrderPrevention.parse(data, cursor)) {
            return false;
        }
        cursor += InAuctionMarketOrderPreventionField.BYTE_LENGTH;
        if (!inAuctionFatFingerProtection.parse(data, cursor)) {
            return false;
        }
        cursor += InAuctionFatFingerProtectionField.BYTE_LENGTH;
        if (!inAuctionMarketOrderProtection.parse(data, cursor)) {
            return false;
        }
        cursor += InAuctionMarketOrderProtectionField.BYTE_LENGTH;
        return blockAndCancel.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = userRefNum.encode(data, cursor);
        cursor = prmAccount.encode(data, cursor);
        cursor = repeatedOrderGeneration.encode(data, cursor);
        cursor = triggerRestrictSymbolOnRepeatedOrderGeneration.encode(data, cursor);
        cursor = inAuctionMarketOrderPrevention.encode(data, cursor);
        cursor = inAuctionFatFingerProtection.encode(data, cursor);
        cursor = inAuctionMarketOrderProtection.encode(data, cursor);
        cursor = blockAndCancel.encode(data, cursor);
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
            case "RepeatedOrderGeneration" -> Optional.of(repeatedOrderGeneration);
            case "TriggerRestrictSymbolOnRepeatedOrderGeneration" -> Optional.of(triggerRestrictSymbolOnRepeatedOrderGeneration);
            case "InAuctionMarketOrderPrevention" -> Optional.of(inAuctionMarketOrderPrevention);
            case "InAuctionFatFingerProtection" -> Optional.of(inAuctionFatFingerProtection);
            case "InAuctionMarketOrderProtection" -> Optional.of(inAuctionMarketOrderProtection);
            case "BlockAndCancel" -> Optional.of(blockAndCancel);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof AccountSettingsResponseMessage message)) {
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
        if (!(other instanceof AccountSettingsResponseMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
