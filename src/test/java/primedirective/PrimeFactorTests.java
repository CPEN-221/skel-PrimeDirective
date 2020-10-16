package primedirective;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PrimeFactorTests {

    /* the timeout interval per test is 12 seconds */
    private static int TIMEOUT = 12;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(TIMEOUT);

    @Test
    public void test_PrimeFactorSequence_1() {
        PrimeFactorSequence pfs = new PrimeFactorSequence(1);
        List<Integer> expOutput = Arrays.asList(0, 0);
        assertEquals(expOutput, pfs.primeFactorSequence());
    }

    @Test
    public void test_PrimeFactorSequence_2() {
        PrimeFactorSequence pfs = new PrimeFactorSequence(2);
        List<Integer> expOutput = Arrays.asList(0, 0, 1);
        assertEquals(expOutput, pfs.primeFactorSequence());
    }

    @Test
    public void test_PrimeFactorSequence_7() {
        PrimeFactorSequence pfs = new PrimeFactorSequence(7);
        List<Integer> expOutput = Arrays.asList(0, 0, 1, 1, 2, 1, 2, 1);
        assertEquals(expOutput, pfs.primeFactorSequence());
    }

    @Test
    public void test_numbersWithMPrimeFactors_1_1() {
        PrimeFactorSequence pfs = new PrimeFactorSequence(1);
        List<Integer> expOutput = Arrays.asList();
        assertEquals(expOutput, pfs.numbersWithMPrimeFactors(1));
    }


    @Test
    public void test_numbersWithMPrimeFactors_1_7() {
        PrimeFactorSequence pfs = new PrimeFactorSequence(7);
        List<Integer> expOutput = Arrays.asList(2, 3, 5, 7);
        assertEquals(expOutput, pfs.numbersWithMPrimeFactors(1));
    }

    @Test
    public void test_numbersWithMPrimeFactors_2_11() {
        PrimeFactorSequence pfs = new PrimeFactorSequence(11);
        List<Integer> expOutput = Arrays.asList(4, 6, 9, 10);
        assertEquals(expOutput, pfs.numbersWithMPrimeFactors(2));
    }

    @Test
    public void test_numbersWithMPrimeFactors_3_20() {
        PrimeFactorSequence pfs = new PrimeFactorSequence(20);
        List<Integer> expOutput = Arrays.asList(8, 12, 18, 20);
        assertEquals(expOutput, pfs.numbersWithMPrimeFactors(3));
    }

    @Test
    public void test_numbersWithMPrimeFactorsAndSmallGap_3_25_2() {
        PrimeFactorSequence pfs = new PrimeFactorSequence(20);
        List<IntPair> expOutput = Arrays.asList(new IntPair(18, 20));
        assertEquals(expOutput, pfs.numbersWithMPrimeFactorsAndSmallGap(3, 2));
    }

    @Test
    public void test_numbersWithMPrimeFactorsAndSmallGap_3_100_2() {
        PrimeFactorSequence pfs = new PrimeFactorSequence(100);
        List<IntPair> expOutput = Arrays.asList(
            new IntPair(18, 20),
            new IntPair(27, 28),
            new IntPair(28, 30),
            new IntPair(42, 44),
            new IntPair(44, 45),
            new IntPair(50, 52),
            new IntPair(66, 68),
            new IntPair(68, 70),
            new IntPair(75, 76),
            new IntPair(76, 78),
            new IntPair(98, 99)
        );
        assertEquals(expOutput, pfs.numbersWithMPrimeFactorsAndSmallGap(3, 2));
    }

    @Test
    public void test_numbersWithMPrimeFactorsAndSmallGap_4_10000_4() {
        PrimeFactorSequence pfs = new PrimeFactorSequence(10000);
        List<IntPair> expOutput = Arrays
            .asList(new IntPair(18, 20), new IntPair(27, 28), new IntPair(28, 30),
                new IntPair(42, 44), new IntPair(44, 45), new IntPair(50, 52), new IntPair(66, 68),
                new IntPair(68, 70), new IntPair(75, 76), new IntPair(76, 78), new IntPair(98, 99),
                new IntPair(114, 116), new IntPair(116, 117), new IntPair(124, 125),
                new IntPair(147, 148), new IntPair(153, 154), new IntPair(164, 165),
                new IntPair(170, 171), new IntPair(171, 172), new IntPair(172, 174),
                new IntPair(174, 175), new IntPair(186, 188), new IntPair(188, 190),
                new IntPair(230, 231), new IntPair(236, 238), new IntPair(242, 244),
                new IntPair(244, 245), new IntPair(245, 246), new IntPair(266, 268),
                new IntPair(273, 275), new IntPair(282, 284), new IntPair(284, 285),
                new IntPair(285, 286), new IntPair(290, 292), new IntPair(316, 318),
                new IntPair(332, 333), new IntPair(343, 345), new IntPair(354, 356),
                new IntPair(356, 357), new IntPair(369, 370), new IntPair(385, 387),
                new IntPair(387, 388), new IntPair(402, 404), new IntPair(404, 406),
                new IntPair(410, 412), new IntPair(423, 425), new IntPair(425, 426),
                new IntPair(426, 428), new IntPair(428, 429), new IntPair(429, 430),
                new IntPair(434, 435), new IntPair(435, 436), new IntPair(436, 438),
                new IntPair(474, 475), new IntPair(475, 477), new IntPair(506, 507),
                new IntPair(507, 508), new IntPair(530, 531), new IntPair(548, 549),
                new IntPair(555, 556), new IntPair(574, 575), new IntPair(595, 596),
                new IntPair(596, 598), new IntPair(602, 603), new IntPair(603, 604),
                new IntPair(604, 605), new IntPair(605, 606), new IntPair(609, 610),
                new IntPair(627, 628), new IntPair(637, 638), new IntPair(638, 639),
                new IntPair(645, 646), new IntPair(651, 652), new IntPair(652, 654),
                new IntPair(657, 658), new IntPair(663, 665), new IntPair(668, 670),
                new IntPair(710, 711), new IntPair(715, 716), new IntPair(722, 724),
                new IntPair(724, 725), new IntPair(741, 742), new IntPair(762, 764),
                new IntPair(775, 777), new IntPair(786, 788), new IntPair(788, 790),
                new IntPair(795, 796), new IntPair(805, 806), new IntPair(833, 834),
                new IntPair(844, 845), new IntPair(845, 847), new IntPair(873, 874),
                new IntPair(890, 892), new IntPair(892, 894), new IntPair(902, 903),
                new IntPair(906, 908), new IntPair(908, 909), new IntPair(915, 916),
                new IntPair(925, 927), new IntPair(931, 932), new IntPair(956, 957),
                new IntPair(962, 963), new IntPair(963, 964), new IntPair(969, 970),
                new IntPair(986, 987), new IntPair(1001, 1002), new IntPair(1002, 1004),
                new IntPair(1004, 1005), new IntPair(1015, 1017), new IntPair(1022, 1023),
                new IntPair(1023, 1025), new IntPair(1028, 1030), new IntPair(1052, 1054),
                new IntPair(1065, 1066), new IntPair(1074, 1075), new IntPair(1075, 1076),
                new IntPair(1083, 1084), new IntPair(1084, 1085), new IntPair(1085, 1086),
                new IntPair(1105, 1106), new IntPair(1106, 1108), new IntPair(1130, 1131),
                new IntPair(1131, 1132), new IntPair(1172, 1173), new IntPair(1173, 1175),
                new IntPair(1178, 1179), new IntPair(1182, 1183), new IntPair(1183, 1185),
                new IntPair(1221, 1222), new IntPair(1233, 1235), new IntPair(1244, 1245),
                new IntPair(1245, 1246), new IntPair(1251, 1252), new IntPair(1265, 1266),
                new IntPair(1266, 1268), new IntPair(1268, 1270), new IntPair(1309, 1310),
                new IntPair(1310, 1311), new IntPair(1324, 1325), new IntPair(1334, 1335),
                new IntPair(1341, 1342), new IntPair(1358, 1359), new IntPair(1388, 1390),
                new IntPair(1394, 1396), new IntPair(1396, 1398), new IntPair(1406, 1407),
                new IntPair(1412, 1413), new IntPair(1413, 1414), new IntPair(1419, 1421),
                new IntPair(1434, 1435), new IntPair(1435, 1436), new IntPair(1442, 1443),
                new IntPair(1443, 1445), new IntPair(1445, 1446), new IntPair(1462, 1463),
                new IntPair(1467, 1468), new IntPair(1474, 1475), new IntPair(1490, 1491),
                new IntPair(1491, 1492), new IntPair(1503, 1505), new IntPair(1505, 1506),
                new IntPair(1515, 1516), new IntPair(1525, 1526), new IntPair(1532, 1533),
                new IntPair(1533, 1534), new IntPair(1545, 1547), new IntPair(1556, 1557),
                new IntPair(1557, 1558), new IntPair(1581, 1582), new IntPair(1586, 1587),
                new IntPair(1587, 1588), new IntPair(1598, 1599), new IntPair(1604, 1605),
                new IntPair(1605, 1606), new IntPair(1614, 1615), new IntPair(1629, 1630),
                new IntPair(1634, 1635), new IntPair(1635, 1636), new IntPair(1675, 1676),
                new IntPair(1676, 1677), new IntPair(1682, 1684), new IntPair(1684, 1686),
                new IntPair(1729, 1730), new IntPair(1730, 1732), new IntPair(1737, 1738),
                new IntPair(1742, 1743), new IntPair(1756, 1758), new IntPair(1771, 1772),
                new IntPair(1772, 1773), new IntPair(1773, 1775), new IntPair(1790, 1791),
                new IntPair(1796, 1798), new IntPair(1825, 1826), new IntPair(1826, 1828),
                new IntPair(1833, 1834), new IntPair(1842, 1844), new IntPair(1844, 1846),
                new IntPair(1866, 1868), new IntPair(1868, 1869), new IntPair(1885, 1886),
                new IntPair(1886, 1887), new IntPair(1898, 1899), new IntPair(1916, 1918),
                new IntPair(1946, 1947), new IntPair(1947, 1948), new IntPair(1964, 1965),
                new IntPair(2006, 2007), new IntPair(2007, 2009), new IntPair(2012, 2013),
                new IntPair(2013, 2014), new IntPair(2014, 2015), new IntPair(2022, 2023),
                new IntPair(2035, 2036), new IntPair(2036, 2037), new IntPair(2054, 2055),
                new IntPair(2055, 2057), new IntPair(2065, 2067), new IntPair(2074, 2075),
                new IntPair(2082, 2084), new IntPair(2084, 2085), new IntPair(2085, 2086),
                new IntPair(2091, 2092), new IntPair(2092, 2093), new IntPair(2093, 2094),
                new IntPair(2107, 2109), new IntPair(2109, 2110), new IntPair(2134, 2135),
                new IntPair(2162, 2163), new IntPair(2163, 2164), new IntPair(2197, 2198),
                new IntPair(2228, 2230), new IntPair(2233, 2235), new IntPair(2259, 2261),
                new IntPair(2265, 2266), new IntPair(2274, 2276), new IntPair(2276, 2278),
                new IntPair(2282, 2284), new IntPair(2289, 2290), new IntPair(2298, 2299),
                new IntPair(2299, 2301), new IntPair(2301, 2303), new IntPair(2313, 2314),
                new IntPair(2337, 2338), new IntPair(2343, 2345), new IntPair(2354, 2355),
                new IntPair(2365, 2367), new IntPair(2372, 2373), new IntPair(2378, 2379),
                new IntPair(2396, 2397), new IntPair(2397, 2398), new IntPair(2404, 2405),
                new IntPair(2405, 2406), new IntPair(2409, 2410), new IntPair(2421, 2422),
                new IntPair(2438, 2439), new IntPair(2451, 2452), new IntPair(2452, 2454),
                new IntPair(2485, 2486), new IntPair(2493, 2494), new IntPair(2505, 2506),
                new IntPair(2522, 2523), new IntPair(2523, 2524), new IntPair(2524, 2525),
                new IntPair(2525, 2526), new IntPair(2526, 2527), new IntPair(2527, 2529),
                new IntPair(2546, 2547), new IntPair(2553, 2555), new IntPair(2570, 2572),
                new IntPair(2585, 2586), new IntPair(2586, 2588), new IntPair(2595, 2597),
                new IntPair(2597, 2598), new IntPair(2612, 2613), new IntPair(2634, 2635),
                new IntPair(2635, 2636), new IntPair(2636, 2637), new IntPair(2637, 2639),
                new IntPair(2644, 2645), new IntPair(2665, 2666), new IntPair(2666, 2667),
                new IntPair(2674, 2675), new IntPair(2678, 2679), new IntPair(2685, 2686),
                new IntPair(2690, 2692), new IntPair(2692, 2694), new IntPair(2697, 2698),
                new IntPair(2702, 2703), new IntPair(2708, 2710), new IntPair(2714, 2715),
                new IntPair(2715, 2717), new IntPair(2725, 2726), new IntPair(2737, 2738),
                new IntPair(2738, 2739), new IntPair(2763, 2764), new IntPair(2764, 2765),
                new IntPair(2765, 2766), new IntPair(2769, 2770), new IntPair(2782, 2783),
                new IntPair(2794, 2795), new IntPair(2802, 2804), new IntPair(2804, 2806),
                new IntPair(2821, 2822), new IntPair(2829, 2830), new IntPair(2834, 2836),
                new IntPair(2847, 2849), new IntPair(2873, 2874), new IntPair(2874, 2876),
                new IntPair(2876, 2877), new IntPair(2882, 2883), new IntPair(2914, 2915),
                new IntPair(2930, 2932), new IntPair(2937, 2938), new IntPair(2945, 2946),
                new IntPair(2954, 2955), new IntPair(2955, 2956), new IntPair(3002, 3004),
                new IntPair(3026, 3028), new IntPair(3033, 3034), new IntPair(3054, 3055),
                new IntPair(3058, 3059), new IntPair(3074, 3076), new IntPair(3081, 3082),
                new IntPair(3110, 3111), new IntPair(3122, 3123), new IntPair(3129, 3130),
                new IntPair(3170, 3171), new IntPair(3175, 3177), new IntPair(3177, 3178),
                new IntPair(3178, 3179), new IntPair(3236, 3237), new IntPair(3243, 3244),
                new IntPair(3244, 3245), new IntPair(3245, 3246), new IntPair(3282, 3283),
                new IntPair(3283, 3284), new IntPair(3284, 3286), new IntPair(3297, 3298),
                new IntPair(3302, 3303), new IntPair(3308, 3310), new IntPair(3310, 3311),
                new IntPair(3333, 3335), new IntPair(3345, 3346), new IntPair(3355, 3356),
                new IntPair(3356, 3357), new IntPair(3357, 3358), new IntPair(3362, 3363),
                new IntPair(3405, 3406), new IntPair(3411, 3412), new IntPair(3412, 3414),
                new IntPair(3422, 3423), new IntPair(3423, 3425), new IntPair(3425, 3426),
                new IntPair(3426, 3428), new IntPair(3434, 3435), new IntPair(3435, 3436),
                new IntPair(3445, 3447), new IntPair(3451, 3452), new IntPair(3452, 3454),
                new IntPair(3470, 3471), new IntPair(3475, 3477), new IntPair(3477, 3478),
                new IntPair(3478, 3479), new IntPair(3501, 3502), new IntPair(3507, 3508),
                new IntPair(3508, 3509), new IntPair(3514, 3515), new IntPair(3522, 3524),
                new IntPair(3524, 3526), new IntPair(3530, 3531), new IntPair(3531, 3532),
                new IntPair(3565, 3567), new IntPair(3585, 3586), new IntPair(3597, 3598),
                new IntPair(3605, 3606), new IntPair(3614, 3615), new IntPair(3619, 3621),
                new IntPair(3633, 3634), new IntPair(3642, 3644), new IntPair(3655, 3657),
                new IntPair(3657, 3658), new IntPair(3674, 3676), new IntPair(3676, 3678),
                new IntPair(3681, 3682), new IntPair(3685, 3686), new IntPair(3702, 3703),
                new IntPair(3714, 3716), new IntPair(3723, 3725), new IntPair(3729, 3730),
                new IntPair(3730, 3731), new IntPair(3757, 3759), new IntPair(3764, 3765),
                new IntPair(3765, 3766), new IntPair(3782, 3783), new IntPair(3786, 3788),
                new IntPair(3788, 3789), new IntPair(3789, 3790), new IntPair(3812, 3813),
                new IntPair(3813, 3815), new IntPair(3818, 3819), new IntPair(3854, 3855),
                new IntPair(3855, 3857), new IntPair(3857, 3858), new IntPair(3878, 3879),
                new IntPair(3882, 3884), new IntPair(3884, 3886), new IntPair(3886, 3887),
                new IntPair(3895, 3897), new IntPair(3913, 3914), new IntPair(3925, 3926),
                new IntPair(3932, 3934), new IntPair(3938, 3939), new IntPair(3954, 3955),
                new IntPair(3962, 3964), new IntPair(3964, 3965), new IntPair(3965, 3966),
                new IntPair(3970, 3971), new IntPair(3987, 3988), new IntPair(4010, 4011),
                new IntPair(4015, 4017), new IntPair(4035, 4036), new IntPair(4036, 4038),
                new IntPair(4041, 4042), new IntPair(4052, 4053), new IntPair(4065, 4066),
                new IntPair(4066, 4067), new IntPair(4075, 4076), new IntPair(4081, 4082),
                new IntPair(4082, 4084), new IntPair(4084, 4085), new IntPair(4089, 4090),
                new IntPair(4123, 4124), new IntPair(4146, 4147), new IntPair(4147, 4149),
                new IntPair(4154, 4155), new IntPair(4155, 4156), new IntPair(4173, 4175),
                new IntPair(4190, 4191), new IntPair(4202, 4203), new IntPair(4203, 4204),
                new IntPair(4204, 4205), new IntPair(4205, 4206), new IntPair(4209, 4210),
                new IntPair(4233, 4234), new IntPair(4244, 4245), new IntPair(4245, 4246),
                new IntPair(4251, 4252), new IntPair(4252, 4254), new IntPair(4254, 4255),
                new IntPair(4276, 4277), new IntPair(4310, 4311), new IntPair(4323, 4325),
                new IntPair(4345, 4346), new IntPair(4346, 4348), new IntPair(4354, 4355),
                new IntPair(4361, 4362), new IntPair(4362, 4364), new IntPair(4364, 4366),
                new IntPair(4371, 4372), new IntPair(4382, 4383), new IntPair(4388, 4390),
                new IntPair(4402, 4403), new IntPair(4418, 4419), new IntPair(4430, 4431),
                new IntPair(4431, 4433), new IntPair(4433, 4434), new IntPair(4434, 4436),
                new IntPair(4436, 4438), new IntPair(4475, 4477), new IntPair(4490, 4491),
                new IntPair(4491, 4492), new IntPair(4503, 4505), new IntPair(4505, 4506),
                new IntPair(4514, 4516), new IntPair(4525, 4526), new IntPair(4526, 4527),
                new IntPair(4542, 4543), new IntPair(4565, 4566), new IntPair(4581, 4582),
                new IntPair(4585, 4587), new IntPair(4604, 4605), new IntPair(4610, 4611),
                new IntPair(4611, 4612), new IntPair(4612, 4614), new IntPair(4614, 4615),
                new IntPair(4652, 4654), new IntPair(4669, 4670), new IntPair(4683, 4684),
                new IntPair(4693, 4695), new IntPair(4695, 4697), new IntPair(4706, 4707),
                new IntPair(4722, 4724), new IntPair(4724, 4726), new IntPair(4753, 4755),
                new IntPair(4772, 4773), new IntPair(4773, 4775), new IntPair(4804, 4805),
                new IntPair(4805, 4807), new IntPair(4807, 4809), new IntPair(4823, 4825),
                new IntPair(4825, 4826), new IntPair(4852, 4854), new IntPair(4865, 4866),
                new IntPair(4866, 4868), new IntPair(4868, 4869), new IntPair(4869, 4870),
                new IntPair(4892, 4893), new IntPair(4893, 4895), new IntPair(4898, 4899),
                new IntPair(4899, 4901), new IntPair(4916, 4917), new IntPair(4921, 4922),
                new IntPair(4922, 4923), new IntPair(4923, 4924), new IntPair(4924, 4925),
                new IntPair(4925, 4926), new IntPair(4945, 4947), new IntPair(4947, 4948),
                new IntPair(4948, 4949), new IntPair(4961, 4962), new IntPair(4965, 4966),
                new IntPair(4974, 4975), new IntPair(4982, 4983), new IntPair(4990, 4991),
                new IntPair(4994, 4996), new IntPair(5013, 5014), new IntPair(5014, 5015),
                new IntPair(5018, 5019), new IntPair(5034, 5035), new IntPair(5035, 5036),
                new IntPair(5036, 5037), new IntPair(5037, 5038), new IntPair(5066, 5067),
                new IntPair(5073, 5074), new IntPair(5108, 5109), new IntPair(5116, 5117),
                new IntPair(5117, 5118), new IntPair(5121, 5122), new IntPair(5132, 5133),
                new IntPair(5133, 5134), new IntPair(5134, 5135), new IntPair(5138, 5139),
                new IntPair(5154, 5156), new IntPair(5162, 5164), new IntPair(5203, 5204),
                new IntPair(5204, 5205), new IntPair(5205, 5206), new IntPair(5210, 5212),
                new IntPair(5215, 5217), new IntPair(5228, 5230), new IntPair(5253, 5254),
                new IntPair(5275, 5276), new IntPair(5282, 5283), new IntPair(5283, 5284),
                new IntPair(5284, 5285), new IntPair(5285, 5286), new IntPair(5289, 5291),
                new IntPair(5306, 5307), new IntPair(5307, 5308), new IntPair(5335, 5337),
                new IntPair(5337, 5338), new IntPair(5341, 5343), new IntPair(5395, 5397),
                new IntPair(5409, 5410), new IntPair(5421, 5423), new IntPair(5442, 5444),
                new IntPair(5444, 5446), new IntPair(5451, 5453), new IntPair(5466, 5467),
                new IntPair(5467, 5468), new IntPair(5468, 5470), new IntPair(5486, 5487),
                new IntPair(5491, 5492), new IntPair(5492, 5494), new IntPair(5494, 5495),
                new IntPair(5517, 5518), new IntPair(5522, 5523), new IntPair(5523, 5524),
                new IntPair(5546, 5547), new IntPair(5551, 5553), new IntPair(5553, 5555),
                new IntPair(5558, 5559), new IntPair(5570, 5571), new IntPair(5574, 5575),
                new IntPair(5593, 5595), new IntPair(5595, 5596), new IntPair(5621, 5622),
                new IntPair(5673, 5675), new IntPair(5678, 5679), new IntPair(5679, 5681),
                new IntPair(5681, 5682), new IntPair(5685, 5687), new IntPair(5690, 5691),
                new IntPair(5691, 5692), new IntPair(5708, 5709), new IntPair(5709, 5710),
                new IntPair(5716, 5718), new IntPair(5718, 5719), new IntPair(5725, 5726),
                new IntPair(5726, 5727), new IntPair(5732, 5734), new IntPair(5734, 5735),
                new IntPair(5756, 5757), new IntPair(5762, 5763), new IntPair(5769, 5770),
                new IntPair(5785, 5786), new IntPair(5786, 5787), new IntPair(5787, 5788),
                new IntPair(5795, 5797), new IntPair(5797, 5798), new IntPair(5802, 5804),
                new IntPair(5811, 5812), new IntPair(5817, 5819), new IntPair(5822, 5823),
                new IntPair(5823, 5825), new IntPair(5825, 5826), new IntPair(5835, 5836),
                new IntPair(5845, 5846), new IntPair(5862, 5863), new IntPair(5870, 5871),
                new IntPair(5882, 5883), new IntPair(5883, 5884), new IntPair(5884, 5885),
                new IntPair(5885, 5887), new IntPair(5887, 5889), new IntPair(5901, 5902),
                new IntPair(5930, 5931), new IntPair(5931, 5932), new IntPair(5943, 5945),
                new IntPair(5945, 5946), new IntPair(5946, 5948), new IntPair(5948, 5949),
                new IntPair(5954, 5955), new IntPair(5955, 5956), new IntPair(5956, 5957),
                new IntPair(5972, 5973), new IntPair(5973, 5974), new IntPair(5974, 5975),
                new IntPair(5995, 5996), new IntPair(6014, 6015), new IntPair(6025, 6026),
                new IntPair(6034, 6035), new IntPair(6054, 6055), new IntPair(6055, 6057),
                new IntPair(6057, 6058), new IntPair(6061, 6062), new IntPair(6062, 6063),
                new IntPair(6092, 6093), new IntPair(6093, 6094), new IntPair(6094, 6095),
                new IntPair(6095, 6097), new IntPair(6097, 6099), new IntPair(6123, 6124),
                new IntPair(6124, 6126), new IntPair(6135, 6137), new IntPair(6141, 6142),
                new IntPair(6146, 6147), new IntPair(6147, 6149), new IntPair(6153, 6154),
                new IntPair(6170, 6172), new IntPair(6194, 6196), new IntPair(6196, 6198),
                new IntPair(6205, 6206), new IntPair(6212, 6213), new IntPair(6213, 6214),
                new IntPair(6214, 6215), new IntPair(6234, 6235), new IntPair(6235, 6236),
                new IntPair(6251, 6253), new IntPair(6253, 6254), new IntPair(6265, 6266),
                new IntPair(6266, 6268), new IntPair(6284, 6285), new IntPair(6285, 6286),
                new IntPair(6293, 6294), new IntPair(6302, 6303), new IntPair(6303, 6305),
                new IntPair(6305, 6306), new IntPair(6306, 6307), new IntPair(6307, 6309),
                new IntPair(6309, 6310), new IntPair(6315, 6316), new IntPair(6355, 6357),
                new IntPair(6365, 6366), new IntPair(6386, 6388), new IntPair(6409, 6410),
                new IntPair(6413, 6414), new IntPair(6428, 6430), new IntPair(6446, 6447),
                new IntPair(6452, 6454), new IntPair(6465, 6466), new IntPair(6470, 6471),
                new IntPair(6476, 6477), new IntPair(6477, 6478), new IntPair(6478, 6479),
                new IntPair(6482, 6484), new IntPair(6494, 6495), new IntPair(6530, 6531),
                new IntPair(6546, 6548), new IntPair(6548, 6549), new IntPair(6565, 6567),
                new IntPair(6573, 6574), new IntPair(6574, 6575), new IntPair(6585, 6586),
                new IntPair(6601, 6603), new IntPair(6627, 6628), new IntPair(6643, 6645),
                new IntPair(6645, 6647), new IntPair(6651, 6652), new IntPair(6652, 6654),
                new IntPair(6674, 6676), new IntPair(6681, 6682), new IntPair(6685, 6687),
                new IntPair(6693, 6695), new IntPair(6713, 6715), new IntPair(6725, 6727),
                new IntPair(6745, 6747), new IntPair(6754, 6755), new IntPair(6758, 6759),
                new IntPair(6770, 6771), new IntPair(6771, 6772), new IntPair(6772, 6774),
                new IntPair(6774, 6775), new IntPair(6788, 6789), new IntPair(6794, 6796),
                new IntPair(6811, 6813), new IntPair(6813, 6815), new IntPair(6836, 6837),
                new IntPair(6837, 6838), new IntPair(6849, 6851), new IntPair(6851, 6853),
                new IntPair(6853, 6854), new IntPair(6854, 6855), new IntPair(6873, 6874),
                new IntPair(6877, 6878), new IntPair(6884, 6886), new IntPair(6918, 6919),
                new IntPair(6919, 6921), new IntPair(6921, 6923), new IntPair(6923, 6925),
                new IntPair(6945, 6946), new IntPair(6955, 6957), new IntPair(6962, 6963),
                new IntPair(6963, 6964), new IntPair(6964, 6965), new IntPair(6985, 6986),
                new IntPair(6986, 6987), new IntPair(6987, 6988), new IntPair(7005, 7006),
                new IntPair(7010, 7012), new IntPair(7025, 7026), new IntPair(7075, 7077),
                new IntPair(7083, 7085), new IntPair(7085, 7086), new IntPair(7089, 7090),
                new IntPair(7107, 7108), new IntPair(7138, 7139), new IntPair(7156, 7158),
                new IntPair(7173, 7174), new IntPair(7189, 7190), new IntPair(7202, 7204),
                new IntPair(7204, 7205), new IntPair(7205, 7206), new IntPair(7221, 7222),
                new IntPair(7257, 7258), new IntPair(7258, 7259), new IntPair(7281, 7282),
                new IntPair(7285, 7287), new IntPair(7292, 7294), new IntPair(7298, 7299),
                new IntPair(7299, 7301), new IntPair(7301, 7302), new IntPair(7305, 7306),
                new IntPair(7322, 7324), new IntPair(7324, 7325), new IntPair(7329, 7330),
                new IntPair(7337, 7338), new IntPair(7345, 7347), new IntPair(7358, 7359),
                new IntPair(7365, 7366), new IntPair(7381, 7383), new IntPair(7383, 7385),
                new IntPair(7385, 7386), new IntPair(7386, 7388), new IntPair(7388, 7389),
                new IntPair(7389, 7390), new IntPair(7413, 7414), new IntPair(7429, 7430),
                new IntPair(7442, 7443), new IntPair(7443, 7444), new IntPair(7467, 7468),
                new IntPair(7468, 7469), new IntPair(7473, 7474), new IntPair(7484, 7485),
                new IntPair(7485, 7486), new IntPair(7491, 7492), new IntPair(7492, 7494),
                new IntPair(7503, 7505), new IntPair(7508, 7510), new IntPair(7510, 7511),
                new IntPair(7526, 7527), new IntPair(7551, 7553), new IntPair(7553, 7554),
                new IntPair(7554, 7556), new IntPair(7556, 7557), new IntPair(7565, 7567),
                new IntPair(7598, 7599), new IntPair(7610, 7611), new IntPair(7634, 7635),
                new IntPair(7652, 7654), new IntPair(7657, 7658), new IntPair(7674, 7675),
                new IntPair(7675, 7677), new IntPair(7677, 7678), new IntPair(7682, 7683),
                new IntPair(7683, 7685), new IntPair(7689, 7690), new IntPair(7705, 7707),
                new IntPair(7718, 7719), new IntPair(7730, 7731), new IntPair(7731, 7732),
                new IntPair(7732, 7733), new IntPair(7733, 7734), new IntPair(7766, 7767),
                new IntPair(7775, 7777), new IntPair(7796, 7797), new IntPair(7797, 7798),
                new IntPair(7802, 7804), new IntPair(7804, 7805), new IntPair(7805, 7806),
                new IntPair(7842, 7843), new IntPair(7843, 7845), new IntPair(7845, 7847),
                new IntPair(7869, 7870), new IntPair(7881, 7882), new IntPair(7885, 7887),
                new IntPair(7892, 7893), new IntPair(7914, 7916), new IntPair(7916, 7918),
                new IntPair(7922, 7923), new IntPair(7923, 7925), new IntPair(7925, 7926),
                new IntPair(7929, 7931), new IntPair(7943, 7945), new IntPair(7945, 7946),
                new IntPair(7946, 7947), new IntPair(7947, 7948), new IntPair(7953, 7954),
                new IntPair(7954, 7955), new IntPair(7958, 7959), new IntPair(7970, 7972),
                new IntPair(7972, 7973), new IntPair(7982, 7983), new IntPair(7987, 7988),
                new IntPair(7994, 7996), new IntPair(8041, 8043), new IntPair(8043, 8044),
                new IntPair(8066, 8068), new IntPair(8107, 8108), new IntPair(8108, 8110),
                new IntPair(8113, 8115), new IntPair(8115, 8116), new IntPair(8155, 8156),
                new IntPair(8163, 8165), new IntPair(8165, 8166), new IntPair(8194, 8195),
                new IntPair(8205, 8206), new IntPair(8210, 8212), new IntPair(8229, 8230),
                new IntPair(8238, 8239), new IntPair(8239, 8241), new IntPair(8241, 8242),
                new IntPair(8270, 8271), new IntPair(8275, 8276), new IntPair(8276, 8277),
                new IntPair(8282, 8283), new IntPair(8302, 8303), new IntPair(8303, 8305),
                new IntPair(8323, 8324), new IntPair(8324, 8326), new IntPair(8337, 8338),
                new IntPair(8355, 8356), new IntPair(8361, 8362), new IntPair(8365, 8366),
                new IntPair(8393, 8394), new IntPair(8394, 8395), new IntPair(8395, 8396),
                new IntPair(8425, 8426), new IntPair(8426, 8427), new IntPair(8433, 8435),
                new IntPair(8435, 8437), new IntPair(8437, 8439), new IntPair(8444, 8445),
                new IntPair(8445, 8446), new IntPair(8452, 8454), new IntPair(8454, 8455),
                new IntPair(8493, 8494), new IntPair(8515, 8516), new IntPair(8516, 8517),
                new IntPair(8523, 8524), new IntPair(8533, 8534), new IntPair(8534, 8535),
                new IntPair(8562, 8564), new IntPair(8564, 8565), new IntPair(8569, 8570),
                new IntPair(8570, 8572), new IntPair(8572, 8574), new IntPair(8589, 8590),
                new IntPair(8590, 8591), new IntPair(8606, 8607), new IntPair(8612, 8614),
                new IntPair(8634, 8635), new IntPair(8642, 8643), new IntPair(8643, 8644),
                new IntPair(8686, 8687), new IntPair(8695, 8697), new IntPair(8701, 8702),
                new IntPair(8702, 8703), new IntPair(8716, 8718), new IntPair(8723, 8725),
                new IntPair(8733, 8734), new IntPair(8738, 8739), new IntPair(8754, 8755),
                new IntPair(8762, 8763), new IntPair(8769, 8770), new IntPair(8770, 8771),
                new IntPair(8785, 8786), new IntPair(8786, 8787), new IntPair(8787, 8789),
                new IntPair(8798, 8799), new IntPair(8810, 8812), new IntPair(8822, 8823),
                new IntPair(8823, 8825), new IntPair(8825, 8826), new IntPair(8826, 8827),
                new IntPair(8827, 8828), new IntPair(8828, 8830), new IntPair(8833, 8834),
                new IntPair(8845, 8847), new IntPair(8852, 8853), new IntPair(8853, 8854),
                new IntPair(8869, 8870), new IntPair(8877, 8878), new IntPair(8884, 8886),
                new IntPair(8895, 8897), new IntPair(8897, 8898), new IntPair(8905, 8906),
                new IntPair(8942, 8943), new IntPair(8948, 8949), new IntPair(8956, 8957),
                new IntPair(8957, 8958), new IntPair(8958, 8959), new IntPair(8959, 8961),
                new IntPair(8972, 8973), new IntPair(8973, 8974), new IntPair(8974, 8975),
                new IntPair(8978, 8979), new IntPair(8985, 8987), new IntPair(8993, 8994),
                new IntPair(8994, 8995), new IntPair(9002, 9004), new IntPair(9021, 9022),
                new IntPair(9061, 9062), new IntPair(9066, 9068), new IntPair(9068, 9070),
                new IntPair(9074, 9076), new IntPair(9081, 9082), new IntPair(9085, 9087),
                new IntPair(9092, 9093), new IntPair(9093, 9095), new IntPair(9105, 9106),
                new IntPair(9117, 9118), new IntPair(9138, 9139), new IntPair(9139, 9141),
                new IntPair(9141, 9142), new IntPair(9145, 9146), new IntPair(9146, 9148),
                new IntPair(9158, 9159), new IntPair(9171, 9172), new IntPair(9185, 9186),
                new IntPair(9186, 9188), new IntPair(9188, 9189), new IntPair(9189, 9190),
                new IntPair(9190, 9191), new IntPair(9213, 9214), new IntPair(9214, 9215),
                new IntPair(9218, 9219), new IntPair(9236, 9238), new IntPair(9244, 9245),
                new IntPair(9254, 9255), new IntPair(9265, 9266), new IntPair(9290, 9291),
                new IntPair(9321, 9322), new IntPair(9331, 9332), new IntPair(9332, 9334),
                new IntPair(9354, 9356), new IntPair(9359, 9361), new IntPair(9361, 9362),
                new IntPair(9362, 9364), new IntPair(9373, 9374), new IntPair(9398, 9399),
                new IntPair(9399, 9401), new IntPair(9401, 9402), new IntPair(9402, 9404),
                new IntPair(9415, 9417), new IntPair(9417, 9418), new IntPair(9426, 9428),
                new IntPair(9428, 9429), new IntPair(9441, 9443), new IntPair(9453, 9454),
                new IntPair(9454, 9455), new IntPair(9455, 9457), new IntPair(9457, 9459),
                new IntPair(9474, 9475), new IntPair(9482, 9483), new IntPair(9483, 9484),
                new IntPair(9484, 9485), new IntPair(9498, 9499), new IntPair(9514, 9515),
                new IntPair(9524, 9526), new IntPair(9530, 9532), new IntPair(9541, 9542),
                new IntPair(9554, 9556), new IntPair(9579, 9581), new IntPair(9581, 9582),
                new IntPair(9582, 9583), new IntPair(9595, 9596), new IntPair(9596, 9597),
                new IntPair(9605, 9606), new IntPair(9621, 9622), new IntPair(9642, 9644),
                new IntPair(9644, 9645), new IntPair(9653, 9654), new IntPair(9668, 9669),
                new IntPair(9669, 9670), new IntPair(9681, 9682), new IntPair(9685, 9686),
                new IntPair(9692, 9694), new IntPair(9694, 9695), new IntPair(9698, 9699),
                new IntPair(9705, 9706), new IntPair(9709, 9710), new IntPair(9714, 9715),
                new IntPair(9715, 9717), new IntPair(9717, 9718), new IntPair(9723, 9725),
                new IntPair(9725, 9726), new IntPair(9746, 9748), new IntPair(9762, 9764),
                new IntPair(9764, 9766), new IntPair(9782, 9783), new IntPair(9783, 9785),
                new IntPair(9788, 9789), new IntPair(9794, 9795), new IntPair(9805, 9807),
                new IntPair(9814, 9815), new IntPair(9819, 9821), new IntPair(9821, 9822),
                new IntPair(9822, 9823), new IntPair(9830, 9831), new IntPair(9835, 9836),
                new IntPair(9836, 9837), new IntPair(9843, 9845), new IntPair(9877, 9878),
                new IntPair(9878, 9879), new IntPair(9908, 9910), new IntPair(9910, 9911),
                new IntPair(9925, 9926), new IntPair(9926, 9927), new IntPair(9970, 9971)
            );
        assertEquals(expOutput, pfs.numbersWithMPrimeFactorsAndSmallGap(3, 2));
    }

    @Test
    public void test_changeToPrime_14() {
        PrimeFactorSequence pfs = new PrimeFactorSequence(1000);
        assertEquals("0", pfs.changeToPrime(14));
    }

    @Test
    public void test_changeToPrime_28() {
        PrimeFactorSequence pfs = new PrimeFactorSequence(1000);
        assertEquals("1", pfs.changeToPrime(28));
    }

    @Test
    public void test_changeToPrime_1001() {
        PrimeFactorSequence pfs = new PrimeFactorSequence(1000);
        assertEquals("-", pfs.changeToPrime(1001));
    }

    @Test
    public void test_changeToPrime_298() {
        PrimeFactorSequence pfs = new PrimeFactorSequence(1000);
        assertEquals("10", pfs.changeToPrime(298));
    }

    @Test
    public void test_changeToPrime_264() {
        PrimeFactorSequence pfs = new PrimeFactorSequence(1000);
        assertEquals("11111", pfs.changeToPrime(264));
    }

    @Test
    public void test_changeToPrime_264_10000() {
        PrimeFactorSequence pfs = new PrimeFactorSequence(10000);
        assertEquals("010", pfs.changeToPrime(264));
    }

    @Test
    public void test_changeToPrime_11() {
        PrimeFactorSequence pfs = new PrimeFactorSequence(1000);
        assertEquals("", pfs.changeToPrime(11));
    }

}
