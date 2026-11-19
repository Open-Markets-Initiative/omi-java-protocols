package omi.nse.nsecd.orderentry.nnf.v6_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BuyAccountNumberField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BuyBrokerIdField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BuyOpenCloseField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BuyPanField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.FillNumberField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.FillPriceField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.FillQuantityField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.MktTypeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.RequestedByField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.SellAccountNumberField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.SellBrokerIdField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.SellOpenCloseField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.SellPanField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.TokenNoField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.TraderIdField;
import omi.nse.nsecd.orderentry.nnf.v6_3.structs.ContractDesc;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Field;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Message;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.PrintOptions;

/**
 * Represents the TradeCancelOutMessage message from the OrderEntry protocol.
 *
 * <p>5441 MS_TRADE_INQ_DATA 234 I, carried in the MS_TRADE_INQ_DATA structure</p>
 */
public final class TradeCancelOutMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 194;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Cancel Out Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 46, 4, 86, 24, 110, 2, 112, 2, 134, 60 };

    /**
     * This is the Token Number of the contract for which this order was originally placed
     */
    private final TokenNoField tokenNo = new TokenNoField();

    /**
     * This field should contain the trade number of the trade to be modified
     */
    private final FillNumberField fillNumber = new FillNumberField();

    /**
     * This field should contain the quantity that has been traded
     */
    private final FillQuantityField fillQuantity = new FillQuantityField();

    /**
     * This field should contain the price at which the trade took place
     */
    private final FillPriceField fillPrice = new FillPriceField();

    /**
     * MktType
     */
    private final MktTypeField mktType = new MktTypeField();

    /**
     * This field should be set to ‘O‘for Open or ‘C‘for Close for Buy trade
     */
    private final BuyOpenCloseField buyOpenClose = new BuyOpenCloseField();

    /**
     * BuyBrokerId
     */
    private final BuyBrokerIdField buyBrokerId = new BuyBrokerIdField();

    /**
     * SellBrokerId
     */
    private final SellBrokerIdField sellBrokerId = new SellBrokerIdField();

    /**
     * This field should contain the trader ID
     */
    private final TraderIdField traderId = new TraderIdField();

    /**
     * This field indicates which side (Buy/Sell) of the trade is to be modified/cancelled
     */
    private final RequestedByField requestedBy = new RequestedByField();

    /**
     * This field should contain the Open / Close indicator for the Sell trade
     */
    private final SellOpenCloseField sellOpenClose = new SellOpenCloseField();

    /**
     * BuyAccountNumber
     */
    private final BuyAccountNumberField buyAccountNumber = new BuyAccountNumberField();

    /**
     * SellAccountNumber
     */
    private final SellAccountNumberField sellAccountNumber = new SellAccountNumberField();

    /**
     * This field shall contain PAN (Permanent Account Number/PAN_EXEMPT)
     */
    private final BuyPanField buyPan = new BuyPanField();

    /**
     * This field shall contain PAN (Permanent Account Number/PAN_EXEMPT)
     */
    private final SellPanField sellPan = new SellPanField();

    /**
     * CONTRACT_DESC
     */
    private final ContractDesc contractDesc = new ContractDesc();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(tokenNo), contractDesc.fields(), List.<Field>of(fillNumber), List.<Field>of(fillQuantity), List.<Field>of(fillPrice), List.<Field>of(mktType), List.<Field>of(buyOpenClose), List.<Field>of(buyBrokerId), List.<Field>of(sellBrokerId), List.<Field>of(traderId), List.<Field>of(requestedBy), List.<Field>of(sellOpenClose), List.<Field>of(buyAccountNumber), List.<Field>of(sellAccountNumber), List.<Field>of(buyPan), List.<Field>of(sellPan)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * This is the Token Number of the contract for which this order was originally placed
     *
     * @return the TokenNo field
     */
    public TokenNoField tokenNo() {
        return tokenNo;
    }

    /**
     * This field should contain the trade number of the trade to be modified
     *
     * @return the FillNumber field
     */
    public FillNumberField fillNumber() {
        return fillNumber;
    }

    /**
     * This field should contain the quantity that has been traded
     *
     * @return the FillQuantity field
     */
    public FillQuantityField fillQuantity() {
        return fillQuantity;
    }

    /**
     * This field should contain the price at which the trade took place
     *
     * @return the FillPrice field
     */
    public FillPriceField fillPrice() {
        return fillPrice;
    }

    /**
     * MktType
     *
     * @return the MktType field
     */
    public MktTypeField mktType() {
        return mktType;
    }

    /**
     * This field should be set to ‘O‘for Open or ‘C‘for Close for Buy trade
     *
     * @return the BuyOpenClose field
     */
    public BuyOpenCloseField buyOpenClose() {
        return buyOpenClose;
    }

    /**
     * BuyBrokerId
     *
     * @return the BuyBrokerId field
     */
    public BuyBrokerIdField buyBrokerId() {
        return buyBrokerId;
    }

    /**
     * SellBrokerId
     *
     * @return the SellBrokerId field
     */
    public SellBrokerIdField sellBrokerId() {
        return sellBrokerId;
    }

    /**
     * This field should contain the trader ID
     *
     * @return the TraderId field
     */
    public TraderIdField traderId() {
        return traderId;
    }

    /**
     * This field indicates which side (Buy/Sell) of the trade is to be modified/cancelled
     *
     * @return the RequestedBy field
     */
    public RequestedByField requestedBy() {
        return requestedBy;
    }

    /**
     * This field should contain the Open / Close indicator for the Sell trade
     *
     * @return the SellOpenClose field
     */
    public SellOpenCloseField sellOpenClose() {
        return sellOpenClose;
    }

    /**
     * BuyAccountNumber
     *
     * @return the BuyAccountNumber field
     */
    public BuyAccountNumberField buyAccountNumber() {
        return buyAccountNumber;
    }

    /**
     * SellAccountNumber
     *
     * @return the SellAccountNumber field
     */
    public SellAccountNumberField sellAccountNumber() {
        return sellAccountNumber;
    }

    /**
     * This field shall contain PAN (Permanent Account Number/PAN_EXEMPT)
     *
     * @return the BuyPan field
     */
    public BuyPanField buyPan() {
        return buyPan;
    }

    /**
     * This field shall contain PAN (Permanent Account Number/PAN_EXEMPT)
     *
     * @return the SellPan field
     */
    public SellPanField sellPan() {
        return sellPan;
    }

    /**
     * CONTRACT_DESC
     *
     * @return the ContractDesc record
     */
    public ContractDesc contractDesc() {
        return contractDesc;
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
        if (!tokenNo.parse(data, cursor)) {
            return false;
        }
        cursor += TokenNoField.BYTE_LENGTH;
        if (!contractDesc.parseFrom(data, cursor, end - 162)) {
            return false;
        }
        cursor += contractDesc.byteLength();
        if (!fillNumber.parse(data, cursor)) {
            return false;
        }
        cursor += FillNumberField.BYTE_LENGTH;
        if (!fillQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += FillQuantityField.BYTE_LENGTH;
        if (!fillPrice.parse(data, cursor)) {
            return false;
        }
        cursor += FillPriceField.BYTE_LENGTH;
        if (!mktType.parse(data, cursor)) {
            return false;
        }
        cursor += MktTypeField.BYTE_LENGTH;
        if (!buyOpenClose.parse(data, cursor)) {
            return false;
        }
        cursor += BuyOpenCloseField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!buyBrokerId.parse(data, cursor)) {
            return false;
        }
        cursor += BuyBrokerIdField.BYTE_LENGTH;
        if (!sellBrokerId.parse(data, cursor)) {
            return false;
        }
        cursor += SellBrokerIdField.BYTE_LENGTH;
        if (!traderId.parse(data, cursor)) {
            return false;
        }
        cursor += TraderIdField.BYTE_LENGTH;
        if (!requestedBy.parse(data, cursor)) {
            return false;
        }
        cursor += RequestedByField.BYTE_LENGTH;
        if (!sellOpenClose.parse(data, cursor)) {
            return false;
        }
        cursor += SellOpenCloseField.BYTE_LENGTH;
        if (!buyAccountNumber.parse(data, cursor)) {
            return false;
        }
        cursor += BuyAccountNumberField.BYTE_LENGTH;
        if (!sellAccountNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SellAccountNumberField.BYTE_LENGTH;
        cursor += 28; // padding
        if (!buyPan.parse(data, cursor)) {
            return false;
        }
        cursor += BuyPanField.BYTE_LENGTH;
        if (!sellPan.parse(data, cursor)) {
            return false;
        }
        cursor += SellPanField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = tokenNo.encode(data, cursor);
        cursor = contractDesc.encode(data, cursor);
        cursor = fillNumber.encode(data, cursor);
        cursor = fillQuantity.encode(data, cursor);
        cursor = fillPrice.encode(data, cursor);
        cursor = mktType.encode(data, cursor);
        cursor = buyOpenClose.encode(data, cursor);
        if (buffer != null && buffer.length >= 50) {
            System.arraycopy(buffer, 46, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = buyBrokerId.encode(data, cursor);
        cursor = sellBrokerId.encode(data, cursor);
        cursor = traderId.encode(data, cursor);
        cursor = requestedBy.encode(data, cursor);
        cursor = sellOpenClose.encode(data, cursor);
        cursor = buyAccountNumber.encode(data, cursor);
        cursor = sellAccountNumber.encode(data, cursor);
        if (buffer != null && buffer.length >= 114) {
            System.arraycopy(buffer, 86, data, cursor, 28); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 28, (byte) 0); // padding
        }
        cursor += 28;
        cursor = buyPan.encode(data, cursor);
        cursor = sellPan.encode(data, cursor);
        if (buffer != null && buffer.length >= 194) {
            System.arraycopy(buffer, 134, data, cursor, 60); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 60, (byte) 0); // padding
        }
        cursor += 60;
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
        contractDesc.clear();
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
            case "TokenNo" -> Optional.of(tokenNo);
            case "FillNumber" -> Optional.of(fillNumber);
            case "FillQuantity" -> Optional.of(fillQuantity);
            case "FillPrice" -> Optional.of(fillPrice);
            case "MktType" -> Optional.of(mktType);
            case "BuyOpenClose" -> Optional.of(buyOpenClose);
            case "BuyBrokerId" -> Optional.of(buyBrokerId);
            case "SellBrokerId" -> Optional.of(sellBrokerId);
            case "TraderId" -> Optional.of(traderId);
            case "RequestedBy" -> Optional.of(requestedBy);
            case "SellOpenClose" -> Optional.of(sellOpenClose);
            case "BuyAccountNumber" -> Optional.of(buyAccountNumber);
            case "SellAccountNumber" -> Optional.of(sellAccountNumber);
            case "BuyPan" -> Optional.of(buyPan);
            case "SellPan" -> Optional.of(sellPan);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCancelOutMessage message)) {
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
        if (!(other instanceof TradeCancelOutMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
