package omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.BaseLiquidityIndicatorField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.CapacityField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ClOrdIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ClearingAccountField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ClearingFirmField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.CorrectedPriceField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.ExecRefIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.LastPxField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.LastSharesField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.NumberOfReturnBitfieldsField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrderIdField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.OrigTimeField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SideField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SubLiquidityIndicatorField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SymbolField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.SymbolSfxField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield10Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield11Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield12Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield13Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield14Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield15Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield16Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield17Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield18Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield19Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield1Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield20Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield21Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield2Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield3Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield4Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield5Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield6Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield7Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield8Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TradeCancelorCorrectReturnBitfield9Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.fields.TransactionTimeField;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Field;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.Message;
import omi.cboe.bzxequities.binaryorderentry.boe.v2_4_57.types.PrintOptions;

/**
 * Represents the TradeCancelOrCorrectMessage message from the BinaryOrderEntry protocol.
 *
 * <p>Trade Cancel or Correct Message.</p>
 */
public final class TradeCancelOrCorrectMessage implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 84;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Cancel Or Correct Message";

    /**
     * The time the event occurred in the Cboe Matching Engine (not the time the message was sent).
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to OrderID (37) in Cboe FIX. Order identifier supplied by Cboe. This identifier corresponds to the identifiers used in Cboe market data products.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Corresponds to ExecRefID (19) in Cboe FIX. Refers to the ExecID of the fill being cancelled or corrected.
     */
    private final ExecRefIdField execRefId = new ExecRefIdField();

    /**
     * Corresponds to Side (54) in Cboe FIX. 1=Buy 2=Sell 5=Sell Short (client affirms ability to borrow) 6=Sell Short Exempt
     */
    private final SideField side = new SideField();

    /**
     * Base Liquidity Indicator
     */
    private final BaseLiquidityIndicatorField baseLiquidityIndicator = new BaseLiquidityIndicatorField();

    /**
     * Clearing Firm
     */
    private final ClearingFirmField clearingFirm = new ClearingFirmField();

    /**
     * Clearing Account
     */
    private final ClearingAccountField clearingAccount = new ClearingAccountField();

    /**
     * Last Shares
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Last Px
     */
    private final LastPxField lastPx = new LastPxField();

    /**
     * For trade corrections, this is the new trade price. For trade breaks, this is set to 0.
     */
    private final CorrectedPriceField correctedPrice = new CorrectedPriceField();

    /**
     * Corresponds to OrigTime (42). The date and time of the original trade, in GMT.
     */
    private final OrigTimeField origTime = new OrigTimeField();

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     */
    private final NumberOfReturnBitfieldsField numberOfReturnBitfields = new NumberOfReturnBitfieldsField();

    /**
     * BitSet TradeCancelorCorrect byte 1.
     */
    private final TradeCancelorCorrectReturnBitfield1Field tradeCancelorCorrectReturnBitfield1 = new TradeCancelorCorrectReturnBitfield1Field();

    /**
     * BitSet TradeCancelorCorrect byte 2.
     */
    private final TradeCancelorCorrectReturnBitfield2Field tradeCancelorCorrectReturnBitfield2 = new TradeCancelorCorrectReturnBitfield2Field();

    /**
     * BitSet TradeCancelorCorrect byte 3.
     */
    private final TradeCancelorCorrectReturnBitfield3Field tradeCancelorCorrectReturnBitfield3 = new TradeCancelorCorrectReturnBitfield3Field();

    /**
     * BitSet TradeCancelorCorrect byte 4.
     */
    private final TradeCancelorCorrectReturnBitfield4Field tradeCancelorCorrectReturnBitfield4 = new TradeCancelorCorrectReturnBitfield4Field();

    /**
     * BitSet TradeCancelorCorrect byte 5.
     */
    private final TradeCancelorCorrectReturnBitfield5Field tradeCancelorCorrectReturnBitfield5 = new TradeCancelorCorrectReturnBitfield5Field();

    /**
     * BitSet TradeCancelorCorrect byte 6.
     */
    private final TradeCancelorCorrectReturnBitfield6Field tradeCancelorCorrectReturnBitfield6 = new TradeCancelorCorrectReturnBitfield6Field();

    /**
     * BitSet TradeCancelorCorrect byte 7.
     */
    private final TradeCancelorCorrectReturnBitfield7Field tradeCancelorCorrectReturnBitfield7 = new TradeCancelorCorrectReturnBitfield7Field();

    /**
     * BitSet TradeCancelorCorrect byte 8.
     */
    private final TradeCancelorCorrectReturnBitfield8Field tradeCancelorCorrectReturnBitfield8 = new TradeCancelorCorrectReturnBitfield8Field();

    /**
     * BitSet TradeCancelorCorrect byte 9.
     */
    private final TradeCancelorCorrectReturnBitfield9Field tradeCancelorCorrectReturnBitfield9 = new TradeCancelorCorrectReturnBitfield9Field();

    /**
     * BitSet TradeCancelorCorrect byte 10.
     */
    private final TradeCancelorCorrectReturnBitfield10Field tradeCancelorCorrectReturnBitfield10 = new TradeCancelorCorrectReturnBitfield10Field();

    /**
     * BitSet TradeCancelorCorrect byte 11.
     */
    private final TradeCancelorCorrectReturnBitfield11Field tradeCancelorCorrectReturnBitfield11 = new TradeCancelorCorrectReturnBitfield11Field();

    /**
     * BitSet TradeCancelorCorrect byte 12.
     */
    private final TradeCancelorCorrectReturnBitfield12Field tradeCancelorCorrectReturnBitfield12 = new TradeCancelorCorrectReturnBitfield12Field();

    /**
     * BitSet TradeCancelorCorrect byte 13.
     */
    private final TradeCancelorCorrectReturnBitfield13Field tradeCancelorCorrectReturnBitfield13 = new TradeCancelorCorrectReturnBitfield13Field();

    /**
     * BitSet TradeCancelorCorrect byte 14.
     */
    private final TradeCancelorCorrectReturnBitfield14Field tradeCancelorCorrectReturnBitfield14 = new TradeCancelorCorrectReturnBitfield14Field();

    /**
     * BitSet TradeCancelorCorrect byte 15.
     */
    private final TradeCancelorCorrectReturnBitfield15Field tradeCancelorCorrectReturnBitfield15 = new TradeCancelorCorrectReturnBitfield15Field();

    /**
     * BitSet TradeCancelorCorrect byte 16.
     */
    private final TradeCancelorCorrectReturnBitfield16Field tradeCancelorCorrectReturnBitfield16 = new TradeCancelorCorrectReturnBitfield16Field();

    /**
     * BitSet TradeCancelorCorrect byte 17.
     */
    private final TradeCancelorCorrectReturnBitfield17Field tradeCancelorCorrectReturnBitfield17 = new TradeCancelorCorrectReturnBitfield17Field();

    /**
     * BitSet TradeCancelorCorrect byte 18.
     */
    private final TradeCancelorCorrectReturnBitfield18Field tradeCancelorCorrectReturnBitfield18 = new TradeCancelorCorrectReturnBitfield18Field();

    /**
     * BitSet TradeCancelorCorrect byte 19.
     */
    private final TradeCancelorCorrectReturnBitfield19Field tradeCancelorCorrectReturnBitfield19 = new TradeCancelorCorrectReturnBitfield19Field();

    /**
     * BitSet TradeCancelorCorrect byte 20.
     */
    private final TradeCancelorCorrectReturnBitfield20Field tradeCancelorCorrectReturnBitfield20 = new TradeCancelorCorrectReturnBitfield20Field();

    /**
     * BitSet TradeCancelorCorrect byte 21.
     */
    private final TradeCancelorCorrectReturnBitfield21Field tradeCancelorCorrectReturnBitfield21 = new TradeCancelorCorrectReturnBitfield21Field();

    /**
     * Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Symbol Sfx
     */
    private final SymbolSfxField symbolSfx = new SymbolSfxField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Sub Liquidity Indicator
     */
    private final SubLiquidityIndicatorField subLiquidityIndicator = new SubLiquidityIndicatorField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, orderId, execRefId, side, baseLiquidityIndicator, clearingFirm, clearingAccount, lastShares, lastPx, correctedPrice, origTime, numberOfReturnBitfields, tradeCancelorCorrectReturnBitfield1, tradeCancelorCorrectReturnBitfield2, tradeCancelorCorrectReturnBitfield3, tradeCancelorCorrectReturnBitfield4, tradeCancelorCorrectReturnBitfield5, tradeCancelorCorrectReturnBitfield6, tradeCancelorCorrectReturnBitfield7, tradeCancelorCorrectReturnBitfield8, tradeCancelorCorrectReturnBitfield9, tradeCancelorCorrectReturnBitfield10, tradeCancelorCorrectReturnBitfield11, tradeCancelorCorrectReturnBitfield12, tradeCancelorCorrectReturnBitfield13, tradeCancelorCorrectReturnBitfield14, tradeCancelorCorrectReturnBitfield15, tradeCancelorCorrectReturnBitfield16, tradeCancelorCorrectReturnBitfield17, tradeCancelorCorrectReturnBitfield18, tradeCancelorCorrectReturnBitfield19, tradeCancelorCorrectReturnBitfield20, tradeCancelorCorrectReturnBitfield21, symbol, symbolSfx, capacity, subLiquidityIndicator);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the Cboe Matching Engine (not the time the message was sent).
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. ID chosen by the client. Characters in the ASCII range 33-126 are allowed, except for comma, semicolon, pipe, the ‘at’ symbol and double quotes. If the ClOrdID matches a live order, the order will be rejected as duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live orders. However, we strongly recommend that you keep your ClOrdID values unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Corresponds to OrderID (37) in Cboe FIX. Order identifier supplied by Cboe. This identifier corresponds to the identifiers used in Cboe market data products.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Corresponds to ExecRefID (19) in Cboe FIX. Refers to the ExecID of the fill being cancelled or corrected.
     *
     * @return the ExecRefId field
     */
    public ExecRefIdField execRefId() {
        return execRefId;
    }

    /**
     * Corresponds to Side (54) in Cboe FIX. 1=Buy 2=Sell 5=Sell Short (client affirms ability to borrow) 6=Sell Short Exempt
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
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
     * Last Shares
     *
     * @return the LastShares field
     */
    public LastSharesField lastShares() {
        return lastShares;
    }

    /**
     * Last Px
     *
     * @return the LastPx field
     */
    public LastPxField lastPx() {
        return lastPx;
    }

    /**
     * For trade corrections, this is the new trade price. For trade breaks, this is set to 0.
     *
     * @return the CorrectedPrice field
     */
    public CorrectedPriceField correctedPrice() {
        return correctedPrice;
    }

    /**
     * Corresponds to OrigTime (42). The date and time of the original trade, in GMT.
     *
     * @return the OrigTime field
     */
    public OrigTimeField origTime() {
        return origTime;
    }

    /**
     * Number of bitfields that follow; the fields they gate are appended.
     *
     * @return the NumberOfReturnBitfields field
     */
    public NumberOfReturnBitfieldsField numberOfReturnBitfields() {
        return numberOfReturnBitfields;
    }

    /**
     * BitSet TradeCancelorCorrect byte 1.
     *
     * @return the TradeCancelorCorrectReturnBitfield1 field
     */
    public TradeCancelorCorrectReturnBitfield1Field tradeCancelorCorrectReturnBitfield1() {
        return tradeCancelorCorrectReturnBitfield1;
    }

    /**
     * BitSet TradeCancelorCorrect byte 2.
     *
     * @return the TradeCancelorCorrectReturnBitfield2 field
     */
    public TradeCancelorCorrectReturnBitfield2Field tradeCancelorCorrectReturnBitfield2() {
        return tradeCancelorCorrectReturnBitfield2;
    }

    /**
     * BitSet TradeCancelorCorrect byte 3.
     *
     * @return the TradeCancelorCorrectReturnBitfield3 field
     */
    public TradeCancelorCorrectReturnBitfield3Field tradeCancelorCorrectReturnBitfield3() {
        return tradeCancelorCorrectReturnBitfield3;
    }

    /**
     * BitSet TradeCancelorCorrect byte 4.
     *
     * @return the TradeCancelorCorrectReturnBitfield4 field
     */
    public TradeCancelorCorrectReturnBitfield4Field tradeCancelorCorrectReturnBitfield4() {
        return tradeCancelorCorrectReturnBitfield4;
    }

    /**
     * BitSet TradeCancelorCorrect byte 5.
     *
     * @return the TradeCancelorCorrectReturnBitfield5 field
     */
    public TradeCancelorCorrectReturnBitfield5Field tradeCancelorCorrectReturnBitfield5() {
        return tradeCancelorCorrectReturnBitfield5;
    }

    /**
     * BitSet TradeCancelorCorrect byte 6.
     *
     * @return the TradeCancelorCorrectReturnBitfield6 field
     */
    public TradeCancelorCorrectReturnBitfield6Field tradeCancelorCorrectReturnBitfield6() {
        return tradeCancelorCorrectReturnBitfield6;
    }

    /**
     * BitSet TradeCancelorCorrect byte 7.
     *
     * @return the TradeCancelorCorrectReturnBitfield7 field
     */
    public TradeCancelorCorrectReturnBitfield7Field tradeCancelorCorrectReturnBitfield7() {
        return tradeCancelorCorrectReturnBitfield7;
    }

    /**
     * BitSet TradeCancelorCorrect byte 8.
     *
     * @return the TradeCancelorCorrectReturnBitfield8 field
     */
    public TradeCancelorCorrectReturnBitfield8Field tradeCancelorCorrectReturnBitfield8() {
        return tradeCancelorCorrectReturnBitfield8;
    }

    /**
     * BitSet TradeCancelorCorrect byte 9.
     *
     * @return the TradeCancelorCorrectReturnBitfield9 field
     */
    public TradeCancelorCorrectReturnBitfield9Field tradeCancelorCorrectReturnBitfield9() {
        return tradeCancelorCorrectReturnBitfield9;
    }

    /**
     * BitSet TradeCancelorCorrect byte 10.
     *
     * @return the TradeCancelorCorrectReturnBitfield10 field
     */
    public TradeCancelorCorrectReturnBitfield10Field tradeCancelorCorrectReturnBitfield10() {
        return tradeCancelorCorrectReturnBitfield10;
    }

    /**
     * BitSet TradeCancelorCorrect byte 11.
     *
     * @return the TradeCancelorCorrectReturnBitfield11 field
     */
    public TradeCancelorCorrectReturnBitfield11Field tradeCancelorCorrectReturnBitfield11() {
        return tradeCancelorCorrectReturnBitfield11;
    }

    /**
     * BitSet TradeCancelorCorrect byte 12.
     *
     * @return the TradeCancelorCorrectReturnBitfield12 field
     */
    public TradeCancelorCorrectReturnBitfield12Field tradeCancelorCorrectReturnBitfield12() {
        return tradeCancelorCorrectReturnBitfield12;
    }

    /**
     * BitSet TradeCancelorCorrect byte 13.
     *
     * @return the TradeCancelorCorrectReturnBitfield13 field
     */
    public TradeCancelorCorrectReturnBitfield13Field tradeCancelorCorrectReturnBitfield13() {
        return tradeCancelorCorrectReturnBitfield13;
    }

    /**
     * BitSet TradeCancelorCorrect byte 14.
     *
     * @return the TradeCancelorCorrectReturnBitfield14 field
     */
    public TradeCancelorCorrectReturnBitfield14Field tradeCancelorCorrectReturnBitfield14() {
        return tradeCancelorCorrectReturnBitfield14;
    }

    /**
     * BitSet TradeCancelorCorrect byte 15.
     *
     * @return the TradeCancelorCorrectReturnBitfield15 field
     */
    public TradeCancelorCorrectReturnBitfield15Field tradeCancelorCorrectReturnBitfield15() {
        return tradeCancelorCorrectReturnBitfield15;
    }

    /**
     * BitSet TradeCancelorCorrect byte 16.
     *
     * @return the TradeCancelorCorrectReturnBitfield16 field
     */
    public TradeCancelorCorrectReturnBitfield16Field tradeCancelorCorrectReturnBitfield16() {
        return tradeCancelorCorrectReturnBitfield16;
    }

    /**
     * BitSet TradeCancelorCorrect byte 17.
     *
     * @return the TradeCancelorCorrectReturnBitfield17 field
     */
    public TradeCancelorCorrectReturnBitfield17Field tradeCancelorCorrectReturnBitfield17() {
        return tradeCancelorCorrectReturnBitfield17;
    }

    /**
     * BitSet TradeCancelorCorrect byte 18.
     *
     * @return the TradeCancelorCorrectReturnBitfield18 field
     */
    public TradeCancelorCorrectReturnBitfield18Field tradeCancelorCorrectReturnBitfield18() {
        return tradeCancelorCorrectReturnBitfield18;
    }

    /**
     * BitSet TradeCancelorCorrect byte 19.
     *
     * @return the TradeCancelorCorrectReturnBitfield19 field
     */
    public TradeCancelorCorrectReturnBitfield19Field tradeCancelorCorrectReturnBitfield19() {
        return tradeCancelorCorrectReturnBitfield19;
    }

    /**
     * BitSet TradeCancelorCorrect byte 20.
     *
     * @return the TradeCancelorCorrectReturnBitfield20 field
     */
    public TradeCancelorCorrectReturnBitfield20Field tradeCancelorCorrectReturnBitfield20() {
        return tradeCancelorCorrectReturnBitfield20;
    }

    /**
     * BitSet TradeCancelorCorrect byte 21.
     *
     * @return the TradeCancelorCorrectReturnBitfield21 field
     */
    public TradeCancelorCorrectReturnBitfield21Field tradeCancelorCorrectReturnBitfield21() {
        return tradeCancelorCorrectReturnBitfield21;
    }

    /**
     * Symbol
     *
     * @return the Symbol field
     */
    public SymbolField symbol() {
        return symbol;
    }

    /**
     * Symbol Sfx
     *
     * @return the SymbolSfx field
     */
    public SymbolSfxField symbolSfx() {
        return symbolSfx;
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
     * Sub Liquidity Indicator
     *
     * @return the SubLiquidityIndicator field
     */
    public SubLiquidityIndicatorField subLiquidityIndicator() {
        return subLiquidityIndicator;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield1 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield2 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield3 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield4 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield5 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield6 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield7 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield8 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield9 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield10 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield11 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield12 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield13 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield14 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield15 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield16 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield17 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield18 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield19 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield20 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield20 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield20 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield20Present() {
        return numberOfReturnBitfields.value() >= 20L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectReturnBitfield21 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectReturnBitfield21 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectReturnBitfield21 is on the wire
     */
    public boolean tradeCancelorCorrectReturnBitfield21Present() {
        return numberOfReturnBitfields.value() >= 21L;
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCancelorCorrectReturnBitfield2Present() && tradeCancelorCorrectReturnBitfield2.tradeCancelorCorrectReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the SymbolSfx put it on the wire.
     *
     * <p>Decode reads the SymbolSfx where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SymbolSfx is on the wire
     */
    public boolean symbolSfxPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCancelorCorrectReturnBitfield2Present() && tradeCancelorCorrectReturnBitfield2.tradeCancelorCorrectReturnBitfield2SymbolSfx());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCancelorCorrectReturnBitfield2Present() && tradeCancelorCorrectReturnBitfield2.tradeCancelorCorrectReturnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the SubLiquidityIndicator put it on the wire.
     *
     * <p>Decode reads the SubLiquidityIndicator where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SubLiquidityIndicator is on the wire
     */
    public boolean subLiquidityIndicatorPresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (tradeCancelorCorrectReturnBitfield7Present() && tradeCancelorCorrectReturnBitfield7.tradeCancelorCorrectReturnBitfield7SubLiquidityIndicator());
    }

    private boolean onWire(Field field) {
        return (field != tradeCancelorCorrectReturnBitfield1 || tradeCancelorCorrectReturnBitfield1Present()) && (field != tradeCancelorCorrectReturnBitfield2 || tradeCancelorCorrectReturnBitfield2Present()) && (field != tradeCancelorCorrectReturnBitfield3 || tradeCancelorCorrectReturnBitfield3Present()) && (field != tradeCancelorCorrectReturnBitfield4 || tradeCancelorCorrectReturnBitfield4Present()) && (field != tradeCancelorCorrectReturnBitfield5 || tradeCancelorCorrectReturnBitfield5Present()) && (field != tradeCancelorCorrectReturnBitfield6 || tradeCancelorCorrectReturnBitfield6Present()) && (field != tradeCancelorCorrectReturnBitfield7 || tradeCancelorCorrectReturnBitfield7Present()) && (field != tradeCancelorCorrectReturnBitfield8 || tradeCancelorCorrectReturnBitfield8Present()) && (field != tradeCancelorCorrectReturnBitfield9 || tradeCancelorCorrectReturnBitfield9Present()) && (field != tradeCancelorCorrectReturnBitfield10 || tradeCancelorCorrectReturnBitfield10Present()) && (field != tradeCancelorCorrectReturnBitfield11 || tradeCancelorCorrectReturnBitfield11Present()) && (field != tradeCancelorCorrectReturnBitfield12 || tradeCancelorCorrectReturnBitfield12Present()) && (field != tradeCancelorCorrectReturnBitfield13 || tradeCancelorCorrectReturnBitfield13Present()) && (field != tradeCancelorCorrectReturnBitfield14 || tradeCancelorCorrectReturnBitfield14Present()) && (field != tradeCancelorCorrectReturnBitfield15 || tradeCancelorCorrectReturnBitfield15Present()) && (field != tradeCancelorCorrectReturnBitfield16 || tradeCancelorCorrectReturnBitfield16Present()) && (field != tradeCancelorCorrectReturnBitfield17 || tradeCancelorCorrectReturnBitfield17Present()) && (field != tradeCancelorCorrectReturnBitfield18 || tradeCancelorCorrectReturnBitfield18Present()) && (field != tradeCancelorCorrectReturnBitfield19 || tradeCancelorCorrectReturnBitfield19Present()) && (field != tradeCancelorCorrectReturnBitfield20 || tradeCancelorCorrectReturnBitfield20Present()) && (field != tradeCancelorCorrectReturnBitfield21 || tradeCancelorCorrectReturnBitfield21Present()) && (field != symbol || symbolPresent()) && (field != symbolSfx || symbolSfxPresent()) && (field != capacity || capacityPresent()) && (field != subLiquidityIndicator || subLiquidityIndicatorPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (tradeCancelorCorrectReturnBitfield1Present() ? TradeCancelorCorrectReturnBitfield1Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield2Present() ? TradeCancelorCorrectReturnBitfield2Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield3Present() ? TradeCancelorCorrectReturnBitfield3Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield4Present() ? TradeCancelorCorrectReturnBitfield4Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield5Present() ? TradeCancelorCorrectReturnBitfield5Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield6Present() ? TradeCancelorCorrectReturnBitfield6Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield7Present() ? TradeCancelorCorrectReturnBitfield7Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield8Present() ? TradeCancelorCorrectReturnBitfield8Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield9Present() ? TradeCancelorCorrectReturnBitfield9Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield10Present() ? TradeCancelorCorrectReturnBitfield10Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield11Present() ? TradeCancelorCorrectReturnBitfield11Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield12Present() ? TradeCancelorCorrectReturnBitfield12Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield13Present() ? TradeCancelorCorrectReturnBitfield13Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield14Present() ? TradeCancelorCorrectReturnBitfield14Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield15Present() ? TradeCancelorCorrectReturnBitfield15Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield16Present() ? TradeCancelorCorrectReturnBitfield16Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield17Present() ? TradeCancelorCorrectReturnBitfield17Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield18Present() ? TradeCancelorCorrectReturnBitfield18Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield19Present() ? TradeCancelorCorrectReturnBitfield19Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield20Present() ? TradeCancelorCorrectReturnBitfield20Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectReturnBitfield21Present() ? TradeCancelorCorrectReturnBitfield21Field.BYTE_LENGTH : 0) + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (symbolSfxPresent() ? SymbolSfxField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (subLiquidityIndicatorPresent() ? SubLiquidityIndicatorField.BYTE_LENGTH : 0);
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
        cursor += 8;
        cursor += 1;
        cursor += 1;
        cursor += 4;
        cursor += 4;
        cursor += 4;
        cursor += 8;
        cursor += 8;
        cursor += 8;
        runs.add(cursor).add(1);
        cursor += 1;
        cursor += 1;
        if (tradeCancelorCorrectReturnBitfield1Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield2Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield3Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield4Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield5Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield6Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield7Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield8Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield9Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield10Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield11Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield12Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield13Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield14Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield15Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield16Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield17Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield18Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield19Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield20Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectReturnBitfield21Present()) {
            cursor += 1;
        }
        if (symbolPresent()) {
            cursor += 8;
        }
        if (symbolSfxPresent()) {
            cursor += 8;
        }
        if (capacityPresent()) {
            cursor += 1;
        }
        if (subLiquidityIndicatorPresent()) {
            cursor += 1;
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
        if (!execRefId.parse(data, cursor)) {
            return false;
        }
        cursor += ExecRefIdField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!baseLiquidityIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BaseLiquidityIndicatorField.BYTE_LENGTH;
        if (!clearingFirm.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingFirmField.BYTE_LENGTH;
        if (!clearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ClearingAccountField.BYTE_LENGTH;
        if (!lastShares.parse(data, cursor)) {
            return false;
        }
        cursor += LastSharesField.BYTE_LENGTH;
        if (!lastPx.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxField.BYTE_LENGTH;
        if (!correctedPrice.parse(data, cursor)) {
            return false;
        }
        cursor += CorrectedPriceField.BYTE_LENGTH;
        if (!origTime.parse(data, cursor)) {
            return false;
        }
        cursor += OrigTimeField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!numberOfReturnBitfields.parse(data, cursor)) {
            return false;
        }
        cursor += NumberOfReturnBitfieldsField.BYTE_LENGTH;
        if (tradeCancelorCorrectReturnBitfield1Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield1Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield2Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield2Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield3Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield3Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield4Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield4Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield5Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield5Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield6Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield6Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield7Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield7Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield8Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield8Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield9Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield9Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield10Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield10Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield11Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield11Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield12Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield12Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield13Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield13Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield14Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield14Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield15Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield15Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield16Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield16Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield17Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield17Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield18Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield18Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield19Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield19Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield19Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield20Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield20Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield20.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield20Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectReturnBitfield21Present()) {
            if (end - cursor < TradeCancelorCorrectReturnBitfield21Field.BYTE_LENGTH || !tradeCancelorCorrectReturnBitfield21.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectReturnBitfield21Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (symbolPresent()) {
            if (end - cursor < SymbolField.BYTE_LENGTH || !symbol.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (symbolSfxPresent()) {
            if (end - cursor < SymbolSfxField.BYTE_LENGTH || !symbolSfx.parse(data, cursor)) {
                return false;
            }
            cursor += SymbolSfxField.BYTE_LENGTH;
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
        if (subLiquidityIndicatorPresent()) {
            if (end - cursor < SubLiquidityIndicatorField.BYTE_LENGTH || !subLiquidityIndicator.parse(data, cursor)) {
                return false;
            }
            cursor += SubLiquidityIndicatorField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (tradeCancelorCorrectReturnBitfield1Present() != tradeCancelorCorrectReturnBitfield1.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield1.hasValue() ? "tradeCancelorCorrectReturnBitfield1 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield2Present() != tradeCancelorCorrectReturnBitfield2.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield2.hasValue() ? "tradeCancelorCorrectReturnBitfield2 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield3Present() != tradeCancelorCorrectReturnBitfield3.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield3.hasValue() ? "tradeCancelorCorrectReturnBitfield3 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield4Present() != tradeCancelorCorrectReturnBitfield4.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield4.hasValue() ? "tradeCancelorCorrectReturnBitfield4 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield5Present() != tradeCancelorCorrectReturnBitfield5.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield5.hasValue() ? "tradeCancelorCorrectReturnBitfield5 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield6Present() != tradeCancelorCorrectReturnBitfield6.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield6.hasValue() ? "tradeCancelorCorrectReturnBitfield6 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield7Present() != tradeCancelorCorrectReturnBitfield7.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield7.hasValue() ? "tradeCancelorCorrectReturnBitfield7 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield8Present() != tradeCancelorCorrectReturnBitfield8.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield8.hasValue() ? "tradeCancelorCorrectReturnBitfield8 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield9Present() != tradeCancelorCorrectReturnBitfield9.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield9.hasValue() ? "tradeCancelorCorrectReturnBitfield9 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield10Present() != tradeCancelorCorrectReturnBitfield10.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield10.hasValue() ? "tradeCancelorCorrectReturnBitfield10 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield11Present() != tradeCancelorCorrectReturnBitfield11.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield11.hasValue() ? "tradeCancelorCorrectReturnBitfield11 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield12Present() != tradeCancelorCorrectReturnBitfield12.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield12.hasValue() ? "tradeCancelorCorrectReturnBitfield12 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield13Present() != tradeCancelorCorrectReturnBitfield13.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield13.hasValue() ? "tradeCancelorCorrectReturnBitfield13 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield14Present() != tradeCancelorCorrectReturnBitfield14.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield14.hasValue() ? "tradeCancelorCorrectReturnBitfield14 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield15Present() != tradeCancelorCorrectReturnBitfield15.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield15.hasValue() ? "tradeCancelorCorrectReturnBitfield15 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield16Present() != tradeCancelorCorrectReturnBitfield16.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield16.hasValue() ? "tradeCancelorCorrectReturnBitfield16 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield17Present() != tradeCancelorCorrectReturnBitfield17.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield17.hasValue() ? "tradeCancelorCorrectReturnBitfield17 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield18Present() != tradeCancelorCorrectReturnBitfield18.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield18.hasValue() ? "tradeCancelorCorrectReturnBitfield18 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield19Present() != tradeCancelorCorrectReturnBitfield19.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield19.hasValue() ? "tradeCancelorCorrectReturnBitfield19 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield20Present() != tradeCancelorCorrectReturnBitfield20.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield20.hasValue() ? "tradeCancelorCorrectReturnBitfield20 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield20 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectReturnBitfield21Present() != tradeCancelorCorrectReturnBitfield21.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectReturnBitfield21.hasValue() ? "tradeCancelorCorrectReturnBitfield21 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectReturnBitfield21 holds no value, though the fields before it put it on the wire");
        }
        if (symbolPresent() != symbol.hasValue()) {
            throw new IllegalStateException(symbol.hasValue() ? "symbol holds a value the fields before it leave off the wire" : "symbol holds no value, though the fields before it put it on the wire");
        }
        if (symbolSfxPresent() != symbolSfx.hasValue()) {
            throw new IllegalStateException(symbolSfx.hasValue() ? "symbolSfx holds a value the fields before it leave off the wire" : "symbolSfx holds no value, though the fields before it put it on the wire");
        }
        if (capacityPresent() != capacity.hasValue()) {
            throw new IllegalStateException(capacity.hasValue() ? "capacity holds a value the fields before it leave off the wire" : "capacity holds no value, though the fields before it put it on the wire");
        }
        if (subLiquidityIndicatorPresent() != subLiquidityIndicator.hasValue()) {
            throw new IllegalStateException(subLiquidityIndicator.hasValue() ? "subLiquidityIndicator holds a value the fields before it leave off the wire" : "subLiquidityIndicator holds no value, though the fields before it put it on the wire");
        }
        int cursor = offset;
        cursor = transactionTime.encode(data, cursor);
        cursor = clOrdId.encode(data, cursor);
        cursor = orderId.encode(data, cursor);
        cursor = execRefId.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = baseLiquidityIndicator.encode(data, cursor);
        cursor = clearingFirm.encode(data, cursor);
        cursor = clearingAccount.encode(data, cursor);
        cursor = lastShares.encode(data, cursor);
        cursor = lastPx.encode(data, cursor);
        cursor = correctedPrice.encode(data, cursor);
        cursor = origTime.encode(data, cursor);
        if (buffer != null && buffer.length >= 83) {
            System.arraycopy(buffer, 82, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (tradeCancelorCorrectReturnBitfield1Present()) {
            cursor = tradeCancelorCorrectReturnBitfield1.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield2Present()) {
            cursor = tradeCancelorCorrectReturnBitfield2.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield3Present()) {
            cursor = tradeCancelorCorrectReturnBitfield3.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield4Present()) {
            cursor = tradeCancelorCorrectReturnBitfield4.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield5Present()) {
            cursor = tradeCancelorCorrectReturnBitfield5.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield6Present()) {
            cursor = tradeCancelorCorrectReturnBitfield6.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield7Present()) {
            cursor = tradeCancelorCorrectReturnBitfield7.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield8Present()) {
            cursor = tradeCancelorCorrectReturnBitfield8.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield9Present()) {
            cursor = tradeCancelorCorrectReturnBitfield9.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield10Present()) {
            cursor = tradeCancelorCorrectReturnBitfield10.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield11Present()) {
            cursor = tradeCancelorCorrectReturnBitfield11.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield12Present()) {
            cursor = tradeCancelorCorrectReturnBitfield12.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield13Present()) {
            cursor = tradeCancelorCorrectReturnBitfield13.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield14Present()) {
            cursor = tradeCancelorCorrectReturnBitfield14.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield15Present()) {
            cursor = tradeCancelorCorrectReturnBitfield15.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield16Present()) {
            cursor = tradeCancelorCorrectReturnBitfield16.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield17Present()) {
            cursor = tradeCancelorCorrectReturnBitfield17.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield18Present()) {
            cursor = tradeCancelorCorrectReturnBitfield18.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield19Present()) {
            cursor = tradeCancelorCorrectReturnBitfield19.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield20Present()) {
            cursor = tradeCancelorCorrectReturnBitfield20.encode(data, cursor);
        }
        if (tradeCancelorCorrectReturnBitfield21Present()) {
            cursor = tradeCancelorCorrectReturnBitfield21.encode(data, cursor);
        }
        if (symbolPresent()) {
            cursor = symbol.encode(data, cursor);
        }
        if (symbolSfxPresent()) {
            cursor = symbolSfx.encode(data, cursor);
        }
        if (capacityPresent()) {
            cursor = capacity.encode(data, cursor);
        }
        if (subLiquidityIndicatorPresent()) {
            cursor = subLiquidityIndicator.encode(data, cursor);
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
            case "ExecRefId" -> Optional.of(execRefId);
            case "Side" -> Optional.of(side);
            case "BaseLiquidityIndicator" -> Optional.of(baseLiquidityIndicator);
            case "ClearingFirm" -> Optional.of(clearingFirm);
            case "ClearingAccount" -> Optional.of(clearingAccount);
            case "LastShares" -> Optional.of(lastShares);
            case "LastPx" -> Optional.of(lastPx);
            case "CorrectedPrice" -> Optional.of(correctedPrice);
            case "OrigTime" -> Optional.of(origTime);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "TradeCancelorCorrectReturnBitfield1" -> Optional.of(tradeCancelorCorrectReturnBitfield1);
            case "TradeCancelorCorrectReturnBitfield2" -> Optional.of(tradeCancelorCorrectReturnBitfield2);
            case "TradeCancelorCorrectReturnBitfield3" -> Optional.of(tradeCancelorCorrectReturnBitfield3);
            case "TradeCancelorCorrectReturnBitfield4" -> Optional.of(tradeCancelorCorrectReturnBitfield4);
            case "TradeCancelorCorrectReturnBitfield5" -> Optional.of(tradeCancelorCorrectReturnBitfield5);
            case "TradeCancelorCorrectReturnBitfield6" -> Optional.of(tradeCancelorCorrectReturnBitfield6);
            case "TradeCancelorCorrectReturnBitfield7" -> Optional.of(tradeCancelorCorrectReturnBitfield7);
            case "TradeCancelorCorrectReturnBitfield8" -> Optional.of(tradeCancelorCorrectReturnBitfield8);
            case "TradeCancelorCorrectReturnBitfield9" -> Optional.of(tradeCancelorCorrectReturnBitfield9);
            case "TradeCancelorCorrectReturnBitfield10" -> Optional.of(tradeCancelorCorrectReturnBitfield10);
            case "TradeCancelorCorrectReturnBitfield11" -> Optional.of(tradeCancelorCorrectReturnBitfield11);
            case "TradeCancelorCorrectReturnBitfield12" -> Optional.of(tradeCancelorCorrectReturnBitfield12);
            case "TradeCancelorCorrectReturnBitfield13" -> Optional.of(tradeCancelorCorrectReturnBitfield13);
            case "TradeCancelorCorrectReturnBitfield14" -> Optional.of(tradeCancelorCorrectReturnBitfield14);
            case "TradeCancelorCorrectReturnBitfield15" -> Optional.of(tradeCancelorCorrectReturnBitfield15);
            case "TradeCancelorCorrectReturnBitfield16" -> Optional.of(tradeCancelorCorrectReturnBitfield16);
            case "TradeCancelorCorrectReturnBitfield17" -> Optional.of(tradeCancelorCorrectReturnBitfield17);
            case "TradeCancelorCorrectReturnBitfield18" -> Optional.of(tradeCancelorCorrectReturnBitfield18);
            case "TradeCancelorCorrectReturnBitfield19" -> Optional.of(tradeCancelorCorrectReturnBitfield19);
            case "TradeCancelorCorrectReturnBitfield20" -> Optional.of(tradeCancelorCorrectReturnBitfield20);
            case "TradeCancelorCorrectReturnBitfield21" -> Optional.of(tradeCancelorCorrectReturnBitfield21);
            case "Symbol" -> Optional.of(symbol);
            case "SymbolSfx" -> Optional.of(symbolSfx);
            case "Capacity" -> Optional.of(capacity);
            case "SubLiquidityIndicator" -> Optional.of(subLiquidityIndicator);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCancelOrCorrectMessage message)) {
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
        if (!(other instanceof TradeCancelOrCorrectMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
