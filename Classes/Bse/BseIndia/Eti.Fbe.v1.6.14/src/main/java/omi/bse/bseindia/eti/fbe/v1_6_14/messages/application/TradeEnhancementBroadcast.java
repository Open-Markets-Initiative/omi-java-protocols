package omi.bse.bseindia.eti.fbe.v1_6_14.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.AccountTypeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.AutoAcceptIndicatorField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ClearingTradePriceField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ClearingTradeQtyField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.ClientCodeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.CpCodeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.MarketSegmentIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.MatchDateField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.OrderIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.RootPartyIdSessionIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.SecurityIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.SideField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.SideTradeIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.TradeIdField;
import omi.bse.bseindia.eti.fbe.v1_6_14.fields.TransactTimeField;
import omi.bse.bseindia.eti.fbe.v1_6_14.structs.RbcHeaderComp;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Field;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.Message;
import omi.bse.bseindia.eti.fbe.v1_6_14.types.PrintOptions;

/**
 * Represents the TradeEnhancementBroadcast message from the Eti protocol.
 */
public final class TradeEnhancementBroadcast implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 122;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Enhancement Broadcast";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 0, 2, 27, 7, 117, 5 };

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Clearing Trade Price
     */
    private final ClearingTradePriceField clearingTradePrice = new ClearingTradePriceField();

    /**
     * Transact Time
     */
    private final TransactTimeField transactTime = new TransactTimeField();

    /**
     * Order Id
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Trade Id
     */
    private final TradeIdField tradeId = new TradeIdField();

    /**
     * Root Party Id Session Id
     */
    private final RootPartyIdSessionIdField rootPartyIdSessionId = new RootPartyIdSessionIdField();

    /**
     * Side Trade Id
     */
    private final SideTradeIdField sideTradeId = new SideTradeIdField();

    /**
     * Market Segment Id
     */
    private final MarketSegmentIdField marketSegmentId = new MarketSegmentIdField();

    /**
     * Match Date
     */
    private final MatchDateField matchDate = new MatchDateField();

    /**
     * Clearing Trade Qty
     */
    private final ClearingTradeQtyField clearingTradeQty = new ClearingTradeQtyField();

    /**
     * Account Type
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Auto Accept Indicator
     */
    private final AutoAcceptIndicatorField autoAcceptIndicator = new AutoAcceptIndicatorField();

    /**
     * Cp Code
     */
    private final CpCodeField cpCode = new CpCodeField();

    /**
     * Client Code
     */
    private final ClientCodeField clientCode = new ClientCodeField();

    /**
     * Rbc Header Comp
     */
    private final RbcHeaderComp rbcHeaderComp = new RbcHeaderComp();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(rbcHeaderComp.fields(), List.<Field>of(securityId), List.<Field>of(clearingTradePrice), List.<Field>of(transactTime), List.<Field>of(orderId), List.<Field>of(tradeId), List.<Field>of(rootPartyIdSessionId), List.<Field>of(sideTradeId), List.<Field>of(marketSegmentId), List.<Field>of(matchDate), List.<Field>of(clearingTradeQty), List.<Field>of(accountType), List.<Field>of(side), List.<Field>of(autoAcceptIndicator), List.<Field>of(cpCode), List.<Field>of(clientCode)).flatMap(List::stream).toList();

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
     * Clearing Trade Price
     *
     * @return the ClearingTradePrice field
     */
    public ClearingTradePriceField clearingTradePrice() {
        return clearingTradePrice;
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
     * Order Id
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
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
     * Root Party Id Session Id
     *
     * @return the RootPartyIdSessionId field
     */
    public RootPartyIdSessionIdField rootPartyIdSessionId() {
        return rootPartyIdSessionId;
    }

    /**
     * Side Trade Id
     *
     * @return the SideTradeId field
     */
    public SideTradeIdField sideTradeId() {
        return sideTradeId;
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
     * Match Date
     *
     * @return the MatchDate field
     */
    public MatchDateField matchDate() {
        return matchDate;
    }

    /**
     * Clearing Trade Qty
     *
     * @return the ClearingTradeQty field
     */
    public ClearingTradeQtyField clearingTradeQty() {
        return clearingTradeQty;
    }

    /**
     * Account Type
     *
     * @return the AccountType field
     */
    public AccountTypeField accountType() {
        return accountType;
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
     * Auto Accept Indicator
     *
     * @return the AutoAcceptIndicator field
     */
    public AutoAcceptIndicatorField autoAcceptIndicator() {
        return autoAcceptIndicator;
    }

    /**
     * Cp Code
     *
     * @return the CpCode field
     */
    public CpCodeField cpCode() {
        return cpCode;
    }

    /**
     * Client Code
     *
     * @return the ClientCode field
     */
    public ClientCodeField clientCode() {
        return clientCode;
    }

    /**
     * Rbc Header Comp
     *
     * @return the RbcHeaderComp record
     */
    public RbcHeaderComp rbcHeaderComp() {
        return rbcHeaderComp;
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
        return Optional.ofNullable(rbcHeaderComp.sendingTime().value());
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
        if (!rbcHeaderComp.parseFrom(data, cursor, end - 88)) {
            return false;
        }
        cursor += rbcHeaderComp.byteLength();
        if (!securityId.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityIdField.BYTE_LENGTH;
        if (!clearingTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingTradePriceField.BYTE_LENGTH;
        if (!transactTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactTimeField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        if (!tradeId.parse(data, cursor)) {
            return false;
        }
        cursor += TradeIdField.BYTE_LENGTH;
        if (!rootPartyIdSessionId.parse(data, cursor)) {
            return false;
        }
        cursor += RootPartyIdSessionIdField.BYTE_LENGTH;
        if (!sideTradeId.parse(data, cursor)) {
            return false;
        }
        cursor += SideTradeIdField.BYTE_LENGTH;
        if (!marketSegmentId.parse(data, cursor)) {
            return false;
        }
        cursor += MarketSegmentIdField.BYTE_LENGTH;
        if (!matchDate.parse(data, cursor)) {
            return false;
        }
        cursor += MatchDateField.BYTE_LENGTH;
        if (!clearingTradeQty.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingTradeQtyField.BYTE_LENGTH;
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!autoAcceptIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += AutoAcceptIndicatorField.BYTE_LENGTH;
        if (!cpCode.parse(data, cursor)) {
            return false;
        }
        cursor += CpCodeField.BYTE_LENGTH;
        if (!clientCode.parse(data, cursor)) {
            return false;
        }
        cursor += ClientCodeField.BYTE_LENGTH;

        return true;
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
        cursor = rbcHeaderComp.encode(data, cursor);
        cursor = securityId.encode(data, cursor);
        cursor = clearingTradePrice.encode(data, cursor);
        cursor = transactTime.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = tradeId.encode(data, cursor);
        cursor = rootPartyIdSessionId.encode(data, cursor);
        cursor = sideTradeId.encode(data, cursor);
        cursor = marketSegmentId.encode(data, cursor);
        cursor = matchDate.encode(data, cursor);
        cursor = clearingTradeQty.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = autoAcceptIndicator.encode(data, cursor);
        cursor = cpCode.encode(data, cursor);
        cursor = clientCode.encode(data, cursor);
        if (buffer != null && buffer.length >= 122) {
            System.arraycopy(buffer, 117, data, cursor, 5); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 5, (byte) 0); // padding
        }
        cursor += 5;
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
        rbcHeaderComp.clear();
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
            case "SecurityId" -> Optional.of(securityId);
            case "ClearingTradePrice" -> Optional.of(clearingTradePrice);
            case "TransactTime" -> Optional.of(transactTime);
            case "OrderId" -> Optional.of(orderId);
            case "TradeId" -> Optional.of(tradeId);
            case "RootPartyIdSessionId" -> Optional.of(rootPartyIdSessionId);
            case "SideTradeId" -> Optional.of(sideTradeId);
            case "MarketSegmentId" -> Optional.of(marketSegmentId);
            case "MatchDate" -> Optional.of(matchDate);
            case "ClearingTradeQty" -> Optional.of(clearingTradeQty);
            case "AccountType" -> Optional.of(accountType);
            case "Side" -> Optional.of(side);
            case "AutoAcceptIndicator" -> Optional.of(autoAcceptIndicator);
            case "CpCode" -> Optional.of(cpCode);
            case "ClientCode" -> Optional.of(clientCode);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeEnhancementBroadcast message)) {
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
        if (!(other instanceof TradeEnhancementBroadcast message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
