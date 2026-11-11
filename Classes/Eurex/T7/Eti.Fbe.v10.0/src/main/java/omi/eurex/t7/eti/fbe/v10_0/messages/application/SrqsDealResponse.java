package omi.eurex.t7.eti.fbe.v10_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.eurex.t7.eti.fbe.v10_0.fields.FirmNegotiationIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.FirmTradeIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NegotiationIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.NoSrqsQuoteGrpsField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SecondaryTradeIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.SecurityIdField;
import omi.eurex.t7.eti.fbe.v10_0.fields.TradeIdField;
import omi.eurex.t7.eti.fbe.v10_0.groups.SrqsQuoteGrpCompEntry;
import omi.eurex.t7.eti.fbe.v10_0.groups.SrqsQuoteGrpCompList;
import omi.eurex.t7.eti.fbe.v10_0.structs.ResponseHeaderComp;
import omi.eurex.t7.eti.fbe.v10_0.types.Field;
import omi.eurex.t7.eti.fbe.v10_0.types.Message;
import omi.eurex.t7.eti.fbe.v10_0.types.PrintOptions;

/**
 * Represents the SrqsDealResponse message from the Eti protocol.
 */
public final class SrqsDealResponse implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 90;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Srqs Deal Response";

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Negotiation Id
     */
    private final NegotiationIdField negotiationId = new NegotiationIdField();

    /**
     * Trade Id
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Secondary Trade Id
     */
    private final SecondaryTradeIdField secondaryTradeId = new SecondaryTradeIdField();

    /**
     * No Srqs Quote Grps
     */
    private final NoSrqsQuoteGrpsField noSrqsQuoteGrps = new NoSrqsQuoteGrpsField();

    /**
     * Firm Trade Id
     */
    private final FirmTradeIdField firmTradeId = new FirmTradeIdField();

    /**
     * Firm Negotiation Id
     */
    private final FirmNegotiationIdField firmNegotiationId = new FirmNegotiationIdField();

    /**
     * Srqs Quote Grp Comp
     */
    private final SrqsQuoteGrpCompList srqsQuoteGrpComp = new SrqsQuoteGrpCompList();

    /**
     * Response Header Comp
     */
    private final ResponseHeaderComp responseHeaderComp = new ResponseHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(responseHeaderComp.fields(), List.<Field>of(securityId), List.<Field>of(negotiationId), List.<Field>of(tradeId), List.<Field>of(secondaryTradeId), List.<Field>of(noSrqsQuoteGrps), List.<Field>of(firmTradeId), List.<Field>of(firmNegotiationId)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
    }

    /**
     * Negotiation Id
     *
     * @return the NegotiationId field
     */
    public NegotiationIdField negotiationId() {
        return negotiationId;
    }

    /**
     * Trade Id
     *
     * @return the TradeId field
     */
    public TradeIdField tradeId() {
        return tradeId;
    }

    /**
     * Secondary Trade Id
     *
     * @return the SecondaryTradeId field
     */
    public SecondaryTradeIdField secondaryTradeId() {
        return secondaryTradeId;
    }

    /**
     * No Srqs Quote Grps
     *
     * @return the NoSrqsQuoteGrps field
     */
    public NoSrqsQuoteGrpsField noSrqsQuoteGrps() {
        return noSrqsQuoteGrps;
    }

    /**
     * Firm Trade Id
     *
     * @return the FirmTradeId field
     */
    public FirmTradeIdField firmTradeId() {
        return firmTradeId;
    }

    /**
     * Firm Negotiation Id
     *
     * @return the FirmNegotiationId field
     */
    public FirmNegotiationIdField firmNegotiationId() {
        return firmNegotiationId;
    }

    /**
     * Srqs Quote Grp Comp
     *
     * <p>Encode writes this list's size to the NoSrqsQuoteGrps field.</p>
     *
     * @return the SrqsQuoteGrpComp entries
     */
    public SrqsQuoteGrpCompList srqsQuoteGrpComp() {
        return srqsQuoteGrpComp;
    }

    /**
     * Response Header Comp
     *
     * @return the ResponseHeaderComp record
     */
    public ResponseHeaderComp responseHeaderComp() {
        return responseHeaderComp;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + srqsQuoteGrpComp.byteLength();
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
        runs.add(cursor).add(2);
        cursor += 2;
        for (int[] run = ResponseHeaderComp.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += ResponseHeaderComp.BYTE_LENGTH;
        cursor += 8;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 1;
        cursor += 20;
        cursor += 20;
        runs.add(cursor).add(3);
        cursor += 3;
        cursor += srqsQuoteGrpComp.byteLength();
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(responseHeaderComp.requestTime().value());
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
        cursor += 2; // padding
        if (!responseHeaderComp.parseFrom(data, cursor, end - 64)) {
            return false;
        }
        cursor += responseHeaderComp.byteLength();
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!negotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += NegotiationIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!secondaryTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += SecondaryTradeIdField.BYTE_LENGTH;
        if (!noSrqsQuoteGrps.parse(data, cursor)) {
            return false;
        }
        cursor += NoSrqsQuoteGrpsField.BYTE_LENGTH;
        if (!firmTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmTradeIdField.BYTE_LENGTH;
        if (!firmNegotiationId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmNegotiationIdField.BYTE_LENGTH;
        cursor += 3; // padding
        if (!srqsQuoteGrpComp.parse(data, cursor, end, noSrqsQuoteGrps.value())) {
            return false;
        }
        cursor += srqsQuoteGrpComp.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (srqsQuoteGrpComp.size() > 255) {
            throw new IllegalStateException("srqsQuoteGrpComp holds " + srqsQuoteGrpComp.size() + " entries, more than its count field can state");
        }
        noSrqsQuoteGrps.value((short) srqsQuoteGrpComp.size());
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = responseHeaderComp.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = negotiationId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = secondaryTradeId.encode(data, cursor);
        cursor = noSrqsQuoteGrps.encode(data, cursor);
        cursor = firmTradeId.encode(data, cursor);
        cursor = firmNegotiationId.encode(data, cursor);
        if (buffer != null && buffer.length >= 90) {
            System.arraycopy(buffer, 87, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
        cursor = srqsQuoteGrpComp.encode(data, cursor);
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
        responseHeaderComp.clear();
        srqsQuoteGrpComp.clear();
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
            if (field != noSrqsQuoteGrps && !field.isRecognized()) {
                return false;
            }
        }
        return srqsQuoteGrpComp.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != noSrqsQuoteGrps && !field.isValid()) {
                return false;
            }
        }
        if (!srqsQuoteGrpComp.isValid()) {
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
        if (!responseHeaderComp.isDecoded()) {
            return responseHeaderComp.failedAt();
        }
        if (!securityId.isDecoded()) {
            return Optional.of(securityId);
        }
        if (!negotiationId.isDecoded()) {
            return Optional.of(negotiationId);
        }
        if (!tradeId.isDecoded()) {
            return Optional.of(tradeId);
        }
        if (!secondaryTradeId.isDecoded()) {
            return Optional.of(secondaryTradeId);
        }
        if (!noSrqsQuoteGrps.isDecoded()) {
            return Optional.of(noSrqsQuoteGrps);
        }
        if (!firmTradeId.isDecoded()) {
            return Optional.of(firmTradeId);
        }
        if (!firmNegotiationId.isDecoded()) {
            return Optional.of(firmNegotiationId);
        }
        if (!srqsQuoteGrpComp.isDecoded()) {
            return Optional.of(srqsQuoteGrpComp.failedEntry().flatMap(SrqsQuoteGrpCompEntry::failedAt).orElse(noSrqsQuoteGrps));
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
            case "SecurityId" -> Optional.of(securityId);
            case "NegotiationId" -> Optional.of(negotiationId);
            case "TradeId" -> Optional.of(tradeId);
            case "SecondaryTradeId" -> Optional.of(secondaryTradeId);
            case "NoSrqsQuoteGrps" -> Optional.of(noSrqsQuoteGrps);
            case "FirmTradeId" -> Optional.of(firmTradeId);
            case "FirmNegotiationId" -> Optional.of(firmNegotiationId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SrqsDealResponse message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(srqsQuoteGrpComp.diffFields(message.srqsQuoteGrpComp));
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
            srqsQuoteGrpComp.toFormattedString(builder, options);
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
        srqsQuoteGrpComp.toFormattedString(builder, nested);
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
        if (!(other instanceof SrqsDealResponse message)) {
            return false;
        }
        return fields.equals(message.fields) && srqsQuoteGrpComp.equals(message.srqsQuoteGrpComp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, srqsQuoteGrpComp);
    }
}
