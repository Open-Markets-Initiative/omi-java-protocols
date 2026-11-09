package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.AccountField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.ClearingBusinessDateField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.ContraryInstructionIndicatorField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.EnteringTraderField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.LongQtyField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.PosReqIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.PosTransTypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.SecurityIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.SenderLocationField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.fields.ThresholdAmountField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.structs.DeskId;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.structs.InboundBusinessHeader;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.structs.Memo;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.types.Message;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_0.types.PrintOptions;

/**
 * Represents the PositionMaintenanceRequestMessage message from the BinaryEntryPoint protocol.
 *
 * <p>PositionMaintenanceRequestMessage</p>
 */
public final class PositionMaintenanceRequestMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 75;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Position Maintenance Request Message";

    /**
     * posReqID
     */
    private final PosReqIdField posReqId = new PosReqIdField();

    /**
     * securityID
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * thresholdAmount
     */
    private final ThresholdAmountField thresholdAmount = new ThresholdAmountField();

    /**
     * account
     */
    private final AccountField account = new AccountField();

    /**
     * senderLocation
     */
    private final SenderLocationField senderLocation = new SenderLocationField();

    /**
     * posTransType
     */
    private final PosTransTypeField posTransType = new PosTransTypeField();

    /**
     * clearingBusinessDate
     */
    private final ClearingBusinessDateField clearingBusinessDate = new ClearingBusinessDateField();

    /**
     * contraryInstructionIndicator
     */
    private final ContraryInstructionIndicatorField contraryInstructionIndicator = new ContraryInstructionIndicatorField();

    /**
     * enteringTrader
     */
    private final EnteringTraderField enteringTrader = new EnteringTraderField();

    /**
     * longQty
     */
    private final LongQtyField longQty = new LongQtyField();

    /**
     * InboundBusinessHeader
     */
    private final InboundBusinessHeader inboundBusinessHeader = new InboundBusinessHeader();

    /**
     * deskID data struct
     */
    private final DeskId deskId = new DeskId();

    /**
     * memo data struct
     */
    private final Memo memo = new Memo();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(inboundBusinessHeader.fields(), List.<Field>of(posReqId), List.<Field>of(securityId), List.<Field>of(thresholdAmount), List.<Field>of(account), List.<Field>of(senderLocation), List.<Field>of(posTransType), List.<Field>of(clearingBusinessDate), List.<Field>of(contraryInstructionIndicator), List.<Field>of(enteringTrader), List.<Field>of(longQty), deskId.fields(), memo.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * posReqID
     *
     * @return the PosReqId field
     */
    public PosReqIdField posReqId() {
        return posReqId;
    }

    /**
     * securityID
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * thresholdAmount
     *
     * @return the ThresholdAmount field
     */
    public ThresholdAmountField thresholdAmount() {
        return thresholdAmount;
    }

    /**
     * account
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * senderLocation
     *
     * @return the SenderLocation field
     */
    public SenderLocationField senderLocation() {
        return senderLocation;
    }

    /**
     * posTransType
     *
     * @return the PosTransType field
     */
    public PosTransTypeField posTransType() {
        return posTransType;
    }

    /**
     * clearingBusinessDate
     *
     * @return the ClearingBusinessDate field
     */
    public ClearingBusinessDateField clearingBusinessDate() {
        return clearingBusinessDate;
    }

    /**
     * contraryInstructionIndicator
     *
     * @return the ContraryInstructionIndicator field
     */
    public ContraryInstructionIndicatorField contraryInstructionIndicator() {
        return contraryInstructionIndicator;
    }

    /**
     * enteringTrader
     *
     * @return the EnteringTrader field
     */
    public EnteringTraderField enteringTrader() {
        return enteringTrader;
    }

    /**
     * longQty
     *
     * @return the LongQty field
     */
    public LongQtyField longQty() {
        return longQty;
    }

    /**
     * InboundBusinessHeader
     *
     * @return the InboundBusinessHeader record
     */
    public InboundBusinessHeader inboundBusinessHeader() {
        return inboundBusinessHeader;
    }

    /**
     * deskID data struct
     *
     * @return the DeskId record
     */
    public DeskId deskId() {
        return deskId;
    }

    /**
     * memo data struct
     *
     * @return the Memo record
     */
    public Memo memo() {
        return memo;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + deskId.byteLength() - DeskId.MINIMUM_BYTE_LENGTH + memo.byteLength() - Memo.MINIMUM_BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        for (int[] run = InboundBusinessHeader.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += InboundBusinessHeader.BYTE_LENGTH;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 10;
        cursor += 1;
        cursor += 2;
        cursor += 1;
        cursor += 5;
        cursor += 8;
        cursor = deskId.padding(runs, cursor);
        cursor = memo.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(inboundBusinessHeader.sendingTime().value());
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!inboundBusinessHeader.parseFrom(data, cursor, end - 57)) {
            return false;
        }
        cursor += inboundBusinessHeader.byteLength();
        if (!posReqId.parse(data, cursor)) {
            return false;
        }
        cursor += PosReqIdField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!thresholdAmount.parse(data, cursor)) {
            return false;
        }
        cursor += ThresholdAmountField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!senderLocation.parse(data, cursor)) {
            return false;
        }
        cursor += SenderLocationField.BYTE_LENGTH;
        if (!posTransType.parse(data, cursor)) {
            return false;
        }
        cursor += PosTransTypeField.BYTE_LENGTH;
        if (!clearingBusinessDate.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingBusinessDateField.BYTE_LENGTH;
        if (!contraryInstructionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ContraryInstructionIndicatorField.BYTE_LENGTH;
        if (!enteringTrader.parse(data, cursor)) {
            return false;
        }
        cursor += EnteringTraderField.BYTE_LENGTH;
        if (!longQty.parse(data, cursor)) {
            return false;
        }
        cursor += LongQtyField.BYTE_LENGTH;
        if (!deskId.parseFrom(data, cursor, end - 1)) {
            return false;
        }
        cursor += deskId.byteLength();
        if (end - cursor < 1) {
            return false;
        }
        if (!memo.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += memo.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = inboundBusinessHeader.encode(data, cursor);
        cursor = posReqId.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = thresholdAmount.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = senderLocation.encode(data, cursor);
        cursor = posTransType.encode(data, cursor);
        cursor = clearingBusinessDate.encode(data, cursor);
        cursor = contraryInstructionIndicator.encode(data, cursor);
        cursor = enteringTrader.encode(data, cursor);
        cursor = longQty.encode(data, cursor);
        cursor = deskId.encode(data, cursor);
        cursor = memo.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        inboundBusinessHeader.clear();
        deskId.clear();
        memo.clear();
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
            if (field != deskId.deskIdLength() && field != memo.memoLength() && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != deskId.deskIdLength() && field != memo.memoLength() && !field.isValid()) {
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
            case "PosReqId" -> Optional.of(posReqId);
            case "SecurityId" -> Optional.of(securityId);
            case "ThresholdAmount" -> Optional.of(thresholdAmount);
            case "Account" -> Optional.of(account);
            case "SenderLocation" -> Optional.of(senderLocation);
            case "PosTransType" -> Optional.of(posTransType);
            case "ClearingBusinessDate" -> Optional.of(clearingBusinessDate);
            case "ContraryInstructionIndicator" -> Optional.of(contraryInstructionIndicator);
            case "EnteringTrader" -> Optional.of(enteringTrader);
            case "LongQty" -> Optional.of(longQty);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof PositionMaintenanceRequestMessage message)) {
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
        if (!(other instanceof PositionMaintenanceRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
