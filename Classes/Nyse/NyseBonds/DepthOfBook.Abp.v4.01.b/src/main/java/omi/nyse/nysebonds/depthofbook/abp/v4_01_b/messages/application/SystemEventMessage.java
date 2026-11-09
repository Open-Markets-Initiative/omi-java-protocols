package omi.nyse.nysebonds.depthofbook.abp.v4_01_b.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.CusipIsinField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.EventCodeField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.NextExpectedSequenceNumberField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.NyseBondSymbolField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.PaddingAsciiField3;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.SequenceNumberField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.SystemCodeField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.fields.TimeField;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.types.Field;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.types.Message;
import omi.nyse.nysebonds.depthofbook.abp.v4_01_b.types.PrintOptions;

/**
 * Represents the SystemEventMessage message from the DepthOfBook protocol.
 *
 * <p>Sent to indicate a special system event to an order book. The Event Code says what happened and the System Code which book is affected. Also carries the next sequence number subscribers should expect, which is generally the current one plus one but may restart at 1.</p>
 */
public final class SystemEventMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'Y';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 52;

    /**
     * This message's declared name.
     */
    public static final String NAME = "System Event Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Message creation timestamp in milliseconds since midnight.
     */
    private final TimeField time = new TimeField();

    /**
     * Message sequence number, 1 to 2147483647.
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * The sequence number that subscribers should expect next.
     */
    private final NextExpectedSequenceNumberField nextExpectedSequenceNumber = new NextExpectedSequenceNumberField();

    /**
     * What type of event has occurred.
     */
    private final EventCodeField eventCode = new EventCodeField();

    /**
     * Which order book this order belongs to.
     */
    private final SystemCodeField systemCode = new SystemCodeField();

    /**
     * A Nyse Bonds specific identity for this bond.
     */
    private final NyseBondSymbolField nyseBondSymbol = new NyseBondSymbolField();

    /**
     * Cusip or Isin for the bond. Null unless the client requested the data and holds a licence.
     */
    private final CusipIsinField cusipIsin = new CusipIsinField();

    /**
     * Not used.
     */
    private final PaddingAsciiField3 paddingAscii = new PaddingAsciiField3();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(time, sequenceNumber, nextExpectedSequenceNumber, eventCode, systemCode, nyseBondSymbol, cusipIsin, paddingAscii);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Message creation timestamp in milliseconds since midnight.
     *
     * @return the Time field
     */
    public TimeField time() {
        return time;
    }

    /**
     * Message sequence number, 1 to 2147483647.
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * The sequence number that subscribers should expect next.
     *
     * @return the NextExpectedSequenceNumber field
     */
    public NextExpectedSequenceNumberField nextExpectedSequenceNumber() {
        return nextExpectedSequenceNumber;
    }

    /**
     * What type of event has occurred.
     *
     * @return the EventCode field
     */
    public EventCodeField eventCode() {
        return eventCode;
    }

    /**
     * Which order book this order belongs to.
     *
     * @return the SystemCode field
     */
    public SystemCodeField systemCode() {
        return systemCode;
    }

    /**
     * A Nyse Bonds specific identity for this bond.
     *
     * @return the NyseBondSymbol field
     */
    public NyseBondSymbolField nyseBondSymbol() {
        return nyseBondSymbol;
    }

    /**
     * Cusip or Isin for the bond. Null unless the client requested the data and holds a licence.
     *
     * @return the CusipIsin field
     */
    public CusipIsinField cusipIsin() {
        return cusipIsin;
    }

    /**
     * Not used.
     *
     * @return the PaddingAscii field
     */
    public PaddingAsciiField3 paddingAscii() {
        return paddingAscii;
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
        return PADDING.clone();
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
        if (!time.parse(data, cursor)) {
            return false;
        }
        cursor += TimeField.BYTE_LENGTH;
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!nextExpectedSequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += NextExpectedSequenceNumberField.BYTE_LENGTH;
        if (!eventCode.parse(data, cursor)) {
            return false;
        }
        cursor += EventCodeField.BYTE_LENGTH;
        if (!systemCode.parse(data, cursor)) {
            return false;
        }
        cursor += SystemCodeField.BYTE_LENGTH;
        if (!nyseBondSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += NyseBondSymbolField.BYTE_LENGTH;
        if (!cusipIsin.parse(data, cursor)) {
            return false;
        }
        cursor += CusipIsinField.BYTE_LENGTH;
        if (!paddingAscii.parse(data, cursor)) {
            return false;
        }
        cursor += PaddingAsciiField3.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = time.encode(data, cursor);
        cursor = sequenceNumber.encode(data, cursor);
        cursor = nextExpectedSequenceNumber.encode(data, cursor);
        cursor = eventCode.encode(data, cursor);
        cursor = systemCode.encode(data, cursor);
        cursor = nyseBondSymbol.encode(data, cursor);
        cursor = cusipIsin.encode(data, cursor);
        cursor = paddingAscii.encode(data, cursor);
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
            case "Time" -> Optional.of(time);
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "NextExpectedSequenceNumber" -> Optional.of(nextExpectedSequenceNumber);
            case "EventCode" -> Optional.of(eventCode);
            case "SystemCode" -> Optional.of(systemCode);
            case "NyseBondSymbol" -> Optional.of(nyseBondSymbol);
            case "CusipIsin" -> Optional.of(cusipIsin);
            case "PaddingAscii" -> Optional.of(paddingAscii);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SystemEventMessage message)) {
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
        if (!(other instanceof SystemEventMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
