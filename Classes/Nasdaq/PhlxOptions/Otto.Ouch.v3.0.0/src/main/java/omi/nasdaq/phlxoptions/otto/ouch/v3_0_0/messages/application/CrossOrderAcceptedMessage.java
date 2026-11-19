package omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.AuctionAllocPctField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.AuctionIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.AuctionTypeField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraCapacityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraClOrdIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraClearingAccountField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraCmtaField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraCustAcctField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraOccAccountField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraOrderIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraOrderTypeField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraPositionEffectMaskField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraPriceField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraQuantityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraStockLegMpidField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.ContraStockLegShortSaleField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.CrossTypeField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.DisclosureMaskField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.EffectiveTimeField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.FirmIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.InstrumentIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.IsoField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PriceProtectionField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryCapacityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryClOrdIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryClearingAccountField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryCmtaField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryCustAcctField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryOccAccountField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryOrderIdField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryPositionEffectMaskField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryPriceField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryQuantityField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryStockLegMpidField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.PrimaryStockLegShortSaleField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.SideField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.fields.TimestampField;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Field;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.Message;
import omi.nasdaq.phlxoptions.otto.ouch.v3_0_0.types.PrintOptions;

/**
 * Represents the CrossOrderAcceptedMessage message from the Otto protocol.
 *
 * <p>Acknowledges a valid New Cross Order. The Primary Side and Contra Side blocks of the document are carried as Primary and Contra prefixed fields.</p>
 */
public final class CrossOrderAcceptedMessage implements Message {

    /**
     * The character identifying this message on the wire.
     */
    public static final char MESSAGE_TYPE = 'x';

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 169;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Cross Order Accepted Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 168, 1 };

    /**
     * Nanoseconds since midnight
     */
    private final TimestampField timestampField = new TimestampField();

    /**
     * Firm ID (e.g. ABCD, 123A)
     */
    private final FirmIdField firmId = new FirmIdField();

    /**
     * Instrument ID, as specified by Option Directory notifications
     */
    private final InstrumentIdField instrumentId = new InstrumentIdField();

    /**
     * A=Auction, Q=QCC, C=CCC
     */
    private final CrossTypeField crossType = new CrossTypeField();

    /**
     * See Auction Type Field
     */
    private final AuctionTypeField auctionType = new AuctionTypeField();

    /**
     * Identifies the Auction being responded. 0 if this order is not an auction response.
     */
    private final AuctionIdField auctionId = new AuctionIdField();

    /**
     * Order Allocation percentage 0 &lt;= n &lt;= 40. 0 for Simple and Complex Solicitation.
     */
    private final AuctionAllocPctField auctionAllocPct = new AuctionAllocPctField();

    /**
     * B=Buy, S=Sell
     */
    private final SideField side = new SideField();

    /**
     * N=Not ISO, I=ISO
     */
    private final IsoField iso = new IsoField();

    /**
     * L=Local Market, N=National Market
     */
    private final PriceProtectionField priceProtection = new PriceProtectionField();

    /**
     * Agreed upon time for the stopped price. UTC time in milliseconds.
     */
    private final EffectiveTimeField effectiveTime = new EffectiveTimeField();

    /**
     * See Disclosure Mask Field (bits 0-5: Firm, Clearing Account, CMTA Account, Side, Price, Quantity; a set bit makes the attribute visible)
     */
    private final DisclosureMaskField disclosureMask = new DisclosureMaskField();

    /**
     * Day-unique Order identifier assigned by exchange
     */
    private final PrimaryOrderIdField primaryOrderId = new PrimaryOrderIdField();

    /**
     * See Client Order Id
     */
    private final PrimaryClOrdIdField primaryClOrdId = new PrimaryClOrdIdField();

    /**
     * CMTA
     */
    private final PrimaryCmtaField primaryCmta = new PrimaryCmtaField();

    /**
     * Sub-account/MM Identifier at the registered exchange; all four characters will be provided to OCC
     */
    private final PrimaryClearingAccountField primaryClearingAccount = new PrimaryClearingAccountField();

    /**
     * OCC # to use for clearing (give up)
     */
    private final PrimaryOccAccountField primaryOccAccount = new PrimaryOccAccountField();

    /**
     * Account on the customer system (pass-through)
     */
    private final PrimaryCustAcctField primaryCustAcct = new PrimaryCustAcctField();

    /**
     * Limit price. Primary Side of a Cross order cannot be Market.
     */
    private final PrimaryPriceField primaryPrice = new PrimaryPriceField();

    /**
     * Number of contracts
     */
    private final PrimaryQuantityField primaryQuantity = new PrimaryQuantityField();

    /**
     * See Order Capacity Field
     */
    private final PrimaryCapacityField primaryCapacity = new PrimaryCapacityField();

    /**
     * See Position Effect Mask Field
     */
    private final PrimaryPositionEffectMaskField primaryPositionEffectMask = new PrimaryPositionEffectMaskField();

    /**
     * N=Not Applicable, H=Sell Short, E=Sell Short Exempt. If this is a multi-leg order for a stock combo where stock leg is on the Sell side StockLegShortSale may be set to H or E. In all other cases value N should be used.
     */
    private final PrimaryStockLegShortSaleField primaryStockLegShortSale = new PrimaryStockLegShortSaleField();

    /**
     * Give-up for the stock leg
     */
    private final PrimaryStockLegMpidField primaryStockLegMpid = new PrimaryStockLegMpidField();

    /**
     * Day-unique Order identifier assigned by exchange
     */
    private final ContraOrderIdField contraOrderId = new ContraOrderIdField();

    /**
     * See Client Order Id
     */
    private final ContraClOrdIdField contraClOrdId = new ContraClOrdIdField();

    /**
     * CMTA
     */
    private final ContraCmtaField contraCmta = new ContraCmtaField();

    /**
     * Sub-account/MM Identifier at the registered exchange; all four characters will be provided to OCC
     */
    private final ContraClearingAccountField contraClearingAccount = new ContraClearingAccountField();

    /**
     * OCC # to use for clearing (give up)
     */
    private final ContraOccAccountField contraOccAccount = new ContraOccAccountField();

    /**
     * Account on the customer system (pass-through)
     */
    private final ContraCustAcctField contraCustAcct = new ContraCustAcctField();

    /**
     * L=Limit, M=Market
     */
    private final ContraOrderTypeField contraOrderType = new ContraOrderTypeField();

    /**
     * Limit price. Should be set to 0 if Order Type = M.
     */
    private final ContraPriceField contraPrice = new ContraPriceField();

    /**
     * Number of contracts
     */
    private final ContraQuantityField contraQuantity = new ContraQuantityField();

    /**
     * See Order Capacity Field
     */
    private final ContraCapacityField contraCapacity = new ContraCapacityField();

    /**
     * See Position Effect Mask Field
     */
    private final ContraPositionEffectMaskField contraPositionEffectMask = new ContraPositionEffectMaskField();

    /**
     * N=Not Applicable, H=Sell Short, E=Sell Short Exempt. If this is a multi-leg order for a stock combo where stock leg is on the Sell side StockLegShortSale may be set to H or E. In all other cases value N should be used.
     */
    private final ContraStockLegShortSaleField contraStockLegShortSale = new ContraStockLegShortSaleField();

    /**
     * Give-up for the stock leg
     */
    private final ContraStockLegMpidField contraStockLegMpid = new ContraStockLegMpidField();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = List.of(timestampField, firmId, instrumentId, crossType, auctionType, auctionId, auctionAllocPct, side, iso, priceProtection, effectiveTime, disclosureMask, primaryOrderId, primaryClOrdId, primaryCmta, primaryClearingAccount, primaryOccAccount, primaryCustAcct, primaryPrice, primaryQuantity, primaryCapacity, primaryPositionEffectMask, primaryStockLegShortSale, primaryStockLegMpid, contraOrderId, contraClOrdId, contraCmta, contraClearingAccount, contraOccAccount, contraCustAcct, contraOrderType, contraPrice, contraQuantity, contraCapacity, contraPositionEffectMask, contraStockLegShortSale, contraStockLegMpid);

    private byte[] buffer;

    private boolean decoded;

    /**
     * Nanoseconds since midnight
     *
     * @return the Timestamp field
     */
    public TimestampField timestampField() {
        return timestampField;
    }

    /**
     * Firm ID (e.g. ABCD, 123A)
     *
     * @return the FirmId field
     */
    public FirmIdField firmId() {
        return firmId;
    }

    /**
     * Instrument ID, as specified by Option Directory notifications
     *
     * @return the InstrumentId field
     */
    public InstrumentIdField instrumentId() {
        return instrumentId;
    }

    /**
     * A=Auction, Q=QCC, C=CCC
     *
     * @return the CrossType field
     */
    public CrossTypeField crossType() {
        return crossType;
    }

    /**
     * See Auction Type Field
     *
     * @return the AuctionType field
     */
    public AuctionTypeField auctionType() {
        return auctionType;
    }

    /**
     * Identifies the Auction being responded. 0 if this order is not an auction response.
     *
     * @return the AuctionId field
     */
    public AuctionIdField auctionId() {
        return auctionId;
    }

    /**
     * Order Allocation percentage 0 &lt;= n &lt;= 40. 0 for Simple and Complex Solicitation.
     *
     * @return the AuctionAllocPct field
     */
    public AuctionAllocPctField auctionAllocPct() {
        return auctionAllocPct;
    }

    /**
     * B=Buy, S=Sell
     *
     * @return the Side field
     */
    public SideField side() {
        return side;
    }

    /**
     * N=Not ISO, I=ISO
     *
     * @return the Iso field
     */
    public IsoField iso() {
        return iso;
    }

    /**
     * L=Local Market, N=National Market
     *
     * @return the PriceProtection field
     */
    public PriceProtectionField priceProtection() {
        return priceProtection;
    }

    /**
     * Agreed upon time for the stopped price. UTC time in milliseconds.
     *
     * @return the EffectiveTime field
     */
    public EffectiveTimeField effectiveTime() {
        return effectiveTime;
    }

    /**
     * See Disclosure Mask Field (bits 0-5: Firm, Clearing Account, CMTA Account, Side, Price, Quantity; a set bit makes the attribute visible)
     *
     * @return the DisclosureMask field
     */
    public DisclosureMaskField disclosureMask() {
        return disclosureMask;
    }

    /**
     * Day-unique Order identifier assigned by exchange
     *
     * @return the PrimaryOrderId field
     */
    public PrimaryOrderIdField primaryOrderId() {
        return primaryOrderId;
    }

    /**
     * See Client Order Id
     *
     * @return the PrimaryClOrdId field
     */
    public PrimaryClOrdIdField primaryClOrdId() {
        return primaryClOrdId;
    }

    /**
     * CMTA
     *
     * @return the PrimaryCmta field
     */
    public PrimaryCmtaField primaryCmta() {
        return primaryCmta;
    }

    /**
     * Sub-account/MM Identifier at the registered exchange; all four characters will be provided to OCC
     *
     * @return the PrimaryClearingAccount field
     */
    public PrimaryClearingAccountField primaryClearingAccount() {
        return primaryClearingAccount;
    }

    /**
     * OCC # to use for clearing (give up)
     *
     * @return the PrimaryOccAccount field
     */
    public PrimaryOccAccountField primaryOccAccount() {
        return primaryOccAccount;
    }

    /**
     * Account on the customer system (pass-through)
     *
     * @return the PrimaryCustAcct field
     */
    public PrimaryCustAcctField primaryCustAcct() {
        return primaryCustAcct;
    }

    /**
     * Limit price. Primary Side of a Cross order cannot be Market.
     *
     * @return the PrimaryPrice field
     */
    public PrimaryPriceField primaryPrice() {
        return primaryPrice;
    }

    /**
     * Number of contracts
     *
     * @return the PrimaryQuantity field
     */
    public PrimaryQuantityField primaryQuantity() {
        return primaryQuantity;
    }

    /**
     * See Order Capacity Field
     *
     * @return the PrimaryCapacity field
     */
    public PrimaryCapacityField primaryCapacity() {
        return primaryCapacity;
    }

    /**
     * See Position Effect Mask Field
     *
     * @return the PrimaryPositionEffectMask field
     */
    public PrimaryPositionEffectMaskField primaryPositionEffectMask() {
        return primaryPositionEffectMask;
    }

    /**
     * N=Not Applicable, H=Sell Short, E=Sell Short Exempt. If this is a multi-leg order for a stock combo where stock leg is on the Sell side StockLegShortSale may be set to H or E. In all other cases value N should be used.
     *
     * @return the PrimaryStockLegShortSale field
     */
    public PrimaryStockLegShortSaleField primaryStockLegShortSale() {
        return primaryStockLegShortSale;
    }

    /**
     * Give-up for the stock leg
     *
     * @return the PrimaryStockLegMpid field
     */
    public PrimaryStockLegMpidField primaryStockLegMpid() {
        return primaryStockLegMpid;
    }

    /**
     * Day-unique Order identifier assigned by exchange
     *
     * @return the ContraOrderId field
     */
    public ContraOrderIdField contraOrderId() {
        return contraOrderId;
    }

    /**
     * See Client Order Id
     *
     * @return the ContraClOrdId field
     */
    public ContraClOrdIdField contraClOrdId() {
        return contraClOrdId;
    }

    /**
     * CMTA
     *
     * @return the ContraCmta field
     */
    public ContraCmtaField contraCmta() {
        return contraCmta;
    }

    /**
     * Sub-account/MM Identifier at the registered exchange; all four characters will be provided to OCC
     *
     * @return the ContraClearingAccount field
     */
    public ContraClearingAccountField contraClearingAccount() {
        return contraClearingAccount;
    }

    /**
     * OCC # to use for clearing (give up)
     *
     * @return the ContraOccAccount field
     */
    public ContraOccAccountField contraOccAccount() {
        return contraOccAccount;
    }

    /**
     * Account on the customer system (pass-through)
     *
     * @return the ContraCustAcct field
     */
    public ContraCustAcctField contraCustAcct() {
        return contraCustAcct;
    }

    /**
     * L=Limit, M=Market
     *
     * @return the ContraOrderType field
     */
    public ContraOrderTypeField contraOrderType() {
        return contraOrderType;
    }

    /**
     * Limit price. Should be set to 0 if Order Type = M.
     *
     * @return the ContraPrice field
     */
    public ContraPriceField contraPrice() {
        return contraPrice;
    }

    /**
     * Number of contracts
     *
     * @return the ContraQuantity field
     */
    public ContraQuantityField contraQuantity() {
        return contraQuantity;
    }

    /**
     * See Order Capacity Field
     *
     * @return the ContraCapacity field
     */
    public ContraCapacityField contraCapacity() {
        return contraCapacity;
    }

    /**
     * See Position Effect Mask Field
     *
     * @return the ContraPositionEffectMask field
     */
    public ContraPositionEffectMaskField contraPositionEffectMask() {
        return contraPositionEffectMask;
    }

    /**
     * N=Not Applicable, H=Sell Short, E=Sell Short Exempt. If this is a multi-leg order for a stock combo where stock leg is on the Sell side StockLegShortSale may be set to H or E. In all other cases value N should be used.
     *
     * @return the ContraStockLegShortSale field
     */
    public ContraStockLegShortSaleField contraStockLegShortSale() {
        return contraStockLegShortSale;
    }

    /**
     * Give-up for the stock leg
     *
     * @return the ContraStockLegMpid field
     */
    public ContraStockLegMpidField contraStockLegMpid() {
        return contraStockLegMpid;
    }

    @Override
    public Optional<Character> type() {
        return Optional.of(MESSAGE_TYPE);
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
        return PADDING.clone();
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
        if (!timestampField.parse(data, cursor)) {
            return false;
        }
        cursor += TimestampField.BYTE_LENGTH;
        if (!firmId.parse(data, cursor)) {
            return false;
        }
        cursor += FirmIdField.BYTE_LENGTH;
        if (!instrumentId.parse(data, cursor)) {
            return false;
        }
        cursor += InstrumentIdField.BYTE_LENGTH;
        if (!crossType.parse(data, cursor)) {
            return false;
        }
        cursor += CrossTypeField.BYTE_LENGTH;
        if (!auctionType.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionTypeField.BYTE_LENGTH;
        if (!auctionId.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionIdField.BYTE_LENGTH;
        if (!auctionAllocPct.parse(data, cursor)) {
            return false;
        }
        cursor += AuctionAllocPctField.BYTE_LENGTH;
        if (!side.parse(data, cursor)) {
            return false;
        }
        cursor += SideField.BYTE_LENGTH;
        if (!iso.parse(data, cursor)) {
            return false;
        }
        cursor += IsoField.BYTE_LENGTH;
        if (!priceProtection.parse(data, cursor)) {
            return false;
        }
        cursor += PriceProtectionField.BYTE_LENGTH;
        if (!effectiveTime.parse(data, cursor)) {
            return false;
        }
        cursor += EffectiveTimeField.BYTE_LENGTH;
        if (!disclosureMask.parse(data, cursor)) {
            return false;
        }
        cursor += DisclosureMaskField.BYTE_LENGTH;
        if (!primaryOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryOrderIdField.BYTE_LENGTH;
        if (!primaryClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryClOrdIdField.BYTE_LENGTH;
        if (!primaryCmta.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryCmtaField.BYTE_LENGTH;
        if (!primaryClearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryClearingAccountField.BYTE_LENGTH;
        if (!primaryOccAccount.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryOccAccountField.BYTE_LENGTH;
        if (!primaryCustAcct.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryCustAcctField.BYTE_LENGTH;
        if (!primaryPrice.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryPriceField.BYTE_LENGTH;
        if (!primaryQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryQuantityField.BYTE_LENGTH;
        if (!primaryCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryCapacityField.BYTE_LENGTH;
        if (!primaryPositionEffectMask.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryPositionEffectMaskField.BYTE_LENGTH;
        if (!primaryStockLegShortSale.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryStockLegShortSaleField.BYTE_LENGTH;
        if (!primaryStockLegMpid.parse(data, cursor)) {
            return false;
        }
        cursor += PrimaryStockLegMpidField.BYTE_LENGTH;
        if (!contraOrderId.parse(data, cursor)) {
            return false;
        }
        cursor += ContraOrderIdField.BYTE_LENGTH;
        if (!contraClOrdId.parse(data, cursor)) {
            return false;
        }
        cursor += ContraClOrdIdField.BYTE_LENGTH;
        if (!contraCmta.parse(data, cursor)) {
            return false;
        }
        cursor += ContraCmtaField.BYTE_LENGTH;
        if (!contraClearingAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ContraClearingAccountField.BYTE_LENGTH;
        if (!contraOccAccount.parse(data, cursor)) {
            return false;
        }
        cursor += ContraOccAccountField.BYTE_LENGTH;
        if (!contraCustAcct.parse(data, cursor)) {
            return false;
        }
        cursor += ContraCustAcctField.BYTE_LENGTH;
        if (!contraOrderType.parse(data, cursor)) {
            return false;
        }
        cursor += ContraOrderTypeField.BYTE_LENGTH;
        if (!contraPrice.parse(data, cursor)) {
            return false;
        }
        cursor += ContraPriceField.BYTE_LENGTH;
        if (!contraQuantity.parse(data, cursor)) {
            return false;
        }
        cursor += ContraQuantityField.BYTE_LENGTH;
        if (!contraCapacity.parse(data, cursor)) {
            return false;
        }
        cursor += ContraCapacityField.BYTE_LENGTH;
        if (!contraPositionEffectMask.parse(data, cursor)) {
            return false;
        }
        cursor += ContraPositionEffectMaskField.BYTE_LENGTH;
        if (!contraStockLegShortSale.parse(data, cursor)) {
            return false;
        }
        cursor += ContraStockLegShortSaleField.BYTE_LENGTH;
        if (!contraStockLegMpid.parse(data, cursor)) {
            return false;
        }
        cursor += ContraStockLegMpidField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = timestampField.encode(data, cursor);
        cursor = firmId.encode(data, cursor);
        cursor = instrumentId.encode(data, cursor);
        cursor = crossType.encode(data, cursor);
        cursor = auctionType.encode(data, cursor);
        cursor = auctionId.encode(data, cursor);
        cursor = auctionAllocPct.encode(data, cursor);
        cursor = side.encode(data, cursor);
        cursor = iso.encode(data, cursor);
        cursor = priceProtection.encode(data, cursor);
        cursor = effectiveTime.encode(data, cursor);
        cursor = disclosureMask.encode(data, cursor);
        cursor = primaryOrderId.encode(data, cursor);
        cursor = primaryClOrdId.encode(data, cursor);
        cursor = primaryCmta.encode(data, cursor);
        cursor = primaryClearingAccount.encode(data, cursor);
        cursor = primaryOccAccount.encode(data, cursor);
        cursor = primaryCustAcct.encode(data, cursor);
        cursor = primaryPrice.encode(data, cursor);
        cursor = primaryQuantity.encode(data, cursor);
        cursor = primaryCapacity.encode(data, cursor);
        cursor = primaryPositionEffectMask.encode(data, cursor);
        cursor = primaryStockLegShortSale.encode(data, cursor);
        cursor = primaryStockLegMpid.encode(data, cursor);
        cursor = contraOrderId.encode(data, cursor);
        cursor = contraClOrdId.encode(data, cursor);
        cursor = contraCmta.encode(data, cursor);
        cursor = contraClearingAccount.encode(data, cursor);
        cursor = contraOccAccount.encode(data, cursor);
        cursor = contraCustAcct.encode(data, cursor);
        cursor = contraOrderType.encode(data, cursor);
        cursor = contraPrice.encode(data, cursor);
        cursor = contraQuantity.encode(data, cursor);
        cursor = contraCapacity.encode(data, cursor);
        cursor = contraPositionEffectMask.encode(data, cursor);
        cursor = contraStockLegShortSale.encode(data, cursor);
        cursor = contraStockLegMpid.encode(data, cursor);
        if (buffer != null && buffer.length >= 169) {
            System.arraycopy(buffer, 168, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
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
            case "Timestamp" -> Optional.of(timestampField);
            case "FirmId" -> Optional.of(firmId);
            case "InstrumentId" -> Optional.of(instrumentId);
            case "CrossType" -> Optional.of(crossType);
            case "AuctionType" -> Optional.of(auctionType);
            case "AuctionId" -> Optional.of(auctionId);
            case "AuctionAllocPct" -> Optional.of(auctionAllocPct);
            case "Side" -> Optional.of(side);
            case "Iso" -> Optional.of(iso);
            case "PriceProtection" -> Optional.of(priceProtection);
            case "EffectiveTime" -> Optional.of(effectiveTime);
            case "DisclosureMask" -> Optional.of(disclosureMask);
            case "PrimaryOrderId" -> Optional.of(primaryOrderId);
            case "PrimaryClOrdId" -> Optional.of(primaryClOrdId);
            case "PrimaryCmta" -> Optional.of(primaryCmta);
            case "PrimaryClearingAccount" -> Optional.of(primaryClearingAccount);
            case "PrimaryOccAccount" -> Optional.of(primaryOccAccount);
            case "PrimaryCustAcct" -> Optional.of(primaryCustAcct);
            case "PrimaryPrice" -> Optional.of(primaryPrice);
            case "PrimaryQuantity" -> Optional.of(primaryQuantity);
            case "PrimaryCapacity" -> Optional.of(primaryCapacity);
            case "PrimaryPositionEffectMask" -> Optional.of(primaryPositionEffectMask);
            case "PrimaryStockLegShortSale" -> Optional.of(primaryStockLegShortSale);
            case "PrimaryStockLegMpid" -> Optional.of(primaryStockLegMpid);
            case "ContraOrderId" -> Optional.of(contraOrderId);
            case "ContraClOrdId" -> Optional.of(contraClOrdId);
            case "ContraCmta" -> Optional.of(contraCmta);
            case "ContraClearingAccount" -> Optional.of(contraClearingAccount);
            case "ContraOccAccount" -> Optional.of(contraOccAccount);
            case "ContraCustAcct" -> Optional.of(contraCustAcct);
            case "ContraOrderType" -> Optional.of(contraOrderType);
            case "ContraPrice" -> Optional.of(contraPrice);
            case "ContraQuantity" -> Optional.of(contraQuantity);
            case "ContraCapacity" -> Optional.of(contraCapacity);
            case "ContraPositionEffectMask" -> Optional.of(contraPositionEffectMask);
            case "ContraStockLegShortSale" -> Optional.of(contraStockLegShortSale);
            case "ContraStockLegMpid" -> Optional.of(contraStockLegMpid);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof CrossOrderAcceptedMessage message)) {
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
        if (!(other instanceof CrossOrderAcceptedMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
