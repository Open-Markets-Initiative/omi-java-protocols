package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.DmmAllocatedQtyField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.DmmAvailableQtyField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.DmmRequestedQtyField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.IntroducingBadgeIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.ManualActionTypeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.ManualOverrideField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.ManualOverrideReasonField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.MmidField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.MpidField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.PriceField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.SideField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.SsrFilingPriceField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.SymbolIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.TransactTimeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.structs.ManualActionId;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Message;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.PrintOptions;

/**
 * Represents the ManualActionRequestMessage message from the BinaryGateway protocol.
 *
 * <p>Manual action details initiated by a DMM on the NYSE Trading Floor via DBK GUI.</p>
 */
public final class ManualActionRequestMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 91;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Manual Action Request Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = {};

    /**
     * Exchange application time.
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Identification number assigned to the security
     */
    private final SymbolIdField symbolId = new SymbolIdField();

    /**
     * NYSE Floor DMM supervisor badge when ManualOverride is 1 or 2.
     */
    private final IntroducingBadgeIdField introducingBadgeId = new IntroducingBadgeIdField();

    /**
     * Firm Identifier – MPID.
     */
    private final MpidField mpid = new MpidField();

    /**
     * This value represents the integer representation of a Market Maker, LMM, SLP, SLMM or DMM, agreed upon between the firm and the Exchange
     */
    private final MmidField mmid = new MmidField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * 0.000001-999999.999999
     */
    private final PriceField price = new PriceField();

    /**
     * Requested quantity associated with the manual action.
     */
    private final DmmRequestedQtyField dmmRequestedQty = new DmmRequestedQtyField();

    /**
     * DMM available quantity for auction-related actions.
     */
    private final DmmAvailableQtyField dmmAvailableQty = new DmmAvailableQtyField();

    /**
     * Allocated quantity for the auction trade.
     */
    private final DmmAllocatedQtyField dmmAllocatedQty = new DmmAllocatedQtyField();

    /**
     * Sell Short Restriction Filing Price used for the auction; set to 0 if not available.
     */
    private final SsrFilingPriceField ssrFilingPrice = new SsrFilingPriceField();

    /**
     * Indicates whether a DBK GUI manual override occurred.
     */
    private final ManualOverrideField manualOverride = new ManualOverrideField();

    /**
     * Optional reason provided for a manual override.
     */
    private final ManualOverrideReasonField manualOverrideReason = new ManualOverrideReasonField();

    /**
     * Type of manual action performed by the DMM.
     */
    private final ManualActionTypeField manualActionType = new ManualActionTypeField();

    /**
     * ManualActionID
     */
    private final ManualActionId manualActionId = new ManualActionId();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(transactTime), List.<Field>of(symbolId), List.<Field>of(introducingBadgeId), List.<Field>of(mpid), List.<Field>of(mmid), manualActionId.fields(), List.<Field>of(side), List.<Field>of(price), List.<Field>of(dmmRequestedQty), List.<Field>of(dmmAvailableQty), List.<Field>of(dmmAllocatedQty), List.<Field>of(ssrFilingPrice), List.<Field>of(manualOverride), List.<Field>of(manualOverrideReason), List.<Field>of(manualActionType)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Exchange application time.
     *
     * @return the TransactTime field
     */
    public TransactTimeField transactTime() {
        return transactTime;
    }

    /**
     * Identification number assigned to the security
     *
     * @return the SymbolId field
     */
    public SymbolIdField symbolId() {
        return symbolId;
    }

    /**
     * NYSE Floor DMM supervisor badge when ManualOverride is 1 or 2.
     *
     * @return the IntroducingBadgeId field
     */
    public IntroducingBadgeIdField introducingBadgeId() {
        return introducingBadgeId;
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
     * This value represents the integer representation of a Market Maker, LMM, SLP, SLMM or DMM, agreed upon between the firm and the Exchange
     *
     * @return the Mmid field
     */
    public MmidField mmid() {
        return mmid;
    }

    /**
     * Side
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * 0.000001-999999.999999
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Requested quantity associated with the manual action.
     *
     * @return the DmmRequestedQty field
     */
    public DmmRequestedQtyField dmmRequestedQty() {
        return dmmRequestedQty;
    }

    /**
     * DMM available quantity for auction-related actions.
     *
     * @return the DmmAvailableQty field
     */
    public DmmAvailableQtyField dmmAvailableQty() {
        return dmmAvailableQty;
    }

    /**
     * Allocated quantity for the auction trade.
     *
     * @return the DmmAllocatedQty field
     */
    public DmmAllocatedQtyField dmmAllocatedQty() {
        return dmmAllocatedQty;
    }

    /**
     * Sell Short Restriction Filing Price used for the auction; set to 0 if not available.
     *
     * @return the SsrFilingPrice field
     */
    public SsrFilingPriceField ssrFilingPrice() {
        return ssrFilingPrice;
    }

    /**
     * Indicates whether a DBK GUI manual override occurred.
     *
     * @return the ManualOverride field
     */
    public ManualOverrideField manualOverride() {
        return manualOverride;
    }

    /**
     * Optional reason provided for a manual override.
     *
     * @return the ManualOverrideReason field
     */
    public ManualOverrideReasonField manualOverrideReason() {
        return manualOverrideReason;
    }

    /**
     * Type of manual action performed by the DMM.
     *
     * @return the ManualActionType field
     */
    public ManualActionTypeField manualActionType() {
        return manualActionType;
    }

    /**
     * ManualActionID
     *
     * @return the ManualActionId record
     */
    public ManualActionId manualActionId() {
        return manualActionId;
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

        int stop = Math.max(0, Math.min(data.length, offset + BYTE_LENGTH));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!symbolId.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolIdField.BYTE_LENGTH;
        if (!introducingBadgeId.parse(data, cursor)) {
            return false;
        }
        cursor += IntroducingBadgeIdField.BYTE_LENGTH;
        if (!mpid.parse(data, cursor)) {
            return false;
        }
        cursor += MpidField.BYTE_LENGTH;
        if (!mmid.parse(data, cursor)) {
            return false;
        }
        cursor += MmidField.BYTE_LENGTH;
        if (!manualActionId.parseFrom(data, cursor, end - 51)) {
            return false;
        }
        cursor += manualActionId.byteLength();
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!dmmRequestedQty.parse(data, cursor)) {
            return false;
        }
        cursor += DmmRequestedQtyField.BYTE_LENGTH;
        if (!dmmAvailableQty.parse(data, cursor)) {
            return false;
        }
        cursor += DmmAvailableQtyField.BYTE_LENGTH;
        if (!dmmAllocatedQty.parse(data, cursor)) {
            return false;
        }
        cursor += DmmAllocatedQtyField.BYTE_LENGTH;
        if (!ssrFilingPrice.parse(data, cursor)) {
            return false;
        }
        cursor += SsrFilingPriceField.BYTE_LENGTH;
        if (!manualOverride.parse(data, cursor)) {
            return false;
        }
        cursor += ManualOverrideField.BYTE_LENGTH;
        if (!manualOverrideReason.parse(data, cursor)) {
            return false;
        }
        cursor += ManualOverrideReasonField.BYTE_LENGTH;
        if (!manualActionType.parse(data, cursor)) {
            return false;
        }
        cursor += ManualActionTypeField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = introducingBadgeId.encode(data, cursor);
        cursor = mpid.encode(data, cursor);
        cursor = mmid.encode(data, cursor);
        cursor = manualActionId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = dmmRequestedQty.encode(data, cursor);
        cursor = dmmAvailableQty.encode(data, cursor);
        cursor = dmmAllocatedQty.encode(data, cursor);
        cursor = ssrFilingPrice.encode(data, cursor);
        cursor = manualOverride.encode(data, cursor);
        cursor = manualOverrideReason.encode(data, cursor);
        cursor = manualActionType.encode(data, cursor);
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
        manualActionId.clear();
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
            case "TransactTime" -> Optional.of(transactTime);
            case "SymbolId" -> Optional.of(symbolId);
            case "IntroducingBadgeId" -> Optional.of(introducingBadgeId);
            case "Mpid" -> Optional.of(mpid);
            case "Mmid" -> Optional.of(mmid);
            case "Side" -> Optional.of(side);
            case "Price" -> Optional.of(price);
            case "DmmRequestedQty" -> Optional.of(dmmRequestedQty);
            case "DmmAvailableQty" -> Optional.of(dmmAvailableQty);
            case "DmmAllocatedQty" -> Optional.of(dmmAllocatedQty);
            case "SsrFilingPrice" -> Optional.of(ssrFilingPrice);
            case "ManualOverride" -> Optional.of(manualOverride);
            case "ManualOverrideReason" -> Optional.of(manualOverrideReason);
            case "ManualActionType" -> Optional.of(manualActionType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ManualActionRequestMessage message)) {
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
        if (!(other instanceof ManualActionRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
