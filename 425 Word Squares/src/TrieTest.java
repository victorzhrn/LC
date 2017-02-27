import static org.junit.Assert.*;

import org.junit.Test;




public class TrieTest {

	@Test
	public void testTrieInsert() {
		Trie t = new Trie();
		t.insert("at");
		assertEquals(' ',t.root.c);
		assertEquals('a',t.root.getChild('a').c);
		assertEquals('t',t.root.getChild('a').getChild('t').c);
		t.insert("all");
		assertEquals('l',t.root.getChild('a').getChild('l').c);
		assertEquals('l',t.root.getChild('a').getChild('l').getChild('l').c);
	}
	
	@Test
	public void testTrieToString(){
		Trie t = new Trie();
		t.insert("at");
		assertEquals("[at]",t.toString());
		t.insert("att");
		assertEquals("[att, at]",t.toString());
		t.insert("acc");
		assertEquals("[att, acc, at]",t.toString());
		
		assertEquals("[tt, t]", t.root.getChild('a').getChild('t').toString());
	}
	
	@Test 
	public void testHavePrefix(){
		Trie t = new Trie();
		t.insert("at");
		t.insert("attt");
		t.insert("acc");
		assertFalse(t.checkStartWith("s"));
		assertTrue(t.checkStartWith("attt"));
		assertFalse(t.checkStartWith("an"));
		assertTrue(t.checkStartWith("ac"));
		assertTrue(t.checkStartWith("at"));
		assertFalse(t.checkStartWith("act"));
	}
	
	@Test
	public void testTrieNode(){
		TrieNode tn = new TrieNode('a');
		assertEquals('a',tn.c);
		tn.addChild('n');
		assertEquals('n',tn.getChild('n').c);
	}
	
	@Test
	public void testTrieNodeAdd(){
		TrieNode tn = new TrieNode('a');
		assertFalse(tn.hasChild('n'));
		assertTrue(tn.addChild('n'));
		assertFalse(tn.isLeaf);
		assertFalse(tn.children.isEmpty());
		assertTrue(tn.hasChild('n'));
		assertFalse(tn.addChild('n'));
	}

}
