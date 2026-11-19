package omi.box.boxoptions.solatradereporting.atr.v4_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.AccountTypeField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.AdditionalClientMemoField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.ClientAccountNumberField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.ClientMemoField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.ClientOrderIdField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.CmtaBrokerField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.ExecutingBrokerField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.ExpirationDateField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.LiquidityStatusField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.OpenCloseField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.OppositeAccountTypeField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.OppositeExecutingBrokerField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.OptionTypeField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.ParentTransactionIdField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.ParticipantSessionNameField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.PriceField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.StrikePriceField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.StrikePriceFractionIndicatorField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.SubTraderIdField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.SymbolField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.TimestampField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.TradeNumberField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.TradeTypeField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.TransactionTypeField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.UniqueTransactionIdField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.fields.VolumeField;
import omi.box.boxoptions.solatradereporting.atr.v4_5.types.Field;
import omi.box.boxoptions.solatradereporting.atr.v4_5.types.Message;
import omi.box.boxoptions.solatradereporting.atr.v4_5.types.PrintOptions;

/**
 * Represents the Trade message from the SolaTradeReporting protocol.
 *
 * <p>The guide heads this message 212 bytes, while the fields it states measure 228 including the 28 byte header.</p>
 */
public final class Trade implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 200;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade";

    /**
     * Standard TradeId consisting of: Side field: only the first letter of the verb, i.e., "B" for Buy and "S" for Sell InstrumentId and GroupId field TradeId field
     */
    private final TradeNumberField tradeNumber = new TradeNumberField();

    /**
     * Side of the trader in the present trade B: Buy S: Sell
     */
    private final TransactionTypeField transactionType = new TransactionTypeField();

    /**
     * Time at which the trade occurred (Eastern Time) HHMMSS
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Instrument symbol Left justified, Blank padded
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Expiration date of the instrument YYMMDD
     */
    private final ExpirationDateField expirationDate = new ExpirationDateField();

    /**
     * Option Strike Price The format is defined by the new field ‘Strike Price Fraction Indicator’. Filled with zero when the instrument is not an option Right justified, Zero padded
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * Define the number of decimal places or fraction positions
     */
    private final StrikePriceFractionIndicatorField strikePriceFractionIndicator = new StrikePriceFractionIndicatorField();

    /**
     * C: Call P: Put Blank: If not an option
     */
    private final OptionTypeField optionType = new OptionTypeField();

    /**
     * Volume of the trade Right justified, Zero padded
     */
    private final VolumeField volume = new VolumeField();

    /**
     * Transaction price Right justified, Zero padded
     */
    private final PriceField price = new PriceField();

    /**
     * Contains the numeric portion of the Firm ID who will receive the trade in a CMTA
     */
    private final CmtaBrokerField cmtaBroker = new CmtaBrokerField();

    /**
     * Account type of the Executing Broker of the trade 6: Public Customer 7: Broker Dealer 8: Market Maker T: Professional Customer V: Floor Broker Customer W: Broker Dealer cleared as Customer X: Away Market Maker Y: Floor Broker Dealer Z: Floor Market Maker FLEX Symbology: Symbol is prefixed by one of the following: ‘1’ (American FLEX Option, Physical-Settled) ‘2’ (European FLEX Option, Physical-Settled) ‘3’ (American FLEX Option, Cash-Settled) ‘4’ (European FLEX Option, Cash-Settled)
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * For Allocation (40) and Allocation Cancel (41) messages, the 'Sub-trader ID' field contains the Market Maker OCC sub-account. For Trade (30) and Trade Cancel (31) messages, the ‘Sub-trader ID’ field contains the last 2 digits of the Trader ID.
     */
    private final SubTraderIdField subTraderId = new SubTraderIdField();

    /**
     * Position of the trade O: Open C: Close
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Contains the numeric portion of the BOX Participant ID executing the trade In the [0001,9999] range Right justified, zero padded
     */
    private final ExecutingBrokerField executingBroker = new ExecutingBrokerField();

    /**
     * Left justified, right blank filled Used with Client Order ID and Client Memo for Order Identification
     */
    private final ClientAccountNumberField clientAccountNumber = new ClientAccountNumberField();

    /**
     * Left justified, right blank filled Used with Client Account Number and Client Memo for Order Identification
     */
    private final ClientOrderIdField clientOrderId = new ClientOrderIdField();

    /**
     * Left justified, right blank filled Used with Client Account Number and Client Order ID for Order Identification
     */
    private final ClientMemoField clientMemo = new ClientMemoField();

    /**
     * Possible values: ? : Unknown ’ ’: None M: Maker T: Taker
     */
    private final LiquidityStatusField liquidityStatus = new LiquidityStatusField();

    /**
     * Possible values: N: Normal – A regular trade O: CrossedOrders – A trade with the same Firm ID on both sides T: TraderCrossedOrders – A trade with the same Trader ID on both sides M: TPR Trade – A trade done by a Third Party Router P: PIP – A trade done at the end of a PIP auction F: FirmDo – A trade resulting from a Directed Order A: AsOf – A trade entered by the BOX MOC to correct a trade executed on a previous day E: Late – A trade entered by the BOX MOC to correct a trade executed on the same day S: Solicitation – A trade done as part of a Solicitation auction I: Facilitation – A trade done as part of a Facilitation auction R: FloorTrade C: Customer Cross Orders or Qualified Contingent Cross Orders
     */
    private final TradeTypeField tradeType = new TradeTypeField();

    /**
     * Account type of the opposite Executing Broker of the trade 6: Public Customer 7: Broker Dealer 8: Market Maker T: Professional Customer V: Floor Broker Customer W: Broker Dealer cleared as Customer X: Away Market Maker Y: Floor Broker Dealer Z: Floor Market Maker
     */
    private final OppositeAccountTypeField oppositeAccountType = new OppositeAccountTypeField();

    /**
     * Session Name of the Participant who executed the trade Filled for Regular (Trade, Trade Cancel, Allocation and Allocation Cancel) Empty for AsOf (Trade, Trade Cancel, Allocation and Allocation Cancel) when TradeType is ‘A’ (AsOf)
     */
    private final ParticipantSessionNameField participantSessionName = new ParticipantSessionNameField();

    /**
     * Unique Identification for this message. Applies to: Trade (30) Trade Cancel (31) Allocation (40) Allocation Cancel (41)
     */
    private final UniqueTransactionIdField uniqueTransactionId = new UniqueTransactionIdField();

    /**
     * This field will be empty for Trade(30) and TradeCancel (31) Otherwise, it identifies the Parent Transaction Id of of the Trade For example: For an Allocation, the Unique Transaction Id is for the Allocation message, and the Parent Transaction Id refers to its parent Trade under which the Allocation was created
     */
    private final ParentTransactionIdField parentTransactionId = new ParentTransactionIdField();

    /**
     * Populated with the Counterpart Executing Firm ID when the message is sent to the Executing Broker Otherwise will be filled with ‘0000’.
     */
    private final OppositeExecutingBrokerField oppositeExecutingBroker = new OppositeExecutingBrokerField();

    /**
     * Left justified, right blank filled Free text field
     */
    private final AdditionalClientMemoField additionalClientMemo = new AdditionalClientMemoField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(tradeNumber, transactionType, timestampField, symbol, expirationDate, strikePrice, strikePriceFractionIndicator, optionType, volume, price, cmtaBroker, accountType, subTraderId, openClose, executingBroker, clientAccountNumber, clientOrderId, clientMemo, liquidityStatus, tradeType, oppositeAccountType, participantSessionName, uniqueTransactionId, parentTransactionId, oppositeExecutingBroker, additionalClientMemo);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Standard TradeId consisting of: Side field: only the first letter of the verb, i.e., "B" for Buy and "S" for Sell InstrumentId and GroupId field TradeId field
     *
     * @return the TradeNumber field
     */
    public TradeNumberField tradeNumber() {
        return tradeNumber;
    }

    /**
     * Side of the trader in the present trade B: Buy S: Sell
     *
     * @return the TransactionType field
     */
    public TransactionTypeField transactionType() {
        return transactionType;
    }

    /**
     * Time at which the trade occurred (Eastern Time) HHMMSS
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Instrument symbol Left justified, Blank padded
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Expiration date of the instrument YYMMDD
     *
     * @return the ExpirationDate field
     */
    public ExpirationDateField expirationDate() {
        return expirationDate;
    }

    /**
     * Option Strike Price The format is defined by the new field ‘Strike Price Fraction Indicator’. Filled with zero when the instrument is not an option Right justified, Zero padded
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * Define the number of decimal places or fraction positions
     *
     * @return the StrikePriceFractionIndicator field
     */
    public StrikePriceFractionIndicatorField strikePriceFractionIndicator() {
        return strikePriceFractionIndicator;
    }

    /**
     * C: Call P: Put Blank: If not an option
     *
     * @return the OptionType field
     */
    public OptionTypeField optionType() {
        return optionType;
    }

    /**
     * Volume of the trade Right justified, Zero padded
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * Transaction price Right justified, Zero padded
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Contains the numeric portion of the Firm ID who will receive the trade in a CMTA
     *
     * @return the CmtaBroker field
     */
    public CmtaBrokerField cmtaBroker() {
        return cmtaBroker;
    }

    /**
     * Account type of the Executing Broker of the trade 6: Public Customer 7: Broker Dealer 8: Market Maker T: Professional Customer V: Floor Broker Customer W: Broker Dealer cleared as Customer X: Away Market Maker Y: Floor Broker Dealer Z: Floor Market Maker FLEX Symbology: Symbol is prefixed by one of the following: ‘1’ (American FLEX Option, Physical-Settled) ‘2’ (European FLEX Option, Physical-Settled) ‘3’ (American FLEX Option, Cash-Settled) ‘4’ (European FLEX Option, Cash-Settled)
     *
     * @return the AccountType field
     */
    public AccountTypeField accountType() {
        return accountType;
    }

    /**
     * For Allocation (40) and Allocation Cancel (41) messages, the 'Sub-trader ID' field contains the Market Maker OCC sub-account. For Trade (30) and Trade Cancel (31) messages, the ‘Sub-trader ID’ field contains the last 2 digits of the Trader ID.
     *
     * @return the SubTraderId field
     */
    public SubTraderIdField subTraderId() {
        return subTraderId;
    }

    /**
     * Position of the trade O: Open C: Close
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * Contains the numeric portion of the BOX Participant ID executing the trade In the [0001,9999] range Right justified, zero padded
     *
     * @return the ExecutingBroker field
     */
    public ExecutingBrokerField executingBroker() {
        return executingBroker;
    }

    /**
     * Left justified, right blank filled Used with Client Order ID and Client Memo for Order Identification
     *
     * @return the ClientAccountNumber field
     */
    public ClientAccountNumberField clientAccountNumber() {
        return clientAccountNumber;
    }

    /**
     * Left justified, right blank filled Used with Client Account Number and Client Memo for Order Identification
     *
     * @return the ClientOrderId field
     */
    public ClientOrderIdField clientOrderId() {
        return clientOrderId;
    }

    /**
     * Left justified, right blank filled Used with Client Account Number and Client Order ID for Order Identification
     *
     * @return the ClientMemo field
     */
    public ClientMemoField clientMemo() {
        return clientMemo;
    }

    /**
     * Possible values: ? : Unknown ’ ’: None M: Maker T: Taker
     *
     * @return the LiquidityStatus field
     */
    public LiquidityStatusField liquidityStatus() {
        return liquidityStatus;
    }

    /**
     * Possible values: N: Normal – A regular trade O: CrossedOrders – A trade with the same Firm ID on both sides T: TraderCrossedOrders – A trade with the same Trader ID on both sides M: TPR Trade – A trade done by a Third Party Router P: PIP – A trade done at the end of a PIP auction F: FirmDo – A trade resulting from a Directed Order A: AsOf – A trade entered by the BOX MOC to correct a trade executed on a previous day E: Late – A trade entered by the BOX MOC to correct a trade executed on the same day S: Solicitation – A trade done as part of a Solicitation auction I: Facilitation – A trade done as part of a Facilitation auction R: FloorTrade C: Customer Cross Orders or Qualified Contingent Cross Orders
     *
     * @return the TradeType field
     */
    public TradeTypeField tradeType() {
        return tradeType;
    }

    /**
     * Account type of the opposite Executing Broker of the trade 6: Public Customer 7: Broker Dealer 8: Market Maker T: Professional Customer V: Floor Broker Customer W: Broker Dealer cleared as Customer X: Away Market Maker Y: Floor Broker Dealer Z: Floor Market Maker
     *
     * @return the OppositeAccountType field
     */
    public OppositeAccountTypeField oppositeAccountType() {
        return oppositeAccountType;
    }

    /**
     * Session Name of the Participant who executed the trade Filled for Regular (Trade, Trade Cancel, Allocation and Allocation Cancel) Empty for AsOf (Trade, Trade Cancel, Allocation and Allocation Cancel) when TradeType is ‘A’ (AsOf)
     *
     * @return the ParticipantSessionName field
     */
    public ParticipantSessionNameField participantSessionName() {
        return participantSessionName;
    }

    /**
     * Unique Identification for this message. Applies to: Trade (30) Trade Cancel (31) Allocation (40) Allocation Cancel (41)
     *
     * @return the UniqueTransactionId field
     */
    public UniqueTransactionIdField uniqueTransactionId() {
        return uniqueTransactionId;
    }

    /**
     * This field will be empty for Trade(30) and TradeCancel (31) Otherwise, it identifies the Parent Transaction Id of of the Trade For example: For an Allocation, the Unique Transaction Id is for the Allocation message, and the Parent Transaction Id refers to its parent Trade under which the Allocation was created
     *
     * @return the ParentTransactionId field
     */
    public ParentTransactionIdField parentTransactionId() {
        return parentTransactionId;
    }

    /**
     * Populated with the Counterpart Executing Firm ID when the message is sent to the Executing Broker Otherwise will be filled with ‘0000’.
     *
     * @return the OppositeExecutingBroker field
     */
    public OppositeExecutingBrokerField oppositeExecutingBroker() {
        return oppositeExecutingBroker;
    }

    /**
     * Left justified, right blank filled Free text field
     *
     * @return the AdditionalClientMemo field
     */
    public AdditionalClientMemoField additionalClientMemo() {
        return additionalClientMemo;
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
        if (!tradeNumber.parse(data, cursor)) {
            return false;
        }
        cursor += TradeNumberField.BYTE_LENGTH;
        if (!transactionType.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTypeField.BYTE_LENGTH;
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!expirationDate.parse(data, cursor)) {
            return false;
        }
        cursor += ExpirationDateField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!strikePriceFractionIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceFractionIndicatorField.BYTE_LENGTH;
        if (!optionType.parse(data, cursor)) {
            return false;
        }
        cursor += OptionTypeField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!cmtaBroker.parse(data, cursor)) {
            return false;
        }
        cursor += CmtaBrokerField.BYTE_LENGTH;
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (!subTraderId.parse(data, cursor)) {
            return false;
        }
        cursor += SubTraderIdField.BYTE_LENGTH;
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        if (!executingBroker.parse(data, cursor)) {
            return false;
        }
        cursor += ExecutingBrokerField.BYTE_LENGTH;
        if (!clientAccountNumber.parse(data, cursor)) {
            return false;
        }
        cursor += ClientAccountNumberField.BYTE_LENGTH;
        if (!clientOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ClientOrderIdField.BYTE_LENGTH;
        if (!clientMemo.parse(data, cursor)) {
            return false;
        }
        cursor += ClientMemoField.BYTE_LENGTH;
        if (!liquidityStatus.parse(data, cursor)) {
            return false;
        }
        cursor += LiquidityStatusField.BYTE_LENGTH;
        if (!tradeType.parse(data, cursor)) {
            return false;
        }
        cursor += TradeTypeField.BYTE_LENGTH;
        if (!oppositeAccountType.parse(data, cursor)) {
            return false;
        }
        cursor += OppositeAccountTypeField.BYTE_LENGTH;
        if (!participantSessionName.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantSessionNameField.BYTE_LENGTH;
        if (!uniqueTransactionId.parse(data, cursor)) {
            return false;
        }
        cursor += UniqueTransactionIdField.BYTE_LENGTH;
        if (!parentTransactionId.parse(data, cursor)) {
            return false;
        }
        cursor += ParentTransactionIdField.BYTE_LENGTH;
        if (!oppositeExecutingBroker.parse(data, cursor)) {
            return false;
        }
        cursor += OppositeExecutingBrokerField.BYTE_LENGTH;
        return additionalClientMemo.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = tradeNumber.encode(data, cursor);
        cursor = transactionType.encode(data, cursor);
        cursor = timestampField.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = expirationDate.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = strikePriceFractionIndicator.encode(data, cursor);
        cursor = optionType.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = cmtaBroker.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = subTraderId.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = executingBroker.encode(data, cursor);
        cursor = clientAccountNumber.encode(data, cursor);
        cursor = clientOrderId.encode(data, cursor);
        cursor = clientMemo.encode(data, cursor);
        cursor = liquidityStatus.encode(data, cursor);
        cursor = tradeType.encode(data, cursor);
        cursor = oppositeAccountType.encode(data, cursor);
        cursor = participantSessionName.encode(data, cursor);
        cursor = uniqueTransactionId.encode(data, cursor);
        cursor = parentTransactionId.encode(data, cursor);
        cursor = oppositeExecutingBroker.encode(data, cursor);
        cursor = additionalClientMemo.encode(data, cursor);
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
            case "TradeNumber" -> Optional.of(tradeNumber);
            case "TransactionType" -> Optional.of(transactionType);
            case "Timestamp" -> Optional.of(timestampField);
            case "Symbol" -> Optional.of(symbol);
            case "ExpirationDate" -> Optional.of(expirationDate);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "StrikePriceFractionIndicator" -> Optional.of(strikePriceFractionIndicator);
            case "OptionType" -> Optional.of(optionType);
            case "Volume" -> Optional.of(volume);
            case "Price" -> Optional.of(price);
            case "CmtaBroker" -> Optional.of(cmtaBroker);
            case "AccountType" -> Optional.of(accountType);
            case "SubTraderId" -> Optional.of(subTraderId);
            case "OpenClose" -> Optional.of(openClose);
            case "ExecutingBroker" -> Optional.of(executingBroker);
            case "ClientAccountNumber" -> Optional.of(clientAccountNumber);
            case "ClientOrderId" -> Optional.of(clientOrderId);
            case "ClientMemo" -> Optional.of(clientMemo);
            case "LiquidityStatus" -> Optional.of(liquidityStatus);
            case "TradeType" -> Optional.of(tradeType);
            case "OppositeAccountType" -> Optional.of(oppositeAccountType);
            case "ParticipantSessionName" -> Optional.of(participantSessionName);
            case "UniqueTransactionId" -> Optional.of(uniqueTransactionId);
            case "ParentTransactionId" -> Optional.of(parentTransactionId);
            case "OppositeExecutingBroker" -> Optional.of(oppositeExecutingBroker);
            case "AdditionalClientMemo" -> Optional.of(additionalClientMemo);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof Trade message)) {
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
        if (!(other instanceof Trade message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
