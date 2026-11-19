package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.AskPriceField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.AskSizeField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.AutoCancelField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.BidPriceField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.BidSizeField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.CapacityField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ClearingAccountField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ClientIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ClientOrderIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ExecutingTraderField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.InstrumentIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.InvestmentDecisionMakerField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.MiFidFlagsField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.NewQuotePeggedExecInstField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.PartyRoleQualifiersField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.TraderIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Field;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Message;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.PrintOptions;

/**
 * Represents the NewQuoteMessage message from the NativeTradingGateway protocol.
 *
 * <p>Allows the client to submit and update a quote.</p>
 */
public final class NewQuoteMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'S';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 77;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Quote Message";

    /**
     * Client specified identifier of the rejected message if it is available.
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * Optional Trader ID that clients may submit
     */
    private final TraderIdField traderId = new TraderIdField();

    /**
     * Clearing Account Type.
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Identifier of the instrument for which the order is submitted.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Bid price
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * Bid quantity
     */
    private final BidSizeField bidSize = new BidSizeField();

    /**
     * Offer price
     */
    private final AskPriceField askPrice = new AskPriceField();

    /**
     * Offer quantity
     */
    private final AskSizeField askSize = new AskSizeField();

    /**
     * Capacity of the order.
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Cancel orders on logout/disconnection of session
     */
    private final AutoCancelField autoCancel = new AutoCancelField();

    /**
     * Identifier of the client.
     */
    private final ClientIdField clientId = new ClientIdField();

    /**
     * Identifier of the trading member/participant who made investment decision.
     */
    private final InvestmentDecisionMakerField investmentDecisionMaker = new InvestmentDecisionMakerField();

    /**
     * Identifier of the trading member/participant who made the execution decision.
     */
    private final ExecutingTraderField executingTrader = new ExecutingTraderField();

    /**
     * Flags identifying Dea involvement, Algo and liquidity provision activity
     */
    private final MiFidFlagsField miFidFlags = new MiFidFlagsField();

    /**
     * Further qualification for the Client Id, Investment Decision Maker and Executing Trader identifiers
     */
    private final PartyRoleQualifiersField partyRoleQualifiers = new PartyRoleQualifiersField();

    /**
     * The instruction for permissioning to trade against mid-priced pegged orders.
     */
    private final NewQuotePeggedExecInstField newQuotePeggedExecInst = new NewQuotePeggedExecInstField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clientOrderId, traderId, clearingAccount, instrumentId, bidPrice, bidSize, askPrice, askSize, capacity, autoCancel, clientId, investmentDecisionMaker, executingTrader, miFidFlags, partyRoleQualifiers, newQuotePeggedExecInst);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Client specified identifier of the rejected message if it is available.
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * Optional Trader ID that clients may submit
     *
     * @return the TraderId field
     */
    public TraderIdField traderId() {
        return traderId;
    }

    /**
     * Clearing Account Type.
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
    }

    /**
     * Identifier of the instrument for which the order is submitted.
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Bid price
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * Bid quantity
     *
     * @return the BidSize field
     */
    public BidSizeField bidSize() {
        return bidSize;
    }

    /**
     * Offer price
     *
     * @return the AskPrice field
     */
    public AskPriceField askPrice() {
        return askPrice;
    }

    /**
     * Offer quantity
     *
     * @return the AskSize field
     */
    public AskSizeField askSize() {
        return askSize;
    }

    /**
     * Capacity of the order.
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Cancel orders on logout/disconnection of session
     *
     * @return the AutoCancel field
     */
    public AutoCancelField autoCancel() {
        return autoCancel;
    }

    /**
     * Identifier of the client.
     *
     * @return the ClientId field
     */
    public ClientIdField clientId() {
        return clientId;
    }

    /**
     * Identifier of the trading member/participant who made investment decision.
     *
     * @return the InvestmentDecisionMaker field
     */
    public InvestmentDecisionMakerField investmentDecisionMaker() {
        return investmentDecisionMaker;
    }

    /**
     * Identifier of the trading member/participant who made the execution decision.
     *
     * @return the ExecutingTrader field
     */
    public ExecutingTraderField executingTrader() {
        return executingTrader;
    }

    /**
     * Flags identifying Dea involvement, Algo and liquidity provision activity
     *
     * @return the MiFidFlags field
     */
    public MiFidFlagsField miFidFlags() {
        return miFidFlags;
    }

    /**
     * Further qualification for the Client Id, Investment Decision Maker and Executing Trader identifiers
     *
     * @return the PartyRoleQualifiers field
     */
    public PartyRoleQualifiersField partyRoleQualifiers() {
        return partyRoleQualifiers;
    }

    /**
     * The instruction for permissioning to trade against mid-priced pegged orders.
     *
     * @return the NewQuotePeggedExecInst field
     */
    public NewQuotePeggedExecInstField newQuotePeggedExecInst() {
        return newQuotePeggedExecInst;
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
        return new int[0];
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
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!traderId.parse(data, cursor)) {
            return false;
        }
        cursor += TraderIdField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField.BYTE_LENGTH;
        if (!bidSize.parse(data, cursor)) {
            return false;
        }
        cursor += BidSizeField.BYTE_LENGTH;
        if (!askPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AskPriceField.BYTE_LENGTH;
        if (!askSize.parse(data, cursor)) {
            return false;
        }
        cursor += AskSizeField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!autoCancel.parse(data, cursor)) {
            return false;
        }
        cursor += AutoCancelField.BYTE_LENGTH;
        if (!clientId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientIdField.BYTE_LENGTH;
        if (!investmentDecisionMaker.parse(data, cursor)) {
            return false;
        }
        cursor += InvestmentDecisionMakerField.BYTE_LENGTH;
        if (!executingTrader.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingTraderField.BYTE_LENGTH;
        if (!miFidFlags.parse(data, cursor)) {
            return false;
        }
        cursor += MiFidFlagsField.BYTE_LENGTH;
        if (!partyRoleQualifiers.parse(data, cursor)) {
            return false;
        }
        cursor += PartyRoleQualifiersField.BYTE_LENGTH;
        return newQuotePeggedExecInst.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = clientOrderId.encode(data, cursor);
        cursor = traderId.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = bidSize.encode(data, cursor);
        cursor = askPrice.encode(data, cursor);
        cursor = askSize.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = autoCancel.encode(data, cursor);
        cursor = clientId.encode(data, cursor);
        cursor = investmentDecisionMaker.encode(data, cursor);
        cursor = executingTrader.encode(data, cursor);
        cursor = miFidFlags.encode(data, cursor);
        cursor = partyRoleQualifiers.encode(data, cursor);
        cursor = newQuotePeggedExecInst.encode(data, cursor);
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
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "TraderId" -> Optional.of(traderId);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "BidPrice" -> Optional.of(bidPrice);
            case "BidSize" -> Optional.of(bidSize);
            case "AskPrice" -> Optional.of(askPrice);
            case "AskSize" -> Optional.of(askSize);
            case "Capacity" -> Optional.of(capacity);
            case "AutoCancel" -> Optional.of(autoCancel);
            case "ClientId" -> Optional.of(clientId);
            case "InvestmentDecisionMaker" -> Optional.of(investmentDecisionMaker);
            case "ExecutingTrader" -> Optional.of(executingTrader);
            case "MiFidFlags" -> Optional.of(miFidFlags);
            case "PartyRoleQualifiers" -> Optional.of(partyRoleQualifiers);
            case "NewQuotePeggedExecInst" -> Optional.of(newQuotePeggedExecInst);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewQuoteMessage message)) {
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
        if (!(other instanceof NewQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
