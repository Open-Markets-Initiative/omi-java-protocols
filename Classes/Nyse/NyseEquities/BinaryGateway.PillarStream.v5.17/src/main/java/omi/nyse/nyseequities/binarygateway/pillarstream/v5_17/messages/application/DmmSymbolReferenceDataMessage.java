package omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.BookField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.CloseOnTradeMaxQtyField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.DmmUnitNumField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.LmocpField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.MedianVolumeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.MpidField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.NyseSymbolField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.OpenOnTradeMaxQtyField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.PostField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.Ppp1Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.Ppp2Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.Ppp3Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.RdSeqField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.RidgePriceField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.SymbolIdField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.fields.TransactTimeField;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Field;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.Message;
import omi.nyse.nyseequities.binarygateway.pillarstream.v5_17.types.PrintOptions;

/**
 * Represents the DmmSymbolReferenceDataMessage message from the BinaryGateway protocol.
 *
 * <p>DMM Symbol Reference Data</p>
 */
public final class DmmSymbolReferenceDataMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 125;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Dmm Symbol Reference Data Message";

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
     * NYSE/XDP Market Data symbology.
     */
    private final NyseSymbolField nyseSymbol = new NyseSymbolField();

    /**
     * Book Name
     */
    private final BookField book = new BookField();

    /**
     * Firm Identifier – MPID.
     */
    private final MpidField mpid = new MpidField();

    /**
     * DMM Unit Identification Number
     */
    private final DmmUnitNumField dmmUnitNum = new DmmUnitNumField();

    /**
     * NYSE Trading Floor Location
     */
    private final PostField post = new PostField();

    /**
     * Depth Guidelines - the symbol’s median adjusted volume for Trailing Period; minimum is 1 round lot
     */
    private final MedianVolumeField medianVolume = new MedianVolumeField();

    /**
     * Depth Guidelines - the symbol’s Relevant Depth Sequence size for the trade date
     */
    private final RdSeqField rdSeq = new RdSeqField();

    /**
     * Depth Guidelines - the symbol’s Relevant Individual Depth Guideline for the trade date
     */
    private final RidgePriceField ridgePrice = new RidgePriceField();

    /**
     * Depth Guidelines - the symbol’s Price Participation Point 1 for the trade date
     */
    private final Ppp1Field ppp1 = new Ppp1Field();

    /**
     * Depth Guidelines - the symbol’s Price Participation Point 2 for the trade date
     */
    private final Ppp2Field ppp2 = new Ppp2Field();

    /**
     * Depth Guidelines - the symbol’s Price Participation Point 3 for the trade date
     */
    private final Ppp3Field ppp3 = new Ppp3Field();

    /**
     * Maximum print quantity for electronic Opening/Re-opening Auction represented in number of shares
     */
    private final OpenOnTradeMaxQtyField openOnTradeMaxQty = new OpenOnTradeMaxQtyField();

    /**
     * Maximum print quantity for electronic Closing Auction represented in number of shares
     */
    private final CloseOnTradeMaxQtyField closeOnTradeMaxQty = new CloseOnTradeMaxQtyField();

    /**
     * Listing Market Official Closing Price
     */
    private final LmocpField lmocp = new LmocpField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactTime, symbolId, nyseSymbol, book, mpid, dmmUnitNum, post, medianVolume, rdSeq, ridgePrice, ppp1, ppp2, ppp3, openOnTradeMaxQty, closeOnTradeMaxQty, lmocp);

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
     * NYSE/XDP Market Data symbology.
     *
     * @return the NyseSymbol field
     */
    public NyseSymbolField nyseSymbol() {
        return nyseSymbol;
    }

    /**
     * Book Name
     *
     * @return the Book field
     */
    public BookField book() {
        return book;
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
     * DMM Unit Identification Number
     *
     * @return the DmmUnitNum field
     */
    public DmmUnitNumField dmmUnitNum() {
        return dmmUnitNum;
    }

    /**
     * NYSE Trading Floor Location
     *
     * @return the Post field
     */
    public PostField post() {
        return post;
    }

    /**
     * Depth Guidelines - the symbol’s median adjusted volume for Trailing Period; minimum is 1 round lot
     *
     * @return the MedianVolume field
     */
    public MedianVolumeField medianVolume() {
        return medianVolume;
    }

    /**
     * Depth Guidelines - the symbol’s Relevant Depth Sequence size for the trade date
     *
     * @return the RdSeq field
     */
    public RdSeqField rdSeq() {
        return rdSeq;
    }

    /**
     * Depth Guidelines - the symbol’s Relevant Individual Depth Guideline for the trade date
     *
     * @return the RidgePrice field
     */
    public RidgePriceField ridgePrice() {
        return ridgePrice;
    }

    /**
     * Depth Guidelines - the symbol’s Price Participation Point 1 for the trade date
     *
     * @return the Ppp1 field
     */
    public Ppp1Field ppp1() {
        return ppp1;
    }

    /**
     * Depth Guidelines - the symbol’s Price Participation Point 2 for the trade date
     *
     * @return the Ppp2 field
     */
    public Ppp2Field ppp2() {
        return ppp2;
    }

    /**
     * Depth Guidelines - the symbol’s Price Participation Point 3 for the trade date
     *
     * @return the Ppp3 field
     */
    public Ppp3Field ppp3() {
        return ppp3;
    }

    /**
     * Maximum print quantity for electronic Opening/Re-opening Auction represented in number of shares
     *
     * @return the OpenOnTradeMaxQty field
     */
    public OpenOnTradeMaxQtyField openOnTradeMaxQty() {
        return openOnTradeMaxQty;
    }

    /**
     * Maximum print quantity for electronic Closing Auction represented in number of shares
     *
     * @return the CloseOnTradeMaxQty field
     */
    public CloseOnTradeMaxQtyField closeOnTradeMaxQty() {
        return closeOnTradeMaxQty;
    }

    /**
     * Listing Market Official Closing Price
     *
     * @return the Lmocp field
     */
    public LmocpField lmocp() {
        return lmocp;
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
        if (!nyseSymbol.parse(data, cursor)) {
            return false;
        }
        cursor += NyseSymbolField.BYTE_LENGTH;
        if (!book.parse(data, cursor)) {
            return false;
        }
        cursor += BookField.BYTE_LENGTH;
        if (!mpid.parse(data, cursor)) {
            return false;
        }
        cursor += MpidField.BYTE_LENGTH;
        if (!dmmUnitNum.parse(data, cursor)) {
            return false;
        }
        cursor += DmmUnitNumField.BYTE_LENGTH;
        if (!post.parse(data, cursor)) {
            return false;
        }
        cursor += PostField.BYTE_LENGTH;
        if (!medianVolume.parse(data, cursor)) {
            return false;
        }
        cursor += MedianVolumeField.BYTE_LENGTH;
        if (!rdSeq.parse(data, cursor)) {
            return false;
        }
        cursor += RdSeqField.BYTE_LENGTH;
        if (!ridgePrice.parse(data, cursor)) {
            return false;
        }
        cursor += RidgePriceField.BYTE_LENGTH;
        if (!ppp1.parse(data, cursor)) {
            return false;
        }
        cursor += Ppp1Field.BYTE_LENGTH;
        if (!ppp2.parse(data, cursor)) {
            return false;
        }
        cursor += Ppp2Field.BYTE_LENGTH;
        if (!ppp3.parse(data, cursor)) {
            return false;
        }
        cursor += Ppp3Field.BYTE_LENGTH;
        if (!openOnTradeMaxQty.parse(data, cursor)) {
            return false;
        }
        cursor += OpenOnTradeMaxQtyField.BYTE_LENGTH;
        if (!closeOnTradeMaxQty.parse(data, cursor)) {
            return false;
        }
        cursor += CloseOnTradeMaxQtyField.BYTE_LENGTH;
        if (!lmocp.parse(data, cursor)) {
            return false;
        }
        cursor += LmocpField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = transactTime.encode(data, cursor);
        cursor = symbolId.encode(data, cursor);
        cursor = nyseSymbol.encode(data, cursor);
        cursor = book.encode(data, cursor);
        cursor = mpid.encode(data, cursor);
        cursor = dmmUnitNum.encode(data, cursor);
        cursor = post.encode(data, cursor);
        cursor = medianVolume.encode(data, cursor);
        cursor = rdSeq.encode(data, cursor);
        cursor = ridgePrice.encode(data, cursor);
        cursor = ppp1.encode(data, cursor);
        cursor = ppp2.encode(data, cursor);
        cursor = ppp3.encode(data, cursor);
        cursor = openOnTradeMaxQty.encode(data, cursor);
        cursor = closeOnTradeMaxQty.encode(data, cursor);
        cursor = lmocp.encode(data, cursor);
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
            case "TransactTime" -> Optional.of(transactTime);
            case "SymbolId" -> Optional.of(symbolId);
            case "NyseSymbol" -> Optional.of(nyseSymbol);
            case "Book" -> Optional.of(book);
            case "Mpid" -> Optional.of(mpid);
            case "DmmUnitNum" -> Optional.of(dmmUnitNum);
            case "Post" -> Optional.of(post);
            case "MedianVolume" -> Optional.of(medianVolume);
            case "RdSeq" -> Optional.of(rdSeq);
            case "RidgePrice" -> Optional.of(ridgePrice);
            case "Ppp1" -> Optional.of(ppp1);
            case "Ppp2" -> Optional.of(ppp2);
            case "Ppp3" -> Optional.of(ppp3);
            case "OpenOnTradeMaxQty" -> Optional.of(openOnTradeMaxQty);
            case "CloseOnTradeMaxQty" -> Optional.of(closeOnTradeMaxQty);
            case "Lmocp" -> Optional.of(lmocp);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof DmmSymbolReferenceDataMessage message)) {
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
        if (!(other instanceof DmmSymbolReferenceDataMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
