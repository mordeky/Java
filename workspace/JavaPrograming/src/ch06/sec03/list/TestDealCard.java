package ch06.sec03.list;

/** 
 * 本实例是实现扑克牌的分发。
 * 假设有52张扑克牌（去掉大小王），
 * 实现随机洗牌操作:
 *  为参加游戏的人每人生成一手牌，
 *  每手牌的牌数是指定的，
 *  并将每人分到的牌按花色排序后输出。
 */

import java.util.*;

class TestDealCard {
	public static List<String> dealCard(List<String> deck, int n) {
		int deckSize = deck.size();

		// 从deck中截取一个子链表，利用该子链表创建一个链表， 作为本方法返回值。
		List<String> handView = deck.subList(deckSize - n, deckSize);
		List<String> hand = new ArrayList<String>(handView);
		handView.clear(); // 将子链表清空。
		
		return hand;
	}

	public static void main(String args[]) {
		int numHands = 4;
		int cardsPerHand = 12;
		
		// 生成一副牌（含52张牌 = 4 * 13）
		String[] suit = { "♠", "♥", "♣", "♦" };// 黑桃、红桃、梅花、方片
		String[] rank = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };
		
		List<String> deck = new ArrayList<String>();
		
		for (int i = 0; i < suit.length; i++)
			for (int j = 0; j < rank.length; j++)
				deck.add(suit[i] + rank[j]);
		
		Collections.shuffle(deck); // 随机改变deck中元素的排列次序，即洗牌。
		for (int i = 0; i < numHands; i++) {
			// 生成一手牌,并对牌按花色排序后输出。
			List<String> p = dealCard(deck, cardsPerHand);
			Collections.sort(p);
			System.out.println(p);
		}
	}
}
