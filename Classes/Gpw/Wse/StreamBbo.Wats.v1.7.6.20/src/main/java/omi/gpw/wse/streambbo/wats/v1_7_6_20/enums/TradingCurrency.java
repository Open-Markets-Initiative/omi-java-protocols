package omi.gpw.wse.streambbo.wats.v1_7_6_20.enums;

import java.util.Optional;

/**
 * Trading currency
 *
 * <p>Backed by int. Values correspond to the wire integer encoding.</p>
 */
public enum TradingCurrency {

    /**
     * Lek
     */
    ALL(8, "Lek"),

    /**
     * Algerian Dinar
     */
    DZD(12, "Algerian Dinar"),

    /**
     * Argentine Peso
     */
    ARS(32, "Argentine Peso"),

    /**
     * Australian Dollar
     */
    AUD(36, "Australian Dollar"),

    /**
     * Bahamian Dollar
     */
    BSD(44, "Bahamian Dollar"),

    /**
     * Bahraini Dinar
     */
    BHD(48, "Bahraini Dinar"),

    /**
     * Taka
     */
    BDT(50, "Taka"),

    /**
     * Armenian Dram
     */
    AMD(51, "Armenian Dram"),

    /**
     * Barbados Dollar
     */
    BBD(52, "Barbados Dollar"),

    /**
     * Bermudian Dollar
     */
    BMD(60, "Bermudian Dollar"),

    /**
     * Ngultrum
     */
    BTN(64, "Ngultrum"),

    /**
     * Boliviano
     */
    BOB(68, "Boliviano"),

    /**
     * Pula
     */
    BWP(72, "Pula"),

    /**
     * Belize Dollar
     */
    BZD(84, "Belize Dollar"),

    /**
     * Solomon Islands Dollar
     */
    SBD(90, "Solomon Islands Dollar"),

    /**
     * Brunei Dollar
     */
    BND(96, "Brunei Dollar"),

    /**
     * Kyat
     */
    MMK(104, "Kyat"),

    /**
     * Burundi Franc
     */
    BIF(108, "Burundi Franc"),

    /**
     * Riel
     */
    KHR(116, "Riel"),

    /**
     * Canadian Dollar
     */
    CAD(124, "Canadian Dollar"),

    /**
     * Cabo Verde Escudo
     */
    CVE(132, "Cabo Verde Escudo"),

    /**
     * Cayman Islands Dollar
     */
    KYD(136, "Cayman Islands Dollar"),

    /**
     * Sri Lanka Rupee
     */
    LKR(144, "Sri Lanka Rupee"),

    /**
     * Chilean Peso
     */
    CLP(152, "Chilean Peso"),

    /**
     * Yuan Renminbi
     */
    CNY(156, "Yuan Renminbi"),

    /**
     * Colombian Peso
     */
    COP(170, "Colombian Peso"),

    /**
     * Comorian Franc
     */
    KMF(174, "Comorian Franc"),

    /**
     * Costa Rican Colon
     */
    CRC(188, "Costa Rican Colon"),

    /**
     * Kuna
     */
    HRK(191, "Kuna"),

    /**
     * Cuban Peso
     */
    CUP(192, "Cuban Peso"),

    /**
     * Czech Koruna
     */
    CZK(203, "Czech Koruna"),

    /**
     * Danish Krone
     */
    DKK(208, "Danish Krone"),

    /**
     * Dominican Peso
     */
    DOP(214, "Dominican Peso"),

    /**
     * El Salvador Colon
     */
    SVC(222, "El Salvador Colon"),

    /**
     * Ethiopian Birr
     */
    ETB(230, "Ethiopian Birr"),

    /**
     * Nakfa
     */
    ERN(232, "Nakfa"),

    /**
     * Falkland Islands Pound
     */
    FKP(238, "Falkland Islands Pound"),

    /**
     * Fiji Dollar
     */
    FJD(242, "Fiji Dollar"),

    /**
     * Djibouti Franc
     */
    DJF(262, "Djibouti Franc"),

    /**
     * Dalasi
     */
    GMD(270, "Dalasi"),

    /**
     * Gibraltar Pound
     */
    GIP(292, "Gibraltar Pound"),

    /**
     * Quetzal
     */
    GTQ(320, "Quetzal"),

    /**
     * Guinean Franc
     */
    GNF(324, "Guinean Franc"),

    /**
     * Guyana Dollar
     */
    GYD(328, "Guyana Dollar"),

    /**
     * Gourde
     */
    HTG(332, "Gourde"),

    /**
     * Lempira
     */
    HNL(340, "Lempira"),

    /**
     * Hong Kong Dollar
     */
    HKD(344, "Hong Kong Dollar"),

    /**
     * Forint
     */
    HUF(348, "Forint"),

    /**
     * Iceland Krona
     */
    ISK(352, "Iceland Krona"),

    /**
     * Indian Rupee
     */
    INR(356, "Indian Rupee"),

    /**
     * Rupiah
     */
    IDR(360, "Rupiah"),

    /**
     * Iranian Rial
     */
    IRR(364, "Iranian Rial"),

    /**
     * Iraqi Dinar
     */
    IQD(368, "Iraqi Dinar"),

    /**
     * New Israeli Sheqel
     */
    ILS(376, "New Israeli Sheqel"),

    /**
     * Jamaican Dollar
     */
    JMD(388, "Jamaican Dollar"),

    /**
     * Yen
     */
    JPY(392, "Yen"),

    /**
     * Tenge
     */
    KZT(398, "Tenge"),

    /**
     * Jordanian Dinar
     */
    JOD(400, "Jordanian Dinar"),

    /**
     * Kenyan Shilling
     */
    KES(404, "Kenyan Shilling"),

    /**
     * North Korean Won
     */
    KPW(408, "North Korean Won"),

    /**
     * Won
     */
    KRW(410, "Won"),

    /**
     * Kuwaiti Dinar
     */
    KWD(414, "Kuwaiti Dinar"),

    /**
     * Som
     */
    KGS(417, "Som"),

    /**
     * Lao Kip
     */
    LAK(418, "Lao Kip"),

    /**
     * Lebanese Pound
     */
    LBP(422, "Lebanese Pound"),

    /**
     * Loti
     */
    LSL(426, "Loti"),

    /**
     * Liberian Dollar
     */
    LRD(430, "Liberian Dollar"),

    /**
     * Libyan Dinar
     */
    LYD(434, "Libyan Dinar"),

    /**
     * Pataca
     */
    MOP(446, "Pataca"),

    /**
     * Malawi Kwacha
     */
    MWK(454, "Malawi Kwacha"),

    /**
     * Malaysian Ringgit
     */
    MYR(458, "Malaysian Ringgit"),

    /**
     * Rufiyaa
     */
    MVR(462, "Rufiyaa"),

    /**
     * Mauritius Rupee
     */
    MUR(480, "Mauritius Rupee"),

    /**
     * Mexican Peso
     */
    MXN(484, "Mexican Peso"),

    /**
     * Tugrik
     */
    MNT(496, "Tugrik"),

    /**
     * Moldovan Leu
     */
    MDL(498, "Moldovan Leu"),

    /**
     * Moroccan Dirham
     */
    MAD(504, "Moroccan Dirham"),

    /**
     * Rial Omani
     */
    OMR(512, "Rial Omani"),

    /**
     * Namibia Dollar
     */
    NAD(516, "Namibia Dollar"),

    /**
     * Nepalese Rupee
     */
    NPR(524, "Nepalese Rupee"),

    /**
     * Netherlands Antillean Guilder
     */
    ANG(532, "Netherlands Antillean Guilder"),

    /**
     * Aruban Florin
     */
    AWG(533, "Aruban Florin"),

    /**
     * Vatu
     */
    VUV(548, "Vatu"),

    /**
     * New Zealand Dollar
     */
    NZD(554, "New Zealand Dollar"),

    /**
     * Cordoba Oro
     */
    NIO(558, "Cordoba Oro"),

    /**
     * Naira
     */
    NGN(566, "Naira"),

    /**
     * Norwegian Krone
     */
    NOK(578, "Norwegian Krone"),

    /**
     * Pakistan Rupee
     */
    PKR(586, "Pakistan Rupee"),

    /**
     * Balboa
     */
    PAB(590, "Balboa"),

    /**
     * Kina
     */
    PGK(598, "Kina"),

    /**
     * Guarani
     */
    PYG(600, "Guarani"),

    /**
     * Sol
     */
    PEN(604, "Sol"),

    /**
     * Philippine Peso
     */
    PHP(608, "Philippine Peso"),

    /**
     * Qatari Rial
     */
    QAR(634, "Qatari Rial"),

    /**
     * Russian Ruble
     */
    RUB(643, "Russian Ruble"),

    /**
     * Rwanda Franc
     */
    RWF(646, "Rwanda Franc"),

    /**
     * Saint Helena Pound
     */
    SHP(654, "Saint Helena Pound"),

    /**
     * Saudi Riyal
     */
    SAR(682, "Saudi Riyal"),

    /**
     * Seychelles Rupee
     */
    SCR(690, "Seychelles Rupee"),

    /**
     * Singapore Dollar
     */
    SGD(702, "Singapore Dollar"),

    /**
     * Dong
     */
    VND(704, "Dong"),

    /**
     * Somali Shilling
     */
    SOS(706, "Somali Shilling"),

    /**
     * Rand
     */
    ZAR(710, "Rand"),

    /**
     * South Sudanese Pound
     */
    SSP(728, "South Sudanese Pound"),

    /**
     * Lilangeni
     */
    SZL(748, "Lilangeni"),

    /**
     * Swedish Krona
     */
    SEK(752, "Swedish Krona"),

    /**
     * Swiss Franc
     */
    CHF(756, "Swiss Franc"),

    /**
     * Syrian Pound
     */
    SYP(760, "Syrian Pound"),

    /**
     * Baht
     */
    THB(764, "Baht"),

    /**
     * Pa’anga
     */
    TOP(776, "Pa\u2019anga"),

    /**
     * Trinidad and Tobago Dollar
     */
    TTD(780, "Trinidad and Tobago Dollar"),

    /**
     * UAE Dirham
     */
    AED(784, "UAE Dirham"),

    /**
     * Tunisian Dinar
     */
    TND(788, "Tunisian Dinar"),

    /**
     * Uganda Shilling
     */
    UGX(800, "Uganda Shilling"),

    /**
     * Denar
     */
    MKD(807, "Denar"),

    /**
     * Egyptian Pound
     */
    EGP(818, "Egyptian Pound"),

    /**
     * Pound Sterling
     */
    GBP(826, "Pound Sterling"),

    /**
     * Tanzanian Shilling
     */
    TZS(834, "Tanzanian Shilling"),

    /**
     * US Dollar
     */
    USD(840, "US Dollar"),

    /**
     * Peso Uruguayo
     */
    UYU(858, "Peso Uruguayo"),

    /**
     * Uzbekistan Sum
     */
    UZS(860, "Uzbekistan Sum"),

    /**
     * Tala
     */
    WST(882, "Tala"),

    /**
     * Yemeni Rial
     */
    YER(886, "Yemeni Rial"),

    /**
     * New Taiwan Dollar
     */
    TWD(901, "New Taiwan Dollar"),

    /**
     * Leone
     */
    SLE(925, "Leone"),

    /**
     * Bolívar Soberano
     */
    VED(926, "Bol\u00EDvar Soberano"),

    /**
     * Unidad Previsional
     */
    UYW(927, "Unidad Previsional"),

    /**
     * Bolívar Soberano
     */
    VES(928, "Bol\u00EDvar Soberano"),

    /**
     * Ouguiya
     */
    MRU(929, "Ouguiya"),

    /**
     * Dobra
     */
    STN(930, "Dobra"),

    /**
     * Peso Convertible
     */
    CUC(931, "Peso Convertible"),

    /**
     * Zimbabwe Dollar
     */
    ZWL(932, "Zimbabwe Dollar"),

    /**
     * Belarusian Ruble
     */
    BYN(933, "Belarusian Ruble"),

    /**
     * Turkmenistan New Manat
     */
    TMT(934, "Turkmenistan New Manat"),

    /**
     * Ghana Cedi
     */
    GHS(936, "Ghana Cedi"),

    /**
     * Sudanese Pound
     */
    SDG(938, "Sudanese Pound"),

    /**
     * Uruguay Peso en Unidades Indexadas (URUIURUI)
     */
    UYI(940, "Uruguay Peso en Unidades Indexadas (URUIURUI)"),

    /**
     * Serbian Dinar
     */
    RSD(941, "Serbian Dinar"),

    /**
     * Mozambique Metical
     */
    MZN(943, "Mozambique Metical"),

    /**
     * Azerbaijan Manat
     */
    AZN(944, "Azerbaijan Manat"),

    /**
     * Romanian Leu
     */
    RON(946, "Romanian Leu"),

    /**
     * WIR Euro
     */
    CHE(947, "WIR Euro"),

    /**
     * WIR Franc
     */
    CHW(948, "WIR Franc"),

    /**
     * Turkish Lira
     */
    TRY(949, "Turkish Lira"),

    /**
     * CFA Franc BEAC
     */
    XAF(950, "CFA Franc BEAC"),

    /**
     * East Caribbean Dollar
     */
    XCD(951, "East Caribbean Dollar"),

    /**
     * CFA Franc BCEAO
     */
    XOF(952, "CFA Franc BCEAO"),

    /**
     * CFP Franc
     */
    XPF(953, "CFP Franc"),

    /**
     * Bond Markets Unit European Composite Unit (EURCO)
     */
    XBA(955, "Bond Markets Unit European Composite Unit (EURCO)"),

    /**
     * Bond Markets Unit European Monetary Unit (E.M.U.-6)
     */
    XBB(956, "Bond Markets Unit European Monetary Unit (E.M.U.-6)"),

    /**
     * Bond Markets Unit European Unit of Account 9 (E.U.A.-9)
     */
    XBC(957, "Bond Markets Unit European Unit of Account 9 (E.U.A.-9)"),

    /**
     * Bond Markets Unit European Unit of Account 17 (E.U.A.-17)
     */
    XBD(958, "Bond Markets Unit European Unit of Account 17 (E.U.A.-17)"),

    /**
     * Gold
     */
    XAU(959, "Gold"),

    /**
     * SDR (Special Drawing Right)
     */
    XDR(960, "SDR (Special Drawing Right)"),

    /**
     * Silver
     */
    XAG(961, "Silver"),

    /**
     * Platinum
     */
    XPT(962, "Platinum"),

    /**
     * Codes specifically reserved for testing purposes
     */
    XTS(963, "Codes specifically reserved for testing purposes"),

    /**
     * Palladium
     */
    XPD(964, "Palladium"),

    /**
     * ADB Unit of Account
     */
    XUA(965, "ADB Unit of Account"),

    /**
     * Zambian Kwacha
     */
    ZMW(967, "Zambian Kwacha"),

    /**
     * Surinam Dollar
     */
    SRD(968, "Surinam Dollar"),

    /**
     * Malagasy Ariary
     */
    MGA(969, "Malagasy Ariary"),

    /**
     * Unidad de Valor Real
     */
    COU(970, "Unidad de Valor Real"),

    /**
     * Afghani
     */
    AFN(971, "Afghani"),

    /**
     * Somoni
     */
    TJS(972, "Somoni"),

    /**
     * Kwanza
     */
    AOA(973, "Kwanza"),

    /**
     * Bulgarian Lev
     */
    BGN(975, "Bulgarian Lev"),

    /**
     * Congolese Franc
     */
    CDF(976, "Congolese Franc"),

    /**
     * Convertible Mark
     */
    BAM(977, "Convertible Mark"),

    /**
     * Euro
     */
    EUR(978, "Euro"),

    /**
     * Unidad de inversion (UDI)
     */
    MXV(979, "Unidad de inversion (UDI)"),

    /**
     * Hryvnia
     */
    UAH(980, "Hryvnia"),

    /**
     * Lari
     */
    GEL(981, "Lari"),

    /**
     * Mvdol
     */
    BOV(984, "Mvdol"),

    /**
     * Zloty
     */
    PLN(985, "Zloty"),

    /**
     * Brazilian Real
     */
    BRL(986, "Brazilian Real"),

    /**
     * Unidad de Fomento
     */
    CLF(990, "Unidad de Fomento"),

    /**
     * Sucre
     */
    XSU(994, "Sucre"),

    /**
     * US Dollar (next day)
     */
    USN(997, "US Dollar (next day)"),

    /**
     * The codes assigned for transactions where no currency is involved
     */
    XXX(999, "The codes assigned for transactions where no currency is involved");

    private final int wire;

    private final String description;

    TradingCurrency(int wire, String description) {
        this.wire = wire;
        this.description = description;
    }

    /**
     * Returns this value's encoding on the wire.
     *
     * @return the wire value
     */
    public int wire() {
        return wire;
    }

    /**
     * Returns the description the protocol specification gives this value.
     *
     * @return the description
     */
    public String description() {
        return description;
    }

    /**
     * Returns the value with the given wire encoding.
     *
     * @param wire the encoding read from the wire
     * @return the matching value, or empty when the protocol declares no value for it
     */
    public static Optional<TradingCurrency> fromWire(int wire) {
        return switch (wire) {
            case 8 -> Optional.of(ALL);
            case 12 -> Optional.of(DZD);
            case 32 -> Optional.of(ARS);
            case 36 -> Optional.of(AUD);
            case 44 -> Optional.of(BSD);
            case 48 -> Optional.of(BHD);
            case 50 -> Optional.of(BDT);
            case 51 -> Optional.of(AMD);
            case 52 -> Optional.of(BBD);
            case 60 -> Optional.of(BMD);
            case 64 -> Optional.of(BTN);
            case 68 -> Optional.of(BOB);
            case 72 -> Optional.of(BWP);
            case 84 -> Optional.of(BZD);
            case 90 -> Optional.of(SBD);
            case 96 -> Optional.of(BND);
            case 104 -> Optional.of(MMK);
            case 108 -> Optional.of(BIF);
            case 116 -> Optional.of(KHR);
            case 124 -> Optional.of(CAD);
            case 132 -> Optional.of(CVE);
            case 136 -> Optional.of(KYD);
            case 144 -> Optional.of(LKR);
            case 152 -> Optional.of(CLP);
            case 156 -> Optional.of(CNY);
            case 170 -> Optional.of(COP);
            case 174 -> Optional.of(KMF);
            case 188 -> Optional.of(CRC);
            case 191 -> Optional.of(HRK);
            case 192 -> Optional.of(CUP);
            case 203 -> Optional.of(CZK);
            case 208 -> Optional.of(DKK);
            case 214 -> Optional.of(DOP);
            case 222 -> Optional.of(SVC);
            case 230 -> Optional.of(ETB);
            case 232 -> Optional.of(ERN);
            case 238 -> Optional.of(FKP);
            case 242 -> Optional.of(FJD);
            case 262 -> Optional.of(DJF);
            case 270 -> Optional.of(GMD);
            case 292 -> Optional.of(GIP);
            case 320 -> Optional.of(GTQ);
            case 324 -> Optional.of(GNF);
            case 328 -> Optional.of(GYD);
            case 332 -> Optional.of(HTG);
            case 340 -> Optional.of(HNL);
            case 344 -> Optional.of(HKD);
            case 348 -> Optional.of(HUF);
            case 352 -> Optional.of(ISK);
            case 356 -> Optional.of(INR);
            case 360 -> Optional.of(IDR);
            case 364 -> Optional.of(IRR);
            case 368 -> Optional.of(IQD);
            case 376 -> Optional.of(ILS);
            case 388 -> Optional.of(JMD);
            case 392 -> Optional.of(JPY);
            case 398 -> Optional.of(KZT);
            case 400 -> Optional.of(JOD);
            case 404 -> Optional.of(KES);
            case 408 -> Optional.of(KPW);
            case 410 -> Optional.of(KRW);
            case 414 -> Optional.of(KWD);
            case 417 -> Optional.of(KGS);
            case 418 -> Optional.of(LAK);
            case 422 -> Optional.of(LBP);
            case 426 -> Optional.of(LSL);
            case 430 -> Optional.of(LRD);
            case 434 -> Optional.of(LYD);
            case 446 -> Optional.of(MOP);
            case 454 -> Optional.of(MWK);
            case 458 -> Optional.of(MYR);
            case 462 -> Optional.of(MVR);
            case 480 -> Optional.of(MUR);
            case 484 -> Optional.of(MXN);
            case 496 -> Optional.of(MNT);
            case 498 -> Optional.of(MDL);
            case 504 -> Optional.of(MAD);
            case 512 -> Optional.of(OMR);
            case 516 -> Optional.of(NAD);
            case 524 -> Optional.of(NPR);
            case 532 -> Optional.of(ANG);
            case 533 -> Optional.of(AWG);
            case 548 -> Optional.of(VUV);
            case 554 -> Optional.of(NZD);
            case 558 -> Optional.of(NIO);
            case 566 -> Optional.of(NGN);
            case 578 -> Optional.of(NOK);
            case 586 -> Optional.of(PKR);
            case 590 -> Optional.of(PAB);
            case 598 -> Optional.of(PGK);
            case 600 -> Optional.of(PYG);
            case 604 -> Optional.of(PEN);
            case 608 -> Optional.of(PHP);
            case 634 -> Optional.of(QAR);
            case 643 -> Optional.of(RUB);
            case 646 -> Optional.of(RWF);
            case 654 -> Optional.of(SHP);
            case 682 -> Optional.of(SAR);
            case 690 -> Optional.of(SCR);
            case 702 -> Optional.of(SGD);
            case 704 -> Optional.of(VND);
            case 706 -> Optional.of(SOS);
            case 710 -> Optional.of(ZAR);
            case 728 -> Optional.of(SSP);
            case 748 -> Optional.of(SZL);
            case 752 -> Optional.of(SEK);
            case 756 -> Optional.of(CHF);
            case 760 -> Optional.of(SYP);
            case 764 -> Optional.of(THB);
            case 776 -> Optional.of(TOP);
            case 780 -> Optional.of(TTD);
            case 784 -> Optional.of(AED);
            case 788 -> Optional.of(TND);
            case 800 -> Optional.of(UGX);
            case 807 -> Optional.of(MKD);
            case 818 -> Optional.of(EGP);
            case 826 -> Optional.of(GBP);
            case 834 -> Optional.of(TZS);
            case 840 -> Optional.of(USD);
            case 858 -> Optional.of(UYU);
            case 860 -> Optional.of(UZS);
            case 882 -> Optional.of(WST);
            case 886 -> Optional.of(YER);
            case 901 -> Optional.of(TWD);
            case 925 -> Optional.of(SLE);
            case 926 -> Optional.of(VED);
            case 927 -> Optional.of(UYW);
            case 928 -> Optional.of(VES);
            case 929 -> Optional.of(MRU);
            case 930 -> Optional.of(STN);
            case 931 -> Optional.of(CUC);
            case 932 -> Optional.of(ZWL);
            case 933 -> Optional.of(BYN);
            case 934 -> Optional.of(TMT);
            case 936 -> Optional.of(GHS);
            case 938 -> Optional.of(SDG);
            case 940 -> Optional.of(UYI);
            case 941 -> Optional.of(RSD);
            case 943 -> Optional.of(MZN);
            case 944 -> Optional.of(AZN);
            case 946 -> Optional.of(RON);
            case 947 -> Optional.of(CHE);
            case 948 -> Optional.of(CHW);
            case 949 -> Optional.of(TRY);
            case 950 -> Optional.of(XAF);
            case 951 -> Optional.of(XCD);
            case 952 -> Optional.of(XOF);
            case 953 -> Optional.of(XPF);
            case 955 -> Optional.of(XBA);
            case 956 -> Optional.of(XBB);
            case 957 -> Optional.of(XBC);
            case 958 -> Optional.of(XBD);
            case 959 -> Optional.of(XAU);
            case 960 -> Optional.of(XDR);
            case 961 -> Optional.of(XAG);
            case 962 -> Optional.of(XPT);
            case 963 -> Optional.of(XTS);
            case 964 -> Optional.of(XPD);
            case 965 -> Optional.of(XUA);
            case 967 -> Optional.of(ZMW);
            case 968 -> Optional.of(SRD);
            case 969 -> Optional.of(MGA);
            case 970 -> Optional.of(COU);
            case 971 -> Optional.of(AFN);
            case 972 -> Optional.of(TJS);
            case 973 -> Optional.of(AOA);
            case 975 -> Optional.of(BGN);
            case 976 -> Optional.of(CDF);
            case 977 -> Optional.of(BAM);
            case 978 -> Optional.of(EUR);
            case 979 -> Optional.of(MXV);
            case 980 -> Optional.of(UAH);
            case 981 -> Optional.of(GEL);
            case 984 -> Optional.of(BOV);
            case 985 -> Optional.of(PLN);
            case 986 -> Optional.of(BRL);
            case 990 -> Optional.of(CLF);
            case 994 -> Optional.of(XSU);
            case 997 -> Optional.of(USN);
            case 999 -> Optional.of(XXX);
            default -> Optional.empty();
        };
    }
}
