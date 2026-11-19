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
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.DrillThruProtectionField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.ExtExecInstField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.GroupCntField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.IdSourceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.LastPriorityField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.LiquidityProvisionField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NewOrderCrossBitfield1Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NewOrderCrossBitfield2Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NewOrderCrossBitfield3Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.NumberOfNewOrderCrossBitfieldsField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.OrderQtyField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.PreventMatchField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.PriceField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.SecurityIdField;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.fields.SymbolAlphanumericField2;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.groups.OrderAllocationsEntry;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.groups.OrderAllocationsList;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.Field;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.Message;
import omi.cboe.cedxderivatives.binaryorderentry.boe.v2_32.types.PrintOptions;

/**
 * Represents the NewOrderCrossMessage message from the BinaryOrderEntry protocol.
 *
 * <p>New Order Cross Message.</p>
 */
public final class NewOrderCrossMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 37;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Cross Message";

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
    private final NumberOfNewOrderCrossBitfieldsField numberOfNewOrderCrossBitfields = new NumberOfNewOrderCrossBitfieldsField();

    /**
     * BitSet NewOrderCross byte 1.
     */
    private final NewOrderCrossBitfield1Field newOrderCrossBitfield1 = new NewOrderCrossBitfield1Field();

    /**
     * BitSet NewOrderCross byte 2.
     */
    private final NewOrderCrossBitfield2Field newOrderCrossBitfield2 = new NewOrderCrossBitfield2Field();

    /**
     * BitSet NewOrderCross byte 3.
     */
    private final NewOrderCrossBitfield3Field newOrderCrossBitfield3 = new NewOrderCrossBitfield3Field();

    /**
     * Number of order allocations represented by re- peating groups included in this cross order. Must be at least 2 (One agency and one contra), and no more than 11.
     */
    private final GroupCntField groupCnt = new GroupCntField();

    /**
     * Symbol Alphanumeric
     */
    private final SymbolAlphanumericField2 symbolAlphanumeric = new SymbolAlphanumericField2();

    /**
     * Id Source
     */
    private final IdSourceField idSource = new IdSourceField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

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
     * Drill Thru Protection
     */
    private final DrillThruProtectionField drillThruProtection = new DrillThruProtectionField();

    /**
     * Ext Exec Inst
     */
    private final ExtExecInstField extExecInst = new ExtExecInstField();

    /**
     * Repeating group stated GroupCnt times.
     */
    private final OrderAllocationsList orderAllocations = new OrderAllocationsList();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(crossId, crossType, crossPrioritization, price, orderQty, numberOfNewOrderCrossBitfields, newOrderCrossBitfield1, newOrderCrossBitfield2, newOrderCrossBitfield3, groupCnt, symbolAlphanumeric, idSource, securityId, liquidityProvision, preventMatch, autoMatch, autoMatchPrice, lastPriority, drillThruProtection, extExecInst);

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
     * @return the NumberOfNewOrderCrossBitfields field
     */
    public NumberOfNewOrderCrossBitfieldsField numberOfNewOrderCrossBitfields() {
        return numberOfNewOrderCrossBitfields;
    }

    /**
     * BitSet NewOrderCross byte 1.
     *
     * @return the NewOrderCrossBitfield1 field
     */
    public NewOrderCrossBitfield1Field newOrderCrossBitfield1() {
        return newOrderCrossBitfield1;
    }

    /**
     * BitSet NewOrderCross byte 2.
     *
     * @return the NewOrderCrossBitfield2 field
     */
    public NewOrderCrossBitfield2Field newOrderCrossBitfield2() {
        return newOrderCrossBitfield2;
    }

    /**
     * BitSet NewOrderCross byte 3.
     *
     * @return the NewOrderCrossBitfield3 field
     */
    public NewOrderCrossBitfield3Field newOrderCrossBitfield3() {
        return newOrderCrossBitfield3;
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
     * Id Source
     *
     * @return the IdSource field
     */
    public IdSourceField idSource() {
        return idSource;
    }

    /**
     * Security Id
     *
     * @return the SecurityId field
     */
    public SecurityIdField securityId() {
        return securityId;
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
     * Drill Thru Protection
     *
     * @return the DrillThruProtection field
     */
    public DrillThruProtectionField drillThruProtection() {
        return drillThruProtection;
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
     * @return the OrderAllocations entries
     */
    public OrderAllocationsList orderAllocations() {
        return orderAllocations;
    }

    /**
     * Returns whether the fields before the NewOrderCrossBitfield1 put it on the wire.
     *
     * <p>Decode reads the NewOrderCrossBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderCrossBitfield1 is on the wire
     */
    public boolean newOrderCrossBitfield1Present() {
        return numberOfNewOrderCrossBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the NewOrderCrossBitfield2 put it on the wire.
     *
     * <p>Decode reads the NewOrderCrossBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderCrossBitfield2 is on the wire
     */
    public boolean newOrderCrossBitfield2Present() {
        return numberOfNewOrderCrossBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the NewOrderCrossBitfield3 put it on the wire.
     *
     * <p>Decode reads the NewOrderCrossBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderCrossBitfield3 is on the wire
     */
    public boolean newOrderCrossBitfield3Present() {
        return numberOfNewOrderCrossBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the SymbolAlphanumeric put it on the wire.
     *
     * <p>Decode reads the SymbolAlphanumeric where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolAlphanumeric is on the wire
     */
    public boolean symbolAlphanumericPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 1L) && (newOrderCrossBitfield1Present() && newOrderCrossBitfield1.newOrderCrossBitfield1Symbol());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 1L) && (newOrderCrossBitfield1Present() && newOrderCrossBitfield1.newOrderCrossBitfield1IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 1L) && (newOrderCrossBitfield1Present() && newOrderCrossBitfield1.newOrderCrossBitfield1SecurityId());
    }

    /**
     * Returns whether the fields before the LiquidityProvision put it on the wire.
     *
     * <p>Decode reads the LiquidityProvision where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LiquidityProvision is on the wire
     */
    public boolean liquidityProvisionPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 1L) && (newOrderCrossBitfield1Present() && newOrderCrossBitfield1.newOrderCrossBitfield1LiquidityProvision());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 1L) && (newOrderCrossBitfield1Present() && newOrderCrossBitfield1.newOrderCrossBitfield1PreventMatch());
    }

    /**
     * Returns whether the fields before the AutoMatch put it on the wire.
     *
     * <p>Decode reads the AutoMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AutoMatch is on the wire
     */
    public boolean autoMatchPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 2L) && (newOrderCrossBitfield2Present() && newOrderCrossBitfield2.newOrderCrossBitfield2AutoMatch());
    }

    /**
     * Returns whether the fields before the AutoMatchPrice put it on the wire.
     *
     * <p>Decode reads the AutoMatchPrice where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AutoMatchPrice is on the wire
     */
    public boolean autoMatchPricePresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 2L) && (newOrderCrossBitfield2Present() && newOrderCrossBitfield2.newOrderCrossBitfield2AutoMatchPrice());
    }

    /**
     * Returns whether the fields before the LastPriority put it on the wire.
     *
     * <p>Decode reads the LastPriority where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastPriority is on the wire
     */
    public boolean lastPriorityPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 2L) && (newOrderCrossBitfield2Present() && newOrderCrossBitfield2.newOrderCrossBitfield2LastPriority());
    }

    /**
     * Returns whether the fields before the DrillThruProtection put it on the wire.
     *
     * <p>Decode reads the DrillThruProtection where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DrillThruProtection is on the wire
     */
    public boolean drillThruProtectionPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 3L) && (newOrderCrossBitfield3Present() && newOrderCrossBitfield3.newOrderCrossBitfield3DrillThruProtection());
    }

    /**
     * Returns whether the fields before the ExtExecInst put it on the wire.
     *
     * <p>Decode reads the ExtExecInst where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExtExecInst is on the wire
     */
    public boolean extExecInstPresent() {
        return (numberOfNewOrderCrossBitfields.value() >= 3L) && (newOrderCrossBitfield3Present() && newOrderCrossBitfield3.newOrderCrossBitfield3ExtExecInst());
    }

    private boolean onWire(Field field) {
        return (field != newOrderCrossBitfield1 || newOrderCrossBitfield1Present()) && (field != newOrderCrossBitfield2 || newOrderCrossBitfield2Present()) && (field != newOrderCrossBitfield3 || newOrderCrossBitfield3Present()) && (field != symbolAlphanumeric || symbolAlphanumericPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != liquidityProvision || liquidityProvisionPresent()) && (field != preventMatch || preventMatchPresent()) && (field != autoMatch || autoMatchPresent()) && (field != autoMatchPrice || autoMatchPricePresent()) && (field != lastPriority || lastPriorityPresent()) && (field != drillThruProtection || drillThruProtectionPresent()) && (field != extExecInst || extExecInstPresent());
    }

    /**
     * Hands each list whose entries read this record's fields the values they read, none for a field off the wire.
     */
    private void giveEntryInputs() {
        orderAllocations.inputs(OptionalLong.of(numberOfNewOrderCrossBitfields.value()), newOrderCrossBitfield2Present() ? OptionalLong.of(newOrderCrossBitfield2.value()) : OptionalLong.empty(), newOrderCrossBitfield3Present() ? OptionalLong.of(newOrderCrossBitfield3.value()) : OptionalLong.empty(), newOrderCrossBitfield1Present() ? OptionalLong.of(newOrderCrossBitfield1.value()) : OptionalLong.empty());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        giveEntryInputs();
        return MINIMUM_BYTE_LENGTH + (newOrderCrossBitfield1Present() ? NewOrderCrossBitfield1Field.BYTE_LENGTH : 0) + (newOrderCrossBitfield2Present() ? NewOrderCrossBitfield2Field.BYTE_LENGTH : 0) + (newOrderCrossBitfield3Present() ? NewOrderCrossBitfield3Field.BYTE_LENGTH : 0) + orderAllocations.byteLength() + (symbolAlphanumericPresent() ? SymbolAlphanumericField2.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (liquidityProvisionPresent() ? LiquidityProvisionField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (autoMatchPresent() ? AutoMatchField.BYTE_LENGTH : 0) + (autoMatchPricePresent() ? AutoMatchPriceField.BYTE_LENGTH : 0) + (lastPriorityPresent() ? LastPriorityField.BYTE_LENGTH : 0) + (drillThruProtectionPresent() ? DrillThruProtectionField.BYTE_LENGTH : 0) + (extExecInstPresent() ? ExtExecInstField.BYTE_LENGTH : 0);
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
        if (!numberOfNewOrderCrossBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfNewOrderCrossBitfieldsField.BYTE_LENGTH;
        if (newOrderCrossBitfield1Present()) {
            if (end - 2 - cursor < NewOrderCrossBitfield1Field.BYTE_LENGTH || !newOrderCrossBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (newOrderCrossBitfield2Present()) {
            if (end - 2 - cursor < NewOrderCrossBitfield2Field.BYTE_LENGTH || !newOrderCrossBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (newOrderCrossBitfield3Present()) {
            if (end - 2 - cursor < NewOrderCrossBitfield3Field.BYTE_LENGTH || !newOrderCrossBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderCrossBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 2) {
            return false;
        }
        if (!groupCnt.parse(data, cursor)) {
            return false;
        }
        cursor += GroupCntField.BYTE_LENGTH;
        giveEntryInputs();
        if (!orderAllocations.parse(data, cursor, end, groupCnt.value())) {
            return false;
        }
        cursor += orderAllocations.byteLength();
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
        if (idSourcePresent()) {
            if (end - cursor < IdSourceField.BYTE_LENGTH || !idSource.parse(data, cursor)) {
                return false;
            }
            cursor += IdSourceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (securityIdPresent()) {
            if (end - cursor < SecurityIdField.BYTE_LENGTH || !securityId.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityIdField.BYTE_LENGTH;
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
        if (drillThruProtectionPresent()) {
            if (end - cursor < DrillThruProtectionField.BYTE_LENGTH || !drillThruProtection.parse(data, cursor)) {
                return false;
            }
            cursor += DrillThruProtectionField.BYTE_LENGTH;
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
        if (orderAllocations.size() > 65535) {
            throw new IllegalStateException("orderAllocations holds " + orderAllocations.size() + " entries, more than its count field can state");
        }
        groupCnt.value(orderAllocations.size());
        if (newOrderCrossBitfield1Present() != newOrderCrossBitfield1.hasValue()) {
            throw new IllegalStateException(newOrderCrossBitfield1.hasValue() ? "newOrderCrossBitfield1 holds a value the fields before it leave off the wire" : "newOrderCrossBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderCrossBitfield2Present() != newOrderCrossBitfield2.hasValue()) {
            throw new IllegalStateException(newOrderCrossBitfield2.hasValue() ? "newOrderCrossBitfield2 holds a value the fields before it leave off the wire" : "newOrderCrossBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderCrossBitfield3Present() != newOrderCrossBitfield3.hasValue()) {
            throw new IllegalStateException(newOrderCrossBitfield3.hasValue() ? "newOrderCrossBitfield3 holds a value the fields before it leave off the wire" : "newOrderCrossBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (symbolAlphanumericPresent() != symbolAlphanumeric.hasValue()) {
            throw new IllegalStateException(symbolAlphanumeric.hasValue() ? "symbolAlphanumeric holds a value the fields before it leave off the wire" : "symbolAlphanumeric holds no value, though the fields before it put it on the wire");
        }
        if (idSourcePresent() != idSource.hasValue()) {
            throw new IllegalStateException(idSource.hasValue() ? "idSource holds a value the fields before it leave off the wire" : "idSource holds no value, though the fields before it put it on the wire");
        }
        if (securityIdPresent() != securityId.hasValue()) {
            throw new IllegalStateException(securityId.hasValue() ? "securityId holds a value the fields before it leave off the wire" : "securityId holds no value, though the fields before it put it on the wire");
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
        if (drillThruProtectionPresent() != drillThruProtection.hasValue()) {
            throw new IllegalStateException(drillThruProtection.hasValue() ? "drillThruProtection holds a value the fields before it leave off the wire" : "drillThruProtection holds no value, though the fields before it put it on the wire");
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
        cursor = numberOfNewOrderCrossBitfields.encode(data, cursor);
        if (newOrderCrossBitfield1Present()) {
            cursor = newOrderCrossBitfield1.encode(data, cursor);
        }
        if (newOrderCrossBitfield2Present()) {
            cursor = newOrderCrossBitfield2.encode(data, cursor);
        }
        if (newOrderCrossBitfield3Present()) {
            cursor = newOrderCrossBitfield3.encode(data, cursor);
        }
        cursor = groupCnt.encode(data, cursor);
        cursor = orderAllocations.encode(data, cursor);
        if (symbolAlphanumericPresent()) {
            cursor = symbolAlphanumeric.encode(data, cursor);
        }
        if (idSourcePresent()) {
            cursor = idSource.encode(data, cursor);
        }
        if (securityIdPresent()) {
            cursor = securityId.encode(data, cursor);
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
        if (drillThruProtectionPresent()) {
            cursor = drillThruProtection.encode(data, cursor);
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
        orderAllocations.clear();
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
        return orderAllocations.isRecognized();
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
        if (!orderAllocations.isValid()) {
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
        if (!numberOfNewOrderCrossBitfields.isDecoded()) {
            return Optional.of(numberOfNewOrderCrossBitfields);
        }
        if (newOrderCrossBitfield1Present() && !newOrderCrossBitfield1.isDecoded()) {
            return Optional.of(newOrderCrossBitfield1);
        }
        if (newOrderCrossBitfield2Present() && !newOrderCrossBitfield2.isDecoded()) {
            return Optional.of(newOrderCrossBitfield2);
        }
        if (newOrderCrossBitfield3Present() && !newOrderCrossBitfield3.isDecoded()) {
            return Optional.of(newOrderCrossBitfield3);
        }
        if (!groupCnt.isDecoded()) {
            return Optional.of(groupCnt);
        }
        if (!orderAllocations.isDecoded()) {
            return Optional.of(orderAllocations.failedEntry().flatMap(OrderAllocationsEntry::failedAt).orElse(groupCnt));
        }
        if (symbolAlphanumericPresent() && !symbolAlphanumeric.isDecoded()) {
            return Optional.of(symbolAlphanumeric);
        }
        if (idSourcePresent() && !idSource.isDecoded()) {
            return Optional.of(idSource);
        }
        if (securityIdPresent() && !securityId.isDecoded()) {
            return Optional.of(securityId);
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
        if (drillThruProtectionPresent() && !drillThruProtection.isDecoded()) {
            return Optional.of(drillThruProtection);
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
            case "NumberOfNewOrderCrossBitfields" -> Optional.of(numberOfNewOrderCrossBitfields);
            case "NewOrderCrossBitfield1" -> Optional.of(newOrderCrossBitfield1);
            case "NewOrderCrossBitfield2" -> Optional.of(newOrderCrossBitfield2);
            case "NewOrderCrossBitfield3" -> Optional.of(newOrderCrossBitfield3);
            case "GroupCnt" -> Optional.of(groupCnt);
            case "SymbolAlphanumeric" -> Optional.of(symbolAlphanumeric);
            case "IdSource" -> Optional.of(idSource);
            case "SecurityId" -> Optional.of(securityId);
            case "LiquidityProvision" -> Optional.of(liquidityProvision);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "AutoMatch" -> Optional.of(autoMatch);
            case "AutoMatchPrice" -> Optional.of(autoMatchPrice);
            case "LastPriority" -> Optional.of(lastPriority);
            case "DrillThruProtection" -> Optional.of(drillThruProtection);
            case "ExtExecInst" -> Optional.of(extExecInst);
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
        changed.addAll(orderAllocations.diffFields(message.orderAllocations));
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
            orderAllocations.toFormattedString(builder, options);
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
        orderAllocations.toFormattedString(builder, nested);
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
        return fields.equals(message.fields) && orderAllocations.equals(message.orderAllocations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, orderAllocations);
    }
}
