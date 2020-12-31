import org.junit.Test;
import org.junit.Assert;

public class MyLinkedListTest {
	
	private MyNode<Integer> linkedlist;
	@Test                                                                                             //UC2
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {                             //My Nodes:56->30->70
	
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		
		boolean result = myLinkedList.head.equals(myThirdNode)&&                                    //TestCase
				         myLinkedList.head.getNext().equals(mySecondNode)&&
				         myLinkedList.tail.equals(myFirstNode);
		
		Assert.assertTrue(result);
	}


}
