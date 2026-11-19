package omi.eurex.t7.xti.fbe.v8_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.xti.fbe.v8_0.fields.MarketSegmentIdField;
import omi.eurex.t7.xti.fbe.v8_0.fields.NetworkMsgIdField;
import omi.eurex.t7.xti.fbe.v8_0.fields.NoEventsField;
import omi.eurex.t7.xti.fbe.v8_0.fields.SecurityIdField;
import omi.eurex.t7.xti.fbe.v8_0.fields.SecurityStatusField;
import omi.eurex.t7.xti.fbe.v8_0.fields.SoldOutIndicatorField;
import omi.eurex.t7.xti.fbe.v8_0.fields.TransactTimeField;
import omi.eurex.t7.xti.fbe.v8_0.groups.SecurityStatusEventGrpCompEntry;
import omi.eurex.t7.xti.fbe.v8_0.groups.SecurityStatusEventGrpCompList;
import omi.eurex.t7.xti.fbe.v8_0.structs.RequestHeaderComp;
import omi.eurex.t7.xti.fbe.v8_0.types.Field;
import omi.eurex.t7.xti.fbe.v8_0.types.Message;
import omi.eurex.t7.xti.fbe.v8_0.types.PrintOptions;

/**
 * Represents the IssuerSecurityStateChangeRequest message from the Xti protocol.
 */
public final class IssuerSecurityStateChangeRequest implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 42;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Issuer Security State Change Request";

    /**
     * Network Msg Id
     */
    private final NetworkMsgIdField networkMsgId = new NetworkMsgIdField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Transact Time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * No Events
     */
    private final NoEventsField noEvents = new NoEventsField();

    /**
     * Security Status
     */
    private final SecurityStatusField securityStatus = new SecurityStatusField();

    /**
     * Sold Out Indicator
     */
    private final SoldOutIndicatorField soldOutIndicator = new SoldOutIndicatorField();

    /**
     * Security Status Event Grp Comp
     */
    private final SecurityStatusEventGrpCompList securityStatusEventGrpComp = new SecurityStatusEventGrpCompList();

    /**
     * Request Header Comp
     */
    private final RequestHeaderComp requestHeaderComp = new RequestHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(networkMsgId), requestHeaderComp.fields(), List.<Field>of(securityId), List.<Field>of(transactTime), List.<Field>of(marketSegmentId), List.<Field>of(noEvents), List.<Field>of(securityStatus), List.<Field>of(soldOutIndicator)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Network Msg Id
     *
     * @return the NetworkMsgId field
     */
    public NetworkMsgIdField networkMsgId() {
        return networkMsgId;
    }

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Transact Time
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Market Segment Id
     *
     * @return the MarketSegmentId field
     */
    public MarketSegmentIdField marketSegmentId() {
        return marketSegmentId;
    }

    /**
     * No Events
     *
     * @return the NoEvents field
     */
    public NoEventsField noEvents() {
        return noEvents;
    }

    /**
     * Security Status
     *
     * @return the SecurityStatus field
     */
    public SecurityStatusField securityStatus() {
        return securityStatus;
    }

    /**
     * Sold Out Indicator
     *
     * @return the SoldOutIndicator field
     */
    public SoldOutIndicatorField soldOutIndicator() {
        return soldOutIndicator;
    }

    /**
     * Security Status Event Grp Comp
     *
     * <p>Encode writes this list's size to the NoEvents field.</p>
     *
     * @return the SecurityStatusEventGrpComp entries
     */
    public SecurityStatusEventGrpCompList securityStatusEventGrpComp() {
        return securityStatusEventGrpComp;
    }

    /**
     * Request Header Comp
     *
     * @return the RequestHeaderComp record
     */
    public RequestHeaderComp requestHeaderComp() {
        return requestHeaderComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + securityStatusEventGrpComp.byteLength();
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
        cursor += 8;
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = RequestHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += RequestHeaderComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 8;
        cursor += 4;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor = securityStatusEventGrpComp.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(transactTime.value());
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
        if (!networkMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += NetworkMsgIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!requestHeaderComp.parseFrom(data, cursor, end - 24)) {
            return false;
        }
        cursor += requestHeaderComp.byteLength();
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!noEvents.parse(data, cursor)) {
            return false;
        }
        cursor += NoEventsField.BYTE_LENGTH;
        if (!securityStatus.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityStatusField.BYTE_LENGTH;
        if (!soldOutIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += SoldOutIndicatorField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!securityStatusEventGrpComp.parse(data, cursor, end, noEvents.value())) {
            return false;
        }
        cursor += securityStatusEventGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (securityStatusEventGrpComp.size() > 255) {
            throw new IllegalStateException("securityStatusEventGrpComp holds " + securityStatusEventGrpComp.size() + " entries, more than its count field can state");
        }
        noEvents.value((short) securityStatusEventGrpComp.size());
        int cursor = offset;
        cursor = networkMsgId.encode(data, cursor);
        if (buffer != null && buffer.length >= 10) {
            System.arraycopy(buffer, 8, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = requestHeaderComp.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = noEvents.encode(data, cursor);
        cursor = securityStatus.encode(data, cursor);
        cursor = soldOutIndicator.encode(data, cursor);
        if (buffer != null && buffer.length >= 42) {
            System.arraycopy(buffer, 41, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = securityStatusEventGrpComp.encode(data, cursor);
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
        requestHeaderComp.clear();
        securityStatusEventGrpComp.clear();
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
            if (field != noEvents && !field.isRecognized()) {
                return false;
            }
        }
        return securityStatusEventGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noEvents && !field.isValid()) {
                return false;
            }
        }
        if (!securityStatusEventGrpComp.isValid()) {
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
        if (!networkMsgId.isDecoded()) {
            return Optional.of(networkMsgId);
        }
        if (!requestHeaderComp.isDecoded()) {
            return requestHeaderComp.failedAt();
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!transactTime.isDecoded()) {
            return Optional.of(transactTime);
        }
        if (!marketSegmentId.isDecoded()) {
            return Optional.of(marketSegmentId);
        }
        if (!noEvents.isDecoded()) {
            return Optional.of(noEvents);
        }
        if (!securityStatus.isDecoded()) {
            return Optional.of(securityStatus);
        }
        if (!soldOutIndicator.isDecoded()) {
            return Optional.of(soldOutIndicator);
        }
        if (!securityStatusEventGrpComp.isDecoded()) {
            return Optional.of(securityStatusEventGrpComp.failedEntry().flatMap(SecurityStatusEventGrpCompEntry::failedAt).orElse(noEvents));
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
            case "NetworkMsgId" -> Optional.of(networkMsgId);
            case "SecurityId" -> Optional.of(securityId);
            case "TransactTime" -> Optional.of(transactTime);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "NoEvents" -> Optional.of(noEvents);
            case "SecurityStatus" -> Optional.of(securityStatus);
            case "SoldOutIndicator" -> Optional.of(soldOutIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof IssuerSecurityStateChangeRequest message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(securityStatusEventGrpComp.diffFields(message.securityStatusEventGrpComp));
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
            securityStatusEventGrpComp.toFormattedString(builder, options);
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
        securityStatusEventGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof IssuerSecurityStateChangeRequest message)) {
            return false;
        }
        return fields.equals(message.fields) && securityStatusEventGrpComp.equals(message.securityStatusEventGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, securityStatusEventGrpComp);
    }
}
