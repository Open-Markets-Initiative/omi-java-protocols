package omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.AutoCancelField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.BidIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.BidPriceField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.BidQuantityField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.CapacityField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ClearingAccountField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ClientIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.ExecutingTraderField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.InstrumentIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.InvestmentDecisionMakerField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.MarketMakerField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.MarketMakerFirmField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.MiFidFlagsField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.OfferIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.OfferPriceField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.OfferQuantityField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.PartitionIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.PartyRoleQualifiersField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.QuoteMsgIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.RfqIdField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.fields.SequenceNumberField;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.types.Field;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.types.Message;
import omi.lseg.millennium.nativetradinggatewayrecovery.ntgi.v21_2.types.PrintOptions;

/**
 * Represents the RfqQuoteMessage message from the NativeTradingGatewayRecovery protocol.
 *
 * <p>Carries an RFQ Quote. Sent by the Market Maker to accept an RFQ, and by the server to deliver the quote to the Requester.</p>
 */
public final class RfqQuoteMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'd';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 126;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Rfq Quote Message";

    /**
     * The server will stamp the identifier of the matching partition for the instrument
     */
    private final PartitionIdField partitionId = new PartitionIdField();

    /**
     * The server will stamp the message sequence number of the matching partition.
     */
    private final SequenceNumberField sequenceNumber = new SequenceNumberField();

    /**
     * Identifier specified by the client in the RFQ modification/cancellation/execution request.
     */
    private final QuoteMsgIdField quoteMsgId = new QuoteMsgIdField();

    /**
     * The unique identifier of the initial RFQ automatically generated via the server.
     */
    private final RfqIdField rfqId = new RfqIdField();

    /**
     * Identifier of the instrument the Execution Report is sent for.
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * Bid price.
     */
    private final BidPriceField bidPrice = new BidPriceField();

    /**
     * Bid quantity.
     */
    private final BidQuantityField bidQuantity = new BidQuantityField();

    /**
     * Offer price.
     */
    private final OfferPriceField offerPrice = new OfferPriceField();

    /**
     * Offer quantity.
     */
    private final OfferQuantityField offerQuantity = new OfferQuantityField();

    /**
     * Value is specified by MM in RFQ Quote.
     */
    private final AutoCancelField autoCancel = new AutoCancelField();

    /**
     * The Market Maker ID who is the owner of the quote.
     */
    private final MarketMakerField marketMaker = new MarketMakerField();

    /**
     * The Market Makers’ Firm ID.
     */
    private final MarketMakerFirmField marketMakerFirm = new MarketMakerFirmField();

    /**
     * Unique identifier assigned to the bid side of the quote.
     */
    private final BidIdField bidId = new BidIdField();

    /**
     * Unique identifier assigned to the offer side of the quote.
     */
    private final OfferIdField offerId = new OfferIdField();

    /**
     * Capacity of the order.
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Clearing Account Type.
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

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
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(partitionId, sequenceNumber, quoteMsgId, rfqId, instrumentId, bidPrice, bidQuantity, offerPrice, offerQuantity, autoCancel, marketMaker, marketMakerFirm, bidId, offerId, capacity, clearingAccount, clientId, investmentDecisionMaker, executingTrader, miFidFlags, partyRoleQualifiers);

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
     * Identifier specified by the client in the RFQ modification/cancellation/execution request.
     *
     * @return the QuoteMsgId field
     */
    public QuoteMsgIdField quoteMsgId() {
        return quoteMsgId;
    }

    /**
     * The unique identifier of the initial RFQ automatically generated via the server.
     *
     * @return the RfqId field
     */
    public RfqIdField rfqId() {
        return rfqId;
    }

    /**
     * Identifier of the instrument the Execution Report is sent for.
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * Bid price.
     *
     * @return the BidPrice field
     */
    public BidPriceField bidPrice() {
        return bidPrice;
    }

    /**
     * Bid quantity.
     *
     * @return the BidQuantity field
     */
    public BidQuantityField bidQuantity() {
        return bidQuantity;
    }

    /**
     * Offer price.
     *
     * @return the OfferPrice field
     */
    public OfferPriceField offerPrice() {
        return offerPrice;
    }

    /**
     * Offer quantity.
     *
     * @return the OfferQuantity field
     */
    public OfferQuantityField offerQuantity() {
        return offerQuantity;
    }

    /**
     * Value is specified by MM in RFQ Quote.
     *
     * @return the AutoCancel field
     */
    public AutoCancelField autoCancel() {
        return autoCancel;
    }

    /**
     * The Market Maker ID who is the owner of the quote.
     *
     * @return the MarketMaker field
     */
    public MarketMakerField marketMaker() {
        return marketMaker;
    }

    /**
     * The Market Makers’ Firm ID.
     *
     * @return the MarketMakerFirm field
     */
    public MarketMakerFirmField marketMakerFirm() {
        return marketMakerFirm;
    }

    /**
     * Unique identifier assigned to the bid side of the quote.
     *
     * @return the BidId field
     */
    public BidIdField bidId() {
        return bidId;
    }

    /**
     * Unique identifier assigned to the offer side of the quote.
     *
     * @return the OfferId field
     */
    public OfferIdField offerId() {
        return offerId;
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
     * Clearing Account Type.
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
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
        if (!quoteMsgId.parse(data, cursor)) {
            return false;
        }
        cursor += QuoteMsgIdField.BYTE_LENGTH;
        if (!rfqId.parse(data, cursor)) {
            return false;
        }
        cursor += RfqIdField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!bidPrice.parse(data, cursor)) {
            return false;
        }
        cursor += BidPriceField.BYTE_LENGTH;
        if (!bidQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += BidQuantityField.BYTE_LENGTH;
        if (!offerPrice.parse(data, cursor)) {
            return false;
        }
        cursor += OfferPriceField.BYTE_LENGTH;
        if (!offerQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += OfferQuantityField.BYTE_LENGTH;
        if (!autoCancel.parse(data, cursor)) {
            return false;
        }
        cursor += AutoCancelField.BYTE_LENGTH;
        if (!marketMaker.parse(data, cursor)) {
            return false;
        }
        cursor += MarketMakerField.BYTE_LENGTH;
        if (!marketMakerFirm.parse(data, cursor)) {
            return false;
        }
        cursor += MarketMakerFirmField.BYTE_LENGTH;
        if (!bidId.parse(data, cursor)) {
            return false;
        }
        cursor += BidIdField.BYTE_LENGTH;
        if (!offerId.parse(data, cursor)) {
            return false;
        }
        cursor += OfferIdField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
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
        return partyRoleQualifiers.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = partitionId.encode(data, cursor);
        cursor = sequenceNumber.encode(data, cursor);
        cursor = quoteMsgId.encode(data, cursor);
        cursor = rfqId.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = bidPrice.encode(data, cursor);
        cursor = bidQuantity.encode(data, cursor);
        cursor = offerPrice.encode(data, cursor);
        cursor = offerQuantity.encode(data, cursor);
        cursor = autoCancel.encode(data, cursor);
        cursor = marketMaker.encode(data, cursor);
        cursor = marketMakerFirm.encode(data, cursor);
        cursor = bidId.encode(data, cursor);
        cursor = offerId.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = clientId.encode(data, cursor);
        cursor = investmentDecisionMaker.encode(data, cursor);
        cursor = executingTrader.encode(data, cursor);
        cursor = miFidFlags.encode(data, cursor);
        cursor = partyRoleQualifiers.encode(data, cursor);
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
            case "QuoteMsgId" -> Optional.of(quoteMsgId);
            case "RfqId" -> Optional.of(rfqId);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "BidPrice" -> Optional.of(bidPrice);
            case "BidQuantity" -> Optional.of(bidQuantity);
            case "OfferPrice" -> Optional.of(offerPrice);
            case "OfferQuantity" -> Optional.of(offerQuantity);
            case "AutoCancel" -> Optional.of(autoCancel);
            case "MarketMaker" -> Optional.of(marketMaker);
            case "MarketMakerFirm" -> Optional.of(marketMakerFirm);
            case "BidId" -> Optional.of(bidId);
            case "OfferId" -> Optional.of(offerId);
            case "Capacity" -> Optional.of(capacity);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "ClientId" -> Optional.of(clientId);
            case "InvestmentDecisionMaker" -> Optional.of(investmentDecisionMaker);
            case "ExecutingTrader" -> Optional.of(executingTrader);
            case "MiFidFlags" -> Optional.of(miFidFlags);
            case "PartyRoleQualifiers" -> Optional.of(partyRoleQualifiers);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof RfqQuoteMessage message)) {
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
        if (!(other instanceof RfqQuoteMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
