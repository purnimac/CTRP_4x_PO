
package gov.nih.nci.po.webservices.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryISO-3166-1-alpha-3-Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CountryISO-3166-1-alpha-3-Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AFG"/>
 *     &lt;enumeration value="ALA"/>
 *     &lt;enumeration value="ALB"/>
 *     &lt;enumeration value="DZA"/>
 *     &lt;enumeration value="ASM"/>
 *     &lt;enumeration value="AND"/>
 *     &lt;enumeration value="AGO"/>
 *     &lt;enumeration value="AIA"/>
 *     &lt;enumeration value="ATA"/>
 *     &lt;enumeration value="ATG"/>
 *     &lt;enumeration value="ARG"/>
 *     &lt;enumeration value="ARM"/>
 *     &lt;enumeration value="ABW"/>
 *     &lt;enumeration value="AUS"/>
 *     &lt;enumeration value="AUT"/>
 *     &lt;enumeration value="AZE"/>
 *     &lt;enumeration value="BHS"/>
 *     &lt;enumeration value="BHR"/>
 *     &lt;enumeration value="BGD"/>
 *     &lt;enumeration value="BRB"/>
 *     &lt;enumeration value="BLR"/>
 *     &lt;enumeration value="BEL"/>
 *     &lt;enumeration value="BLZ"/>
 *     &lt;enumeration value="BEN"/>
 *     &lt;enumeration value="BMU"/>
 *     &lt;enumeration value="BTN"/>
 *     &lt;enumeration value="BOL"/>
 *     &lt;enumeration value="BIH"/>
 *     &lt;enumeration value="BWA"/>
 *     &lt;enumeration value="BVT"/>
 *     &lt;enumeration value="BRA"/>
 *     &lt;enumeration value="IOT"/>
 *     &lt;enumeration value="BRN"/>
 *     &lt;enumeration value="BGR"/>
 *     &lt;enumeration value="BFA"/>
 *     &lt;enumeration value="BDI"/>
 *     &lt;enumeration value="KHM"/>
 *     &lt;enumeration value="CMR"/>
 *     &lt;enumeration value="CAN"/>
 *     &lt;enumeration value="CPV"/>
 *     &lt;enumeration value="CYM"/>
 *     &lt;enumeration value="CAF"/>
 *     &lt;enumeration value="TCD"/>
 *     &lt;enumeration value="CHL"/>
 *     &lt;enumeration value="CHN"/>
 *     &lt;enumeration value="CXR"/>
 *     &lt;enumeration value="CCK"/>
 *     &lt;enumeration value="COL"/>
 *     &lt;enumeration value="COM"/>
 *     &lt;enumeration value="COG"/>
 *     &lt;enumeration value="COD"/>
 *     &lt;enumeration value="COK"/>
 *     &lt;enumeration value="CRI"/>
 *     &lt;enumeration value="CIV"/>
 *     &lt;enumeration value="HRV"/>
 *     &lt;enumeration value="CUB"/>
 *     &lt;enumeration value="CYP"/>
 *     &lt;enumeration value="CZE"/>
 *     &lt;enumeration value="DNK"/>
 *     &lt;enumeration value="DJI"/>
 *     &lt;enumeration value="DMA"/>
 *     &lt;enumeration value="DOM"/>
 *     &lt;enumeration value="ECU"/>
 *     &lt;enumeration value="EGY"/>
 *     &lt;enumeration value="SLV"/>
 *     &lt;enumeration value="GNQ"/>
 *     &lt;enumeration value="ERI"/>
 *     &lt;enumeration value="EST"/>
 *     &lt;enumeration value="ETH"/>
 *     &lt;enumeration value="FLK"/>
 *     &lt;enumeration value="FRO"/>
 *     &lt;enumeration value="FJI"/>
 *     &lt;enumeration value="FIN"/>
 *     &lt;enumeration value="FRA"/>
 *     &lt;enumeration value="GUF"/>
 *     &lt;enumeration value="PYF"/>
 *     &lt;enumeration value="ATF"/>
 *     &lt;enumeration value="GAB"/>
 *     &lt;enumeration value="GMB"/>
 *     &lt;enumeration value="GEO"/>
 *     &lt;enumeration value="DEU"/>
 *     &lt;enumeration value="GHA"/>
 *     &lt;enumeration value="GIB"/>
 *     &lt;enumeration value="GRC"/>
 *     &lt;enumeration value="GRL"/>
 *     &lt;enumeration value="GRD"/>
 *     &lt;enumeration value="GLP"/>
 *     &lt;enumeration value="GUM"/>
 *     &lt;enumeration value="GTM"/>
 *     &lt;enumeration value="GGY"/>
 *     &lt;enumeration value="GIN"/>
 *     &lt;enumeration value="GNB"/>
 *     &lt;enumeration value="GUY"/>
 *     &lt;enumeration value="HTI"/>
 *     &lt;enumeration value="HMD"/>
 *     &lt;enumeration value="VAT"/>
 *     &lt;enumeration value="HND"/>
 *     &lt;enumeration value="HKG"/>
 *     &lt;enumeration value="HUN"/>
 *     &lt;enumeration value="ISL"/>
 *     &lt;enumeration value="IND"/>
 *     &lt;enumeration value="IDN"/>
 *     &lt;enumeration value="IRN"/>
 *     &lt;enumeration value="IRQ"/>
 *     &lt;enumeration value="IRL"/>
 *     &lt;enumeration value="IMN"/>
 *     &lt;enumeration value="ISR"/>
 *     &lt;enumeration value="ITA"/>
 *     &lt;enumeration value="JAM"/>
 *     &lt;enumeration value="JPN"/>
 *     &lt;enumeration value="JEY"/>
 *     &lt;enumeration value="JOR"/>
 *     &lt;enumeration value="KAZ"/>
 *     &lt;enumeration value="KEN"/>
 *     &lt;enumeration value="KIR"/>
 *     &lt;enumeration value="PRK"/>
 *     &lt;enumeration value="KOR"/>
 *     &lt;enumeration value="KWT"/>
 *     &lt;enumeration value="KGZ"/>
 *     &lt;enumeration value="LAO"/>
 *     &lt;enumeration value="LVA"/>
 *     &lt;enumeration value="LBN"/>
 *     &lt;enumeration value="LSO"/>
 *     &lt;enumeration value="LBR"/>
 *     &lt;enumeration value="LBY"/>
 *     &lt;enumeration value="LIE"/>
 *     &lt;enumeration value="LTU"/>
 *     &lt;enumeration value="LUX"/>
 *     &lt;enumeration value="MAC"/>
 *     &lt;enumeration value="MKD"/>
 *     &lt;enumeration value="MDG"/>
 *     &lt;enumeration value="MWI"/>
 *     &lt;enumeration value="MYS"/>
 *     &lt;enumeration value="MDV"/>
 *     &lt;enumeration value="MLI"/>
 *     &lt;enumeration value="MLT"/>
 *     &lt;enumeration value="MHL"/>
 *     &lt;enumeration value="MTQ"/>
 *     &lt;enumeration value="MRT"/>
 *     &lt;enumeration value="MUS"/>
 *     &lt;enumeration value="MYT"/>
 *     &lt;enumeration value="MEX"/>
 *     &lt;enumeration value="FSM"/>
 *     &lt;enumeration value="MDA"/>
 *     &lt;enumeration value="MCO"/>
 *     &lt;enumeration value="MNG"/>
 *     &lt;enumeration value="MNE"/>
 *     &lt;enumeration value="MSR"/>
 *     &lt;enumeration value="MAR"/>
 *     &lt;enumeration value="MOZ"/>
 *     &lt;enumeration value="MMR"/>
 *     &lt;enumeration value="NAM"/>
 *     &lt;enumeration value="NRU"/>
 *     &lt;enumeration value="NPL"/>
 *     &lt;enumeration value="NLD"/>
 *     &lt;enumeration value="ANT"/>
 *     &lt;enumeration value="NCL"/>
 *     &lt;enumeration value="NZL"/>
 *     &lt;enumeration value="NIC"/>
 *     &lt;enumeration value="NER"/>
 *     &lt;enumeration value="NGA"/>
 *     &lt;enumeration value="NIU"/>
 *     &lt;enumeration value="NFK"/>
 *     &lt;enumeration value="MNP"/>
 *     &lt;enumeration value="NOR"/>
 *     &lt;enumeration value="OMN"/>
 *     &lt;enumeration value="PAK"/>
 *     &lt;enumeration value="PLW"/>
 *     &lt;enumeration value="PSE"/>
 *     &lt;enumeration value="PAN"/>
 *     &lt;enumeration value="PNG"/>
 *     &lt;enumeration value="PRY"/>
 *     &lt;enumeration value="PER"/>
 *     &lt;enumeration value="PHL"/>
 *     &lt;enumeration value="PCN"/>
 *     &lt;enumeration value="POL"/>
 *     &lt;enumeration value="PRT"/>
 *     &lt;enumeration value="PRI"/>
 *     &lt;enumeration value="QAT"/>
 *     &lt;enumeration value="REU"/>
 *     &lt;enumeration value="ROU"/>
 *     &lt;enumeration value="RUS"/>
 *     &lt;enumeration value="RWA"/>
 *     &lt;enumeration value="BLM"/>
 *     &lt;enumeration value="SHN"/>
 *     &lt;enumeration value="KNA"/>
 *     &lt;enumeration value="LCA"/>
 *     &lt;enumeration value="MAF"/>
 *     &lt;enumeration value="SPM"/>
 *     &lt;enumeration value="VCT"/>
 *     &lt;enumeration value="WSM"/>
 *     &lt;enumeration value="SMR"/>
 *     &lt;enumeration value="STP"/>
 *     &lt;enumeration value="SAU"/>
 *     &lt;enumeration value="SEN"/>
 *     &lt;enumeration value="SRB"/>
 *     &lt;enumeration value="SYC"/>
 *     &lt;enumeration value="SLE"/>
 *     &lt;enumeration value="SGP"/>
 *     &lt;enumeration value="SVK"/>
 *     &lt;enumeration value="SVN"/>
 *     &lt;enumeration value="SLB"/>
 *     &lt;enumeration value="SOM"/>
 *     &lt;enumeration value="ZAF"/>
 *     &lt;enumeration value="SGS"/>
 *     &lt;enumeration value="ESP"/>
 *     &lt;enumeration value="LKA"/>
 *     &lt;enumeration value="SDN"/>
 *     &lt;enumeration value="SUR"/>
 *     &lt;enumeration value="SJM"/>
 *     &lt;enumeration value="SWZ"/>
 *     &lt;enumeration value="SWE"/>
 *     &lt;enumeration value="CHE"/>
 *     &lt;enumeration value="SYR"/>
 *     &lt;enumeration value="TWN"/>
 *     &lt;enumeration value="TJK"/>
 *     &lt;enumeration value="TZA"/>
 *     &lt;enumeration value="THA"/>
 *     &lt;enumeration value="TLS"/>
 *     &lt;enumeration value="TGO"/>
 *     &lt;enumeration value="TKL"/>
 *     &lt;enumeration value="TON"/>
 *     &lt;enumeration value="TTO"/>
 *     &lt;enumeration value="TUN"/>
 *     &lt;enumeration value="TUR"/>
 *     &lt;enumeration value="TKM"/>
 *     &lt;enumeration value="TCA"/>
 *     &lt;enumeration value="TUV"/>
 *     &lt;enumeration value="UGA"/>
 *     &lt;enumeration value="UKR"/>
 *     &lt;enumeration value="ARE"/>
 *     &lt;enumeration value="GBR"/>
 *     &lt;enumeration value="USA"/>
 *     &lt;enumeration value="UMI"/>
 *     &lt;enumeration value="URY"/>
 *     &lt;enumeration value="UZB"/>
 *     &lt;enumeration value="VUT"/>
 *     &lt;enumeration value="VEN"/>
 *     &lt;enumeration value="VNM"/>
 *     &lt;enumeration value="VGB"/>
 *     &lt;enumeration value="VIR"/>
 *     &lt;enumeration value="WLF"/>
 *     &lt;enumeration value="ESH"/>
 *     &lt;enumeration value="YEM"/>
 *     &lt;enumeration value="ZMB"/>
 *     &lt;enumeration value="ZWE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CountryISO-3166-1-alpha-3-Code")
@XmlEnum
public enum CountryISO31661Alpha3Code {

    AFG,
    ALA,
    ALB,
    DZA,
    ASM,
    AND,
    AGO,
    AIA,
    ATA,
    ATG,
    ARG,
    ARM,
    ABW,
    AUS,
    AUT,
    AZE,
    BHS,
    BHR,
    BGD,
    BRB,
    BLR,
    BEL,
    BLZ,
    BEN,
    BMU,
    BTN,
    BOL,
    BIH,
    BWA,
    BVT,
    BRA,
    IOT,
    BRN,
    BGR,
    BFA,
    BDI,
    KHM,
    CMR,
    CAN,
    CPV,
    CYM,
    CAF,
    TCD,
    CHL,
    CHN,
    CXR,
    CCK,
    COL,
    COM,
    COG,
    COD,
    COK,
    CRI,
    CIV,
    HRV,
    CUB,
    CYP,
    CZE,
    DNK,
    DJI,
    DMA,
    DOM,
    ECU,
    EGY,
    SLV,
    GNQ,
    ERI,
    EST,
    ETH,
    FLK,
    FRO,
    FJI,
    FIN,
    FRA,
    GUF,
    PYF,
    ATF,
    GAB,
    GMB,
    GEO,
    DEU,
    GHA,
    GIB,
    GRC,
    GRL,
    GRD,
    GLP,
    GUM,
    GTM,
    GGY,
    GIN,
    GNB,
    GUY,
    HTI,
    HMD,
    VAT,
    HND,
    HKG,
    HUN,
    ISL,
    IND,
    IDN,
    IRN,
    IRQ,
    IRL,
    IMN,
    ISR,
    ITA,
    JAM,
    JPN,
    JEY,
    JOR,
    KAZ,
    KEN,
    KIR,
    PRK,
    KOR,
    KWT,
    KGZ,
    LAO,
    LVA,
    LBN,
    LSO,
    LBR,
    LBY,
    LIE,
    LTU,
    LUX,
    MAC,
    MKD,
    MDG,
    MWI,
    MYS,
    MDV,
    MLI,
    MLT,
    MHL,
    MTQ,
    MRT,
    MUS,
    MYT,
    MEX,
    FSM,
    MDA,
    MCO,
    MNG,
    MNE,
    MSR,
    MAR,
    MOZ,
    MMR,
    NAM,
    NRU,
    NPL,
    NLD,
    ANT,
    NCL,
    NZL,
    NIC,
    NER,
    NGA,
    NIU,
    NFK,
    MNP,
    NOR,
    OMN,
    PAK,
    PLW,
    PSE,
    PAN,
    PNG,
    PRY,
    PER,
    PHL,
    PCN,
    POL,
    PRT,
    PRI,
    QAT,
    REU,
    ROU,
    RUS,
    RWA,
    BLM,
    SHN,
    KNA,
    LCA,
    MAF,
    SPM,
    VCT,
    WSM,
    SMR,
    STP,
    SAU,
    SEN,
    SRB,
    SYC,
    SLE,
    SGP,
    SVK,
    SVN,
    SLB,
    SOM,
    ZAF,
    SGS,
    ESP,
    LKA,
    SDN,
    SUR,
    SJM,
    SWZ,
    SWE,
    CHE,
    SYR,
    TWN,
    TJK,
    TZA,
    THA,
    TLS,
    TGO,
    TKL,
    TON,
    TTO,
    TUN,
    TUR,
    TKM,
    TCA,
    TUV,
    UGA,
    UKR,
    ARE,
    GBR,
    USA,
    UMI,
    URY,
    UZB,
    VUT,
    VEN,
    VNM,
    VGB,
    VIR,
    WLF,
    ESH,
    YEM,
    ZMB,
    ZWE;

    public String value() {
        return name();
    }

    public static CountryISO31661Alpha3Code fromValue(String v) {
        return valueOf(v);
    }

}
