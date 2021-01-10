package week6.stacksAndQueue;

import java.util.Iterator;
import java.util.Stack;

import org.junit.Test;

public class P2_RemoveAdjacent {

	@Test
	public void example1() {
		String str = "abbaca";
		removeAdjacent(str);
	}

	@Test
	public void example2() {
		String str = "abcde";
		removeAdjacent(str);
	}

	@Test
	public void example3() {
		String str = "ababb";
		removeAdjacent(str);
	}

	@Test
	public void example4() {
		String str = "ccca";
		removeAdjacent(str);
	}

	@Test
	public void example5() {
		String str = "aaaaaaaa";
		removeAdjacent(str);
	}

	@Test
	public void example6() {
		String str = "jbutjpciehqiikgrdbskqnvjejidfnbpdmcjqoenoheecmammqgotsgqulnsuktqklitshtapthuctrjueufamfpdfvuqivlfjvnabaknromorhtcuqliiqrnhraurocpgafqttlkaljpdcbqacsivqjmmkopircuapuhlcglrcjdqdbqqtvsgueflkattvsfhsstucimcsedatolcsgdtnouahubgcfadsdojktdjqbluibmntkjbvjebgtcfehafvatvlgbnegvrtsufmtukoiblfkeqekppfdohlofbifgsauububuiockomkkqpgsnpikpivnvthcceklslhtnhgdanfgdrtvbsjtsrauokeeioladrfjfbpjbotumvckroldfbkmgtqjeknnpifuvtbblfoqcvcufnjmtkleegrllehkamfktrvqoavcnnvpgiieduijugcegtcgbffvkqsfibicmtsvuhivltoabbsoaeifqpatnvibeknsrftrtlgoutubihchgtkercrcamhbodrseppqhabdbmjjdhqhohthpstkmcemgioekijiccjppnbvockstcrvsdjfjrfjtgooqbmfvcgmjhcsuomsejdodfgknikthdrcifveglhkvcbondjtihqbvhrvagjnhlmmsmipbrcikknqpreiscmvejflmgutproamcfequhqfrjoktoutqqfohuaeprkvugicmdodjolbrtroegvhkpimqkpanuqrgmduoaldsvarcambgisbtcvirogtutocrrdjhsaodbnrvjrjfugsjfpkqgdsqaccfcllqttufabqeaqrgmrvrevufqsakvfavbjdhsuhhepqcuuvggcjoomqkrhcqsqscuuevoedhandoebflitksvcqepuqrgqakggjoattjtthefbqragfbvctsijtkfndfihpnqnpedoqvtfnibnjqkqpsfqotbrtcnppsdndmrjbcutaplihellcmcviipfgfqcfcogjlakkrlcundnuvphqbpeekeuagseagbllkfnmakkdkpmvmdnnehrgmqqntqhnmjbreeiogvafefdgqdncpevjombjgedavnmchpeoogulcvcmbgmjoqeejreehcghdncunmftubvludbkftauvedcpogrsfffmqctdvaneqgasakqdsabpmucfguuqdjqpfohbvbkpvchqhogoirqrgaoqtslonohtmqmcvntecinguhnqkmjfsnfcdjuhtbvrebdhjgtbjrrsdgjulctpllvgdpdgbdebqjomnkanocneslrqhsmklsiegtjsaanlenjpjpqlhuicpbspobqqicsshbkralnvnkoaljljooskdgukmbbftvtdfegincbpalfqcurrvlbaefqbsrtcklkamfhbtdulunavocskggluhrasqdvadarannfcuspofhmhjhdfqfbvougcaajdlarduprejhdqunrcqtkcbhjpjkqctalrqnvfcchhbksseptmvqicvabavdsumgbjebvjkhtabnfrhjjhforshbrfarrlekbsuqaqitpfmkbnadedarraekttmendlvqamkmbohvovfksmcuposkeqgamnqhnmjelacbeisscjsbvtfsgihmfekhidgumgnucpshbkpeehdincjupbvbepjijfrpsdovjfdqbicnijaidougheakpiuqamptpqbckijfbcqhmfgltlhhfspsligueshukejoggbklejsfmdndaehviqflpisjrqlustnhdvavksmnoedqcgdkdoljgnltlaljomehjlkamnkdlvtpgbqqnefdtietqknkhtjosnnborchgfickuevgabqdgdavmmijbtcnpeukfadgoetbhlijoalpoggaaanlkkbbbtuuagogntqnmafkupsrehdlqevqefoltnavoapilolfkbdasaiqdmrfcrtiednpjnagtrefulqioqbhfejlncrciscbsuqhfoulhhlncnmatflfknpdvvohkiofuumlnnvhcuhbjsujgippblakbhsmgfkiehndfqmivqejjnolvvtbvscdoobpcsviblhcomlnlrphkvmmmhkvdotrefgfqqhttpiaekhtnocgokfmckbrhorupuqsieqvmnknmftvktpkkhafqigfugibqagckflejppamelfhpjjpdolfnbsirgnkejfcotuhbejpfhignkldtdejluhqkqeimsbsaurtqlbjpavsghplsldhpogmusdfsjfbbbtgasogulujplkpulqtbsrdgtfojugnishrdhcqokegisfcumbehcgrceialqhfmonldtorruofauiaccjkrkpmbjfrogcgtklesbmaptbtdngkgkvuljdkuufvgrtecaqsttkuvanpeeeonefjucihcautlkekusfutauerigubgsaaseucrapeibeocklgbkeuuufufdnnlkmtsrsaqqsiovhdtableqehrvvvnstpvgsdinslfsuvpnqlbruebivjmmacnrrfokcfglviltoqkfqvrheatfpovqoimeerfbskjpckdhaqjvuscudpkktvtrdtccpnjreruvohvipaklblaoumfvmvrdplamjlebmfcciefbbmkkpotmoidgnsimndoflskjsefjbhepvliiogqkfsmqrkhfpgnnbeebsnfbrcpptgqntnrkqlckhvfnkcojabladhbdvsjgcedqdpopcfanadatdadeqhncpbfhlbffvaqonnqttdbqvlmniflisjebtakbmoovuepgitcmogdjndrfjogimnelsaleukqkqfafeomhlmflrbfjaegvlkepecceieqminchdvmskbojujgqqedakbnjebaffneucqofakjloeinphqcoubjolhbrqpdqvseemcjkvnvjrlntqqjvtgcefcenughinshaniucnqagdekagqcmsbrrnhmsrtquhlduqpfqerqfpkmvjibnkfnigjbcudbflksjvimhohdiutpcjtosagoaeuctmjagltlmjontpkfjiqnaevgjimqmvertarmuvvcnhtkhvcnuksqhpghhlvmdkhokfioukktprjrpgeqlddesaldvqjhehggcnkulkccjmjrudtqhutvkflbdsosgjoptjfdlrkjbmqplgttoittisnpicpvgphjoluuppqjmedqlbchbvsedbsfqldjulpcqhufrcfreokgfektiumbuuovtlshvllbdnonghprjshsknsrjlibmmtehbelhsnaqdinoscrfjapftfrhcmiardcmggclcpvfcmsenprqpgrnmjmqlntpvqpbmrvfjipjicqqghhusrpdsgktooaqeduspefsrpuaiuifbiarplcbncbrgvgosqdgujqnkiolnotvrksvvmtensnefcojokolhgqjonkidvhfemvskvkuqffecunmetgahaqnjfsvppfajqaauapcvrrlqivdavnnbocogeaevjnrthdnvkcgajvloogboptprgkhnvjhpoktpbbfshipnreiibmeahnccqafunbkrchqpggeuahlenagbbijdurgcrhtagivvfhcklcqbiflrodrnpufteljngastijgmgtaihmqvhnfnssfguqpgjnoeairejcqegdumivqvmekgafvmmblamqlunlihkjbkktavkqjnnldkgseenbplcjnvpqmijdabsetrsoqjmhtdcmioceigjbjmjonnifvgqkpvaarrucbhrhsqmgrjdchkupgjveucbdfikphgeqevghovpuvktimktangsbanqjpqtjlqdcljhrjkkjdvlftvcqlbjrnkrtojosvapftjsfbdckfkqekitnhirhcaoiathvphsqrfqjtcjfhhberfmekdasqipjmigcvuaqtbrslchjaivokvgkldcqvfcehnquhvvfeskqtlnrqavfhpsuramvdllioqvdrpdimupttpodqlechklqfcebcrpoihtfhibumjodrdmikrtmhdghgrsgacvakocdcepbsjcdjnmjdbdgpcjkvnplhdrnvqefrpkahsrlvebuvmlpqaghdcelfjtkptmfofhdmeuvnqjabetdvsldtahvcniveujdcfajakcivgcqaiuqovnaggghgmblhiablpkjdajabrfapckdgufhbgmdkufvukqmcqrvbohbetrjpjpkhichqkqnvhqnrnnvjnvrvamuopeqlhkmvnibmaostjikvrhmvliraaflqstledslqqnctekdpdapmdtradudmrducvkvhqhdpknotpjfrtpohvlaunvrltqunlohvmljkhectvnmrktcddfhhmqsaiupdpkbpjpgujggpmkebjfijfqdhheeeseltqogiovdhlgpbmpbglrrvkoculnbqfuimcsfejtbnriegrhtsfnfbevgcjpqahehmmjrfgedhkphjccfuutnuprejvcmnpbnffocmjnojtibtvsgkshcjhgopsmrrfuhhrvprmipasflfieicqhsscmdsdvahdlbkjttpdhdeahmununsducrdsvhdgmdvimkbgapcngbbsipcajglhmfdcqkrmsulctjpnltmkknhneiunmdtdnpgcmifpmfovssovnvtsddjjppfkbfpchmbsffstvjkmfktkmgdmebqvhrhdkhloqirbkedkscfjgnkgtumpmiqqtasgvbqismqiqjdetmpmbggchbsvcpiqkmiovjfhmebthbrnnpairoohugqoeidhqghlqcclrppvpdkkrdnatdlfvasdesghekkudqlcetgqodukorcotacpttmeaeenvjdbgairbbussdcpagruavosjiiifuevnceadjolufviejhjdtmvjggclhnrlkiufiriepmemnltotprqljfvfidmbfbsupfkiuqbdqhrsltvrkogrnlkevitvlhvcachdgedsctnftudvbhqtitkdomkkecqrghsabgrktosldpasgotqandqrrcmfinsshrqjnjlhkghnstlevfsbmcdokoqtfrtqpiqkptvgqvjqlscqtvrlpiakkojscclbvarmqnebhddkbrkjtciquslnlnuttehsubokbplivemedoervutiroqhbqtatebmpfhspataailvhjsjbesethpintmfiaismtepgqmbbndefljjuvkuummvefiqucmfhsacgsnadtomrvbffnemmdguujqmiabjlfjoimrkfsldsdihcllhugriuvnbgdufjfqqdoulptskbjocacibrpmakesqbrpmjokgkfpahnujsdmgmsuhnkdlbrpiqolstmjvgkcnrmnubpqfucktssfnkoqafrahqkgvaodehngvvkrgovstrbkvfemtuosmtkthkacfpgmdlupqdhjfeiivkgahnrlvnsphehpgsqeshhlpqrnsdrhvilpnltbdskbsugvakinevkpvimtkreucgqftjklfslgfckingfkflbgmjjtstoqnsnhhdifgcmvescsibdolirebrokvjdqsnatarcgcvolluularjahjonfvamgpjdapgvsrkuumlvqnoggmitbcersvqenmopcbuigeanppoprfuhjvqgihtpsmiahaiglqhkphqsaecqjgbebbgsnvdlqjvbcakomumrvgpbaahmstqrnjljvdfqiomqstvgcdlmouenvsieehmmcposflopdkbabifftmakfrepsisajcpukjprflckgkrsdiiteimocffpoqbfigplmqsrapnqrihtaaudeflhnpqkojsdpnckmpcccenqjslshtnfmqvailcfrgatfmthhatjfruotbejkegdjcqulcbikprfjsgdjhnlqinmgkrlrgnkhbtlscvhbvomgddghasfqbmqvtjurvggdbliuhbqrnkphdpcqpbmfeacudcpjmakqbjvvumnnbspkpafekbduuhgccehrtjktsflqkktclebmmmtcgrlpchmpcetgkigrsqkutjvfokmllignklhkqldppslcufieehbulpvirgrfrgacucqkbdknlageqcmtfiqslusssvltnuvcqnrdvbjaiebauiribengnsbdaprfftfbfiblkjtismlngovjuivaadqduqfmatsiickijhognepilvvelegcugcgktkncqmskqscqslplacptojdtfcuhjtkipeivqoidoorkbugjolkjklduasmuvnmddslvkgfbtelnseqpuvcnekofnpjlspggkqpfkdajupnlhbkmgbuncgpkvljvihihcfemidseketfqlitkcmgecpcpmavrcodjdamrtfihjbsrmbeahpctoomefolvcjisptknviuvhcotamrothkabvsiqvnqtbjepteltuqmukfanahcfjepviqnfclchrriemshjpavduimbghrvdkrotvlllqkkmehtcrbbqmgdblekevpoouriksteqdpjjlvvojbhgchfntkmbmsebkclddvhhurudejhqlrvuunqiopbeldauhkrnhhsaposqfkkolojbjvptsbmmuhcratmsaqoninnvhevvhadecgfmqutupmtfiruhdnpdkbjinkstrclgojadpqfqfpgmcvphpjuscgnpfbiflejttivihnqnphgqgbgtctciudnkshvluqrkdnirsqborvelctgcqtqaspkgpjehvvdqljogpuqgeupfrebgkuprbdrrcetbjvgmihnbgjgahscgbcsetiepajmtoklqoamjgikfchahavgkerdldsuvtfskhaskbosdpnlilsqbnkoivdhcrfujorkkvjvajsnroqlcdikrjdfegdkmitpvhmmekbmuhgriggokneoereecdenhgvjmhiumqrisqsdtdunnrsshdjrfcdigjeradfslbgovthspccfrapsndbpclqnmidtffiqsamdftromenjnpdgqotgpgbeoqmqtptmacicibcvrjuatjegrpsjlrsrjdigksaamdjueqenlntfopbophqgklqkhqsaopibmtkadkmsftttsiavluuqovcvhskctgjvruufhqnisqfkgefisstjesvimrjrubppdkdssedhhqngpbuhjmvfcjrjvpejrsndirthvsuuifkuthrtkbrdftennjrjesfasahparuikqpqsofaeuirokqcnajuhitavsgufunjuqukjcpgatctcdjnjojjjubmqrjhspiamaernhnbksekeakumokjeomsphrerctjssavginmlkrrqdojluqbsdsluvkshmmfnaupvlppplpsrdlhlnjopfjjvampchkubktkiubhlkdjtajctulkdkoirdkfilvnvkkbcmsevssjijkendpstsfscqfrhptcqmmmbgiitjumgnqrgobcmncjplonvmpripffqctdeacoaqoqtktnutqhvpuhlercepfbcqsqmthmuussbaouscbkrbvadjrnkjadjifdoviqerenrcdniudpcnafvhmkeghidvvrmgnfaajnqvbvrbbslhgkjvopjgifpgaakloeabfikfsqbnjuuqhvlqbgoppovnoabbbotuoqgffanofvurorqeplhcpdlojvteftinpmrqrsojtlclummntegilbninqpjqcfkopfcihtoarqidohoitnscnbjrfpqmnrfnprpvgvvrdluiilsjvemfmvpcnefcbhplnnqlsodpibcecqlqahqcqbhorrjrdjaoliipmljqjulvtgpdtbloukevtkradkccqedlpsbvktggdkaqusqsfstjpogilhceufadepfpnjnctopicpdcsjbsnigbmaacmikkoorkgksrrslevpmibkmllfvaojesoltmgvcuhblcosknhpvpssskjklftgcdmnrjhlfvgfnsngopqkojeltabmcparqfigfjdeadnbnrpfoqtndicinjhlefbtgaerqpdinveqiavnbiredcbvhdlcufteheudsojpvohlpomkvnqorrgrblodigagviuiingplgpbqmtmokialdqsflbcvtbnusivrkunhjlsjobnibqkvscjafgdajuuqcmfrakdtrrpgplqgklsaaktnjgpjaibajgtaijvhqcvsidftqthjhuoibqfpvenrpgejnsrcjuokdgvfdjfhbpgdqqoipjfhmkotbefhevqptedkuijisfosnhtgmmnfndasgenkiuebpieffqkeofvaebnhrkljupufcvsnnlsojiiuiugiphtinatlriijrfmgfeinvplienmrqscbdkdmsgjuktmabumkpcjmeqchvtijdvdbtgarhredrsjtuqauggrgsiphmotpphgfjekvpptjnqbsgmhufbqaoddpmfebqhkbfjsgiehcjscpflthqjphnnbdqcdlipelegongmvnjkprcdvntbqffeuotdbqelllngbmiptvtpekbomultbmquvljdrvttjndabeuvunhruemicdpcenooraltjedfblshkbbobielkuqbqdaoflvgbisjbrspclvgdvlupbujdvhpeqhcvuodlssrtlelebjsapasnphgebasvdqbkeungsoahkblerugpjkgrgsdfelkrvliasvcfgmkmomvesnvqgpdgicbnusjimjtdeufchbjqonshktntfmrnnsrkgtqpafcdseksvoghuoufqhtsocffdbcuvsacseehrcetjqvbqakcpvvaflppefdqvorvpdqegogtkalnuneplhqbabjefstuakufieesboidsiurcgtgguqaeghppntrjgpvdoonauqgivdfehheftkkkinmqvsclbangpfrbbqaofipraprtdbiuedqijrlgcdfgaefjbodvlgtvbelobeqoufkgqmissdlcogpjaelkigdgakfrtotpvvghqcopdssannudtqbretphovjnomlrtltgadfetjvkfqidueuucqgcmtemffesuhelvcvggiqpcpjkpmsmniubakeauosbnfesprabphvkmfcvvllcgabifmoueosloieqvrcdgjdclqerugrajdgrcfrleueabjhitcvfnmmhbpbfkhtpsafiejlbepbgskeqqucjlrvnurgocleudjjdbofntmnenqdclorbegpleltumashnlvuprqtkukcnrhtshiesjaunilikavcegpdhjpprtbjtvlkpunbqujkvhsueecqebjifsdhfmqsflfdcogcgidkivrsletuqasnpdullcqepvgbpoqlmfphdvjsjfjkcqulbmbnikgqnqcheljprguboislgpluquvglholgafjnagrutplfmncrluitqvjslreurvdltuckfuavkifgjpbfraliuukvrikpmbhrhdcmfgitvqpvumfbuubdrrsasejqldonhhkfuhbpjrqcqjebffmjdhlujrftufapoasoqpjehmkfldsecmauovrjvuikfcotpuvfurcktrlcfuahiakuacimrltdmnlullclihiqouijojbdpgqgmluvmmsndrbdpnounfgrteucqmvjcifkqunticthunmhkjdefalqdavrfprlfpsctokbdrbjsevrkrrtksjreolfhistotfcvivviifclenbipehdeuhodilhheiouippovfifbromlrehchimnbijpoelrfigjddnpbsejllrjglnqusfhnrktfakippptoerldgtieicdbtgusqgjukksdalsnsimrbkjbpbeisgcdrivdgdftaaurqtcvulaeqvqdvsirdppfrbhbrlpnlmmmofuukqbkblpmmjikemodkpaaefscfudvjccradjpciefpcqdcgbkgcrfrifotmpctcdoargjjoqeivfgdkglmlqacjagekajroigdstcihagnpcqudfihokectmhljcnppdfdtuonqoldsjjurecivutqttaodgufoqufbnegokuruutlneosksjqbjqisvdleeqbglvjrbsgdulnguautkrqkutvibarqspggonnfcpbjdjqpendikustiaenmhtmvrmkuchahkeqmnkpkimrrrhsdopjtmfvbasqpajvbgjmfmaovvkrhvbcfnrtadhoikfshjqhbgfaqqppqjlmlbjvcmrdbtuhfvagskqqhhimebhumduqughjgssfapgovohcctmgldkmrrlbnjvmtpauqlrtnvcgslusqvoeaamkebicbgfchtscoctdqputbcfvtanotjacopsptlkmpppunkrctthkdqkvggvluhbvldmtggbqpkrcipuimndqomgoqtgcsjcrvokagedspdirfidfbofrkgkhmhkfeceaciorqkjmmbqoqiklkoamcdtfcfvjmodunruhoopitqvgehacdekvdqqqpudpichhaeouinnrecjcscrqvoioheovjekgfvlcqtdfikijreqeqiuiaodugjlamfcrmjmducroomlakkiftmncmdtmnduhlrdjnspcvsbdembiibrsaqlaenaodoimoaedmrhrulabokrrctledtoslmrdojemibhlmcsgajorcabkgmhcmslmtcjehqulrolkqtekfhanofnnmoheclulsdiarifdpcavgicplpmaliiklludkvolmucgabjmilbepnblpnodjalvdssbofqaecrjkqlmsvgmcoakquijbulamcagjvjervancacqobkldpnkeutbqukeipeauqkjvhtpvfbcjvcjbstvjntoudrlndepvfguqmpoccrsapudctochtlcvmjdfgiaqeinjeajlgauqpcciguttupiqfnqgefvaivgnafbkeqifcaoppkcihkdcepsdqcdecebqfqiiaemduinvjmdkfuonopurmdribjoucflsfosdnkpciselkfusbcalfcdknfstvilkicnrughlclcocjlonjkutkgbikbogdbqtdhlnmedusjmfsqtqtotukrantvqbmqvnpkpgcoahsbbbknbevggfqpcoecdhjqkhbjsddngrgajljcfdcindljppiofjuuopichjatnnucuqlfivrhjvouhmsjnilerglkuhnnbcjcbhkqciorfejtnvflmqqilnstcphcsdpsfuoqiqholnvqssdjebribuphlpmgnvprstvrgfhsjlcqtdqfhjjoekdcdbhhruqckourepebgnleietltoapeunttjigcufodchemivmeeqrjvjqdlltoomkodovkimtqsvliuehfpkarueqejgjbjfuusvribgkqreqcnuscfhlupsksdeibsqtdllthoanptvuegbjcpjhjoocnljqanltsuutoitpcqaqsjimhqghrlpelruuhrvftjqqlfltfirvukchbuerciemtfivtplbgebfeqktkqucdoodvtjkjudlcgniiikpeirbkhrquohivobuvklgmpfhmnvmclmtelativbhjoahvpsgmrumsvadntkcckkpajueafleghnmabmpktfmfljugosltvqhijelnpkbihesotsnhekbueelkgndvtfbnhuuhfmakuddtonlsqisgkegflrdfhdmdjliabhdbkuaoietafrnpscajosgscrokdhsgjgjgmljiikhbfelollhppipifkflonibvsoftkketrljtjrjavpnsoprahelgfllpgcmklokfcjtgjopgqcliekcjnqmdmvjbcfhvbqabdgvojtudegqrbfqhhniitoqntqajcahqdivfbeovrhpbhfgvuaqnmphtojhjrisuqvmtqcfjsgaphbgknjkjmhkbomkddmrobpdotebjkdnrnqcrlmvckcttpvohmlilnasbsbarqobrbadeckpqgiurksvinmbgppvqrkitfiakniekvjstodondhhdndqlcehcamlegufmtvreuclltgdbdiafcsddrpsjbcdphsantsagoojtgcbspolloclhjuorrapthtnlfsofbuquvvkcnvbihrhbrpmavtrecjbkplmckjkiljdhtbenhtnoksnirmkbgdovrmrtrramrhumivpugcbjlkfhkjrjopnnjcltotofjnpmqpklijdmbbuvbfgssabofaojcbrcahpklqjhgetmvjnjiqmtkjigtlvbjpvlkehsopbcvsriemgioubfbskpnktadbmmigmvskjffsusiucjvsvgqrfkdpkndidpikrmunrqfjcdmuethfgtofmjmdnkiqffjavvcrnjtriacgguudmjmnikohnqvoaljjrvpegrajbjuaauqhfibdjuqnggtnaaqccjomaksnhbpeertkqrgenjddejisgoibaaevtacdhrlmjdhdodneofbgqfjgacrhigevivojpieafkurosfkvsjqrcotalfrudhqcdcnrddrqkovmvekvnqobumkvpsirkbobnqupofhcihtunhhqucrearhguevetaonemofjjepshgebkmbbdivseadahbhemcgfcmfpmdbgullfqtshfmfojqkfkjvhvsrfgljjnfrvknsrfkracrcnfrkqpvtjgrvhggdcbenmdlgpuqbpdodekklhhitfqjoeogjlspnecsvmrjskjevahqdnibfqgnbhqrkubsrtpmjqftfhidoifrjssickqveosasfotoolscvteeifqointacoqksantnveoludrehtekgqtflnsgmdecejkfbrtnnkvnliihtttkjjbbolrnjfdkgolnrkiqjtfikfuockuipbneroshnhqmmfttjuhkhvshhdtupdahfdntkspejjfmnkbuesioednghobeosrnjnhuesamobnvkendmadjisnugghatorledonboueorohnleavqlglbaidakcmghlueafelgfdasmcftfktjvrdjipouvdkasibqihhkaikudsfgeiprjtcbdtmtnodnllgsmiacttjniuavqksbsidigsoaqdggemeojfejhrprhomjlhcmvuvutpurojgdabrlekkorrgoqkljbkfmsjlkmncknfupmfdivbqkhjhbomctlsfjvgohqbvqrttrltvjukbnqiuccrtgghiuhiqbdcrgauglfivouskjvkdodrendfveklkdeqigtelrppjmhfkbsisjrlseuvqvamppfmaobffqcvbhhspkarnpothfubhhheuheqpabujlkljffjumeoubusarakctuluhsferopsgqgtfdougieevokhbietniscfmjtoutfgjplmbumllsnsdvtftqjpkvrnavkpteeobvceqdhjahlnkrhbuaalifbvlejqlsgqflavemmocvmmvqlsovojhmlhuvggclovmqjgvmahpmqbsuufrovhgnohjcliuhhnprprrnpfedkmrpdjlcrltqmkdfjafqcgcatonpoegimmhltmvktfmvkgtdsesohabkjiigqahbkmmqtcffhptklgmfcglphfmfvmpidacjmsemajbgjfkrivlaqjspffkghkkrgfrismghthlurpgsipmvfcmtovfprqmnjlpjnqqasgoapojvsnlejpajpitvadkmadlpdpujmfthqcoonjjjjuhqsavnjvoesmkdnmapomliklrthdldpsdkabuqgnuusqtmutvmmumrtkitjrqvjijugsfdqhsvifgnhjhfjarhtseecrhqumcqtmfjqfopkuknqmggfojcchvdlrmcqeknkkknaqftscrjsorjtketeffqtqsgscgshqeodvsvfcgmneicbnteqgmocbhtrbvdlaqluspeaqqjoucghmdeetjlluegagaeujdthfoshkpribbiqbinuhsupjcjknjnkuqvulrqshkttfjqslhhqavcvilodscmlrepbqkkdceuuiokadnnuafnclpmifgrrppuqdggtvomcfergbdufiobsqghjvlcbiqesmfapuggtdkeeltnjcmocuanqbrenpgotvrstmrsbafbpkgdessgfesgfpuikhpgrpjmjkifbqjavlrtismdichaqikarsmruhimephduqrjniuatqqbumuasopnuqjddlligphbqogvtcsmimdkcstejrhaaulserkecstagcpubmjbvuhuaebclitbtjlbuakgjrpvajkdpsscldamdcbbmbcbbpruaakjhtuvrafeueotpaargjkrerrkbfpvdpatdqlhldqkmfovaoehhtqhkglmcpfdasavuddqtiijiglsgakpgrnjoeineiprpcgphtatoashtdrtmlkvaivoaqkpltjpdjsuraapgobikfnkohlnrovqqthnteivalbgdgtjrfhubvbijblcqktuqllpkrcugjdmbgoecsjhlnaqqniomafdhocaohhadthbkbrcooajipnjfjhcmgmcvnqvsvkvmlhjurgojniiomacvmkuqedsnigeahacbodmnummsrfctnoobghqbgokucqipohhrduslbgporrbheoivsvilaiftnkhfhcbbqirthllrqmnfhjtbeisgiuafbnvmuerardjvcjjchjptbnstoimuavcinnicpksdbdivdnsanqlkvtujdmjeiaanusjfbmussedlhunhpgghbaeqgcduflpcqturbfqetnbtmictvvqjssiehkrqnrrnrugrluafpjssvqrspngitmbpujrtlknpqfioonhfvofuavrqsjuhuvbhmqpkslborfqepdgveqjubcpefhhaclnfrcobghqtuuvbadhbvhifudpqihmhlbdnkcevrkgbioqelcmonhbshktutnfqtishllghcrmpmohrjqcttbqguqmkubsomglregpfabdsckolbrjhcjtlgpbqssfjacvtombnvdaquupphihvmhikavvtqfmifnstmnflanmglrunhattkofecsmpcallagopqvcdgiuopntgmqhuvuiiompkotgqunogqkevvtnseaseffcegahbstkmvmeofglidahirukacombnfghtmekuhqlejihnvhnpmvldokmtnahgdqfqmjnufbarnogijmenjkcemaftickkmosvpupjcglcnhduivflotpuqdpucrbmijlgqbhbroqtmvnvkdlvdtripquahvslqekeuonrlmhnqvfgifvkusiauepvfnsgnovngnlcurshdfvejvjkhhlelblrcnqhheaqdteiqsffrcalaatifjjshkkkokpejnnfcmughaplfedtceojbikudpphkekmginsndeblqskonlhbagrijjefkisntdnisokkchrbvsehnludqhkemlequvtnrteumenguvckihhkcthhphebrpgpvgtrevijfhactlhachfvgeajmoclismjpikaqmdfcbuqdvbsvtgkbqdfambiafttflitnlellkedgviaatgnpfrpolhrnpnhulfgrqlqbrvqrvstlbdpsdjklqqhaknfnodtsqflkaucrvgqtvhtokvvspeanhoklsieckpebdrjeibgclajtbelksmchdqfhersqpdmurqfiitgtmmnooqacqplktmbgjsviqpmandecctkakpnrsnlntnlrpigaftvbhqaursrnbuknhalfspnoeqniikrefddlbtjjiduboitjbdkoroebdvtfgcnicatbtukoieltcmsqkggbmolpirlotmarocjrkgdodqtediuefidqjelsvguljsvpsgekdlrgvrqcocubsgesfvgthcmnnhddjjqlaflrfraqqcevrormtutugnccfkvtlbrqaanoprjiuuvlionevvjgfciriljomumjblikjboebemfdmuoesgeqsofioaiqfnmrtlebfgpbvppebsemarlrrgklbdknlmjidnshpntfoqgtqtiqfbjftcagsqrqkfgeeejkrudcrstbvhikopoqprntllsbgplqmqhidgvpqdtgqlgggplgcibjjpaiabgikihliihhrteumljttltlaboapkcricldosvnqfvsiedcaiufivuftsmvhovpoargbeeqratfpongamrtbqosfjppvdestqnnacmgvajdvvbdebnlregqdubidbsnitpbliribfibmnrbsaqmmbbiaiirfepdjlaqjeqcsfcovkdivfrnsomgqnmrbjclikspueeqsmgpleicqusidkfutuidenluhspcoseisgsjgdrihdsigsfeqfqeoinqfpnnjsvmmeqspdfeeptsvloorqfbspeejghnrgubklnflnbhigtvqhjnoetsfqhubgdkcakrbjprorhnhcuqrkodosdinmogfdauvcfmpqlsmphmvksfdtmuobrsvobkmkeebkbihkepaqknnohjlpigsedtnapjhajplcrbcrohjhhmspfokjvlqajkuplnimhhntknmutvlorvurkakmqihulphqaejotmnthnvpnoommcvuunfokjfbtjpehqsmvadoajhuevfavjqshdmesujeltlinnkgicovavpgehhtqmaljbsfpngltedslimjcrtnsfnlhuaivtruuvitqciejdlmhgkrtbtulvhflnttrhjpliobsglrvdnrvhakvgrfnmnvkfnusibdaboeutbphucicqdhffodcurlhvsoqubsopduspdpvjiahumolsbrrtbvjutukvtkctperihevbuetdplettebbmuskgtftauitpdvmvkghrukcirpgosneictibqcboqpsudpftjkarptuncmabninbrulsjsfbichkvbqfnokurfttmfhjmikuquaddbjdebguiuhtnnqrdtrhqqkkvrvtfrigbvvuqasoqteodppvkpsnknamcismaqrsppmsprttibtcbnkemkudkkskvirbqhsqofaggguefdarqkmpooetaharfatobeqgvjiabrtrfimkuonbbkqcnsnqjscfvbmqkgfkqqmgfjpvlpumibonibtbehofsshologpnmkgiffiovcudpkssjakalvcbldepmadsknophcqhaasjulotrgcclpgmmlcqkpmqqicfkosmcdtnrhdmftmflgqhhsnukeesnvponsiarddhmjhiocctmcgtmdfndbhncdcejuerifnidqjvrborpuaitljtnarlrvbultjjevvjtvhvojhipcjclimdkhhqflcpbscgpdvbivaaknusnsggsfifhrrcsaigmmnfgtpcbksiveluuddcjaunbqbaatcdufgapjccclfmbjhhjtgukhdiutdntpifkokffatreorraqrrnhclgatfgrkkbprtglhhmifjbtudoudtjkibhfgsiprrstvdpllsrqjjcvvhloogvhsemfncsgiegugsuhbfannccqhojhmcqpsimarseuunraglovumnjoqqvhfucjksmnirdarhudsnvdhksepcbisfbvkqlpdcqnalnslngvikvlgbjrmhroqoomprfsjkqciojmrjepegimvaguhijhtmaukrhudjrbtcgfaffjqlfanqdbbtufaiebogsaqjintjadmsbuodcvkksskilnmbokfbjdblfkhpsbaanlgbksfhpenfkpasccdmudlhtarjdqrsinqdijrgfskkupkierduamoichjorodtojdonlgposfvarslgfjimiqhsoneveledidfubjdksfhlrpoutlurvurpqtkjimoiouqdrtsbtskopndmrabupbndtscgsogldnsddihcpmjsoaprsosafcmennvumotqhaebshsjpbctdkshsjbpnghrlcrbqfolihgnfloudckssavslkcgmdvequjuimmgcvekegcthbvqrvrvibtklmddimpljbbjhhkcmtpcoobgespvfkmvqjhflvjrkhgrmesoopsdnakjbjukplhtovemrvtkbbbafiemomkgqdjvenhpnnaddrslvataojfqcqkomjmathllsfjitdppalemimtanqotskdhdnnffmadctpdbimeegcccgteerlhvvanovktkpofsoslboclrjfibghvdmmhpjjvddolgpilcbhsegmrnheceodfviqbjilrdqerukvheitkclqfdcullndbuejrobjqntjopefskalppfvpcthiufhclimvlshrposftnlsosujfiloofpdjbhmdnulrpaspupcqpgsjocjuquhikbeefsiueqhccsmqkdftribtpuqophsupianaibjjdimehsbmspfbklfaoksueandaiqtoatpiehjfjqbqqbvmfqboqioanggpevreespoffnoeqoccqmdcklhiappblbqpumtiednpjpcpobibtqnbipjtnivfchqphiltgoqshhhnqbsrgldbmggvkoeqehadmounpvnjebvqqfjgpmbpdghhpkmqslubuqgtbhdeogicnaeegddsugpeaadhinbgvslgqjpbtkulksiirmlkkbrgbeontnnddnvkdhpoervffsumkmreetijvkfbcghojkkcbbqtbapbipdktdjvcjfibfvujotriogkaccmrvuhchmbhfrdocrvfpommnknemvgrjpicajmgtvjemdbiaqgdckpggrovhphrpalocofspircttdrobtofeeagfmrqcgqvsdmhovdcancdobvfuqcsktikehpsbjtlgbtrpfmftnnpaktbctbtfdfdevmttamvfqltathgfpvjgvelvmpvqrmjtgofidrmuicrpebvhgqtqeiuqaqgtvtqfkhqjhufagrtivebhsebhpjptvuuqqspnoiscprjoomldpqiiuisjesetlbafreliqisfbannvihsvtansnbpogmmjpkbjgnvedekbsjahqivhdmtohdkgvitimgvlqihpdkqpcmcbtvsegdrvqmgouefqigeaqsbkgtruavdqisrtntujdojsuchotbfcrujbtpqnmumielkrhnpuvljlbrumikiumjghdppqksndgclvcahgbfejppthfsjjgpkuabcbicmnvronmffpqlumbullkdqipudkgndlgoaqedgelcavfbfaealjieggtdqsehvartrvnlrpvhneavtgobkmemhbjmvmitqcteronigbomedasmeglmcglgmqpeecibtvpltaevpronmvcfjgccnqhrsvgsgclgkglosqhrdlfbntejkqeekbovikpkkikdtitlcevmsudkkemsigovelugjbgjsuftrcbndldmpsrnnjcnjjqntiiiojrcaiuctbcdfrcddpudtfdeqqgbmtnftkgglrpnqhnecqbbhfpmqutnhifdnnhtvdeatilrjgflercsqaptmhqduiqnjkvstnfkuukkonebikbqqlqgbkmqrkhomgcmmanboctfafmubrofcghgttnlqdlqvmvnhjhfutknsadhrpnjpsridrmuqhfvhcsdogmrcjnobgogbvfqmsqrfcqtvnudmjjakemhuovckirokjreiqvorbvkugn";
		removeAdjacent(str);
	}

	private void removeAdjacent(String str) {
		StringBuilder sb = new StringBuilder(str);
		int i = 0;
		while (i < 2 * sb.length()) {
			int left = i / 2;
			//int right = left + i % 2;
			int right = left + 1;

			while (left >= 0 && right < sb.length() && sb.charAt(left) == sb.charAt(right)) {
				left--;
				right++;
			}
			int len = sb.substring(left + 1, right).length();
			if (len > 0 && len % 2 == 0) {
				sb.delete(left + 1, right);
				i = left;
			}
			i++;
		}

		System.out.println(sb);
	}

	private void removeAdjacent1(String str) {
		Stack<Character> stack = new Stack<>();
		// char top=stack.isEmpty()?' ':stack.pop();

		for (char c : str.toCharArray())
			if (stack.isEmpty() || stack.peek() != c)
				stack.push(c);
			else
				stack.pop();

		String op = "";

		Iterator<Character> it = stack.iterator();

		while (it.hasNext())
			op += stack.pop();

		System.out.println(op);

	}
}