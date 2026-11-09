package omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.AssetField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.ClordidField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.MassActionScopeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.MassActionTypeField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.MassCancelRestatementReasonField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.OrdtagidField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SecurityIdOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.fields.SideOptionalField;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.InboundBusinessHeader;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.structs.InvestorId;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Field;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.Message;
import omi.b3.b3derivatives.binaryentrypoint.sbe.v8_3.types.PrintOptions;

/**
 * Represents the OrderMassActionRequestMessage message from the BinaryEntryPoint protocol.
 *
 * <p>OrderMassActionRequestMessage</p>
 */
public final class OrderMassActionRequestMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 54;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Mass Action Request Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 31, 1, 48, 2 };

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
     * InboundBusinessHeader
     */
    private final InboundBusinessHeader inboundBusinessHeader = new InboundBusinessHeader();

    /**
     * SimpleNewOrderMessage
     */
    private final InvestorId investorId = new InvestorId();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(inboundBusinessHeader.fields(), List.<Field>of(massActionType), List.<Field>of(massActionScope), List.<Field>of(clordid), List.<Field>of(massCancelRestatementReason), List.<Field>of(ordtagid), List.<Field>of(sideOptional), List.<Field>of(asset), List.<Field>of(securityIdOptional), investorId.fields()).flatMap(List::stream).toList();

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
     * InboundBusinessHeader
     *
     * @return the InboundBusinessHeader record
     */
    public InboundBusinessHeader inboundBusinessHeader() {
        return inboundBusinessHeader;
    }

    /**
     * SimpleNewOrderMessage
     *
     * @return the InvestorId record
     */
    public InvestorId investorId() {
        return investorId;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!inboundBusinessHeader.parseFrom(data, cursor, end - 36)) {
            return false;
        }
        cursor += inboundBusinessHeader.byteLength();
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
        if (!investorId.parseFrom(data, cursor, end)) {
            return false;
        }
        cursor += investorId.byteLength();

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = inboundBusinessHeader.encode(data, cursor);
        cursor = massActionType.encode(data, cursor);
        cursor = massActionScope.encode(data, cursor);
        cursor = clordid.encode(data, cursor);
        cursor = massCancelRestatementReason.encode(data, cursor);
        cursor = ordtagid.encode(data, cursor);
        cursor = sideOptional.encode(data, cursor);
        if (buffer != null && buffer.length >= 31 + 1) {
            System.arraycopy(buffer, 31, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = asset.encode(data, cursor);
        cursor = securityIdOptional.encode(data, cursor);
        cursor = investorId.encode(data, cursor);
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
        inboundBusinessHeader.clear();
        investorId.clear();
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
            case "MassActionType" -> Optional.of(massActionType);
            case "MassActionScope" -> Optional.of(massActionScope);
            case "Clordid" -> Optional.of(clordid);
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
        if (!(other instanceof OrderMassActionRequestMessage message)) {
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
        if (!(other instanceof OrderMassActionRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
