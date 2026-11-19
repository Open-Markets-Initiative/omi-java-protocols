package omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.AccountField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.AuctionIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.CapacityField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.ClOrdIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.ClearingAccountField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.ClearingFirmField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.CmtaNumberField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.CustomGroupIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.EquityPartyIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.ExecInstField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.FloorDestinationField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.FloorRoutingInstField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.FrequentTraderIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.LegCntField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.MaxFloorField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.OrdTypeField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.OrderQtyField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.PriceField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.RoutingFirmIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.RoutingInstField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.ScratchPadField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.SessionEligibilityField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.SideField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.SymbolField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.TargetPartyIdField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.fields.TimeInForceField;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.groups.LegPositionEffectEntry;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.groups.LegPositionEffectList;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.structs.PreventMatch;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.types.Field;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.types.Message;
import omi.cboe.edgxoptions.binaryorderentry.boe3.v1_1_23.types.PrintOptions;

/**
 * Represents the NewComplexOrderShortMessage message from the BinaryOrderEntry protocol.
 *
 * <p>A New Complex Order message contains the details required to enter an order on a complex instrument created with previously entered New Complex Instrument message request</p>
 */
public final class NewComplexOrderShortMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 121;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Complex Order Short Message";

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
     * CMTA Number of the firm that will clear the trade
     */
    private final CmtaNumberField cmtaNumber = new CmtaNumberField();

    /**
     * A valid Parent ID of the Directed Market Maker
     */
    private final TargetPartyIdField targetPartyId = new TargetPartyIdField();

    /**
     * Auction order identifier supplied by Cboe
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Used to optionally convey the routing firm of the order
     */
    private final RoutingFirmIdField routingFirmId = new RoutingFirmIdField();

    /**
     * Used to group orders for use inPurge Ordersmessages where multiple orders can be cancelled by specifying a list of CustomGroupIds
     */
    private final CustomGroupIdField customGroupId = new CustomGroupIdField();

    /**
     * MPID used to clear the equity leg being cleared via the Exchange
     */
    private final EquityPartyIdField equityPartyId = new EquityPartyIdField();

    /**
     * Identifies the frequent trader program in which the order is participating
     */
    private final FrequentTraderIdField frequentTraderId = new FrequentTraderIdField();

    /**
     * Session Eligibility
     */
    private final SessionEligibilityField sessionEligibility = new SessionEligibilityField();

    /**
     * Portion of OrderQty to display
     */
    private final MaxFloorField maxFloor = new MaxFloorField();

    /**
     * Specifies a default PAR workstation (ex
     */
    private final FloorDestinationField floorDestination = new FloorDestinationField();

    /**
     * FloorRoutingInst
     */
    private final FloorRoutingInstField floorRoutingInst = new FloorRoutingInstField();

    /**
     * Field ignored by Cboe (any value is accepted)
     */
    private final ScratchPadField scratchPad = new ScratchPadField();

    /**
     * Number of leg repeating groups in the message
     */
    private final LegCntField legCnt = new LegCntField();

    /**
     * Indicates status of member position in the option leg of a complex order
     */
    private final LegPositionEffectList legPositionEffect = new LegPositionEffectList();

    /**
     * Prevent Match
     */
    private final PreventMatch preventMatch = new PreventMatch();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(clOrdId), List.<Field>of(side), List.<Field>of(orderQty), List.<Field>of(clearingFirm), List.<Field>of(clearingAccount), List.<Field>of(price), List.<Field>of(execInst), List.<Field>of(ordType), List.<Field>of(timeInForce), List.<Field>of(symbol), List.<Field>of(capacity), List.<Field>of(routingInst), List.<Field>of(account), preventMatch.fields(), List.<Field>of(cmtaNumber), List.<Field>of(targetPartyId), List.<Field>of(auctionId), List.<Field>of(routingFirmId), List.<Field>of(customGroupId), List.<Field>of(equityPartyId), List.<Field>of(frequentTraderId), List.<Field>of(sessionEligibility), List.<Field>of(maxFloor), List.<Field>of(floorDestination), List.<Field>of(floorRoutingInst), List.<Field>of(scratchPad), List.<Field>of(legCnt)).flatMap(List::stream).toList();

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
     * CMTA Number of the firm that will clear the trade
     *
     * @return the CmtaNumber field
     */
    public CmtaNumberField cmtaNumber() {
        return cmtaNumber;
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
     * Auction order identifier supplied by Cboe
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
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
     * Used to group orders for use inPurge Ordersmessages where multiple orders can be cancelled by specifying a list of CustomGroupIds
     *
     * @return the CustomGroupId field
     */
    public CustomGroupIdField customGroupId() {
        return customGroupId;
    }

    /**
     * MPID used to clear the equity leg being cleared via the Exchange
     *
     * @return the EquityPartyId field
     */
    public EquityPartyIdField equityPartyId() {
        return equityPartyId;
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
     * Session Eligibility
     *
     * @return the SessionEligibility field
     */
    public SessionEligibilityField sessionEligibility() {
        return sessionEligibility;
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
     * Specifies a default PAR workstation (ex
     *
     * @return the FloorDestination field
     */
    public FloorDestinationField floorDestination() {
        return floorDestination;
    }

    /**
     * FloorRoutingInst
     *
     * @return the FloorRoutingInst field
     */
    public FloorRoutingInstField floorRoutingInst() {
        return floorRoutingInst;
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
     * Number of leg repeating groups in the message
     *
     * @return the LegCnt field
     */
    public LegCntField legCnt() {
        return legCnt;
    }

    /**
     * Indicates status of member position in the option leg of a complex order
     *
     * <p>Encode writes this list's size to the LegCnt field.</p>
     *
     * @return the LegPositionEffect entries
     */
    public LegPositionEffectList legPositionEffect() {
        return legPositionEffect;
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
        return MINIMUM_BYTE_LENGTH + legPositionEffect.byteLength();
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

        int stop = Math.max(0, Math.min(data.length, offset + byteLength()));
        this.buffer = Arrays.copyOfRange(data, Math.min(Math.max(offset, 0), stop), stop);
        return decoded;
    }

    private boolean read(byte[] data, int offset, int end) {
        if (offset < 0 || end > data.length || end - offset < MINIMUM_BYTE_LENGTH) {
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
        if (!preventMatch.parseFrom(data, cursor, end - 45)) {
            return false;
        }
        cursor += preventMatch.byteLength();
        if (!cmtaNumber.parse(data, cursor)) {
            return false;
        }
        cursor += CmtaNumberField.BYTE_LENGTH;
        if (!targetPartyId.parse(data, cursor)) {
            return false;
        }
        cursor += TargetPartyIdField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!routingFirmId.parse(data, cursor)) {
            return false;
        }
        cursor += RoutingFirmIdField.BYTE_LENGTH;
        if (!customGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += CustomGroupIdField.BYTE_LENGTH;
        if (!equityPartyId.parse(data, cursor)) {
            return false;
        }
        cursor += EquityPartyIdField.BYTE_LENGTH;
        if (!frequentTraderId.parse(data, cursor)) {
            return false;
        }
        cursor += FrequentTraderIdField.BYTE_LENGTH;
        if (!sessionEligibility.parse(data, cursor)) {
            return false;
        }
        cursor += SessionEligibilityField.BYTE_LENGTH;
        if (!maxFloor.parse(data, cursor)) {
            return false;
        }
        cursor += MaxFloorField.BYTE_LENGTH;
        if (!floorDestination.parse(data, cursor)) {
            return false;
        }
        cursor += FloorDestinationField.BYTE_LENGTH;
        if (!floorRoutingInst.parse(data, cursor)) {
            return false;
        }
        cursor += FloorRoutingInstField.BYTE_LENGTH;
        if (!scratchPad.parse(data, cursor)) {
            return false;
        }
        cursor += ScratchPadField.BYTE_LENGTH;
        if (!legCnt.parse(data, cursor)) {
            return false;
        }
        cursor += LegCntField.BYTE_LENGTH;
        if (!legPositionEffect.parse(data, cursor, end, legCnt.value())) {
            return false;
        }
        cursor += legPositionEffect.byteLength();

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (legPositionEffect.size() > 255) {
            throw new IllegalStateException("legPositionEffect holds " + legPositionEffect.size() + " entries, more than its count field can state");
        }
        legCnt.value((short) legPositionEffect.size());
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
        cursor = symbol.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = routingInst.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = preventMatch.encode(data, cursor);
        cursor = cmtaNumber.encode(data, cursor);
        cursor = targetPartyId.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = routingFirmId.encode(data, cursor);
        cursor = customGroupId.encode(data, cursor);
        cursor = equityPartyId.encode(data, cursor);
        cursor = frequentTraderId.encode(data, cursor);
        cursor = sessionEligibility.encode(data, cursor);
        cursor = maxFloor.encode(data, cursor);
        cursor = floorDestination.encode(data, cursor);
        cursor = floorRoutingInst.encode(data, cursor);
        cursor = scratchPad.encode(data, cursor);
        cursor = legCnt.encode(data, cursor);
        cursor = legPositionEffect.encode(data, cursor);
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
        legPositionEffect.clear();
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
            if (field != legCnt && !field.isRecognized()) {
                return false;
            }
        }
        return legPositionEffect.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields) {
            if (field != legCnt && !field.isValid()) {
                return false;
            }
        }
        if (!legPositionEffect.isValid()) {
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
        if (!clOrdId.isDecoded()) {
            return Optional.of(clOrdId);
        }
        if (!side.isDecoded()) {
            return Optional.of(side);
        }
        if (!orderQty.isDecoded()) {
            return Optional.of(orderQty);
        }
        if (!clearingFirm.isDecoded()) {
            return Optional.of(clearingFirm);
        }
        if (!clearingAccount.isDecoded()) {
            return Optional.of(clearingAccount);
        }
        if (!price.isDecoded()) {
            return Optional.of(price);
        }
        if (!execInst.isDecoded()) {
            return Optional.of(execInst);
        }
        if (!ordType.isDecoded()) {
            return Optional.of(ordType);
        }
        if (!timeInForce.isDecoded()) {
            return Optional.of(timeInForce);
        }
        if (!symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (!capacity.isDecoded()) {
            return Optional.of(capacity);
        }
        if (!routingInst.isDecoded()) {
            return Optional.of(routingInst);
        }
        if (!account.isDecoded()) {
            return Optional.of(account);
        }
        if (!preventMatch.isDecoded()) {
            return preventMatch.failedAt();
        }
        if (!cmtaNumber.isDecoded()) {
            return Optional.of(cmtaNumber);
        }
        if (!targetPartyId.isDecoded()) {
            return Optional.of(targetPartyId);
        }
        if (!auctionId.isDecoded()) {
            return Optional.of(auctionId);
        }
        if (!routingFirmId.isDecoded()) {
            return Optional.of(routingFirmId);
        }
        if (!customGroupId.isDecoded()) {
            return Optional.of(customGroupId);
        }
        if (!equityPartyId.isDecoded()) {
            return Optional.of(equityPartyId);
        }
        if (!frequentTraderId.isDecoded()) {
            return Optional.of(frequentTraderId);
        }
        if (!sessionEligibility.isDecoded()) {
            return Optional.of(sessionEligibility);
        }
        if (!maxFloor.isDecoded()) {
            return Optional.of(maxFloor);
        }
        if (!floorDestination.isDecoded()) {
            return Optional.of(floorDestination);
        }
        if (!floorRoutingInst.isDecoded()) {
            return Optional.of(floorRoutingInst);
        }
        if (!scratchPad.isDecoded()) {
            return Optional.of(scratchPad);
        }
        if (!legCnt.isDecoded()) {
            return Optional.of(legCnt);
        }
        if (!legPositionEffect.isDecoded()) {
            return Optional.of(legPositionEffect.failedEntry().flatMap(LegPositionEffectEntry::failedAt).orElse(legCnt));
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
            case "Symbol" -> Optional.of(symbol);
            case "Capacity" -> Optional.of(capacity);
            case "RoutingInst" -> Optional.of(routingInst);
            case "Account" -> Optional.of(account);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "TargetPartyId" -> Optional.of(targetPartyId);
            case "AuctionId" -> Optional.of(auctionId);
            case "RoutingFirmId" -> Optional.of(routingFirmId);
            case "CustomGroupId" -> Optional.of(customGroupId);
            case "EquityPartyId" -> Optional.of(equityPartyId);
            case "FrequentTraderId" -> Optional.of(frequentTraderId);
            case "SessionEligibility" -> Optional.of(sessionEligibility);
            case "MaxFloor" -> Optional.of(maxFloor);
            case "FloorDestination" -> Optional.of(floorDestination);
            case "FloorRoutingInst" -> Optional.of(floorRoutingInst);
            case "ScratchPad" -> Optional.of(scratchPad);
            case "LegCnt" -> Optional.of(legCnt);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewComplexOrderShortMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(legPositionEffect.diffFields(message.legPositionEffect));
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
            legPositionEffect.toFormattedString(builder, options);
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
        legPositionEffect.toFormattedString(builder, nested);
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
        if (!(other instanceof NewComplexOrderShortMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && legPositionEffect.equals(message.legPositionEffect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, legPositionEffect);
    }
}
