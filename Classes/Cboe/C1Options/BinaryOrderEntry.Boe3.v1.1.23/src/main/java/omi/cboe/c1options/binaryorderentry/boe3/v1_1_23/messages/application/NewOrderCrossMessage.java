package omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.AllocCntField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.AttributedQuoteField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.AutoMatchField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.AutoMatchPriceField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ClientIdAttrField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.CompressionField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.CrossIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.CrossPrioritizationField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.CrossTypeField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.EquityBuyClearingFirmField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.EquitySellClearingFirmField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.EquityTradePriceField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.EquityTradeSizeField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.EquityTradeVenueField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.EquityTransactTimeField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ExecInstField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.LastPriorityField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.MaturityDateField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.OrderQtyField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.OrderRouterSubsidyField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.PriceField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.PutOrCallField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.RoutingFirmIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ScratchPadField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.StrikePriceField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.SymbolField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.TargetPartyIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.groups.AllocationEntry;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.groups.AllocationList;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.structs.PreventMatch;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.Field;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.Message;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.PrintOptions;

/**
 * Represents the NewOrderCrossMessage message from the BinaryOrderEntry protocol.
 *
 * <p>A New Order Cross message contains the details for both the agency (initiating) and contra ide(s) of a cross order</p>
 */
public final class NewOrderCrossMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 116;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Cross Message";

    /**
     * Day-unique identifier for the cross order chosen by the member
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * Type of auction order being submitted
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * Indicates which side of the cross order will be prioritized for execution
     */
    private final CrossPrioritizationField crossPrioritization = new CrossPrioritizationField();

    /**
     * Limit price
     */
    private final PriceField price = new PriceField();

    /**
     * Order quantity
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Entire Cboe format symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * When sending Cboe native symbology, set MaturityDate to zero
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Strike Price for option
     */
    private final StrikePriceField strikePrice = new StrikePriceField();

    /**
     * When sending Cboe native symbology, set PutOrCall to ASCII NUL (0x00)
     */
    private final PutOrCallField putOrCall = new PutOrCallField();

    /**
     * ExecInst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * Allows for an order to be attributed to a firm's Executing Broker ID in Cboe market data feeds
     */
    private final AttributedQuoteField attributedQuote = new AttributedQuoteField();

    /**
     * A valid Parent ID of the Directed Market Maker
     */
    private final TargetPartyIdField targetPartyId = new TargetPartyIdField();

    /**
     * Better-priced responses will be matched by the Contra side
     */
    private final AutoMatchField autoMatch = new AutoMatchField();

    /**
     * Sets the limit price at which the Contra Order will Auto Match
     */
    private final AutoMatchPriceField autoMatchPrice = new AutoMatchPriceField();

    /**
     * When enabled, allocation will go to other members’ responses before requiring the Contra Order to satisfy remaining contracts of the Agency Order
     */
    private final LastPriorityField lastPriority = new LastPriorityField();

    /**
     * Used to optionally convey the routing firm of the order
     */
    private final RoutingFirmIdField routingFirmId = new RoutingFirmIdField();

    /**
     * User defined identifier for quote attribution
     */
    private final ClientIdAttrField clientIdAttr = new ClientIdAttrField();

    /**
     * Price at which the equity associated with a QCC trade
     */
    private final EquityTradePriceField equityTradePrice = new EquityTradePriceField();

    /**
     * Number of shares executed in the equity associated with a QCC trade
     */
    private final EquityTradeSizeField equityTradeSize = new EquityTradeSizeField();

    /**
     * Exchange venue where equity associated with a QCC traded
     */
    private final EquityTradeVenueField equityTradeVenue = new EquityTradeVenueField();

    /**
     * Time of equity trade associated with a QCC trade
     */
    private final EquityTransactTimeField equityTransactTime = new EquityTransactTimeField();

    /**
     * Clearing firm on buy side of the equity trade associated with a QCC
     */
    private final EquityBuyClearingFirmField equityBuyClearingFirm = new EquityBuyClearingFirmField();

    /**
     * Clearing firm on sell side of the equity trade associated with a QCC
     */
    private final EquitySellClearingFirmField equitySellClearingFirm = new EquitySellClearingFirmField();

    /**
     * Order is a compression trade
     */
    private final CompressionField compression = new CompressionField();

    /**
     * Order router subsidy eligibility
     */
    private final OrderRouterSubsidyField orderRouterSubsidy = new OrderRouterSubsidyField();

    /**
     * Field ignored by Cboe (any value is accepted)
     */
    private final ScratchPadField scratchPad = new ScratchPadField();

    /**
     * Number of allocation party repeating groups in the message
     */
    private final AllocCntField allocCnt = new AllocCntField();

    /**
     * Allocation
     */
    private final AllocationList allocation = new AllocationList();

    /**
     * Prevent Match
     */
    private final PreventMatch preventMatch = new PreventMatch();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(crossId), List.<Field>of(crossType), List.<Field>of(crossPrioritization), List.<Field>of(price), List.<Field>of(orderQty), List.<Field>of(symbol), List.<Field>of(maturityDate), List.<Field>of(strikePrice), List.<Field>of(putOrCall), List.<Field>of(execInst), List.<Field>of(attributedQuote), List.<Field>of(targetPartyId), preventMatch.fields(), List.<Field>of(autoMatch), List.<Field>of(autoMatchPrice), List.<Field>of(lastPriority), List.<Field>of(routingFirmId), List.<Field>of(clientIdAttr), List.<Field>of(equityTradePrice), List.<Field>of(equityTradeSize), List.<Field>of(equityTradeVenue), List.<Field>of(equityTransactTime), List.<Field>of(equityBuyClearingFirm), List.<Field>of(equitySellClearingFirm), List.<Field>of(compression), List.<Field>of(orderRouterSubsidy), List.<Field>of(scratchPad), List.<Field>of(allocCnt)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Day-unique identifier for the cross order chosen by the member
     *
     * @return the CrossId field
     */
    public CrossIdField crossId() {
        return crossId;
    }

    /**
     * Type of auction order being submitted
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
    }

    /**
     * Indicates which side of the cross order will be prioritized for execution
     *
     * @return the CrossPrioritization field
     */
    public CrossPrioritizationField crossPrioritization() {
        return crossPrioritization;
    }

    /**
     * Limit price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Order quantity
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Entire Cboe format symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * When sending Cboe native symbology, set MaturityDate to zero
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * Strike Price for option
     *
     * @return the StrikePrice field
     */
    public StrikePriceField strikePrice() {
        return strikePrice;
    }

    /**
     * When sending Cboe native symbology, set PutOrCall to ASCII NUL (0x00)
     *
     * @return the PutOrCall field
     */
    public PutOrCallField putOrCall() {
        return putOrCall;
    }

    /**
     * ExecInst
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
    }

    /**
     * Allows for an order to be attributed to a firm's Executing Broker ID in Cboe market data feeds
     *
     * @return the AttributedQuote field
     */
    public AttributedQuoteField attributedQuote() {
        return attributedQuote;
    }

    /**
     * A valid Parent ID of the Directed Market Maker
     *
     * @return the TargetPartyId field
     */
    public TargetPartyIdField targetPartyId() {
        return targetPartyId;
    }

    /**
     * Better-priced responses will be matched by the Contra side
     *
     * @return the AutoMatch field
     */
    public AutoMatchField autoMatch() {
        return autoMatch;
    }

    /**
     * Sets the limit price at which the Contra Order will Auto Match
     *
     * @return the AutoMatchPrice field
     */
    public AutoMatchPriceField autoMatchPrice() {
        return autoMatchPrice;
    }

    /**
     * When enabled, allocation will go to other members’ responses before requiring the Contra Order to satisfy remaining contracts of the Agency Order
     *
     * @return the LastPriority field
     */
    public LastPriorityField lastPriority() {
        return lastPriority;
    }

    /**
     * Used to optionally convey the routing firm of the order
     *
     * @return the RoutingFirmId field
     */
    public RoutingFirmIdField routingFirmId() {
        return routingFirmId;
    }

    /**
     * User defined identifier for quote attribution
     *
     * @return the ClientIdAttr field
     */
    public ClientIdAttrField clientIdAttr() {
        return clientIdAttr;
    }

    /**
     * Price at which the equity associated with a QCC trade
     *
     * @return the EquityTradePrice field
     */
    public EquityTradePriceField equityTradePrice() {
        return equityTradePrice;
    }

    /**
     * Number of shares executed in the equity associated with a QCC trade
     *
     * @return the EquityTradeSize field
     */
    public EquityTradeSizeField equityTradeSize() {
        return equityTradeSize;
    }

    /**
     * Exchange venue where equity associated with a QCC traded
     *
     * @return the EquityTradeVenue field
     */
    public EquityTradeVenueField equityTradeVenue() {
        return equityTradeVenue;
    }

    /**
     * Time of equity trade associated with a QCC trade
     *
     * @return the EquityTransactTime field
     */
    public EquityTransactTimeField equityTransactTime() {
        return equityTransactTime;
    }

    /**
     * Clearing firm on buy side of the equity trade associated with a QCC
     *
     * @return the EquityBuyClearingFirm field
     */
    public EquityBuyClearingFirmField equityBuyClearingFirm() {
        return equityBuyClearingFirm;
    }

    /**
     * Clearing firm on sell side of the equity trade associated with a QCC
     *
     * @return the EquitySellClearingFirm field
     */
    public EquitySellClearingFirmField equitySellClearingFirm() {
        return equitySellClearingFirm;
    }

    /**
     * Order is a compression trade
     *
     * @return the Compression field
     */
    public CompressionField compression() {
        return compression;
    }

    /**
     * Order router subsidy eligibility
     *
     * @return the OrderRouterSubsidy field
     */
    public OrderRouterSubsidyField orderRouterSubsidy() {
        return orderRouterSubsidy;
    }

    /**
     * Field ignored by Cboe (any value is accepted)
     *
     * @return the ScratchPad field
     */
    public ScratchPadField scratchPad() {
        return scratchPad;
    }

    /**
     * Number of allocation party repeating groups in the message
     *
     * @return the AllocCnt field
     */
    public AllocCntField allocCnt() {
        return allocCnt;
    }

    /**
     * Allocation
     *
     * <p>Encode writes this list's size to the AllocCnt field.</p>
     *
     * @return the Allocation entries
     */
    public AllocationList allocation() {
        return allocation;
    }

    /**
     * Prevent Match
     *
     * @return the PreventMatch record
     */
    public PreventMatch preventMatch() {
        return preventMatch;
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + allocation.byteLength();
    }

    /**
     * Returns this message's declared padding runs, as consecutive offset and length pairs relative to the start of the message, for the entries it holds now.
     *
     * <p>Padding carries no value: decode advances over it, and encode writes back what decode received, or zero for a message assembled from values. Use this to check a received message's padding where the specification constrains it, or to render a byte map of the layout.</p>
     *
     * @return the padding runs, empty when the layout has none
     */
    public int[] padding() {
        return new int[0];
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(equityTransactTime.value());
    }

    @Override
    public boolean parseFrom(byte[] data, int offset) {
        return parseFrom(data, offset, data.length);
    }

    @Override
    public boolean parseFrom(byte[] data, int offset, int end) {
        clear();
        this.decoded = read(data, offset, end);

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
            return false;
        }

        int cursor = offset;
        if (!crossId.parse(data, cursor)) {
            return false;
        }
        cursor += CrossIdField.BYTE_LENGTH;
        if (!crossType.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeField.BYTE_LENGTH;
        if (!crossPrioritization.parse(data, cursor)) {
            return false;
        }
        cursor += CrossPrioritizationField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!maturityDate.parse(data, cursor)) {
            return false;
        }
        cursor += MaturityDateField.BYTE_LENGTH;
        if (!strikePrice.parse(data, cursor)) {
            return false;
        }
        cursor += StrikePriceField.BYTE_LENGTH;
        if (!putOrCall.parse(data, cursor)) {
            return false;
        }
        cursor += PutOrCallField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
        if (!attributedQuote.parse(data, cursor)) {
            return false;
        }
        cursor += AttributedQuoteField.BYTE_LENGTH;
        if (!targetPartyId.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyIdField.BYTE_LENGTH;
        if (!preventMatch.parseFrom(data, cursor, end - 52)) {
            return false;
        }
        cursor += preventMatch.byteLength();
        if (!autoMatch.parse(data, cursor)) {
            return false;
        }
        cursor += AutoMatchField.BYTE_LENGTH;
        if (!autoMatchPrice.parse(data, cursor)) {
            return false;
        }
        cursor += AutoMatchPriceField.BYTE_LENGTH;
        if (!lastPriority.parse(data, cursor)) {
            return false;
        }
        cursor += LastPriorityField.BYTE_LENGTH;
        if (!routingFirmId.parse(data, cursor)) {
            return false;
        }
        cursor += RoutingFirmIdField.BYTE_LENGTH;
        if (!clientIdAttr.parse(data, cursor)) {
            return false;
        }
        cursor += ClientIdAttrField.BYTE_LENGTH;
        if (!equityTradePrice.parse(data, cursor)) {
            return false;
        }
        cursor += EquityTradePriceField.BYTE_LENGTH;
        if (!equityTradeSize.parse(data, cursor)) {
            return false;
        }
        cursor += EquityTradeSizeField.BYTE_LENGTH;
        if (!equityTradeVenue.parse(data, cursor)) {
            return false;
        }
        cursor += EquityTradeVenueField.BYTE_LENGTH;
        if (!equityTransactTime.parse(data, cursor)) {
            return false;
        }
        cursor += EquityTransactTimeField.BYTE_LENGTH;
        if (!equityBuyClearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += EquityBuyClearingFirmField.BYTE_LENGTH;
        if (!equitySellClearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += EquitySellClearingFirmField.BYTE_LENGTH;
        if (!compression.parse(data, cursor)) {
            return false;
        }
        cursor += CompressionField.BYTE_LENGTH;
        if (!orderRouterSubsidy.parse(data, cursor)) {
            return false;
        }
        cursor += OrderRouterSubsidyField.BYTE_LENGTH;
        if (!scratchPad.parse(data, cursor)) {
            return false;
        }
        cursor += ScratchPadField.BYTE_LENGTH;
        if (!allocCnt.parse(data, cursor)) {
            return false;
        }
        cursor += AllocCntField.BYTE_LENGTH;
        if (!allocation.parse(data, cursor, end, allocCnt.value())) {
            return false;
        }
        cursor += allocation.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (allocation.size() > 255) {
            throw new IllegalStateException("allocation holds " + allocation.size() + " entries, more than its count field can state");
        }
        allocCnt.value((short) allocation.size());
        int cursor = offset;
        cursor = crossId.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
        cursor = crossPrioritization.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = maturityDate.encode(data, cursor);
        cursor = strikePrice.encode(data, cursor);
        cursor = putOrCall.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = attributedQuote.encode(data, cursor);
        cursor = targetPartyId.encode(data, cursor);
        cursor = preventMatch.encode(data, cursor);
        cursor = autoMatch.encode(data, cursor);
        cursor = autoMatchPrice.encode(data, cursor);
        cursor = lastPriority.encode(data, cursor);
        cursor = routingFirmId.encode(data, cursor);
        cursor = clientIdAttr.encode(data, cursor);
        cursor = equityTradePrice.encode(data, cursor);
        cursor = equityTradeSize.encode(data, cursor);
        cursor = equityTradeVenue.encode(data, cursor);
        cursor = equityTransactTime.encode(data, cursor);
        cursor = equityBuyClearingFirm.encode(data, cursor);
        cursor = equitySellClearingFirm.encode(data, cursor);
        cursor = compression.encode(data, cursor);
        cursor = orderRouterSubsidy.encode(data, cursor);
        cursor = scratchPad.encode(data, cursor);
        cursor = allocCnt.encode(data, cursor);
        cursor = allocation.encode(data, cursor);
        return cursor;
    }

    @Override
    public byte[] toBytes() {
        byte[] data = new byte[byteLength()];
        encode(data, 0);
        return data;
    }

    @Override
    public void clear() {
        for (Field field : fields) {
            field.reset();
        }
        preventMatch.clear();
        allocation.clear();
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != allocCnt && !field.isRecognized()) {
                return false;
            }
        }
        return allocation.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != allocCnt && !field.isValid()) {
                return false;
            }
        }
        if (!allocation.isValid()) {
            return false;
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
        if (!crossId.isDecoded()) {
            return Optional.of(crossId);
        }
        if (!crossType.isDecoded()) {
            return Optional.of(crossType);
        }
        if (!crossPrioritization.isDecoded()) {
            return Optional.of(crossPrioritization);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (!symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (!maturityDate.isDecoded()) {
            return Optional.of(maturityDate);
        }
        if (!strikePrice.isDecoded()) {
            return Optional.of(strikePrice);
        }
        if (!putOrCall.isDecoded()) {
            return Optional.of(putOrCall);
        }
        if (!execInst.isDecoded()) {
            return Optional.of(execInst);
        }
        if (!attributedQuote.isDecoded()) {
            return Optional.of(attributedQuote);
        }
        if (!targetPartyId.isDecoded()) {
            return Optional.of(targetPartyId);
        }
        if (!preventMatch.isDecoded()) {
            return preventMatch.failedAt();
        }
        if (!autoMatch.isDecoded()) {
            return Optional.of(autoMatch);
        }
        if (!autoMatchPrice.isDecoded()) {
            return Optional.of(autoMatchPrice);
        }
        if (!lastPriority.isDecoded()) {
            return Optional.of(lastPriority);
        }
        if (!routingFirmId.isDecoded()) {
            return Optional.of(routingFirmId);
        }
        if (!clientIdAttr.isDecoded()) {
            return Optional.of(clientIdAttr);
        }
        if (!equityTradePrice.isDecoded()) {
            return Optional.of(equityTradePrice);
        }
        if (!equityTradeSize.isDecoded()) {
            return Optional.of(equityTradeSize);
        }
        if (!equityTradeVenue.isDecoded()) {
            return Optional.of(equityTradeVenue);
        }
        if (!equityTransactTime.isDecoded()) {
            return Optional.of(equityTransactTime);
        }
        if (!equityBuyClearingFirm.isDecoded()) {
            return Optional.of(equityBuyClearingFirm);
        }
        if (!equitySellClearingFirm.isDecoded()) {
            return Optional.of(equitySellClearingFirm);
        }
        if (!compression.isDecoded()) {
            return Optional.of(compression);
        }
        if (!orderRouterSubsidy.isDecoded()) {
            return Optional.of(orderRouterSubsidy);
        }
        if (!scratchPad.isDecoded()) {
            return Optional.of(scratchPad);
        }
        if (!allocCnt.isDecoded()) {
            return Optional.of(allocCnt);
        }
        if (!allocation.isDecoded()) {
            return Optional.of(allocation.failedEntry().flatMap(AllocationEntry::failedAt).orElse(allocCnt));
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
            case "CrossId" -> Optional.of(crossId);
            case "CrossType" -> Optional.of(crossType);
            case "CrossPrioritization" -> Optional.of(crossPrioritization);
            case "Price" -> Optional.of(price);
            case "OrderQty" -> Optional.of(orderQty);
            case "Symbol" -> Optional.of(symbol);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "StrikePrice" -> Optional.of(strikePrice);
            case "PutOrCall" -> Optional.of(putOrCall);
            case "ExecInst" -> Optional.of(execInst);
            case "AttributedQuote" -> Optional.of(attributedQuote);
            case "TargetPartyId" -> Optional.of(targetPartyId);
            case "AutoMatch" -> Optional.of(autoMatch);
            case "AutoMatchPrice" -> Optional.of(autoMatchPrice);
            case "LastPriority" -> Optional.of(lastPriority);
            case "RoutingFirmId" -> Optional.of(routingFirmId);
            case "ClientIdAttr" -> Optional.of(clientIdAttr);
            case "EquityTradePrice" -> Optional.of(equityTradePrice);
            case "EquityTradeSize" -> Optional.of(equityTradeSize);
            case "EquityTradeVenue" -> Optional.of(equityTradeVenue);
            case "EquityTransactTime" -> Optional.of(equityTransactTime);
            case "EquityBuyClearingFirm" -> Optional.of(equityBuyClearingFirm);
            case "EquitySellClearingFirm" -> Optional.of(equitySellClearingFirm);
            case "Compression" -> Optional.of(compression);
            case "OrderRouterSubsidy" -> Optional.of(orderRouterSubsidy);
            case "ScratchPad" -> Optional.of(scratchPad);
            case "AllocCnt" -> Optional.of(allocCnt);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderCrossMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(allocation.diffFields(message.allocation));
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
     * <p>The identifier form renders the message name alone, which is what a debugger label or a log line tracking message flow needs. The compact form adds every field on the same line, and the default form indents one field per line. Repeating groups follow the fields.</p>
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
            builder.append(", ");
            allocation.toFormattedString(builder, options);
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
        allocation.toFormattedString(builder, nested);
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
        if (!(other instanceof NewOrderCrossMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && allocation.equals(message.allocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, allocation);
    }
}
