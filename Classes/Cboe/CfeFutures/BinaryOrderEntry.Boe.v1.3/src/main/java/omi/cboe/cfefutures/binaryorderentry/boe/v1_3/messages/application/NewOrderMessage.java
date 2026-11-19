package omi.cboe.cfefutures.binaryorderentry.boe.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.AccountField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.CapacityField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ClOrdIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ClearingAccountField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ClearingFirmField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.CmtaNumberField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.CtiCodeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.CustomGroupIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ExpireTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.FrequentTraderIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ManualOrderIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.MaturityDateField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.MinQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.NewOrderBitfield1Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.NewOrderBitfield2Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.NewOrderBitfield3Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.NewOrderBitfield4Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.NewOrderBitfield5Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.NewOrderBitfield6Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.NewOrderBitfield7Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.NewOrderBitfield8Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.NumberOfNewOrderBitfieldsField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.OeoidField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.OpenCloseField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.OrdTypeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.OrderQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.PreventMatchField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.PriceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.RiskResetField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.SideField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.StopPxField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.SymbolLongField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.TimeInForceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.types.PrintOptions;

/**
 * Represents the NewOrderMessage message from the BinaryOrderEntry protocol.
 *
 * <p>A new order message consists of a number of required fields followed by a number of optional fields.</p>
 */
public final class NewOrderMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 26;

    /**
     * This message's declared name.
     */
    public static final String NAME = "New Order Message";

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to Side (54) in Cboe FIX.
     */
    private final SideField side = new SideField();

    /**
     * Order quantity. System limit is 999,999 shares.
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Number of bitfields that follow; the fields they gate are appended to the message.
     */
    private final NumberOfNewOrderBitfieldsField numberOfNewOrderBitfields = new NumberOfNewOrderBitfieldsField();

    /**
     * BitSet NewOrder byte 1.
     */
    private final NewOrderBitfield1Field newOrderBitfield1 = new NewOrderBitfield1Field();

    /**
     * BitSet NewOrder byte 2.
     */
    private final NewOrderBitfield2Field newOrderBitfield2 = new NewOrderBitfield2Field();

    /**
     * BitSet NewOrder byte 3.
     */
    private final NewOrderBitfield3Field newOrderBitfield3 = new NewOrderBitfield3Field();

    /**
     * BitSet NewOrder byte 4.
     */
    private final NewOrderBitfield4Field newOrderBitfield4 = new NewOrderBitfield4Field();

    /**
     * BitSet NewOrder byte 5.
     */
    private final NewOrderBitfield5Field newOrderBitfield5 = new NewOrderBitfield5Field();

    /**
     * BitSet NewOrder byte 6.
     */
    private final NewOrderBitfield6Field newOrderBitfield6 = new NewOrderBitfield6Field();

    /**
     * BitSet NewOrder byte 7.
     */
    private final NewOrderBitfield7Field newOrderBitfield7 = new NewOrderBitfield7Field();

    /**
     * BitSet NewOrder byte 8.
     */
    private final NewOrderBitfield8Field newOrderBitfield8 = new NewOrderBitfield8Field();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Clearing Account
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Price
     */
    private final PriceField price = new PriceField();

    /**
     * Ord Type
     */
    private final OrdTypeField ordType = new OrdTypeField();

    /**
     * Time In Force
     */
    private final TimeInForceField timeInForce = new TimeInForceField();

    /**
     * Min Qty
     */
    private final MinQtyField minQty = new MinQtyField();

    /**
     * Symbol Long
     */
    private final SymbolLongField symbolLong = new SymbolLongField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Account
     */
    private final AccountField account = new AccountField();

    /**
     * Prevent Match
     */
    private final PreventMatchField preventMatch = new PreventMatchField();

    /**
     * Expire Time
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Maturity Date
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Risk Reset
     */
    private final RiskResetField riskReset = new RiskResetField();

    /**
     * Open Close
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Cmta Number
     */
    private final CmtaNumberField cmtaNumber = new CmtaNumberField();

    /**
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Custom Group Id
     */
    private final CustomGroupIdField customGroupId = new CustomGroupIdField();

    /**
     * Cti Code
     */
    private final CtiCodeField ctiCode = new CtiCodeField();

    /**
     * Manual Order Indicator
     */
    private final ManualOrderIndicatorField manualOrderIndicator = new ManualOrderIndicatorField();

    /**
     * Oeoid
     */
    private final OeoidField oeoid = new OeoidField();

    /**
     * Frequent Trader Id
     */
    private final FrequentTraderIdField frequentTraderId = new FrequentTraderIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(clOrdId, side, orderQty, numberOfNewOrderBitfields, newOrderBitfield1, newOrderBitfield2, newOrderBitfield3, newOrderBitfield4, newOrderBitfield5, newOrderBitfield6, newOrderBitfield7, newOrderBitfield8, clearingFirm, clearingAccount, price, ordType, timeInForce, minQty, symbolLong, capacity, account, preventMatch, expireTime, maturityDate, riskReset, openClose, cmtaNumber, stopPx, customGroupId, ctiCode, manualOrderIndicator, oeoid, frequentTraderId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Corresponds to Side (54) in Cboe FIX.
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * Order quantity. System limit is 999,999 shares.
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended to the message.
     *
     * @return the NumberOfNewOrderBitfields field
     */
    public NumberOfNewOrderBitfieldsField numberOfNewOrderBitfields() {
        return numberOfNewOrderBitfields;
    }

    /**
     * BitSet NewOrder byte 1.
     *
     * @return the NewOrderBitfield1 field
     */
    public NewOrderBitfield1Field newOrderBitfield1() {
        return newOrderBitfield1;
    }

    /**
     * BitSet NewOrder byte 2.
     *
     * @return the NewOrderBitfield2 field
     */
    public NewOrderBitfield2Field newOrderBitfield2() {
        return newOrderBitfield2;
    }

    /**
     * BitSet NewOrder byte 3.
     *
     * @return the NewOrderBitfield3 field
     */
    public NewOrderBitfield3Field newOrderBitfield3() {
        return newOrderBitfield3;
    }

    /**
     * BitSet NewOrder byte 4.
     *
     * @return the NewOrderBitfield4 field
     */
    public NewOrderBitfield4Field newOrderBitfield4() {
        return newOrderBitfield4;
    }

    /**
     * BitSet NewOrder byte 5.
     *
     * @return the NewOrderBitfield5 field
     */
    public NewOrderBitfield5Field newOrderBitfield5() {
        return newOrderBitfield5;
    }

    /**
     * BitSet NewOrder byte 6.
     *
     * @return the NewOrderBitfield6 field
     */
    public NewOrderBitfield6Field newOrderBitfield6() {
        return newOrderBitfield6;
    }

    /**
     * BitSet NewOrder byte 7.
     *
     * @return the NewOrderBitfield7 field
     */
    public NewOrderBitfield7Field newOrderBitfield7() {
        return newOrderBitfield7;
    }

    /**
     * BitSet NewOrder byte 8.
     *
     * @return the NewOrderBitfield8 field
     */
    public NewOrderBitfield8Field newOrderBitfield8() {
        return newOrderBitfield8;
    }

    /**
     * Clearing Firm
     *
     * @return the ClearingFirm field
     */
    public ClearingFirmField clearingFirm() {
        return clearingFirm;
    }

    /**
     * Clearing Account
     *
     * @return the ClearingAccount field
     */
    public ClearingAccountField clearingAccount() {
        return clearingAccount;
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
     * Ord Type
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
     * Min Qty
     *
     * @return the MinQty field
     */
    public MinQtyField minQty() {
        return minQty;
    }

    /**
     * Symbol Long
     *
     * @return the SymbolLong field
     */
    public SymbolLongField symbolLong() {
        return symbolLong;
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
     * Account
     *
     * @return the Account field
     */
    public AccountField account() {
        return account;
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
     * Expire Time
     *
     * @return the ExpireTime field
     */
    public ExpireTimeField expireTime() {
        return expireTime;
    }

    /**
     * Maturity Date
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
    }

    /**
     * Risk Reset
     *
     * @return the RiskReset field
     */
    public RiskResetField riskReset() {
        return riskReset;
    }

    /**
     * Open Close
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * Cmta Number
     *
     * @return the CmtaNumber field
     */
    public CmtaNumberField cmtaNumber() {
        return cmtaNumber;
    }

    /**
     * Stop Px
     *
     * @return the StopPx field
     */
    public StopPxField stopPx() {
        return stopPx;
    }

    /**
     * Custom Group Id
     *
     * @return the CustomGroupId field
     */
    public CustomGroupIdField customGroupId() {
        return customGroupId;
    }

    /**
     * Cti Code
     *
     * @return the CtiCode field
     */
    public CtiCodeField ctiCode() {
        return ctiCode;
    }

    /**
     * Manual Order Indicator
     *
     * @return the ManualOrderIndicator field
     */
    public ManualOrderIndicatorField manualOrderIndicator() {
        return manualOrderIndicator;
    }

    /**
     * Oeoid
     *
     * @return the Oeoid field
     */
    public OeoidField oeoid() {
        return oeoid;
    }

    /**
     * Frequent Trader Id
     *
     * @return the FrequentTraderId field
     */
    public FrequentTraderIdField frequentTraderId() {
        return frequentTraderId;
    }

    /**
     * Returns whether the fields before the NewOrderBitfield1 put it on the wire.
     *
     * <p>Decode reads the NewOrderBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderBitfield1 is on the wire
     */
    public boolean newOrderBitfield1Present() {
        return numberOfNewOrderBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the NewOrderBitfield2 put it on the wire.
     *
     * <p>Decode reads the NewOrderBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderBitfield2 is on the wire
     */
    public boolean newOrderBitfield2Present() {
        return numberOfNewOrderBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the NewOrderBitfield3 put it on the wire.
     *
     * <p>Decode reads the NewOrderBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderBitfield3 is on the wire
     */
    public boolean newOrderBitfield3Present() {
        return numberOfNewOrderBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the NewOrderBitfield4 put it on the wire.
     *
     * <p>Decode reads the NewOrderBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderBitfield4 is on the wire
     */
    public boolean newOrderBitfield4Present() {
        return numberOfNewOrderBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the NewOrderBitfield5 put it on the wire.
     *
     * <p>Decode reads the NewOrderBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderBitfield5 is on the wire
     */
    public boolean newOrderBitfield5Present() {
        return numberOfNewOrderBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the NewOrderBitfield6 put it on the wire.
     *
     * <p>Decode reads the NewOrderBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderBitfield6 is on the wire
     */
    public boolean newOrderBitfield6Present() {
        return numberOfNewOrderBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the NewOrderBitfield7 put it on the wire.
     *
     * <p>Decode reads the NewOrderBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderBitfield7 is on the wire
     */
    public boolean newOrderBitfield7Present() {
        return numberOfNewOrderBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the NewOrderBitfield8 put it on the wire.
     *
     * <p>Decode reads the NewOrderBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the NewOrderBitfield8 is on the wire
     */
    public boolean newOrderBitfield8Present() {
        return numberOfNewOrderBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfNewOrderBitfields.value() >= 1L) && (newOrderBitfield1Present() && newOrderBitfield1.newOrderBitfield1ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfNewOrderBitfields.value() >= 1L) && (newOrderBitfield1Present() && newOrderBitfield1.newOrderBitfield1ClearingAccount());
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfNewOrderBitfields.value() >= 1L) && (newOrderBitfield1Present() && newOrderBitfield1.newOrderBitfield1Price());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfNewOrderBitfields.value() >= 1L) && (newOrderBitfield1Present() && newOrderBitfield1.newOrderBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfNewOrderBitfields.value() >= 1L) && (newOrderBitfield1Present() && newOrderBitfield1.newOrderBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfNewOrderBitfields.value() >= 1L) && (newOrderBitfield1Present() && newOrderBitfield1.newOrderBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the SymbolLong put it on the wire.
     *
     * <p>Decode reads the SymbolLong where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolLong is on the wire
     */
    public boolean symbolLongPresent() {
        return (numberOfNewOrderBitfields.value() >= 2L) && (newOrderBitfield2Present() && newOrderBitfield2.newOrderBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfNewOrderBitfields.value() >= 2L) && (newOrderBitfield2Present() && newOrderBitfield2.newOrderBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfNewOrderBitfields.value() >= 3L) && (newOrderBitfield3Present() && newOrderBitfield3.newOrderBitfield3Account());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfNewOrderBitfields.value() >= 3L) && (newOrderBitfield3Present() && newOrderBitfield3.newOrderBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the ExpireTime put it on the wire.
     *
     * <p>Decode reads the ExpireTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExpireTime is on the wire
     */
    public boolean expireTimePresent() {
        return (numberOfNewOrderBitfields.value() >= 3L) && (newOrderBitfield3Present() && newOrderBitfield3.newOrderBitfield3ExpireTime());
    }

    /**
     * Returns whether the fields before the MaturityDate put it on the wire.
     *
     * <p>Decode reads the MaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaturityDate is on the wire
     */
    public boolean maturityDatePresent() {
        return (numberOfNewOrderBitfields.value() >= 4L) && (newOrderBitfield4Present() && newOrderBitfield4.newOrderBitfield4MaturityDate());
    }

    /**
     * Returns whether the fields before the RiskReset put it on the wire.
     *
     * <p>Decode reads the RiskReset where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the RiskReset is on the wire
     */
    public boolean riskResetPresent() {
        return (numberOfNewOrderBitfields.value() >= 4L) && (newOrderBitfield4Present() && newOrderBitfield4.newOrderBitfield4RiskReset());
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfNewOrderBitfields.value() >= 4L) && (newOrderBitfield4Present() && newOrderBitfield4.newOrderBitfield4OpenClose());
    }

    /**
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfNewOrderBitfields.value() >= 4L) && (newOrderBitfield4Present() && newOrderBitfield4.newOrderBitfield4CmtaNumber());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfNewOrderBitfields.value() >= 6L) && (newOrderBitfield6Present() && newOrderBitfield6.newOrderBitfield6StopPx());
    }

    /**
     * Returns whether the fields before the CustomGroupId put it on the wire.
     *
     * <p>Decode reads the CustomGroupId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CustomGroupId is on the wire
     */
    public boolean customGroupIdPresent() {
        return (numberOfNewOrderBitfields.value() >= 7L) && (newOrderBitfield7Present() && newOrderBitfield7.newOrderBitfield7CustomGroupId());
    }

    /**
     * Returns whether the fields before the CtiCode put it on the wire.
     *
     * <p>Decode reads the CtiCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CtiCode is on the wire
     */
    public boolean ctiCodePresent() {
        return (numberOfNewOrderBitfields.value() >= 7L) && (newOrderBitfield7Present() && newOrderBitfield7.newOrderBitfield7CtiCode());
    }

    /**
     * Returns whether the fields before the ManualOrderIndicator put it on the wire.
     *
     * <p>Decode reads the ManualOrderIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ManualOrderIndicator is on the wire
     */
    public boolean manualOrderIndicatorPresent() {
        return (numberOfNewOrderBitfields.value() >= 7L) && (newOrderBitfield7Present() && newOrderBitfield7.newOrderBitfield7ManualOrderIndicator());
    }

    /**
     * Returns whether the fields before the Oeoid put it on the wire.
     *
     * <p>Decode reads the Oeoid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Oeoid is on the wire
     */
    public boolean oeoidPresent() {
        return (numberOfNewOrderBitfields.value() >= 7L) && (newOrderBitfield7Present() && newOrderBitfield7.newOrderBitfield7Oeoid());
    }

    /**
     * Returns whether the fields before the FrequentTraderId put it on the wire.
     *
     * <p>Decode reads the FrequentTraderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FrequentTraderId is on the wire
     */
    public boolean frequentTraderIdPresent() {
        return (numberOfNewOrderBitfields.value() >= 8L) && (newOrderBitfield8Present() && newOrderBitfield8.newOrderBitfield8FrequentTraderId());
    }

    private boolean onWire(Field field) {
        return (field != newOrderBitfield1 || newOrderBitfield1Present()) && (field != newOrderBitfield2 || newOrderBitfield2Present()) && (field != newOrderBitfield3 || newOrderBitfield3Present()) && (field != newOrderBitfield4 || newOrderBitfield4Present()) && (field != newOrderBitfield5 || newOrderBitfield5Present()) && (field != newOrderBitfield6 || newOrderBitfield6Present()) && (field != newOrderBitfield7 || newOrderBitfield7Present()) && (field != newOrderBitfield8 || newOrderBitfield8Present()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != price || pricePresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbolLong || symbolLongPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != preventMatch || preventMatchPresent()) && (field != expireTime || expireTimePresent()) && (field != maturityDate || maturityDatePresent()) && (field != riskReset || riskResetPresent()) && (field != openClose || openClosePresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != stopPx || stopPxPresent()) && (field != customGroupId || customGroupIdPresent()) && (field != ctiCode || ctiCodePresent()) && (field != manualOrderIndicator || manualOrderIndicatorPresent()) && (field != oeoid || oeoidPresent()) && (field != frequentTraderId || frequentTraderIdPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (newOrderBitfield1Present() ? NewOrderBitfield1Field.BYTE_LENGTH : 0) + (newOrderBitfield2Present() ? NewOrderBitfield2Field.BYTE_LENGTH : 0) + (newOrderBitfield3Present() ? NewOrderBitfield3Field.BYTE_LENGTH : 0) + (newOrderBitfield4Present() ? NewOrderBitfield4Field.BYTE_LENGTH : 0) + (newOrderBitfield5Present() ? NewOrderBitfield5Field.BYTE_LENGTH : 0) + (newOrderBitfield6Present() ? NewOrderBitfield6Field.BYTE_LENGTH : 0) + (newOrderBitfield7Present() ? NewOrderBitfield7Field.BYTE_LENGTH : 0) + (newOrderBitfield8Present() ? NewOrderBitfield8Field.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolLongPresent() ? SymbolLongField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (expireTimePresent() ? ExpireTimeField.BYTE_LENGTH : 0) + (maturityDatePresent() ? MaturityDateField.BYTE_LENGTH : 0) + (riskResetPresent() ? RiskResetField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (customGroupIdPresent() ? CustomGroupIdField.BYTE_LENGTH : 0) + (ctiCodePresent() ? CtiCodeField.BYTE_LENGTH : 0) + (manualOrderIndicatorPresent() ? ManualOrderIndicatorField.BYTE_LENGTH : 0) + (oeoidPresent() ? OeoidField.BYTE_LENGTH : 0) + (frequentTraderIdPresent() ? FrequentTraderIdField.BYTE_LENGTH : 0);
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
        if (!numberOfNewOrderBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfNewOrderBitfieldsField.BYTE_LENGTH;
        if (newOrderBitfield1Present()) {
            if (end - cursor < NewOrderBitfield1Field.BYTE_LENGTH || !newOrderBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (newOrderBitfield2Present()) {
            if (end - cursor < NewOrderBitfield2Field.BYTE_LENGTH || !newOrderBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (newOrderBitfield3Present()) {
            if (end - cursor < NewOrderBitfield3Field.BYTE_LENGTH || !newOrderBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (newOrderBitfield4Present()) {
            if (end - cursor < NewOrderBitfield4Field.BYTE_LENGTH || !newOrderBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (newOrderBitfield5Present()) {
            if (end - cursor < NewOrderBitfield5Field.BYTE_LENGTH || !newOrderBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (newOrderBitfield6Present()) {
            if (end - cursor < NewOrderBitfield6Field.BYTE_LENGTH || !newOrderBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (newOrderBitfield7Present()) {
            if (end - cursor < NewOrderBitfield7Field.BYTE_LENGTH || !newOrderBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (newOrderBitfield8Present()) {
            if (end - cursor < NewOrderBitfield8Field.BYTE_LENGTH || !newOrderBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += NewOrderBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingFirmPresent()) {
            if (end - cursor < ClearingFirmField.BYTE_LENGTH || !clearingFirm.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingFirmField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (clearingAccountPresent()) {
            if (end - cursor < ClearingAccountField.BYTE_LENGTH || !clearingAccount.parse(data, cursor)) {
                return false;
            }
            cursor += ClearingAccountField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (pricePresent()) {
            if (end - cursor < PriceField.BYTE_LENGTH || !price.parse(data, cursor)) {
                return false;
            }
            cursor += PriceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (ordTypePresent()) {
            if (end - cursor < OrdTypeField.BYTE_LENGTH || !ordType.parse(data, cursor)) {
                return false;
            }
            cursor += OrdTypeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (timeInForcePresent()) {
            if (end - cursor < TimeInForceField.BYTE_LENGTH || !timeInForce.parse(data, cursor)) {
                return false;
            }
            cursor += TimeInForceField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (minQtyPresent()) {
            if (end - cursor < MinQtyField.BYTE_LENGTH || !minQty.parse(data, cursor)) {
                return false;
            }
            cursor += MinQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (symbolLongPresent()) {
            if (end - cursor < SymbolLongField.BYTE_LENGTH || !symbolLong.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolLongField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (capacityPresent()) {
            if (end - cursor < CapacityField.BYTE_LENGTH || !capacity.parse(data, cursor)) {
                return false;
            }
            cursor += CapacityField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (accountPresent()) {
            if (end - cursor < AccountField.BYTE_LENGTH || !account.parse(data, cursor)) {
                return false;
            }
            cursor += AccountField.BYTE_LENGTH;
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
        if (expireTimePresent()) {
            if (end - cursor < ExpireTimeField.BYTE_LENGTH || !expireTime.parse(data, cursor)) {
                return false;
            }
            cursor += ExpireTimeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (maturityDatePresent()) {
            if (end - cursor < MaturityDateField.BYTE_LENGTH || !maturityDate.parse(data, cursor)) {
                return false;
            }
            cursor += MaturityDateField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (riskResetPresent()) {
            if (end - cursor < RiskResetField.BYTE_LENGTH || !riskReset.parse(data, cursor)) {
                return false;
            }
            cursor += RiskResetField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (openClosePresent()) {
            if (end - cursor < OpenCloseField.BYTE_LENGTH || !openClose.parse(data, cursor)) {
                return false;
            }
            cursor += OpenCloseField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (cmtaNumberPresent()) {
            if (end - cursor < CmtaNumberField.BYTE_LENGTH || !cmtaNumber.parse(data, cursor)) {
                return false;
            }
            cursor += CmtaNumberField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (stopPxPresent()) {
            if (end - cursor < StopPxField.BYTE_LENGTH || !stopPx.parse(data, cursor)) {
                return false;
            }
            cursor += StopPxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (customGroupIdPresent()) {
            if (end - cursor < CustomGroupIdField.BYTE_LENGTH || !customGroupId.parse(data, cursor)) {
                return false;
            }
            cursor += CustomGroupIdField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (ctiCodePresent()) {
            if (end - cursor < CtiCodeField.BYTE_LENGTH || !ctiCode.parse(data, cursor)) {
                return false;
            }
            cursor += CtiCodeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (manualOrderIndicatorPresent()) {
            if (end - cursor < ManualOrderIndicatorField.BYTE_LENGTH || !manualOrderIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += ManualOrderIndicatorField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (oeoidPresent()) {
            if (end - cursor < OeoidField.BYTE_LENGTH || !oeoid.parse(data, cursor)) {
                return false;
            }
            cursor += OeoidField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (frequentTraderIdPresent()) {
            if (end - cursor < FrequentTraderIdField.BYTE_LENGTH || !frequentTraderId.parse(data, cursor)) {
                return false;
            }
            cursor += FrequentTraderIdField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (newOrderBitfield1Present() != newOrderBitfield1.hasValue()) {
            throw new IllegalStateException(newOrderBitfield1.hasValue() ? "newOrderBitfield1 holds a value the fields before it leave off the wire" : "newOrderBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderBitfield2Present() != newOrderBitfield2.hasValue()) {
            throw new IllegalStateException(newOrderBitfield2.hasValue() ? "newOrderBitfield2 holds a value the fields before it leave off the wire" : "newOrderBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderBitfield3Present() != newOrderBitfield3.hasValue()) {
            throw new IllegalStateException(newOrderBitfield3.hasValue() ? "newOrderBitfield3 holds a value the fields before it leave off the wire" : "newOrderBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderBitfield4Present() != newOrderBitfield4.hasValue()) {
            throw new IllegalStateException(newOrderBitfield4.hasValue() ? "newOrderBitfield4 holds a value the fields before it leave off the wire" : "newOrderBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderBitfield5Present() != newOrderBitfield5.hasValue()) {
            throw new IllegalStateException(newOrderBitfield5.hasValue() ? "newOrderBitfield5 holds a value the fields before it leave off the wire" : "newOrderBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderBitfield6Present() != newOrderBitfield6.hasValue()) {
            throw new IllegalStateException(newOrderBitfield6.hasValue() ? "newOrderBitfield6 holds a value the fields before it leave off the wire" : "newOrderBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderBitfield7Present() != newOrderBitfield7.hasValue()) {
            throw new IllegalStateException(newOrderBitfield7.hasValue() ? "newOrderBitfield7 holds a value the fields before it leave off the wire" : "newOrderBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (newOrderBitfield8Present() != newOrderBitfield8.hasValue()) {
            throw new IllegalStateException(newOrderBitfield8.hasValue() ? "newOrderBitfield8 holds a value the fields before it leave off the wire" : "newOrderBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (clearingAccountPresent() != clearingAccount.hasValue()) {
            throw new IllegalStateException(clearingAccount.hasValue() ? "clearingAccount holds a value the fields before it leave off the wire" : "clearingAccount holds no value, though the fields before it put it on the wire");
        }
        if (pricePresent() != price.hasValue()) {
            throw new IllegalStateException(price.hasValue() ? "price holds a value the fields before it leave off the wire" : "price holds no value, though the fields before it put it on the wire");
        }
        if (ordTypePresent() != ordType.hasValue()) {
            throw new IllegalStateException(ordType.hasValue() ? "ordType holds a value the fields before it leave off the wire" : "ordType holds no value, though the fields before it put it on the wire");
        }
        if (timeInForcePresent() != timeInForce.hasValue()) {
            throw new IllegalStateException(timeInForce.hasValue() ? "timeInForce holds a value the fields before it leave off the wire" : "timeInForce holds no value, though the fields before it put it on the wire");
        }
        if (minQtyPresent() != minQty.hasValue()) {
            throw new IllegalStateException(minQty.hasValue() ? "minQty holds a value the fields before it leave off the wire" : "minQty holds no value, though the fields before it put it on the wire");
        }
        if (symbolLongPresent() != symbolLong.hasValue()) {
            throw new IllegalStateException(symbolLong.hasValue() ? "symbolLong holds a value the fields before it leave off the wire" : "symbolLong holds no value, though the fields before it put it on the wire");
        }
        if (capacityPresent() != capacity.hasValue()) {
            throw new IllegalStateException(capacity.hasValue() ? "capacity holds a value the fields before it leave off the wire" : "capacity holds no value, though the fields before it put it on the wire");
        }
        if (accountPresent() != account.hasValue()) {
            throw new IllegalStateException(account.hasValue() ? "account holds a value the fields before it leave off the wire" : "account holds no value, though the fields before it put it on the wire");
        }
        if (preventMatchPresent() != preventMatch.hasValue()) {
            throw new IllegalStateException(preventMatch.hasValue() ? "preventMatch holds a value the fields before it leave off the wire" : "preventMatch holds no value, though the fields before it put it on the wire");
        }
        if (expireTimePresent() != expireTime.hasValue()) {
            throw new IllegalStateException(expireTime.hasValue() ? "expireTime holds a value the fields before it leave off the wire" : "expireTime holds no value, though the fields before it put it on the wire");
        }
        if (maturityDatePresent() != maturityDate.hasValue()) {
            throw new IllegalStateException(maturityDate.hasValue() ? "maturityDate holds a value the fields before it leave off the wire" : "maturityDate holds no value, though the fields before it put it on the wire");
        }
        if (riskResetPresent() != riskReset.hasValue()) {
            throw new IllegalStateException(riskReset.hasValue() ? "riskReset holds a value the fields before it leave off the wire" : "riskReset holds no value, though the fields before it put it on the wire");
        }
        if (openClosePresent() != openClose.hasValue()) {
            throw new IllegalStateException(openClose.hasValue() ? "openClose holds a value the fields before it leave off the wire" : "openClose holds no value, though the fields before it put it on the wire");
        }
        if (cmtaNumberPresent() != cmtaNumber.hasValue()) {
            throw new IllegalStateException(cmtaNumber.hasValue() ? "cmtaNumber holds a value the fields before it leave off the wire" : "cmtaNumber holds no value, though the fields before it put it on the wire");
        }
        if (stopPxPresent() != stopPx.hasValue()) {
            throw new IllegalStateException(stopPx.hasValue() ? "stopPx holds a value the fields before it leave off the wire" : "stopPx holds no value, though the fields before it put it on the wire");
        }
        if (customGroupIdPresent() != customGroupId.hasValue()) {
            throw new IllegalStateException(customGroupId.hasValue() ? "customGroupId holds a value the fields before it leave off the wire" : "customGroupId holds no value, though the fields before it put it on the wire");
        }
        if (ctiCodePresent() != ctiCode.hasValue()) {
            throw new IllegalStateException(ctiCode.hasValue() ? "ctiCode holds a value the fields before it leave off the wire" : "ctiCode holds no value, though the fields before it put it on the wire");
        }
        if (manualOrderIndicatorPresent() != manualOrderIndicator.hasValue()) {
            throw new IllegalStateException(manualOrderIndicator.hasValue() ? "manualOrderIndicator holds a value the fields before it leave off the wire" : "manualOrderIndicator holds no value, though the fields before it put it on the wire");
        }
        if (oeoidPresent() != oeoid.hasValue()) {
            throw new IllegalStateException(oeoid.hasValue() ? "oeoid holds a value the fields before it leave off the wire" : "oeoid holds no value, though the fields before it put it on the wire");
        }
        if (frequentTraderIdPresent() != frequentTraderId.hasValue()) {
            throw new IllegalStateException(frequentTraderId.hasValue() ? "frequentTraderId holds a value the fields before it leave off the wire" : "frequentTraderId holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = clOrdId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = orderQty.encode(data, cursor);
        cursor = numberOfNewOrderBitfields.encode(data, cursor);
        if (newOrderBitfield1Present()) {
            cursor = newOrderBitfield1.encode(data, cursor);
        }
        if (newOrderBitfield2Present()) {
            cursor = newOrderBitfield2.encode(data, cursor);
        }
        if (newOrderBitfield3Present()) {
            cursor = newOrderBitfield3.encode(data, cursor);
        }
        if (newOrderBitfield4Present()) {
            cursor = newOrderBitfield4.encode(data, cursor);
        }
        if (newOrderBitfield5Present()) {
            cursor = newOrderBitfield5.encode(data, cursor);
        }
        if (newOrderBitfield6Present()) {
            cursor = newOrderBitfield6.encode(data, cursor);
        }
        if (newOrderBitfield7Present()) {
            cursor = newOrderBitfield7.encode(data, cursor);
        }
        if (newOrderBitfield8Present()) {
            cursor = newOrderBitfield8.encode(data, cursor);
        }
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (clearingAccountPresent()) {
            cursor = clearingAccount.encode(data, cursor);
        }
        if (pricePresent()) {
            cursor = price.encode(data, cursor);
        }
        if (ordTypePresent()) {
            cursor = ordType.encode(data, cursor);
        }
        if (timeInForcePresent()) {
            cursor = timeInForce.encode(data, cursor);
        }
        if (minQtyPresent()) {
            cursor = minQty.encode(data, cursor);
        }
        if (symbolLongPresent()) {
            cursor = symbolLong.encode(data, cursor);
        }
        if (capacityPresent()) {
            cursor = capacity.encode(data, cursor);
        }
        if (accountPresent()) {
            cursor = account.encode(data, cursor);
        }
        if (preventMatchPresent()) {
            cursor = preventMatch.encode(data, cursor);
        }
        if (expireTimePresent()) {
            cursor = expireTime.encode(data, cursor);
        }
        if (maturityDatePresent()) {
            cursor = maturityDate.encode(data, cursor);
        }
        if (riskResetPresent()) {
            cursor = riskReset.encode(data, cursor);
        }
        if (openClosePresent()) {
            cursor = openClose.encode(data, cursor);
        }
        if (cmtaNumberPresent()) {
            cursor = cmtaNumber.encode(data, cursor);
        }
        if (stopPxPresent()) {
            cursor = stopPx.encode(data, cursor);
        }
        if (customGroupIdPresent()) {
            cursor = customGroupId.encode(data, cursor);
        }
        if (ctiCodePresent()) {
            cursor = ctiCode.encode(data, cursor);
        }
        if (manualOrderIndicatorPresent()) {
            cursor = manualOrderIndicator.encode(data, cursor);
        }
        if (oeoidPresent()) {
            cursor = oeoid.encode(data, cursor);
        }
        if (frequentTraderIdPresent()) {
            cursor = frequentTraderId.encode(data, cursor);
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
        this.buffer = null;
        this.decoded = false;
    }

    @Override
    public boolean isDecoded() {
        return decoded;
    }

    @Override
    public boolean isRecognized() {
        for (Field field : fields()) {
            if (!field.isRecognized()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid() {
        for (Field field : fields()) {
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
        return fields.stream().filter(this::onWire).toList();
    }

    @Override
    public Optional<Field> field(String name) {
        return switch (name) {
            case "ClOrdId" -> Optional.of(clOrdId);
            case "Side" -> Optional.of(side);
            case "OrderQty" -> Optional.of(orderQty);
            case "NumberOfNewOrderBitfields" -> Optional.of(numberOfNewOrderBitfields);
            case "NewOrderBitfield1" -> Optional.of(newOrderBitfield1);
            case "NewOrderBitfield2" -> Optional.of(newOrderBitfield2);
            case "NewOrderBitfield3" -> Optional.of(newOrderBitfield3);
            case "NewOrderBitfield4" -> Optional.of(newOrderBitfield4);
            case "NewOrderBitfield5" -> Optional.of(newOrderBitfield5);
            case "NewOrderBitfield6" -> Optional.of(newOrderBitfield6);
            case "NewOrderBitfield7" -> Optional.of(newOrderBitfield7);
            case "NewOrderBitfield8" -> Optional.of(newOrderBitfield8);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "Price" -> Optional.of(price);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "SymbolLong" -> Optional.of(symbolLong);
            case "Capacity" -> Optional.of(capacity);
            case "Account" -> Optional.of(account);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "ExpireTime" -> Optional.of(expireTime);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "RiskReset" -> Optional.of(riskReset);
            case "OpenClose" -> Optional.of(openClose);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "StopPx" -> Optional.of(stopPx);
            case "CustomGroupId" -> Optional.of(customGroupId);
            case "CtiCode" -> Optional.of(ctiCode);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "Oeoid" -> Optional.of(oeoid);
            case "FrequentTraderId" -> Optional.of(frequentTraderId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof NewOrderMessage message)) {
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

        List<Field> onWire = fields();
        if (options.compact()) {
            builder.append(NAME).append(" { ");
            for (int index = 0; index < onWire.size(); index++) {
                if (index > 0) {
                    builder.append(", ");
                }
                onWire.get(index).toFormattedString(builder, options);
            }
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
        if (!(other instanceof NewOrderMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
