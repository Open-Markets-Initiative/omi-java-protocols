package omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.AccountField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.AttributedQuoteField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.AuctionIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.CapacityField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ClOrdIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ClearingAccountField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ClearingFirmField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.CmtaNumberField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.CustomGroupIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.DisplayIndicatorField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ExDestinationField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ExecInstField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.FrequentTraderIdField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.MaxFloorField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.MinQtyField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.OpenCloseField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.OrdTypeField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.OrderQtyField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.PriceField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.RoutStrategyField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.RoutingInstField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.ScratchPadField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.SessionEligibilityField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.SideField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.SymbolField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.fields.TimeInForceField;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.structs.PreventMatch;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.Field;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.Message;
import omi.cboe.c1options.binaryorderentry.boe3.v1_1_23.types.PrintOptions;

/**
 * Represents the NewOrderShortMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Submission of a new simple (single leg) order to Cboe</p>
 */
public final class NewOrderShortMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 117;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Short Message";

    /**
     * ID chosen by the client
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Side
     */
    private final SideField side = new SideField();

    /**
     * Order quantity
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * EFID that will clear the trade
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Corresponds to OnBehalfOfSubID (116) and ClearingAccount (440) in
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Limit price
     */
    private final PriceField price = new PriceField();

    /**
     * ExecInst
     */
    private final ExecInstField execInst = new ExecInstField();

    /**
     * OrdType
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * TimeInForce
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Minimum fill quantity for IOC orders which only interact with liquidity
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * Portion of OrderQty to display
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * Entire Cboe format symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * The capacity of the order
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Routing Instruction
     */
    private final RoutingInstField routingInst = new RoutingInstField();

    /**
     * Reflected back on execution reports associated with this order
     */
    private final AccountField account = new AccountField();

    /**
     * DisplayIndicator
     */
    private final DisplayIndicatorField displayIndicator = new DisplayIndicatorField();

    /**
     * Indicates status of member position in the option
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * CMTA Number of the firm that will clear the trade
     */
    private final CmtaNumberField cmtaNumber = new CmtaNumberField();

    /**
     * Session Eligibility
     */
    private final SessionEligibilityField sessionEligibility = new SessionEligibilityField();

    /**
     * Allows for an order to be attributed to a firm's Executing Broker ID in Cboe market data feeds
     */
    private final AttributedQuoteField attributedQuote = new AttributedQuoteField();

    /**
     * Routing Strategy
     */
    private final RoutStrategyField routStrategy = new RoutStrategyField();

    /**
     * Used to specify the designated away venue
     */
    private final ExDestinationField exDestination = new ExDestinationField();

    /**
     * Auction order identifier supplied by Cboe
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Used to group orders for use inPurge Ordersmessages where multiple orders can be cancelled by specifying a list of CustomGroupIds
     */
    private final CustomGroupIdField customGroupId = new CustomGroupIdField();

    /**
     * Identifies the frequent trader program in which the order is participating
     */
    private final FrequentTraderIdField frequentTraderId = new FrequentTraderIdField();

    /**
     * Field ignored by Cboe (any value is accepted)
     */
    private final ScratchPadField scratchPad = new ScratchPadField();

    /**
     * Prevent Match
     */
    private final PreventMatch preventMatch = new PreventMatch();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(clOrdId), List.<Field>of(side), List.<Field>of(orderQty), List.<Field>of(clearingFirm), List.<Field>of(clearingAccount), List.<Field>of(price), List.<Field>of(execInst), List.<Field>of(ordType), List.<Field>of(timeInForce), List.<Field>of(minQty), List.<Field>of(maxFloor), List.<Field>of(symbol), List.<Field>of(capacity), List.<Field>of(routingInst), List.<Field>of(account), List.<Field>of(displayIndicator), preventMatch.fields(), List.<Field>of(openClose), List.<Field>of(cmtaNumber), List.<Field>of(sessionEligibility), List.<Field>of(attributedQuote), List.<Field>of(routStrategy), List.<Field>of(exDestination), List.<Field>of(auctionId), List.<Field>of(customGroupId), List.<Field>of(frequentTraderId), List.<Field>of(scratchPad)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID chosen by the client
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
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
     * Order quantity
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * EFID that will clear the trade
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Corresponds to OnBehalfOfSubID (116) and ClearingAccount (440) in
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
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
     * ExecInst
     *
     * @return the ExecInst field
     */
    public ExecInstField execInst() {
        return execInst;
    }

    /**
     * OrdType
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * TimeInForce
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Minimum fill quantity for IOC orders which only interact with liquidity
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
    }

    /**
     * Portion of OrderQty to display
     *
     * @return the MaxFloor field
     */
    public MaxFloorField maxFloor() {
        return maxFloor;
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
     * The capacity of the order
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Routing Instruction
     *
     * @return the RoutingInst field
     */
    public RoutingInstField routingInst() {
        return routingInst;
    }

    /**
     * Reflected back on execution reports associated with this order
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * DisplayIndicator
     *
     * @return the DisplayIndicator field
     */
    public DisplayIndicatorField displayIndicator() {
        return displayIndicator;
    }

    /**
     * Indicates status of member position in the option
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * CMTA Number of the firm that will clear the trade
     *
     * @return the CmtaNumber field
     */
    public CmtaNumberField cmtaNumber() {
        return cmtaNumber;
    }

    /**
     * Session Eligibility
     *
     * @return the SessionEligibility field
     */
    public SessionEligibilityField sessionEligibility() {
        return sessionEligibility;
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
     * Routing Strategy
     *
     * @return the RoutStrategy field
     */
    public RoutStrategyField routStrategy() {
        return routStrategy;
    }

    /**
     * Used to specify the designated away venue
     *
     * @return the ExDestination field
     */
    public ExDestinationField exDestination() {
        return exDestination;
    }

    /**
     * Auction order identifier supplied by Cboe
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * Used to group orders for use inPurge Ordersmessages where multiple orders can be cancelled by specifying a list of CustomGroupIds
     *
     * @return the CustomGroupId field
     */
    public CustomGroupIdField customGroupId() {
        return customGroupId;
    }

    /**
     * Identifies the frequent trader program in which the order is participating
     *
     * @return the FrequentTraderId field
     */
    public FrequentTraderIdField frequentTraderId() {
        return frequentTraderId;
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
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!orderQty.parse(data, cursor)) {
            return false;
        }
        cursor += OrderQtyField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!execInst.parse(data, cursor)) {
            return false;
        }
        cursor += ExecInstField.BYTE_LENGTH;
        if (!ordType.parse(data, cursor)) {
            return false;
        }
        cursor += OrdTypeField.BYTE_LENGTH;
        if (!timeInForce.parse(data, cursor)) {
            return false;
        }
        cursor += TimeInForceField.BYTE_LENGTH;
        if (!minQty.parse(data, cursor)) {
            return false;
        }
        cursor += MinQtyField.BYTE_LENGTH;
        if (!maxFloor.parse(data, cursor)) {
            return false;
        }
        cursor += MaxFloorField.BYTE_LENGTH;
        if (!symbol.parse(data, cursor)) {
            return false;
        }
        cursor += SymbolField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!routingInst.parse(data, cursor)) {
            return false;
        }
        cursor += RoutingInstField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!displayIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += DisplayIndicatorField.BYTE_LENGTH;
        if (!preventMatch.parseFrom(data, cursor, end - 32)) {
            return false;
        }
        cursor += preventMatch.byteLength();
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        if (!cmtaNumber.parse(data, cursor)) {
            return false;
        }
        cursor += CmtaNumberField.BYTE_LENGTH;
        if (!sessionEligibility.parse(data, cursor)) {
            return false;
        }
        cursor += SessionEligibilityField.BYTE_LENGTH;
        if (!attributedQuote.parse(data, cursor)) {
            return false;
        }
        cursor += AttributedQuoteField.BYTE_LENGTH;
        if (!routStrategy.parse(data, cursor)) {
            return false;
        }
        cursor += RoutStrategyField.BYTE_LENGTH;
        if (!exDestination.parse(data, cursor)) {
            return false;
        }
        cursor += ExDestinationField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!customGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += CustomGroupIdField.BYTE_LENGTH;
        if (!frequentTraderId.parse(data, cursor)) {
            return false;
        }
        cursor += FrequentTraderIdField.BYTE_LENGTH;
        return scratchPad.parse(data, cursor);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = clOrdId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = execInst.encode(data, cursor);
        cursor = ordType.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = minQty.encode(data, cursor);
        cursor = maxFloor.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = routingInst.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = displayIndicator.encode(data, cursor);
        cursor = preventMatch.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = cmtaNumber.encode(data, cursor);
        cursor = sessionEligibility.encode(data, cursor);
        cursor = attributedQuote.encode(data, cursor);
        cursor = routStrategy.encode(data, cursor);
        cursor = exDestination.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = customGroupId.encode(data, cursor);
        cursor = frequentTraderId.encode(data, cursor);
        cursor = scratchPad.encode(data, cursor);
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
        preventMatch.clear();
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
            case "ClOrdId" -> Optional.of(clOrdId);
            case "Side" -> Optional.of(side);
            case "OrderQty" -> Optional.of(orderQty);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "Price" -> Optional.of(price);
            case "ExecInst" -> Optional.of(execInst);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "Symbol" -> Optional.of(symbol);
            case "Capacity" -> Optional.of(capacity);
            case "RoutingInst" -> Optional.of(routingInst);
            case "Account" -> Optional.of(account);
            case "DisplayIndicator" -> Optional.of(displayIndicator);
            case "OpenClose" -> Optional.of(openClose);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "SessionEligibility" -> Optional.of(sessionEligibility);
            case "AttributedQuote" -> Optional.of(attributedQuote);
            case "RoutStrategy" -> Optional.of(routStrategy);
            case "ExDestination" -> Optional.of(exDestination);
            case "AuctionId" -> Optional.of(auctionId);
            case "CustomGroupId" -> Optional.of(customGroupId);
            case "FrequentTraderId" -> Optional.of(frequentTraderId);
            case "ScratchPad" -> Optional.of(scratchPad);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderShortMessage message)) {
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
        if (!(other instanceof NewOrderShortMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
