package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.AssetField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.ClordidField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.MassActionRejectReasonField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.MassActionReportIdField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.MassActionResponseField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.MassActionScopeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.MassActionTypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.MassCancelRestatementReasonField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.OrdtagidField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SecurityIdOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.SideOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.fields.TransactTimeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.structs.InvestorId;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.structs.OutboundBusinessHeader;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.structs.Text;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.Message;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_1.types.PrintOptions;

/**
 * Represents the OrderMassActionReportMessage message from the BinaryEntryPoint protocol.
 *
 * <p>OrderMassActionReportMessage</p>
 */
public final class OrderMassActionReportMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 73;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Mass Action Report Message";

    /**
     * massActionType
     */
    private final MassActionTypeField massActionType = new MassActionTypeField();

    /**
     * massActionScope
     */
    private final MassActionScopeField massActionScope = new MassActionScopeField();

    /**
     * clOrdID
     */
    private final ClordidField clordid = new ClordidField();

    /**
     * massActionReportID
     */
    private final MassActionReportIdField massActionReportId = new MassActionReportIdField();

    /**
     * transactTime
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * massActionResponse
     */
    private final MassActionResponseField massActionResponse = new MassActionResponseField();

    /**
     * massActionRejectReason
     */
    private final MassActionRejectReasonField massActionRejectReason = new MassActionRejectReasonField();

    /**
     * execRestatementReason
     */
    private final MassCancelRestatementReasonField massCancelRestatementReason = new MassCancelRestatementReasonField();

    /**
     * ordTagID
     */
    private final OrdtagidField ordtagid = new OrdtagidField();

    /**
     * side
     */
    private final SideOptionalField sideOptional = new SideOptionalField();

    /**
     * asset
     */
    private final AssetField asset = new AssetField();

    /**
     * securityID
     */
    private final SecurityIdOptionalField securityIdOptional = new SecurityIdOptionalField();

    /**
     * OutboundBusinessHeader
     */
    private final OutboundBusinessHeader outboundBusinessHeader = new OutboundBusinessHeader();

    /**
     * SimpleNewOrderMessage
     */
    private final InvestorId investorId = new InvestorId();

    /**
     * text data struct
     */
    private final Text text = new Text();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(outboundBusinessHeader.fields(), List.<Field>of(massActionType), List.<Field>of(massActionScope), List.<Field>of(clordid), List.<Field>of(massActionReportId), List.<Field>of(transactTime), List.<Field>of(massActionResponse), List.<Field>of(massActionRejectReason), List.<Field>of(massCancelRestatementReason), List.<Field>of(ordtagid), List.<Field>of(sideOptional), List.<Field>of(asset), List.<Field>of(securityIdOptional), investorId.fields(), text.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * massActionType
     *
     * @return the MassActionType field
     */
    public MassActionTypeField massActionType() {
        return massActionType;
    }

    /**
     * massActionScope
     *
     * @return the MassActionScope field
     */
    public MassActionScopeField massActionScope() {
        return massActionScope;
    }

    /**
     * clOrdID
     *
     * @return the Clordid field
     */
    public ClordidField clordid() {
        return clordid;
    }

    /**
     * massActionReportID
     *
     * @return the MassActionReportId field
     */
    public MassActionReportIdField massActionReportId() {
        return massActionReportId;
    }

    /**
     * transactTime
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * massActionResponse
     *
     * @return the MassActionResponse field
     */
    public MassActionResponseField massActionResponse() {
        return massActionResponse;
    }

    /**
     * massActionRejectReason
     *
     * @return the MassActionRejectReason field
     */
    public MassActionRejectReasonField massActionRejectReason() {
        return massActionRejectReason;
    }

    /**
     * execRestatementReason
     *
     * @return the MassCancelRestatementReason field
     */
    public MassCancelRestatementReasonField massCancelRestatementReason() {
        return massCancelRestatementReason;
    }

    /**
     * ordTagID
     *
     * @return the Ordtagid field
     */
    public OrdtagidField ordtagid() {
        return ordtagid;
    }

    /**
     * side
     *
     * @return the SideOptional field
     */
    public SideOptionalField sideOptional() {
        return sideOptional;
    }

    /**
     * asset
     *
     * @return the Asset field
     */
    public AssetField asset() {
        return asset;
    }

    /**
     * securityID
     *
     * @return the SecurityIdOptional field
     */
    public SecurityIdOptionalField securityIdOptional() {
        return securityIdOptional;
    }

    /**
     * OutboundBusinessHeader
     *
     * @return the OutboundBusinessHeader record
     */
    public OutboundBusinessHeader outboundBusinessHeader() {
        return outboundBusinessHeader;
    }

    /**
     * SimpleNewOrderMessage
     *
     * @return the InvestorId record
     */
    public InvestorId investorId() {
        return investorId;
    }

    /**
     * text data struct
     *
     * @return the Text record
     */
    public Text text() {
        return text;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + text.byteLength() - Text.MINIMUM_BYTE_LENGTH;
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
        for (int[] run = OutboundBusinessHeader.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += OutboundBusinessHeader.BYTE_LENGTH;
        cursor += 1;
        cursor += 1;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        cursor += 1;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 6;
        cursor += 8;
        for (int[] run = InvestorId.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += InvestorId.BYTE_LENGTH;
        cursor += text.byteLength();
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(outboundBusinessHeader.sendingTime().value());
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
        if (!outboundBusinessHeader.parseFrom(data, cursor, end - 55)) {
            return false;
        }
        cursor += outboundBusinessHeader.byteLength();
        if (!massActionType.parse(data, cursor)) {
            return false;
        }
        cursor += MassActionTypeField.BYTE_LENGTH;
        if (!massActionScope.parse(data, cursor)) {
            return false;
        }
        cursor += MassActionScopeField.BYTE_LENGTH;
        if (!clordid.parse(data, cursor)) {
            return false;
        }
        cursor += ClordidField.BYTE_LENGTH;
        if (!massActionReportId.parse(data, cursor)) {
            return false;
        }
        cursor += MassActionReportIdField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!massActionResponse.parse(data, cursor)) {
            return false;
        }
        cursor += MassActionResponseField.BYTE_LENGTH;
        if (!massActionRejectReason.parse(data, cursor)) {
            return false;
        }
        cursor += MassActionRejectReasonField.BYTE_LENGTH;
        if (!massCancelRestatementReason.parse(data, cursor)) {
            return false;
        }
        cursor += MassCancelRestatementReasonField.BYTE_LENGTH;
        if (!ordtagid.parse(data, cursor)) {
            return false;
        }
        cursor += OrdtagidField.BYTE_LENGTH;
        if (!sideOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SideOptionalField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!asset.parse(data, cursor)) {
            return false;
        }
        cursor += AssetField.BYTE_LENGTH;
        if (!securityIdOptional.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdOptionalField.BYTE_LENGTH;
        if (!investorId.parseFrom(data, cursor, end - 1)) {
            return false;
        }
        cursor += investorId.byteLength();
        if (!text.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += text.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        int cursor = offset;
        cursor = outboundBusinessHeader.encode(data, cursor);
        cursor = massActionType.encode(data, cursor);
        cursor = massActionScope.encode(data, cursor);
        cursor = clordid.encode(data, cursor);
        cursor = massActionReportId.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = massActionResponse.encode(data, cursor);
        cursor = massActionRejectReason.encode(data, cursor);
        cursor = massCancelRestatementReason.encode(data, cursor);
        cursor = ordtagid.encode(data, cursor);
        cursor = sideOptional.encode(data, cursor);
        if (buffer != null && buffer.length >= 50) {
            System.arraycopy(buffer, 49, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = asset.encode(data, cursor);
        cursor = securityIdOptional.encode(data, cursor);
        cursor = investorId.encode(data, cursor);
        cursor = text.encode(data, cursor);
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
        outboundBusinessHeader.clear();
        investorId.clear();
        text.clear();
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
            if (field != text.textLength() && !field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields) {
            if (field != text.textLength() && !field.isValid()) {
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
            case "MassActionType" -> Optional.of(massActionType);
            case "MassActionScope" -> Optional.of(massActionScope);
            case "Clordid" -> Optional.of(clordid);
            case "MassActionReportId" -> Optional.of(massActionReportId);
            case "TransactTime" -> Optional.of(transactTime);
            case "MassActionResponse" -> Optional.of(massActionResponse);
            case "MassActionRejectReason" -> Optional.of(massActionRejectReason);
            case "MassCancelRestatementReason" -> Optional.of(massCancelRestatementReason);
            case "Ordtagid" -> Optional.of(ordtagid);
            case "SideOptional" -> Optional.of(sideOptional);
            case "Asset" -> Optional.of(asset);
            case "SecurityIdOptional" -> Optional.of(securityIdOptional);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderMassActionReportMessage message)) {
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
        if (!(other instanceof OrderMassActionReportMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
