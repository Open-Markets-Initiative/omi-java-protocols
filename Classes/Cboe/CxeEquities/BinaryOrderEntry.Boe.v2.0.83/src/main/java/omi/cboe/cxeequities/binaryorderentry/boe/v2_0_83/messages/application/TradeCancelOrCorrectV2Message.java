package omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.BaseLiquidityIndicatorField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.CapacityField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.ClOrdIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.ClearingAccountField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.ClearingFirmField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.CorrectedPriceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.CorrectedSizeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.CurrencyField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.ExecRefIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.IdSourceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.LastMktField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.LastPxBinaryPriceField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.LastSharesField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.NumberOfReturnBitfieldsField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrderIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.OrigTimeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.SecurityExchangeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.SecurityIdField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.SideField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.SymbolField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield10Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield11Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield12Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield13Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield14Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield15Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield16Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield17Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield18Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield19Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield1Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield2Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield3Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield4Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield5Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield6Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield7Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield8Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TradeCancelorCorrectV2ReturnBitfield9Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.fields.TransactionTimeField;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.types.Field;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.types.Message;
import omi.cboe.cxeequities.binaryorderentry.boe.v2_0_83.types.PrintOptions;

/**
 * Represents the TradeCancelOrCorrectV2Message message from the BinaryOrderEntry protocol.
 *
 * <p>Trade Cancel or Correct V2 Message.</p>
 */
public final class TradeCancelOrCorrectV2Message implements Message {

    /**
     * This message's width on the wire with every counted repeating group empty.
     */
    public static final int MINIMUM_BYTE_LENGTH = 84;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Trade Cancel Or Correct V 2 Message";

    /**
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent). Nanosecond precision.
     */
    private final TransactionTimeField transactionTime = new TransactionTimeField();

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe (—). A leading tilde (˜) cannot be sent on any ClOrdID and will result in a reject. These are reserved for internal use by Cboe and could be received as a result of a system-generated ClOrdID. If the ClOrdID matches a live order, the order will be rejected as a duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live or- ders, which includes long-lived persisting GTC/GTD orders. However, we strongly recommend that you keep your ClOrdID val- ues at least day-unique.
     */
    private final ClOrdIdField clOrdId = new ClOrdIdField();

    /**
     * Corresponds to OrderID (37) in Cboe FIX. Order identifier supplied by Cboe. This identi- fier corresponds to the identifiers used in Cboe market data products.
     */
    private final OrderIdField orderId = new OrderIdField();

    /**
     * Corresponds to ExecRefID (19) in Cboe FIX. Refers to the ExecID (o)f the fill being cancelled or corrected.
     */
    private final ExecRefIdField execRefId = new ExecRefIdField();

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell 5 = Sell Short 6 = Sell Short Exempt H = Sell Undisclosed
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
     * Corresponds to LastShares (32) in Cboe FIX. Executed share quantity. If the LargeSize op- tional field is specified, that value holds pre- cedance over this field.
     */
    private final LastSharesField lastShares = new LastSharesField();

    /**
     * Last Px Binary Price
     */
    private final LastPxBinaryPriceField lastPxBinaryPrice = new LastPxBinaryPriceField();

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
     * BitSet TradeCancelorCorrectV2 byte 1.
     */
    private final TradeCancelorCorrectV2ReturnBitfield1Field tradeCancelorCorrectV2ReturnBitfield1 = new TradeCancelorCorrectV2ReturnBitfield1Field();

    /**
     * BitSet TradeCancelorCorrectV2 byte 2.
     */
    private final TradeCancelorCorrectV2ReturnBitfield2Field tradeCancelorCorrectV2ReturnBitfield2 = new TradeCancelorCorrectV2ReturnBitfield2Field();

    /**
     * BitSet TradeCancelorCorrectV2 byte 3.
     */
    private final TradeCancelorCorrectV2ReturnBitfield3Field tradeCancelorCorrectV2ReturnBitfield3 = new TradeCancelorCorrectV2ReturnBitfield3Field();

    /**
     * BitSet TradeCancelorCorrectV2 byte 4.
     */
    private final TradeCancelorCorrectV2ReturnBitfield4Field tradeCancelorCorrectV2ReturnBitfield4 = new TradeCancelorCorrectV2ReturnBitfield4Field();

    /**
     * BitSet TradeCancelorCorrectV2 byte 5.
     */
    private final TradeCancelorCorrectV2ReturnBitfield5Field tradeCancelorCorrectV2ReturnBitfield5 = new TradeCancelorCorrectV2ReturnBitfield5Field();

    /**
     * BitSet TradeCancelorCorrectV2 byte 6.
     */
    private final TradeCancelorCorrectV2ReturnBitfield6Field tradeCancelorCorrectV2ReturnBitfield6 = new TradeCancelorCorrectV2ReturnBitfield6Field();

    /**
     * BitSet TradeCancelorCorrectV2 byte 7.
     */
    private final TradeCancelorCorrectV2ReturnBitfield7Field tradeCancelorCorrectV2ReturnBitfield7 = new TradeCancelorCorrectV2ReturnBitfield7Field();

    /**
     * BitSet TradeCancelorCorrectV2 byte 8.
     */
    private final TradeCancelorCorrectV2ReturnBitfield8Field tradeCancelorCorrectV2ReturnBitfield8 = new TradeCancelorCorrectV2ReturnBitfield8Field();

    /**
     * BitSet TradeCancelorCorrectV2 byte 9.
     */
    private final TradeCancelorCorrectV2ReturnBitfield9Field tradeCancelorCorrectV2ReturnBitfield9 = new TradeCancelorCorrectV2ReturnBitfield9Field();

    /**
     * BitSet TradeCancelorCorrectV2 byte 10.
     */
    private final TradeCancelorCorrectV2ReturnBitfield10Field tradeCancelorCorrectV2ReturnBitfield10 = new TradeCancelorCorrectV2ReturnBitfield10Field();

    /**
     * BitSet TradeCancelorCorrectV2 byte 11.
     */
    private final TradeCancelorCorrectV2ReturnBitfield11Field tradeCancelorCorrectV2ReturnBitfield11 = new TradeCancelorCorrectV2ReturnBitfield11Field();

    /**
     * BitSet TradeCancelorCorrectV2 byte 12.
     */
    private final TradeCancelorCorrectV2ReturnBitfield12Field tradeCancelorCorrectV2ReturnBitfield12 = new TradeCancelorCorrectV2ReturnBitfield12Field();

    /**
     * BitSet TradeCancelorCorrectV2 byte 13.
     */
    private final TradeCancelorCorrectV2ReturnBitfield13Field tradeCancelorCorrectV2ReturnBitfield13 = new TradeCancelorCorrectV2ReturnBitfield13Field();

    /**
     * BitSet TradeCancelorCorrectV2 byte 14.
     */
    private final TradeCancelorCorrectV2ReturnBitfield14Field tradeCancelorCorrectV2ReturnBitfield14 = new TradeCancelorCorrectV2ReturnBitfield14Field();

    /**
     * BitSet TradeCancelorCorrectV2 byte 15.
     */
    private final TradeCancelorCorrectV2ReturnBitfield15Field tradeCancelorCorrectV2ReturnBitfield15 = new TradeCancelorCorrectV2ReturnBitfield15Field();

    /**
     * BitSet TradeCancelorCorrectV2 byte 16.
     */
    private final TradeCancelorCorrectV2ReturnBitfield16Field tradeCancelorCorrectV2ReturnBitfield16 = new TradeCancelorCorrectV2ReturnBitfield16Field();

    /**
     * BitSet TradeCancelorCorrectV2 byte 17.
     */
    private final TradeCancelorCorrectV2ReturnBitfield17Field tradeCancelorCorrectV2ReturnBitfield17 = new TradeCancelorCorrectV2ReturnBitfield17Field();

    /**
     * BitSet TradeCancelorCorrectV2 byte 18.
     */
    private final TradeCancelorCorrectV2ReturnBitfield18Field tradeCancelorCorrectV2ReturnBitfield18 = new TradeCancelorCorrectV2ReturnBitfield18Field();

    /**
     * BitSet TradeCancelorCorrectV2 byte 19.
     */
    private final TradeCancelorCorrectV2ReturnBitfield19Field tradeCancelorCorrectV2ReturnBitfield19 = new TradeCancelorCorrectV2ReturnBitfield19Field();

    /**
     * Symbol
     */
    private final SymbolField symbol = new SymbolField();

    /**
     * Currency
     */
    private final CurrencyField currency = new CurrencyField();

    /**
     * Id Source
     */
    private final IdSourceField idSource = new IdSourceField();

    /**
     * Security Id
     */
    private final SecurityIdField securityId = new SecurityIdField();

    /**
     * Security Exchange
     */
    private final SecurityExchangeField securityExchange = new SecurityExchangeField();

    /**
     * Capacity
     */
    private final CapacityField capacity = new CapacityField();

    /**
     * Corrected Size
     */
    private final CorrectedSizeField correctedSize = new CorrectedSizeField();

    /**
     * Last Mkt
     */
    private final LastMktField lastMkt = new LastMktField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(transactionTime, clOrdId, orderId, execRefId, side, baseLiquidityIndicator, clearingFirm, clearingAccount, lastShares, lastPxBinaryPrice, correctedPrice, origTime, numberOfReturnBitfields, tradeCancelorCorrectV2ReturnBitfield1, tradeCancelorCorrectV2ReturnBitfield2, tradeCancelorCorrectV2ReturnBitfield3, tradeCancelorCorrectV2ReturnBitfield4, tradeCancelorCorrectV2ReturnBitfield5, tradeCancelorCorrectV2ReturnBitfield6, tradeCancelorCorrectV2ReturnBitfield7, tradeCancelorCorrectV2ReturnBitfield8, tradeCancelorCorrectV2ReturnBitfield9, tradeCancelorCorrectV2ReturnBitfield10, tradeCancelorCorrectV2ReturnBitfield11, tradeCancelorCorrectV2ReturnBitfield12, tradeCancelorCorrectV2ReturnBitfield13, tradeCancelorCorrectV2ReturnBitfield14, tradeCancelorCorrectV2ReturnBitfield15, tradeCancelorCorrectV2ReturnBitfield16, tradeCancelorCorrectV2ReturnBitfield17, tradeCancelorCorrectV2ReturnBitfield18, tradeCancelorCorrectV2ReturnBitfield19, symbol, currency, idSource, securityId, securityExchange, capacity, correctedSize, lastMkt);

    private byte[] buffer;

    private boolean decoded;

    /**
     * The time the event occurred in the Cboe match- ing engine (not the time the message was sent). Nanosecond precision.
     *
     * @return the TransactionTime field
     */
    public TransactionTimeField transactionTime() {
        return transactionTime;
    }

    /**
     * Corresponds to ClOrdID (11) in Cboe FIX. Day-unique ID chosen by the client. Characters in the ASCII range 33–126 are allowed, except for comma, semicolon, and pipe (—). A leading tilde (˜) cannot be sent on any ClOrdID and will result in a reject. These are reserved for internal use by Cboe and could be received as a result of a system-generated ClOrdID. If the ClOrdID matches a live order, the order will be rejected as a duplicate. Note: Cboe only enforces uniqueness of ClOrdID values among currently live or- ders, which includes long-lived persisting GTC/GTD orders. However, we strongly recommend that you keep your ClOrdID val- ues at least day-unique.
     *
     * @return the ClOrdId field
     */
    public ClOrdIdField clOrdId() {
        return clOrdId;
    }

    /**
     * Corresponds to OrderID (37) in Cboe FIX. Order identifier supplied by Cboe. This identi- fier corresponds to the identifiers used in Cboe market data products.
     *
     * @return the OrderId field
     */
    public OrderIdField orderId() {
        return orderId;
    }

    /**
     * Corresponds to ExecRefID (19) in Cboe FIX. Refers to the ExecID (o)f the fill being cancelled or corrected.
     *
     * @return the ExecRefId field
     */
    public ExecRefIdField execRefId() {
        return execRefId;
    }

    /**
     * Corresponds to Side (54) in Cboe FIX. 1 = Buy 2 = Sell 5 = Sell Short 6 = Sell Short Exempt H = Sell Undisclosed
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
     * Corresponds to LastShares (32) in Cboe FIX. Executed share quantity. If the LargeSize op- tional field is specified, that value holds pre- cedance over this field.
     *
     * @return the LastShares field
     */
    public LastSharesField lastShares() {
        return lastShares;
    }

    /**
     * Last Px Binary Price
     *
     * @return the LastPxBinaryPrice field
     */
    public LastPxBinaryPriceField lastPxBinaryPrice() {
        return lastPxBinaryPrice;
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
     * BitSet TradeCancelorCorrectV2 byte 1.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield1 field
     */
    public TradeCancelorCorrectV2ReturnBitfield1Field tradeCancelorCorrectV2ReturnBitfield1() {
        return tradeCancelorCorrectV2ReturnBitfield1;
    }

    /**
     * BitSet TradeCancelorCorrectV2 byte 2.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield2 field
     */
    public TradeCancelorCorrectV2ReturnBitfield2Field tradeCancelorCorrectV2ReturnBitfield2() {
        return tradeCancelorCorrectV2ReturnBitfield2;
    }

    /**
     * BitSet TradeCancelorCorrectV2 byte 3.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield3 field
     */
    public TradeCancelorCorrectV2ReturnBitfield3Field tradeCancelorCorrectV2ReturnBitfield3() {
        return tradeCancelorCorrectV2ReturnBitfield3;
    }

    /**
     * BitSet TradeCancelorCorrectV2 byte 4.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield4 field
     */
    public TradeCancelorCorrectV2ReturnBitfield4Field tradeCancelorCorrectV2ReturnBitfield4() {
        return tradeCancelorCorrectV2ReturnBitfield4;
    }

    /**
     * BitSet TradeCancelorCorrectV2 byte 5.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield5 field
     */
    public TradeCancelorCorrectV2ReturnBitfield5Field tradeCancelorCorrectV2ReturnBitfield5() {
        return tradeCancelorCorrectV2ReturnBitfield5;
    }

    /**
     * BitSet TradeCancelorCorrectV2 byte 6.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield6 field
     */
    public TradeCancelorCorrectV2ReturnBitfield6Field tradeCancelorCorrectV2ReturnBitfield6() {
        return tradeCancelorCorrectV2ReturnBitfield6;
    }

    /**
     * BitSet TradeCancelorCorrectV2 byte 7.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield7 field
     */
    public TradeCancelorCorrectV2ReturnBitfield7Field tradeCancelorCorrectV2ReturnBitfield7() {
        return tradeCancelorCorrectV2ReturnBitfield7;
    }

    /**
     * BitSet TradeCancelorCorrectV2 byte 8.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield8 field
     */
    public TradeCancelorCorrectV2ReturnBitfield8Field tradeCancelorCorrectV2ReturnBitfield8() {
        return tradeCancelorCorrectV2ReturnBitfield8;
    }

    /**
     * BitSet TradeCancelorCorrectV2 byte 9.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield9 field
     */
    public TradeCancelorCorrectV2ReturnBitfield9Field tradeCancelorCorrectV2ReturnBitfield9() {
        return tradeCancelorCorrectV2ReturnBitfield9;
    }

    /**
     * BitSet TradeCancelorCorrectV2 byte 10.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield10 field
     */
    public TradeCancelorCorrectV2ReturnBitfield10Field tradeCancelorCorrectV2ReturnBitfield10() {
        return tradeCancelorCorrectV2ReturnBitfield10;
    }

    /**
     * BitSet TradeCancelorCorrectV2 byte 11.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield11 field
     */
    public TradeCancelorCorrectV2ReturnBitfield11Field tradeCancelorCorrectV2ReturnBitfield11() {
        return tradeCancelorCorrectV2ReturnBitfield11;
    }

    /**
     * BitSet TradeCancelorCorrectV2 byte 12.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield12 field
     */
    public TradeCancelorCorrectV2ReturnBitfield12Field tradeCancelorCorrectV2ReturnBitfield12() {
        return tradeCancelorCorrectV2ReturnBitfield12;
    }

    /**
     * BitSet TradeCancelorCorrectV2 byte 13.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield13 field
     */
    public TradeCancelorCorrectV2ReturnBitfield13Field tradeCancelorCorrectV2ReturnBitfield13() {
        return tradeCancelorCorrectV2ReturnBitfield13;
    }

    /**
     * BitSet TradeCancelorCorrectV2 byte 14.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield14 field
     */
    public TradeCancelorCorrectV2ReturnBitfield14Field tradeCancelorCorrectV2ReturnBitfield14() {
        return tradeCancelorCorrectV2ReturnBitfield14;
    }

    /**
     * BitSet TradeCancelorCorrectV2 byte 15.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield15 field
     */
    public TradeCancelorCorrectV2ReturnBitfield15Field tradeCancelorCorrectV2ReturnBitfield15() {
        return tradeCancelorCorrectV2ReturnBitfield15;
    }

    /**
     * BitSet TradeCancelorCorrectV2 byte 16.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield16 field
     */
    public TradeCancelorCorrectV2ReturnBitfield16Field tradeCancelorCorrectV2ReturnBitfield16() {
        return tradeCancelorCorrectV2ReturnBitfield16;
    }

    /**
     * BitSet TradeCancelorCorrectV2 byte 17.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield17 field
     */
    public TradeCancelorCorrectV2ReturnBitfield17Field tradeCancelorCorrectV2ReturnBitfield17() {
        return tradeCancelorCorrectV2ReturnBitfield17;
    }

    /**
     * BitSet TradeCancelorCorrectV2 byte 18.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield18 field
     */
    public TradeCancelorCorrectV2ReturnBitfield18Field tradeCancelorCorrectV2ReturnBitfield18() {
        return tradeCancelorCorrectV2ReturnBitfield18;
    }

    /**
     * BitSet TradeCancelorCorrectV2 byte 19.
     *
     * @return the TradeCancelorCorrectV2ReturnBitfield19 field
     */
    public TradeCancelorCorrectV2ReturnBitfield19Field tradeCancelorCorrectV2ReturnBitfield19() {
        return tradeCancelorCorrectV2ReturnBitfield19;
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
     * Currency
     *
     * @return the Currency field
     */
    public CurrencyField currency() {
        return currency;
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
     * Security Exchange
     *
     * @return the SecurityExchange field
     */
    public SecurityExchangeField securityExchange() {
        return securityExchange;
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
     * Corrected Size
     *
     * @return the CorrectedSize field
     */
    public CorrectedSizeField correctedSize() {
        return correctedSize;
    }

    /**
     * Last Mkt
     *
     * @return the LastMkt field
     */
    public LastMktField lastMkt() {
        return lastMkt;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield1 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield1 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield1 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield1Present() {
        return numberOfReturnBitfields.value() >= 1L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield2 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield2 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield2 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield2Present() {
        return numberOfReturnBitfields.value() >= 2L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield3 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield3 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield3 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield3Present() {
        return numberOfReturnBitfields.value() >= 3L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield4 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield4 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield4 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield4Present() {
        return numberOfReturnBitfields.value() >= 4L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield5 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield5 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield5 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield5Present() {
        return numberOfReturnBitfields.value() >= 5L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield6 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield6 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield6 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield6Present() {
        return numberOfReturnBitfields.value() >= 6L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield7 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield7 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield7 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield7Present() {
        return numberOfReturnBitfields.value() >= 7L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield8 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield8 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield8 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield8Present() {
        return numberOfReturnBitfields.value() >= 8L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield9 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield9 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield9 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield9Present() {
        return numberOfReturnBitfields.value() >= 9L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield10 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield10 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield10 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield10Present() {
        return numberOfReturnBitfields.value() >= 10L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield11 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield11 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield11 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield11Present() {
        return numberOfReturnBitfields.value() >= 11L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield12 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield12 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield12 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield12Present() {
        return numberOfReturnBitfields.value() >= 12L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield13 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield13 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield13 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield13Present() {
        return numberOfReturnBitfields.value() >= 13L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield14 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield14 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield14 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield14Present() {
        return numberOfReturnBitfields.value() >= 14L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield15 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield15 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield15 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield15Present() {
        return numberOfReturnBitfields.value() >= 15L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield16 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield16 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield16 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield16Present() {
        return numberOfReturnBitfields.value() >= 16L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield17 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield17 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield17 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield17Present() {
        return numberOfReturnBitfields.value() >= 17L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield18 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield18 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield18 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield18Present() {
        return numberOfReturnBitfields.value() >= 18L;
    }

    /**
     * Returns whether the fields before the TradeCancelorCorrectV2ReturnBitfield19 put it on the wire.
     *
     * <p>Decode reads the TradeCancelorCorrectV2ReturnBitfield19 where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the TradeCancelorCorrectV2ReturnBitfield19 is on the wire
     */
    public boolean tradeCancelorCorrectV2ReturnBitfield19Present() {
        return numberOfReturnBitfields.value() >= 19L;
    }

    /**
     * Returns whether the fields before the Symbol put it on the wire.
     *
     * <p>Decode reads the Symbol where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Symbol is on the wire
     */
    public boolean symbolPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCancelorCorrectV2ReturnBitfield2Present() && tradeCancelorCorrectV2ReturnBitfield2.tradeCancelorCorrectV2ReturnBitfield2Symbol());
    }

    /**
     * Returns whether the fields before the Currency put it on the wire.
     *
     * <p>Decode reads the Currency where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Currency is on the wire
     */
    public boolean currencyPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCancelorCorrectV2ReturnBitfield2Present() && tradeCancelorCorrectV2ReturnBitfield2.tradeCancelorCorrectV2ReturnBitfield2Currency());
    }

    /**
     * Returns whether the fields before the IdSource put it on the wire.
     *
     * <p>Decode reads the IdSource where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the IdSource is on the wire
     */
    public boolean idSourcePresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCancelorCorrectV2ReturnBitfield2Present() && tradeCancelorCorrectV2ReturnBitfield2.tradeCancelorCorrectV2ReturnBitfield2IdSource());
    }

    /**
     * Returns whether the fields before the SecurityId put it on the wire.
     *
     * <p>Decode reads the SecurityId where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityId is on the wire
     */
    public boolean securityIdPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCancelorCorrectV2ReturnBitfield2Present() && tradeCancelorCorrectV2ReturnBitfield2.tradeCancelorCorrectV2ReturnBitfield2SecurityId());
    }

    /**
     * Returns whether the fields before the SecurityExchange put it on the wire.
     *
     * <p>Decode reads the SecurityExchange where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the SecurityExchange is on the wire
     */
    public boolean securityExchangePresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCancelorCorrectV2ReturnBitfield2Present() && tradeCancelorCorrectV2ReturnBitfield2.tradeCancelorCorrectV2ReturnBitfield2SecurityExchange());
    }

    /**
     * Returns whether the fields before the Capacity put it on the wire.
     *
     * <p>Decode reads the Capacity where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the Capacity is on the wire
     */
    public boolean capacityPresent() {
        return (numberOfReturnBitfields.value() >= 2L) && (tradeCancelorCorrectV2ReturnBitfield2Present() && tradeCancelorCorrectV2ReturnBitfield2.tradeCancelorCorrectV2ReturnBitfield2Capacity());
    }

    /**
     * Returns whether the fields before the CorrectedSize put it on the wire.
     *
     * <p>Decode reads the CorrectedSize where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the CorrectedSize is on the wire
     */
    public boolean correctedSizePresent() {
        return (numberOfReturnBitfields.value() >= 4L) && (tradeCancelorCorrectV2ReturnBitfield4Present() && tradeCancelorCorrectV2ReturnBitfield4.tradeCancelorCorrectV2ReturnBitfield4CorrectedSize());
    }

    /**
     * Returns whether the fields before the LastMkt put it on the wire.
     *
     * <p>Decode reads the LastMkt where this holds, and encode writes it where this holds, refusing a field holding a value this leaves off the wire, or none this puts on it.</p>
     *
     * @return true when the LastMkt is on the wire
     */
    public boolean lastMktPresent() {
        return (numberOfReturnBitfields.value() >= 7L) && (tradeCancelorCorrectV2ReturnBitfield7Present() && tradeCancelorCorrectV2ReturnBitfield7.tradeCancelorCorrectV2ReturnBitfield7LastMkt());
    }

    private boolean onWire(Field field) {
        return (field != tradeCancelorCorrectV2ReturnBitfield1 || tradeCancelorCorrectV2ReturnBitfield1Present()) && (field != tradeCancelorCorrectV2ReturnBitfield2 || tradeCancelorCorrectV2ReturnBitfield2Present()) && (field != tradeCancelorCorrectV2ReturnBitfield3 || tradeCancelorCorrectV2ReturnBitfield3Present()) && (field != tradeCancelorCorrectV2ReturnBitfield4 || tradeCancelorCorrectV2ReturnBitfield4Present()) && (field != tradeCancelorCorrectV2ReturnBitfield5 || tradeCancelorCorrectV2ReturnBitfield5Present()) && (field != tradeCancelorCorrectV2ReturnBitfield6 || tradeCancelorCorrectV2ReturnBitfield6Present()) && (field != tradeCancelorCorrectV2ReturnBitfield7 || tradeCancelorCorrectV2ReturnBitfield7Present()) && (field != tradeCancelorCorrectV2ReturnBitfield8 || tradeCancelorCorrectV2ReturnBitfield8Present()) && (field != tradeCancelorCorrectV2ReturnBitfield9 || tradeCancelorCorrectV2ReturnBitfield9Present()) && (field != tradeCancelorCorrectV2ReturnBitfield10 || tradeCancelorCorrectV2ReturnBitfield10Present()) && (field != tradeCancelorCorrectV2ReturnBitfield11 || tradeCancelorCorrectV2ReturnBitfield11Present()) && (field != tradeCancelorCorrectV2ReturnBitfield12 || tradeCancelorCorrectV2ReturnBitfield12Present()) && (field != tradeCancelorCorrectV2ReturnBitfield13 || tradeCancelorCorrectV2ReturnBitfield13Present()) && (field != tradeCancelorCorrectV2ReturnBitfield14 || tradeCancelorCorrectV2ReturnBitfield14Present()) && (field != tradeCancelorCorrectV2ReturnBitfield15 || tradeCancelorCorrectV2ReturnBitfield15Present()) && (field != tradeCancelorCorrectV2ReturnBitfield16 || tradeCancelorCorrectV2ReturnBitfield16Present()) && (field != tradeCancelorCorrectV2ReturnBitfield17 || tradeCancelorCorrectV2ReturnBitfield17Present()) && (field != tradeCancelorCorrectV2ReturnBitfield18 || tradeCancelorCorrectV2ReturnBitfield18Present()) && (field != tradeCancelorCorrectV2ReturnBitfield19 || tradeCancelorCorrectV2ReturnBitfield19Present()) && (field != symbol || symbolPresent()) && (field != currency || currencyPresent()) && (field != idSource || idSourcePresent()) && (field != securityId || securityIdPresent()) && (field != securityExchange || securityExchangePresent()) && (field != capacity || capacityPresent()) && (field != correctedSize || correctedSizePresent()) && (field != lastMkt || lastMktPresent());
    }

    @Override
    public Optional<Character> type() {
        return Optional.empty();
    }

    @Override
    public int byteLength() {
        return MINIMUM_BYTE_LENGTH + (tradeCancelorCorrectV2ReturnBitfield1Present() ? TradeCancelorCorrectV2ReturnBitfield1Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectV2ReturnBitfield2Present() ? TradeCancelorCorrectV2ReturnBitfield2Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectV2ReturnBitfield3Present() ? TradeCancelorCorrectV2ReturnBitfield3Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectV2ReturnBitfield4Present() ? TradeCancelorCorrectV2ReturnBitfield4Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectV2ReturnBitfield5Present() ? TradeCancelorCorrectV2ReturnBitfield5Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectV2ReturnBitfield6Present() ? TradeCancelorCorrectV2ReturnBitfield6Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectV2ReturnBitfield7Present() ? TradeCancelorCorrectV2ReturnBitfield7Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectV2ReturnBitfield8Present() ? TradeCancelorCorrectV2ReturnBitfield8Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectV2ReturnBitfield9Present() ? TradeCancelorCorrectV2ReturnBitfield9Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectV2ReturnBitfield10Present() ? TradeCancelorCorrectV2ReturnBitfield10Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectV2ReturnBitfield11Present() ? TradeCancelorCorrectV2ReturnBitfield11Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectV2ReturnBitfield12Present() ? TradeCancelorCorrectV2ReturnBitfield12Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectV2ReturnBitfield13Present() ? TradeCancelorCorrectV2ReturnBitfield13Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectV2ReturnBitfield14Present() ? TradeCancelorCorrectV2ReturnBitfield14Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectV2ReturnBitfield15Present() ? TradeCancelorCorrectV2ReturnBitfield15Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectV2ReturnBitfield16Present() ? TradeCancelorCorrectV2ReturnBitfield16Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectV2ReturnBitfield17Present() ? TradeCancelorCorrectV2ReturnBitfield17Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectV2ReturnBitfield18Present() ? TradeCancelorCorrectV2ReturnBitfield18Field.BYTE_LENGTH : 0) + (tradeCancelorCorrectV2ReturnBitfield19Present() ? TradeCancelorCorrectV2ReturnBitfield19Field.BYTE_LENGTH : 0) + (symbolPresent() ? SymbolField.BYTE_LENGTH : 0) + (currencyPresent() ? CurrencyField.BYTE_LENGTH : 0) + (idSourcePresent() ? IdSourceField.BYTE_LENGTH : 0) + (securityIdPresent() ? SecurityIdField.BYTE_LENGTH : 0) + (securityExchangePresent() ? SecurityExchangeField.BYTE_LENGTH : 0) + (capacityPresent() ? CapacityField.BYTE_LENGTH : 0) + (correctedSizePresent() ? CorrectedSizeField.BYTE_LENGTH : 0) + (lastMktPresent() ? LastMktField.BYTE_LENGTH : 0);
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
        if (tradeCancelorCorrectV2ReturnBitfield1Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectV2ReturnBitfield2Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectV2ReturnBitfield3Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectV2ReturnBitfield4Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectV2ReturnBitfield5Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectV2ReturnBitfield6Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectV2ReturnBitfield7Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectV2ReturnBitfield8Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectV2ReturnBitfield9Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectV2ReturnBitfield10Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectV2ReturnBitfield11Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectV2ReturnBitfield12Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectV2ReturnBitfield13Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectV2ReturnBitfield14Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectV2ReturnBitfield15Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectV2ReturnBitfield16Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectV2ReturnBitfield17Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectV2ReturnBitfield18Present()) {
            cursor += 1;
        }
        if (tradeCancelorCorrectV2ReturnBitfield19Present()) {
            cursor += 1;
        }
        if (symbolPresent()) {
            cursor += 8;
        }
        if (currencyPresent()) {
            cursor += 3;
        }
        if (idSourcePresent()) {
            cursor += 1;
        }
        if (securityIdPresent()) {
            cursor += 16;
        }
        if (securityExchangePresent()) {
            cursor += 4;
        }
        if (capacityPresent()) {
            cursor += 1;
        }
        if (correctedSizePresent()) {
            cursor += 4;
        }
        if (lastMktPresent()) {
            cursor += 4;
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
        if (!lastPxBinaryPrice.parse(data, cursor)) {
            return false;
        }
        cursor += LastPxBinaryPriceField.BYTE_LENGTH;
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
        if (tradeCancelorCorrectV2ReturnBitfield1Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield1Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield1.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield1Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectV2ReturnBitfield2Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield2Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield2.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield2Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectV2ReturnBitfield3Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield3Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield3.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield3Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectV2ReturnBitfield4Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield4Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield4.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield4Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectV2ReturnBitfield5Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield5Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield5.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield5Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectV2ReturnBitfield6Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield6Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield6.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield6Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectV2ReturnBitfield7Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield7Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield7.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield7Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectV2ReturnBitfield8Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield8Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield8.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield8Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectV2ReturnBitfield9Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield9Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield9.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield9Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectV2ReturnBitfield10Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield10Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield10.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield10Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectV2ReturnBitfield11Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield11Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield11.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield11Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectV2ReturnBitfield12Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield12Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield12.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield12Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectV2ReturnBitfield13Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield13Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield13.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield13Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectV2ReturnBitfield14Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield14Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield14.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield14Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectV2ReturnBitfield15Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield15Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield15.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield15Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectV2ReturnBitfield16Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield16Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield16.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield16Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectV2ReturnBitfield17Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield17Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield17.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield17Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectV2ReturnBitfield18Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield18Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield18.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield18Field.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (tradeCancelorCorrectV2ReturnBitfield19Present()) {
            if (end - cursor < TradeCancelorCorrectV2ReturnBitfield19Field.BYTE_LENGTH || !tradeCancelorCorrectV2ReturnBitfield19.parse(data, cursor)) {
                return false;
            }
            cursor += TradeCancelorCorrectV2ReturnBitfield19Field.BYTE_LENGTH;
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
        if (currencyPresent()) {
            if (end - cursor < CurrencyField.BYTE_LENGTH || !currency.parse(data, cursor)) {
                return false;
            }
            cursor += CurrencyField.BYTE_LENGTH;
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
        if (securityExchangePresent()) {
            if (end - cursor < SecurityExchangeField.BYTE_LENGTH || !securityExchange.parse(data, cursor)) {
                return false;
            }
            cursor += SecurityExchangeField.BYTE_LENGTH;
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
        if (correctedSizePresent()) {
            if (end - cursor < CorrectedSizeField.BYTE_LENGTH || !correctedSize.parse(data, cursor)) {
                return false;
            }
            cursor += CorrectedSizeField.BYTE_LENGTH;
        }
        if (end - cursor < 0) {
            return false;
        }
        if (lastMktPresent()) {
            if (end - cursor < LastMktField.BYTE_LENGTH || !lastMkt.parse(data, cursor)) {
                return false;
            }
            cursor += LastMktField.BYTE_LENGTH;
        }

        return cursor <= end;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, byteLength(), data.length);
        if (tradeCancelorCorrectV2ReturnBitfield1Present() != tradeCancelorCorrectV2ReturnBitfield1.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield1.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield1 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield1 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectV2ReturnBitfield2Present() != tradeCancelorCorrectV2ReturnBitfield2.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield2.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield2 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield2 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectV2ReturnBitfield3Present() != tradeCancelorCorrectV2ReturnBitfield3.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield3.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield3 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield3 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectV2ReturnBitfield4Present() != tradeCancelorCorrectV2ReturnBitfield4.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield4.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield4 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield4 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectV2ReturnBitfield5Present() != tradeCancelorCorrectV2ReturnBitfield5.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield5.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield5 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield5 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectV2ReturnBitfield6Present() != tradeCancelorCorrectV2ReturnBitfield6.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield6.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield6 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield6 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectV2ReturnBitfield7Present() != tradeCancelorCorrectV2ReturnBitfield7.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield7.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield7 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield7 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectV2ReturnBitfield8Present() != tradeCancelorCorrectV2ReturnBitfield8.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield8.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield8 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield8 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectV2ReturnBitfield9Present() != tradeCancelorCorrectV2ReturnBitfield9.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield9.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield9 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield9 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectV2ReturnBitfield10Present() != tradeCancelorCorrectV2ReturnBitfield10.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield10.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield10 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield10 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectV2ReturnBitfield11Present() != tradeCancelorCorrectV2ReturnBitfield11.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield11.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield11 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield11 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectV2ReturnBitfield12Present() != tradeCancelorCorrectV2ReturnBitfield12.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield12.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield12 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield12 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectV2ReturnBitfield13Present() != tradeCancelorCorrectV2ReturnBitfield13.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield13.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield13 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield13 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectV2ReturnBitfield14Present() != tradeCancelorCorrectV2ReturnBitfield14.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield14.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield14 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield14 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectV2ReturnBitfield15Present() != tradeCancelorCorrectV2ReturnBitfield15.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield15.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield15 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield15 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectV2ReturnBitfield16Present() != tradeCancelorCorrectV2ReturnBitfield16.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield16.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield16 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield16 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectV2ReturnBitfield17Present() != tradeCancelorCorrectV2ReturnBitfield17.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield17.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield17 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield17 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectV2ReturnBitfield18Present() != tradeCancelorCorrectV2ReturnBitfield18.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield18.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield18 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield18 holds no value, though the fields before it put it on the wire");
        }
        if (tradeCancelorCorrectV2ReturnBitfield19Present() != tradeCancelorCorrectV2ReturnBitfield19.hasValue()) {
            throw new IllegalStateException(tradeCancelorCorrectV2ReturnBitfield19.hasValue() ? "tradeCancelorCorrectV2ReturnBitfield19 holds a value the fields before it leave off the wire" : "tradeCancelorCorrectV2ReturnBitfield19 holds no value, though the fields before it put it on the wire");
        }
        if (symbolPresent() != symbol.hasValue()) {
            throw new IllegalStateException(symbol.hasValue() ? "symbol holds a value the fields before it leave off the wire" : "symbol holds no value, though the fields before it put it on the wire");
        }
        if (currencyPresent() != currency.hasValue()) {
            throw new IllegalStateException(currency.hasValue() ? "currency holds a value the fields before it leave off the wire" : "currency holds no value, though the fields before it put it on the wire");
        }
        if (idSourcePresent() != idSource.hasValue()) {
            throw new IllegalStateException(idSource.hasValue() ? "idSource holds a value the fields before it leave off the wire" : "idSource holds no value, though the fields before it put it on the wire");
        }
        if (securityIdPresent() != securityId.hasValue()) {
            throw new IllegalStateException(securityId.hasValue() ? "securityId holds a value the fields before it leave off the wire" : "securityId holds no value, though the fields before it put it on the wire");
        }
        if (securityExchangePresent() != securityExchange.hasValue()) {
            throw new IllegalStateException(securityExchange.hasValue() ? "securityExchange holds a value the fields before it leave off the wire" : "securityExchange holds no value, though the fields before it put it on the wire");
        }
        if (capacityPresent() != capacity.hasValue()) {
            throw new IllegalStateException(capacity.hasValue() ? "capacity holds a value the fields before it leave off the wire" : "capacity holds no value, though the fields before it put it on the wire");
        }
        if (correctedSizePresent() != correctedSize.hasValue()) {
            throw new IllegalStateException(correctedSize.hasValue() ? "correctedSize holds a value the fields before it leave off the wire" : "correctedSize holds no value, though the fields before it put it on the wire");
        }
        if (lastMktPresent() != lastMkt.hasValue()) {
            throw new IllegalStateException(lastMkt.hasValue() ? "lastMkt holds a value the fields before it leave off the wire" : "lastMkt holds no value, though the fields before it put it on the wire");
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
        cursor = lastPxBinaryPrice.encode(data, cursor);
        cursor = correctedPrice.encode(data, cursor);
        cursor = origTime.encode(data, cursor);
        if (buffer != null && buffer.length >= 83) {
            System.arraycopy(buffer, 82, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = numberOfReturnBitfields.encode(data, cursor);
        if (tradeCancelorCorrectV2ReturnBitfield1Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield1.encode(data, cursor);
        }
        if (tradeCancelorCorrectV2ReturnBitfield2Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield2.encode(data, cursor);
        }
        if (tradeCancelorCorrectV2ReturnBitfield3Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield3.encode(data, cursor);
        }
        if (tradeCancelorCorrectV2ReturnBitfield4Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield4.encode(data, cursor);
        }
        if (tradeCancelorCorrectV2ReturnBitfield5Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield5.encode(data, cursor);
        }
        if (tradeCancelorCorrectV2ReturnBitfield6Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield6.encode(data, cursor);
        }
        if (tradeCancelorCorrectV2ReturnBitfield7Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield7.encode(data, cursor);
        }
        if (tradeCancelorCorrectV2ReturnBitfield8Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield8.encode(data, cursor);
        }
        if (tradeCancelorCorrectV2ReturnBitfield9Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield9.encode(data, cursor);
        }
        if (tradeCancelorCorrectV2ReturnBitfield10Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield10.encode(data, cursor);
        }
        if (tradeCancelorCorrectV2ReturnBitfield11Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield11.encode(data, cursor);
        }
        if (tradeCancelorCorrectV2ReturnBitfield12Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield12.encode(data, cursor);
        }
        if (tradeCancelorCorrectV2ReturnBitfield13Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield13.encode(data, cursor);
        }
        if (tradeCancelorCorrectV2ReturnBitfield14Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield14.encode(data, cursor);
        }
        if (tradeCancelorCorrectV2ReturnBitfield15Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield15.encode(data, cursor);
        }
        if (tradeCancelorCorrectV2ReturnBitfield16Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield16.encode(data, cursor);
        }
        if (tradeCancelorCorrectV2ReturnBitfield17Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield17.encode(data, cursor);
        }
        if (tradeCancelorCorrectV2ReturnBitfield18Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield18.encode(data, cursor);
        }
        if (tradeCancelorCorrectV2ReturnBitfield19Present()) {
            cursor = tradeCancelorCorrectV2ReturnBitfield19.encode(data, cursor);
        }
        if (symbolPresent()) {
            cursor = symbol.encode(data, cursor);
        }
        if (currencyPresent()) {
            cursor = currency.encode(data, cursor);
        }
        if (idSourcePresent()) {
            cursor = idSource.encode(data, cursor);
        }
        if (securityIdPresent()) {
            cursor = securityId.encode(data, cursor);
        }
        if (securityExchangePresent()) {
            cursor = securityExchange.encode(data, cursor);
        }
        if (capacityPresent()) {
            cursor = capacity.encode(data, cursor);
        }
        if (correctedSizePresent()) {
            cursor = correctedSize.encode(data, cursor);
        }
        if (lastMktPresent()) {
            cursor = lastMkt.encode(data, cursor);
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
            case "LastPxBinaryPrice" -> Optional.of(lastPxBinaryPrice);
            case "CorrectedPrice" -> Optional.of(correctedPrice);
            case "OrigTime" -> Optional.of(origTime);
            case "NumberOfReturnBitfields" -> Optional.of(numberOfReturnBitfields);
            case "TradeCancelorCorrectV2ReturnBitfield1" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield1);
            case "TradeCancelorCorrectV2ReturnBitfield2" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield2);
            case "TradeCancelorCorrectV2ReturnBitfield3" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield3);
            case "TradeCancelorCorrectV2ReturnBitfield4" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield4);
            case "TradeCancelorCorrectV2ReturnBitfield5" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield5);
            case "TradeCancelorCorrectV2ReturnBitfield6" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield6);
            case "TradeCancelorCorrectV2ReturnBitfield7" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield7);
            case "TradeCancelorCorrectV2ReturnBitfield8" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield8);
            case "TradeCancelorCorrectV2ReturnBitfield9" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield9);
            case "TradeCancelorCorrectV2ReturnBitfield10" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield10);
            case "TradeCancelorCorrectV2ReturnBitfield11" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield11);
            case "TradeCancelorCorrectV2ReturnBitfield12" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield12);
            case "TradeCancelorCorrectV2ReturnBitfield13" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield13);
            case "TradeCancelorCorrectV2ReturnBitfield14" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield14);
            case "TradeCancelorCorrectV2ReturnBitfield15" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield15);
            case "TradeCancelorCorrectV2ReturnBitfield16" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield16);
            case "TradeCancelorCorrectV2ReturnBitfield17" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield17);
            case "TradeCancelorCorrectV2ReturnBitfield18" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield18);
            case "TradeCancelorCorrectV2ReturnBitfield19" -> Optional.of(tradeCancelorCorrectV2ReturnBitfield19);
            case "Symbol" -> Optional.of(symbol);
            case "Currency" -> Optional.of(currency);
            case "IdSource" -> Optional.of(idSource);
            case "SecurityId" -> Optional.of(securityId);
            case "SecurityExchange" -> Optional.of(securityExchange);
            case "Capacity" -> Optional.of(capacity);
            case "CorrectedSize" -> Optional.of(correctedSize);
            case "LastMkt" -> Optional.of(lastMkt);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof TradeCancelOrCorrectV2Message message)) {
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
        if (!(other instanceof TradeCancelOrCorrectV2Message message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
