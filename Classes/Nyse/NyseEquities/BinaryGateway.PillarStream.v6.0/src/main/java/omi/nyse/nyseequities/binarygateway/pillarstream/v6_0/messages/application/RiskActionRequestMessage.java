package omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.ClOrdIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.ClearingNumberField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.MarketMakerNulField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.MpidField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.MpsubidField2;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.RiskActionTypeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.RiskControlTypeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.RiskRangeIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.RiskUserCrdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.RiskUserTypeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.fields.SymbolIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.Message;
import omi.nyse.nyseequities.binarygateway.pillarstream.v6_0.types.PrintOptions;

/**
 * Represents the RiskActionRequestMessage message from the BinaryGateway protocol.
 *
 * <p>Risk Action Request Message</p>
 */
public final class RiskActionRequestMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 246;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Risk Action Request Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 22, 4, 47, 199 };

    /**
     * Identification number assigned to the security
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * Firm Identifier – MPID.
     */
    private final MpidField mpid = new MpidField();

    /**
     * Risk Entity. Options Market Maker identifier – alphanumeric MMID associated with the specified MPID. Populate if applicable.
     */
    private final MarketMakerNulField marketMakerNul = new MarketMakerNulField();

    /**
     * Risk Entity – SubID associated with the specified MPID. Populate if applicable.
     */
    private final MpsubidField2 mpsubid = new MpsubidField2();

    /**
     * Reserved for future use. Risk Entity – Clearing Number associated with the specified MPID. Populate if applicable.
     */
    private final ClearingNumberField clearingNumber = new ClearingNumberField();

    /**
     * Unique ID of the new Order, Cancel/Replace, Cancel, Modify, or Bulk Cancel request as assigned by the firm.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Risk User – CRD of the firm that owns the risk control represented by this message.
     */
    private final RiskUserCrdField riskUserCrd = new RiskUserCrdField();

    /**
     * Risk User – type of firm that owns the risk control represented by this message. E = Entering Firm, C = Clearing Firm, O = Options Market Maker Firm.
     */
    private final RiskUserTypeField riskUserType = new RiskUserTypeField();

    /**
     * Risk Control Type enum
     */
    private final RiskControlTypeField riskControlType = new RiskControlTypeField();

    /**
     * Risk action to perform, including query, kill switch actions, reinstatement, and symbol-level entity management.
     */
    private final RiskActionTypeField riskActionType = new RiskActionTypeField();

    /**
     * Quantity or price range to which the risk limit is applied. 0=Not Applicable/Optional per RiskControlType, 1..10=[see below]. Range meanings depend on RiskControlType (e.g., ADV buckets for RiskControlType 22; price buckets for RiskControlType 23).
     */
    private final RiskRangeIdField riskRangeId = new RiskRangeIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(symbolId, mpid, marketMakerNul, mpsubid, clearingNumber, clOrdId, riskUserCrd, riskUserType, riskControlType, riskActionType, riskRangeId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Identification number assigned to the security
     *
     * @return the SymbolId field
     */
    public SymbolIdField symbolId() {
        return symbolId;
    }

    /**
     * Firm Identifier – MPID.
     *
     * @return the Mpid field
     */
    public MpidField mpid() {
        return mpid;
    }

    /**
     * Risk Entity. Options Market Maker identifier – alphanumeric MMID associated with the specified MPID. Populate if applicable.
     *
     * @return the MarketMakerNul field
     */
    public MarketMakerNulField marketMakerNul() {
        return marketMakerNul;
    }

    /**
     * Risk Entity – SubID associated with the specified MPID. Populate if applicable.
     *
     * @return the Mpsubid field
     */
    public MpsubidField2 mpsubid() {
        return mpsubid;
    }

    /**
     * Reserved for future use. Risk Entity – Clearing Number associated with the specified MPID. Populate if applicable.
     *
     * @return the ClearingNumber field
     */
    public ClearingNumberField clearingNumber() {
        return clearingNumber;
    }

    /**
     * Unique ID of the new Order, Cancel/Replace, Cancel, Modify, or Bulk Cancel request as assigned by the firm.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Risk User – CRD of the firm that owns the risk control represented by this message.
     *
     * @return the RiskUserCrd field
     */
    public RiskUserCrdField riskUserCrd() {
        return riskUserCrd;
    }

    /**
     * Risk User – type of firm that owns the risk control represented by this message. E = Entering Firm, C = Clearing Firm, O = Options Market Maker Firm.
     *
     * @return the RiskUserType field
     */
    public RiskUserTypeField riskUserType() {
        return riskUserType;
    }

    /**
     * Risk Control Type enum
     *
     * @return the RiskControlType field
     */
    public RiskControlTypeField riskControlType() {
        return riskControlType;
    }

    /**
     * Risk action to perform, including query, kill switch actions, reinstatement, and symbol-level entity management.
     *
     * @return the RiskActionType field
     */
    public RiskActionTypeField riskActionType() {
        return riskActionType;
    }

    /**
     * Quantity or price range to which the risk limit is applied. 0=Not Applicable/Optional per RiskControlType, 1..10=[see below]. Range meanings depend on RiskControlType (e.g., ADV buckets for RiskControlType 22; price buckets for RiskControlType 23).
     *
     * @return the RiskRangeId field
     */
    public RiskRangeIdField riskRangeId() {
        return riskRangeId;
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
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!mpid.parse(data, cursor)) {
            return false;
        }
        cursor += MpidField.BYTE_LENGTH;
        if (!marketMakerNul.parse(data, cursor)) {
            return false;
        }
        cursor += MarketMakerNulField.BYTE_LENGTH;
        if (!mpsubid.parse(data, cursor)) {
            return false;
        }
        cursor += MpsubidField2.BYTE_LENGTH;
        cursor += 4; // padding
        if (!clearingNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingNumberField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!riskUserCrd.parse(data, cursor)) {
            return false;
        }
        cursor += RiskUserCrdField.BYTE_LENGTH;
        if (!riskUserType.parse(data, cursor)) {
            return false;
        }
        cursor += RiskUserTypeField.BYTE_LENGTH;
        if (!riskControlType.parse(data, cursor)) {
            return false;
        }
        cursor += RiskControlTypeField.BYTE_LENGTH;
        if (!riskActionType.parse(data, cursor)) {
            return false;
        }
        cursor += RiskActionTypeField.BYTE_LENGTH;
        if (!riskRangeId.parse(data, cursor)) {
            return false;
        }
        cursor += RiskRangeIdField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = symbolId.encode(data, cursor);
        cursor = mpid.encode(data, cursor);
        cursor = marketMakerNul.encode(data, cursor);
        cursor = mpsubid.encode(data, cursor);
        if (buffer != null && buffer.length >= 26) {
            System.arraycopy(buffer, 22, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = clearingNumber.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = riskUserCrd.encode(data, cursor);
        cursor = riskUserType.encode(data, cursor);
        cursor = riskControlType.encode(data, cursor);
        cursor = riskActionType.encode(data, cursor);
        cursor = riskRangeId.encode(data, cursor);
        if (buffer != null && buffer.length >= 246) {
            System.arraycopy(buffer, 47, data, cursor, 199); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 199, (byte) 0); // padding
        }
        cursor += 199;
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
            case "SymbolId" -> Optional.of(symbolId);
            case "Mpid" -> Optional.of(mpid);
            case "MarketMakerNul" -> Optional.of(marketMakerNul);
            case "Mpsubid" -> Optional.of(mpsubid);
            case "ClearingNumber" -> Optional.of(clearingNumber);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "RiskUserCrd" -> Optional.of(riskUserCrd);
            case "RiskUserType" -> Optional.of(riskUserType);
            case "RiskControlType" -> Optional.of(riskControlType);
            case "RiskActionType" -> Optional.of(riskActionType);
            case "RiskRangeId" -> Optional.of(riskRangeId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof RiskActionRequestMessage message)) {
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
        if (!(other instanceof RiskActionRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
