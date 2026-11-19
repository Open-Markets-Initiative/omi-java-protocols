package omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.AccountTypeField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.AutoRfqExecStrategyField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ClientIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ContraFirmField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ContraTraderField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ExecutingTraderField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ExpireTimeField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.ExpireTimeMillisecondsField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.InstrumentIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.InvestmentDecisionMakerField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.MarketMakerRankField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.MarketMakersField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.MiFidFlagsField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.NumOfCompetitorsField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.OrderBookField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.OrderCapacityField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.OrderQuantityField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.PartitionIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.PartyRoleQualifiersField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.PriceField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.PrivateQuoteField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.QuoteReqIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.QuoteRequestTypeField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.RfqDiscloseSideField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.RfqExecutionDelayField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.RfqIdField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.RfqMinQuotesField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.SequenceNumberField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.fields.SideField;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Field;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.Message;
import omi.lseg.millennium.nativetradinggateway.ntgi.v21_2.types.PrintOptions;

/**
 * Represents the QuoteRequestMessage message from the NativeTradingGateway protocol.
 *
 * <p>Carries a Request For Quote. Sent by the Requester to submit an RFQ, and by the server to deliver it to the Market Maker.</p>
 */
public final class QuoteRequestMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'a';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 157;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Quote Request Message";

    /**
     * The server will stamp the identifier of the matching partition for the instrument
     */
    private final PartitionIdField partitionId = new PartitionIdField();

    /**
     * The server will stamp the message sequence number of the matching partition.
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Client specified identifier of the RFQ.
     */
    private final QuoteReqIdField quoteReqId = new QuoteReqIdField();

    /**
     * Order Book
     */
    private final OrderBookField orderBook = new OrderBookField();

    /**
     * Private Quote
     */
    private final PrivateQuoteField privateQuote = new PrivateQuoteField();

    /**
     * Identifier of the instrument for which the order is submitted.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Side of the order.
     */
    private final SideField side = new SideField();

    /**
     * Quantity that the Requester is expecting to trade.
     */
    private final OrderQuantityField orderQuantity = new OrderQuantityField();

    /**
     * Indicates the date or the time the RFQ expires, in Unix (Posix) time format (number of seconds after 1 January 1970).
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Pipe separated list of Firm IDs, if it is required to target this quote request to specific Market Makers.
     */
    private final MarketMakersField marketMakers = new MarketMakersField();

    /**
     * For Named Models only, the server will stamp the User ID of the Requester to send to the Market Maker.
     */
    private final ContraTraderField contraTrader = new ContraTraderField();

    /**
     * For Named Models only, the server will stamp the Firm ID of the Requester to send to the Market Maker.
     */
    private final ContraFirmField contraFirm = new ContraFirmField();

    /**
     * Identifier of the initial RFQ by the Requester.
     */
    private final RfqIdField rfqId = new RfqIdField();

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
     * Indicates the type of Quote Request
     */
    private final QuoteRequestTypeField quoteRequestType = new QuoteRequestTypeField();

    /**
     * Limit Price.
     */
    private final PriceField price = new PriceField();

    /**
     * The minimum number of seconds from the time of RFQ submission to be elapsed for the RFQ execution to be triggered automatically.
     */
    private final RfqExecutionDelayField rfqExecutionDelay = new RfqExecutionDelayField();

    /**
     * The minimum number of market maker quotes to be available for the RFQ execution to be triggered automatically.
     */
    private final RfqMinQuotesField rfqMinQuotes = new RfqMinQuotesField();

    /**
     * Clearing Account Type.
     */
    private final AccountTypeField accountType = new AccountTypeField();

    /**
     * Capacity of the RFQ.
     */
    private final OrderCapacityField orderCapacity = new OrderCapacityField();

    /**
     * Instructs the system whether to disclose the side of the request as stated in the Side field to the market makers or not.
     */
    private final RfqDiscloseSideField rfqDiscloseSide = new RfqDiscloseSideField();

    /**
     * Indicates the number of milliseconds to be added to the date or the time the RFQ expires on specified in the ‘Expire Time’ field.
     */
    private final ExpireTimeMillisecondsField expireTimeMilliseconds = new ExpireTimeMillisecondsField();

    /**
     * This field will include the applicable Auto RFQ Execution Strategy ‘Sub LIS Auction with Order Book Sweep or LIS Winner Takes All’ model.
     */
    private final AutoRfqExecStrategyField autoRfqExecStrategy = new AutoRfqExecStrategyField();

    /**
     * The number of competing Respondents (the total number of market maker firms) the quote request has been routed to.
     */
    private final NumOfCompetitorsField numOfCompetitors = new NumOfCompetitorsField();

    /**
     * The rank of the market makers the request should be routed to.
     */
    private final MarketMakerRankField marketMakerRank = new MarketMakerRankField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(partitionId, sequenceNumber, quoteReqId, orderBook, privateQuote, instrumentId, side, orderQuantity, expireTime, marketMakers, contraTrader, contraFirm, rfqId, clientId, investmentDecisionMaker, executingTrader, miFidFlags, partyRoleQualifiers, quoteRequestType, price, rfqExecutionDelay, rfqMinQuotes, accountType, orderCapacity, rfqDiscloseSide, expireTimeMilliseconds, autoRfqExecStrategy, numOfCompetitors, marketMakerRank);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The server will stamp the identifier of the matching partition for the instrument
     *
     * @return the PartitionId field
     */
    public PartitionIdField partitionId() {
        return partitionId;
    }

    /**
     * The server will stamp the message sequence number of the matching partition.
     *
     * @return the SequenceNumber field
     */
    public SequenceNumberField sequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Client specified identifier of the RFQ.
     *
     * @return the QuoteReqId field
     */
    public QuoteReqIdField quoteReqId() {
        return quoteReqId;
    }

    /**
     * Order Book
     *
     * @return the OrderBook field
     */
    public OrderBookField orderBook() {
        return orderBook;
    }

    /**
     * Private Quote
     *
     * @return the PrivateQuote field
     */
    public PrivateQuoteField privateQuote() {
        return privateQuote;
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
     * Side of the order.
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Quantity that the Requester is expecting to trade.
     *
     * @return the OrderQuantity field
     */
    public OrderQuantityField orderQuantity() {
        return orderQuantity;
    }

    /**
     * Indicates the date or the time the RFQ expires, in Unix (Posix) time format (number of seconds after 1 January 1970).
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
    }

    /**
     * Pipe separated list of Firm IDs, if it is required to target this quote request to specific Market Makers.
     *
     * @return the MarketMakers field
     */
    public MarketMakersField marketMakers() {
        return marketMakers;
    }

    /**
     * For Named Models only, the server will stamp the User ID of the Requester to send to the Market Maker.
     *
     * @return the ContraTrader field
     */
    public ContraTraderField contraTrader() {
        return contraTrader;
    }

    /**
     * For Named Models only, the server will stamp the Firm ID of the Requester to send to the Market Maker.
     *
     * @return the ContraFirm field
     */
    public ContraFirmField contraFirm() {
        return contraFirm;
    }

    /**
     * Identifier of the initial RFQ by the Requester.
     *
     * @return the RfqId field
     */
    public RfqIdField rfqId() {
        return rfqId;
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
     * Indicates the type of Quote Request
     *
     * @return the QuoteRequestType field
     */
    public QuoteRequestTypeField quoteRequestType() {
        return quoteRequestType;
    }

    /**
     * Limit Price.
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * The minimum number of seconds from the time of RFQ submission to be elapsed for the RFQ execution to be triggered automatically.
     *
     * @return the RfqExecutionDelay field
     */
    public RfqExecutionDelayField rfqExecutionDelay() {
        return rfqExecutionDelay;
    }

    /**
     * The minimum number of market maker quotes to be available for the RFQ execution to be triggered automatically.
     *
     * @return the RfqMinQuotes field
     */
    public RfqMinQuotesField rfqMinQuotes() {
        return rfqMinQuotes;
    }

    /**
     * Clearing Account Type.
     *
     * @return the AccountType field
     */
    public AccountTypeField accountType() {
        return accountType;
    }

    /**
     * Capacity of the RFQ.
     *
     * @return the OrderCapacity field
     */
    public OrderCapacityField orderCapacity() {
        return orderCapacity;
    }

    /**
     * Instructs the system whether to disclose the side of the request as stated in the Side field to the market makers or not.
     *
     * @return the RfqDiscloseSide field
     */
    public RfqDiscloseSideField rfqDiscloseSide() {
        return rfqDiscloseSide;
    }

    /**
     * Indicates the number of milliseconds to be added to the date or the time the RFQ expires on specified in the ‘Expire Time’ field.
     *
     * @return the ExpireTimeMilliseconds field
     */
    public ExpireTimeMillisecondsField expireTimeMilliseconds() {
        return expireTimeMilliseconds;
    }

    /**
     * This field will include the applicable Auto RFQ Execution Strategy ‘Sub LIS Auction with Order Book Sweep or LIS Winner Takes All’ model.
     *
     * @return the AutoRfqExecStrategy field
     */
    public AutoRfqExecStrategyField autoRfqExecStrategy() {
        return autoRfqExecStrategy;
    }

    /**
     * The number of competing Respondents (the total number of market maker firms) the quote request has been routed to.
     *
     * @return the NumOfCompetitors field
     */
    public NumOfCompetitorsField numOfCompetitors() {
        return numOfCompetitors;
    }

    /**
     * The rank of the market makers the request should be routed to.
     *
     * @return the MarketMakerRank field
     */
    public MarketMakerRankField marketMakerRank() {
        return marketMakerRank;
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
        if (!partitionId.parse(data, cursor)) {
            return false;
        }
        cursor += PartitionIdField.BYTE_LENGTH;
        if (!sequenceNumber.parse(data, cursor)) {
            return false;
        }
        cursor += SequenceNumberField.BYTE_LENGTH;
        if (!quoteReqId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteReqIdField.BYTE_LENGTH;
        if (!orderBook.parse(data, cursor)) {
            return false;
        }
        cursor += OrderBookField.BYTE_LENGTH;
        if (!privateQuote.parse(data, cursor)) {
            return false;
        }
        cursor += PrivateQuoteField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQuantityField.BYTE_LENGTH;
        if (!expireTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireTimeField.BYTE_LENGTH;
        if (!marketMakers.parse(data, cursor)) {
            return false;
        }
        cursor += MarketMakersField.BYTE_LENGTH;
        if (!contraTrader.parse(data, cursor)) {
            return false;
        }
        cursor += ContraTraderField.BYTE_LENGTH;
        if (!contraFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ContraFirmField.BYTE_LENGTH;
        if (!rfqId.parse(data, cursor)) {
            return false;
        }
        cursor += RfqIdField.BYTE_LENGTH;
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
        if (!quoteRequestType.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteRequestTypeField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!rfqExecutionDelay.parse(data, cursor)) {
            return false;
        }
        cursor += RfqExecutionDelayField.BYTE_LENGTH;
        if (!rfqMinQuotes.parse(data, cursor)) {
            return false;
        }
        cursor += RfqMinQuotesField.BYTE_LENGTH;
        if (!accountType.parse(data, cursor)) {
            return false;
        }
        cursor += AccountTypeField.BYTE_LENGTH;
        if (!orderCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += OrderCapacityField.BYTE_LENGTH;
        if (!rfqDiscloseSide.parse(data, cursor)) {
            return false;
        }
        cursor += RfqDiscloseSideField.BYTE_LENGTH;
        if (!expireTimeMilliseconds.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireTimeMillisecondsField.BYTE_LENGTH;
        if (!autoRfqExecStrategy.parse(data, cursor)) {
            return false;
        }
        cursor += AutoRfqExecStrategyField.BYTE_LENGTH;
        if (!numOfCompetitors.parse(data, cursor)) {
            return false;
        }
        cursor += NumOfCompetitorsField.BYTE_LENGTH;
        return marketMakerRank.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = partitionId.encode(data, cursor);
        cursor = sequenceNumber.encode(data, cursor);
        cursor = quoteReqId.encode(data, cursor);
        cursor = orderBook.encode(data, cursor);
        cursor = privateQuote.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderQuantity.encode(data, cursor);
        cursor = expireTime.encode(data, cursor);
        cursor = marketMakers.encode(data, cursor);
        cursor = contraTrader.encode(data, cursor);
        cursor = contraFirm.encode(data, cursor);
        cursor = rfqId.encode(data, cursor);
        cursor = clientId.encode(data, cursor);
        cursor = investmentDecisionMaker.encode(data, cursor);
        cursor = executingTrader.encode(data, cursor);
        cursor = miFidFlags.encode(data, cursor);
        cursor = partyRoleQualifiers.encode(data, cursor);
        cursor = quoteRequestType.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = rfqExecutionDelay.encode(data, cursor);
        cursor = rfqMinQuotes.encode(data, cursor);
        cursor = accountType.encode(data, cursor);
        cursor = orderCapacity.encode(data, cursor);
        cursor = rfqDiscloseSide.encode(data, cursor);
        cursor = expireTimeMilliseconds.encode(data, cursor);
        cursor = autoRfqExecStrategy.encode(data, cursor);
        cursor = numOfCompetitors.encode(data, cursor);
        cursor = marketMakerRank.encode(data, cursor);
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
            case "PartitionId" -> Optional.of(partitionId);
            case "SequenceNumber" -> Optional.of(sequenceNumber);
            case "QuoteReqId" -> Optional.of(quoteReqId);
            case "OrderBook" -> Optional.of(orderBook);
            case "PrivateQuote" -> Optional.of(privateQuote);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "Side" -> Optional.of(side);
            case "OrderQuantity" -> Optional.of(orderQuantity);
            case "ExpireTime" -> Optional.of(expireTime);
            case "MarketMakers" -> Optional.of(marketMakers);
            case "ContraTrader" -> Optional.of(contraTrader);
            case "ContraFirm" -> Optional.of(contraFirm);
            case "RfqId" -> Optional.of(rfqId);
            case "ClientId" -> Optional.of(clientId);
            case "InvestmentDecisionMaker" -> Optional.of(investmentDecisionMaker);
            case "ExecutingTrader" -> Optional.of(executingTrader);
            case "MiFidFlags" -> Optional.of(miFidFlags);
            case "PartyRoleQualifiers" -> Optional.of(partyRoleQualifiers);
            case "QuoteRequestType" -> Optional.of(quoteRequestType);
            case "Price" -> Optional.of(price);
            case "RfqExecutionDelay" -> Optional.of(rfqExecutionDelay);
            case "RfqMinQuotes" -> Optional.of(rfqMinQuotes);
            case "AccountType" -> Optional.of(accountType);
            case "OrderCapacity" -> Optional.of(orderCapacity);
            case "RfqDiscloseSide" -> Optional.of(rfqDiscloseSide);
            case "ExpireTimeMilliseconds" -> Optional.of(expireTimeMilliseconds);
            case "AutoRfqExecStrategy" -> Optional.of(autoRfqExecStrategy);
            case "NumOfCompetitors" -> Optional.of(numOfCompetitors);
            case "MarketMakerRank" -> Optional.of(marketMakerRank);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof QuoteRequestMessage message)) {
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
        if (!(other instanceof QuoteRequestMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
