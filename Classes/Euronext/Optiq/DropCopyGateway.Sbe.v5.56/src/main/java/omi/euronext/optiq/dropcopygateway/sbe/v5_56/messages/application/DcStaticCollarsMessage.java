package omi.euronext.optiq.dropcopygateway.sbe.v5_56.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.ConsumeTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.EmmField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.MsgSeqNumField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.ProduceTimeField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.fields.SymbolIndexField;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.structs.DCStaticCollarsMessageStaticCollarsrepGroups;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.types.Field;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.types.Message;
import omi.euronext.optiq.dropcopygateway.sbe.v5_56.types.PrintOptions;

/**
 * Represents the DcStaticCollarsMessage message from the DropCopyGateway protocol.
 *
 * <p>DCStaticCollarsMessage</p>
 */
public final class DcStaticCollarsMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 27;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Dc Static Collars Message";

    /**
     * msgSeqNum
     */
    private final MsgSeqNumField msgSeqNum = new MsgSeqNumField();

    /**
     * produceTime
     */
    private final ProduceTimeField produceTime = new ProduceTimeField();

    /**
     * consumeTime
     */
    private final ConsumeTimeField consumeTime = new ConsumeTimeField();

    /**
     * symbolIndex
     */
    private final SymbolIndexField symbolIndex = new SymbolIndexField();

    /**
     * eMM
     */
    private final EmmField emm = new EmmField();

    /**
     * StaticCollarsrep Block
     */
    private final DCStaticCollarsMessageStaticCollarsrepGroups dCStaticCollarsMessageStaticCollarsrepGroups = new DCStaticCollarsMessageStaticCollarsrepGroups();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(msgSeqNum, produceTime, consumeTime, symbolIndex, emm);

    private byte[] buffer;

    private boolean decoded;

    /**
     * msgSeqNum
     *
     * @return the MsgSeqNum field
     */
    public MsgSeqNumField msgSeqNum() {
        return msgSeqNum;
    }

    /**
     * produceTime
     *
     * @return the ProduceTime field
     */
    public ProduceTimeField produceTime() {
        return produceTime;
    }

    /**
     * consumeTime
     *
     * @return the ConsumeTime field
     */
    public ConsumeTimeField consumeTime() {
        return consumeTime;
    }

    /**
     * symbolIndex
     *
     * @return the SymbolIndex field
     */
    public SymbolIndexField symbolIndex() {
        return symbolIndex;
    }

    /**
     * eMM
     *
     * @return the Emm field
     */
    public EmmField emm() {
        return emm;
    }

    /**
     * StaticCollarsrep Block
     *
     * @return the DCStaticCollarsMessageStaticCollarsrepGroups record
     */
    public DCStaticCollarsMessageStaticCollarsrepGroups dCStaticCollarsMessageStaticCollarsrepGroups() {
        return dCStaticCollarsMessageStaticCollarsrepGroups;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + dCStaticCollarsMessageStaticCollarsrepGroups.byteLength() - DCStaticCollarsMessageStaticCollarsrepGroups.MINIMUM_BYTE_LENGTH;
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!msgSeqNum.parse(data, cursor)) {
            return false;
        }
        cursor += MsgSeqNumField.BYTE_LENGTH;
        if (!produceTime.parse(data, cursor)) {
            return false;
        }
        cursor += ProduceTimeField.BYTE_LENGTH;
        if (!consumeTime.parse(data, cursor)) {
            return false;
        }
        cursor += ConsumeTimeField.BYTE_LENGTH;
        if (!symbolIndex.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIndexField.BYTE_LENGTH;
        if (!emm.parse(data, cursor)) {
            return false;
        }
        cursor += EmmField.BYTE_LENGTH;
        if (!dCStaticCollarsMessageStaticCollarsrepGroups.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += dCStaticCollarsMessageStaticCollarsrepGroups.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = msgSeqNum.encode(data, cursor);
        cursor = produceTime.encode(data, cursor);
        cursor = consumeTime.encode(data, cursor);
        cursor = symbolIndex.encode(data, cursor);
        cursor = emm.encode(data, cursor);
        cursor = dCStaticCollarsMessageStaticCollarsrepGroups.encode(data, cursor);
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
        dCStaticCollarsMessageStaticCollarsrepGroups.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return dCStaticCollarsMessageStaticCollarsrepGroups.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (!field.isValid()) {
                return false;
            }
        }
        if (!dCStaticCollarsMessageStaticCollarsrepGroups.isValid()) {
            return false;
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
        if (!msgSeqNum.isDecoded()) {
            return Optional.of(msgSeqNum);
        }
        if (!produceTime.isDecoded()) {
            return Optional.of(produceTime);
        }
        if (!consumeTime.isDecoded()) {
            return Optional.of(consumeTime);
        }
        if (!symbolIndex.isDecoded()) {
            return Optional.of(symbolIndex);
        }
        if (!emm.isDecoded()) {
            return Optional.of(emm);
        }
        if (!dCStaticCollarsMessageStaticCollarsrepGroups.isDecoded()) {
            return dCStaticCollarsMessageStaticCollarsrepGroups.failedAt();
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
            case "MsgSeqNum" -> Optional.of(msgSeqNum);
            case "ProduceTime" -> Optional.of(produceTime);
            case "ConsumeTime" -> Optional.of(consumeTime);
            case "SymbolIndex" -> Optional.of(symbolIndex);
            case "Emm" -> Optional.of(emm);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DcStaticCollarsMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(dCStaticCollarsMessageStaticCollarsrepGroups.diffFields(message.dCStaticCollarsMessageStaticCollarsrepGroups));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            dCStaticCollarsMessageStaticCollarsrepGroups.toFormattedString(builder, options);
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
        dCStaticCollarsMessageStaticCollarsrepGroups.toFormattedString(builder, nested);
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
        if (!(other instanceof DcStaticCollarsMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && dCStaticCollarsMessageStaticCollarsrepGroups.equals(message.dCStaticCollarsMessageStaticCollarsrepGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, dCStaticCollarsMessageStaticCollarsrepGroups);
    }
}
