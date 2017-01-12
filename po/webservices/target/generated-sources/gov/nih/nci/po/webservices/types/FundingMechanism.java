
package gov.nih.nci.po.webservices.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundingMechanism.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundingMechanism">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="B09"/>
 *     &lt;enumeration value="C06"/>
 *     &lt;enumeration value="D43"/>
 *     &lt;enumeration value="D71"/>
 *     &lt;enumeration value="DP1"/>
 *     &lt;enumeration value="DP2"/>
 *     &lt;enumeration value="E11"/>
 *     &lt;enumeration value="F05"/>
 *     &lt;enumeration value="F30"/>
 *     &lt;enumeration value="F31"/>
 *     &lt;enumeration value="F32"/>
 *     &lt;enumeration value="F33"/>
 *     &lt;enumeration value="F34"/>
 *     &lt;enumeration value="F37"/>
 *     &lt;enumeration value="F38"/>
 *     &lt;enumeration value="G07"/>
 *     &lt;enumeration value="G08"/>
 *     &lt;enumeration value="G11"/>
 *     &lt;enumeration value="G12"/>
 *     &lt;enumeration value="G13"/>
 *     &lt;enumeration value="G20"/>
 *     &lt;enumeration value="G94"/>
 *     &lt;enumeration value="H13"/>
 *     &lt;enumeration value="H25"/>
 *     &lt;enumeration value="H28"/>
 *     &lt;enumeration value="H50"/>
 *     &lt;enumeration value="H57"/>
 *     &lt;enumeration value="H62"/>
 *     &lt;enumeration value="H64"/>
 *     &lt;enumeration value="H79"/>
 *     &lt;enumeration value="HD4"/>
 *     &lt;enumeration value="K01"/>
 *     &lt;enumeration value="K02"/>
 *     &lt;enumeration value="K05"/>
 *     &lt;enumeration value="K06"/>
 *     &lt;enumeration value="K07"/>
 *     &lt;enumeration value="K08"/>
 *     &lt;enumeration value="K12"/>
 *     &lt;enumeration value="K14"/>
 *     &lt;enumeration value="K18"/>
 *     &lt;enumeration value="K22"/>
 *     &lt;enumeration value="K23"/>
 *     &lt;enumeration value="K24"/>
 *     &lt;enumeration value="K25"/>
 *     &lt;enumeration value="K26"/>
 *     &lt;enumeration value="K99"/>
 *     &lt;enumeration value="KD1"/>
 *     &lt;enumeration value="KL1"/>
 *     &lt;enumeration value="KL2"/>
 *     &lt;enumeration value="L30"/>
 *     &lt;enumeration value="L32"/>
 *     &lt;enumeration value="L40"/>
 *     &lt;enumeration value="L50"/>
 *     &lt;enumeration value="L60"/>
 *     &lt;enumeration value="M01"/>
 *     &lt;enumeration value="P01"/>
 *     &lt;enumeration value="P20"/>
 *     &lt;enumeration value="P30"/>
 *     &lt;enumeration value="P40"/>
 *     &lt;enumeration value="P41"/>
 *     &lt;enumeration value="P42"/>
 *     &lt;enumeration value="P50"/>
 *     &lt;enumeration value="P51"/>
 *     &lt;enumeration value="P60"/>
 *     &lt;enumeration value="P76"/>
 *     &lt;enumeration value="PL1"/>
 *     &lt;enumeration value="PN1"/>
 *     &lt;enumeration value="PN2"/>
 *     &lt;enumeration value="R00"/>
 *     &lt;enumeration value="R01"/>
 *     &lt;enumeration value="R03"/>
 *     &lt;enumeration value="R04"/>
 *     &lt;enumeration value="R06"/>
 *     &lt;enumeration value="R08"/>
 *     &lt;enumeration value="R13"/>
 *     &lt;enumeration value="R15"/>
 *     &lt;enumeration value="R17"/>
 *     &lt;enumeration value="R18"/>
 *     &lt;enumeration value="R21"/>
 *     &lt;enumeration value="R24"/>
 *     &lt;enumeration value="R25"/>
 *     &lt;enumeration value="R30"/>
 *     &lt;enumeration value="R33"/>
 *     &lt;enumeration value="R34"/>
 *     &lt;enumeration value="R36"/>
 *     &lt;enumeration value="R37"/>
 *     &lt;enumeration value="R41"/>
 *     &lt;enumeration value="R42"/>
 *     &lt;enumeration value="R43"/>
 *     &lt;enumeration value="R44"/>
 *     &lt;enumeration value="R49"/>
 *     &lt;enumeration value="R55"/>
 *     &lt;enumeration value="R56"/>
 *     &lt;enumeration value="R90"/>
 *     &lt;enumeration value="RL1"/>
 *     &lt;enumeration value="RL2"/>
 *     &lt;enumeration value="RL5"/>
 *     &lt;enumeration value="RL9"/>
 *     &lt;enumeration value="RS1"/>
 *     &lt;enumeration value="S06"/>
 *     &lt;enumeration value="S10"/>
 *     &lt;enumeration value="S11"/>
 *     &lt;enumeration value="S21"/>
 *     &lt;enumeration value="S22"/>
 *     &lt;enumeration value="SC1"/>
 *     &lt;enumeration value="SC2"/>
 *     &lt;enumeration value="SC3"/>
 *     &lt;enumeration value="T01"/>
 *     &lt;enumeration value="T02"/>
 *     &lt;enumeration value="T09"/>
 *     &lt;enumeration value="T14"/>
 *     &lt;enumeration value="T15"/>
 *     &lt;enumeration value="T32"/>
 *     &lt;enumeration value="T34"/>
 *     &lt;enumeration value="T35"/>
 *     &lt;enumeration value="T36"/>
 *     &lt;enumeration value="T37"/>
 *     &lt;enumeration value="T42"/>
 *     &lt;enumeration value="T90"/>
 *     &lt;enumeration value="TL1"/>
 *     &lt;enumeration value="TU2"/>
 *     &lt;enumeration value="U01"/>
 *     &lt;enumeration value="U09"/>
 *     &lt;enumeration value="U10"/>
 *     &lt;enumeration value="U11"/>
 *     &lt;enumeration value="U13"/>
 *     &lt;enumeration value="U17"/>
 *     &lt;enumeration value="U18"/>
 *     &lt;enumeration value="U19"/>
 *     &lt;enumeration value="U1A"/>
 *     &lt;enumeration value="U1Q"/>
 *     &lt;enumeration value="U1V"/>
 *     &lt;enumeration value="U21"/>
 *     &lt;enumeration value="U22"/>
 *     &lt;enumeration value="U23"/>
 *     &lt;enumeration value="U24"/>
 *     &lt;enumeration value="U27"/>
 *     &lt;enumeration value="U2G"/>
 *     &lt;enumeration value="U2R"/>
 *     &lt;enumeration value="U30"/>
 *     &lt;enumeration value="U32"/>
 *     &lt;enumeration value="U36"/>
 *     &lt;enumeration value="U38"/>
 *     &lt;enumeration value="U41"/>
 *     &lt;enumeration value="U42"/>
 *     &lt;enumeration value="U43"/>
 *     &lt;enumeration value="U44"/>
 *     &lt;enumeration value="U45"/>
 *     &lt;enumeration value="U46"/>
 *     &lt;enumeration value="U47"/>
 *     &lt;enumeration value="U48"/>
 *     &lt;enumeration value="U49"/>
 *     &lt;enumeration value="U50"/>
 *     &lt;enumeration value="U51"/>
 *     &lt;enumeration value="U52"/>
 *     &lt;enumeration value="U53"/>
 *     &lt;enumeration value="U54"/>
 *     &lt;enumeration value="U55"/>
 *     &lt;enumeration value="U56"/>
 *     &lt;enumeration value="U57"/>
 *     &lt;enumeration value="U58"/>
 *     &lt;enumeration value="U59"/>
 *     &lt;enumeration value="U60"/>
 *     &lt;enumeration value="U61"/>
 *     &lt;enumeration value="U62"/>
 *     &lt;enumeration value="U65"/>
 *     &lt;enumeration value="U66"/>
 *     &lt;enumeration value="U75"/>
 *     &lt;enumeration value="U79"/>
 *     &lt;enumeration value="U81"/>
 *     &lt;enumeration value="U82"/>
 *     &lt;enumeration value="U83"/>
 *     &lt;enumeration value="U84"/>
 *     &lt;enumeration value="U87"/>
 *     &lt;enumeration value="U90"/>
 *     &lt;enumeration value="UA1"/>
 *     &lt;enumeration value="UC1"/>
 *     &lt;enumeration value="UC6"/>
 *     &lt;enumeration value="UC7"/>
 *     &lt;enumeration value="UD1"/>
 *     &lt;enumeration value="UH1"/>
 *     &lt;enumeration value="UL1"/>
 *     &lt;enumeration value="UR3"/>
 *     &lt;enumeration value="UR6"/>
 *     &lt;enumeration value="UR8"/>
 *     &lt;enumeration value="US3"/>
 *     &lt;enumeration value="US4"/>
 *     &lt;enumeration value="UT1"/>
 *     &lt;enumeration value="UT2"/>
 *     &lt;enumeration value="VF1"/>
 *     &lt;enumeration value="X01"/>
 *     &lt;enumeration value="X02"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FundingMechanism")
@XmlEnum
public enum FundingMechanism {

    @XmlEnumValue("B09")
    B_09("B09"),
    @XmlEnumValue("C06")
    C_06("C06"),
    @XmlEnumValue("D43")
    D_43("D43"),
    @XmlEnumValue("D71")
    D_71("D71"),
    @XmlEnumValue("DP1")
    DP_1("DP1"),
    @XmlEnumValue("DP2")
    DP_2("DP2"),
    @XmlEnumValue("E11")
    E_11("E11"),
    @XmlEnumValue("F05")
    F_05("F05"),
    @XmlEnumValue("F30")
    F_30("F30"),
    @XmlEnumValue("F31")
    F_31("F31"),
    @XmlEnumValue("F32")
    F_32("F32"),
    @XmlEnumValue("F33")
    F_33("F33"),
    @XmlEnumValue("F34")
    F_34("F34"),
    @XmlEnumValue("F37")
    F_37("F37"),
    @XmlEnumValue("F38")
    F_38("F38"),
    @XmlEnumValue("G07")
    G_07("G07"),
    @XmlEnumValue("G08")
    G_08("G08"),
    @XmlEnumValue("G11")
    G_11("G11"),
    @XmlEnumValue("G12")
    G_12("G12"),
    @XmlEnumValue("G13")
    G_13("G13"),
    @XmlEnumValue("G20")
    G_20("G20"),
    @XmlEnumValue("G94")
    G_94("G94"),
    @XmlEnumValue("H13")
    H_13("H13"),
    @XmlEnumValue("H25")
    H_25("H25"),
    @XmlEnumValue("H28")
    H_28("H28"),
    @XmlEnumValue("H50")
    H_50("H50"),
    @XmlEnumValue("H57")
    H_57("H57"),
    @XmlEnumValue("H62")
    H_62("H62"),
    @XmlEnumValue("H64")
    H_64("H64"),
    @XmlEnumValue("H79")
    H_79("H79"),
    @XmlEnumValue("HD4")
    HD_4("HD4"),
    @XmlEnumValue("K01")
    K_01("K01"),
    @XmlEnumValue("K02")
    K_02("K02"),
    @XmlEnumValue("K05")
    K_05("K05"),
    @XmlEnumValue("K06")
    K_06("K06"),
    @XmlEnumValue("K07")
    K_07("K07"),
    @XmlEnumValue("K08")
    K_08("K08"),
    @XmlEnumValue("K12")
    K_12("K12"),
    @XmlEnumValue("K14")
    K_14("K14"),
    @XmlEnumValue("K18")
    K_18("K18"),
    @XmlEnumValue("K22")
    K_22("K22"),
    @XmlEnumValue("K23")
    K_23("K23"),
    @XmlEnumValue("K24")
    K_24("K24"),
    @XmlEnumValue("K25")
    K_25("K25"),
    @XmlEnumValue("K26")
    K_26("K26"),
    @XmlEnumValue("K99")
    K_99("K99"),
    @XmlEnumValue("KD1")
    KD_1("KD1"),
    @XmlEnumValue("KL1")
    KL_1("KL1"),
    @XmlEnumValue("KL2")
    KL_2("KL2"),
    @XmlEnumValue("L30")
    L_30("L30"),
    @XmlEnumValue("L32")
    L_32("L32"),
    @XmlEnumValue("L40")
    L_40("L40"),
    @XmlEnumValue("L50")
    L_50("L50"),
    @XmlEnumValue("L60")
    L_60("L60"),
    @XmlEnumValue("M01")
    M_01("M01"),
    @XmlEnumValue("P01")
    P_01("P01"),
    @XmlEnumValue("P20")
    P_20("P20"),
    @XmlEnumValue("P30")
    P_30("P30"),
    @XmlEnumValue("P40")
    P_40("P40"),
    @XmlEnumValue("P41")
    P_41("P41"),
    @XmlEnumValue("P42")
    P_42("P42"),
    @XmlEnumValue("P50")
    P_50("P50"),
    @XmlEnumValue("P51")
    P_51("P51"),
    @XmlEnumValue("P60")
    P_60("P60"),
    @XmlEnumValue("P76")
    P_76("P76"),
    @XmlEnumValue("PL1")
    PL_1("PL1"),
    @XmlEnumValue("PN1")
    PN_1("PN1"),
    @XmlEnumValue("PN2")
    PN_2("PN2"),
    @XmlEnumValue("R00")
    R_00("R00"),
    @XmlEnumValue("R01")
    R_01("R01"),
    @XmlEnumValue("R03")
    R_03("R03"),
    @XmlEnumValue("R04")
    R_04("R04"),
    @XmlEnumValue("R06")
    R_06("R06"),
    @XmlEnumValue("R08")
    R_08("R08"),
    @XmlEnumValue("R13")
    R_13("R13"),
    @XmlEnumValue("R15")
    R_15("R15"),
    @XmlEnumValue("R17")
    R_17("R17"),
    @XmlEnumValue("R18")
    R_18("R18"),
    @XmlEnumValue("R21")
    R_21("R21"),
    @XmlEnumValue("R24")
    R_24("R24"),
    @XmlEnumValue("R25")
    R_25("R25"),
    @XmlEnumValue("R30")
    R_30("R30"),
    @XmlEnumValue("R33")
    R_33("R33"),
    @XmlEnumValue("R34")
    R_34("R34"),
    @XmlEnumValue("R36")
    R_36("R36"),
    @XmlEnumValue("R37")
    R_37("R37"),
    @XmlEnumValue("R41")
    R_41("R41"),
    @XmlEnumValue("R42")
    R_42("R42"),
    @XmlEnumValue("R43")
    R_43("R43"),
    @XmlEnumValue("R44")
    R_44("R44"),
    @XmlEnumValue("R49")
    R_49("R49"),
    @XmlEnumValue("R55")
    R_55("R55"),
    @XmlEnumValue("R56")
    R_56("R56"),
    @XmlEnumValue("R90")
    R_90("R90"),
    @XmlEnumValue("RL1")
    RL_1("RL1"),
    @XmlEnumValue("RL2")
    RL_2("RL2"),
    @XmlEnumValue("RL5")
    RL_5("RL5"),
    @XmlEnumValue("RL9")
    RL_9("RL9"),
    @XmlEnumValue("RS1")
    RS_1("RS1"),
    @XmlEnumValue("S06")
    S_06("S06"),
    @XmlEnumValue("S10")
    S_10("S10"),
    @XmlEnumValue("S11")
    S_11("S11"),
    @XmlEnumValue("S21")
    S_21("S21"),
    @XmlEnumValue("S22")
    S_22("S22"),
    @XmlEnumValue("SC1")
    SC_1("SC1"),
    @XmlEnumValue("SC2")
    SC_2("SC2"),
    @XmlEnumValue("SC3")
    SC_3("SC3"),
    @XmlEnumValue("T01")
    T_01("T01"),
    @XmlEnumValue("T02")
    T_02("T02"),
    @XmlEnumValue("T09")
    T_09("T09"),
    @XmlEnumValue("T14")
    T_14("T14"),
    @XmlEnumValue("T15")
    T_15("T15"),
    @XmlEnumValue("T32")
    T_32("T32"),
    @XmlEnumValue("T34")
    T_34("T34"),
    @XmlEnumValue("T35")
    T_35("T35"),
    @XmlEnumValue("T36")
    T_36("T36"),
    @XmlEnumValue("T37")
    T_37("T37"),
    @XmlEnumValue("T42")
    T_42("T42"),
    @XmlEnumValue("T90")
    T_90("T90"),
    @XmlEnumValue("TL1")
    TL_1("TL1"),
    @XmlEnumValue("TU2")
    TU_2("TU2"),
    @XmlEnumValue("U01")
    U_01("U01"),
    @XmlEnumValue("U09")
    U_09("U09"),
    @XmlEnumValue("U10")
    U_10("U10"),
    @XmlEnumValue("U11")
    U_11("U11"),
    @XmlEnumValue("U13")
    U_13("U13"),
    @XmlEnumValue("U17")
    U_17("U17"),
    @XmlEnumValue("U18")
    U_18("U18"),
    @XmlEnumValue("U19")
    U_19("U19"),
    @XmlEnumValue("U1A")
    U_1_A("U1A"),
    @XmlEnumValue("U1Q")
    U_1_Q("U1Q"),
    @XmlEnumValue("U1V")
    U_1_V("U1V"),
    @XmlEnumValue("U21")
    U_21("U21"),
    @XmlEnumValue("U22")
    U_22("U22"),
    @XmlEnumValue("U23")
    U_23("U23"),
    @XmlEnumValue("U24")
    U_24("U24"),
    @XmlEnumValue("U27")
    U_27("U27"),
    @XmlEnumValue("U2G")
    U_2_G("U2G"),
    @XmlEnumValue("U2R")
    U_2_R("U2R"),
    @XmlEnumValue("U30")
    U_30("U30"),
    @XmlEnumValue("U32")
    U_32("U32"),
    @XmlEnumValue("U36")
    U_36("U36"),
    @XmlEnumValue("U38")
    U_38("U38"),
    @XmlEnumValue("U41")
    U_41("U41"),
    @XmlEnumValue("U42")
    U_42("U42"),
    @XmlEnumValue("U43")
    U_43("U43"),
    @XmlEnumValue("U44")
    U_44("U44"),
    @XmlEnumValue("U45")
    U_45("U45"),
    @XmlEnumValue("U46")
    U_46("U46"),
    @XmlEnumValue("U47")
    U_47("U47"),
    @XmlEnumValue("U48")
    U_48("U48"),
    @XmlEnumValue("U49")
    U_49("U49"),
    @XmlEnumValue("U50")
    U_50("U50"),
    @XmlEnumValue("U51")
    U_51("U51"),
    @XmlEnumValue("U52")
    U_52("U52"),
    @XmlEnumValue("U53")
    U_53("U53"),
    @XmlEnumValue("U54")
    U_54("U54"),
    @XmlEnumValue("U55")
    U_55("U55"),
    @XmlEnumValue("U56")
    U_56("U56"),
    @XmlEnumValue("U57")
    U_57("U57"),
    @XmlEnumValue("U58")
    U_58("U58"),
    @XmlEnumValue("U59")
    U_59("U59"),
    @XmlEnumValue("U60")
    U_60("U60"),
    @XmlEnumValue("U61")
    U_61("U61"),
    @XmlEnumValue("U62")
    U_62("U62"),
    @XmlEnumValue("U65")
    U_65("U65"),
    @XmlEnumValue("U66")
    U_66("U66"),
    @XmlEnumValue("U75")
    U_75("U75"),
    @XmlEnumValue("U79")
    U_79("U79"),
    @XmlEnumValue("U81")
    U_81("U81"),
    @XmlEnumValue("U82")
    U_82("U82"),
    @XmlEnumValue("U83")
    U_83("U83"),
    @XmlEnumValue("U84")
    U_84("U84"),
    @XmlEnumValue("U87")
    U_87("U87"),
    @XmlEnumValue("U90")
    U_90("U90"),
    @XmlEnumValue("UA1")
    UA_1("UA1"),
    @XmlEnumValue("UC1")
    UC_1("UC1"),
    @XmlEnumValue("UC6")
    UC_6("UC6"),
    @XmlEnumValue("UC7")
    UC_7("UC7"),
    @XmlEnumValue("UD1")
    UD_1("UD1"),
    @XmlEnumValue("UH1")
    UH_1("UH1"),
    @XmlEnumValue("UL1")
    UL_1("UL1"),
    @XmlEnumValue("UR3")
    UR_3("UR3"),
    @XmlEnumValue("UR6")
    UR_6("UR6"),
    @XmlEnumValue("UR8")
    UR_8("UR8"),
    @XmlEnumValue("US3")
    US_3("US3"),
    @XmlEnumValue("US4")
    US_4("US4"),
    @XmlEnumValue("UT1")
    UT_1("UT1"),
    @XmlEnumValue("UT2")
    UT_2("UT2"),
    @XmlEnumValue("VF1")
    VF_1("VF1"),
    @XmlEnumValue("X01")
    X_01("X01"),
    @XmlEnumValue("X02")
    X_02("X02");
    private final String value;

    FundingMechanism(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FundingMechanism fromValue(String v) {
        for (FundingMechanism c: FundingMechanism.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
