package omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.AccountField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.CapacityField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ClOrdIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ClearingAccountField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ClearingFirmField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.CmtaNumberField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.CountryCodeField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.CtiCodeField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.CustOrderHandlingInstField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.CustomGroupIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ExpireTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.FrequentTraderIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.LegCntField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.ManualOrderIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.OeoIdField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.OpenCloseField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.OrdTypeField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.OrderQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.PriceField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.SecurityDescField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.SideField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.SymbolField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.fields.TimeInForceField;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.groups.LegPositionEffectEntry;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.groups.LegPositionEffectList;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.structs.PreventMatch;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe3.v1_1_20.types.PrintOptions;

/**
 * Represents the NewOrderOption message from the BinaryOrderEntry protocol.
 *
 * <p>New order option on futures message</p>
 */
public final class NewOrderOption implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 132;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Option";

    /**
     * Unique Id chosen by the client
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
     * Supplemental identifier
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Limit price
     */
    private final PriceField price = new PriceField();

    /**
     * Order type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Time In Force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Simple Instruments can be specified by providing the mapped symbol format in the Symbol field or by providing the product name (e
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * The Options on Futures identifier name
     */
    private final SecurityDescField securityDesc = new SecurityDescField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Unique account identifier associated with an order
     */
    private final AccountField account = new AccountField();

    /**
     * Required for TimeInForce = 6 orders, specifies the date-time (in UTC) that the order expires
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Indicates status of client position in a trade resulting from the order
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * CMTA Number of the firm that will clear the trade
     */
    private final CmtaNumberField cmtaNumber = new CmtaNumberField();

    /**
     * Used to group orders for use in mass cancels where multiple orders can be cancelled by specifying a list of CustomGroupIds
     */
    private final CustomGroupIdField customGroupId = new CustomGroupIdField();

    /**
     * CTI code
     */
    private final CtiCodeField ctiCode = new CtiCodeField();

    /**
     * Y=Manual order entry N =Automated order entry
     */
    private final ManualOrderIndicatorField manualOrderIndicator = new ManualOrderIndicatorField();

    /**
     * Identifies the Order Entry Operator responsible for this message
     */
    private final OeoIdField oeoId = new OeoIdField();

    /**
     * Supplemental customer identifier used for billing related programs
     */
    private final FrequentTraderIdField frequentTraderId = new FrequentTraderIdField();

    /**
     * Execution source code provided during order entry to describe broker service
     */
    private final CustOrderHandlingInstField custOrderHandlingInst = new CustOrderHandlingInstField();

    /**
     * Identifies the country code of the person or system submitting the order using the ISO 3166 two-character code
     */
    private final CountryCodeField countryCode = new CountryCodeField();

    /**
     * For complex orders, the number of legs of the complex instrument specified in the Symbol field
     */
    private final LegCntField legCnt = new LegCntField();

    /**
     * Indicates status of client position in the option for this leg
     */
    private final LegPositionEffectList legPositionEffect = new LegPositionEffectList();

    /**
     * Prevent Match
     */
    private final PreventMatch preventMatch = new PreventMatch();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(clOrdId), List.<Field>of(side), List.<Field>of(orderQty), List.<Field>of(clearingFirm), List.<Field>of(clearingAccount), List.<Field>of(price), List.<Field>of(ordType), List.<Field>of(timeInForce), List.<Field>of(symbol), List.<Field>of(securityDesc), List.<Field>of(capacity), List.<Field>of(account), preventMatch.fields(), List.<Field>of(expireTime), List.<Field>of(openClose), List.<Field>of(cmtaNumber), List.<Field>of(customGroupId), List.<Field>of(ctiCode), List.<Field>of(manualOrderIndicator), List.<Field>of(oeoId), List.<Field>of(frequentTraderId), List.<Field>of(custOrderHandlingInst), List.<Field>of(countryCode), List.<Field>of(legCnt)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Unique Id chosen by the client
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
     * Supplemental identifier
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
     * Order type
     *
     * @return the OrdType field
     */
    public OrdTypeField ordType() {
        return ordType;
    }

    /**
     * Time In Force
     *
     * @return the TimeInForce field
     */
    public TimeInForceField timeInForce() {
        return timeInForce;
    }

    /**
     * Simple Instruments can be specified by providing the mapped symbol format in the Symbol field or by providing the product name (e
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * The Options on Futures identifier name
     *
     * @return the SecurityDesc field
     */
    public SecurityDescField securityDesc() {
        return securityDesc;
    }

    /**
     * Capacity
     *
     * @return the Capacity field
     */
    public CapacityField capacity() {
        return capacity;
    }

    /**
     * Unique account identifier associated with an order
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
    }

    /**
     * Required for TimeInForce = 6 orders, specifies the date-time (in UTC) that the order expires
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
    }

    /**
     * Indicates status of client position in a trade resulting from the order
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
     * Used to group orders for use in mass cancels where multiple orders can be cancelled by specifying a list of CustomGroupIds
     *
     * @return the CustomGroupId field
     */
    public CustomGroupIdField customGroupId() {
        return customGroupId;
    }

    /**
     * CTI code
     *
     * @return the CtiCode field
     */
    public CtiCodeField ctiCode() {
        return ctiCode;
    }

    /**
     * Y=Manual order entry N =Automated order entry
     *
     * @return the ManualOrderIndicator field
     */
    public ManualOrderIndicatorField manualOrderIndicator() {
        return manualOrderIndicator;
    }

    /**
     * Identifies the Order Entry Operator responsible for this message
     *
     * @return the OeoId field
     */
    public OeoIdField oeoId() {
        return oeoId;
    }

    /**
     * Supplemental customer identifier used for billing related programs
     *
     * @return the FrequentTraderId field
     */
    public FrequentTraderIdField frequentTraderId() {
        return frequentTraderId;
    }

    /**
     * Execution source code provided during order entry to describe broker service
     *
     * @return the CustOrderHandlingInst field
     */
    public CustOrderHandlingInstField custOrderHandlingInst() {
        return custOrderHandlingInst;
    }

    /**
     * Identifies the country code of the person or system submitting the order using the ISO 3166 two-character code
     *
     * @return the CountryCode field
     */
    public CountryCodeField countryCode() {
        return countryCode;
    }

    /**
     * For complex orders, the number of legs of the complex instrument specified in the Symbol field
     *
     * @return the LegCnt field
     */
    public LegCntField legCnt() {
        return legCnt;
    }

    /**
     * Indicates status of client position in the option for this leg
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
        IntStream.Builder runs = IntStream.builder();
        padding(runs, 0);
        return runs.build().toArray();
    }

    /**
     * Adds the declared padding runs, as offset and length pairs.
     *
     * @param runs   the destination
     * @param offset the offset of this class's first byte, relative to the start of the message
     * @return the offset just past this class's last byte
     */
    public int padding(IntStream.Builder runs, int offset) {
        int cursor = offset;
        cursor += 20;
        cursor += 1;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 8;
        cursor += 1;
        cursor += 1;
        cursor += 8;
        cursor += 16;
        cursor += 1;
        cursor += 16;
        for (int[] run = PreventMatch.padding(), index = { 0 }; index[0] < run.length; index[0] += 2) {
            runs.add(cursor + run[index[0]]).add(run[index[0] + 1]);
        }
        cursor += PreventMatch.BYTE_LENGTH;
        cursor += 8;
        cursor += 1;
        cursor += 4;
        cursor += 2;
        cursor += 1;
        cursor += 1;
        cursor += 18;
        cursor += 6;
        cursor += 1;
        cursor += 2;
        cursor += 1;
        cursor = legPositionEffect.padding(runs, cursor);
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(expireTime.value());
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
        if (!securityDesc.parse(data, cursor)) {
            return false;
        }
        cursor += SecurityDescField.BYTE_LENGTH;
        if (!capacity.parse(data, cursor)) {
            return false;
        }
        cursor += CapacityField.BYTE_LENGTH;
        if (!account.parse(data, cursor)) {
            return false;
        }
        cursor += AccountField.BYTE_LENGTH;
        if (!preventMatch.parseFrom(data, cursor, end - 45)) {
            return false;
        }
        cursor += preventMatch.byteLength();
        if (!expireTime.parse(data, cursor)) {
            return false;
        }
        cursor += ExpireTimeField.BYTE_LENGTH;
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        if (!cmtaNumber.parse(data, cursor)) {
            return false;
        }
        cursor += CmtaNumberField.BYTE_LENGTH;
        if (!customGroupId.parse(data, cursor)) {
            return false;
        }
        cursor += CustomGroupIdField.BYTE_LENGTH;
        if (!ctiCode.parse(data, cursor)) {
            return false;
        }
        cursor += CtiCodeField.BYTE_LENGTH;
        if (!manualOrderIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        if (!oeoId.parse(data, cursor)) {
            return false;
        }
        cursor += OeoIdField.BYTE_LENGTH;
        if (!frequentTraderId.parse(data, cursor)) {
            return false;
        }
        cursor += FrequentTraderIdField.BYTE_LENGTH;
        if (!custOrderHandlingInst.parse(data, cursor)) {
            return false;
        }
        cursor += CustOrderHandlingInstField.BYTE_LENGTH;
        if (!countryCode.parse(data, cursor)) {
            return false;
        }
        cursor += CountryCodeField.BYTE_LENGTH;
        if (!legCnt.parse(data, cursor)) {
            return false;
        }
        cursor += LegCntField.BYTE_LENGTH;
        if (!legPositionEffect.parse(data, cursor, end, legCnt.value())) {
            return false;
        }
        cursor += legPositionEffect.byteLength();
        if (end - cursor < 0) {
            return false;
        }

        return true;
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
        cursor = ordType.encode(data, cursor);
        cursor = timeInForce.encode(data, cursor);
        cursor = symbol.encode(data, cursor);
        cursor = securityDesc.encode(data, cursor);
        cursor = capacity.encode(data, cursor);
        cursor = account.encode(data, cursor);
        cursor = preventMatch.encode(data, cursor);
        cursor = expireTime.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = cmtaNumber.encode(data, cursor);
        cursor = customGroupId.encode(data, cursor);
        cursor = ctiCode.encode(data, cursor);
        cursor = manualOrderIndicator.encode(data, cursor);
        cursor = oeoId.encode(data, cursor);
        cursor = frequentTraderId.encode(data, cursor);
        cursor = custOrderHandlingInst.encode(data, cursor);
        cursor = countryCode.encode(data, cursor);
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
        if (!legPositionEffect.isRecognized()) {
            return false;
        }
        return true;
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
        if (!ordType.isDecoded()) {
            return Optional.of(ordType);
        }
        if (!timeInForce.isDecoded()) {
            return Optional.of(timeInForce);
        }
        if (!symbol.isDecoded()) {
            return Optional.of(symbol);
        }
        if (!securityDesc.isDecoded()) {
            return Optional.of(securityDesc);
        }
        if (!capacity.isDecoded()) {
            return Optional.of(capacity);
        }
        if (!account.isDecoded()) {
            return Optional.of(account);
        }
        if (!preventMatch.isDecoded()) {
            return preventMatch.failedAt();
        }
        if (!expireTime.isDecoded()) {
            return Optional.of(expireTime);
        }
        if (!openClose.isDecoded()) {
            return Optional.of(openClose);
        }
        if (!cmtaNumber.isDecoded()) {
            return Optional.of(cmtaNumber);
        }
        if (!customGroupId.isDecoded()) {
            return Optional.of(customGroupId);
        }
        if (!ctiCode.isDecoded()) {
            return Optional.of(ctiCode);
        }
        if (!manualOrderIndicator.isDecoded()) {
            return Optional.of(manualOrderIndicator);
        }
        if (!oeoId.isDecoded()) {
            return Optional.of(oeoId);
        }
        if (!frequentTraderId.isDecoded()) {
            return Optional.of(frequentTraderId);
        }
        if (!custOrderHandlingInst.isDecoded()) {
            return Optional.of(custOrderHandlingInst);
        }
        if (!countryCode.isDecoded()) {
            return Optional.of(countryCode);
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
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "Symbol" -> Optional.of(symbol);
            case "SecurityDesc" -> Optional.of(securityDesc);
            case "Capacity" -> Optional.of(capacity);
            case "Account" -> Optional.of(account);
            case "ExpireTime" -> Optional.of(expireTime);
            case "OpenClose" -> Optional.of(openClose);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "CustomGroupId" -> Optional.of(customGroupId);
            case "CtiCode" -> Optional.of(ctiCode);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "OeoId" -> Optional.of(oeoId);
            case "FrequentTraderId" -> Optional.of(frequentTraderId);
            case "CustOrderHandlingInst" -> Optional.of(custOrderHandlingInst);
            case "CountryCode" -> Optional.of(countryCode);
            case "LegCnt" -> Optional.of(legCnt);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderOption message)) {
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
        if (!(other instanceof NewOrderOption message)) {
            return false;
        }
        return fields.equals(message.fields) && legPositionEffect.equals(message.legPositionEffect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, legPositionEffect);
    }
}
