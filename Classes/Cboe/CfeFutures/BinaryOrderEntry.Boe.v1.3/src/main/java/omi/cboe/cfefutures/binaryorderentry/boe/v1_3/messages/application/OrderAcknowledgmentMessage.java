package omi.cboe.cfefutures.binaryorderentry.boe.v1_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.AccountField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.AvgPxField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.BaseLiquidityIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.CapacityField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ClOrdIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ClearingAccountField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ClearingFirmField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.CmtaNumberField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.CtiCodeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.CumQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.DayAvgPxField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.DayCumQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.DayOrderQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ExpireTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.FrequentTraderIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.LeavesQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ManualOrderIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.MaturityDateField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.MinQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.OeoidField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.OpenCloseField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.OrdTypeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.OrderIdField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.OrderQtyField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.PreventMatchField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.PriceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ReturnBitfield10Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ReturnBitfield11Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ReturnBitfield12Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ReturnBitfield13Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ReturnBitfield14Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ReturnBitfield15Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ReturnBitfield16Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ReturnBitfield17Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ReturnBitfield1Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ReturnBitfield2Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ReturnBitfield3Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ReturnBitfield4Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ReturnBitfield5Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ReturnBitfield6Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ReturnBitfield7Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ReturnBitfield8Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.ReturnBitfield9Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.SideField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.StopPxField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.SubLiquidityIndicatorField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.SymbolLongField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.TimeInForceField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.fields.TransactionTimeField;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.types.Field;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.types.Message;
import omi.cboe.cfefutures.binaryorderentry.boe.v1_3.types.PrintOptions;

/**
 * Represents the OrderAcknowledgmentMessage message from the BinaryOrderEntry protocol.
 *
 * <p>An order has been acknowledged</p>
 */
public final class OrderAcknowledgmentMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 38;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Acknowledgment Message";

    /**
     * The time the event occurred in the CFE matching engine.
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Order identifier supplied by Cboe. This Identifier corresponds to the identifiers used in Cboe market data products
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Number of bitfields that follow; the fields they gate are appended to the message.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet OrderAcknowledgment byte 1.
     */
    private final ReturnBitfield1Field returnBitfield1 = new ReturnBitfield1Field();

    /**
     * BitSet OrderAcknowledgment byte 2.
     */
    private final ReturnBitfield2Field returnBitfield2 = new ReturnBitfield2Field();

    /**
     * BitSet OrderAcknowledgment byte 3.
     */
    private final ReturnBitfield3Field returnBitfield3 = new ReturnBitfield3Field();

    /**
     * BitSet OrderAcknowledgment byte 4.
     */
    private final ReturnBitfield4Field returnBitfield4 = new ReturnBitfield4Field();

    /**
     * BitSet OrderAcknowledgment byte 5.
     */
    private final ReturnBitfield5Field returnBitfield5 = new ReturnBitfield5Field();

    /**
     * BitSet OrderAcknowledgment byte 6.
     */
    private final ReturnBitfield6Field returnBitfield6 = new ReturnBitfield6Field();

    /**
     * BitSet OrderAcknowledgment byte 7.
     */
    private final ReturnBitfield7Field returnBitfield7 = new ReturnBitfield7Field();

    /**
     * BitSet OrderAcknowledgment byte 8.
     */
    private final ReturnBitfield8Field returnBitfield8 = new ReturnBitfield8Field();

    /**
     * BitSet OrderAcknowledgment byte 9.
     */
    private final ReturnBitfield9Field returnBitfield9 = new ReturnBitfield9Field();

    /**
     * BitSet OrderAcknowledgment byte 10.
     */
    private final ReturnBitfield10Field returnBitfield10 = new ReturnBitfield10Field();

    /**
     * BitSet OrderAcknowledgment byte 11.
     */
    private final ReturnBitfield11Field returnBitfield11 = new ReturnBitfield11Field();

    /**
     * BitSet OrderAcknowledgment byte 12.
     */
    private final ReturnBitfield12Field returnBitfield12 = new ReturnBitfield12Field();

    /**
     * BitSet OrderAcknowledgment byte 13.
     */
    private final ReturnBitfield13Field returnBitfield13 = new ReturnBitfield13Field();

    /**
     * BitSet OrderAcknowledgment byte 14.
     */
    private final ReturnBitfield14Field returnBitfield14 = new ReturnBitfield14Field();

    /**
     * BitSet OrderAcknowledgment byte 15.
     */
    private final ReturnBitfield15Field returnBitfield15 = new ReturnBitfield15Field();

    /**
     * BitSet OrderAcknowledgment byte 16.
     */
    private final ReturnBitfield16Field returnBitfield16 = new ReturnBitfield16Field();

    /**
     * BitSet OrderAcknowledgment byte 17.
     */
    private final ReturnBitfield17Field returnBitfield17 = new ReturnBitfield17Field();

    /**
     * Corresponds to Side (54) in Cboe FIX.
     */
    private final SideField side = new SideField();

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
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Clearing Account
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Order quantity. System limit is 999,999 shares.
     */
    private final OrderQtyField orderQty = new OrderQtyField();

    /**
     * Prevent Match
     */
    private final PreventMatchField preventMatch = new PreventMatchField();

    /**
     * Maturity Date
     */
    private final MaturityDateField maturityDate = new MaturityDateField();

    /**
     * Open Close
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * Leaves Qty
     */
    private final LeavesQtyField leavesQty = new LeavesQtyField();

    /**
     * Base Liquidity Indicator
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Expire Time
     */
    private final ExpireTimeField expireTime = new ExpireTimeField();

    /**
     * Sub Liquidity Indicator
     */
    private final SubLiquidityIndicatorField subLiquidityIndicator = new SubLiquidityIndicatorField();

    /**
     * Stop Px
     */
    private final StopPxField stopPx = new StopPxField();

    /**
     * Cmta Number
     */
    private final CmtaNumberField cmtaNumber = new CmtaNumberField();

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
     * Cum Qty
     */
    private final CumQtyField cumQty = new CumQtyField();

    /**
     * Day Order Qty
     */
    private final DayOrderQtyField dayOrderQty = new DayOrderQtyField();

    /**
     * Day Cum Qty
     */
    private final DayCumQtyField dayCumQty = new DayCumQtyField();

    /**
     * Avg Px
     */
    private final AvgPxField avgPx = new AvgPxField();

    /**
     * Day Avg Px
     */
    private final DayAvgPxField dayAvgPx = new DayAvgPxField();

    /**
     * Frequent Trader Id
     */
    private final FrequentTraderIdField frequentTraderId = new FrequentTraderIdField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, orderId, numberOfReturnBitfields, returnBitfield1, returnBitfield2, returnBitfield3, returnBitfield4, returnBitfield5, returnBitfield6, returnBitfield7, returnBitfield8, returnBitfield9, returnBitfield10, returnBitfield11, returnBitfield12, returnBitfield13, returnBitfield14, returnBitfield15, returnBitfield16, returnBitfield17, side, price, ordType, timeInForce, minQty, symbolLong, capacity, account, clearingFirm, clearingAccount, orderQty, preventMatch, maturityDate, openClose, leavesQty, baseLiquidityIndicator, expireTime, subLiquidityIndicator, stopPx, cmtaNumber, ctiCode, manualOrderIndicator, oeoid, cumQty, dayOrderQty, dayCumQty, avgPx, dayAvgPx, frequentTraderId);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the CFE matching engine.
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, and pipe.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Order identifier supplied by Cboe. This Identifier corresponds to the identifiers used in Cboe market data products
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended to the message.
     *
     * @return the NumberOfReturnBitfields field
     */
    public NumberOfReturnBitfieldsField numberOfReturnBitfields() {
        return numberOfReturnBitfields;
    }

    /**
     * BitSet OrderAcknowledgment byte 1.
     *
     * @return the ReturnBitfield1 field
     */
    public ReturnBitfield1Field returnBitfield1() {
        return returnBitfield1;
    }

    /**
     * BitSet OrderAcknowledgment byte 2.
     *
     * @return the ReturnBitfield2 field
     */
    public ReturnBitfield2Field returnBitfield2() {
        return returnBitfield2;
    }

    /**
     * BitSet OrderAcknowledgment byte 3.
     *
     * @return the ReturnBitfield3 field
     */
    public ReturnBitfield3Field returnBitfield3() {
        return returnBitfield3;
    }

    /**
     * BitSet OrderAcknowledgment byte 4.
     *
     * @return the ReturnBitfield4 field
     */
    public ReturnBitfield4Field returnBitfield4() {
        return returnBitfield4;
    }

    /**
     * BitSet OrderAcknowledgment byte 5.
     *
     * @return the ReturnBitfield5 field
     */
    public ReturnBitfield5Field returnBitfield5() {
        return returnBitfield5;
    }

    /**
     * BitSet OrderAcknowledgment byte 6.
     *
     * @return the ReturnBitfield6 field
     */
    public ReturnBitfield6Field returnBitfield6() {
        return returnBitfield6;
    }

    /**
     * BitSet OrderAcknowledgment byte 7.
     *
     * @return the ReturnBitfield7 field
     */
    public ReturnBitfield7Field returnBitfield7() {
        return returnBitfield7;
    }

    /**
     * BitSet OrderAcknowledgment byte 8.
     *
     * @return the ReturnBitfield8 field
     */
    public ReturnBitfield8Field returnBitfield8() {
        return returnBitfield8;
    }

    /**
     * BitSet OrderAcknowledgment byte 9.
     *
     * @return the ReturnBitfield9 field
     */
    public ReturnBitfield9Field returnBitfield9() {
        return returnBitfield9;
    }

    /**
     * BitSet OrderAcknowledgment byte 10.
     *
     * @return the ReturnBitfield10 field
     */
    public ReturnBitfield10Field returnBitfield10() {
        return returnBitfield10;
    }

    /**
     * BitSet OrderAcknowledgment byte 11.
     *
     * @return the ReturnBitfield11 field
     */
    public ReturnBitfield11Field returnBitfield11() {
        return returnBitfield11;
    }

    /**
     * BitSet OrderAcknowledgment byte 12.
     *
     * @return the ReturnBitfield12 field
     */
    public ReturnBitfield12Field returnBitfield12() {
        return returnBitfield12;
    }

    /**
     * BitSet OrderAcknowledgment byte 13.
     *
     * @return the ReturnBitfield13 field
     */
    public ReturnBitfield13Field returnBitfield13() {
        return returnBitfield13;
    }

    /**
     * BitSet OrderAcknowledgment byte 14.
     *
     * @return the ReturnBitfield14 field
     */
    public ReturnBitfield14Field returnBitfield14() {
        return returnBitfield14;
    }

    /**
     * BitSet OrderAcknowledgment byte 15.
     *
     * @return the ReturnBitfield15 field
     */
    public ReturnBitfield15Field returnBitfield15() {
        return returnBitfield15;
    }

    /**
     * BitSet OrderAcknowledgment byte 16.
     *
     * @return the ReturnBitfield16 field
     */
    public ReturnBitfield16Field returnBitfield16() {
        return returnBitfield16;
    }

    /**
     * BitSet OrderAcknowledgment byte 17.
     *
     * @return the ReturnBitfield17 field
     */
    public ReturnBitfield17Field returnBitfield17() {
        return returnBitfield17;
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
     * Order quantity. System limit is 999,999 shares.
     *
     * @return the OrderQty field
     */
    public OrderQtyField orderQty() {
        return orderQty;
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
     * Maturity Date
     *
     * @return the MaturityDate field
     */
    public MaturityDateField maturityDate() {
        return maturityDate;
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
     * Leaves Qty
     *
     * @return the LeavesQty field
     */
    public LeavesQtyField leavesQty() {
        return leavesQty;
    }

    /**
     * Base Liquidity Indicator
     *
     * @return the BaseLiquidityIndicator field
     */
    public BaseLiquidityIndicatorField baseLiquidityIndicator() {
        return baseLiquidityIndicator;
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
     * Sub Liquidity Indicator
     *
     * @return the SubLiquidityIndicator field
     */
    public SubLiquidityIndicatorField subLiquidityIndicator() {
        return subLiquidityIndicator;
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
     * Cmta Number
     *
     * @return the CmtaNumber field
     */
    public CmtaNumberField cmtaNumber() {
        return cmtaNumber;
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
     * Cum Qty
     *
     * @return the CumQty field
     */
    public CumQtyField cumQty() {
        return cumQty;
    }

    /**
     * Day Order Qty
     *
     * @return the DayOrderQty field
     */
    public DayOrderQtyField dayOrderQty() {
        return dayOrderQty;
    }

    /**
     * Day Cum Qty
     *
     * @return the DayCumQty field
     */
    public DayCumQtyField dayCumQty() {
        return dayCumQty;
    }

    /**
     * Avg Px
     *
     * @return the AvgPx field
     */
    public AvgPxField avgPx() {
        return avgPx;
    }

    /**
     * Day Avg Px
     *
     * @return the DayAvgPx field
     */
    public DayAvgPxField dayAvgPx() {
        return dayAvgPx;
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
     * Returns whether the fields before the ReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield1 is on the wire
     */
    public boolean returnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield2 is on the wire
     */
    public boolean returnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield3 is on the wire
     */
    public boolean returnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield4 is on the wire
     */
    public boolean returnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield5 is on the wire
     */
    public boolean returnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield6 is on the wire
     */
    public boolean returnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield7 is on the wire
     */
    public boolean returnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield8 is on the wire
     */
    public boolean returnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield9 is on the wire
     */
    public boolean returnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield10 is on the wire
     */
    public boolean returnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield11 is on the wire
     */
    public boolean returnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield12 is on the wire
     */
    public boolean returnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield13 is on the wire
     */
    public boolean returnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield14 is on the wire
     */
    public boolean returnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield15 is on the wire
     */
    public boolean returnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield16 is on the wire
     */
    public boolean returnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the ReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the ReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ReturnBitfield17 is on the wire
     */
    public boolean returnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the Side put it on the wire.
     *
     * <p>Decode reads the Side where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Side is on the wire
     */
    public boolean sidePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (returnBitfield1Present() && returnBitfield1.returnBitfield1Side());
    }

    /**
     * Returns whether the fields before the Price put it on the wire.
     *
     * <p>Decode reads the Price where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Price is on the wire
     */
    public boolean pricePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (returnBitfield1Present() && returnBitfield1.returnBitfield1Price());
    }

    /**
     * Returns whether the fields before the OrdType put it on the wire.
     *
     * <p>Decode reads the OrdType where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrdType is on the wire
     */
    public boolean ordTypePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (returnBitfield1Present() && returnBitfield1.returnBitfield1OrdType());
    }

    /**
     * Returns whether the fields before the TimeInForce put it on the wire.
     *
     * <p>Decode reads the TimeInForce where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TimeInForce is on the wire
     */
    public boolean timeInForcePresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (returnBitfield1Present() && returnBitfield1.returnBitfield1TimeInForce());
    }

    /**
     * Returns whether the fields before the MinQty put it on the wire.
     *
     * <p>Decode reads the MinQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MinQty is on the wire
     */
    public boolean minQtyPresent() {
        return (numberOfReturnBitfields.value() >= 1L) && (returnBitfield1Present() && returnBitfield1.returnBitfield1MinQty());
    }

    /**
     * Returns whether the fields before the SymbolLong put it on the wire.
     *
     * <p>Decode reads the SymbolLong where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolLong is on the wire
     */
    public boolean symbolLongPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (returnBitfield2Present() && returnBitfield2.returnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (returnBitfield2Present() && returnBitfield2.returnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the Account put it on the wire.
     *
     * <p>Decode reads the Account where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Account is on the wire
     */
    public boolean accountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (returnBitfield3Present() && returnBitfield3.returnBitfield3Account());
    }

    /**
     * Returns whether the fields before the ClearingFirm put it on the wire.
     *
     * <p>Decode reads the ClearingFirm where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingFirm is on the wire
     */
    public boolean clearingFirmPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (returnBitfield3Present() && returnBitfield3.returnBitfield3ClearingFirm());
    }

    /**
     * Returns whether the fields before the ClearingAccount put it on the wire.
     *
     * <p>Decode reads the ClearingAccount where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ClearingAccount is on the wire
     */
    public boolean clearingAccountPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (returnBitfield3Present() && returnBitfield3.returnBitfield3ClearingAccount());
    }

    /**
     * Returns whether the fields before the OrderQty put it on the wire.
     *
     * <p>Decode reads the OrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OrderQty is on the wire
     */
    public boolean orderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (returnBitfield3Present() && returnBitfield3.returnBitfield3OrderQty());
    }

    /**
     * Returns whether the fields before the PreventMatch put it on the wire.
     *
     * <p>Decode reads the PreventMatch where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the PreventMatch is on the wire
     */
    public boolean preventMatchPresent() {
        return (numberOfReturnBitfields.value() >= 3L) && (returnBitfield3Present() && returnBitfield3.returnBitfield3PreventMatch());
    }

    /**
     * Returns whether the fields before the MaturityDate put it on the wire.
     *
     * <p>Decode reads the MaturityDate where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the MaturityDate is on the wire
     */
    public boolean maturityDatePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (returnBitfield4Present() && returnBitfield4.returnBitfield4MaturityDate());
    }

    /**
     * Returns whether the fields before the OpenClose put it on the wire.
     *
     * <p>Decode reads the OpenClose where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the OpenClose is on the wire
     */
    public boolean openClosePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (returnBitfield4Present() && returnBitfield4.returnBitfield4OpenClose());
    }

    /**
     * Returns whether the fields before the LeavesQty put it on the wire.
     *
     * <p>Decode reads the LeavesQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LeavesQty is on the wire
     */
    public boolean leavesQtyPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (returnBitfield5Present() && returnBitfield5.returnBitfield5LeavesQty());
    }

    /**
     * Returns whether the fields before the BaseLiquidityIndicator put it on the wire.
     *
     * <p>Decode reads the BaseLiquidityIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the BaseLiquidityIndicator is on the wire
     */
    public boolean baseLiquidityIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (returnBitfield5Present() && returnBitfield5.returnBitfield5BaseLiquidityIndicator());
    }

    /**
     * Returns whether the fields before the ExpireTime put it on the wire.
     *
     * <p>Decode reads the ExpireTime where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ExpireTime is on the wire
     */
    public boolean expireTimePresent() {
        return (numberOfReturnBitfields.value() >= 5L) && (returnBitfield5Present() && returnBitfield5.returnBitfield5ExpireTime());
    }

    /**
     * Returns whether the fields before the SubLiquidityIndicator put it on the wire.
     *
     * <p>Decode reads the SubLiquidityIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SubLiquidityIndicator is on the wire
     */
    public boolean subLiquidityIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (returnBitfield7Present() && returnBitfield7.returnBitfield7SubLiquidityIndicator());
    }

    /**
     * Returns whether the fields before the StopPx put it on the wire.
     *
     * <p>Decode reads the StopPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the StopPx is on the wire
     */
    public boolean stopPxPresent() {
        return (numberOfReturnBitfields.value() >= 8L) && (returnBitfield8Present() && returnBitfield8.returnBitfield8StopPx());
    }

    /**
     * Returns whether the fields before the CmtaNumber put it on the wire.
     *
     * <p>Decode reads the CmtaNumber where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CmtaNumber is on the wire
     */
    public boolean cmtaNumberPresent() {
        return (numberOfReturnBitfields.value() >= 9L) && (returnBitfield9Present() && returnBitfield9.returnBitfield9CmtaNumber());
    }

    /**
     * Returns whether the fields before the CtiCode put it on the wire.
     *
     * <p>Decode reads the CtiCode where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CtiCode is on the wire
     */
    public boolean ctiCodePresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (returnBitfield12Present() && returnBitfield12.returnBitfield12CtiCode());
    }

    /**
     * Returns whether the fields before the ManualOrderIndicator put it on the wire.
     *
     * <p>Decode reads the ManualOrderIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the ManualOrderIndicator is on the wire
     */
    public boolean manualOrderIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (returnBitfield12Present() && returnBitfield12.returnBitfield12ManualOrderIndicator());
    }

    /**
     * Returns whether the fields before the Oeoid put it on the wire.
     *
     * <p>Decode reads the Oeoid where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Oeoid is on the wire
     */
    public boolean oeoidPresent() {
        return (numberOfReturnBitfields.value() >= 12L) && (returnBitfield12Present() && returnBitfield12.returnBitfield12Oeoid());
    }

    /**
     * Returns whether the fields before the CumQty put it on the wire.
     *
     * <p>Decode reads the CumQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CumQty is on the wire
     */
    public boolean cumQtyPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (returnBitfield13Present() && returnBitfield13.returnBitfield13CumQty());
    }

    /**
     * Returns whether the fields before the DayOrderQty put it on the wire.
     *
     * <p>Decode reads the DayOrderQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DayOrderQty is on the wire
     */
    public boolean dayOrderQtyPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (returnBitfield13Present() && returnBitfield13.returnBitfield13DayOrderQty());
    }

    /**
     * Returns whether the fields before the DayCumQty put it on the wire.
     *
     * <p>Decode reads the DayCumQty where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DayCumQty is on the wire
     */
    public boolean dayCumQtyPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (returnBitfield13Present() && returnBitfield13.returnBitfield13DayCumQty());
    }

    /**
     * Returns whether the fields before the AvgPx put it on the wire.
     *
     * <p>Decode reads the AvgPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the AvgPx is on the wire
     */
    public boolean avgPxPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (returnBitfield13Present() && returnBitfield13.returnBitfield13AvgPx());
    }

    /**
     * Returns whether the fields before the DayAvgPx put it on the wire.
     *
     * <p>Decode reads the DayAvgPx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the DayAvgPx is on the wire
     */
    public boolean dayAvgPxPresent() {
        return (numberOfReturnBitfields.value() >= 13L) && (returnBitfield13Present() && returnBitfield13.returnBitfield13DayAvgPx());
    }

    /**
     * Returns whether the fields before the FrequentTraderId put it on the wire.
     *
     * <p>Decode reads the FrequentTraderId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the FrequentTraderId is on the wire
     */
    public boolean frequentTraderIdPresent() {
        return (numberOfReturnBitfields.value() >= 16L) && (returnBitfield16Present() && returnBitfield16.returnBitfield16FrequentTraderId());
    }

    private boolean onWire(Field field) {
        return (field != returnBitfield1 || returnBitfield1Present()) && (field != returnBitfield2 || returnBitfield2Present()) && (field != returnBitfield3 || returnBitfield3Present()) && (field != returnBitfield4 || returnBitfield4Present()) && (field != returnBitfield5 || returnBitfield5Present()) && (field != returnBitfield6 || returnBitfield6Present()) && (field != returnBitfield7 || returnBitfield7Present()) && (field != returnBitfield8 || returnBitfield8Present()) && (field != returnBitfield9 || returnBitfield9Present()) && (field != returnBitfield10 || returnBitfield10Present()) && (field != returnBitfield11 || returnBitfield11Present()) && (field != returnBitfield12 || returnBitfield12Present()) && (field != returnBitfield13 || returnBitfield13Present()) && (field != returnBitfield14 || returnBitfield14Present()) && (field != returnBitfield15 || returnBitfield15Present()) && (field != returnBitfield16 || returnBitfield16Present()) && (field != returnBitfield17 || returnBitfield17Present()) && (field != side || sidePresent()) && (field != price || pricePresent()) && (field != ordType || ordTypePresent()) && (field != timeInForce || timeInForcePresent()) && (field != minQty || minQtyPresent()) && (field != symbolLong || symbolLongPresent()) && (field != capacity || capacityPresent()) && (field != account || accountPresent()) && (field != clearingFirm || clearingFirmPresent()) && (field != clearingAccount || clearingAccountPresent()) && (field != orderQty || orderQtyPresent()) && (field != preventMatch || preventMatchPresent()) && (field != maturityDate || maturityDatePresent()) && (field != openClose || openClosePresent()) && (field != leavesQty || leavesQtyPresent()) && (field != baseLiquidityIndicator || baseLiquidityIndicatorPresent()) && (field != expireTime || expireTimePresent()) && (field != subLiquidityIndicator || subLiquidityIndicatorPresent()) && (field != stopPx || stopPxPresent()) && (field != cmtaNumber || cmtaNumberPresent()) && (field != ctiCode || ctiCodePresent()) && (field != manualOrderIndicator || manualOrderIndicatorPresent()) && (field != oeoid || oeoidPresent()) && (field != cumQty || cumQtyPresent()) && (field != dayOrderQty || dayOrderQtyPresent()) && (field != dayCumQty || dayCumQtyPresent()) && (field != avgPx || avgPxPresent()) && (field != dayAvgPx || dayAvgPxPresent()) && (field != frequentTraderId || frequentTraderIdPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (returnBitfield1Present() ? ReturnBitfield1Field.BYTE_LENGTH : 0) + (returnBitfield2Present() ? ReturnBitfield2Field.BYTE_LENGTH : 0) + (returnBitfield3Present() ? ReturnBitfield3Field.BYTE_LENGTH : 0) + (returnBitfield4Present() ? ReturnBitfield4Field.BYTE_LENGTH : 0) + (returnBitfield5Present() ? ReturnBitfield5Field.BYTE_LENGTH : 0) + (returnBitfield6Present() ? ReturnBitfield6Field.BYTE_LENGTH : 0) + (returnBitfield7Present() ? ReturnBitfield7Field.BYTE_LENGTH : 0) + (returnBitfield8Present() ? ReturnBitfield8Field.BYTE_LENGTH : 0) + (returnBitfield9Present() ? ReturnBitfield9Field.BYTE_LENGTH : 0) + (returnBitfield10Present() ? ReturnBitfield10Field.BYTE_LENGTH : 0) + (returnBitfield11Present() ? ReturnBitfield11Field.BYTE_LENGTH : 0) + (returnBitfield12Present() ? ReturnBitfield12Field.BYTE_LENGTH : 0) + (returnBitfield13Present() ? ReturnBitfield13Field.BYTE_LENGTH : 0) + (returnBitfield14Present() ? ReturnBitfield14Field.BYTE_LENGTH : 0) + (returnBitfield15Present() ? ReturnBitfield15Field.BYTE_LENGTH : 0) + (returnBitfield16Present() ? ReturnBitfield16Field.BYTE_LENGTH : 0) + (returnBitfield17Present() ? ReturnBitfield17Field.BYTE_LENGTH : 0) + (sidePresent() ? SideField.BYTE_LENGTH : 0) + (pricePresent() ? PriceField.BYTE_LENGTH : 0) + (ordTypePresent() ? OrdTypeField.BYTE_LENGTH : 0) + (timeInForcePresent() ? TimeInForceField.BYTE_LENGTH : 0) + (minQtyPresent() ? MinQtyField.BYTE_LENGTH : 0) + (symbolLongPresent() ? SymbolLongField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (accountPresent() ? AccountField.BYTE_LENGTH : 0) + (clearingFirmPresent() ? ClearingFirmField.BYTE_LENGTH : 0) + (clearingAccountPresent() ? ClearingAccountField.BYTE_LENGTH : 0) + (orderQtyPresent() ? OrderQtyField.BYTE_LENGTH : 0) + (preventMatchPresent() ? PreventMatchField.BYTE_LENGTH : 0) + (maturityDatePresent() ? MaturityDateField.BYTE_LENGTH : 0) + (openClosePresent() ? OpenCloseField.BYTE_LENGTH : 0) + (leavesQtyPresent() ? LeavesQtyField.BYTE_LENGTH : 0) + (baseLiquidityIndicatorPresent() ? BaseLiquidityIndicatorField.BYTE_LENGTH : 0) + (expireTimePresent() ? ExpireTimeField.BYTE_LENGTH : 0) + (subLiquidityIndicatorPresent() ? SubLiquidityIndicatorField.BYTE_LENGTH : 0) + (stopPxPresent() ? StopPxField.BYTE_LENGTH : 0) + (cmtaNumberPresent() ? CmtaNumberField.BYTE_LENGTH : 0) + (ctiCodePresent() ? CtiCodeField.BYTE_LENGTH : 0) + (manualOrderIndicatorPresent() ? ManualOrderIndicatorField.BYTE_LENGTH : 0) + (oeoidPresent() ? OeoidField.BYTE_LENGTH : 0) + (cumQtyPresent() ? CumQtyField.BYTE_LENGTH : 0) + (dayOrderQtyPresent() ? DayOrderQtyField.BYTE_LENGTH : 0) + (dayCumQtyPresent() ? DayCumQtyField.BYTE_LENGTH : 0) + (avgPxPresent() ? AvgPxField.BYTE_LENGTH : 0) + (dayAvgPxPresent() ? DayAvgPxField.BYTE_LENGTH : 0) + (frequentTraderIdPresent() ? FrequentTraderIdField.BYTE_LENGTH : 0);
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
        cursor += 8;
        cursor += 20;
        cursor += 8;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (returnBitfield1Present()) {
            cursor += 1;
        }
        if (returnBitfield2Present()) {
            cursor += 1;
        }
        if (returnBitfield3Present()) {
            cursor += 1;
        }
        if (returnBitfield4Present()) {
            cursor += 1;
        }
        if (returnBitfield5Present()) {
            cursor += 1;
        }
        if (returnBitfield6Present()) {
            cursor += 1;
        }
        if (returnBitfield7Present()) {
            cursor += 1;
        }
        if (returnBitfield8Present()) {
            cursor += 1;
        }
        if (returnBitfield9Present()) {
            cursor += 1;
        }
        if (returnBitfield10Present()) {
            cursor += 1;
        }
        if (returnBitfield11Present()) {
            cursor += 1;
        }
        if (returnBitfield12Present()) {
            cursor += 1;
        }
        if (returnBitfield13Present()) {
            cursor += 1;
        }
        if (returnBitfield14Present()) {
            cursor += 1;
        }
        if (returnBitfield15Present()) {
            cursor += 1;
        }
        if (returnBitfield16Present()) {
            cursor += 1;
        }
        if (returnBitfield17Present()) {
            cursor += 1;
        }
        if (sidePresent()) {
            cursor += 1;
        }
        if (pricePresent()) {
            cursor += 8;
        }
        if (ordTypePresent()) {
            cursor += 1;
        }
        if (timeInForcePresent()) {
            cursor += 1;
        }
        if (minQtyPresent()) {
            cursor += 4;
        }
        if (symbolLongPresent()) {
            cursor += 8;
        }
        if (capacityPresent()) {
            cursor += 1;
        }
        if (accountPresent()) {
            cursor += 16;
        }
        if (clearingFirmPresent()) {
            cursor += 4;
        }
        if (clearingAccountPresent()) {
            cursor += 4;
        }
        if (orderQtyPresent()) {
            cursor += 4;
        }
        if (preventMatchPresent()) {
            cursor += 3;
        }
        if (maturityDatePresent()) {
            cursor += 4;
        }
        if (openClosePresent()) {
            cursor += 1;
        }
        if (leavesQtyPresent()) {
            cursor += 4;
        }
        if (baseLiquidityIndicatorPresent()) {
            cursor += 1;
        }
        if (expireTimePresent()) {
            cursor += 8;
        }
        if (subLiquidityIndicatorPresent()) {
            cursor += 1;
        }
        if (stopPxPresent()) {
            cursor += 8;
        }
        if (cmtaNumberPresent()) {
            cursor += 4;
        }
        if (ctiCodePresent()) {
            cursor += 1;
        }
        if (manualOrderIndicatorPresent()) {
            cursor += 1;
        }
        if (oeoidPresent()) {
            cursor += 18;
        }
        if (cumQtyPresent()) {
            cursor += 4;
        }
        if (dayOrderQtyPresent()) {
            cursor += 4;
        }
        if (dayCumQtyPresent()) {
            cursor += 4;
        }
        if (avgPxPresent()) {
            cursor += 8;
        }
        if (dayAvgPxPresent()) {
            cursor += 8;
        }
        if (frequentTraderIdPresent()) {
            cursor += 6;
        }
        return cursor;
    }

    @Override
    public Optional<Instant> timestamp() {
        return Optional.ofNullable(transactionTime.value());
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
        if (!transactionTime.parse(data, cursor)) {
            return false;
        }
        cursor += TransactionTimeField.BYTE_LENGTH;
        if (!clOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ClOrdIdField.BYTE_LENGTH;
        if (!orderId.parse(data, cursor)) {
            return false;
        }
        cursor += OrderIdField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (returnBitfield1Present()) {
            if (end - cursor < ReturnBitfield1Field.BYTE_LENGTH || !returnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield2Present()) {
            if (end - cursor < ReturnBitfield2Field.BYTE_LENGTH || !returnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield3Present()) {
            if (end - cursor < ReturnBitfield3Field.BYTE_LENGTH || !returnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield4Present()) {
            if (end - cursor < ReturnBitfield4Field.BYTE_LENGTH || !returnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield5Present()) {
            if (end - cursor < ReturnBitfield5Field.BYTE_LENGTH || !returnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield6Present()) {
            if (end - cursor < ReturnBitfield6Field.BYTE_LENGTH || !returnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield7Present()) {
            if (end - cursor < ReturnBitfield7Field.BYTE_LENGTH || !returnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield8Present()) {
            if (end - cursor < ReturnBitfield8Field.BYTE_LENGTH || !returnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield9Present()) {
            if (end - cursor < ReturnBitfield9Field.BYTE_LENGTH || !returnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield10Present()) {
            if (end - cursor < ReturnBitfield10Field.BYTE_LENGTH || !returnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield11Present()) {
            if (end - cursor < ReturnBitfield11Field.BYTE_LENGTH || !returnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield12Present()) {
            if (end - cursor < ReturnBitfield12Field.BYTE_LENGTH || !returnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield13Present()) {
            if (end - cursor < ReturnBitfield13Field.BYTE_LENGTH || !returnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield14Present()) {
            if (end - cursor < ReturnBitfield14Field.BYTE_LENGTH || !returnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield15Present()) {
            if (end - cursor < ReturnBitfield15Field.BYTE_LENGTH || !returnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield16Present()) {
            if (end - cursor < ReturnBitfield16Field.BYTE_LENGTH || !returnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (returnBitfield17Present()) {
            if (end - cursor < ReturnBitfield17Field.BYTE_LENGTH || !returnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += ReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (sidePresent()) {
            if (end - cursor < SideField.BYTE_LENGTH || !side.parse(data, cursor)) {
                return false;
            }
            cursor += SideField.BYTE_LENGTH;
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
        if (orderQtyPresent()) {
            if (end - cursor < OrderQtyField.BYTE_LENGTH || !orderQty.parse(data, cursor)) {
                return false;
            }
            cursor += OrderQtyField.BYTE_LENGTH;
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
        if (maturityDatePresent()) {
            if (end - cursor < MaturityDateField.BYTE_LENGTH || !maturityDate.parse(data, cursor)) {
                return false;
            }
            cursor += MaturityDateField.BYTE_LENGTH;
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
        if (leavesQtyPresent()) {
            if (end - cursor < LeavesQtyField.BYTE_LENGTH || !leavesQty.parse(data, cursor)) {
                return false;
            }
            cursor += LeavesQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (baseLiquidityIndicatorPresent()) {
            if (end - cursor < BaseLiquidityIndicatorField.BYTE_LENGTH || !baseLiquidityIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += BaseLiquidityIndicatorField.BYTE_LENGTH;
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
        if (subLiquidityIndicatorPresent()) {
            if (end - cursor < SubLiquidityIndicatorField.BYTE_LENGTH || !subLiquidityIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += SubLiquidityIndicatorField.BYTE_LENGTH;
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
        if (cmtaNumberPresent()) {
            if (end - cursor < CmtaNumberField.BYTE_LENGTH || !cmtaNumber.parse(data, cursor)) {
                return false;
            }
            cursor += CmtaNumberField.BYTE_LENGTH;
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
        if (cumQtyPresent()) {
            if (end - cursor < CumQtyField.BYTE_LENGTH || !cumQty.parse(data, cursor)) {
                return false;
            }
            cursor += CumQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (dayOrderQtyPresent()) {
            if (end - cursor < DayOrderQtyField.BYTE_LENGTH || !dayOrderQty.parse(data, cursor)) {
                return false;
            }
            cursor += DayOrderQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (dayCumQtyPresent()) {
            if (end - cursor < DayCumQtyField.BYTE_LENGTH || !dayCumQty.parse(data, cursor)) {
                return false;
            }
            cursor += DayCumQtyField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (avgPxPresent()) {
            if (end - cursor < AvgPxField.BYTE_LENGTH || !avgPx.parse(data, cursor)) {
                return false;
            }
            cursor += AvgPxField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (dayAvgPxPresent()) {
            if (end - cursor < DayAvgPxField.BYTE_LENGTH || !dayAvgPx.parse(data, cursor)) {
                return false;
            }
            cursor += DayAvgPxField.BYTE_LENGTH;
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
        if (returnBitfield1Present() != returnBitfield1.hasValue()) {
            throw new IllegalStateException(returnBitfield1.hasValue() ? "returnBitfield1 holds a value the fields before it leave off the wire" : "returnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield2Present() != returnBitfield2.hasValue()) {
            throw new IllegalStateException(returnBitfield2.hasValue() ? "returnBitfield2 holds a value the fields before it leave off the wire" : "returnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield3Present() != returnBitfield3.hasValue()) {
            throw new IllegalStateException(returnBitfield3.hasValue() ? "returnBitfield3 holds a value the fields before it leave off the wire" : "returnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield4Present() != returnBitfield4.hasValue()) {
            throw new IllegalStateException(returnBitfield4.hasValue() ? "returnBitfield4 holds a value the fields before it leave off the wire" : "returnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield5Present() != returnBitfield5.hasValue()) {
            throw new IllegalStateException(returnBitfield5.hasValue() ? "returnBitfield5 holds a value the fields before it leave off the wire" : "returnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield6Present() != returnBitfield6.hasValue()) {
            throw new IllegalStateException(returnBitfield6.hasValue() ? "returnBitfield6 holds a value the fields before it leave off the wire" : "returnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield7Present() != returnBitfield7.hasValue()) {
            throw new IllegalStateException(returnBitfield7.hasValue() ? "returnBitfield7 holds a value the fields before it leave off the wire" : "returnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield8Present() != returnBitfield8.hasValue()) {
            throw new IllegalStateException(returnBitfield8.hasValue() ? "returnBitfield8 holds a value the fields before it leave off the wire" : "returnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield9Present() != returnBitfield9.hasValue()) {
            throw new IllegalStateException(returnBitfield9.hasValue() ? "returnBitfield9 holds a value the fields before it leave off the wire" : "returnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield10Present() != returnBitfield10.hasValue()) {
            throw new IllegalStateException(returnBitfield10.hasValue() ? "returnBitfield10 holds a value the fields before it leave off the wire" : "returnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield11Present() != returnBitfield11.hasValue()) {
            throw new IllegalStateException(returnBitfield11.hasValue() ? "returnBitfield11 holds a value the fields before it leave off the wire" : "returnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield12Present() != returnBitfield12.hasValue()) {
            throw new IllegalStateException(returnBitfield12.hasValue() ? "returnBitfield12 holds a value the fields before it leave off the wire" : "returnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield13Present() != returnBitfield13.hasValue()) {
            throw new IllegalStateException(returnBitfield13.hasValue() ? "returnBitfield13 holds a value the fields before it leave off the wire" : "returnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield14Present() != returnBitfield14.hasValue()) {
            throw new IllegalStateException(returnBitfield14.hasValue() ? "returnBitfield14 holds a value the fields before it leave off the wire" : "returnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield15Present() != returnBitfield15.hasValue()) {
            throw new IllegalStateException(returnBitfield15.hasValue() ? "returnBitfield15 holds a value the fields before it leave off the wire" : "returnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield16Present() != returnBitfield16.hasValue()) {
            throw new IllegalStateException(returnBitfield16.hasValue() ? "returnBitfield16 holds a value the fields before it leave off the wire" : "returnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (returnBitfield17Present() != returnBitfield17.hasValue()) {
            throw new IllegalStateException(returnBitfield17.hasValue() ? "returnBitfield17 holds a value the fields before it leave off the wire" : "returnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (sidePresent() != side.hasValue()) {
            throw new IllegalStateException(side.hasValue() ? "side holds a value the fields before it leave off the wire" : "side holds no value, though the fields before it put it on the wire");
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
        if (clearingFirmPresent() != clearingFirm.hasValue()) {
            throw new IllegalStateException(clearingFirm.hasValue() ? "clearingFirm holds a value the fields before it leave off the wire" : "clearingFirm holds no value, though the fields before it put it on the wire");
        }
        if (clearingAccountPresent() != clearingAccount.hasValue()) {
            throw new IllegalStateException(clearingAccount.hasValue() ? "clearingAccount holds a value the fields before it leave off the wire" : "clearingAccount holds no value, though the fields before it put it on the wire");
        }
        if (orderQtyPresent() != orderQty.hasValue()) {
            throw new IllegalStateException(orderQty.hasValue() ? "orderQty holds a value the fields before it leave off the wire" : "orderQty holds no value, though the fields before it put it on the wire");
        }
        if (preventMatchPresent() != preventMatch.hasValue()) {
            throw new IllegalStateException(preventMatch.hasValue() ? "preventMatch holds a value the fields before it leave off the wire" : "preventMatch holds no value, though the fields before it put it on the wire");
        }
        if (maturityDatePresent() != maturityDate.hasValue()) {
            throw new IllegalStateException(maturityDate.hasValue() ? "maturityDate holds a value the fields before it leave off the wire" : "maturityDate holds no value, though the fields before it put it on the wire");
        }
        if (openClosePresent() != openClose.hasValue()) {
            throw new IllegalStateException(openClose.hasValue() ? "openClose holds a value the fields before it leave off the wire" : "openClose holds no value, though the fields before it put it on the wire");
        }
        if (leavesQtyPresent() != leavesQty.hasValue()) {
            throw new IllegalStateException(leavesQty.hasValue() ? "leavesQty holds a value the fields before it leave off the wire" : "leavesQty holds no value, though the fields before it put it on the wire");
        }
        if (baseLiquidityIndicatorPresent() != baseLiquidityIndicator.hasValue()) {
            throw new IllegalStateException(baseLiquidityIndicator.hasValue() ? "baseLiquidityIndicator holds a value the fields before it leave off the wire" : "baseLiquidityIndicator holds no value, though the fields before it put it on the wire");
        }
        if (expireTimePresent() != expireTime.hasValue()) {
            throw new IllegalStateException(expireTime.hasValue() ? "expireTime holds a value the fields before it leave off the wire" : "expireTime holds no value, though the fields before it put it on the wire");
        }
        if (subLiquidityIndicatorPresent() != subLiquidityIndicator.hasValue()) {
            throw new IllegalStateException(subLiquidityIndicator.hasValue() ? "subLiquidityIndicator holds a value the fields before it leave off the wire" : "subLiquidityIndicator holds no value, though the fields before it put it on the wire");
        }
        if (stopPxPresent() != stopPx.hasValue()) {
            throw new IllegalStateException(stopPx.hasValue() ? "stopPx holds a value the fields before it leave off the wire" : "stopPx holds no value, though the fields before it put it on the wire");
        }
        if (cmtaNumberPresent() != cmtaNumber.hasValue()) {
            throw new IllegalStateException(cmtaNumber.hasValue() ? "cmtaNumber holds a value the fields before it leave off the wire" : "cmtaNumber holds no value, though the fields before it put it on the wire");
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
        if (cumQtyPresent() != cumQty.hasValue()) {
            throw new IllegalStateException(cumQty.hasValue() ? "cumQty holds a value the fields before it leave off the wire" : "cumQty holds no value, though the fields before it put it on the wire");
        }
        if (dayOrderQtyPresent() != dayOrderQty.hasValue()) {
            throw new IllegalStateException(dayOrderQty.hasValue() ? "dayOrderQty holds a value the fields before it leave off the wire" : "dayOrderQty holds no value, though the fields before it put it on the wire");
        }
        if (dayCumQtyPresent() != dayCumQty.hasValue()) {
            throw new IllegalStateException(dayCumQty.hasValue() ? "dayCumQty holds a value the fields before it leave off the wire" : "dayCumQty holds no value, though the fields before it put it on the wire");
        }
        if (avgPxPresent() != avgPx.hasValue()) {
            throw new IllegalStateException(avgPx.hasValue() ? "avgPx holds a value the fields before it leave off the wire" : "avgPx holds no value, though the fields before it put it on the wire");
        }
        if (dayAvgPxPresent() != dayAvgPx.hasValue()) {
            throw new IllegalStateException(dayAvgPx.hasValue() ? "dayAvgPx holds a value the fields before it leave off the wire" : "dayAvgPx holds no value, though the fields before it put it on the wire");
        }
        if (frequentTraderIdPresent() != frequentTraderId.hasValue()) {
            throw new IllegalStateException(frequentTraderId.hasValue() ? "frequentTraderId holds a value the fields before it leave off the wire" : "frequentTraderId holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        if (buffer != null && buffer.length >= 37) {
            System.arraycopy(buffer, 36, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (returnBitfield1Present()) {
            cursor = returnBitfield1.encode(data, cursor);
        }
        if (returnBitfield2Present()) {
            cursor = returnBitfield2.encode(data, cursor);
        }
        if (returnBitfield3Present()) {
            cursor = returnBitfield3.encode(data, cursor);
        }
        if (returnBitfield4Present()) {
            cursor = returnBitfield4.encode(data, cursor);
        }
        if (returnBitfield5Present()) {
            cursor = returnBitfield5.encode(data, cursor);
        }
        if (returnBitfield6Present()) {
            cursor = returnBitfield6.encode(data, cursor);
        }
        if (returnBitfield7Present()) {
            cursor = returnBitfield7.encode(data, cursor);
        }
        if (returnBitfield8Present()) {
            cursor = returnBitfield8.encode(data, cursor);
        }
        if (returnBitfield9Present()) {
            cursor = returnBitfield9.encode(data, cursor);
        }
        if (returnBitfield10Present()) {
            cursor = returnBitfield10.encode(data, cursor);
        }
        if (returnBitfield11Present()) {
            cursor = returnBitfield11.encode(data, cursor);
        }
        if (returnBitfield12Present()) {
            cursor = returnBitfield12.encode(data, cursor);
        }
        if (returnBitfield13Present()) {
            cursor = returnBitfield13.encode(data, cursor);
        }
        if (returnBitfield14Present()) {
            cursor = returnBitfield14.encode(data, cursor);
        }
        if (returnBitfield15Present()) {
            cursor = returnBitfield15.encode(data, cursor);
        }
        if (returnBitfield16Present()) {
            cursor = returnBitfield16.encode(data, cursor);
        }
        if (returnBitfield17Present()) {
            cursor = returnBitfield17.encode(data, cursor);
        }
        if (sidePresent()) {
            cursor = side.encode(data, cursor);
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
        if (clearingFirmPresent()) {
            cursor = clearingFirm.encode(data, cursor);
        }
        if (clearingAccountPresent()) {
            cursor = clearingAccount.encode(data, cursor);
        }
        if (orderQtyPresent()) {
            cursor = orderQty.encode(data, cursor);
        }
        if (preventMatchPresent()) {
            cursor = preventMatch.encode(data, cursor);
        }
        if (maturityDatePresent()) {
            cursor = maturityDate.encode(data, cursor);
        }
        if (openClosePresent()) {
            cursor = openClose.encode(data, cursor);
        }
        if (leavesQtyPresent()) {
            cursor = leavesQty.encode(data, cursor);
        }
        if (baseLiquidityIndicatorPresent()) {
            cursor = baseLiquidityIndicator.encode(data, cursor);
        }
        if (expireTimePresent()) {
            cursor = expireTime.encode(data, cursor);
        }
        if (subLiquidityIndicatorPresent()) {
            cursor = subLiquidityIndicator.encode(data, cursor);
        }
        if (stopPxPresent()) {
            cursor = stopPx.encode(data, cursor);
        }
        if (cmtaNumberPresent()) {
            cursor = cmtaNumber.encode(data, cursor);
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
        if (cumQtyPresent()) {
            cursor = cumQty.encode(data, cursor);
        }
        if (dayOrderQtyPresent()) {
            cursor = dayOrderQty.encode(data, cursor);
        }
        if (dayCumQtyPresent()) {
            cursor = dayCumQty.encode(data, cursor);
        }
        if (avgPxPresent()) {
            cursor = avgPx.encode(data, cursor);
        }
        if (dayAvgPxPresent()) {
            cursor = dayAvgPx.encode(data, cursor);
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
            case "TransactionTime" -> Optional.of(transactionTime);
            case "ClOrdId" -> Optional.of(clOrdId);
            case "OrderId" -> Optional.of(orderId);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "ReturnBitfield1" -> Optional.of(returnBitfield1);
            case "ReturnBitfield2" -> Optional.of(returnBitfield2);
            case "ReturnBitfield3" -> Optional.of(returnBitfield3);
            case "ReturnBitfield4" -> Optional.of(returnBitfield4);
            case "ReturnBitfield5" -> Optional.of(returnBitfield5);
            case "ReturnBitfield6" -> Optional.of(returnBitfield6);
            case "ReturnBitfield7" -> Optional.of(returnBitfield7);
            case "ReturnBitfield8" -> Optional.of(returnBitfield8);
            case "ReturnBitfield9" -> Optional.of(returnBitfield9);
            case "ReturnBitfield10" -> Optional.of(returnBitfield10);
            case "ReturnBitfield11" -> Optional.of(returnBitfield11);
            case "ReturnBitfield12" -> Optional.of(returnBitfield12);
            case "ReturnBitfield13" -> Optional.of(returnBitfield13);
            case "ReturnBitfield14" -> Optional.of(returnBitfield14);
            case "ReturnBitfield15" -> Optional.of(returnBitfield15);
            case "ReturnBitfield16" -> Optional.of(returnBitfield16);
            case "ReturnBitfield17" -> Optional.of(returnBitfield17);
            case "Side" -> Optional.of(side);
            case "Price" -> Optional.of(price);
            case "OrdType" -> Optional.of(ordType);
            case "TimeInForce" -> Optional.of(timeInForce);
            case "MinQty" -> Optional.of(minQty);
            case "SymbolLong" -> Optional.of(symbolLong);
            case "Capacity" -> Optional.of(capacity);
            case "Account" -> Optional.of(account);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "OrderQty" -> Optional.of(orderQty);
            case "PreventMatch" -> Optional.of(preventMatch);
            case "MaturityDate" -> Optional.of(maturityDate);
            case "OpenClose" -> Optional.of(openClose);
            case "LeavesQty" -> Optional.of(leavesQty);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "ExpireTime" -> Optional.of(expireTime);
            case "SubLiquidityIndicator" -> Optional.of(subLiquidityIndicator);
            case "StopPx" -> Optional.of(stopPx);
            case "CmtaNumber" -> Optional.of(cmtaNumber);
            case "CtiCode" -> Optional.of(ctiCode);
            case "ManualOrderIndicator" -> Optional.of(manualOrderIndicator);
            case "Oeoid" -> Optional.of(oeoid);
            case "CumQty" -> Optional.of(cumQty);
            case "DayOrderQty" -> Optional.of(dayOrderQty);
            case "DayCumQty" -> Optional.of(dayCumQty);
            case "AvgPx" -> Optional.of(avgPx);
            case "DayAvgPx" -> Optional.of(dayAvgPx);
            case "FrequentTraderId" -> Optional.of(frequentTraderId);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderAcknowledgmentMessage message)) {
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
        if (!(other instanceof OrderAcknowledgmentMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
