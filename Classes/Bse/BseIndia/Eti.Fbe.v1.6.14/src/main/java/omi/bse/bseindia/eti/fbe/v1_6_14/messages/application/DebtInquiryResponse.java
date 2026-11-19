package omi.bse.bseindia.eti.fbe.v1_6_14.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.AccruedInterestAmtField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.GrossTradeAmtField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.OrderQtyField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.SecurityIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.SettlTypeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.UnderlyingDirtyPriceField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.UnderlyingPxField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.YieldField;
import omi.bse.bseindia.eti.fbe.v1_6_14.structs.NrResponseHeaderMeComp;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Field;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Message;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.PrintOptions;

/**
 * Represents the DebtInquiryResponse message from the Eti protocol.
 */
public final class DebtInquiryResponse implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 114;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Debt Inquiry Response";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 2, 55, 3 };

    /**
     * Underlying Px
     */
    private final UnderlyingPxField underlyingPx = new UnderlyingPxField();

    /**
     * Yield
     */
    private final YieldField yield = new YieldField();

    /**
     * Accrued Interest Amt
     */
    private final AccruedInterestAmtField accruedInterestAmt = new AccruedInterestAmtField();

    /**
     * Gross Trade Amt
     */
    private final GrossTradeAmtField grossTradeAmt = new GrossTradeAmtField();

    /**
     * Underlying Dirty Price
     */
    private final UnderlyingDirtyPriceField underlyingDirtyPrice = new UnderlyingDirtyPriceField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Order Qty
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Settl Type
     */
    private final SettlTypeField settlType = new SettlTypeField();

    /**
     * Nr Response Header Me Comp
     */
    private final NrResponseHeaderMeComp nrResponseHeaderMeComp = new NrResponseHeaderMeComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(nrResponseHeaderMeComp.fields(), List.<Field>of(underlyingPx), List.<Field>of(yield), List.<Field>of(accruedInterestAmt), List.<Field>of(grossTradeAmt), List.<Field>of(underlyingDirtyPrice), List.<Field>of(securityId), List.<Field>of(orderQty), List.<Field>of(settlType)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Underlying Px
     *
     * @return the UnderlyingPx field
     */
    public UnderlyingPxField underlyingPx() {
        return underlyingPx;
    }

    /**
     * Yield
     *
     * @return the Yield field
     */
    public YieldField yield() {
        return yield;
    }

    /**
     * Accrued Interest Amt
     *
     * @return the AccruedInterestAmt field
     */
    public AccruedInterestAmtField accruedInterestAmt() {
        return accruedInterestAmt;
    }

    /**
     * Gross Trade Amt
     *
     * @return the GrossTradeAmt field
     */
    public GrossTradeAmtField grossTradeAmt() {
        return grossTradeAmt;
    }

    /**
     * Underlying Dirty Price
     *
     * @return the UnderlyingDirtyPrice field
     */
    public UnderlyingDirtyPriceField underlyingDirtyPrice() {
        return underlyingDirtyPrice;
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
     * Order Qty
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Settl Type
     *
     * @return the SettlType field
     */
    public SettlTypeField settlType() {
        return settlType;
    }

    /**
     * Nr Response Header Me Comp
     *
     * @return the NrResponseHeaderMeComp record
     */
    public NrResponseHeaderMeComp nrResponseHeaderMeComp() {
        return nrResponseHeaderMeComp;
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
        return Optional.ofNullable(nrResponseHeaderMeComp.requestTime().value());
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
        cursor += 2; // padding
        if (!nrResponseHeaderMeComp.parseFrom(data, cursor, end - 56)) {
            return false;
        }
        cursor += nrResponseHeaderMeComp.byteLength();
        if (!underlyingPx.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingPxField.BYTE_LENGTH;
        if (!yield.parse(data, cursor)) {
            return false;
        }
        cursor += YieldField.BYTE_LENGTH;
        if (!accruedInterestAmt.parse(data, cursor)) {
            return false;
        }
        cursor += AccruedInterestAmtField.BYTE_LENGTH;
        if (!grossTradeAmt.parse(data, cursor)) {
            return false;
        }
        cursor += GrossTradeAmtField.BYTE_LENGTH;
        if (!underlyingDirtyPrice.parse(data, cursor)) {
            return false;
        }
        cursor += UnderlyingDirtyPriceField.BYTE_LENGTH;
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        return settlType.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 0, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = nrResponseHeaderMeComp.encode(data, cursor);
        cursor = underlyingPx.encode(data, cursor);
        cursor = yield.encode(data, cursor);
        cursor = accruedInterestAmt.encode(data, cursor);
        cursor = grossTradeAmt.encode(data, cursor);
        cursor = underlyingDirtyPrice.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = settlType.encode(data, cursor);
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
        nrResponseHeaderMeComp.clear();
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
            case "UnderlyingPx" -> Optional.of(underlyingPx);
            case "Yield" -> Optional.of(yield);
            case "AccruedInterestAmt" -> Optional.of(accruedInterestAmt);
            case "GrossTradeAmt" -> Optional.of(grossTradeAmt);
            case "UnderlyingDirtyPrice" -> Optional.of(underlyingDirtyPrice);
            case "SecurityId" -> Optional.of(securityId);
            case "OrderQty" -> Optional.of(orderQty);
            case "SettlType" -> Optional.of(settlType);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DebtInquiryResponse message)) {
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
        if (!(other instanceof DebtInquiryResponse message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
