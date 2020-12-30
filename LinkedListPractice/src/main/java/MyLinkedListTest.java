import org.junit.Test;
import org.junit.Assert;

public class MyLinkedListTest {
	
	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {                             //My Nodes:56->30->70
	
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		
		boolean result = myLinkedList.head.equals(myThirdNode)&&
				         myLinkedList.head.getNext().equals(mySecondNode)&&
				         myLinkedList.tail.equals(myFirstNode);
		
		Assert.assertTrue(result);
	}
	
	
	@Test
	public void given3NumbersWhenAppendedTShouldBeAddedToLast() {                                 //My Nodes:56->30->70
	
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.printMyNodes();
		
		boolean result = myLinkedList.head.equals(myFirstNode)&&
				         myLinkedList.head.getNext().equals(mySecondNode)&&
				         myLinkedList.tail.equals(myThirdNode);
		
		Assert.assertTrue(result);
	}
	
	@Test
	public void given3NumbersWhenInsertingShouldBePassLinkedListResult() {                                //My Nodes:56->30->70
	
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode,mySecondNode);
		myLinkedList.printMyNodes();
		
		boolean result = myLinkedList.head.equals(myFirstNode)&&
				         myLinkedList.head.getNext().equals(mySecondNode)&&
				         myLinkedList.tail.equals(myThirdNode);
		
		Assert.assertTrue(result);
	}
	
	@Test
	public void given3NumbersWhenDeleteShouldBePassLinkedListResult() {                                    //My Nodes:30->70
	
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);

	
		myLinkedList.printMyNodes();
		
		boolean result = myLinkedList.head.equals(mySecondNode)&&
				         myLinkedList.head.getNext().equals(myThirdNode)&&
				         myLinkedList.tail.equals(myThirdNode);
		
		Assert.assertTrue(result);
	}

}
