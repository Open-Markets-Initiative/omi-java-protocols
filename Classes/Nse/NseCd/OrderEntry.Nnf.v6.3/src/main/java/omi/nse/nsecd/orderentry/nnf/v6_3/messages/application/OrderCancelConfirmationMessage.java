package omi.nse.nsecd.orderentry.nnf.v6_3.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.AccountNumberField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.AdditionalOrderFlagsField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.AlgoIdField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BookTypeShortField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BranchIdField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BrokerIdField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.BuySellIndicatorField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.COrdFillerField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.CloseoutFlagField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.CompetitorPeriodField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.CounterPartyBrokerIdField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.DisclosedVolumeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.DisclosedVolumeRemainingField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.EntryDateTimeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.GoodTillDateField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.LastActivityReferenceField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.LastModifiedField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.MinimumFillAonVolumeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.MktReplayField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.ModifiedCancelledByField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.NnfFieldField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.OpenCloseField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.OrderNumberField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.OrderTypeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.PanField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.ParticipantTypeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.PriceField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.ProClientIndicatorField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.ReasonCodeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.ReferenceField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.SettlementPeriodField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.SettlorField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.SolicitorPeriodField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.StOrderFlagsField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.TokenNoField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.TotalVolumeRemainingField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.TraderIdField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.TriggerPriceField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.VolumeField;
import omi.nse.nsecd.orderentry.nnf.v6_3.fields.VolumeFilledTodayField;
import omi.nse.nsecd.orderentry.nnf.v6_3.structs.ContractDesc;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Field;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.Message;
import omi.nse.nsecd.orderentry.nnf.v6_3.types.PrintOptions;

/**
 * Represents the OrderCancelConfirmationMessage message from the OrderEntry protocol.
 *
 * <p>2075 MS_OE_REQUEST 316 I, carried in the MS_OE_REQUEST structure</p>
 */
public final class OrderCancelConfirmationMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 276;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Order Cancel Confirmation Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 1, 1, 7, 1, 10, 4, 51, 1, 52, 2, 55, 1, 179, 1, 214, 2, 224, 52 };

    /**
     * Not Applicable for Regular Lot Orders
     */
    private final ParticipantTypeField participantType = new ParticipantTypeField();

    /**
     * This field contains the default competitor period for auction
     */
    private final CompetitorPeriodField competitorPeriod = new CompetitorPeriodField();

    /**
     * This field contains the default solicitor period for auction
     */
    private final SolicitorPeriodField solicitorPeriod = new SolicitorPeriodField();

    /**
     * Modified/CancelledBy
     */
    private final ModifiedCancelledByField modifiedCancelledBy = new ModifiedCancelledByField();

    /**
     * This field contains the reason code for a particular order request rejection or order freeze
     */
    private final ReasonCodeField reasonCode = new ReasonCodeField();

    /**
     * This is the Token Number of the contract for which this order was originally placed
     */
    private final TokenNoField tokenNo = new TokenNoField();

    /**
     * CounterPartyBrokerId
     */
    private final CounterPartyBrokerIdField counterPartyBrokerId = new CounterPartyBrokerIdField();

    /**
     * This field should be set to blank
     */
    private final CloseoutFlagField closeoutFlag = new CloseoutFlagField();

    /**
     * This field should be set to blank
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * This field must be sent as blank for the order entry request
     */
    private final OrderNumberField orderNumber = new OrderNumberField();

    /**
     * If the order is entered on behalf of a trader, the Trader Account Number should be specified in this field
     */
    private final AccountNumberField accountNumber = new AccountNumberField();

    /**
     * This field should contain the type of order
     */
    private final BookTypeShortField bookTypeShort = new BookTypeShortField();

    /**
     * Buy/SellIndicator
     */
    private final BuySellIndicatorField buySellIndicator = new BuySellIndicatorField();

    /**
     * This field should contain the quantity that has to be disclosed to the market
     */
    private final DisclosedVolumeField disclosedVolume = new DisclosedVolumeField();

    /**
     * DisclosedVolumeRemaining
     */
    private final DisclosedVolumeRemainingField disclosedVolumeRemaining = new DisclosedVolumeRemainingField();

    /**
     * TotalVolumeRemaining
     */
    private final TotalVolumeRemainingField totalVolumeRemaining = new TotalVolumeRemainingField();

    /**
     * This field should contain the order quantity
     */
    private final VolumeField volume = new VolumeField();

    /**
     * VolumeFilledToday
     */
    private final VolumeFilledTodayField volumeFilledToday = new VolumeFilledTodayField();

    /**
     * This field should contain the price at which the order is placed
     */
    private final PriceField price = new PriceField();

    /**
     * This field is applicable only for a Stop Loss order and should be a multiple of the tick size
     */
    private final TriggerPriceField triggerPrice = new TriggerPriceField();

    /**
     * This field should contain the number of days for a GTD order
     */
    private final GoodTillDateField goodTillDate = new GoodTillDateField();

    /**
     * This field contains the time when the order first entered the trading system
     */
    private final EntryDateTimeField entryDateTime = new EntryDateTimeField();

    /**
     * MinimumFill / AONVolume
     */
    private final MinimumFillAonVolumeField minimumFillAonVolume = new MinimumFillAonVolumeField();

    /**
     * Value of the Last modified time stamp as received on last transaction response
     */
    private final LastModifiedField lastModified = new LastModifiedField();

    /**
     * St Order Flags
     */
    private final StOrderFlagsField stOrderFlags = new StOrderFlagsField();

    /**
     * This field should contain the Branch ID to which the broker belongs
     */
    private final BranchIdField branchId = new BranchIdField();

    /**
     * This field should contain the trader ID
     */
    private final TraderIdField traderId = new TraderIdField();

    /**
     * This field should contain the trading member ID
     */
    private final BrokerIdField brokerId = new BrokerIdField();

    /**
     * cOrdFiller
     */
    private final COrdFillerField cOrdFiller = new COrdFillerField();

    /**
     * Open/Close
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * This field should specify the ID of the participants who are responsible for settling the trades through the custodians
     */
    private final SettlorField settlor = new SettlorField();

    /**
     * Pro / ClientIndicator
     */
    private final ProClientIndicatorField proClientIndicator = new ProClientIndicatorField();

    /**
     * This field should contain the number of days in a settlement cycle
     */
    private final SettlementPeriodField settlementPeriod = new SettlementPeriodField();

    /**
     * Refer to Additional_Order_Flags and Order Terms Attributes tables in Chapter 4 for the relevant description
     */
    private final AdditionalOrderFlagsField additionalOrderFlags = new AdditionalOrderFlagsField();

    /**
     * The front-end may use this field at their discretion
     */
    private final ReferenceField reference = new ReferenceField();

    /**
     * NnfField
     */
    private final NnfFieldField nnfField = new NnfFieldField();

    /**
     * This field should be set to zero while sending message to the host
     */
    private final MktReplayField mktReplay = new MktReplayField();

    /**
     * This field shall contain the PAN (Permanent Account Number/PAN_EXEMPT)
     */
    private final PanField pan = new PanField();

    /**
     * For Algo order this field shall contain the Algo ID issued by the exchange
     */
    private final AlgoIdField algoId = new AlgoIdField();

    /**
     * In case of order entry response, this field will contain a unique value
     */
    private final LastActivityReferenceField lastActivityReference = new LastActivityReferenceField();

    /**
     * CONTRACT_DESC
     */
    private final ContractDesc contractDesc = new ContractDesc();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(participantType), List.<Field>of(competitorPeriod), List.<Field>of(solicitorPeriod), List.<Field>of(modifiedCancelledBy), List.<Field>of(reasonCode), List.<Field>of(tokenNo), contractDesc.fields(), List.<Field>of(counterPartyBrokerId), List.<Field>of(closeoutFlag), List.<Field>of(orderType), List.<Field>of(orderNumber), List.<Field>of(accountNumber), List.<Field>of(bookTypeShort), List.<Field>of(buySellIndicator), List.<Field>of(disclosedVolume), List.<Field>of(disclosedVolumeRemaining), List.<Field>of(totalVolumeRemaining), List.<Field>of(volume), List.<Field>of(volumeFilledToday), List.<Field>of(price), List.<Field>of(triggerPrice), List.<Field>of(goodTillDate), List.<Field>of(entryDateTime), List.<Field>of(minimumFillAonVolume), List.<Field>of(lastModified), List.<Field>of(stOrderFlags), List.<Field>of(branchId), List.<Field>of(traderId), List.<Field>of(brokerId), List.<Field>of(cOrdFiller), List.<Field>of(openClose), List.<Field>of(settlor), List.<Field>of(proClientIndicator), List.<Field>of(settlementPeriod), List.<Field>of(additionalOrderFlags), List.<Field>of(reference), List.<Field>of(nnfField), List.<Field>of(mktReplay), List.<Field>of(pan), List.<Field>of(algoId), List.<Field>of(lastActivityReference)).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * Not Applicable for Regular Lot Orders
     *
     * @return the ParticipantType field
     */
    public ParticipantTypeField participantType() {
        return participantType;
    }

    /**
     * This field contains the default competitor period for auction
     *
     * @return the CompetitorPeriod field
     */
    public CompetitorPeriodField competitorPeriod() {
        return competitorPeriod;
    }

    /**
     * This field contains the default solicitor period for auction
     *
     * @return the SolicitorPeriod field
     */
    public SolicitorPeriodField solicitorPeriod() {
        return solicitorPeriod;
    }

    /**
     * Modified/CancelledBy
     *
     * @return the ModifiedCancelledBy field
     */
    public ModifiedCancelledByField modifiedCancelledBy() {
        return modifiedCancelledBy;
    }

    /**
     * This field contains the reason code for a particular order request rejection or order freeze
     *
     * @return the ReasonCode field
     */
    public ReasonCodeField reasonCode() {
        return reasonCode;
    }

    /**
     * This is the Token Number of the contract for which this order was originally placed
     *
     * @return the TokenNo field
     */
    public TokenNoField tokenNo() {
        return tokenNo;
    }

    /**
     * CounterPartyBrokerId
     *
     * @return the CounterPartyBrokerId field
     */
    public CounterPartyBrokerIdField counterPartyBrokerId() {
        return counterPartyBrokerId;
    }

    /**
     * This field should be set to blank
     *
     * @return the CloseoutFlag field
     */
    public CloseoutFlagField closeoutFlag() {
        return closeoutFlag;
    }

    /**
     * This field should be set to blank
     *
     * @return the OrderType field
     */
    public OrderTypeField orderType() {
        return orderType;
    }

    /**
     * This field must be sent as blank for the order entry request
     *
     * @return the OrderNumber field
     */
    public OrderNumberField orderNumber() {
        return orderNumber;
    }

    /**
     * If the order is entered on behalf of a trader, the Trader Account Number should be specified in this field
     *
     * @return the AccountNumber field
     */
    public AccountNumberField accountNumber() {
        return accountNumber;
    }

    /**
     * This field should contain the type of order
     *
     * @return the BookTypeShort field
     */
    public BookTypeShortField bookTypeShort() {
        return bookTypeShort;
    }

    /**
     * Buy/SellIndicator
     *
     * @return the BuySellIndicator field
     */
    public BuySellIndicatorField buySellIndicator() {
        return buySellIndicator;
    }

    /**
     * This field should contain the quantity that has to be disclosed to the market
     *
     * @return the DisclosedVolume field
     */
    public DisclosedVolumeField disclosedVolume() {
        return disclosedVolume;
    }

    /**
     * DisclosedVolumeRemaining
     *
     * @return the DisclosedVolumeRemaining field
     */
    public DisclosedVolumeRemainingField disclosedVolumeRemaining() {
        return disclosedVolumeRemaining;
    }

    /**
     * TotalVolumeRemaining
     *
     * @return the TotalVolumeRemaining field
     */
    public TotalVolumeRemainingField totalVolumeRemaining() {
        return totalVolumeRemaining;
    }

    /**
     * This field should contain the order quantity
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * VolumeFilledToday
     *
     * @return the VolumeFilledToday field
     */
    public VolumeFilledTodayField volumeFilledToday() {
        return volumeFilledToday;
    }

    /**
     * This field should contain the price at which the order is placed
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * This field is applicable only for a Stop Loss order and should be a multiple of the tick size
     *
     * @return the TriggerPrice field
     */
    public TriggerPriceField triggerPrice() {
        return triggerPrice;
    }

    /**
     * This field should contain the number of days for a GTD order
     *
     * @return the GoodTillDate field
     */
    public GoodTillDateField goodTillDate() {
        return goodTillDate;
    }

    /**
     * This field contains the time when the order first entered the trading system
     *
     * @return the EntryDateTime field
     */
    public EntryDateTimeField entryDateTime() {
        return entryDateTime;
    }

    /**
     * MinimumFill / AONVolume
     *
     * @return the MinimumFillAonVolume field
     */
    public MinimumFillAonVolumeField minimumFillAonVolume() {
        return minimumFillAonVolume;
    }

    /**
     * Value of the Last modified time stamp as received on last transaction response
     *
     * @return the LastModified field
     */
    public LastModifiedField lastModified() {
        return lastModified;
    }

    /**
     * St Order Flags
     *
     * @return the StOrderFlags field
     */
    public StOrderFlagsField stOrderFlags() {
        return stOrderFlags;
    }

    /**
     * This field should contain the Branch ID to which the broker belongs
     *
     * @return the BranchId field
     */
    public BranchIdField branchId() {
        return branchId;
    }

    /**
     * This field should contain the trader ID
     *
     * @return the TraderId field
     */
    public TraderIdField traderId() {
        return traderId;
    }

    /**
     * This field should contain the trading member ID
     *
     * @return the BrokerId field
     */
    public BrokerIdField brokerId() {
        return brokerId;
    }

    /**
     * cOrdFiller
     *
     * @return the COrdFiller field
     */
    public COrdFillerField cOrdFiller() {
        return cOrdFiller;
    }

    /**
     * Open/Close
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * This field should specify the ID of the participants who are responsible for settling the trades through the custodians
     *
     * @return the Settlor field
     */
    public SettlorField settlor() {
        return settlor;
    }

    /**
     * Pro / ClientIndicator
     *
     * @return the ProClientIndicator field
     */
    public ProClientIndicatorField proClientIndicator() {
        return proClientIndicator;
    }

    /**
     * This field should contain the number of days in a settlement cycle
     *
     * @return the SettlementPeriod field
     */
    public SettlementPeriodField settlementPeriod() {
        return settlementPeriod;
    }

    /**
     * Refer to Additional_Order_Flags and Order Terms Attributes tables in Chapter 4 for the relevant description
     *
     * @return the AdditionalOrderFlags field
     */
    public AdditionalOrderFlagsField additionalOrderFlags() {
        return additionalOrderFlags;
    }

    /**
     * The front-end may use this field at their discretion
     *
     * @return the Reference field
     */
    public ReferenceField reference() {
        return reference;
    }

    /**
     * NnfField
     *
     * @return the NnfField field
     */
    public NnfFieldField nnfField() {
        return nnfField;
    }

    /**
     * This field should be set to zero while sending message to the host
     *
     * @return the MktReplay field
     */
    public MktReplayField mktReplay() {
        return mktReplay;
    }

    /**
     * This field shall contain the PAN (Permanent Account Number/PAN_EXEMPT)
     *
     * @return the Pan field
     */
    public PanField pan() {
        return pan;
    }

    /**
     * For Algo order this field shall contain the Algo ID issued by the exchange
     *
     * @return the AlgoId field
     */
    public AlgoIdField algoId() {
        return algoId;
    }

    /**
     * In case of order entry response, this field will contain a unique value
     *
     * @return the LastActivityReference field
     */
    public LastActivityReferenceField lastActivityReference() {
        return lastActivityReference;
    }

    /**
     * CONTRACT_DESC
     *
     * @return the ContractDesc record
     */
    public ContractDesc contractDesc() {
        return contractDesc;
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
        if (!participantType.parse(data, cursor)) {
            return false;
        }
        cursor += ParticipantTypeField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!competitorPeriod.parse(data, cursor)) {
            return false;
        }
        cursor += CompetitorPeriodField.BYTE_LENGTH;
        if (!solicitorPeriod.parse(data, cursor)) {
            return false;
        }
        cursor += SolicitorPeriodField.BYTE_LENGTH;
        if (!modifiedCancelledBy.parse(data, cursor)) {
            return false;
        }
        cursor += ModifiedCancelledByField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!reasonCode.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonCodeField.BYTE_LENGTH;
        cursor += 4; // padding
        if (!tokenNo.parse(data, cursor)) {
            return false;
        }
        cursor += TokenNoField.BYTE_LENGTH;
        if (!contractDesc.parseFrom(data, cursor, end - 230)) {
            return false;
        }
        cursor += contractDesc.byteLength();
        if (!counterPartyBrokerId.parse(data, cursor)) {
            return false;
        }
        cursor += CounterPartyBrokerIdField.BYTE_LENGTH;
        cursor += 3; // padding
        if (!closeoutFlag.parse(data, cursor)) {
            return false;
        }
        cursor += CloseoutFlagField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!orderType.parse(data, cursor)) {
            return false;
        }
        cursor += OrderTypeField.BYTE_LENGTH;
        if (!orderNumber.parse(data, cursor)) {
            return false;
        }
        cursor += OrderNumberField.BYTE_LENGTH;
        if (!accountNumber.parse(data, cursor)) {
            return false;
        }
        cursor += AccountNumberField.BYTE_LENGTH;
        if (!bookTypeShort.parse(data, cursor)) {
            return false;
        }
        cursor += BookTypeShortField.BYTE_LENGTH;
        if (!buySellIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += BuySellIndicatorField.BYTE_LENGTH;
        if (!disclosedVolume.parse(data, cursor)) {
            return false;
        }
        cursor += DisclosedVolumeField.BYTE_LENGTH;
        if (!disclosedVolumeRemaining.parse(data, cursor)) {
            return false;
        }
        cursor += DisclosedVolumeRemainingField.BYTE_LENGTH;
        if (!totalVolumeRemaining.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolumeRemainingField.BYTE_LENGTH;
        if (!volume.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeField.BYTE_LENGTH;
        if (!volumeFilledToday.parse(data, cursor)) {
            return false;
        }
        cursor += VolumeFilledTodayField.BYTE_LENGTH;
        if (!price.parse(data, cursor)) {
            return false;
        }
        cursor += PriceField.BYTE_LENGTH;
        if (!triggerPrice.parse(data, cursor)) {
            return false;
        }
        cursor += TriggerPriceField.BYTE_LENGTH;
        if (!goodTillDate.parse(data, cursor)) {
            return false;
        }
        cursor += GoodTillDateField.BYTE_LENGTH;
        if (!entryDateTime.parse(data, cursor)) {
            return false;
        }
        cursor += EntryDateTimeField.BYTE_LENGTH;
        if (!minimumFillAonVolume.parse(data, cursor)) {
            return false;
        }
        cursor += MinimumFillAonVolumeField.BYTE_LENGTH;
        if (!lastModified.parse(data, cursor)) {
            return false;
        }
        cursor += LastModifiedField.BYTE_LENGTH;
        if (!stOrderFlags.parse(data, cursor)) {
            return false;
        }
        cursor += StOrderFlagsField.BYTE_LENGTH;
        if (!branchId.parse(data, cursor)) {
            return false;
        }
        cursor += BranchIdField.BYTE_LENGTH;
        if (!traderId.parse(data, cursor)) {
            return false;
        }
        cursor += TraderIdField.BYTE_LENGTH;
        if (!brokerId.parse(data, cursor)) {
            return false;
        }
        cursor += BrokerIdField.BYTE_LENGTH;
        if (!cOrdFiller.parse(data, cursor)) {
            return false;
        }
        cursor += COrdFillerField.BYTE_LENGTH;
        if (!openClose.parse(data, cursor)) {
            return false;
        }
        cursor += OpenCloseField.BYTE_LENGTH;
        if (!settlor.parse(data, cursor)) {
            return false;
        }
        cursor += SettlorField.BYTE_LENGTH;
        if (!proClientIndicator.parse(data, cursor)) {
            return false;
        }
        cursor += ProClientIndicatorField.BYTE_LENGTH;
        if (!settlementPeriod.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPeriodField.BYTE_LENGTH;
        if (!additionalOrderFlags.parse(data, cursor)) {
            return false;
        }
        cursor += AdditionalOrderFlagsField.BYTE_LENGTH;
        cursor += 1; // padding
        if (!reference.parse(data, cursor)) {
            return false;
        }
        cursor += ReferenceField.BYTE_LENGTH;
        if (!nnfField.parse(data, cursor)) {
            return false;
        }
        cursor += NnfFieldField.BYTE_LENGTH;
        if (!mktReplay.parse(data, cursor)) {
            return false;
        }
        cursor += MktReplayField.BYTE_LENGTH;
        if (!pan.parse(data, cursor)) {
            return false;
        }
        cursor += PanField.BYTE_LENGTH;
        if (!algoId.parse(data, cursor)) {
            return false;
        }
        cursor += AlgoIdField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!lastActivityReference.parse(data, cursor)) {
            return false;
        }
        cursor += LastActivityReferenceField.BYTE_LENGTH;

        return true;
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = participantType.encode(data, cursor);
        if (buffer != null && buffer.length >= 2) {
            System.arraycopy(buffer, 1, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = competitorPeriod.encode(data, cursor);
        cursor = solicitorPeriod.encode(data, cursor);
        cursor = modifiedCancelledBy.encode(data, cursor);
        if (buffer != null && buffer.length >= 8) {
            System.arraycopy(buffer, 7, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = reasonCode.encode(data, cursor);
        if (buffer != null && buffer.length >= 14) {
            System.arraycopy(buffer, 10, data, cursor, 4); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 4, (byte) 0); // padding
        }
        cursor += 4;
        cursor = tokenNo.encode(data, cursor);
        cursor = contractDesc.encode(data, cursor);
        cursor = counterPartyBrokerId.encode(data, cursor);
        if (buffer != null && buffer.length >= 54) {
            System.arraycopy(buffer, 51, data, cursor, 3); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 3, (byte) 0); // padding
        }
        cursor += 3;
        cursor = closeoutFlag.encode(data, cursor);
        if (buffer != null && buffer.length >= 56) {
            System.arraycopy(buffer, 55, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = orderType.encode(data, cursor);
        cursor = orderNumber.encode(data, cursor);
        cursor = accountNumber.encode(data, cursor);
        cursor = bookTypeShort.encode(data, cursor);
        cursor = buySellIndicator.encode(data, cursor);
        cursor = disclosedVolume.encode(data, cursor);
        cursor = disclosedVolumeRemaining.encode(data, cursor);
        cursor = totalVolumeRemaining.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = volumeFilledToday.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = triggerPrice.encode(data, cursor);
        cursor = goodTillDate.encode(data, cursor);
        cursor = entryDateTime.encode(data, cursor);
        cursor = minimumFillAonVolume.encode(data, cursor);
        cursor = lastModified.encode(data, cursor);
        cursor = stOrderFlags.encode(data, cursor);
        cursor = branchId.encode(data, cursor);
        cursor = traderId.encode(data, cursor);
        cursor = brokerId.encode(data, cursor);
        cursor = cOrdFiller.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = settlor.encode(data, cursor);
        cursor = proClientIndicator.encode(data, cursor);
        cursor = settlementPeriod.encode(data, cursor);
        cursor = additionalOrderFlags.encode(data, cursor);
        if (buffer != null && buffer.length >= 180) {
            System.arraycopy(buffer, 179, data, cursor, 1); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 1, (byte) 0); // padding
        }
        cursor += 1;
        cursor = reference.encode(data, cursor);
        cursor = nnfField.encode(data, cursor);
        cursor = mktReplay.encode(data, cursor);
        cursor = pan.encode(data, cursor);
        cursor = algoId.encode(data, cursor);
        if (buffer != null && buffer.length >= 216) {
            System.arraycopy(buffer, 214, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = lastActivityReference.encode(data, cursor);
        if (buffer != null && buffer.length >= 276) {
            System.arraycopy(buffer, 224, data, cursor, 52); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 52, (byte) 0); // padding
        }
        cursor += 52;
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
        contractDesc.clear();
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
            case "ParticipantType" -> Optional.of(participantType);
            case "CompetitorPeriod" -> Optional.of(competitorPeriod);
            case "SolicitorPeriod" -> Optional.of(solicitorPeriod);
            case "ModifiedCancelledBy" -> Optional.of(modifiedCancelledBy);
            case "ReasonCode" -> Optional.of(reasonCode);
            case "TokenNo" -> Optional.of(tokenNo);
            case "CounterPartyBrokerId" -> Optional.of(counterPartyBrokerId);
            case "CloseoutFlag" -> Optional.of(closeoutFlag);
            case "OrderType" -> Optional.of(orderType);
            case "OrderNumber" -> Optional.of(orderNumber);
            case "AccountNumber" -> Optional.of(accountNumber);
            case "BookTypeShort" -> Optional.of(bookTypeShort);
            case "BuySellIndicator" -> Optional.of(buySellIndicator);
            case "DisclosedVolume" -> Optional.of(disclosedVolume);
            case "DisclosedVolumeRemaining" -> Optional.of(disclosedVolumeRemaining);
            case "TotalVolumeRemaining" -> Optional.of(totalVolumeRemaining);
            case "Volume" -> Optional.of(volume);
            case "VolumeFilledToday" -> Optional.of(volumeFilledToday);
            case "Price" -> Optional.of(price);
            case "TriggerPrice" -> Optional.of(triggerPrice);
            case "GoodTillDate" -> Optional.of(goodTillDate);
            case "EntryDateTime" -> Optional.of(entryDateTime);
            case "MinimumFillAonVolume" -> Optional.of(minimumFillAonVolume);
            case "LastModified" -> Optional.of(lastModified);
            case "StOrderFlags" -> Optional.of(stOrderFlags);
            case "BranchId" -> Optional.of(branchId);
            case "TraderId" -> Optional.of(traderId);
            case "BrokerId" -> Optional.of(brokerId);
            case "COrdFiller" -> Optional.of(cOrdFiller);
            case "OpenClose" -> Optional.of(openClose);
            case "Settlor" -> Optional.of(settlor);
            case "ProClientIndicator" -> Optional.of(proClientIndicator);
            case "SettlementPeriod" -> Optional.of(settlementPeriod);
            case "AdditionalOrderFlags" -> Optional.of(additionalOrderFlags);
            case "Reference" -> Optional.of(reference);
            case "NnfField" -> Optional.of(nnfField);
            case "MktReplay" -> Optional.of(mktReplay);
            case "Pan" -> Optional.of(pan);
            case "AlgoId" -> Optional.of(algoId);
            case "LastActivityReference" -> Optional.of(lastActivityReference);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof OrderCancelConfirmationMessage message)) {
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
        if (!(other instanceof OrderCancelConfirmationMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
