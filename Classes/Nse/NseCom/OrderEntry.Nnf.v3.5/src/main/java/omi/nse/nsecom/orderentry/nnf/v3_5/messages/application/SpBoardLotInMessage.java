package omi.nse.nsecom.orderentry.nnf.v3_5.messages.application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.AccountNumberField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.AdditionalOrderFlagsField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.AlgoIdField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.BookTypeField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.BranchIdField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.BrokerIdField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.BuySellField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.COrdFillerField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.CompetitorPeriodField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.DisclosedVolField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.DisclosedVolRemainingField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.EndAlphaField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.EntryDateTimeField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.Filler17Field;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.Filler18Field;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.Filler1Field;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.Filler9Field;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.FillerOptionsField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.FillerxField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.FilleryField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.GiveupFlagField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.GoodTillDateField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.LastActivityReferenceField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.LastModifiedField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.MinFillAonField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.MktReplayField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.ModCxlByField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.NnfFieldField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.OpBrokerIdField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.OpenCloseField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.OrderNumberField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.OrderTypeField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.PanField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.ParticipantTypeField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.PriceDiffField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.PriceField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.ProClientField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.ReasonCodeField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.SettlementPeriodField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.SettlorField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.SolicitorPeriodField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.StOrderFlagsField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.StartAlphaField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.TokenField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.TotalVolRemainingField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.TraderIdField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.TriggerPriceField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.VolumeField;
import omi.nse.nsecom.orderentry.nnf.v3_5.fields.VolumeFilledTodayField;
import omi.nse.nsecom.orderentry.nnf.v3_5.structs.ContractDesc;
import omi.nse.nsecom.orderentry.nnf.v3_5.structs.MsSpdLegInfoLeg2;
import omi.nse.nsecom.orderentry.nnf.v3_5.structs.MsSpdLegInfoLeg3;
import omi.nse.nsecom.orderentry.nnf.v3_5.types.Field;
import omi.nse.nsecom.orderentry.nnf.v3_5.types.Message;
import omi.nse.nsecom.orderentry.nnf.v3_5.types.PrintOptions;

/**
 * Represents the SpBoardLotInMessage message from the OrderEntry protocol.
 *
 * <p>2100 MS_SPD_OE_REQUEST 480 I, carried in the MS_SPD_OE_REQUEST structure</p>
 */
public final class SpBoardLotInMessage implements Message {

    /**
     * This message's fixed width on the wire.
     */
    public static final int BYTE_LENGTH = 440;

    /**
     * This message's declared name.
     */
    public static final String NAME = "Sp Board Lot In Message";

    /**
     * This message's declared padding runs, as {@code offset, length} pairs relative to the start of the message.
     *
     * <p>Only runs the specification declares as padding appear here. A gap between fields that is not listed is a layout defect, not padding.</p>
     */
    private static final int[] PADDING = { 180, 2, 214, 2, 224, 52 };

    /**
     * This is not used
     */
    private final ParticipantTypeField participantType = new ParticipantTypeField();

    /**
     * Filler1
     */
    private final Filler1Field filler1 = new Filler1Field();

    /**
     * This is not used
     */
    private final CompetitorPeriodField competitorPeriod = new CompetitorPeriodField();

    /**
     * This is not used
     */
    private final SolicitorPeriodField solicitorPeriod = new SolicitorPeriodField();

    /**
     * ModCxlBy1
     */
    private final ModCxlByField modCxlBy = new ModCxlByField();

    /**
     * Filler9
     */
    private final Filler9Field filler9 = new Filler9Field();

    /**
     * This is not used
     */
    private final ReasonCodeField reasonCode = new ReasonCodeField();

    /**
     * StartAlpha1
     */
    private final StartAlphaField startAlpha = new StartAlphaField();

    /**
     * EndAlpha1
     */
    private final EndAlphaField endAlpha = new EndAlphaField();

    /**
     * Token number of leg 1 contract of the spread combination
     */
    private final TokenField token = new TokenField();

    /**
     * OpBrokerId1
     */
    private final OpBrokerIdField opBrokerId = new OpBrokerIdField();

    /**
     * Fillerx1
     */
    private final FillerxField fillerx = new FillerxField();

    /**
     * FillerOptions1
     */
    private final FillerOptionsField fillerOptions = new FillerOptionsField();

    /**
     * Fillery1
     */
    private final FilleryField fillery = new FilleryField();

    /**
     * This field should be set to blank
     */
    private final OrderTypeField orderType = new OrderTypeField();

    /**
     * This field should be set to blank for the order entry request
     */
    private final OrderNumberField orderNumber = new OrderNumberField();

    /**
     * If the order is entered on behalf of a trader, the Trader Account Number is specified in this field
     */
    private final AccountNumberField accountNumber = new AccountNumberField();

    /**
     * This field should contain one of the following two book types. ‘1’ – Regular lot order ‘2’ – Special terms order
     */
    private final BookTypeField bookType = new BookTypeField();

    /**
     * BuySell1
     */
    private final BuySellField buySell = new BuySellField();

    /**
     * DisclosedVol1
     */
    private final DisclosedVolField disclosedVol = new DisclosedVolField();

    /**
     * DisclosedVolRemaining1
     */
    private final DisclosedVolRemainingField disclosedVolRemaining = new DisclosedVolRemainingField();

    /**
     * TotalVolRemaining1
     */
    private final TotalVolRemainingField totalVolRemaining = new TotalVolRemainingField();

    /**
     * This field should contain the quantity for which the order is placed
     */
    private final VolumeField volume = new VolumeField();

    /**
     * This is not used
     */
    private final VolumeFilledTodayField volumeFilledToday = new VolumeFilledTodayField();

    /**
     * For spread order this is not used
     */
    private final PriceField price = new PriceField();

    /**
     * This is not used
     */
    private final TriggerPriceField triggerPrice = new TriggerPriceField();

    /**
     * This is not used
     */
    private final GoodTillDateField goodTillDate = new GoodTillDateField();

    /**
     * This field contains the time when the order first entered the trading system
     */
    private final EntryDateTimeField entryDateTime = new EntryDateTimeField();

    /**
     * MinFillAon1
     */
    private final MinFillAonField minFillAon = new MinFillAonField();

    /**
     * LastModified1
     */
    private final LastModifiedField lastModified = new LastModifiedField();

    /**
     * St Order Flags
     */
    private final StOrderFlagsField stOrderFlags = new StOrderFlagsField();

    /**
     * This field should contain the Branch Number to which the broker belongs
     */
    private final BranchIdField branchId = new BranchIdField();

    /**
     * This field should contain the user ID
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
     * OpenClose1
     */
    private final OpenCloseField openClose = new OpenCloseField();

    /**
     * This field should contain the ID of the participants who are responsible for settling the trades through the custodians
     */
    private final SettlorField settlor = new SettlorField();

    /**
     * ProClient1
     */
    private final ProClientField proClient = new ProClientField();

    /**
     * This field should contain the number of days in a settlement cycle
     */
    private final SettlementPeriodField settlementPeriod = new SettlementPeriodField();

    /**
     * Refer to Additional_Order_Flags and Order Terms Attributes tables in Chapter 4 for the relevant description
     */
    private final AdditionalOrderFlagsField additionalOrderFlags = new AdditionalOrderFlagsField();

    /**
     * GiveupFlag1
     */
    private final GiveupFlagField giveupFlag = new GiveupFlagField();

    /**
     * Filler17
     */
    private final Filler17Field filler17 = new Filler17Field();

    /**
     * Filler18
     */
    private final Filler18Field filler18 = new Filler18Field();

    /**
     * NnfField
     */
    private final NnfFieldField nnfField = new NnfFieldField();

    /**
     * This field should be set to zero while sending message to the host
     */
    private final MktReplayField mktReplay = new MktReplayField();

    /**
     * This field shall contain the PAN (Permanent Account Number/PAN_EXEMPT) This field shall be mandatory for all orders (client/participant/PRO orders)
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
     * This is the difference between the prices at which leg2 and leg1 should trade and just like normal price this also should be multiple of tick size and within the price range
     */
    private final PriceDiffField priceDiff = new PriceDiffField();

    /**
     * CONTRACT_DESC
     */
    private final ContractDesc contractDesc = new ContractDesc();

    /**
     * MS_SPD_LEG_INFO Leg 2
     */
    private final MsSpdLegInfoLeg2 msSpdLegInfoLeg2 = new MsSpdLegInfoLeg2();

    /**
     * MS_SPD_LEG_INFO Leg 3
     */
    private final MsSpdLegInfoLeg3 msSpdLegInfoLeg3 = new MsSpdLegInfoLeg3();

    /**
     * This message's fields, in wire order.
     */
    private final List<Field> fields = Stream.of(List.<Field>of(participantType), List.<Field>of(filler1), List.<Field>of(competitorPeriod), List.<Field>of(solicitorPeriod), List.<Field>of(modCxlBy), List.<Field>of(filler9), List.<Field>of(reasonCode), List.<Field>of(startAlpha), List.<Field>of(endAlpha), List.<Field>of(token), contractDesc.fields(), List.<Field>of(opBrokerId), List.<Field>of(fillerx), List.<Field>of(fillerOptions), List.<Field>of(fillery), List.<Field>of(orderType), List.<Field>of(orderNumber), List.<Field>of(accountNumber), List.<Field>of(bookType), List.<Field>of(buySell), List.<Field>of(disclosedVol), List.<Field>of(disclosedVolRemaining), List.<Field>of(totalVolRemaining), List.<Field>of(volume), List.<Field>of(volumeFilledToday), List.<Field>of(price), List.<Field>of(triggerPrice), List.<Field>of(goodTillDate), List.<Field>of(entryDateTime), List.<Field>of(minFillAon), List.<Field>of(lastModified), List.<Field>of(stOrderFlags), List.<Field>of(branchId), List.<Field>of(traderId), List.<Field>of(brokerId), List.<Field>of(cOrdFiller), List.<Field>of(openClose), List.<Field>of(settlor), List.<Field>of(proClient), List.<Field>of(settlementPeriod), List.<Field>of(additionalOrderFlags), List.<Field>of(giveupFlag), List.<Field>of(filler17), List.<Field>of(filler18), List.<Field>of(nnfField), List.<Field>of(mktReplay), List.<Field>of(pan), List.<Field>of(algoId), List.<Field>of(lastActivityReference), List.<Field>of(priceDiff), msSpdLegInfoLeg2.fields(), msSpdLegInfoLeg3.fields()).flatMap(List::stream).toList();

    private byte[] buffer;

    private boolean decoded;

    /**
     * This is not used
     *
     * @return the ParticipantType field
     */
    public ParticipantTypeField participantType() {
        return participantType;
    }

    /**
     * Filler1
     *
     * @return the Filler1 field
     */
    public Filler1Field filler1() {
        return filler1;
    }

    /**
     * This is not used
     *
     * @return the CompetitorPeriod field
     */
    public CompetitorPeriodField competitorPeriod() {
        return competitorPeriod;
    }

    /**
     * This is not used
     *
     * @return the SolicitorPeriod field
     */
    public SolicitorPeriodField solicitorPeriod() {
        return solicitorPeriod;
    }

    /**
     * ModCxlBy1
     *
     * @return the ModCxlBy field
     */
    public ModCxlByField modCxlBy() {
        return modCxlBy;
    }

    /**
     * Filler9
     *
     * @return the Filler9 field
     */
    public Filler9Field filler9() {
        return filler9;
    }

    /**
     * This is not used
     *
     * @return the ReasonCode field
     */
    public ReasonCodeField reasonCode() {
        return reasonCode;
    }

    /**
     * StartAlpha1
     *
     * @return the StartAlpha field
     */
    public StartAlphaField startAlpha() {
        return startAlpha;
    }

    /**
     * EndAlpha1
     *
     * @return the EndAlpha field
     */
    public EndAlphaField endAlpha() {
        return endAlpha;
    }

    /**
     * Token number of leg 1 contract of the spread combination
     *
     * @return the Token field
     */
    public TokenField token() {
        return token;
    }

    /**
     * OpBrokerId1
     *
     * @return the OpBrokerId field
     */
    public OpBrokerIdField opBrokerId() {
        return opBrokerId;
    }

    /**
     * Fillerx1
     *
     * @return the Fillerx field
     */
    public FillerxField fillerx() {
        return fillerx;
    }

    /**
     * FillerOptions1
     *
     * @return the FillerOptions field
     */
    public FillerOptionsField fillerOptions() {
        return fillerOptions;
    }

    /**
     * Fillery1
     *
     * @return the Fillery field
     */
    public FilleryField fillery() {
        return fillery;
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
     * This field should be set to blank for the order entry request
     *
     * @return the OrderNumber field
     */
    public OrderNumberField orderNumber() {
        return orderNumber;
    }

    /**
     * If the order is entered on behalf of a trader, the Trader Account Number is specified in this field
     *
     * @return the AccountNumber field
     */
    public AccountNumberField accountNumber() {
        return accountNumber;
    }

    /**
     * This field should contain one of the following two book types. ‘1’ – Regular lot order ‘2’ – Special terms order
     *
     * @return the BookType field
     */
    public BookTypeField bookType() {
        return bookType;
    }

    /**
     * BuySell1
     *
     * @return the BuySell field
     */
    public BuySellField buySell() {
        return buySell;
    }

    /**
     * DisclosedVol1
     *
     * @return the DisclosedVol field
     */
    public DisclosedVolField disclosedVol() {
        return disclosedVol;
    }

    /**
     * DisclosedVolRemaining1
     *
     * @return the DisclosedVolRemaining field
     */
    public DisclosedVolRemainingField disclosedVolRemaining() {
        return disclosedVolRemaining;
    }

    /**
     * TotalVolRemaining1
     *
     * @return the TotalVolRemaining field
     */
    public TotalVolRemainingField totalVolRemaining() {
        return totalVolRemaining;
    }

    /**
     * This field should contain the quantity for which the order is placed
     *
     * @return the Volume field
     */
    public VolumeField volume() {
        return volume;
    }

    /**
     * This is not used
     *
     * @return the VolumeFilledToday field
     */
    public VolumeFilledTodayField volumeFilledToday() {
        return volumeFilledToday;
    }

    /**
     * For spread order this is not used
     *
     * @return the Price field
     */
    public PriceField price() {
        return price;
    }

    /**
     * This is not used
     *
     * @return the TriggerPrice field
     */
    public TriggerPriceField triggerPrice() {
        return triggerPrice;
    }

    /**
     * This is not used
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
     * MinFillAon1
     *
     * @return the MinFillAon field
     */
    public MinFillAonField minFillAon() {
        return minFillAon;
    }

    /**
     * LastModified1
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
     * This field should contain the Branch Number to which the broker belongs
     *
     * @return the BranchId field
     */
    public BranchIdField branchId() {
        return branchId;
    }

    /**
     * This field should contain the user ID
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
     * OpenClose1
     *
     * @return the OpenClose field
     */
    public OpenCloseField openClose() {
        return openClose;
    }

    /**
     * This field should contain the ID of the participants who are responsible for settling the trades through the custodians
     *
     * @return the Settlor field
     */
    public SettlorField settlor() {
        return settlor;
    }

    /**
     * ProClient1
     *
     * @return the ProClient field
     */
    public ProClientField proClient() {
        return proClient;
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
     * GiveupFlag1
     *
     * @return the GiveupFlag field
     */
    public GiveupFlagField giveupFlag() {
        return giveupFlag;
    }

    /**
     * Filler17
     *
     * @return the Filler17 field
     */
    public Filler17Field filler17() {
        return filler17;
    }

    /**
     * Filler18
     *
     * @return the Filler18 field
     */
    public Filler18Field filler18() {
        return filler18;
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
     * This field shall contain the PAN (Permanent Account Number/PAN_EXEMPT) This field shall be mandatory for all orders (client/participant/PRO orders)
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
     * This is the difference between the prices at which leg2 and leg1 should trade and just like normal price this also should be multiple of tick size and within the price range
     *
     * @return the PriceDiff field
     */
    public PriceDiffField priceDiff() {
        return priceDiff;
    }

    /**
     * CONTRACT_DESC
     *
     * @return the ContractDesc record
     */
    public ContractDesc contractDesc() {
        return contractDesc;
    }

    /**
     * MS_SPD_LEG_INFO Leg 2
     *
     * @return the MsSpdLegInfoLeg2 record
     */
    public MsSpdLegInfoLeg2 msSpdLegInfoLeg2() {
        return msSpdLegInfoLeg2;
    }

    /**
     * MS_SPD_LEG_INFO Leg 3
     *
     * @return the MsSpdLegInfoLeg3 record
     */
    public MsSpdLegInfoLeg3 msSpdLegInfoLeg3() {
        return msSpdLegInfoLeg3;
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
        if (!filler1.parse(data, cursor)) {
            return false;
        }
        cursor += Filler1Field.BYTE_LENGTH;
        if (!competitorPeriod.parse(data, cursor)) {
            return false;
        }
        cursor += CompetitorPeriodField.BYTE_LENGTH;
        if (!solicitorPeriod.parse(data, cursor)) {
            return false;
        }
        cursor += SolicitorPeriodField.BYTE_LENGTH;
        if (!modCxlBy.parse(data, cursor)) {
            return false;
        }
        cursor += ModCxlByField.BYTE_LENGTH;
        if (!filler9.parse(data, cursor)) {
            return false;
        }
        cursor += Filler9Field.BYTE_LENGTH;
        if (!reasonCode.parse(data, cursor)) {
            return false;
        }
        cursor += ReasonCodeField.BYTE_LENGTH;
        if (!startAlpha.parse(data, cursor)) {
            return false;
        }
        cursor += StartAlphaField.BYTE_LENGTH;
        if (!endAlpha.parse(data, cursor)) {
            return false;
        }
        cursor += EndAlphaField.BYTE_LENGTH;
        if (!token.parse(data, cursor)) {
            return false;
        }
        cursor += TokenField.BYTE_LENGTH;
        if (!contractDesc.parseFrom(data, cursor, end - 394)) {
            return false;
        }
        cursor += contractDesc.byteLength();
        if (!opBrokerId.parse(data, cursor)) {
            return false;
        }
        cursor += OpBrokerIdField.BYTE_LENGTH;
        if (!fillerx.parse(data, cursor)) {
            return false;
        }
        cursor += FillerxField.BYTE_LENGTH;
        if (!fillerOptions.parse(data, cursor)) {
            return false;
        }
        cursor += FillerOptionsField.BYTE_LENGTH;
        if (!fillery.parse(data, cursor)) {
            return false;
        }
        cursor += FilleryField.BYTE_LENGTH;
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
        if (!bookType.parse(data, cursor)) {
            return false;
        }
        cursor += BookTypeField.BYTE_LENGTH;
        if (!buySell.parse(data, cursor)) {
            return false;
        }
        cursor += BuySellField.BYTE_LENGTH;
        if (!disclosedVol.parse(data, cursor)) {
            return false;
        }
        cursor += DisclosedVolField.BYTE_LENGTH;
        if (!disclosedVolRemaining.parse(data, cursor)) {
            return false;
        }
        cursor += DisclosedVolRemainingField.BYTE_LENGTH;
        if (!totalVolRemaining.parse(data, cursor)) {
            return false;
        }
        cursor += TotalVolRemainingField.BYTE_LENGTH;
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
        if (!minFillAon.parse(data, cursor)) {
            return false;
        }
        cursor += MinFillAonField.BYTE_LENGTH;
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
        if (!proClient.parse(data, cursor)) {
            return false;
        }
        cursor += ProClientField.BYTE_LENGTH;
        if (!settlementPeriod.parse(data, cursor)) {
            return false;
        }
        cursor += SettlementPeriodField.BYTE_LENGTH;
        if (!additionalOrderFlags.parse(data, cursor)) {
            return false;
        }
        cursor += AdditionalOrderFlagsField.BYTE_LENGTH;
        if (!giveupFlag.parse(data, cursor)) {
            return false;
        }
        cursor += GiveupFlagField.BYTE_LENGTH;
        cursor += 2; // padding
        if (!filler17.parse(data, cursor)) {
            return false;
        }
        cursor += Filler17Field.BYTE_LENGTH;
        if (!filler18.parse(data, cursor)) {
            return false;
        }
        cursor += Filler18Field.BYTE_LENGTH;
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
        cursor += 52; // padding
        if (!priceDiff.parse(data, cursor)) {
            return false;
        }
        cursor += PriceDiffField.BYTE_LENGTH;
        if (!msSpdLegInfoLeg2.parseFrom(data, cursor, end - 80)) {
            return false;
        }
        cursor += msSpdLegInfoLeg2.byteLength();
        return msSpdLegInfoLeg3.parseFrom(data, cursor, end);
    }

    @Override
    public int encode(byte[] data, int offset) {
        Objects.checkFromIndexSize(offset, BYTE_LENGTH, data.length);
        int cursor = offset;
        cursor = participantType.encode(data, cursor);
        cursor = filler1.encode(data, cursor);
        cursor = competitorPeriod.encode(data, cursor);
        cursor = solicitorPeriod.encode(data, cursor);
        cursor = modCxlBy.encode(data, cursor);
        cursor = filler9.encode(data, cursor);
        cursor = reasonCode.encode(data, cursor);
        cursor = startAlpha.encode(data, cursor);
        cursor = endAlpha.encode(data, cursor);
        cursor = token.encode(data, cursor);
        cursor = contractDesc.encode(data, cursor);
        cursor = opBrokerId.encode(data, cursor);
        cursor = fillerx.encode(data, cursor);
        cursor = fillerOptions.encode(data, cursor);
        cursor = fillery.encode(data, cursor);
        cursor = orderType.encode(data, cursor);
        cursor = orderNumber.encode(data, cursor);
        cursor = accountNumber.encode(data, cursor);
        cursor = bookType.encode(data, cursor);
        cursor = buySell.encode(data, cursor);
        cursor = disclosedVol.encode(data, cursor);
        cursor = disclosedVolRemaining.encode(data, cursor);
        cursor = totalVolRemaining.encode(data, cursor);
        cursor = volume.encode(data, cursor);
        cursor = volumeFilledToday.encode(data, cursor);
        cursor = price.encode(data, cursor);
        cursor = triggerPrice.encode(data, cursor);
        cursor = goodTillDate.encode(data, cursor);
        cursor = entryDateTime.encode(data, cursor);
        cursor = minFillAon.encode(data, cursor);
        cursor = lastModified.encode(data, cursor);
        cursor = stOrderFlags.encode(data, cursor);
        cursor = branchId.encode(data, cursor);
        cursor = traderId.encode(data, cursor);
        cursor = brokerId.encode(data, cursor);
        cursor = cOrdFiller.encode(data, cursor);
        cursor = openClose.encode(data, cursor);
        cursor = settlor.encode(data, cursor);
        cursor = proClient.encode(data, cursor);
        cursor = settlementPeriod.encode(data, cursor);
        cursor = additionalOrderFlags.encode(data, cursor);
        cursor = giveupFlag.encode(data, cursor);
        if (buffer != null && buffer.length >= 182) {
            System.arraycopy(buffer, 180, data, cursor, 2); // padding
        } else {
            Arrays.fill(data, cursor, cursor + 2, (byte) 0); // padding
        }
        cursor += 2;
        cursor = filler17.encode(data, cursor);
        cursor = filler18.encode(data, cursor);
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
        cursor = priceDiff.encode(data, cursor);
        cursor = msSpdLegInfoLeg2.encode(data, cursor);
        cursor = msSpdLegInfoLeg3.encode(data, cursor);
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
        msSpdLegInfoLeg2.clear();
        msSpdLegInfoLeg3.clear();
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
            case "Filler1" -> Optional.of(filler1);
            case "CompetitorPeriod" -> Optional.of(competitorPeriod);
            case "SolicitorPeriod" -> Optional.of(solicitorPeriod);
            case "ModCxlBy" -> Optional.of(modCxlBy);
            case "Filler9" -> Optional.of(filler9);
            case "ReasonCode" -> Optional.of(reasonCode);
            case "StartAlpha" -> Optional.of(startAlpha);
            case "EndAlpha" -> Optional.of(endAlpha);
            case "Token" -> Optional.of(token);
            case "OpBrokerId" -> Optional.of(opBrokerId);
            case "Fillerx" -> Optional.of(fillerx);
            case "FillerOptions" -> Optional.of(fillerOptions);
            case "Fillery" -> Optional.of(fillery);
            case "OrderType" -> Optional.of(orderType);
            case "OrderNumber" -> Optional.of(orderNumber);
            case "AccountNumber" -> Optional.of(accountNumber);
            case "BookType" -> Optional.of(bookType);
            case "BuySell" -> Optional.of(buySell);
            case "DisclosedVol" -> Optional.of(disclosedVol);
            case "DisclosedVolRemaining" -> Optional.of(disclosedVolRemaining);
            case "TotalVolRemaining" -> Optional.of(totalVolRemaining);
            case "Volume" -> Optional.of(volume);
            case "VolumeFilledToday" -> Optional.of(volumeFilledToday);
            case "Price" -> Optional.of(price);
            case "TriggerPrice" -> Optional.of(triggerPrice);
            case "GoodTillDate" -> Optional.of(goodTillDate);
            case "EntryDateTime" -> Optional.of(entryDateTime);
            case "MinFillAon" -> Optional.of(minFillAon);
            case "LastModified" -> Optional.of(lastModified);
            case "StOrderFlags" -> Optional.of(stOrderFlags);
            case "BranchId" -> Optional.of(branchId);
            case "TraderId" -> Optional.of(traderId);
            case "BrokerId" -> Optional.of(brokerId);
            case "COrdFiller" -> Optional.of(cOrdFiller);
            case "OpenClose" -> Optional.of(openClose);
            case "Settlor" -> Optional.of(settlor);
            case "ProClient" -> Optional.of(proClient);
            case "SettlementPeriod" -> Optional.of(settlementPeriod);
            case "AdditionalOrderFlags" -> Optional.of(additionalOrderFlags);
            case "GiveupFlag" -> Optional.of(giveupFlag);
            case "Filler17" -> Optional.of(filler17);
            case "Filler18" -> Optional.of(filler18);
            case "NnfField" -> Optional.of(nnfField);
            case "MktReplay" -> Optional.of(mktReplay);
            case "Pan" -> Optional.of(pan);
            case "AlgoId" -> Optional.of(algoId);
            case "LastActivityReference" -> Optional.of(lastActivityReference);
            case "PriceDiff" -> Optional.of(priceDiff);
            default -> Optional.empty();
        };
    }

    @Override
    public List<Field> diffFields(Message other) {
        if (!(other instanceof SpBoardLotInMessage message)) {
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
        if (!(other instanceof SpBoardLotInMessage message)) {
            return false;
        }
        return fields.equals(message.fields);
    }

    @Override
    public int hashCode() {
        return fields.hashCode();
    }
}
