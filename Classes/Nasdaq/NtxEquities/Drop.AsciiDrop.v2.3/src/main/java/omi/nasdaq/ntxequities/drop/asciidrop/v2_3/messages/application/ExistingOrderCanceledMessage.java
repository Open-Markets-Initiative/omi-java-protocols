package omi.nasdaq.ntxequities.drop.asciidrop.v2_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.fields.BboWeightingIndicatorField;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.fields.BuySellField;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.fields.CapacityField;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.fields.ClearingCodeField;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.fields.DisplayField;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.fields.FirmField;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.fields.IsoFlagField;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.fields.LiquidityCodeField;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.fields.MinimumQuantityField;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.fields.PriceField;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.fields.ReferenceField;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.fields.ReplacedTokenField;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.fields.SharesField;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.fields.SourceField;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.fields.StockField;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.fields.TimeInForceField;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.fields.TokenField;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.fields.UserField;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.types.Field;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.types.Message;
import omi.nasdaq.ntxequities.drop.asciidrop.v2_3.types.PrintOptions;

/**
 * Represents the ExistingOrderCanceledMessage message from the Drop protocol.
 *
 * <p>Existing order canceled.</p>
 */
public final class ExistingOrderCanceledMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'X';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 114;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Existing Order Canceled Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 1, 7, 1, 12, 1, 23, 1, 34, 1, 36, 1, 43, 1, 52, 1, 64, 1, 69, 1, 82, 1, 95, 1, 97, 1, 99, 1, 101, 1, 103, 1, 105, 1, 107, 1 };

    /**
     * The source of the order. Typically the account of the OUCH port used to enter the order, but can also have the special value "$PHON " for orders received via the phone desk.
     */
    private final SourceField source = new SourceField();

    /**
     * The free form User field as specified by the order entry firm when the order was entered.
     */
    private final UserField user = new UserField();

    /**
     * The free form Token field as specified by the order entry firm when the order was entered.
     */
    private final TokenField token = new TokenField();

    /**
     * The free form Token field as specified by the order entry firm when the order was entered. Only used on a replaced message.
     */
    private final ReplacedTokenField replacedToken = new ReplacedTokenField();

    /**
     * The side of the trade executed.
     */
    private final BuySellField buySell = new BuySellField();

    /**
     * For a new order accept, the total number of shares entered; for a cancel, the incremental number of shares canceled; for an execution, the incremental number of shares executed in this trade; for a broken execution, the number of shares in the previously transmitted execution.
     */
    private final SharesField shares = new SharesField();

    /**
     * The stock symbol.
     */
    private final StockField stock = new StockField();

    /**
     * For a new order accepted, the limit price of the order; for an execution, the execution price; for a cancel, the limit price of the open order.
     */
    private final PriceField price = new PriceField();

    /**
     * The order entry firm.
     */
    private final FirmField firm = new FirmField();

    /**
     * The order unique reference number assigned by Nasdaq to this order.
     */
    private final ReferenceField reference = new ReferenceField();

    /**
     * On messages other than executions and breaks the Match field carries the order's Time in Force (TIF).
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * The capacity as specified by the order entry firm.
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * For execution messages, the liquidity code value.
     */
    private final LiquidityCodeField liquidityCode = new LiquidityCodeField();

    /**
     * The clearing path this trade will take.
     */
    private final ClearingCodeField clearingCode = new ClearingCodeField();

    /**
     * Intermarket sweep order flag.
     */
    private final IsoFlagField isoFlag = new IsoFlagField();

    /**
     * Accepted order display indicator.
     */
    private final DisplayField display = new DisplayField();

    /**
     * BBO weighting indicator.
     */
    private final BboWeightingIndicatorField bboWeightingIndicator = new BboWeightingIndicatorField();

    /**
     * Minimum executable quantity.
     */
    private final MinimumQuantityField minimumQuantity = new MinimumQuantityField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(source, user, token, replacedToken, buySell, shares, stock, price, firm, reference, timeInForce, capacity, liquidityCode, clearingCode, isoFlag, display, bboWeightingIndicator, minimumQuantity);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The source of the order. Typically the account of the OUCH port used to enter the order, but can also have the special value "$PHON " for orders received via the phone desk.
     *
     * @return the Source field
     */
    public SourceField source() {
        return source;
    }

    /**
     * The free form User field as specified by the order entry firm when the order was entered.
     *
     * @return the User field
     */
    public UserField user() {
        return user;
    }

    /**
     * The free form Token field as specified by the order entry firm when the order was entered.
     *
     * @return the Token field
     */
    public TokenField token() {
        return token;
    }

    /**
     * The free form Token field as specified by the order entry firm when the order was entered. Only used on a replaced message.
     *
     * @return the ReplacedToken field
     */
    public ReplacedTokenField replacedToken() {
        return replacedToken;
    }

    /**
     * The side of the trade executed.
     *
     * @return the BuySell field
     */
    public BuySellField buySell() {
        return buySell;
    }

    /**
     * For a new order accept, the total number of shares entered; for a cancel, the incremental number of shares canceled; for an execution, the incremental number of shares executed in this trade; for a broken execution, the number of shares in the previously transmitted execution.
     *
     * @return the Shares field
     */
    public SharesField shares() {
        return shares;
    }

    /**
     * The stock symbol.
     *
     * @return the Stock field
     */
    public StockField stock() {
        return stock;
    }

    /**
     * For a new order accepted, the limit price of the order; for an execution, the execution price; for a cancel, the limit price of the open order.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The order entry firm.
     *
     * @return the Firm field
     */
    public FirmField firm() {
        return firm;
    }

    /**
     * The order unique reference number assigned by Nasdaq to this order.
     *
     * @return the Reference field
     */
    public ReferenceField reference() {
        return reference;
    }

    /**
     * On messages other than executions and breaks the Match field carries the order's Time in Force (TIF).
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * The capacity as specified by the order entry firm.
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * For execution messages, the liquidity code value.
     *
     * @return the LiquidityCode field
     */
    public LiquidityCodeField liquidityCode() {
        return liquidityCode;
    }

    /**
     * The clearing path this trade will take.
     *
     * @return the ClearingCode field
     */
    public ClearingCodeField clearingCode() {
        return clearingCode;
    }

    /**
     * Intermarket sweep order flag.
     *
     * @return the IsoFlag field
     */
    public IsoFlagField isoFlag() {
        return isoFlag;
    }

    /**
     * Accepted order display indicator.
     *
     * @return the Display field
     */
    public DisplayField display() {
        return display;
    }

    /**
     * BBO weighting indicator.
     *
     * @return the BboWeightingIndicator field
     */
    public BboWeightingIndicatorField bboWeightingIndicator() {
        return bboWeightingIndicator;
    }

    /**
     * Minimum executable quantity.
     *
     * @return the MinimumQuantity field
     */
    public MinimumQuantityField minimumQuantity() {
        return minimumQuantity;
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
        cursor += 1; // padding
        if (!source.parse(data, cursor)) {
            return false;
        }
        cursor += SourceField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!user.parse(data, cursor)) {
            return false;
        }
        cursor += UserField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!token.parse(data, cursor)) {
            return false;
        }
        cursor += TokenField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!replacedToken.parse(data, cursor)) {
            return false;
        }
        cursor += ReplacedTokenField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!buySell.parse(data, cursor)) {
            return false;
        }
        cursor += BuySellField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!shares.parse(data, cursor)) {
            return false;
        }
        cursor += SharesField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!stock.parse(data, cursor)) {
            return false;
        }
        cursor += StockField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!firm.parse(data, cursor)) {
            return false;
        }
        cursor += FirmField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!reference.parse(data, cursor)) {
            return false;
        }
        cursor += ReferenceField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!liquidityCode.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityCodeField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!clearingCode.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingCodeField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!isoFlag.parse(data, cursor)) {
            return false;
        }
        cursor += IsoFlagField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!display.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!bboWeightingIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BboWeightingIndicatorField.BYTE_LENGTH;
        cursor += 1; // padding
        return minimumQuantity.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        if (buffer != null && buffer.length >= 1) {
            System.arraycopy(buffer, 0, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = source.encode(data, cursor);
        if (buffer != null && buffer.length >= 8) {
            System.arraycopy(buffer, 7, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = user.encode(data, cursor);
        if (buffer != null && buffer.length >= 13) {
            System.arraycopy(buffer, 12, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = token.encode(data, cursor);
        if (buffer != null && buffer.length >= 24) {
            System.arraycopy(buffer, 23, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = replacedToken.encode(data, cursor);
        if (buffer != null && buffer.length >= 35) {
            System.arraycopy(buffer, 34, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = buySell.encode(data, cursor);
        if (buffer != null && buffer.length >= 37) {
            System.arraycopy(buffer, 36, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = shares.encode(data, cursor);
        if (buffer != null && buffer.length >= 44) {
            System.arraycopy(buffer, 43, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = stock.encode(data, cursor);
        if (buffer != null && buffer.length >= 53) {
            System.arraycopy(buffer, 52, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = price.encode(data, cursor);
        if (buffer != null && buffer.length >= 65) {
            System.arraycopy(buffer, 64, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = firm.encode(data, cursor);
        if (buffer != null && buffer.length >= 70) {
            System.arraycopy(buffer, 69, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = reference.encode(data, cursor);
        if (buffer != null && buffer.length >= 83) {
            System.arraycopy(buffer, 82, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = timeInForce.encode(data, cursor);
        if (buffer != null && buffer.length >= 96) {
            System.arraycopy(buffer, 95, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = capacity.encode(data, cursor);
        if (buffer != null && buffer.length >= 98) {
            System.arraycopy(buffer, 97, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = liquidityCode.encode(data, cursor);
        if (buffer != null && buffer.length >= 100) {
            System.arraycopy(buffer, 99, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = clearingCode.encode(data, cursor);
        if (buffer != null && buffer.length >= 102) {
            System.arraycopy(buffer, 101, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = isoFlag.encode(data, cursor);
        if (buffer != null && buffer.length >= 104) {
            System.arraycopy(buffer, 103, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = display.encode(data, cursor);
        if (buffer != null && buffer.length >= 106) {
            System.arraycopy(buffer, 105, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = bboWeightingIndicator.encode(data, cursor);
        if (buffer != null && buffer.length >= 108) {
            System.arraycopy(buffer, 107, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = minimumQuantity.encode(data, cursor);
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
            case "Source" -> Optional.of(source);
            case "User" -> Optional.of(user);
            case "Token" -> Optional.of(token);
            case "ReplacedToken" -> Optional.of(replacedToken);
            case "BuySell" -> Optional.of(buySell);
            case "Shares" -> Optional.of(shares);
            case "Stock" -> Optional.of(stock);
            case "Price" -> Optional.of(price);
            case "Firm" -> Optional.of(firm);
            case "Reference" -> Optional.of(reference);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "Capacity" -> Optional.of(capacity);
            case "LiquidityCode" -> Optional.of(liquidityCode);
            case "ClearingCode" -> Optional.of(clearingCode);
            case "IsoFlag" -> Optional.of(isoFlag);
            case "Display" -> Optional.of(display);
            case "BboWeightingIndicator" -> Optional.of(bboWeightingIndicator);
            case "MinimumQuantity" -> Optional.of(minimumQuantity);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof ExistingOrderCanceledMessage message)) {
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
        if (!(other instanceof ExistingOrderCanceledMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
