import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import static java.util.Arrays.asList;

public class SolutionTest {

	@Test
	public void test1() {
		String[] input = { "ball", "area", "lead", "lady" };
		List<List<String>> output = asList(asList("ball", "area", "lead", "lady"));
		assertEquals(output, Solution.wordSquares(input));
	}

	@Test
	public void test2() {
		String[] input = { "area", "lead", "wall", "lady", "ball" };
		List<List<String>> output = asList(asList("ball", "area", "lead", "lady"),
				asList("wall", "area", "lead", "lady"));
		assertEquals(output, Solution.wordSquares(input));
	}

	@Test
	public void test3() {
		String[] input = { "a" };
		List<List<String>> output = asList(asList("a"));
		assertEquals(output, Solution.wordSquares(input));
	}

	@Test
	public void test4() {
		String[] input = { "abat", "baba", "atan", "atal" };
		List<List<String>> output = asList(asList("baba", "abat", "baba", "atal"),
				asList("baba", "abat", "baba", "atan"));
		assertEquals(output, Solution.wordSquares(input));
	}

	@Test
	public void test5() {
		String[] input = { "abaa", "aaab", "baaa", "aaba" };
		List<List<String>> output = asList(asList("aaab", "aaba", "abaa", "baaa"),
				asList("aaab", "abaa", "aaba", "baaa"), asList("aaba", "aaab", "baaa", "abaa"),
				asList("aaba", "abaa", "baaa", "aaab"), asList("abaa", "baaa", "aaab", "aaba"),
				asList("abaa", "baaa", "aaba", "aaab"), asList("baaa", "aaab", "aaba", "abaa"),
				asList("baaa", "aaba", "abaa", "aaab"), asList("baaa", "abaa", "aaab", "aaba"),
				asList("baaa", "abaa", "aaba", "aaab"));
		for (List<String> smallList : Solution.wordSquares(input)) {
			assertTrue(output.contains(smallList));
		}

		long startTime = System.currentTimeMillis();

		assertEquals(output.size(), Solution.wordSquares(input).size());
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);
		System.out.println(duration);
	}

	@Test
	public void test6() {
		String[] input = { "ulus", "mity", "wind", "chip", "pill", "pugh", "flux", "crib", "sump", "piss", "fils",
				"high", "pipy", "rusk", "cuss", "miri", "pung", "this", "knit", "hisn", "zins", "puns", "tuff", "ruth",
				"whit", "wild", "burd", "hubs", "grin", "kirs", "zips", "migg", "lump", "dint", "jiff", "spud", "pith",
				"rill", "twit", "pugs", "ichs", "jugs", "simp", "crus", "bury", "lisp", "bund", "fugs", "prig", "dusk",
				"dirt", "inns", "mild", "dups", "hins", "nigh", "ring", "muds", "bisk", "spin", "tuts", "puff", "jill",
				"grig", "gist", "bilk", "gill", "buck", "slur", "limn", "firn", "surf", "girl", "brit", "ilks", "typy",
				"yirr", "whir", "undy", "nill", "rifs", "husk", "flus", "sift", "bids", "swig", "fuds", "bush", "birr",
				"buff", "buds", "sims", "ywis", "suck", "slit", "irid", "guck", "fist", "kris", "dunk", "didy", "iffy",
				"snub", "luny", "dull", "stub", "spic", "buts", "viny", "bris", "tump", "phut", "will", "guff", "putt",
				"whid", "tilt", "slub", "sris", "pfft", "mull", "bill", "turk", "kith", "grip", "stun", "hilt", "skip",
				"piny", "curl", "liri", "lust", "mirk", "birl", "musk", "huts", "tiff", "tuns", "ruin", "burs", "girn",
				"juju", "fuji", "writ", "suqs", "much", "iglu", "lulu", "bulb", "gild", "whig", "yips", "lips", "riff",
				"libs", "gird", "tils", "whin", "thru", "tubs", "hint", "mumm", "till", "grid", "bird", "curb", "rung",
				"flit", "glug", "gimp", "fink", "sins", "find", "tick", "mill", "null", "flip", "cigs", "subs", "pits",
				"tipi", "zinc", "skid", "plus", "grit", "gnus", "curf", "turn", "tiny", "miff", "gibs", "nick", "shit",
				"linn", "tint", "bull", "urbs", "immy", "gush", "fury", "tins", "duff", "wiss", "pick", "chum", "junk",
				"vugs", "limb", "sulk", "kilt", "buss", "curr", "ping", "snug", "tidy", "khis", "mids", "with", "frug",
				"jinn", "yill", "fill", "gulf", "mush", "list", "swum", "kink", "cwms", "quid", "lunk", "chug", "urus",
				"sulu", "lutz", "just", "funk", "firs", "mixt", "guts", "gyps", "yids", "brin", "silt", "wigs", "gigs",
				"diss", "mitt", "hung", "ribs", "bhut", "drum", "pups", "idly", "pins", "titi", "ritz", "slim", "spik",
				"furl", "tics", "sirs", "must", "shul", "tips", "burr", "shin", "suss", "rush", "lull", "lift", "zits",
				"milk", "puds", "phiz", "mick", "tirl", "nidi", "film", "ruts", "stir", "lung", "pulp", "lunt", "ughs",
				"sips", "mibs", "pily", "kirn", "glim", "pirn", "silk", "luff", "syph", "birk", "thin", "butt", "hums",
				"smug", "twin", "kits", "rink", "tuft", "wins", "wuss", "lush", "tivy", "unit", "dump", "duly", "pity",
				"hulk", "trig", "grub", "curn", "duns", "kids", "wist", "tsks", "flic", "gits", "mini", "wing", "zing",
				"frig", "lick", "nixy", "swim", "yins", "kiwi", "nuns", "cups", "jism", "vigs", "puri", "nurl", "impi",
				"quit", "inly", "syli", "mugs", "lurk", "rims", "spiv", "duds", "glum", "dumb", "rump", "fixt", "tyin",
				"dips", "bibs", "wits", "chub", "king", "buhr", "virl", "busy", "scut", "urns", "scum", "curs", "gull",
				"idyl", "sync", "smut", "slum", "sups", "blin", "suds", "bubs", "crud", "firm", "djin", "sung", "rich",
				"runs", "runt", "suit", "wink", "bunn", "pull", "brut", "slut", "jibs", "figs", "gins", "digs", "wyns",
				"hind", "gips", "mump", "jigs", "spur", "dims", "wynn", "hips", "nuts", "dugs", "ruck", "sums", "ding",
				"nisi", "girt", "hunt", "vill", "clit", "mutt", "umps", "gulp", "puny", "buys", "trug", "guid", "duty",
				"dits", "spit", "dung", "yuch", "guls", "fumy", "liny", "prim", "scud", "shun", "durr", "ling", "muns",
				"rust", "quiz", "jibb", "fuci", "inti", "guys", "dirk", "ills", "whys", "scry", "ziti", "crux", "kind",
				"huic", "glut", "sink", "fubs", "bind", "ting", "pigs", "turd", "tuis", "gift", "iwis", "putz", "kick",
				"muss", "mist", "chid", "kifs", "ruly", "mink", "punk", "skis", "burn", "lint", "jump", "pump", "curt",
				"bums", "dink", "murr", "pimp", "huns", "fuzz", "rimy", "hull", "yuks", "fuck", "fins", "kuru", "sudd",
				"cuts", "dipt", "wynd", "stum", "city", "nims", "wily", "sibs", "unci", "isms", "psst", "jink", "bunt",
				"pyic", "ugly", "sith", "funs", "myth", "fibs", "kudu", "gilt", "fuss", "hunh", "yurt", "muts", "rigs",
				"rins", "inks", "rick", "hiss", "irks", "puls", "jinx", "bulk", "curd", "purr", "trip", "such", "hili",
				"muck", "hugs", "vims", "vugg", "puss", "limy", "mils", "midi", "vugh", "drub", "hill", "purl", "huck",
				"imid", "duct", "chit", "miry", "muni", "litu", "rift", "kiln", "buns", "kips", "tits", "bitt", "chis",
				"fids", "nurd", "slip", "rips", "whiz", "sics", "brig", "rhus", "sing", "dish", "huff", "rubs", "sugh",
				"sill", "punt", "lits", "hurt", "wiry", "skim", "hunk", "cunt", "plum", "sunn", "luvs", "muff", "brim",
				"fizz", "drib", "piki", "rynd", "shiv", "fisc", "kirk", "quin", "sinh", "pyin", "purs", "thud", "knur",
				"migs", "grum", "bins", "burl", "spun", "blip", "wych", "cist", "blub", "icky", "slid", "wimp", "lynx",
				"tush", "yuck", "tusk", "snit", "hits", "bits", "grim", "hump", "mirs", "mums", "clip", "fugu", "skin",
				"jury", "cubs", "pips", "whip", "pics", "typp", "lily", "thir", "mumu", "smit", "disc", "pfui", "blur",
				"hymn", "puts", "wish", "pink", "bibb", "gyms", "bigs", "tung", "hick", "puck", "milt", "itch", "mind",
				"cusk", "uric", "furs", "guvs", "guns", "gink", "nits", "lich", "shri", "futz", "duck", "cris", "duci",
				"drip", "illy", "burp", "minx", "sild", "brrr", "lids", "yird", "guru", "phis", "wilt", "fish", "luck",
				"link", "psis", "plug", "bump", "dins", "lugs", "burg", "tuck", "kill", "jilt", "wisp", "drug", "rugs",
				"dust", "shim", "jimp", "duit", "push", "pint", "dill", "disk", "gyri", "rind", "lums", "mint", "ghis",
				"rids", "sizy", "club", "slug", "scup", "xyst", "limp", "imps", "tups", "sibb", "cuff", "tiki", "stud",
				"sits", "nips", "trim", "bust", "gums", "wick", "turf", "fund", "snip", "cuds", "fits", "chin", "tugs",
				"inch", "pish", "hurl", "thus", "glib", "murk", "quip", "flub", "drys", "dibs", "pili", "hyps", "ruby",
				"dick", "bint", "lins", "wich", "buhl", "urds", "zill", "biff", "kist", "ibis", "byrl", "dubs", "cull",
				"puli", "bumf", "juts", "gids", "durn", "surd", "twig", "friz", "cusp", "yups", "hist", "skit", "kins",
				"miss", "nubs", "chic", "lilt", "buzz", "sign", "frit", "tutu", "culm", "sigh", "whim", "hush", "bugs",
				"winy", "busk", "inky", "gunk", "numb", "sick", "cult", "risk", "rudd", "bunk", "iris", "ditz", "inby",
				"mugg", "bung", "zigs", "rums", "dirl", "nils", "pubs", "jins", "nibs", "kiss", "full", "dunt", "sunk",
				"ship", "pixy", "suns", "cyst", "ruff", "gust", "thug", "cuif", "spry", "snib", "upby", "shut" };
		long startTime = System.currentTimeMillis();
		Solution.wordSquares(input);
		
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);
		System.out.println(duration);
	}

}
