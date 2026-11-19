package omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.AutoMatchField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.AutoMatchPriceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossPrioritizationField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.CrossTypeField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ExtExecInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.GroupCntField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.LastPriorityField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.LiquidityProvisionField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NewOrderCrossMultilegBitfield1Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NewOrderCrossMultilegBitfield2Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NewOrderCrossMultilegBitfield3Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NumberOfNewOrderCrossMultilegBitfieldsField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.OrderQtyField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.PreventMatchField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.PriceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.SymbolAlphanumericField2;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.groups.NewOrderCrossMultilegOrderAllocationsEntry;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.groups.NewOrderCrossMultilegOrderAllocationsList;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.PrintOptions;

/**
 * Represents the NewOrderCrossMultilegMessage message from the BinaryOrderEntry protocol.
 *
 * <p>New Order Cross Multileg Message.</p>
 */
public final class NewOrderCrossMultilegMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 37;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Cross Multileg Message";

    /**
     * Corresponds to CrossID (548) in Cboe FIX. Day-unique identifier for the cross order chosen by the client. Characters in the ASCII range 33– 126 are allowed, except for comma, semicolon, and pipe.
     */
    private final CrossIdField crossId = new CrossIdField();

    /**
     * Corresponds to CrossType (549) in Cboe FIX. Type of auction order being submitted. This indicates the type of auction that will be initiated upon order entry. 1 = Automated Improvement Mechanism (AIM)
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * Corresponds to CrossPrioritization (550) in Cboe FIX. Indicates which side of the cross order will be pri- oritized for execution. This identifies the Agency side. 1 = Buy 2 = Sell
     */
    private final CrossPrioritizationField crossPrioritization = new CrossPrioritizationField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 con- tracts.
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfNewOrderCrossMultilegBitfieldsField numberOfNewOrderCrossMultilegBitfields = new NumberOfNewOrderCrossMultilegBitfieldsField();

    /**
     * BitSet NewOrderCrossMultileg byte 1.
     */
    private final NewOrderCrossMultilegBitfield1Field newOrderCrossMultilegBitfield1 = new NewOrderCrossMultilegBitfield1Field();

    /**
     * BitSet NewOrderCrossMultileg byte 2.
     */
    private final NewOrderCrossMultilegBitfield2Field newOrderCrossMultilegBitfield2 = new NewOrderCrossMultilegBitfield2Field();

    /**
     * BitSet NewOrderCrossMultileg byte 3.
     */
    private final NewOrderCrossMultilegBitfield3Field newOrderCrossMultilegBitfield3 = new NewOrderCrossMultilegBitfield3Field();

    /**
     * Number of order allocations represented by re- peating groups included in this cross order. Must be at least 2 (One agency and one contra), and no more than 11.
     */
    private final GroupCntField groupCnt = new GroupCntField();

    /**
     * Symbol Alphanumeric
     */
    private final SymbolAlphanumericField2 symbolAlphanumeric = new SymbolAlphanumericField2();

    /**
     * Liquidity Provision
     */
    private final LiquidityProvisionField liquidityProvision = new LiquidityProvisionField();

    /**
     * Prevent Match
     */
    private final PreventMatchField preventMatch = new PreventMatchField();

    /**
     * Auto Match
     */
    private final AutoMatchField autoMatch = new AutoMatchField();

    /**
     * Auto Match Price
     */
    private final AutoMatchPriceField autoMatchPrice = new AutoMatchPriceField();

    /**
     * Last Priority
     */
    private final LastPriorityField lastPriority = new LastPriorityField();

    /**
     * Ext Exec Inst
     */
    private final ExtExecInstField extExecInst = new ExtExecInstField();

    /**
     * Repeating group stated GroupCnt times.
     */
    private final NewOrderCrossMultilegOrderAllocationsList newOrderCrossMultilegOrderAllocations = new NewOrderCrossMultilegOrderAllocationsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(crossId, crossType, crossPrioritization, price, orderQty, numberOfNewOrderCrossMultilegBitfields, newOrderCrossMultilegBitfield1, newOrderCrossMultilegBitfield2, newOrderCrossMultilegBitfield3, groupCnt, symbolAlphanumeric, liquidityProvision, preventMatch, autoMatch, autoMatchPrice, lastPriority, extExecInst);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Corresponds to CrossID (548) in Cboe FIX. Day-unique identifier for the cross order chosen by the client. Characters in the ASCII range 33– 126 are allowed, except for comma, semicolon, and pipe.
     *
     * @return the CrossId field
     */
    public CrossIdField crossId() {
        return crossId;
    }

    /**
     * Corresponds to CrossType (549) in Cboe FIX. Type of auction order being submitted. This indicates the type of auction that will be initiated upon order entry. 1 = Automated Improvement Mechanism (AIM)
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
    }

    /**
     * Corresponds to CrossPrioritization (550) in Cboe FIX. Indicates which side of the cross order will be pri- oritized for execution. This identifies the Agency side. 1 = Buy 2 = Sell
     *
     * @return the CrossPrioritization field
     */
    public CrossPrioritizationField crossPrioritization() {
        return crossPrioritization;
    }

    /**
     * Price
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * Corresponds to OrderQty (38) in Cboe FIX. Order quantity. System limit is 999,999 con- tracts.
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfNewOrderCrossMultilegBitfields field
     */
    public NumberOfNewOrderCrossMultilegBitfieldsField numberOfNewOrderCrossMultilegBitfields() {
        return numberOfNewOrderCrossMultilegBitfields;
    }

    /**
     * BitSet NewOrderCrossMultileg byte 1.
     *
     * @return the NewOrderCrossMultilegBitfield1 field
     */
    public NewOrderCrossMultilegBitfield1Field newOrderCrossMultilegBitfield1() {
        return newOrderCrossMultilegBitfield1;
    }

    /**
     * BitSet NewOrderCrossMultileg byte 2.
     *
     * @return the NewOrderCrossMultilegBitfield2 field
     */
    public NewOrderCrossMultilegBitfield2Field newOrderCrossMultilegBitfield2() {
        return newOrderCrossMultilegBitfield2;
    }

    /**
     * BitSet NewOrderCrossMultileg byte 3.
     *
     * @return the NewOrderCrossMultilegBitfield3 field
     */
    public NewOrderCrossMultilegBitfield3Field newOrderCrossMultilegBitfield3() {
        return newOrderCrossMultilegBitfield3;
    }

    /**
     * Number of order allocations represented by re- peating groups included in this cross order. Must be at least 2 (One agency and one contra), and no more than 11.
     *
     * @return the GroupCnt field
     */
    public GroupCntField groupCnt() {
        return groupCnt;
    }

    /**
     * Symbol Alphanumeric
     *
     * @return the SymbolAlphanumeric field
     */
    public SymbolAlphanumericField2 symbolAlphanumeric() {
        return symbolAlphanumeric;
    }

    /**
     * Liquidity Provision
     *
     * @return the LiquidityProvision field
     */
    public LiquidityProvisionField liquidityProvision() {
        return liquidityProvision;
    }

    /**
     * Prevent Match
     *
     * @return the PreventMatch field
     */
    public PreventMatchField preventMatch() {
        return preventMatch;
    }

    /**
     * Auto Match
     *
     * @return the AutoMatch field
     */
    public AutoMatchField autoMatch() {
        return autoMatch;
    }

    /**
     * Auto Match Price
     *
     * @return the AutoMatchPrice field
     */
    public AutoMatchPriceField autoMatchPrice() {
        return autoMatchPrice;
    }

    /**
     * Last Priority
     *
     * @return the LastPriority field
     */
    public LastPriorityField lastPriority() {
        return lastPriority;
    }

    /**
     * Ext Exec Inst
     *
     * @return the ExtExecInst field
     */
    public ExtExecInstField extExecInst() {
        return extExecInst;
    }

    /**
     * Repeating group stated GroupCnt times.
     *
     * <p>Encode writes this list's size to the GroupCnt field.</p>
     *
     * @return the NewOrderCrossMultilegOrderAllocations entries
     */
    public NewOrderCrossMultilegOrderAllocationsList newOrderCrossMultilegOrderAllocations() {
        return newOrderCrossMultilegOrderAllocations;
    }

    /**
     * Returns whether the fields before the NewOrderCrossMultilegBitfield1 put it on the wire.
     *
     * <p>Decode reads the NewOrderCrossMultilegBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderCrossMultilegBitfield1 is on the wire
     */
    public boolean newOrderCrossMultilegBitfield1Present() {
        return numberOfNewOrderCrossMultilegBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the NewOrderCrossMultilegBitfield2 put it on the wire.
     *
     * <p>Decode reads the NewOrderCrossMultilegBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderCrossMultilegBitfield2 is on the wire
     */
    public boolean newOrderCrossMultilegBitfield2Present() {
        return numberOfNewOrderCrossMultilegBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the NewOrderCrossMultilegBitfield3 put it on the wire.
     *
     * <p>Decode reads the NewOrderCrossMultilegBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderCrossMultilegBitfield3 is on the wire
     */
    public boolean newOrderCrossMultilegBitfield3Present() {
        return numberOfNewOrderCrossMultilegBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 1L) && (newOrderCrossMultilegBitfield1Present() && newOrderCrossMultilegBitfield1.newOrderCrossMultilegBitfield1Symbol());
    }

    /**
     * Returns whether the fields before the LiquidityProvision put it on the wire.
     *
     * <p>Decode reads the LiquidityProvision where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LiquidityProvision is on the wire
     */
    public boolean liquidityProvisionPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 1L) && (newOrderCrossMultilegBitfield1Present() && newOrderCrossMultilegBitfield1.newOrderCrossMultilegBitfield1LiquidityProvision());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 1L) && (newOrderCrossMultilegBitfield1Present() && newOrderCrossMultilegBitfield1.newOrderCrossMultilegBitfield1PreventMatch());
    }

    /**
     * Returns whether the fields before the AutoMatch put it on the wire.
     *
     * <p>Decode reads the AutoMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AutoMatch is on the wire
     */
    public boolean autoMatchPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 2L) && (newOrderCrossMultilegBitfield2Present() && newOrderCrossMultilegBitfield2.newOrderCrossMultilegBitfield2AutoMatch());
    }

    /**
     * Returns whether the fields before the AutoMatchPrice put it on the wire.
     *
     * <p>Decode reads the AutoMatchPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AutoMatchPrice is on the wire
     */
    public boolean autoMatchPricePresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 2L) && (newOrderCrossMultilegBitfield2Present() && newOrderCrossMultilegBitfield2.newOrderCrossMultilegBitfield2AutoMatchPrice());
    }

    /**
     * Returns whether the fields before the LastPriority put it on the wire.
     *
     * <p>Decode reads the LastPriority where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastPriority is on the wire
     */
    public boolean lastPriorityPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 2L) && (newOrderCrossMultilegBitfield2Present() && newOrderCrossMultilegBitfield2.newOrderCrossMultilegBitfield2LastPriority());
    }

    /**
     * Returns whether the fields before the ExtExecInst put it on the wire.
     *
     * <p>Decode reads the ExtExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExtExecInst is on the wire
     */
    public boolean extExecInstPresent() {
        return (numberOfNewOrderCrossMultilegBitfields.value() >= 2L) && (newOrderCrossMultilegBitfield2Present() && newOrderCrossMultilegBitfield2.newOrderCrossMultilegBitfield2ExtExecInst());
    }

    private boolean onWire(Field field) {
        return (field != newOrderCrossMultilegBitfield1 || newOrderCrossMultilegBitfield1Present()) && (field != newOrderCrossMultilegBitfield2 || newOrderCrossMultilegBitfield2Present()) && (field != newOrderCrossMultilegBitfield3 || newOrderCrossMultilegBitfield3Present()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != liquidityProvision || liquidityProvisionPresent()) && (field != preventMatch || preventMatchPresent()) && (field != autoMatch || autoMatchPresent()) && (field != autoMatchPrice || autoMatchPricePresent()) && (field != lastPriority || lastPriorityPresent()) && (field != extExecInst || extExecInstPresent());
    }

    /**
     * Hands each list whose entries read this record's fields the values they read, none for a field off the wire.
     */
    private void giveEntryInputs() {
        newOrderCrossMultilegOrderAllocations.inputs(OptionalLong.of(numberOfNewOrderCrossMultilegBitfields.value()), newOrderCrossMultilegBitfield2Present() ? OptionalLong.of(newOrderCrossMultilegBitfield2.value()) : OptionalLong.empty(), newOrderCrossMultilegBitfield3Present() ? OptionalLong.of(newOrderCrossMultilegBitfield3.value()) : OptionalLong.empty(), newOrderCrossMultilegBitfield1Present() ? OptionalLong.of(newOrderCrossMultilegBitfield1.value()) : OptionalLong.empty());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        giveEntryInputs();
        return MINIMUM_BYTE_LENGTH + (newOrderCrossMultilegBitfield1Present() ? NewOrderCrossMultilegBitfield1Field.BYTE_LENGTH : 0) + (newOrderCrossMultilegBitfield2Present() ? NewOrderCrossMultilegBitfield2Field.BYTE_LENGTH : 0) + (newOrderCrossMultilegBitfield3Present() ? NewOrderCrossMultilegBitfield3Field.BYTE_LENGTH : 0) + newOrderCrossMultilegOrderAllocations.byteLength() + (symbolAlphanumericPresent() ? SymbolAlphanumericField2.BYTE_LENGTH : 0) + (liquidityProvisionPresent() ? LiquidityProvisionField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (autoMatchPresent() ? AutoMatchField.BYTE_LENGTH : 0) + (autoMatchPricePresent() ? AutoMatchPriceField.BYTE_LENGTH : 0) + (lastPriorityPresent() ? LastPriorityField.BYTE_LENGTH : 0) + (extExecInstPresent() ? ExtExecInstField.BYTE_LENGTH : 0);
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
        if (!numberOfNewOrderCrossMultilegBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfNewOrderCrossMultilegBitfieldsField.BYTE_LENGTH;
        if (newOrderCrossMultilegBitfield1Present()) {
            if (end - 2 - cursor < NewOrderCrossMultilegBitfield1Field.BYTE_LENGTH || !newOrderCrossMultilegBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossMultilegBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (newOrderCrossMultilegBitfield2Present()) {
            if (end - 2 - cursor < NewOrderCrossMultilegBitfield2Field.BYTE_LENGTH || !newOrderCrossMultilegBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossMultilegBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (newOrderCrossMultilegBitfield3Present()) {
            if (end - 2 - cursor < NewOrderCrossMultilegBitfield3Field.BYTE_LENGTH || !newOrderCrossMultilegBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossMultilegBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (!groupCnt.parse(data, cursor)) {
            return false;
        }
        cursor += GroupCntField.BYTE_LENGTH;
        giveEntryInputs();
        if (!newOrderCrossMultilegOrderAllocations.parse(data, cursor, end, groupCnt.value())) {
            return false;
        }
        cursor += newOrderCrossMultilegOrderAllocations.byteLength();
        if (end - cursor < 0) {
            return false;
        }
        if (symbolAlphanumericPresent()) {
            if (end - cursor < SymbolAlphanumericField2.BYTE_LENGTH || !symbolAlphanumeric.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolAlphanumericField2.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (liquidityProvisionPresent()) {
            if (end - cursor < LiquidityProvisionField.BYTE_LENGTH || !liquidityProvision.parse(data, cursor)) {
                return false;
            }
            cursor += LiquidityProvisionField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (preventMatchPresent()) {
            if (end - cursor < PreventMatchField.BYTE_LENGTH || !preventMatch.parse(data, cursor)) {
                return false;
            }
            cursor += PreventMatchField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (autoMatchPresent()) {
            if (end - cursor < AutoMatchField.BYTE_LENGTH || !autoMatch.parse(data, cursor)) {
                return false;
            }
            cursor += AutoMatchField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (autoMatchPricePresent()) {
            if (end - cursor < AutoMatchPriceField.BYTE_LENGTH || !autoMatchPrice.parse(data, cursor)) {
                return false;
            }
            cursor += AutoMatchPriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (lastPriorityPresent()) {
            if (end - cursor < LastPriorityField.BYTE_LENGTH || !lastPriority.parse(data, cursor)) {
                return false;
            }
            cursor += LastPriorityField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (extExecInstPresent()) {
            if (end - cursor < ExtExecInstField.BYTE_LENGTH || !extExecInst.parse(data, cursor)) {
                return false;
            }
            cursor += ExtExecInstField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (newOrderCrossMultilegOrderAllocations.size() > 65535) {
            throw new IllegalStateException("newOrderCrossMultilegOrderAllocations holds " + newOrderCrossMultilegOrderAllocations.size() + " entries, more than its count field can state");
        }
        groupCnt.value(newOrderCrossMultilegOrderAllocations.size());
        if (newOrderCrossMultilegBitfield1Present() != newOrderCrossMultilegBitfield1.hasValue()) {
            throw new IllegalStateException(newOrderCrossMultilegBitfield1.hasValue() ? "newOrderCrossMultilegBitfield1 holds a value the fields before it leave off the wire" : "newOrderCrossMultilegBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderCrossMultilegBitfield2Present() != newOrderCrossMultilegBitfield2.hasValue()) {
            throw new IllegalStateException(newOrderCrossMultilegBitfield2.hasValue() ? "newOrderCrossMultilegBitfield2 holds a value the fields before it leave off the wire" : "newOrderCrossMultilegBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderCrossMultilegBitfield3Present() != newOrderCrossMultilegBitfield3.hasValue()) {
            throw new IllegalStateException(newOrderCrossMultilegBitfield3.hasValue() ? "newOrderCrossMultilegBitfield3 holds a value the fields before it leave off the wire" : "newOrderCrossMultilegBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (symbolAlphanumericPresent() != symbolAlphanumeric.hasValue()) {
            throw new IllegalStateException(symbolAlphanumeric.hasValue() ? "symbolAlphanumeric holds a value the fields before it leave off the wire" : "symbolAlphanumeric holds no value, though the fields before it put it on the wire");
        }
        if (liquidityProvisionPresent() != liquidityProvision.hasValue()) {
            throw new IllegalStateException(liquidityProvision.hasValue() ? "liquidityProvision holds a value the fields before it leave off the wire" : "liquidityProvision holds no value, though the fields before it put it on the wire");
        }
        if (preventMatchPresent() != preventMatch.hasValue()) {
            throw new IllegalStateException(preventMatch.hasValue() ? "preventMatch holds a value the fields before it leave off the wire" : "preventMatch holds no value, though the fields before it put it on the wire");
        }
        if (autoMatchPresent() != autoMatch.hasValue()) {
            throw new IllegalStateException(autoMatch.hasValue() ? "autoMatch holds a value the fields before it leave off the wire" : "autoMatch holds no value, though the fields before it put it on the wire");
        }
        if (autoMatchPricePresent() != autoMatchPrice.hasValue()) {
            throw new IllegalStateException(autoMatchPrice.hasValue() ? "autoMatchPrice holds a value the fields before it leave off the wire" : "autoMatchPrice holds no value, though the fields before it put it on the wire");
        }
        if (lastPriorityPresent() != lastPriority.hasValue()) {
            throw new IllegalStateException(lastPriority.hasValue() ? "lastPriority holds a value the fields before it leave off the wire" : "lastPriority holds no value, though the fields before it put it on the wire");
        }
        if (extExecInstPresent() != extExecInst.hasValue()) {
            throw new IllegalStateException(extExecInst.hasValue() ? "extExecInst holds a value the fields before it leave off the wire" : "extExecInst holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = crossId.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
        cursor = crossPrioritization.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = numberOfNewOrderCrossMultilegBitfields.encode(data, cursor);
        if (newOrderCrossMultilegBitfield1Present()) {
            cursor = newOrderCrossMultilegBitfield1.encode(data, cursor);
        }
        if (newOrderCrossMultilegBitfield2Present()) {
            cursor = newOrderCrossMultilegBitfield2.encode(data, cursor);
        }
        if (newOrderCrossMultilegBitfield3Present()) {
            cursor = newOrderCrossMultilegBitfield3.encode(data, cursor);
        }
        cursor = groupCnt.encode(data, cursor);
        cursor = newOrderCrossMultilegOrderAllocations.encode(data, cursor);
        if (symbolAlphanumericPresent()) {
            cursor = symbolAlphanumeric.encode(data, cursor);
        }
        if (liquidityProvisionPresent()) {
            cursor = liquidityProvision.encode(data, cursor);
        }
        if (preventMatchPresent()) {
            cursor = preventMatch.encode(data, cursor);
        }
        if (autoMatchPresent()) {
            cursor = autoMatch.encode(data, cursor);
        }
        if (autoMatchPricePresent()) {
            cursor = autoMatchPrice.encode(data, cursor);
        }
        if (lastPriorityPresent()) {
            cursor = lastPriority.encode(data, cursor);
        }
        if (extExecInstPresent()) {
            cursor = extExecInst.encode(data, cursor);
        }
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
        newOrderCrossMultilegOrderAllocations.clear();
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
        for (Field field : fields()) {
            if (field != groupCnt && !field.isRecognized()) {
                return false;
            }
        }
        return newOrderCrossMultilegOrderAllocations.isRecognized();
    }

    @Override
    public boolean isValid() {
        if (buffer != null && !decoded) {
            return false;
        }
        for (Field field : fields()) {
            if (field != groupCnt && !field.isValid()) {
                return false;
            }
        }
        if (!newOrderCrossMultilegOrderAllocations.isValid()) {
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
        if (!numberOfNewOrderCrossMultilegBitfields.isDecoded()) {
            return Optional.of(numberOfNewOrderCrossMultilegBitfields);
        }
        if (newOrderCrossMultilegBitfield1Present() && !newOrderCrossMultilegBitfield1.isDecoded()) {
            return Optional.of(newOrderCrossMultilegBitfield1);
        }
        if (newOrderCrossMultilegBitfield2Present() && !newOrderCrossMultilegBitfield2.isDecoded()) {
            return Optional.of(newOrderCrossMultilegBitfield2);
        }
        if (newOrderCrossMultilegBitfield3Present() && !newOrderCrossMultilegBitfield3.isDecoded()) {
            return Optional.of(newOrderCrossMultilegBitfield3);
        }
        if (!groupCnt.isDecoded()) {
            return Optional.of(groupCnt);
        }
        if (!newOrderCrossMultilegOrderAllocations.isDecoded()) {
            return Optional.of(newOrderCrossMultilegOrderAllocations.failedEntry().flatMap(NewOrderCrossMultilegOrderAllocationsEntry::failedAt).orElse(groupCnt));
        }
        if (symbolAlphanumericPresent() && !symbolAlphanumeric.isDecoded()) {
            return Optional.of(symbolAlphanumeric);
        }
        if (liquidityProvisionPresent() && !liquidityProvision.isDecoded()) {
            return Optional.of(liquidityProvision);
        }
        if (preventMatchPresent() && !preventMatch.isDecoded()) {
            return Optional.of(preventMatch);
        }
        if (autoMatchPresent() && !autoMatch.isDecoded()) {
            return Optional.of(autoMatch);
        }
        if (autoMatchPricePresent() && !autoMatchPrice.isDecoded()) {
            return Optional.of(autoMatchPrice);
        }
        if (lastPriorityPresent() && !lastPriority.isDecoded()) {
            return Optional.of(lastPriority);
        }
        if (extExecInstPresent() && !extExecInst.isDecoded()) {
            return Optional.of(extExecInst);
        }
        return Optional.empty();
    }

    @Override
    public List<Field> fields() {
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "CrossId" -> Optional.of(crossId);
            case "CrossType" -> Optional.of(crossType);
            case "CrossPrioritization" -> Optional.of(crossPrioritization);
            case "Price" -> Optional.of(price);
            case "OrderQty" -> Optional.of(orderQty);
            case "NumberOfNewOrderCrossMultilegBitfields" -> Optional.of(numberOfNewOrderCrossMultilegBitfields);
            case "NewOrderCrossMultilegBitfield1" -> Optional.of(newOrderCrossMultilegBitfield1);
            case "NewOrderCrossMultilegBitfield2" -> Optional.of(newOrderCrossMultilegBitfield2);
            case "NewOrderCrossMultilegBitfield3" -> Optional.of(newOrderCrossMultilegBitfield3);
            case "GroupCnt" -> Optional.of(groupCnt);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "AutoMatch" -> Optional.of(autoMatch);
            case "AutoMatchPrice" -> Optional.of(autoMatchPrice);
            case "LastPriority" -> Optional.of(lastPriority);
            case "ExtExecInst" -> Optional.of(extExecInst);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderCrossMultilegMessage message)) {
            return List.of();
        }
        List<Field> changed = new ArrayList<>();
        for (int index = 0; index < fields.size(); index++) {
            if (!fields.get(index).equals(message.fields.get(index))) {
                changed.add(fields.get(index));
            }
        }
        changed.addAll(newOrderCrossMultilegOrderAllocations.diffFields(message.newOrderCrossMultilegOrderAllocations));
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
            builder.append(", ");
            newOrderCrossMultilegOrderAllocations.toFormattedString(builder, options);
            builder.append(" }");
            return;
        }

        builder.append(options.prefix()).append(NAME).append(System.lineSeparator());
        PrintOptions nested = options.nested();
        for (Field field : onWire) {
            builder.append(nested.prefix());
            field.toFormattedString(builder, nested);
            builder.append(System.lineSeparator());
        }
        newOrderCrossMultilegOrderAllocations.toFormattedString(builder, nested);
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
        if (!(other instanceof NewOrderCrossMultilegMessage message)) {
            return false;
        }
        return fields.equals(message.fields) && newOrderCrossMultilegOrderAllocations.equals(message.newOrderCrossMultilegOrderAllocations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, newOrderCrossMultilegOrderAllocations);
    }
}
